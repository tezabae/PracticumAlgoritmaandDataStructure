package practicumJobsheet2a;

public class lecturer27 {

    // Attributes
    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    // Default constructor
    public lecturer27() {
    }

    // Parameterized constructor
    public lecturer27(String idLecturer, String name, boolean activeStatus, int yearOfEntry, String expertiseCompetency) {
        this.idLecturer = idLecturer;
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }

    // Method to display lecturer information
    void showInformation() {
        System.out.println("ID Lecturer       : " + idLecturer);
        System.out.println("Nama              : " + name);
        System.out.println("Status Aktif      : " + (activeStatus ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Masuk       : " + yearOfEntry);
        System.out.println("Kompetensi Keahlian: " + expertiseCompetency);
    }

    // Method to set active status
    void setStatusActive(boolean status) {
        activeStatus = status;
        System.out.println("Status aktif dosen diubah menjadi: " + (status ? "Aktif" : "Tidak Aktif"));
    }

    // Method to calculate working period
    int calculateTimeWork(int yearNow) {
        int lamaKerja = yearNow - yearOfEntry;
        return lamaKerja;
    }

    // Method to change skill
    void changeSkill(String skill) {
        expertiseCompetency = skill;
        System.out.println("Kompetensi keahlian diubah menjadi: " + skill);
    }
}


