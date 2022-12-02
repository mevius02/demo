package com.example.demo.enums;

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
}
