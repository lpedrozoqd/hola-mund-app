package edu.al.foundation.annotations;

public class BasicAnnotations {
    /*
    1-Ejemplo de formato: @Entity
    
    2-Ejemplo real:
    @override
    void mySuperMethod(){...}

    3-Puede incluir elementos: named o unnamed, ej:
    @Author(
        name="Leo Pedrozo",
        date="06/01/1979"
    )
    class MyClass
    @SupressWarning(values="unchecked")
    void myMethod(){...}

    4-Si hay un sólo elemento, este podrá ser omitido
    @SupressWarning("unchecked")
    void myMethod(){...}

    5-Múltiples antocaciones en la misma declaración:
    @Author(name="Leo Pedrozo")
    @EBook
    class MyClass{...}

    6-Anotaciones del mismo tiempo pueden ser llamadas repedtidamente
    @Author(name="Leo Pedrozo")
    @Author(name="Elías Pedrozo")
    class MyClass{...}

    4-Donde pueden ser usadas:
    4.1-Clases :
        new @Interned MyObject();

    4.2-Type cast :
        myString = (@NonNull String) str;
    
    4.3-sentencia "implements":
        class UnmodifiableList<T> implements 
            @Readonly List<@Readonly T> {...}        

    4.4-Declaración de excepción Thrown:
        void monitorTemperature() throws
            @Critical TemperatureException
                        
    */
}
