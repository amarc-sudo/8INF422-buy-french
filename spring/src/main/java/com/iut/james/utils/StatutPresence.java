package com.iut.james.utils;


public enum StatutPresence {
    PRESENT(1, "pre"),
    RETARD(2, "ret"),
    ABSENT(3, "abs");

    private int id;

    private String code;

    private StatutPresence(int id, String code) {
        this.id = id;
        this.code = code;
    }

    public int getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

}
