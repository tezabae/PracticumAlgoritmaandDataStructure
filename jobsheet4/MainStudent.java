package jobsheet4;

public class MainStudent {
    public static void main(String[] args) {

        StudentNilai[] data = {
            new StudentNilai("Ahmad",78,82),
            new StudentNilai("Budi",85,88),
            new StudentNilai("Cindy",90,87),
            new StudentNilai("Dian",76,79),
            new StudentNilai("Eko",92,95),
            new StudentNilai("Fajar",88,85),
            new StudentNilai("Gina",80,83),
            new StudentNilai("Hadi",82,84)
        };

        int max = StudentNilai.maxUTS(data, 0, data.length-1);
        int min = StudentNilai.minUTS(data, 0, data.length-1);
        double avg = StudentNilai.avgUAS(data);

        System.out.println("Highest UTS : " + max);
        System.out.println("Lowest UTS  : " + min);
        System.out.println("Average UAS : " + avg);
    }
}

