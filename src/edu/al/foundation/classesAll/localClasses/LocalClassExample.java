package edu.al.foundation.classesAll.localClasses;

public class LocalClassExample {
    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(
        String phoneNumber1, String phoneNumber2){
            final int numberLength = 10;
            
            //Es aqui donde entran "las clases locales", por ejemplo dentro 
            //de cualquier bloque (for,loop,if)
            class PhoneNumber{
                String formattedPhoneNumber = null;

                PhoneNumber(String phoneNumber){
                    String currentNumber = phoneNumber.replaceAll(
                        regularExpression, "");
                    
                        if(currentNumber.length() == numberLength){
                            formattedPhoneNumber = currentNumber;
                        }else{
                            formattedPhoneNumber = null;
                        }
                }

                public String getNumber(){
                    return formattedPhoneNumber;
                }

                public void printOriginalNumbers(){
                    System.out.println("Original number are: " + phoneNumber1 + " - " + phoneNumber2);
                }
            }

            PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
            PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

            if (myNumber1.getNumber() == null){
                System.out.println("Primer número ("+ phoneNumber1  +") es inválido.");
            }else{
                System.out.println("Primer número es: " +  myNumber1.getNumber());
            }

            if (myNumber2.getNumber() == null){
                System.out.println("Segundo número ("+ phoneNumber2  +") es inválido.");
            }else{
                System.out.println("Segundo número es: " +  myNumber2.getNumber());
            }

    }

    public static void main(String[] args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }

}
