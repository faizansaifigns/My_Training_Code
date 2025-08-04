
import java.util.Arrays;

class person{
    String name;
    int age;
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return name+" ("+age +")";
}
}

public class override {
    public static void main(String[] args) {
        person[] people={new person("faizan", 22),
    new person("ankit",23),
new person("gaurav",21)};
Arrays.sort(people,(a,b)->a.age-b.age);
System.out.println(Arrays.toString(people));
Arrays.sort(people,(a,b)->a.name.compareTo(b.name));
System.out.println(Arrays.toString(people));
    
}
}
