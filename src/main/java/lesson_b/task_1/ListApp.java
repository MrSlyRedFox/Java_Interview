package lesson_b.task_1;

public class ListApp {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(1,33);
        linkList.insertFirst(3,56);
        linkList.insertFirst(22,1);
        linkList.insertFirst(100,77);
        linkList.insertFirst(2,99);

        linkList.showList();

        while(!linkList.isEmpty()){
            Link link = linkList.deleteFirst();
            System.out.print("delete ");
            link.showLink();
            System.out.println("");
        }
        linkList.showList();
    }
}
