import java.lang.classfile.components.ClassPrinter.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //intuition - to use the list1.next and list2.next to compare
        //to iterate through, insert as required?
        ListNode finalList = new ListNode(){};
        //size of finalList should be the combined sizes of list1 and list2
        int first = list1.next;
        int second = list2.next;
        while(list1.size()!=0 && list2.size()!=0){
            if (first>second){
                finalList.add(first);
                first = list1.next;
            }
            else{
                finalList.add(second);
                second = list2.next;
            }
            //add the smaller item into the finalList
            //the second value will remain to be used to compare with the next value before 
            //does next dispose of the current value
        }
        //add in the remainder of the list that has not been added
        while (list1.size()!=0){
           finalList.add(list1.next);
        }
        while (list2.size()!=0){
            finalList.add(list2.next);
         }
    }
}