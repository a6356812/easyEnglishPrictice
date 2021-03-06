package org.jxnu.dao.generator;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jxnu.pojo.PaperQuestion;
import org.jxnu.pojo.PaperQuestionExample;

public interface PaperQuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Wed Nov 28 21:55:41 CST 2018
     */
    int countByExample(PaperQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Wed Nov 28 21:55:41 CST 2018
     */
    int deleteByExample(PaperQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Wed Nov 28 21:55:41 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Wed Nov 28 21:55:41 CST 2018
     */
    int insert(PaperQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Wed Nov 28 21:55:41 CST 2018
     */
    int insertSelective(PaperQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Wed Nov 28 21:55:41 CST 2018
     */
    List<PaperQuestion> selectByExample(PaperQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Wed Nov 28 21:55:41 CST 2018
     */
    PaperQuestion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Wed Nov 28 21:55:41 CST 2018
     */
    int updateByExampleSelective(@Param("record") PaperQuestion record, @Param("example") PaperQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Wed Nov 28 21:55:41 CST 2018
     */
    int updateByExample(@Param("record") PaperQuestion record, @Param("example") PaperQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Wed Nov 28 21:55:41 CST 2018
     */
    int updateByPrimaryKeySelective(PaperQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Wed Nov 28 21:55:41 CST 2018
     */
    int updateByPrimaryKey(PaperQuestion record);
}