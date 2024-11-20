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
        //next moves onto the next array item in the node, but val is used to obtain the value
        //intuition - to use the list1.next and list2.next to compare
        //to iterate through, insert as required?
        ListNode newNode = new ListNode(0);
        ListNode finalList = newNode;
        //size of finalList should be the combined sizes of list1 and list2
        while(list1!=null && list2!=null){
            if (list2.val>list1.val){
                finalList.next=list1;
                list1 = list1.next;
            }
            else{
                finalList.next=list2;
                list2 = list2.next;
            }
            finalList = finalList.next;
            //add the smaller item into the finalList
            //the second value will remain to be used to compare with the next value before 
            //does next dispose of the current value
        }
        //add in the remainder of the list that has not been added
        if (list1!=null){
            finalList.next=list1;
        }
        if (list2!=null){
            finalList.next=list2;
        }
        return newNode.next;
    }
}