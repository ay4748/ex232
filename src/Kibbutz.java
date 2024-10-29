import java.util.Arrays;

public class Kibbutz {
    Vehicles[] list;
    int numVehicles;

    public Kibbutz() {
        this.list = new Vehicles[500];
        numVehicles = 0;
    }

    @Override
    public String toString() {
        return "Kibbutz{" +
                "list=" + Arrays.toString(list) +
                ", numVehicles=" + numVehicles +
                '}';
    }

    public Vehicles[] getList() {
        return list;
    }

    public void setList(Vehicles[] list) {
        this.list = list;
    }

    public int getNumVehicles() {
        return numVehicles;
    }

    public void setNumVehicles(int numVehicles) {
        this.numVehicles = numVehicles;
    }

    public void addVehicle(Vehicles vehicle)
    {
        if(numVehicles < 500)
        {
            list[numVehicles] = vehicle;
            numVehicles++;
        }
    }

    public Vehicles[] count15andwheel(Vehicles[] a)
    {
        int count = 0;


        for(int i = 0; i < a.length; i++)
        {
            if(a[i].isWheelSteering() && a[i].getAge() > 15)
            {
                count++;
            }
        }
        if(count > 0)
        {
            Vehicles[] newlist = new Vehicles[count];
            for(int i = 0; i < count; i++)
            {
                int count1 = 0;
                if(a[i].isWheelSteering() && a[i].getAge() > 15)
                {
                    newlist[count1] = a[i];
                    count1++;
                }
            }
            return newlist;
        }
        Vehicles[] empty = new Vehicles[1];
        return empty;
    }
    public int countlightandsteering(Vehicles[] a)
    {
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            if(a[i] instanceof Light)
            {
                if(a[i].isWheelSteering())
                {
                    count++;
                }
            }
        }

        return count;
    }

}
