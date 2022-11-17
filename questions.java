package test;
import java.util.scanner;

public class question {
                        String prompt;
                        String answer;

                        public question(String prompt, String answer){
                                                                        this.prompt = prompt;
                                                                        this.answer = answer;

                                                                      }

                        }
    public class test extends question{ 
    
    public static void main(String[]args){
        String q1 = "What is the Output of Math.floor(3.6)? \n"
        + "\n"
        + "(a). 3\n"
        + "(b). 3.6\n"
        + "(c). 6\n"
        + "(d). 4\n"
        String q2 = "\n Identify the return type of a method that does not return any value.\n"
        + "\n"
        + "(a). main\n"
        + "(b). invalid\n"
        + "(c). default\n"
        + "(d). void \n"
        String q3 = "What is OOp in Full? \n"
        + "\n"
        + "(a). Object-Oriented Programming\n"
        + "(b). Overall-Object Package\n"
        + "(c). Object-Over Program\n"
        + "(d). Object Orient Procedure\n"
        
    Questions [] questions = {
        new Questions(q1,a)
        new Questions(q2,d)
        new Questions(q3,a)
                            };
 takeStudentTest(questions);
                                        }
    public static void takeStudentTest(Questions[]questions){
            Scanner scan = new Scanner(System.in)
            System.out.println("Please enter your name:");
            String name = scan.nextLine();
            System.out.println("Please enter your Registration number:");
            String reg = scan.nextLine();
            System.out.println("Please enter your year of study:");
            int year = scan.nextInt();
            System.out.println("Please enter your Program");
            String prog = scan.nextLine();
            System.out.println("Would you like to continue with the test? (Type y for Yes and n for no)");
            String option = scan.nextLine();
         if (option.equals("n")){
                        System.out.println("\n Thanks for your time. \n");
                                 }
        elseif (option.equals("y")){
                                     int score = 0;
        for(i = 0; i<questions.length;i++){
                                            Scanner scan2 = new Scannner(System.in);
                                            System.out.println(questions[i].prompt);
                                            String ans = scan2.nextLine(); 
        if(ans.equals(questions[i].answer))
                                        {System.out.println("Dear " + name + ", You got " + score + "/" + questions.length);
                                         System.out.println("\n You've been promoted to the next level")
                                        } else {
                                System.out.println("\n Advised to retake the OOP Course unit next semester")

                                              }          


                                        }

                                    }
                                                             }

                     }