import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.LinkedList;

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
        //idealogy - to run through both lists, and compare the integers, slot in the numbers in order.
        LinkedList<Integer> finalList = new LinkedList<>();
        //compare sizes for both lists
        int x = list1.size()>list2.size() ? list1.size(): list2.size();
        int i,j =0;
        while (i<list1.size() && j<list2.size()){
            if (list1.get(i)<list2.get(j)){
                finalList.add(list1.get(i));
                i++;
            }
            else if (list1.get(i)>list2.get(j)){
                finalList.add(list1.get[j]);
                j++;
            }
            else{
                finalList.add(list1.get[i]);
                finalList.add(list1.get[j]);
                i++;
                j++; 
            }
            
        }
        //after the addition of the loop ends - add on the rest of the values from the remaining list
        while(i<list1.size()){
            finalList.add(list1.get(i));
            i++;
        }
        while (j<list2.size()){
            finalList.add(list2.get(j));
            j++;
        }
        return finalList;
    }
}