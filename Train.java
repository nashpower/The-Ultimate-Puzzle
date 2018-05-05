import java.util.ArrayList;
import java.util.Random;


public class Train {
    private ArrayList<Carriage> carriages=new ArrayList<>();
    private int currentPosition=0;
    public Train(){
        Random r= new Random();
        for(int i=0;i<r.nextInt(1000)+1;i++) {
            carriages.add(new Carriage());
        }
        System.out.println(carriages.size());

    }
    public void nextCarriage()
    {
        if(currentPosition==carriages.size()-1)
        {
            currentPosition=0;
        }else {
            currentPosition++;
        }

    }
    public void previousCarriage()
    {
        if(currentPosition==0)
        {
            currentPosition=carriages.size()-1;
        }else {
            currentPosition--;
        }

    }
    public Carriage current(){
        return carriages.get(currentPosition);
    }

}
