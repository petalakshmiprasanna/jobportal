 import java.util.*;
 public class jobprovider {
   public void addjob(ArrayList<job> jobs,Scanner sc){  //.........
    System.out.println("enter job id");
    int id=sc.nextInt();
    sc.nextLine();
    System.out.println("enter job role");
    String role=sc.nextLine();
    System.out.println("enter salary in lpa");
    int salary=sc.nextInt();
    System.out.println("enter job skill");
    String skill=sc.nextLine();
    System.out.println("enter company");
    String company=sc.nextLine();
    System.out.println("enter year");
    int year = sc.nextInt();
    jobs.add(new job(id, role, salary, skill, company, year));
    System.out.println("job added successfully");
   }
    public void viewjobs(ArrayList<job> jobs){
        if(jobs.isEmpty()){
            System.out.println("no jobs");

        }
        for(job j:jobs){
            System.out.println(j);
        }
    }
    public void viewjobs(ArrayList<)


   }
    

    

