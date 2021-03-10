package lesson_b.task_1;

public class LinkList {

    private Link first;

    public LinkList() {
        this.first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }





    public void showList(){
        System.out.print("List (first --> last): ");
        Link current = first;
        while(current != null){
            current.showLink();
            current = current.getNext();
        }
        System.out.println("");
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

}
