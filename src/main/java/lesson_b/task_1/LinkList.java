package lesson_b.task_1;

public class LinkList {

    private Link first;

    public LinkList() {
        this.first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int id, double data){
        Link newLink = new Link(id,data);
        newLink.setNext(first);
        first = newLink;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.getNext();
        return temp;
    }

    public Link find(int key){
        Link current = first;
        while(current.getId() != key){
            if(current.getNext() == null){
                return null;
            }
            else current = current.getNext();
        }
        return current;
    }

    public Link delete(int key){
        Link current = first;
        Link previous = first;
        while(current.getId() != key){
            if(current.getNext() == null)
                return null;
            else {
                previous = current;
                current = current.getNext();
            }
        }
        if(current == first)
            first = first.getNext();
        else
            previous.setNext(current.getNext());
        return current;
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
