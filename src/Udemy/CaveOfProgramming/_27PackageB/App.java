package Udemy.CaveOfProgramming._27PackageB;

import Udemy.CaveOfProgramming._27Packages._27SubPackage.Plants;
import Udemy.CaveOfProgramming._27Packages._27SubPackage.Seaweed;
import Udemy.CaveOfProgramming._27Packages.Fish;
/* using a star means
*
* import Udemy.CaveOfProgramming._27Packages.Fish;
* import Udemy.CaveOfProgramming._27Packages._27SubPackage.Seaweed;
*
* sub packages can be with packages within packages and looks like
* import Udemy.CaveOfProgramming._27Packages._27SubPackage.Seaweed;
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
