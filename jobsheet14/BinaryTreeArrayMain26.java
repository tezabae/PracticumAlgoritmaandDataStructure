package jobsheet14;

public class BinaryTreeArrayMain26 {
    public static void main(String[] args) {
        BinaryTreeArray26 bta = new BinaryTreeArray26();
        Student26 m1 = new Student26("254107020100", "Zhao Yufan", "TI-1I", 3.57);
        Student26 m2 = new Student26("254107020099", "Edwards Martin", "TI-1I", 3.85);
        Student26 m3 = new Student26("254107020098", "Kim Juhoon", "TI-1I", 3.21);
        Student26 m4 = new Student26("254107020097", "Eom Seonghyeon", "TI-1I", 3.54);
        Student26 m5 = new Student26("254107020223", "Ahn Keonho", "TI-1I", 3.72);
        Student26 m6 = new Student26("254107020222", "Tezaa Gracelynnee", "TI-1I", 3.37);
        Student26 m7 = new Student26("254107020221", "Citra Diah Ayu", "TI-1I", 3.46);
        
        Student26[] data = {m1, m2, m3, m4, m5, m6, m7};
        bta.populateData(data, data.length-1);
        System.out.println("In-order traversal:");
        bta.traverseInOrder(0);
    }

}
