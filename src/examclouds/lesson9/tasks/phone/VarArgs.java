package examclouds.lesson9.tasks.phone;

public class VarArgs {

    void test(int... array) {
        System.out.println("Количество аргументов: " + array.length);
        for (int a : array) {
            System.out.print(a + " ");

        }
        System.out.println();
    }

}
