package edu.al.foundation.classes.nestedClasses;

public class TopLevelClass {
    void accessMemeber(OuterClass outer){
        System.out.println(outer.outerField);
        System.out.println(OuterClass.staticOuterField);
    }
}
