import java.util.*;

public  class applicant {
     public void seekerapplications(ArrayList<applicantdetails>applications,Scanner sc){
        sc.nextLine();
        System.out.println("enter name ");
        String name=sc.nextLine();
        System.out.println("enter your phone number");
        long phno=sc.nextLong();
        sc.nextLine();
        System.out.println("enter email ");
        String email=sc.nextLine();
        System.out.println("enter passed out year");
        int passedout=sc.nextInt();
        System.out.println("enter cgpa");
        double  cgpa=sc.nextDouble();
        System.out.println("enter job id ");
        int jobid=sc.nextInt();

        applications.add(new applicantdetails(name, phno, email, passedout, cgpa, jobid));
        System.out.println("job applied succesfully");
        System.out.println("................................");

     /*    if(matchid(jobs,jobid)){
           applications.add(new applicantdetails(name, phno, email, passedout, cgpa, jobid));
           System.out.println("job applied successfully");
         }
         else{
                System.out.println("job id doesn't match please check again");
         }
        //applications.add(new applicantdetails(name, phno, email, passedout, cgpa, jobid)); */
      
}
/*public boolean matchid(ArrayList<job> jobs,int jobid){
     for(job j:jobs){
        if(jobid==j.getid()){
            return true;
         }
        }
    return false;
}*/
public void filterbyyear(ArrayList<job> jobs, Scanner sc) {
    System.out.println("Enter year to filter jobs");
    int year = sc.nextInt();
    boolean found = false;
    for(job j : jobs) {
        if(year==j.getyear()) {
            j.viewjob();
            found = true;
        }
    }
    if(found==false) {
        System.out.println("No jobs available for this year");
    }
}
}
