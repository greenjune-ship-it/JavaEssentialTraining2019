package com.company.model;

public enum ClothingSize {
    S("Small"), M("Medium"), L("Large");
    private String descirption;

    ClothingSize(String descirption) {
        this.descirption = descirption;
    }

    @Override
    public String toString() {
        return descirption;
    }
}
