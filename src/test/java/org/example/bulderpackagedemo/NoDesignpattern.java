package org.example.bulderpackagedemo;

public class NoDesignpattern {

    public void step1() {
        System.out.println("step 1");
    }

    public void step2() {
        System.out.println("step 2");
    }

    public void step3() {
        System.out.println("step 3");
    }

    public static void main(String[] args) {
        NoDesignpattern np = new NoDesignpattern();
        np.step1();
        np.step2();
        np.step3();
    }
}
