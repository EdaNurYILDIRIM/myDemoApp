/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package myDemoApp;

import java.util.ArrayList;


public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());
        ArrayList <Integer> array = new ArrayList<>();
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        new App();
        System.out.println(App.getElementFromGivenIndex(array,4,1,3));
    }

    public static int getElementFromGivenIndex(ArrayList<Integer> array, int index, int operation, int number)throws Exception{
        if (array == null){
            throw new Exception("Array is null.");
        }
        else if (array.size() == 0){
            throw new Exception("Array is empty.");
        }
        else{
            if(operation == 0){
                if(array.size() <= index+number){
                    throw new Exception("Index out of bound.");
                } else {
                    return array.get(index+number);
                }  
            }
            else if(operation == 1) {
                if(index-number < 0){
                    throw new Exception("Index out of bound.");
                } else {
                    return array.get(index-number);
                }
            } else{
                throw new Exception("Undefined operation");
            }
        }
      }
}