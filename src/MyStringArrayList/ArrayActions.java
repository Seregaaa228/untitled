package MyStringArrayList;


import java.util.Arrays;

public class ArrayActions {

    private String[] array;
    private int countAction = 0;

    public ArrayActions(){
        array = new String[10];
    }

    public String get(int index){
        if(index < countAction){
            return  array[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void add(String string){
        if( array.length - countAction == 1){
            array = Arrays.copyOf(array, array.length+1);
        }
        array[countAction++] = string;
    }

    public String remove(int index){
        if(index < countAction){
            String string =  array[index];
            array[index] = null;
            int tmp = index;
            while(tmp < countAction){
                array[tmp] =  array[tmp+1];
                array[tmp+1] = null;
                tmp++;
            }
            countAction--;
            return string;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }
    public void set(int index, String string) {
        array[index] = string;
    }

    @Override
    public String toString() {
        return "ArrayActions{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
    public int size(){
        return countAction;
    }

    public static void main(String[] args) {
        ArrayActions arrayActions = new ArrayActions();
        arrayActions.add("hello");
        arrayActions.add("hello");
        arrayActions.add("hello");
        arrayActions.add("hello");
        arrayActions.add("hello");
        arrayActions.add("hello");
        arrayActions.add("hello");
        arrayActions.add("hello");
        arrayActions.add("hello");
        arrayActions.add("hello");
        arrayActions.remove(1);
        arrayActions.set(5, "BYE");
        for (int i = 0; i < arrayActions.size(); i++) {
             System.out.println(i + "."+ arrayActions.get(i) + " ");

        }
        System.out.println(arrayActions);
    }
}
