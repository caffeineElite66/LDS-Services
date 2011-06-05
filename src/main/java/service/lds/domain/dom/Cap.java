package service.lds.domain.dom;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "MemberQuestionCap")
public class Cap implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(mappedBy = "cap")
	private Question question;

	@Column(name = "daily_cap")
	private Integer dailyCap;

	@Column(name = "daily_cap_on")
	private Boolean dailyCapOn;

	@Column(name = "weekly_cap")
	private Integer weeklyCap;

	@Column(name = "weekly_cap_on")
	private Boolean weeklyCapOn;

	@Column(name = "monthly_cap")
	private Integer monthlyCap;

	@Column(name = "monthly_cap_on")
	private Boolean monthlyCapOn;

	@Column(name = "monday_cap")
	private Integer mondayCap;

	@Column(name = "monday_cap_on")
	private Boolean mondayCapOn;

	@Column(name = "tuesday_cap")
	private Integer tuesdayCap;

	@Column(name = "tuesday_cap_on")
	private Boolean tuesdayCapOn;

	@Column(name = "wednesday_cap")
	private Integer wednesdayCap;

	@Column(name = "wednesday_cap_on")
	private Boolean wednesdayCapOn;

	@Column(name = "thursday_cap")
	private Integer thursdayCap;

	@Column(name = "thursday_cap_on")
	private Boolean thursdayCapOn;

	@Column(name = "friday_cap")
	private Integer fridayCap;

	@Column(name = "friday_cap_on")
	private Boolean fridayCapOn;

	@Column(name = "saturday_cap")
	private Integer saturdayCap;

	@Column(name = "saturday_cap_on")
	private Boolean saturdayCapOn;

	@Column(name = "sunday_cap")
	private Integer sundayCap;

	@Column(name = "sunday_cap_on")
	private Boolean sundayCapOn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Integer getDailyCap() {
		return dailyCap;
	}

	public void setDailyCap(Integer dailyCap) {
		this.dailyCap = dailyCap;
	}

	public Boolean isDailyCapOn() {
		return dailyCapOn;
	}

	public void setDailyCapOn(Boolean dailyCapOn) {
		this.dailyCapOn = dailyCapOn;
	}

	public Integer getWeeklyCap() {
		return weeklyCap;
	}

	public void setWeeklyCap(Integer weeklyCap) {
		this.weeklyCap = weeklyCap;
	}

	public Boolean isWeeklyCapOn() {
		return weeklyCapOn;
	}

	public void setWeeklyCapOn(Boolean weeklyCapOn) {
		this.weeklyCapOn = weeklyCapOn;
	}

	public Integer getMonthlyCap() {
		return monthlyCap;
	}

	public void setMonthlyCap(Integer monthlyCap) {
		this.monthlyCap = monthlyCap;
	}

	public Boolean isMonthlyCapOn() {
		return monthlyCapOn;
	}

	public void setMonthlyCapOn(Boolean monthlyCapOn) {
		this.monthlyCapOn = monthlyCapOn;
	}

	public Integer getMondayCap() {
		return mondayCap;
	}

	public void setMondayCap(Integer mondayCap) {
		this.mondayCap = mondayCap;
	}

	public Boolean isMondayCapOn() {
		return mondayCapOn;
	}

	public void setMondayCapOn(Boolean mondayCapOn) {
		this.mondayCapOn = mondayCapOn;
	}

	public Integer getTuesdayCap() {
		return tuesdayCap;
	}

	public void setTuesdayCap(Integer tuesdayCap) {
		this.tuesdayCap = tuesdayCap;
	}

	public Boolean isTuesdayCapOn() {
		return tuesdayCapOn;
	}

	public void setTuesdayCapOn(Boolean tuesdayCapOn) {
		this.tuesdayCapOn = tuesdayCapOn;
	}

	public Integer getWednesdayCap() {
		return wednesdayCap;
	}

	public void setWednesdayCap(Integer wednesdayCap) {
		this.wednesdayCap = wednesdayCap;
	}

	public Boolean isWednesdayCapOn() {
		return wednesdayCapOn;
	}

	public void setWednesdayCapOn(Boolean wednesdayCapOn) {
		this.wednesdayCapOn = wednesdayCapOn;
	}

	public Integer getThursdayCap() {
		return thursdayCap;
	}

	public void setThursdayCap(Integer thursdayCap) {
		this.thursdayCap = thursdayCap;
	}

	public Boolean isThursdayCapOn() {
		return thursdayCapOn;
	}

	public void setThursdayCapOn(Boolean thursdayCapOn) {
		this.thursdayCapOn = thursdayCapOn;
	}

	public Integer getFridayCap() {
		return fridayCap;
	}

	public void setFridayCap(Integer fridayCap) {
		this.fridayCap = fridayCap;
	}

	public Boolean isFridayCapOn() {
		return fridayCapOn;
	}

	public void setFridayCapOn(Boolean fridayCapOn) {
		this.fridayCapOn = fridayCapOn;
	}

	public Integer getSaturdayCap() {
		return saturdayCap;
	}

	public void setSaturdayCap(Integer saturdayCap) {
		this.saturdayCap = saturdayCap;
	}

	public Boolean isSaturdayCapOn() {
		return saturdayCapOn;
	}

	public void setSaturdayCapOn(Boolean saturdayCapOn) {
		this.saturdayCapOn = saturdayCapOn;
	}

	public Integer getSundayCap() {
		return sundayCap;
	}

	public void setSundayCap(Integer sundayCap) {
		this.sundayCap = sundayCap;
	}

	public Boolean isSundayCapOn() {
		return sundayCapOn;
	}

	public void setSundayCapOn(Boolean sundayCapOn) {
		this.sundayCapOn = sundayCapOn;
	}

}
