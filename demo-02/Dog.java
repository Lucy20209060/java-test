public class Dog{
    int dogAge;
    String dogName;

    public Dog(){
        
    }

    public Dog(String name){
        // 构造器中使用this访问变量和方法，方法中则直接使用
        this.setName(name);
    }
    
    public void setAge(int age) {
        dogAge = age;
        System.out.println("小狗的年龄设置为 : " + age );
    }

    public int getAge(){
        return dogAge;
    }

    public void setName(String name) {
        dogName = name;
        System.out.println("小狗的名字设置为 : " + dogName );
    }

    public String getName() {
        return dogName;
    }
    
    public static void main(String[] args){
        // 下面的语句将创建一个Puppy对象
        Dog myDog = new Dog("tommy");
        myDog.setAge(2);

        String name = myDog.getName();
        int age = myDog.getAge();

        System.out.println("小狗的名字：" + name);
        System.out.println("小狗的年龄：" + age);
    }
}