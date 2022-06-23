package edu.al.foundation.enumAll;

public class EnumTester01 {
    public enum Demarcacion{
        PORTERO,
        DEFENSA,
        CENTROCAMPISTA,
        DELANTERO
    }

    public enum Equipo{
        BARCA("FC BARCELONA", 1),
        RM("RM", 2),
        AM("AM", 3);

        private String nombreClub;
        private int puestoLiga;

        private Equipo(String nombreClub, int puestoLiga){
            this.nombreClub = nombreClub;
            this.puestoLiga = puestoLiga;
        }

        public String getNombreClub(){
            return this.nombreClub;
        }

        public int getPuestoLista(){
            return this.puestoLiga;
        }
    }

    public static void main(String[] args) {
        System.out.println("===>Uso de enum en EnumTester01:");
        Demarcacion delantero = Demarcacion.DELANTERO;
        System.out.println(">> Nombre del ítem de Enum (Demarcacion.DELANTERO): " + delantero.name());
        System.out.println(">> Posición del ítem de Enum (Demarcacion.DELANTERO): " + delantero.ordinal());        
        System.out.println("=================");
        Equipo equipoBarca = Equipo.BARCA;
        System.out.println(">> Club #1: " + equipoBarca.getNombreClub());

    }
}
