package August.test0821;

/**
 * @author Li Xuyang
 * @date 2020/8/21 22:04
 */
public class Node {
    //键
    Object key;
    //值
    Object value;
    //上一个节点
    Node pre;
    //下一个节点
    Node next;

    public Node(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
}
