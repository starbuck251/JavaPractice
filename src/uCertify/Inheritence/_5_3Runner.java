package uCertify.Inheritence;

public class _5_3Runner {

    public static void main(String[] args) {

        _5_3Person person = new _5_3Person("Andrew", "Grey");
        person.greet();

        System.out.println("==============================");

        _5_3Friend friend = new _5_3Friend("Sarah", "blond", "help you fix that flat tyre");
        System.out.println(friend.getName() + " has " + friend.hairColour + " hair");
        friend.greet();
        friend.doFavour();
    }

}
