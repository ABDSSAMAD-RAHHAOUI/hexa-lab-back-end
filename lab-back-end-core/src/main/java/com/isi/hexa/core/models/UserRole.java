package com.isi.hexa.core.models;


public enum UserRole {
    MEMBER("Member"),
    ADMIN("Admin"),
    DIRECTOR("Director"),
    MARKET_MANAGER("Market Manager"),
    FINANCIAL_MANAGER("Financial Manager");

    private String displayName;

    UserRole(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

