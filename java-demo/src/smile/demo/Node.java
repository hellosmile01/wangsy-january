package smile.demo;

/**
 * @author wangsy
 * @Date 2018/9/8.
 */
public class Node {

    private Integer number;

    private Integer index;

    public Node(Integer number, Integer index) {
        this.number = number;
        this.index = index;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
