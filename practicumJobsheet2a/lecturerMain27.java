package practicumJobsheet2a;

public class lecturerMain27 {

    public static void main(String[] args) {
        // Object using default constructor
        lecturer27 lecturer1 = new lecturer27();
        lecturer1.idLecturer = "L001";
        lecturer1.name = "Dr. Zhao Yufan";
        lecturer1.activeStatus = true;
        lecturer1.yearOfEntry = 2015;
        lecturer1.expertiseCompetency = "Algoritma dan Struktur Data";

        System.out.println("=== Informasi Lecturer 1 ===");
        lecturer1.showInformation();
        lecturer1.setStatusActive(false);
        System.out.println("Lama kerja: " + lecturer1.calculateTimeWork(2026) + " tahun");
        lecturer1.changeSkill("Pemrograman Java");
        lecturer1.showInformation();

        // Object using parameterized constructor
        lecturer27 lecturer2 = new lecturer27("L002", "Prof. Zhao Yufan", true, 2010, "Jaringan Komputer");

        System.out.println("\n=== Informasi Lecturer 2 ===");
        lecturer2.showInformation();
        lecturer2.setStatusActive(true);
        System.out.println("Lama kerja: " + lecturer2.calculateTimeWork(2026) + " tahun");
        lecturer2.changeSkill("Keamanan Siber");
        lecturer2.showInformation();
    }
}


