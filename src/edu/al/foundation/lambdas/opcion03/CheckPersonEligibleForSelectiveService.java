package edu.al.foundation.lambdas.opcion03;

import edu.al.foundation.lambdas.opcion03.TesterOpcion03.CheckPerson;

public class CheckPersonEligibleForSelectiveService implements CheckPerson{

    @Override
    public boolean test(Person p) {
       
        return p.getSex() == Person.Sex.MALE
            && p.getAge() >= 25 
            && p.getAge() <= 42;
    }
    
}
