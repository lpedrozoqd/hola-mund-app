package edu.al.foundation.classesAll.nestedClasses;

public class OuterClass {
    String outerField = "outer field";
    static String staticOuterField = "static outer field";

    class InnerClass{
        void accessMember(){
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClass{
        void accessMembers(OuterClass outer){
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) {
        System.out.println("========Inner class:");
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.accessMember();
        System.out.println("\n======Static nested class:");
        StaticNestedClass staticNestedObj = new StaticNestedClass();
        staticNestedObj.accessMembers(outerObj);
        System.out.println("\n======Top-level class:");
        TopLevelClass topLevelClass = new TopLevelClass();
        topLevelClass.accessMemeber(outerObj);

        

    }
}
