package com.teachmeskills.lesson8_hw.doctor.impl;

import com.teachmeskills.lesson8_hw.patient.Patient;
/**
 * This class implements Itreat interface and implements choice of doctors
 **/
public class Therapist implements Itreat {
    @Override
    public void treatmentResult(Patient patient) {
        System.out.println("The therapist prescribed medications");
    }
    public void appointDoctor (Patient patient)
    {
        if (patient.getTreatmentPlan() == 1)
        {
            patient.setDoctor(new Surgeon());
        } else if (patient.getTreatmentPlan() == 2) {
            patient.setDoctor(new Dantist());
        }
        else {
            patient.setDoctor(new Therapist());
        }
        patient.getDoctor().treatmentResult(patient);
    }


}
