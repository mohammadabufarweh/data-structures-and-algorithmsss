public class Linkedliist {
        Node head;

    public void add(int value) {
            Node nodeToAdd = new Node(value);
            if (head == null) {
                head = nodeToAdd;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = nodeToAdd;
            }
        }

        public void insert(int value) {
            Node addTo = new Node(value);
            if (head == null) {
                head = addTo;
            } else {
                addTo.next = head;
                head = addTo;
            }
        }


        public boolean includes(int x) {
            if (head==null) {
              return false;
                 } else {
              Node pointer = head;
             while (pointer != null) {
             if (pointer.value == x) {
                return true;
            }
                pointer = pointer.next;
           }
           return false;
            }
}
        public String toString() {
            String transferList = "";
            Node p = head;
            if (p == null) {
                return null;
            } else {
                while (p != null) {
                    transferList = transferList + "{ " + p.value + " } -> ";
                    p = p.next;
                }
                transferList += "NULL";
            }

            return transferList;
        }

        public void append(int value) {
            Node nodeToAdd = new Node(value);
            if (head == null) {
                head = nodeToAdd;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = nodeToAdd;
            }
        }

        public void insertBefore(int value, int number) {
            Node pointer = head;
            if(head.value==value){
             insert(number);
            }else {
            if (!includes(value)){
                System.out.println("the value   " + value + "  Does not Exist");
            }
         else  {
                while (pointer.next.value != value) {
                    pointer = pointer.next;
                }
                Node newNode = new Node(number);
                newNode.next = pointer.next;
                pointer.next = newNode;
         }
            }
                Node newNode = new Node(number);
                newNode.next = pointer.next;
        }

        public void insertAfter(int value, int number) {
            Node pointer = head;

            if (!includes(value)) {
                System.out.println("the value " + value + "Does not Exist");
            } else {
                while (pointer.value != value) {
                    pointer = pointer.next;
                }
                Node newNode = new Node(number);
                newNode.next = pointer.next;
                pointer.next = newNode;
            }
        }


        public int  kthValue(int k) throws Exception {
            int c =0;
            Node current = head;
            Node pointer = head;
            while (current.next != null){
                c++;
                current=current.next;
            }
            if ( k > c) {
                throw new Exception("The value out of length");

            }else if (k < 0){
                throw new Exception("k must be positive");
            }
           else if  (head == null ){
                throw new Exception ("the list empty");
            } else {

                 current = head;
            for (int i = 0; i < k; i++) {
                    pointer = pointer.next;
            }
            while (pointer.next != null) {
                pointer = pointer.next;
                current = current.next;
            }
            }
            return  current.value;
        }
    public Linkedliist linkedListZip(Linkedliist llone,Linkedliist lltow) {
        if (llone.head == null) {
            return lltow;
        } else if (lltow.head == null) {
            return llone;
        } else {
            Node counterForListOne = llone.head;
            Node counterForListTwo = lltow.head;
            Node p1 = llone.head;
            Node p2 = lltow.head;
            Node p3 = p1.next;
            int countOne = 0;
            int countTwo = 0;
            while (counterForListOne.next != null) {
                countOne++;
                counterForListOne = counterForListOne.next;
            }
            while (counterForListTwo.next != null) {
                countTwo++;
                counterForListTwo = counterForListTwo.next;
            }
            if (countOne == countTwo) {
                for(int i=0;i<countTwo+1;i++){
                    p1.next = p2;
                    lltow.head = p2.next;
                    p2.next = p3;
                    if(p3!=null){
                        p1 = p3;
                    }
                    p3 = p1.next;
                    p2 = lltow.head;
                }
            } else if (countOne > countTwo) {
                for(int i=0;i<countTwo+1;i++){
                    p1.next = p2;
                    if(p2.next!=null){
                    lltow.head = p2.next;
                    }
                        p2.next = p3;
                        p1 = p3;
                        p3 = p1.next;
                        p2 = lltow.head;
                }
            }else if( countOne < countTwo) {
                for(int i=0;i<countOne+1;i++) {
                        p1.next = p2;
                        lltow.head = p2.next;
                        p2.next = p3;
                        if(p3==null){
                            p1.next=p2;
                        }
                    if(p3!=null){
                        p1 = p3;
                    }
                        p3 = p1.next;
                    p2 = lltow.head;
                }
                System.out.println(p2.value);
                if (p2!=null){
                    p3.next = p2;
                }
            }
            return llone;
        }
    }
    public Linkedliist reverseLinkedList(Linkedliist ll){
    Node prev = null;
    Node current = head;
    Node next = null;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
     }
    head = prev;
    return ll;
    }

    }