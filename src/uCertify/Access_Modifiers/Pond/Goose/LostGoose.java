package uCertify.Access_Modifiers.Pond.Goose;

import uCertify.Access_Modifiers.Pond.Duck.DuckTeacher;

public class LostGoose {
    public void swim(){
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim();
        System.out.println("Thanks"+ teacher.name);
    }
}
