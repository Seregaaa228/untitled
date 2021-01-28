package MyStringArrayList;


import java.util.Arrays;

public class ArrayActions {

    private String[] array;
    private int countAction = 0;
    private int index;

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
    private void grow() {
        String[] newArray = new String[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, index - 1);
        array = newArray;
    }

    public void add(String string){
        if( array.length - countAction == 1){
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[countAction++] = string;
    }
    public void add(int index, String string) {
        final int s;
        String[] elementData;
        if ((s = countAction) == (elementData = this.array).length)
            grow();
        System.arraycopy(elementData, index,
                elementData, index + 1,
                s - index);
        elementData[index] = string;
        countAction++;
    }

    public String remove(int index){
        if(index < countAction){
            String string =  array[index];
            array[index] = null;
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
        arrayActions.add(7, "BYE12");
        arrayActions.add(7, "BYE123");
        for (int i = 0; i < arrayActions.size(); i++) {
             System.out.println(i + "."+ arrayActions.get(i) + " ");

        }
        arrayActions.remove(6);
        System.out.println(arrayActions);
    }
}
