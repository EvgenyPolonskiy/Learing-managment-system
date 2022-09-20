package ru.polonskiy.learningmanagementsystem.entity;


import java.time.ZonedDateTime;
import java.util.Set;

public class CourseEntity {


    private String name;
    private String description;
    private String createAuthor;
    private ZonedDateTime createDate;
    private String expectedTimeToComplite;
    private String updateAuthor;
    private ZonedDateTime updateDate;
    private String deleteAuthor;
    private ZonedDateTime deleteDate;
    private Integer rating;
    // модуль
    private String tag;
    private Set<Category> categories;


}
