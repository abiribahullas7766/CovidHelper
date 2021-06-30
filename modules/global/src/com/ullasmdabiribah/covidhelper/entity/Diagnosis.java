package com.ullasmdabiribah.covidhelper.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Listeners;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "COVIDHELPER_DIAGNOSIS")
@Entity(name = "covidhelper_Diagnosis")
@Listeners("covidhelper_DiagnosisChangedListener")
public class Diagnosis extends StandardEntity {
    private static final long serialVersionUID = 3425631857334833344L;

    @Column(name = "AUTO_NUM")
    private String autoNum;

    @Lookup(type = LookupType.SCREEN, actions = {})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DOCTOR_ID")
    private Doctor doctor;

    @Lookup(type = LookupType.SCREEN, actions = {"lookup", "open", "clear"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PATIENT_ID")
    private Patient patient;

    @NotNull
    @Column(name = "FEVER", nullable = false)
    private Boolean fever = false;

    @NotNull
    @Column(name = "COUGH", nullable = false)
    private Boolean cough = false;

    @Column(name = "SHORTNESS_BREATH")
    private Boolean shortnessBreath;

    @Column(name = "FATIGUE")
    private Boolean fatigue;

    @Column(name = "MUSCLE_ACHES")
    private Boolean muscleAches;

    @Column(name = "HEADACHE")
    private Boolean headache;

    @Column(name = "LOSS_TASTE")
    private Boolean lossTaste;

    @Column(name = "SORE_THROAT")
    private Boolean soreThroat;

    @Column(name = "CONGESTION")
    private Boolean congestion;

    @Column(name = "NAUSEA")
    private Boolean nausea;

    @Column(name = "DIARRHEA")
    private Boolean diarrhea;

    @Column(name = "TOTAL_SCORE")
    private Integer totalScore;

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public Boolean getDiarrhea() {
        return diarrhea;
    }

    public void setDiarrhea(Boolean diarrhea) {
        this.diarrhea = diarrhea;
    }

    public Boolean getNausea() {
        return nausea;
    }

    public void setNausea(Boolean nausea) {
        this.nausea = nausea;
    }

    public Boolean getCongestion() {
        return congestion;
    }

    public void setCongestion(Boolean congestion) {
        this.congestion = congestion;
    }

    public Boolean getSoreThroat() {
        return soreThroat;
    }

    public void setSoreThroat(Boolean soreThroat) {
        this.soreThroat = soreThroat;
    }

    public Boolean getLossTaste() {
        return lossTaste;
    }

    public void setLossTaste(Boolean lossTaste) {
        this.lossTaste = lossTaste;
    }

    public Boolean getHeadache() {
        return headache;
    }

    public void setHeadache(Boolean headache) {
        this.headache = headache;
    }

    public Boolean getMuscleAches() {
        return muscleAches;
    }

    public void setMuscleAches(Boolean muscleAches) {
        this.muscleAches = muscleAches;
    }

    public Boolean getFatigue() {
        return fatigue;
    }

    public void setFatigue(Boolean fatigue) {
        this.fatigue = fatigue;
    }

    public Boolean getShortnessBreath() {
        return shortnessBreath;
    }

    public void setShortnessBreath(Boolean shortnessBreath) {
        this.shortnessBreath = shortnessBreath;
    }

    public Boolean getCough() {
        return cough;
    }

    public void setCough(Boolean cough) {
        this.cough = cough;
    }

    public Boolean getFever() {
        return fever;
    }

    public void setFever(Boolean fever) {
        this.fever = fever;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getAutoNum() {
        return autoNum;
    }

    public void setAutoNum(String autoNum) {
        this.autoNum = autoNum;
    }
}