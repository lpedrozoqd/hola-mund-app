package edu.al.essential.exceptionsAll.catchingAndHandlingExceptions;

public class RelanzarUnaExcepcionTester {
    public static void generarExcepcion() {
        //Aquí, 'num' es más largo que 'denom'
        int nums[] = {4,8,16,32,64,128,256,512};
        int denom[] = {2,0,4,4,0,8};
        for (int i = 0; i < nums.length; i++) {
            try {
                System.out.println(nums[i] + " / " + denom[i] + " : " + nums[i]/denom[i]);        
            } catch (ArithmeticException e) {
                System.err.println("No se puede dividir por cero!");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("No se encontró ningún elemento!");
                //Se relanza la solicitud:
                throw e;
            }
        }
    }

    public static void main(String[] args) {
        try {
            RelanzarUnaExcepcionTester.generarExcepcion();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ERROR - programa terminado");
        }
        
    }
}
