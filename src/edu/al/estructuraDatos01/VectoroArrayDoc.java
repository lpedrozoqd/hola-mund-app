package edu.al.estructuraDatos01;

public class VectoroArrayDoc {
    /*
    1- Es una ED que se salva de forma contigua, uno detás del otro en espacio físico en la RAM
   
    2- El acceso por índice a esos elementos es 'constante'...da igual
    que tenga 1 elemento o 4000, siempre tardarás lo mismo

    3- Con solo conocer la posición de memoria del primer elemento (con una fórmula
    matemática 'bien sencilla'), se podrá
    conocer la posición de memoria de todos los demás...pero esto trae problemas

    4- El PC debe encontrar un espacio de memoria sufientemente grande
    para que todos esos datos entren. Por ejemplo, en C, ahí se debe setear
    el tamaño del array por adelantado (int values[5]).

    5- Si necesita agregar más elementos al array, (array.add(n+1)), se debe
    buscar nueva posición de memoria para copiar el traslado de todos los elementos y tiene su "coste lineal".

    6- No es óptima con grandes cantidades de datos.

    7- No puede modificarse en tiempo de ejecución

    8- Errores en tiempo de ejecución. Indices fuera de rango.

    9- Desperdicio de memoria cuando no se ocupa la totalidad de la ED.

    =====================================================

    10- Tiene una lógica fácil
    
    11- Optima para resolver problemas pequeños y medianos.

    */
}
