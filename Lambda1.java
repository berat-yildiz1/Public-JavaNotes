interface lambda1{

    int calcu(int x,int y);

}
public class Main {
    public static void main(String[] args) {


        lambda1 lmul=(x,y)->x*y;
        lambda1 lsum=(x,y)->x+y;
        lambda1 lsub=(x,y)->x-y;
        lambda1 ldiv=(x,y)->x/y;

        System.out.println("multiplication: "+lmul.calcu(10,5)+"\nsummation: "+lsum.calcu(10,5)+"\nsubtraction: "+lsub.calcu(10,5)+"\ndivision: "+ldiv.calcu(10,5));


    }
}
