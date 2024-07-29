package net.media.training.live.srp;


public class Employee {
    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;
    private Address address;
    private int leavesTaken;
    private int totalLeaveAllowed;
    private int leaveTaken;
    private String manager;
    private int yearsInOrg;
    private int thisYeard;
    private int[] leavesLeftPreviously;


    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.address = address;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public Employee() {
    }

    public void setEmployeeId(int empId) {
        this.empId = empId;
    }

    public int getEmployeeId() {
        return this.empId;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public void setEmployeeName(String name) {
        this.name = name;
    }

    public String getEmployeeName() {
        return this.name;
    }

    public void setAddress(Address address) { this.address = address; }

    public Address getAddress() { return this.address; }

    public void takeLeave() { this.leavesTaken +=1; }

    public int getLeavesTaken() { return this.leavesTaken; }

    public int getTotalLeaveAllowed() { return TOTAL_LEAVES_ALLOWED; }

    public void setManager(String manager) { this.manager = manager; }

    public String getManager() { return this.manager; }
}
