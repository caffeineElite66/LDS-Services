package service.lds.web.data.filter;

import service.lds.domain.dom.Question;
import service.lds.domain.dom.Tag;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


public abstract class PrefixDataFilter {
    protected String searchTag;
    protected String prefix;

    public void execute(List<Question> questions, List<String> tags) {

        // check if tags have the proper prefix to parse
        for (String t : tags) {
            if (t.contains(prefix)) {
                this.searchTag = t;
            }
        }

        // if proper prefix to parse
        if (this.searchTag == null || this.searchTag.isEmpty()) {
            this.searchTag = "default";
        } else {
            System.out.print("************" + this.searchTag);
            String[] arrayTag = this.searchTag.split("_");
            this.searchTag = arrayTag[1];
        }

        Iterator<Question> it = questions.iterator();
        while (it.hasNext()) {
            Question q = it.next();
            Set<Tag> tagList = q.getTags();
            boolean notMatch = true;
            for (Tag tag : tagList) {
                if (tag.getValue().equals(this.searchTag)) {
                    notMatch = false;
                } else if (tag.getValue().equals("default")) {
                    notMatch = false;
                }
            }
            if (notMatch) it.remove();
        }

    }
}
