import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        ArrayList<job> jobs=new ArrayList<>();
        ArrayList<applicantdetails> applications = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        jobprovider jobprovider=new jobprovider();
        applicant applicant=new applicant();
        while(true){
            System.out.println("welcome to job portal");
            System.out.println("Enter an option");
            System.out.println("1==> jo bprovider");
            System.out.println("2==>job seeker");
            System.out.println("3==> Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    int option;
                    do{
                        System.out.println("enter an  option");
                        System.out.println("1==>add job");
                        System.out.println("2==>view job");
                        System.out.println("3==>applications");
                        System.out.println("4==>back");
                        option=sc.nextInt();
                         switch(option){
                            case 1:
                                jobprovider.addjob(jobs, sc);
                                break;
                            case 2:
                                jobprovider.viewjobs(jobs);
                                break;
                            case 3:
                                jobprovider.viewapplicants(applications);
                                break;
                            case 4:
                                break;
                             default:
                                System.out.println("enter valid option");   
                                break;

                         }

                    }
                    while(option!=4);
                    break;
                case 2:
                    do{
                        System.out.println("1==>view jobs");
                        System.out.println("2==>filter by year");
                        System.out.println("3==>apply job");
                        System.out.println("4==back");
                        option=sc.nextInt();
                         switch(option){
                            case 1:
                                jobprovider.viewjobs(jobs);

                                break;
                            case 2:
                                applicant.filterbyyear(jobs,sc);    
                                break;
                            case 3:    
                                applicant.seekerapplications(applications,sc);
                                break;
                            case 4:
                                break;
                             default:
                                System.out.println("enter valid option");   
                                break;
                            }    
                         }
                    while (option!=4);
                    break;     
                    

                case 3:
                    System.out.println("Thank you");
                    return;
                default:
                    System.err.println("enter valid option");
                        
                }        
            }
                    

        }

    }
    

        