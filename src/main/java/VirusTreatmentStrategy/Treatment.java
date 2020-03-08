package VirusTreatmentStrategy;

public class Treatment {
    private VaccinationStrategy vaccinationStrategy;
    private String patientName;

    public Treatment(String patientName) {
        this.patientName = patientName;
    }

    public void setVaccination(VaccinationStrategy vaccination) {
        this.vaccinationStrategy = vaccination;
    }

    public void treatment() {
        System.out.println("The treatment of the patient: " + this.patientName + " has started");
        System.out.println(vaccinationStrategy.vaccineInjection());
        System.out.println("The patient left the hospital");
        System.out.println("--------------------------------------------------------------------");
    }
}
