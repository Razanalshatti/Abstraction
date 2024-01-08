public class Teacher extends Person {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    void describeRole(){
        System.out.println(getName() + " Teachs " + getSubject());
    }

    

}
   