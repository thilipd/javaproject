package firstpacage;

public class student {

    public String name;
    public int roll;
    public int[] marks = new int[3];

    public int totalMark() {

        int total = 0;

        for (int i = 0; i < marks.length; i++) {

            total += this.marks[i];

        }
        return total;
    }

    public double average() {

        int total = this.totalMark();

        double ave = (((double) total) / this.marks.length);

        return ave;
    }

}
