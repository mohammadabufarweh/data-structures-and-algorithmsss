import java.util.ArrayList;
import java.util.List;

public class HashMapTreeIntersection {
    public List<Integer> treeIntersection(BinaryTree<Integer> tree1, BinaryTree<Integer> tree2){

        HashTable<Integer> myHash = new HashTable<>(100);
        List<Integer> resultArray = new ArrayList<>();
        List<Integer> intersect = tree1.preOrder(tree1.root);
        for(int t : intersect) {
            myHash.add(t , 0);
        }
        List<Integer> myList = tree2.preOrder(tree2.root);
        for(int x : myList){
            if(myHash.contains(x)) {
                resultArray.add(myList.get(myList.indexOf(x)));
            }
        }
        return resultArray;
    }
}
