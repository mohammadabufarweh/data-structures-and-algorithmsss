/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        HashTable<String>ht=new HashTable<>(1024);
//        ht.add(11,"amman");
//        System.out.println(ht.get(11));
//        ht.add(51,"zarqa");
//        ht.add(1,"irbid");
//        ht.add(11,"aqaba");
//        System.out.println(ht.get(51));
//        System.out.println(ht.get(11));
//        System.out.println(ht.toString());
//        System.out.println(ht.contains(1));
//        System.out.println(ht.contains(51));
//        System.out.println(ht.contains(114));
//        System.out.println(ht.contains(12));

//        String text = "Once upon a time, there was a brave princess who";
//        String text ="It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
//        String text="It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
//        RepeatedWord repeatedWord=new RepeatedWord();
//        System.out.println(repeatedWord.repeatWord(text));

        BinaryTree tree1=new BinaryTree();
        BinaryTree tree2=new BinaryTree();

        tree1.root = new NodeTree(8);
        tree1.root.left = new NodeTree<>(17);
        tree1.root.right = new NodeTree<>(22);
        tree1.root.right.right = new NodeTree<>(43);
        tree1.root.right.left = new NodeTree<>(51);

        tree2.root = new NodeTree<>(8);
        tree2.root.left = new NodeTree<>(17);
        tree2.root.right = new NodeTree<>(25);
        tree2.root.right.right = new NodeTree<>(40);
        tree2.root.right.left = new NodeTree<>(55);
        HashMapTreeIntersection hashMapTreeIntersection=new HashMapTreeIntersection();
        System.out.println(hashMapTreeIntersection.treeIntersection(tree1 , tree2));

    }
}
