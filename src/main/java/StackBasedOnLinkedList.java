/**
 * 基于链表实现的栈。
 *
 * Author: Zheng
 */
public class StackBasedOnLinkedList {
  private Node top = null;

  public void push(int value) {
    Node newNode = new Node(value, null);
    // 判断是否栈空
    if (top == null) {
      top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
  }

  /**
   * 我用-1表示栈中没有数据。
   */
  public int pop() {
    if (top == null) return -1;
    int value = top.data;
    top = top.next;
    return value;
  }

  public void printAll() {
    Node p = top;
    while (p != null) {
      System.out.print(p.data + " ");
      p = p.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    StackBasedOnLinkedList stackBasedOnLinkedList = new StackBasedOnLinkedList();
    stackBasedOnLinkedList.push(1);
    stackBasedOnLinkedList.push(2);
    stackBasedOnLinkedList.push(3);
    stackBasedOnLinkedList.push(4);
    stackBasedOnLinkedList.push(5);
    stackBasedOnLinkedList.pop();
    stackBasedOnLinkedList.push(5);
    stackBasedOnLinkedList.printAll();
  }

  private static class Node {
    private int data;
    private Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }

    public int getData() {
      return data;
    }
  }
}
