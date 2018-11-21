package uCertify.Access_Modifiers.Pond.Inland;

import uCertify.Access_Modifiers.Pond.Shore.Bird; //different package than Bird

public class BirdWatcherFromAfar {
    public void watchBird(){
        Bird bird = new Bird();
        //methods of bird are not available o do not compile
       // bird.float
       // System.out.println(bird.text);
    }
}
