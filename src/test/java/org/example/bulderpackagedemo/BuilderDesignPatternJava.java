package org.example.bulderpackagedemo;

public class BuilderDesignPatternJava {

    //change return type of each method as class type
    //"this" always  points to current/calling object. Returning the same to
    // have the same reference
    public BuilderDesignPatternJava stage1()
    {
        System.out.println("Stage 1");
        return this;
    }
    public BuilderDesignPatternJava stage2(String str)
    {
        System.out.println("Stage 2" + str);
        return this;
    }

    public BuilderDesignPatternJava stage3()
    {
        System.out.println("Stage 3");
        return this;
    }

    public static void main(String[] args) {
        BuilderDesignPatternJava bp = new BuilderDesignPatternJava();
        bp.stage1().stage2("test").stage3();//method chaining
    }
}
