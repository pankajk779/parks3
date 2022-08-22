package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class LessonPlan {

    private List<ParksLessonPlan> parks;
    private List<CommonCore> commoncore;

    private String subject;
//    Broad subject the lesson falls under= literacy and language arts, math, science, or social studies

    private String gradelevel;
//    Grade level of students at which this lesson is aimed

    private String url;
//    Lesson plan link

    private String questionobjective;
//    Objective of the lesson or the question student should be able to answer at the end of the lesson

    private String duration;
//    Time it takes to peform the lesson

    private String title;
//    Lesson plan title

    private String id;
//    example: 4837917
//    Unique identifier for this lesson plan

    static LessonPlan fill(JSONObject jsonobj) throws JSONException {
        LessonPlan entity = new LessonPlan();
        if (jsonobj.has("subject")) {
            entity.setSubject(jsonobj.getString("subject"));
        }
        if (jsonobj.has("gradelevel")) {
            entity.setGradelevel(jsonobj.getString("gradelevel"));
        }
        if (jsonobj.has("parks")) {
            entity.setParks((List<ParksLessonPlan>) jsonobj.getJSONArray("parks"));
        }
        if (jsonobj.has("commoncore")) {
            entity.setCommoncore((List<CommonCore>) jsonobj.getJSONArray("commoncore"));
        }
        if (jsonobj.has("url")) {
            entity.setUrl(jsonobj.getString("url"));
        }
        if (jsonobj.has("questionobjective")) {
            entity.setQuestionobjective(jsonobj.getString("questionobjective"));
        }
        if (jsonobj.has("duration")) {
            entity.setDuration(jsonobj.getString("duration"));
        }
        if (jsonobj.has("title")) {
            entity.setTitle(jsonobj.getString("title"));
        }
        if (jsonobj.has("id")) {
            entity.setId(jsonobj.getString("id"));
        }
        return entity;
    }

    public List<ParksLessonPlan> getParks() {
        return parks;
    }

    public void setParks(List<ParksLessonPlan> parks) {
        this.parks = parks;
    }

    public List<CommonCore> getCommoncore() {
        return commoncore;
    }

    public void setCommoncore(List<CommonCore> commoncore) {
        this.commoncore = commoncore;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGradelevel() {
        return gradelevel;
    }

    public void setGradelevel(String gradelevel) {
        this.gradelevel = gradelevel;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getQuestionobjective() {
        return questionobjective;
    }

    public void setQuestionobjective(String questionobjective) {
        this.questionobjective = questionobjective;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class ParksLessonPlan{

    private String parks;

    public String getParks() {
        return parks;
    }

    public void setParks(String parks) {
        this.parks = parks;
    }
}

class CommonCore{
//    description:Educational standards that apply to this lesson

    private String statestandards;
    private List<MathStandards> mathstandards;
    private String additionalstandards;
    private List<ElaStandards> elastandards;

    public String getStatestandards() {
        return statestandards;
    }

    public void setStatestandards(String statestandards) {
        this.statestandards = statestandards;
    }

    public List<MathStandards> getMathstandards() {
        return mathstandards;
    }

    public void setMathstandards(List<MathStandards> mathstandards) {
        this.mathstandards = mathstandards;
    }

    public String getAdditionalstandards() {
        return additionalstandards;
    }

    public void setAdditionalstandards(String additionalstandards) {
        this.additionalstandards = additionalstandards;
    }

    public List<ElaStandards> getElastandards() {
        return elastandards;
    }

    public void setElastandards(List<ElaStandards> elastandards) {
        this.elastandards = elastandards;
    }
}

class MathStandards{

    private String mathstandards;

    public String getMathstandards() {
        return mathstandards;
    }

    public void setMathstandards(String mathstandards) {
        this.mathstandards = mathstandards;
    }
}

class ElaStandards{
    private String elastandards;

    public String getElastandards() {
        return elastandards;
    }

    public void setElastandards(String elastandards) {
        this.elastandards = elastandards;
    }
}


