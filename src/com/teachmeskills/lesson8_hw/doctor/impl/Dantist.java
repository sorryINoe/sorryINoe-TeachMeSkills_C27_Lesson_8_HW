package com.teachmeskills.lesson8_hw.doctor.impl;

import com.teachmeskills.lesson8_hw.patient.Patient;
/**
 * This class implements Itreat interface
 **/
public class Dantist implements Itreat {

    @Override
    public void treatmentResult(Patient patient) {
        System.out.println("The dentist pulled out your tooth and inserted a new one.");
    }
}
