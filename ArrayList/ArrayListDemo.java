import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args){
        ArrayList<Integer> arrayList =  new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);

        int ele1 = arrayList.get(1);
        System.out.println(ele1);
        arrayList.set(1,3);
        System.out.println(arrayList);

        for(int i: arrayList){
            System.out.println(i);
        }

        arrayList.add(2, 16);
        System.out.println(arrayList);




    }
}