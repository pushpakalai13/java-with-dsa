import java.util.*;
class employee{
    int id;
    String name;
    String designation;
employee(int id,String name,String designation){
    this.id=id;
    this.name=name;
    this.designation=designation;
}
void display(){
    System.out.println(id+""+name+""+designation);
}
}
class arrlistconstruct {
    public static void main(String[] args) {
        ArrayList <employee>list=new ArrayList<>();
        list.add(new employee(101," pushpa"," designer"));
        list.add(new employee(102," kaviya"," it"));
        list.add(new employee(103," sri"," webtec"));
    for(employee e:list){
        e.display();
    }
}
}
    