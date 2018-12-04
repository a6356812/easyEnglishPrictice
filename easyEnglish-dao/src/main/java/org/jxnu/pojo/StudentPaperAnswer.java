package org.jxnu.pojo;

public class StudentPaperAnswer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_paper_answer.id
     *
     * @mbggenerated Tue Dec 04 15:05:36 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_paper_answer.student_paper_id
     *
     * @mbggenerated Tue Dec 04 15:05:36 CST 2018
     */
    private Long studentPaperId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_paper_answer.question_id
     *
     * @mbggenerated Tue Dec 04 15:05:36 CST 2018
     */
    private Long questionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_paper_answer.answer
     *
     * @mbggenerated Tue Dec 04 15:05:36 CST 2018
     */
    private String answer;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_paper_answer.id
     *
     * @return the value of student_paper_answer.id
     *
     * @mbggenerated Tue Dec 04 15:05:36 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_paper_answer.id
     *
     * @param id the value for student_paper_answer.id
     *
     * @mbggenerated Tue Dec 04 15:05:36 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_paper_answer.student_paper_id
     *
     * @return the value of student_paper_answer.student_paper_id
     *
     * @mbggenerated Tue Dec 04 15:05:36 CST 2018
     */
    public Long getStudentPaperId() {
        return studentPaperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_paper_answer.student_paper_id
     *
     * @param studentPaperId the value for student_paper_answer.student_paper_id
     *
     * @mbggenerated Tue Dec 04 15:05:36 CST 2018
     */
    public void setStudentPaperId(Long studentPaperId) {
        this.studentPaperId = studentPaperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_paper_answer.question_id
     *
     * @return the value of student_paper_answer.question_id
     *
     * @mbggenerated Tue Dec 04 15:05:36 CST 2018
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_paper_answer.question_id
     *
     * @param questionId the value for student_paper_answer.question_id
     *
     * @mbggenerated Tue Dec 04 15:05:36 CST 2018
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_paper_answer.answer
     *
     * @return the value of student_paper_answer.answer
     *
     * @mbggenerated Tue Dec 04 15:05:36 CST 2018
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_paper_answer.answer
     *
     * @param answer the value for student_paper_answer.answer
     *
     * @mbggenerated Tue Dec 04 15:05:36 CST 2018
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}