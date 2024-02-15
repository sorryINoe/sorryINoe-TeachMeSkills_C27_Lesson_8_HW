package com.teachmeskills.lesson8_hw.run;

import com.teachmeskills.lesson8_hw.doctor.impl.Therapist;
import com.teachmeskills.lesson8_hw.patient.Patient;

public class Runner {
    public static void main(String[] args) {
        Patient patient1 = new Patient(3);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(1);

        Therapist therapist = new Therapist();

        therapist.appointDoctor(patient1);
        therapist.appointDoctor(patient2);
        therapist.appointDoctor(patient3);
    }
}
