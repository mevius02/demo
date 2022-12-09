package com.example.demo.mapper.mybatis;

import com.example.demo.model.mybatis.TApiRole;
import com.example.demo.model.mybatis.TApiRoleExample;
import com.example.demo.model.mybatis.TApiRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TApiRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    long countByExample(TApiRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    int deleteByExample(TApiRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    int deleteByPrimaryKey(TApiRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    int insert(TApiRole row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    int insertSelective(TApiRole row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    List<TApiRole> selectByExample(TApiRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    TApiRole selectByPrimaryKey(TApiRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    int updateByExampleSelective(@Param("row") TApiRole row, @Param("example") TApiRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    int updateByExample(@Param("row") TApiRole row, @Param("example") TApiRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    int updateByPrimaryKeySelective(TApiRole row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    int updateByPrimaryKey(TApiRole row);
}