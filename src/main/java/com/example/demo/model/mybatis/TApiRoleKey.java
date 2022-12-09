package com.example.demo.model.mybatis;

public class TApiRoleKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.t_api_role.api_cd
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    private String apiCd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.t_api_role.role_cd
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    private String roleCd;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.t_api_role.api_cd
     *
     * @return the value of public.t_api_role.api_cd
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    public String getApiCd() {
        return apiCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.t_api_role.api_cd
     *
     * @param apiCd the value for public.t_api_role.api_cd
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    public void setApiCd(String apiCd) {
        this.apiCd = apiCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.t_api_role.role_cd
     *
     * @return the value of public.t_api_role.role_cd
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    public String getRoleCd() {
        return roleCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.t_api_role.role_cd
     *
     * @param roleCd the value for public.t_api_role.role_cd
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    public void setRoleCd(String roleCd) {
        this.roleCd = roleCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TApiRoleKey other = (TApiRoleKey) that;
        return (this.getApiCd() == null ? other.getApiCd() == null : this.getApiCd().equals(other.getApiCd()))
            && (this.getRoleCd() == null ? other.getRoleCd() == null : this.getRoleCd().equals(other.getRoleCd()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_api_role
     *
     * @mbg.generated Thu Dec 08 20:36:33 JST 2022
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApiCd() == null) ? 0 : getApiCd().hashCode());
        result = prime * result + ((getRoleCd() == null) ? 0 : getRoleCd().hashCode());
        return result;
    }
}