public class Student {
    private String name;
    private long prn;

    public Student(String name, long prn) {
        setName(name);
        setPRN(prn);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPRN(long prn){
        this.prn = prn;
    }

    public long getPRN() {
        return prn;
    }
    
    public void display() {
        System.out.println("Name: " + name + ", PRN: " + prn);
    }
}



