package edu.al.foundation.annotations;

import java.lang.annotation.Documented;

//@Documented: hace que aparezca a información en documentación generada
//en Javadoc

@Documented
@interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    //No se usan arrays
    String[] reviewers();
}
