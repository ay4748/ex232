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
    public static void main(String[] args) {

    }
}