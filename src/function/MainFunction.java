package function;


public class MainFunction {
    public static void main(String[] args) {
        Function function;
        function = (n, v) -> n % v == 0;
        if (function.bot(10, 2)) {
            System.out.println("function.bot(10,2)::" + function.bot(10, 2));
        }
        function = (n, v) -> (n < 0 ? -n : n) == (v < 0 ? -v : v);
        if (function.bot(5, -5)) {
            System.out.println("function.bot(5,-5)::" + function.bot(5, -5));
        }

        Function1 function1 = (a, b) -> a.indexOf(b) != -1;
        String strTest = "Тестируемая строка";
        if (function1.test(strTest, "ст")) {
            System.out.println("function1.test(strTest, \"ст\")::" + function1.test(strTest, "ст"));
        }

        BlockF blockF = (n) -> {
            int result = 1;
            n = n < 0 ? -n : n;
            for (int i = 2; i < n / i; i++) {
                if ((n % i) == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };
        System.out.println("наименьший делитель 93 это - " + blockF.blockf(33));

        SomeTest<Integer> someTest = (n, m) -> (n % m == 0);
        if (someTest.test(45,45)){
            System.out.println("someTest.test(45,45):: " + someTest.test(45,45));
        }
        ;
        String str = "Тестируемая строка";
        SomeTest<String> someTest1 = (n,m) -> (n.indexOf(m)!=-1);
        if (someTest1.test("проверить это", "это")){
            System.out.println("someTest1.test(\"проверить это\", \"это\")::" + someTest1.test("проверить это", "это"));
        }

    }
}
