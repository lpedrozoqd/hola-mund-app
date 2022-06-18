package edu.al.foundation.classes.anonymousClasses;

public class HelloWorldAnonymousClasses {

    interface HelloWorld{
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello(){
        
        class EnglishGreeting implements HelloWorld{
            String name = "world";
            @Override
            public void greet() {
                greetSomeone("world!");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
            
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        //Aquí se ejemplifica una clase anónima 
        HelloWorld frenchGreeting = new HelloWorld(){
            String name = "tout le monde!";

            @Override
            public void greet() {
                greetSomeone("monde!");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
                
            }
        };

        //Aquí se ejemplifica otra clase anónima 
        HelloWorld spanishGreeting = new HelloWorld(){
            String name = "mundo!";

            @Override
            public void greet() {
                greetSomeone("mundo!");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola " + name);
                
            }
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Leonel");
        spanishGreeting.greet();
    }
    public static void main(String[] args) {
        HelloWorldAnonymousClasses myApp = 
            new HelloWorldAnonymousClasses();
            myApp.sayHello();
    }
}
