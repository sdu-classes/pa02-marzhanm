public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student (String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee; 
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return String.format("Student[%s], program=%s, year=%f, fee=%f", super.toString(), this.program, this.year,  this.fee);
    }
}
