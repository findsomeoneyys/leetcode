package com.ys.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {
        Integer[] l1  = new Integer[] {1,2,4};
        Integer[] l2  = new Integer[] {1,3,4};
        List<Integer> rst = new ArrayList<Integer>();
        rst.addAll(Arrays.asList(l1));
        rst.addAll(Arrays.asList(l2));
        Collections.sort(rst);

        ListNode n1 = initNodeWithArray(Arrays.asList(l1));
        ListNode n2 = initNodeWithArray(Arrays.asList(l2));
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        assertEquals(rst, nodeToArray(m.mergeTwoLists(n1, n2)));

    }

    public List<Integer> nodeToArray(ListNode l) {
        List<Integer> List = new ArrayList<Integer>();
        ListNode head = l;
        do {
            List.add(head.val);
            head = head.next;
        } while (head != null);
        return List;
    }

    public ListNode initNodeWithArray(List<Integer> l) {
        ListNode node = new ListNode(-1);
        ListNode head = node;
        for (Integer i:l) {
            if (head.val == -1) {
                head.val = i;
            } else {
                head.next = new ListNode(i);
                head = head.next;
            }
        }
        return node;

    }

}