package lesson_b.task_1;

public class Link {
    private int id;
    private double data;
    private Link next;

    public Link(int id, double data) {
        this.id = id;
        this.data = data;
    }

    public void showLink(){
        System.out.print(id + " " + data+" ");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }
}
