package VirusTreatmentStrategy;

public class Main {

    public static void main(String[] args) {
        Treatment patient1Treatment = new Treatment("John Duke");
        Treatment patient2Treatment = new Treatment("Elisa Muratti");
        Treatment patient3Treatment = new Treatment("Jeff People");

        patient1Treatment.setVaccination(new Covid19Treatment());
        patient2Treatment.setVaccination(new EbovTreatment());
        patient3Treatment.setVaccination(new SarsTreatment());

        patient1Treatment.treatment();
        patient2Treatment.treatment();
        patient3Treatment.treatment();

        System.out.println("All patients cured. The world is saved!");

    }

//    RESULT:
//The treatment of the patient: John Duke has started
//    The patient have been cured of infection with Coronavirus
//    The patient left the hospital
//--------------------------------------------------------------------
//    The treatment of the patient: Elisa Muratti has started
//    The patient have been cured of infection with Ebov
//    The patient left the hospital
//--------------------------------------------------------------------
//    The treatment of the patient: Jeff People has started
//    The patient have been cured of infection with SARS
//    The patient left the hospital
//--------------------------------------------------------------------
//    All patients cured. The world is saved!

}
