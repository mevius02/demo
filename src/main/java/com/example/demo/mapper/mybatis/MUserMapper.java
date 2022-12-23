package com.example.demo.mapper.mybatis;

import com.example.demo.model.mybatis.MUser;
import com.example.demo.model.mybatis.MUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    long countByExample(MUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    int deleteByExample(MUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    int insert(MUser row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    int insertSelective(MUser row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    List<MUser> selectByExample(MUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    MUser selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    int updateByExampleSelective(@Param("row") MUser row, @Param("example") MUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    int updateByExample(@Param("row") MUser row, @Param("example") MUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    int updateByPrimaryKeySelective(MUser row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.m_user
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    int updateByPrimaryKey(MUser row);
}