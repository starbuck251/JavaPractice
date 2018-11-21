package uCertify.Access_Modifiers.Pond.Shore; //same package as Bird

public class BirdWatcher {
    public void watchBird(){
        Bird bird = new Bird();
        //call protected members
        bird.floatInWater();
        System.out.println(bird.text);

    }
}
