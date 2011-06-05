package service.lds.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import service.lds.domain.dom.Answer;
import service.lds.domain.dom.Question;
import service.lds.domain.dom.Tag;
import service.lds.domain.dto.QuestionDto;
import service.lds.domain.service.QuestionService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@Controller
public class QuestionController {

    private static Logger logger = Logger.getLogger(QuestionController.class);

    @Autowired
    private QuestionService questionService;

    public void setQuestionService(QuestionService questionService) {
        this.questionService = questionService;
    }

    @RequestMapping(value = "/questions", method = RequestMethod.GET)
    @ResponseBody
    public void getQuestions(HttpServletRequest request,
                             HttpServletResponse response) {
        List<QuestionDto> result = new ArrayList<QuestionDto>();
        String tags = request.getParameter("tags");
        if (tags == null || tags.isEmpty()) {
            result = getTagQuestions(response, "default");
        } else {
            result = getTagQuestions(response, tags);
        }

        MappingJacksonHttpMessageConverter converter = new MappingJacksonHttpMessageConverter();
        MediaType jsonMimeType = MediaType.APPLICATION_JSON;

        if (converter.canWrite(result.getClass(), jsonMimeType)) {
            try {
                converter.write(result, jsonMimeType,
                        new ServletServerHttpResponse(response));
            } catch (IOException m_Ioe) {

            } catch (HttpMessageNotWritableException e) {

            }
        }

    }

    private List<QuestionDto> getTagQuestions(HttpServletResponse response,
                                              String tags) {
        List<Question> questions = questionService.findQuestionsByTag(parseTags(tags));
        List<QuestionDto> result = new ArrayList<QuestionDto>();
        for (Object q : questions) {
            Question question = (Question) q;
            QuestionDto questionDto = new QuestionDto();
            questionDto.setId(question.getId());
            questionDto.setName(question.getName());
            questionDto.setQuestionText(question.getQuestionText());
            List<Map<String, Object>> answers = new ArrayList<Map<String, Object>>();
            for (Answer a : question.getAnswers()) {
                Map<String, Object> answer = new HashMap<String, Object>();
                answer.put("id", a.getId());
                answer.put("text", a.getAnswerText());
                answer.put("value", a.getAnswerValue());
                answer.put("default", a.isDefaultAnswer());
                answers.add(answer);
            }
            questionDto.setAnswers(answers);
            List<String> tagList = new ArrayList<String>();
            for (Tag t : question.getTags()) {
                tagList.add(t.getValue());
            }
            questionDto.setTags(tagList);
            result.add(questionDto);
        }
        return result;
    }

    private List<String> parseTags(String tags) {
        return Arrays.asList(tags.split("\\|"));
    }

}
