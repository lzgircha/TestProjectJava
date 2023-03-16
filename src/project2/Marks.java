package project2;

public abstract class Marks {
    //We have to calculate the average of marks obtained in three subjects by student A and by student B.
    // Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
    // Provide implementation of abstract method in classes 'A' and 'B'.
    // The constructor of student A takes the marks in three subjects as its parameters and the marks in four
    // subjects as its parameters for student B. Test your code
    abstract double getPercentage();

    static class A extends Marks {
        double sub1, sub2, sub3;

        public A(double sub1, double sub2, double sub3) {
            this.sub1=sub1;
            this.sub2=sub2;
            this.sub3=sub3;
        }
        @Override
        double getPercentage() {
            return (sub1 + sub2 + sub3) / 3;
        }
    }
    static class B extends Marks {
        double sub1, sub2, sub3, sub4;

        public B(double sub1, double sub2, double sub3, double sub4) {
            this.sub1=sub1;
            this.sub2=sub2;
            this.sub3=sub3;
            this.sub4=sub4;
        }

        @Override
        double getPercentage() {
            return (sub1 + sub2 + sub3 + sub4) / 4;
        }
    }

    public static void main(String[] args) {
        A a = new A(84, 95, 81);
        B b = new B(91, 76, 85, 93);

        System.out.println("Percentage of student A: "+ a.getPercentage());
        System.out.println("Percentage of student B: "+ b.getPercentage());
    }
}
