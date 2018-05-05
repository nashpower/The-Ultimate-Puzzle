
public class Solver {
    public static void main(String[] args) {
        Train t=new Train();

        int i=1;

        t.current().setLamp(true);
        while (true){
            for(int j=0;j<i;j++)
            {
                t.nextCarriage();
                t.current().setLamp(false);
            }

            for(int j=i;j>0;j--)
            {
                t.previousCarriage();

            }
            if(!t.current().isLamp())
            {
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
