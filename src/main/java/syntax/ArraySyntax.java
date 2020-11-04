package syntax;

public class ArraySyntax {
    public static void main(String[] args) {
        arraySyntax();
    }

    private static void arraySyntax() {
        Integer[] list = {1, 2, 3, 4}; // create new integer array and populate it
        printList(list);

        Integer[] list2 = new Integer[4]; // set length of array then populate it
        list2[0] = 10;
        list2[1] = 20;
        list2[2] = 30;
        list2[3] = 40;
        printList(list2);

        Integer[] list3 = new Integer[4];
        for (int i = 0; i < list3.length; i++) {
            list3[i] = (i + 1) * 100;
        }
        printList(list3);
    }

    private static void printList(Integer[] list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
