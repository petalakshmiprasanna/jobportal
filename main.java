import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        ArrayList jobs=new ArrayList<>();
        ArrayList applications = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
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
                                System.out.println("job id");
                                System.out.println("job role");
                                System.out.println("salary in lpa");
                                System.out.println("skills");
                                break;
                             default:
                                System.out.println("enter valid option");   
                                break;

                         }

                    }
                    while(option!=4);
                System.out.println("job provider");
                case 2:
                    do{
                        System.out.println("1==>view jobs");
                        System.out.println("2==>filter by year");
                        System.out.println("3==>apply job");
                        System.out.println("4==back");
                        option=sc.nextInt();
                         switch(option){
                            case 1:
                                System.out.println("all jobs");
                                break;
                            case 2:
                                System.out.println("filter by year");    
                                break;
                            case 3:    
                                System.out.println("'apply jobs");
                                break;
                             default:
                                System.out.println("enter valid option");   
                                break;
                            }    
                         }
                    while (option!=4);
                         
                    

                case 3:
                    System.out.println("Thank you");
                    break;
                default:
                    System.err.println("enter valid option");
                    break;    
                }        
            }
                    

        }

    }
    

        