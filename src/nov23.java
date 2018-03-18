import lesson17march.ex2.Student;

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
    }
}
