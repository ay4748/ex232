//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public float sumPolution(Vehicles a[])
    {
        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            sum+=a[i].exhaust();
        }
        return sum;
    }

    public void noiseall(Vehicles[] a)
    {
        for(int i = 0;i <a.length;i++)
        {
            if (a[i] instanceof Regular)
                System.out.print(i + ". ");
                ((Regular) a[i]).noise();
        }
    }

    public int sumPassengers(Vehicles a[])
    {
        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            if (a[i] instanceof Bicycle)
            {
                if (((Bicycle) a[i]).isBasket())
                {
                    sum++;
                }
            }
            else if (a[i] instanceof Regular){
                sum += ((Regular) a[i]).getPassengerCount() - 1;
            }

        }
        return sum;
    }


    public static int findCart(Vehicles a[])
    {
        int i = 0;
        boolean found = false;

        while(i < a.length && !found)
        {
            if(a[i] instanceof Cart)
            {
                found = true;
                return i;
            }
            i++;
        }

        return -369;
    }
    public static String longestTimeCharging(Vehicles[] a)
    {
        int longest = findCart(a);
        if(longest == -369)
        {
            for (int i = longest; i < a.length; i++)
            {
                if (a[i] instanceof Cart)
                {
                    if (((Cart) a[i]).getChargingTime() > ((Cart) a[longest]).getChargingTime())
                    {
                        longest = i;
                    }
                }

            }
            return a[longest].getCarNum();
        }
        else
        {
            return "no carts in array";
        }
    }
    public static void main(String[] args) {

    }
}