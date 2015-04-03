import helper.LinkedList;

public class Two2Test {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = makeList("987659321");
        LinkedList<Integer> list2 = makeList("111111119");
        LinkedList<Integer> list3 = makeList("");

        System.out.println(Two2Kth.findKth(list1, 4));
        System.out.println(Two2Kth.findKth(list2, 1));
        System.out.println(Two2Kth.findKth(list3, 1));
    }

    private static LinkedList<Integer> makeList(String str) {
        Integer[] c = new Integer[str.length()];
        for (int i = 0; i < str.length(); i++) {
            c[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return new LinkedList<Integer>(c);
    }
}
