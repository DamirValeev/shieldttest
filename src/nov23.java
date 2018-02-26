import static java.lang.System.out;

class test
{
    static int recurs(int m)
    {
        if (m<=0)
        {
            return 0;
        }
        else
        {
            return (m + recurs(m-1));
        }
    }
}

public class nov23 {
    public static void main(String args[]){
        int[] array = new int[10];
        int x=0;
        for(int i=0; i<array.length; i++) {
            array[i] = i * 8;
        }
        for (int y: array) {
            out.println(y);
        }
    }
}
