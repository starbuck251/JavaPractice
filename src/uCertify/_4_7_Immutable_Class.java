package uCertify;

public class _4_7_Immutable_Class {
    private int numberEggs;

    //getter
    public int getNumberEggs(){
        return numberEggs;
    }


    public _4_7_Immutable_Class (int numberEggs){
        this.numberEggs = numberEggs;
    }

}

class ImRunner{

    public static void main(String[] args) {

        //set the number of eggs in the constructor
        _4_7_Immutable_Class eggs = new _4_7_Immutable_Class (2);

        System.out.println("eggs number is: "+ eggs.getNumberEggs());
    }
}