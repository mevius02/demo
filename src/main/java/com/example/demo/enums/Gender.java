package com.example.demo.enums;

import org.thymeleaf.util.StringUtils;

/**
 * 性別
 */
public enum Gender {
    None(0, ""), Man(1, "男"), Woman(2, "女");

    private int cd;
    private String nm;

    private Gender(int cd, String nm) {
        this.cd = cd;
        this.nm = nm;
    }

    public int getCd() {
        return this.cd;
    }

    public String getNm() {
        return this.nm;
    }

    public static Integer getCd(String nm) {
        for (Gender gender : Gender.values()) {
            if (StringUtils.equals(nm, gender.getNm())) {
                return gender.cd;
            }
        }
        return null;
    }

    public static String getNm(int cd) {
        for (Gender gender : Gender.values()) {
            if (cd == gender.getCd()) {
                return gender.nm;
            }
        }
        return null;
    }
}
