package com.teachmeskills.lesson8_hw.patient;

import com.teachmeskills.lesson8_hw.doctor.impl.Itreat;
/**
 * This class creates patient object
 **/
public class Patient {
    private int treatmentPlan;
    private Itreat doctor;

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }


    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public Itreat getDoctor() {
        return doctor;
    }

    public void setDoctor(Itreat doctor) {
        this.doctor = doctor;
    }
}
