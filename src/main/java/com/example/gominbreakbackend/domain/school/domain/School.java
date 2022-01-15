package com.example.gominbreakbackend.domain.school.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity(name = "tbl_school")
public class School {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String schoolName;

    private String location;

    private Integer symCounts;

    public School addSchoolSymCounts(){
        this.symCounts++;
        return this;
    }
}
