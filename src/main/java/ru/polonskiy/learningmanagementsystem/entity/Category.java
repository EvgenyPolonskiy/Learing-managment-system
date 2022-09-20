package ru.polonskiy.learningmanagementsystem.entity;

public enum Category {
    JAVA("JAVA"),
    PYTHON("PYTHON"),
    CPlus("C++");

    private String value;

    Category(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
