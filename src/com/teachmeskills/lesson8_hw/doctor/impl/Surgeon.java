package com.teachmeskills.lesson8_hw.doctor.impl;

import com.teachmeskills.lesson8_hw.patient.Patient;
/**
 * This class implements Itreat interface
 **/
public class Surgeon implements Itreat {

    @Override
    public void treatmentResult(Patient patient) {
        System.out.println("The surgeon cut off your old leg and sewed a new one on");
    }
}
