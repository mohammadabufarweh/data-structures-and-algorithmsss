import java.util.*;


public class HashTable <T>{
    Node[] arr;
    private ArrayList<T> bucketArray;

    public ArrayList<T> getBucketArray(int i) {
        return bucketArray;
    }

    public Node[] getArr() {
        return arr;
    }

    int size;
    HashTable h;
    public HashTable(int size){
        this.size=size;
        arr=new Node[size];
        // Define and initilize the arr
        for (int i=0;i<size;i++){
            arr[i] = new Node();
        }
    }
     public int hash (int key){
         return (key*599)%size;
    }
    public void add(int key ,Object value){
        int index = hash(key);
        Node arrayValue=arr[index];
        Node newItem=new Node(key,value);
        newItem.next=arrayValue.next;
        arrayValue.next=newItem;

    }

    public T get(int key){
        T value = null;
        int index=hash(key);
        Node arrayValue=arr[index];


        while (arrayValue!=null){
            if(arrayValue.getKey()==key){
                value= (T) arrayValue.getValue();
                break;
            }
            arrayValue=arrayValue.next;
        }
        return value;
    }
    public boolean contains (int key){
        int index = hash(key);
        Node arrayValue=arr[index];
        while (arrayValue!=null){
            if (arrayValue.getKey()==key) {
         return true;
     }else arrayValue=arrayValue.next;
}
        return false;
    }

    public String toString(){
        String result = "";
        if(arr == null){
            return "hash Table is Empty";
        }
        for (int i = 0; i < arr.length; i++) {
            Node arrayValue = arr[i];
//            System.out.println(arrayValue.getValue());
            if(arrayValue!=null){

                    while (arrayValue!=null){
                        result = result+"Key "+arrayValue.key+" Value "+ arrayValue.value + " \n";
                        arrayValue = arrayValue.next;
                    }
            }
        }
        return result;
    }

}
