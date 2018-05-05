import java.util.Random;


public class Carriage {
    private  boolean lamp;

    public Carriage()
    {
        Random r=new Random();
        if(r.nextInt(2)==0)
        {lamp=true;

        }else
        {
            lamp=false;
        }
    }

    public boolean isLamp() {
        return lamp;
    }

    public void setLamp(boolean lamp) {
        this.lamp = lamp;

    }
}
