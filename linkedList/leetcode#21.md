## 题目描述
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

## 测试用例
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]


## 解题思路
我们的 while 循环每次比较 p1 和 p2 的大小，把较小的节点接到结果链表上

## 注意
1. 建立初始头节点的时候创立dummy listNode，最后return dummy.next， 否则没有指针指向最初的头节点