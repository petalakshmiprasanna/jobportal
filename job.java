public class job {
    private int id;
    private String role;
    private int salary;
    private String skill;
    private String company;
    private int year;
    public  job(int id, String role, int salary, String skill,String company,int year){
        this.id=id;
        this.role=role;
        this.salary=salary;
        this.skill=skill;
        this.company=company;
        this.year=year;
    }
    public void viewjob(){
        System.out.println("job id is"+this.id);
        System.out.println("job role is"+this.role);
        System.out.println("job salary(lpa)"+this.salary);
        System.out.println("skill required is"+this.skill);
        System.out.println("company is"+this.company);
        System.out.println("year is"+this.year);
    }
        
    }

    

