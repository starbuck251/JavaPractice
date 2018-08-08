package UdemyCaveOfProg._27PackageB;

import UdemyCaveOfProg._27Packages.*;
import UdemyCaveOfProg._27Packages._27SubPackage.Plants;
import UdemyCaveOfProg._27Packages._27SubPackage.Seaweed;
/* using a star means
*
* import UdemyCaveOfProg._27Packages.Fish;
* import UdemyCaveOfProg._27Packages._27SubPackage.Seaweed;
*
* sub packages can be with packages within packages and looks like
* import UdemyCaveOfProg._27Packages._27SubPackage.Seaweed;
*
*
* Convention for packages is to put the website url in reverse ie
*  com.caveofprogramming.tutorial27Packages
*
* */

public class App {

    public static void main (String [] args){

        //to use this the package has to be imported
        Fish fish = new Fish();
        Seaweed weed = new Seaweed();
        Plants plant = new Plants();

    }

}
