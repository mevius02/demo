package com.example.demo.enums;

import org.thymeleaf.util.StringUtils;

/**
 * 血液型
 */
public enum BloodType {
    None(0, ""), A(1, "A"), B(2, "B"), O(3, "O"), AB(4, "AB");

    private int cd;
    private String nm;

    private BloodType(int cd, String nm) {
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
        for (BloodType bloodType : BloodType.values()) {
            if (StringUtils.equals(nm, bloodType.getNm())) {
                return bloodType.cd;
            }
        }
        return null;
    }

    public static String getNm(int cd) {
        for (BloodType bloodType : BloodType.values()) {
            if (cd == bloodType.getCd()) {
                return bloodType.nm;
            }
        }
        return null;
    }
}
