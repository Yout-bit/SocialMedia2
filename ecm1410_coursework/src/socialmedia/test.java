package socialmedia;


import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws IllegalHandleException {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        int y = 5;
        for (int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
            if (numbers.get(i) == y){
                System.out.println("y");
            }
        }
    }
}
