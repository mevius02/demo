package com.example.demo.mapper.mybatis;

import com.example.demo.model.mybatis.TUserRole;
import com.example.demo.model.mybatis.TUserRoleExample;
import com.example.demo.model.mybatis.TUserRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_user_role
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    long countByExample(TUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_user_role
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    int deleteByExample(TUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_user_role
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    int deleteByPrimaryKey(TUserRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_user_role
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    int insert(TUserRole row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_user_role
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    int insertSelective(TUserRole row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_user_role
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    List<TUserRole> selectByExample(TUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_user_role
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    TUserRole selectByPrimaryKey(TUserRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_user_role
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    int updateByExampleSelective(@Param("row") TUserRole row, @Param("example") TUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_user_role
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    int updateByExample(@Param("row") TUserRole row, @Param("example") TUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_user_role
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    int updateByPrimaryKeySelective(TUserRole row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_user_role
     *
     * @mbg.generated Fri Dec 23 19:52:51 JST 2022
     */
    int updateByPrimaryKey(TUserRole row);
}