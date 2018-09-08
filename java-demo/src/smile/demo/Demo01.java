package smile.demo;

import java.util.LinkedList;

/**
 * @author wangsy
 * @Date 2018/9/8.
 */
public class Demo01 {

    public static void main(String[] args) {

        LinkedList<Node> linkedList = new LinkedList<>();

        for (int i=0; i<10; i++) {
            linkedList.add(new Node(i+1, i+1));
        }

        while (linkedList.size()>1) {
            for (int i=0; i<linkedList.size(); i++) {

            }
        }

        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);
    }

}
