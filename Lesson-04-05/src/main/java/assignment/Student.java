package assignment;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private float scores;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    public void setScores(float scores) {
        this.scores = scores;
    }

    public void flusScores(float score) {
        this.scores += score;
    }

    public void showInfo() {
        String rank;
        if (scores < 4.0) {
            rank = "yếu";
        } else if (scores < 6.0) {
            rank = "Trung bình";
        } else if (scores < 8.0) {
            rank = "khá";
        } else {
            rank = "giỏi";
        }
        System.out.printf("%s : %s%n", name, rank);
    }


}
