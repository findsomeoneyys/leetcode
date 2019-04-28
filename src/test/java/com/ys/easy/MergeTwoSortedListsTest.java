package com.ys.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class MergeTwoSortedListsTest {
    private static final Logger logger = Logger.getLogger(MergeTwoSortedListsTest.class.getName());
    private static MergeTwoSortedLists mtsl;

    @BeforeAll
    static void setup(){
        logger.info("@BeforeAll executed");
        mtsl = new MergeTwoSortedLists();
    }

    @ParameterizedTest
    @MethodSource("provideIntegerArray")
    public void mergeTwoLists(Integer[] l1, Integer[] l2) {
        List<Integer> rst = new ArrayList<Integer>();
        rst.addAll(Arrays.asList(l1));
        rst.addAll(Arrays.asList(l2));
        Collections.sort(rst);

        ListNode n1 = initNodeWithArray(Arrays.asList(l1));
        ListNode n2 = initNodeWithArray(Arrays.asList(l2));
        assertEquals(rst, nodeToArray(mtsl.mergeTwoLists(n1, n2)));

    }

    private static Stream<Arguments> provideIntegerArray() {
        return Stream.of(
                Arguments.of(new Integer[] {1,2,4}, new Integer[] {1,3,4}),
                Arguments.of(new Integer[] {1,5,7}, new Integer[] {1,11,22}),
                Arguments.of(new Integer[] {1,4,4}, new Integer[] {1,5,9})
        );
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