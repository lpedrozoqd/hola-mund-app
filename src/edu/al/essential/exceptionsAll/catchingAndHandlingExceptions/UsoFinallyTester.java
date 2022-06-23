package edu.al.essential.exceptionsAll.catchingAndHandlingExceptions;

public class UsoFinallyTester {
    public static void genExcepcion(int recArg){
        int t;
        int nums[] = new int[2];
        System.out.println("Recibiendo: " + recArg);

        try {
            switch (recArg) {
                case 0:
                    t = 10 / recArg;
                    break;
                case 1:
                    nums[4] = 4; //Genera error de indexación
                    break;
                case 2:
                    return;  //Retorna desde try                  
            }
        } catch (ArithmeticException e) {
            System.err.println("No se puede dividir por cero!");
            return; // Retorna desde catch;
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Elemento no encontrado!");
        }finally{
            System.out.println("Saliendo del try!");
        }
    }

    public static void main(String[] args) {
        System.out.println("==> Uso Finally");
        for (int index = 0; index < 3; index++) {
            UsoFinallyTester.genExcepcion(index);
            System.out.println();    
        }
        
    }
}
