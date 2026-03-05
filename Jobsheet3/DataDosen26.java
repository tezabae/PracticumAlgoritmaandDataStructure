package Jobsheet3;

public class DataDosen26 {

    // a. Display all lecturer data
    void dataAllDosen(Dosen26[] arrayOfDosen) {
        for (Dosen26 dsn : arrayOfDosen) {
            dsn.printInfo();
        }
    }

    // b. Display number of lecturers per gender
    void numberOfLecturersPerGender(Dosen26[] arrayOfDosen) {
        int male = 0;
        int female = 0;

        for (Dosen26 dsn : arrayOfDosen) {
            if (dsn.gender) {
                male++;
            } else {
                female++;
            }
        }

        System.out.println("Number of Male Lecturers   : " + male);
        System.out.println("Number of Female Lecturers : " + female);
    }

    // c. Display average age per gender
    void AverageAgeOfLecturersPerGender(Dosen26[] arrayOfDosen) {
        int totalMaleAge = 0;
        int totalFemaleAge = 0;
        int maleCount = 0;
        int femaleCount = 0;

        for (Dosen26 dsn : arrayOfDosen) {
            if (dsn.gender) {
                totalMaleAge += dsn.age;
                maleCount++;
            } else {
                totalFemaleAge += dsn.age;
                femaleCount++;
            }
        }

        if (maleCount > 0) {
            System.out.println("Average Age of Male Lecturers   : " + (totalMaleAge / maleCount));
        }

        if (femaleCount > 0) {
            System.out.println("Average Age of Female Lecturers : " + (totalFemaleAge / femaleCount));
        }
    }

    // d. Display the oldest lecturer
    void infoDosenPalingTua(Dosen26[] arrayOfDosen) {
        Dosen26 oldest = arrayOfDosen[0];

        for (Dosen26 dsn : arrayOfDosen) {
            if (dsn.age > oldest.age) {
                oldest = dsn;
            }
        }

        System.out.println("Oldest Lecturer Information:");
        oldest.printInfo();
    }

    // e. Display the youngest lecturer
    void infoDosenMostYoungest(Dosen26[] arrayOfDosen) {
        Dosen26 youngest = arrayOfDosen[0];

        for (Dosen26 dsn : arrayOfDosen) {
            if (dsn.age < youngest.age) {
                youngest = dsn;
            }
        }

        System.out.println("Youngest Lecturer Information:");
        youngest.printInfo();
    }
}