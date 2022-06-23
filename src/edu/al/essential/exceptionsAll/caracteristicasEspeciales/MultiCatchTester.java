package edu.al.essential.exceptionsAll.caracteristicasEspeciales;

public class MultiCatchTester {
    public static void main(String[] args) {
        int a = 28, b=0;
        int resultado;
        char chars[]={'A','B','C'};
        System.out.println("==> multi-catch");
        for (int index = 0; index < 2; index++) {
            try {
                if (index==0)
                    resultado = a/b; //genera ArithmeticException
                else
                    chars[5] = 'X'; //genera ArrayIndexOutboundsException
            //Este es el multi-cath                    
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.err.println("Excepción capturada: " + e);
            }
        }
    }
}
