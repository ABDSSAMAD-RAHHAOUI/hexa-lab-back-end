package com.isi.hexa.core.models;


public enum UserRole {
    ROLE_MEMBER("Member"),
    ROLE_ADMIN("Admin"),
    ROLE_DIRECTOR("Director"),
    ROLE_MARKET_MANAGER("Market Manager"),
    ROLE_FINANCIAL_MANAGER("Financial Manager");

    private String displayName;

    UserRole(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

