Складність алго  O(n^2)


import java.util.ArrayList;
import java.util.List;

public class Main
{


    public static void main(String[] args)
    {
        int month = 2;
        int bday = 4;
        int [] batonchick = {2,2,1,3,2};

        for (int i=0; i < Main.podil(month, bday, batonchick).size(); i++)
        {
            System.out.print(Main.podil(month, bday, batonchick).get(i) + " ");
        }

    }

    public static List podil(int month, int bday, int[] batonchick)
    {
            List arr = new ArrayList<int []>();
            int sum = 0;
            int count = 0;
            for (int i = 0; i < batonchick.length; i++)
            {
                for(int j = 1; j <= batonchick.length-1; j++)
                {
                   if (batonchick[i] + batonchick[j] == bday) {
                       arr.add(batonchick[i], batonchick[j]);
                   }
                }
            }

            return(arr);
    }
}