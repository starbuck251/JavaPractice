package uCertify;

public class _4_7_Encapsulating_Data {
    private int numberEggs;

    //getter
    public int getNumberEggs(){
        return numberEggs;
    }

    //setter
    public void setNumberEggs(int numberEggs){
        if (numberEggs >=0)
            this.numberEggs = numberEggs;
    }

}

class Runner{

    public static void main(String[] args) {
        _4_7_Encapsulating_Data eggs = new _4_7_Encapsulating_Data();
        eggs.setNumberEggs(-4);
        System.out.println("eggs number is: "+ eggs.getNumberEggs());
    }
}