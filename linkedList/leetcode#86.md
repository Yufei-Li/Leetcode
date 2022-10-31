## 题目描述
Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.
## 测试用例
Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]


## 解题思路
在合并两个有序链表时让你合二为一，而这里需要分解让你把原链表一分为二。具体来说，我们可以把原链表分成两个小链表，一个链表中的元素大小都小于 x，另一个链表中的元素都大于等于 x，最后再把这两条链表接到一起，就得到了题目想要的结果。


## 注意
看似是一个linked list变为另外一个linked list，实际上是将一个linked list分为两个linked list，最后合并起来