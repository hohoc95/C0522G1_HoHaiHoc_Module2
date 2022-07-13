package ss10_dsa_list.practice.practice2_simple_linked_list_class.controller;

public class MyLinkedListTest {

    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        ss10_dsa_list.practice.practice2_simple_linked_list_class.model.MyLinkedList ll = new ss10_dsa_list.practice.practice2_simple_linked_list_class.model.MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(5, 10);
        ll.printList();
    }
}

