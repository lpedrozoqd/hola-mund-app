package edu.al.foundation.annotations;

public class AnnotationType {

    //1. Este sería el esquema básico sin anotaciones
    //para comentarios en la cabecera de una clase

    public class Generation2List{

    }

    public class Generation3List extends Generation2List{
        //Author: Leo Pedrozo
        //Fecha: 18jun22
        //Última versión: 6
        //Modificacion: 4/jun/2004
        //Por: Elías Pedrozo
        //Revisores: Rebeca Pedrozo, Abel Pedrozo

        //{...}
    }

    @ClassPreamble(
        author = "Leonel Pedrozo",
        date = "03/17/2022",
        currentRevision = 6,
        lastModified = "18/06/2022",
        lastModifiedBy = "Leonel Pedrozo",
        reviewers = {"@abelp, @rebecap"}
    )
    public class Generation4List extends Generation2List{
        
    }
    
}
