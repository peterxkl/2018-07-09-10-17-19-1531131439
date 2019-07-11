package practice07;

public class Teacher extends Person{
    private Klass klass;
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        if(this.klass==null){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        return super.introduce()+" I am a Teacher. I teach Class "+getKlass().getNumber()+".";
    }

    public String introduceWith(Student student){
        int teacherClass=getKlass().getNumber();
        int studentClass=student.getKlass().getNumber();
        if(teacherClass==studentClass){
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }
        return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
    }
}
