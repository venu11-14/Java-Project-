import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.LocalTime;
import java.time.LocalDateTime;  
//import java.time.format.DateTimeFormatter;
class Login
{
	static Scanner scr = new Scanner(System.in);
	static String user_name = "user_123";
	static String user_password = "User@256";
	static int count_user = 3, count_pass=3, user_count = 3, userpsw_count = 3,mob_count = 3,mail_count=3, newmob_count=3,reg_countm=3, checkOTPcount=3, reg_count=3,motp=3, countnewpas=3;
	static String username,agin_password,agin_username,password,email,new_password,fullName="CVCORP", fd;
	static long mob_number = 9121747312L,m=0L;
	static double wlAmt = 0.0000;
	static boolean feeed_back = true;
	// Reset
    public static final String RESET = "\033[0m";  // Text Reset
	// Blink
    public static final String blink = "\u001b[5m";

    // Regular Colors   
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE

	public void login_main()
	{
		System.out.println("\t\t\t\t\u001b[32;1m**********Welcom to the Sign-In and Sign-Up Page!********** \u001b[00;1m");
		System.out.println("\t\t\t\t1.Sign In                 2.Sign Up             3.Forgot Password");
		System.out.print("\t\t\t\t\u001B[35mChoose an option: \u001B[0m");
		int option = scr.nextInt();
		if(option==1)
		{
			setdata();
		}
		else if(option==2)
		{
			wel_sinUp();
		}
		else if(option==3)
		{
			forgot();
		}
		else
		{
			System.out.println("\t\t\t\t\u001B[41mInvalid Input please select between 1 to 2 \u001B[0m");
			login_main();
		}
	}
	public void setdata()
	{
		System.out.print("\t\t\t\t\u001B[33mEnter a user name >>> \u001B[0m");
		username = scr.next();
		System.out.print("\t\t\t\t\u001B[33mEnter a password >>> \u001B[0m");
		password = scr.next();
        singIn();
	}

	public void agin_password()
	{
		System.out.print("\t\t\t\t\u001B[33m Enter a again password: \u001B[0m");
		agin_password = scr.next();
		password = agin_password;
        singIn();
	}
	public void agin_userName()
	{
		System.out.print("\t\t\t\t\u001B[33m Enter a again username: \u001B[0m");
		agin_username = scr.next();
		username = agin_username;
		singIn();
	}
	public void newpassword()
	{
		System.out.print("\t\t\t\t\u001B[33mEnter a New Password: \u001B[0m");
	    String new_password = scr.next();
		if(isvalidpassword(new_password))
		{
              user_password = new_password;
              setdata();
		}
		else
		{
			while(true)
			{
				System.out.println("\t\t\t\t\u001B[41m Sorry your enter not valid password \u001B[0m");
				System.out.println(YELLOW_BOLD+blink+"\t\t\t\tMaximum Number of Attempts "+countnewpas+" Onely"+RESET);
				if(countnewpas>=1)
				{
					countnewpas-=1;
				    newpassword();
					break;
				}
				else
				{
					System.out.println(RED_BOLD+"\t\t\t\tCompleted Maximum Number of Attempts Completed Try....Agian"+RESET);
					System.exit(0);
				}
			}
		}
	}
	public static String generateOTP() 
    {
        int randomPin = (int) (Math.random() * 9000) + 1000;
        return String.valueOf(randomPin);
    }
	public boolean validmobile(String mob_number)
    {
        if(mob_number.length()==10)
        {
            if(mob_number.startsWith("9") || mob_number.startsWith("8") || mob_number.startsWith("7") || mob_number.startsWith("6"))
            {
                return true;
            }
            else
			{
              return false;
			}
        }
        else
           return false;
    }
	void forgot()
	{
		System.out.print("\t\t\t\t\u001B[33mEnter a Register Mobile number:"+RESET);
		m = scr.nextLong();
		String numberString = (String) Long.toString(m);
        if(validmobile(numberString))
		{
			mob_count =  3;
			if(m == mob_number)
			{
				reg_count = 3;
				String str = generateOTP();
				int a = Integer.parseInt(str);
				System.out.println("\t\t\t\t4 Digite OTP is Successfully Genarated");
				System.out.println("\t\t\t\tGenerated OTP: "+a);
				System.out.print("\t\t\t\t\u001B[33mEnter a OTP:"+RESET);
				int otp = scr.nextInt(); 
				if(otp==a)
				{
					newpassword();
				}
				else
				{
					System.out.println(RED_BOLD+"\t\t\t\tSorry!Your Enter a Wrong OTP:"+RESET);
					System.out.println(YELLOW_BOLD+blink+"\t\t\t\tMaximum Number of Attempts "+motp+" Onely"+RESET);
					if(motp>=1)
					{
						motp-=1;
					    forgot();	
					}
					else
					{
						System.out.println(RED_BOLD+"\t\t\t\tCompleted Maximum number of Attempts....TryAgian...."+RESET);
						System.exit(0);
					}
				}
			}
			else
			{
				System.out.println(RED_BOLD+"\t\t\t\tMobile Number Not Register This Account"+RESET);
				System.out.println(YELLOW_BOLD+blink+"\t\t\t\tMaximum Number of Attempts "+reg_count+" Onely"+RESET);
				if(reg_count>=1)
				{
					reg_count-=1;
				    forgot();	
				}
				else
				{
					reg_count = 3;
					System.out.println(RED_BOLD+"\t\t\t\tCompleted Maximum number of Attempts....TryAgian...."+RESET);
					System.exit(0);
				}
			}
		}
		else
		{
			System.out.println("\t\t\t\t\u001B[33mEnter a Valid Mobile Number:"+RESET);
			System.out.println(YELLOW_BOLD+blink+"\t\t\t\tMaximum Number of Attempts "+mob_count+" Onely"+RESET);
			if(mob_count>=1)
			{
				mob_count-=1;
			    forgot();
			}
			else
			{
				System.out.println(RED_BOLD+"\t\t\t\tCompleted Maximum number of Attempts....TryAgian...."+RESET);
				System.exit(0);
			}
		}
	}
	void clearConsole()
    {
        try 
		{
            if (System.getProperty("os.name").toLowerCase().contains("win")) 
	         {
				Thread.sleep(2000);
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				//Location locobj = new Location();
				//locobj.loc();
				pf();
             } 
	         else
	         {
                // For Unix-based systems
                System.out.print("\033[H\033[2J");
                System.out.flush();
             }
		} 
		catch (Exception e) 
		{
			 e.printStackTrace();
		}
	}
	void agianmobilenum()
	{
		System.out.print("\t\t\t\t\u001B[33mEnter a Again Mobile number:"+RESET);
		m = scr.nextLong();
		String numberString = (String) Long.toString(m);
        if(validmobile(numberString))
		{
			mob_count =  3;
			if(m == mob_number)
			{
				reg_count = 3;
				String str = generateOTP();
				int a = Integer.parseInt(str);
				System.out.println("\t\t\t\t4 Digits OTP is Successfully Generated");
				System.out.println("\t\t\t\tGenerated OTP: "+a);
				System.out.print("\u001B[33m\t\t\t\tEnter a OTP:"+RESET);
				int otp = scr.nextInt(); 
				if(otp==a)
				{
					motp = 3;
					count_pass = -1;
					newpassword();
				}
				else
				{
					System.out.println(RED_BOLD+"\t\t\t\tSorry!Your Enter a Wrong OTP:"+RESET);
					System.out.println(YELLOW_BOLD+blink+"\t\t\t\tMaximum Number of Attempts "+motp+" Only"+RESET);
					if(motp>=1)
					{
						motp-=1;
					    agianmobilenum();	
					}
					else
					{
						System.out.println(RED_BOLD+"\t\t\t\tCompleted Maximum number of Attempts...TryAgain..."+RESET);
						System.exit(0);
					}
				}
			}
			else
			{
				System.out.println(RED_BOLD+"\t\t\t\tMobile Number Not Register This Account"+RESET);
				System.out.println(YELLOW_BOLD+blink+"\t\t\t\tMaximum Number of Attempts "+reg_count+" Only"+RESET);
				if(reg_count>=1)
				{
					reg_count-=1;
				    agianmobilenum();	
				}
				else
				{
					System.out.println(RED_BOLD+"\t\t\t\tCompleted Maximum number of Attempts...TryAgain..."+RESET);
					System.exit(0);
				}
			}
		}
		else
		{
			System.out.println("\t\t\t\t\u001B[33mInvalid Mobile Number"+RESET);
			System.out.println(YELLOW_BOLD+blink+"\t\t\t\tMaximum Number of Attempts "+mob_count+" Only"+RESET);
			if(mob_count>=1)
			{
				mob_count-=1;
			    agianmobilenum();
			}
			else
			{
				System.out.println(RED_BOLD+"\t\t\t\tCompleted Maximum number of Attempts...TryAgain..."+RESET);
				System.exit(0);
			}
		}
	}
	public void singIn()
	{
        if(username.equals(user_name))
		{
			if(password.equals(user_password))
			{
				System.out.println("\t\t\t\t\u001b[32;1m Sign-in successful! welcome \u001B[0m"+fullName);
				//Login.clearconsolesource();
				clearConsole();
				//Location locobj = new Location();
				//locobj.loc();
				
			}
			else
			{
				System.out.println(YELLOW_BOLD+blink+"\t\t\t\tMaximum number of attempts "+count_pass+" only"+RESET);
				if(count_pass>=1)
				{
					count_pass-=1;
					System.out.println("\t\t\t\t\u001B[41mPlz Enter Valid Password!\u001B[0m");
					agin_password();
				}
				else
				{
					if(count_pass>=0)
					{

						System.out.printf("\t\t\t\t+----------------------------------+\n");
		                System.out.printf("\t\t\t\t|\u001b[32;1m%10s   |\n"," ****Forget Your Password?*****\u001B[0m");
						System.out.printf("\t\t\t\t+----------------------------------+\n");
						System.out.printf("\t\t\t\t|%3s                            |\n"," 1.Yes");
						System.out.printf("\t\t\t\t|%3s                            |\n"," 2.No ");
						System.out.printf("\t\t\t\t+----------------------------------+\n");
						System.out.printf("\t\t\t\t|\033[1;31m%10s|\n","Note: Enter 2 Close Application!!!\u001B[0m");
						System.out.printf("\t\t\t\t+----------------------------------+\n");
						System.out.print("\t\t\t\t\u001B[35m Select Your Option:\u001B[0m");
						int n2 = scr.nextInt();
					
					if(n2==1)
					{
						System.out.print("\u001B[33m\t\t\t\tEnter a Mobile number:"+RESET);
						m = scr.nextLong();
		                String numberString = (String) Long.toString(m);
		                if(validmobile(numberString))
						{
							if(m==mob_number)
							{
								String str = generateOTP();
								int a = Integer.parseInt(str);
								System.out.println("\t\t\t\t4 Digits OTP is Successfully Genarated");
								System.out.println("\t\t\t\tGenerated OTP: "+a);
								System.out.print("\u001B[33m\t\t\t\tEnter a OTP:"+RESET);
								int otp = scr.nextInt(); 
								if(otp==a)
								{
									count_pass = -1;
									newpassword();
								}
								else
								{
									System.out.println(RED_BOLD+"\t\t\t\tSorry!Your Enter a Wrong OTP"+RESET);
									agianmobilenum();
								}
							}
							else
							{
								 System.out.println(RED_BOLD+"\t\t\t\tSorry!Mobile Number Not Register This Account"+RESET);
							     agianmobilenum();  
							}
						}
						else
						{
							System.out.println(RED_BOLD+"\t\t\t\tEnter a valid mobile number"+RESET);
							agianmobilenum();
						}
		                
					}
					else if(n2==2)
					{
						System.out.println("\t\t\t\t\u001B[41mExit..........\u001B[0m");
						System.exit(0);
					}
					else
					{
						singIn();
					}
				}
				else
				{
					   System.out.println(RED_BOLD+"\t\t\t\tCompleted Maximum Number of Attempts...TryAgain.."+RESET);
					   System.exit(0);
				}
			}
		  }
		}
		else
		{
			System.out.println(YELLOW_BOLD+blink+"\t\t\t\tMaximum number of attempts "+count_user+" only\n"+RESET);
			count_user-=1;
			if(count_user>=0)
			{
				System.out.println("\t\t\t\t\u001B[41m Plz Enter Valid UserName!\u001B[0m");
				agin_userName();
			}
			else
			{
				count_user = 0;
				System.out.printf("\t\t\t\t+-------------------------------------------------------+\n");
				System.out.printf("\t\t\t\t|\u001b[32;1m%10s   |\n"," ****User name is not found! Plz sign-up first!*****\u001B[0m");
				System.out.printf("\t\t\t\t+-------------------------------------------------------+\n");
				System.out.printf("\t\t\t\t|%3s                                                 |\n"," 1.Yes");
				System.out.printf("\t\t\t\t|%3s                                                 |\n"," 2.No ");
				System.out.printf("\t\t\t\t+-------------------------------------------------------+\n");
				System.out.printf("\t\t\t\t| \033[1;31m%10s                    |\n","Note: Enter 2 Close Application!!!\u001B[0m");
				System.out.printf("\t\t\t\t+-------------------------------------------------------+\n");
				System.out.print("\t\t\t\t\u001B[33m Select Your Option:\u001B[0m");
				int n1 = scr.nextInt();
				if(n1==1)
				{
					wel_sinUp();
				}
				else if(n1==2)
				{
					System.out.println("\t\t\t\t\u001B[41mApplication is closed try agian!!!\u001B[0m");
				}
				else
				{
					System.out.println("\t\t\t\t\u001B[41mInvalid Input please select between 1 or 2 \u001B[0m");
					login_main();
				}
			}
		}
	}
	/*
	  * Validate the password based on defined rules.
	  * Rules:
	  * Must contain 8 t 10 char...
	  * At least one Lower case
	  * At least one Upper Case
	  * At least one Digit
	  * At least one Special char ("!@#$%^&*()_+")
	*/
	//check the valid password or not
	public static boolean isvalidpassword(String password)
    {
		//check the length of passsword
        if(password.length() >=8 && password.length() <= 10 )
        {
            boolean is_Lower = false;
            boolean is_Upper = false;
            boolean is_Digit = false;
            boolean is_Special = false;
            for(int i=password.length()-1; i>=0; i--)
            {
			//check the lower case
            char ch = password.charAt(i);
            if (Character.isLowerCase(ch)) 
            {
                is_Lower = true;
            } 
			//check the uppercase
            else if (Character.isUpperCase(ch)) 
            {
                is_Upper = true;
            } 
			//check the isDigit
            else if (Character.isDigit(ch))
            {
                is_Digit = true;
            } 
			//check the Spicial char..
            else if ("!@#$%^&*()_+".contains(String.valueOf(ch))) 
            {
                is_Special = true;
            }
            }
            return is_Lower && is_Upper && is_Digit && is_Special;
        }
        else
        {
            return false;
        }
    } 
    /*
     * Validate the username based on defined rules.
     * Rules:
     * - Length must be between 3 and 15 characters
     * - Allowed characters: letters (a-z, A-Z), digits (0-9), and underscores (_)
	 * - No spaces or other special characters
     */
    public static boolean isValidUsername(String username)
	{
        // Check if the username is null or empty
        if (username == null || username.isEmpty())
		{
            return false;
        }
        // Check length
        if (username.length() < 3 || username.length() > 15) 
		{
            return false;
        }
        // Check each character
        for (char c : username.toCharArray()) 
		{
            if (!Character.isLetterOrDigit(c) && c != '_') 
			{
                return false;
            }
        }
        return true;
    }
	public static  boolean valid_Gmail(String email)
    {
        String domain = "@gmail.com";
        if(email.endsWith(domain))
        {
           return true;
        }
		else
		{
		   return false;
		}
    }
	public void wel_sinUp()
	{
		System.out.println("\t\t\t\t\u001b[32;1m*************Welcom to signUp Page*****************\u001b[00;1m");
		System.out.println("\t\t\t\t*************CREATE A NEW ACCOUNT****************");
		signUp();
	}
	void usermobilenum()
	{
		System.out.print("\t\t\t\t\u001B[35mEnter Your Mobile Number: \u001B[0m");
		long mobi_num = scr.nextLong();
        mob_number = mobi_num;
		String numberString = (String) Long.toString(mob_number);
		if(validmobile(numberString))
		{
			mob_count = 3;
			checkOTP();
		}
		else
		{
			System.out.println(YELLOW_BOLD+blink+"\t\t\t\tMaximum number of attempts "+mob_count+" only"+RESET);
			mob_count-=1;
			if(mob_count>=0)
			{
			   System.out.println("\t\t\t\t\033[1;31mEnter a Valid Mobile Number:\033[0m");
			   usermobilenum();
			}
			else
			{
				System.out.println("\t\t\t\tExit.........");
				System.exit(0);
			}
		}
	}
	void rest()
	{
		System.out.print("\t\t\t\t\u001B[33mEnter a Your Register Mobile Number:"+RESET);
		m = scr.nextLong();
		if(m==mob_number)
		{
			System.out.println(PURPLE+"\t\t\t\tSet User UserName & PassWord"+RESET);
			user_name();
		}
		else
		{
			if(reg_countm>=1)
			{
				System.out.println(YELLOW_BOLD+blink+"\t\t\t\tMaximum numbmber of Attempts "+reg_countm+" Only"+RESET);
				reg_countm-=1;
				rest();
			}
			else
			{
				System.out.println(RED_BOLD+"\t\t\t\tMaximum numbmber of Attempts Completed.....Try Again...."+RESET);
				System.exit(0);
			}
		}
	}
	void checkOTP()
	{
			String str = generateOTP();
			int a = Integer.parseInt(str);
			System.out.println(GREEN+"\t\t\t\t4Digits OTP is Successfully Genarated"+RESET);
			System.out.println("\t\t\t\tGenerated OTP: "+a);
			System.out.print("\t\t\t\t\u001B[35mEnter a OTP:\u001B[0m");
			int otp = scr.nextInt(); 
			if(otp==a)
			{
				System.out.print("\t\t\t\t\u001b[32;1mOTP Successful Enter\n\u001b[00;1m");
				System.out.print("\t\t\t\t\u001b[32;1mSuccessfuly Completed Rigester\n\u001b[00;1m");
				rest();
			}
			else
			{
				System.out.println("\t\t\t\t\033[1;31mSorry!Your Enter a Wrong OTP:\033[0m");
				System.out.println(YELLOW_BOLD+blink+"\t\t\t\tMaximum Number of Attempts "+checkOTPcount+" Only"+RESET);
			    if(checkOTPcount>=1)
			    {
					checkOTPcount-=1;
				    usermobilenum();
				}
				else
				{
					System.out.println("\t\t\t\t\033[1;31mMaximum Number of Attempts Completed...TryAgain..\033[0m");
					System.exit(0);
				}
			}
	}
	void new_password()
	{
		System.out.print("\t\t\t\t\u001B[35mCreate New Password:\u001B[0m");
		new_password = scr.next();
		if(isvalidpassword(new_password))
			{
		        createpassword();
			}
			else
			{
				System.out.println("\t\t\t\t\u001B[41mPlz Provided Valid Password!\u001B[00;1m");
				System.out.println(YELLOW_BOLD+blink+"\t\t\t\tMaximum number of attempts "+newmob_count+" only"+RESET);
				newmob_count-=1;
				if(userpsw_count>=0)
				{
					new_password();
				}
				else
				{
					System.out.println(RED_BOLD+"\t\t\t\tYou will have to wait for 30 minutes!! After Sign-Up"+RESET);
					System.exit(0);
				}
			} 
	}
	void createpassword()
	{
		
		System.out.print("\t\t\t\t\u001B[35mEnter a Confirm password:\u001B[0m");
		String confirm_password = scr.next();
		if(new_password.equals(confirm_password) && isvalidpassword(confirm_password))
		{
			user_password = confirm_password;
			System.out.println("\t\t\t\t\u001B[32;1mSignup successful! You can Sign-in.\u001B[00;1m");
			setdata();
		}
		else
		{
			System.out.println("\t\t\t\t\u001B[41mPlz Provided Valid Password!\u001B[00;1m");
			System.out.println(YELLOW_BOLD+blink+"\t\t\t\tMaximum number of attempts "+userpsw_count+" only"+RESET);
			userpsw_count-=1;
			if(userpsw_count>=0)
			{
                 createpassword();
			}
			else
			{
				System.exit(0);
			}
		}
	}
	void agianmail()
	{
		System.out.println(YELLOW_BOLD+blink+"\t\t\t\tMaximum number of attempts "+mail_count+" only"+RESET);
		System.out.print("\t\t\t\t\u001B[35mEnter a E-Mail Again:\u001B[0m");
		email = scr.next();
		if(valid_Gmail(email))
		{
			usermobilenum();
		}
		else
		{
			mail_count-=1;
			if(mail_count>=1)
			{
			   System.out.println("\t\t\t\t\033[1;31mEnter a valid mail:\033[0m");
			   agianmail();
			}
			else
			{
				System.out.println(RED_BOLD+"\t\t\t\tMaximum Number of Attamps Completed.....Try Agian...."+RESET);
				System.exit(0);
			}
		}
	}
	public void user_name()
	{
		System.out.print("\t\t\t\t\u001B[35mEnter a username:\u001B[0m");
		username = scr.next();
		if(isValidUsername(username))
		{
			user_name = username;
			new_password();
		}
		else
		{
			System.out.println("\t\t\t\t\u001B[41mPlz Provided valid username!\u001B[00m;1m");
			System.out.println(YELLOW_BOLD+blink+"\t\t\t\tMaximum number of attempts "+user_count+" only"+RESET);
			user_count-=1;
			if(user_count>=0)
			{
			    user_name();
			}
			else
			{
				System.out.println(RED_BOLD+"\t\t\t\tYou incorrectly enter username in 3 times, you will have to wait for 30 minutes!!! After Sign-Up"+RESET);
				System.exit(0);
			}
		}
	}
	public void signUp()
	{
		String a = scr.nextLine();
		//System.out.print(a);
		System.out.print("\t\t\t\t\u001B[35mEnter a Full Name:\u001B[0m");
		fullName = scr.nextLine();
		System.out.print("\n\t\t\t\t\u001B[35mEnter a E-Mail:\u001B[0m");
		email = scr.next();
		if(valid_Gmail(email))
		{
			usermobilenum();
		}
		else
		{
			System.out.println("\t\t\t\t\033[1;31mPlz Enter a Valid Mail\033[0m");
			agianmail();
		}
	}
	void profile()
	{
		Receipt objr = new Receipt();
		System.out.println("+---------------------------------------+");
		System.out.println("|"+RED+"\t\tMy Profile"+RESET+"\t\t|");
		System.out.println("+---------------------------------------+");
		System.out.println("|"+GREEN+" ======= Welcom "+fullName+" ======="+RESET+"\t|");
		System.out.println("|"+CYAN+"        #      #  \t\t\t|\n"
		                  +"|"+CYAN+"        @      @   "+RESET+YELLOW+fullName+RESET+"\t\t|\n"
						  +"|"+CYAN+"        @@@@@@@@   "+RESET+mob_number+"\t\t|\n"
						  +"|"+CYAN+"        @      @  \t\t\t|\n"
						  +"|        #      #  \t\t\t|"+RESET);
		System.out.println("|                                       |");
		System.out.println("+---------------------------------------+");
		System.out.println("|"+BLUE+" Wallent Balance:"+wlAmt+"       \t\t|"+RESET);
		System.out.println("+---------------------------------------+");
		System.out.println("| 1 -> \033[1;36mBook Hotel"+RESET+"\t\t\t|");
		System.out.println("| 2 -> \033[1;36mFood Order"+RESET+"\t\t\t|");
		System.out.println("| 3 -> \033[1;36mMy Bookings(Cart)"+RESET+"\t\t|");
		System.out.println("| 4 -> \033[1;36mCancel Reservation"+RESET+"\t\t|");
		System.out.println("| 5 -> \033[1;36mGo To Payment  "+RESET+"\t\t\t|");   // 7 no connection
		System.out.println("| 6 -> \033[1;36mMake a FeedBack"+RESET+"\t\t\t|");
		System.out.println("| 7 -> \033[1;36mCustomer Support"+RESET+"\t\t\t|");
	    System.out.println("| 8 -> \033[1;36mChange Password"+RESET+"\t\t\t|");
		System.out.println("| 9 -> \033[1;36mFacilities and Service"+RESET+"\t\t|");
		System.out.println("| 10 -> \033[1;36mGo to Wallent  "+RESET+"\t\t\t|");
		System.out.println("| 11 -> \033[1;36mAbout         "+RESET+"\t\t\t|");
		System.out.println("| 12 -> "+RED+"Exit"+RESET+"\t\t\t\t|");
		System.out.println("| 13 ->"+RED+" Sign Out"+RESET+"\t\t\t|");
		System.out.println("+---------------------------------------+");
		System.out.println("|"+CYAN_BOLD+" Why You Choose?"+RESET+ "\t\t\t|");
		System.out.println("|"+YELLOW+" Easy Book      Easy to find"+RESET+"\t\t|");
		System.out.println("|"+YELLOW+" Fast Booking   Affordable Price"+RESET+"\t|");
		System.out.println("+---------------------------------------+");
		System.out.println("|  Version 2024.08.26.2000      \t|");
		System.out.println("|  MyBookings.com               \t|");
		System.out.println("|  Design By *******            \t|");
		System.out.println("+---------------------------------------+");
		System.out.print("\u001B[33mSelect Your Option: "+RESET);
		int option = scr.nextInt();
		switch(option)
		{
			case 1:
				clearConsoleP1(2);
				break;
			case 2:
				 clearConsoleP1(8);
			     break;
			case 3:
				clearConsoleP1(4);
				break;
			case 4:
				Hotel1 obj = new Hotel1();
				obj.cancelRommHotel1();
				break;
			case 5:
				 clearConsoleP1(6);
			     break;
			case 6:
				 feedback();
			     break;
			case 7:
				 System.out.println(BLUE+"***Customer Support***"+RESET);
			     System.out.println(GREEN+"0876-0987-123*"+RESET);
				 pf();
			     break;
			case 8:
				 clearConsoleP1(5);
			     break;
		    case 9:
				fs();
			    break;
			case 10:
				clearConsoleP1(7);
			    break;
			case 11:
				About();
			    break;
			case 12:
			     clearConsoleP1(3);
				 break;
		   case 13:
				cn1();
				break;
			default:
				System.out.println(RED+"Select Range b/w"+RESET);
			     profile();
		}
	}
	void pf()
	{
		System.out.println("Select Your Option");
		System.out.println("\033[1;36m1.Profile     2.Book Hotel     3.Food Order        4.Exit"+RESET);
		System.out.print("\u001B[33mChoose Option:"+RESET);
		int option = scr.nextInt();
		switch(option)
		{
			case 1:
				  clearConsoleP1(1);
			      break;
			case 2:
				clearConsoleP1(2);
				break;
			case 3:
				  clearConsoleP1(8);
			      break;
			case 4:
				System.out.println(RED+"Exit...."+RESET);
			    System.exit(0);
			    break;
			default:
				System.out.println(RED+"Select Your Option (1 or 2)"+RESET);
			    pf();
		}
	}
	void feedback()
	{
		if(feeed_back==true)
		{
			System.out.println(CYAN+"Write Your FeedBack"+RESET+RED+" (Click Enter) "+RESET);
			scr.nextLine();
			fd = scr.nextLine();
			System.out.println(GREEN+"Thank You For Your FeedBack (: "+RESET);
			feeed_back = false;
			pf();
		}
		else
		{
			System.out.println(RED+"  Your FeedBack is Recorded Already!!!"+RESET);
			System.out.println("Your Feed Back is: "+fd);
			pf();
		}
	}
	void cn1()
	{
		System.out.println(CYAN+"Do you want to SingOut"+RESET);
		System.out.println("\033[1;36m1.Yes          2.No"+RESET);
		System.out.print("\u001B[33mSelect Your Option:"+RESET);
		int option = scr.nextInt();
		switch(option)
		{
		case 1:
			clearConsoleP1(3);
		    break;
		case 2:
			clearConsoleP1(1);
		    break;
		default:
			System.out.println(RED+"Select Your Option (1 or 2)"+RESET);
		}
	}
	void clearConsoleP1(int n)
    {
        try 
		{
            if (System.getProperty("os.name").toLowerCase().contains("win")) 
	         {
				Thread.sleep(1800);
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				if (n==1)
				{
					profile();
				}
				else if(n==2)
				{
					Location locobj = new Location();
				    locobj.loc();
				}
				else if(n==3)
				{
					Logo logo = new Logo();
				    logo.finalExit(2);
				}
				else if(n==4)
				{
					Hotel1 cart = new Hotel1();
				    cart.displaycart1(3);
				}
				else if(n==5)
				{
					forgot();
				}
				else if(n==6)
				{
					Hotel1 cart = new Hotel1();
				    cart.cn4();
				}
				else if(n==7)
				{
					 wA();
				}
				else if(n==8)
				{
					 Foodie obj=new Foodie();
                     //System.out.println("\t\tSelect your current location");
                     obj.loc();
				}
             } 
	         else
	         {
                System.out.print("\033[H\033[2J");
                System.out.flush();
             }
		} 
		catch (Exception e) 
		{
			 e.printStackTrace();
		}
	}
	void wA()
	{
		System.out.println(GREEN+"********** My Wallet ************"+RESET);
		System.out.println(CYAN+"Wallet Balance is "+wlAmt+RESET);
		System.out.println("Select Your Option");
		System.out.println("1.Profile           2.Withdraw         3.Exit");
		System.out.print(YELLOW+"Enter a Your Option: "+RESET);
		int option = scr.nextInt();
		switch(option)
		{
		case 1:
			clearConsoleP1(1);
		    break;
		case 2:
			withdraw();
		    break;
		case 3:
			 System.out.println(GREEN+"Thank You!! Visit Agian (:"+RESET);
		     System.exit(0);
			 break;
		default:
			System.out.println(RED+"Select Your Option (1 or 2)"+RESET);
		    wA();
		}
	}
	void withdraw()
	{
		System.out.print(YELLOW+"Enter a Your Amout: "+RESET);
		double amt = scr.nextDouble();
		if(wlAmt>=amt)
		{
			wlAmt-=amt;
			System.out.println(GREEN+"Sucesfully Withdraw Your Amount:"+amt+RESET);
			 wA();
		}
		else
		{
			System.out.println(RED+"Insufficient Funds!"+RED);
			System.out.println(GREEN+"Try Agian!"+RESET);
			wA();
		}
	}
	void About()
	{
		System.out.println(CYAN+"\n                         *******************About MyBooking.com***************\n"+RESET);
		System.out.print(GREEN+"Part of Booking Holdings Inc.MyBooking.com’s mission is to make it easier for everyone to experience the world.\n"+RESET);
		System.out.println(GREEN+"For all questions about MyBooking.com, the Service (i.e. the online accommodation reservation service) and the Website or if you wish to\n"
		                   +"send or serve any documents, correspondence, notices or other communications in respect of MyBooking.com,\n" 
						   +"the Service, the Website, or for press enquiries, please contact Mybooking.com directly.\n"+RESET);

		pf();
	}
	void fs()
	{
		System.out.println("+----------------------------------------------+");
		System.out.println("|"+RED+"      Most popular facilities and Service     "+RESET+"|");
		System.out.println("+----------------------------------------------+");
		System.out.printf("|\033[0;33m %10s                    \033[0m|%n","Fast free WiFi (100 Mbps)");
		System.out.printf("|\033[0;33m %10s                                 \033[0m|%n","Family rooms");
		System.out.printf("|\033[0;33m %10s                                 \033[0m|%n","Parking     ");
		System.out.printf("|\033[0;33m %10s                           \033[0m|%n","24-hour front desk");
		System.out.printf("|\033[0;33m %10s                               \033[0m|%n","Fitness centre");
		System.out.printf("|\033[0;33m %10s                            \033[0m|%n","Non-smoking rooms");
		System.out.printf("|\033[0;33m %10s               \033[0m|%n","Facilities for disabled guests");
		System.out.printf("|\033[0;33m %10s                          \033[0m|%n","Very good breakfast");
		System.out.printf("|\033[0;33m %10s                           \033[0m|%n","Media & Technology");
		System.out.printf("|\033[0;33m %10s                           \033[0m|%n","Outdoors          ");
		System.out.printf("|\033[0;33m %10s                           \033[0m|%n","Cleaning services ");
		System.out.printf("|\033[0;33m %10s                        \033[0m|%n","Bed Room and Bathroom");
		System.out.printf("|\033[0;33m %10s                           \033[0m|%n","Miscellaneous     ");
		System.out.printf("|\033[0;33m %10s                           \033[0m|%n","Safety & security ");
		System.out.printf("|\033[0;33m %10s                           \033[0m|%n","Transport         "); 
		System.out.printf("+----------------------------------------------+\n");
		pf();
	}
}
class Location
{
	// Reset
    public static final String RESET = "\033[0m";  // Text Reset
    // Blink
    public static final String blink = "\u001b[5m";

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

	public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN

	static Scanner sc = new Scanner(System.in);
	//static Property_type objpro = new Property_type();
	static Login objlogin = new Login();
	static Hotel_Restrents objHotal = new Hotel_Restrents(); 
    void loc()
    {
		 System.out.println(PURPLE_BACKGROUND+"Reservation"+RESET);
		 System.out.println(GREEN_BOLD+"****Select Your Location For Hotel Booking****"+RESET);
		 System.out.println("\n"+BLUE_BOLD+"Select Your Location:"+RESET);
		 System.out.println(" 1.\033[1;36mHyderabad\033[0m");
         System.out.println(" 2.\033[1;36mChennai\033[0m");
         System.out.println(" 3.\033[1;36mBanglore\033[0m");
         System.out.println(" 4.\033[1;36mMumbai\033[0m");
         System.out.println(" 5.\033[1;36mKolkata\033[0m");
		 System.out.println(" 6."+RED+"Profile"+RESET);
		 //System.out.println(" \033[1;31m6.If You Want To Back?\033[0m");
		 System.out.print("\u001B[33mEnter your Choice:"+RESET);
         int a = sc.nextInt();
         if(a==1)
             objHotal.hyd();
         else if(a==2)
             objHotal.chy();
         else if(a==3)
             objHotal.bng();
         else if(a==4)
             objHotal.mub();
         else if(a==5)
              objHotal.kol();
		 else if(a==6)
			  objlogin.clearConsoleP1(1);
         else
         {
              System.out.println(" \033[1;31mInvalid Input please select between 1 to 5\033[0m");
              loc();
         }
    }
}
class Property_type extends Location
{
	// Reset
    public static final String RESET = "\033[0m";  // Text Reset
    // Blink
    public static final String blink = "\u001b[5m";

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

	static Property_type objpro = new Property_type();
	static Location objloc = new Location();
	static Hotel_Restrents objhotel_res = new Hotel_Restrents();
	void pry_type()
	{
		System.out.println("\n"+BLUE_BOLD+"Select your Property Type"+RESET);
		System.out.println(" 1.\033[1;36mHotels\033[0m");
		System.out.println(" 2.\033[1;36mApartments\033[0m");
		System.out.println(" 3.\033[1;36mResorts\033[0m");
		System.out.println(" 4.\033[1;36mHoliday Homes\033[0m");
		System.out.println(" 5.\033[1;36mGuest Homes\033[0m");
		System.out.println(" 6.\033[1;31mIf You Want To Back?\033[0m");
        System.out.print("\u001B[33mEnter your Choice:"+RESET);
		int b = sc.nextInt();
		switch(b)
		{
			case 1:
				ac_NonAc_Selection();
			    break;
			case 2:
				ac_NonAc_Selection();
			    break;
			case 3:
				ac_NonAc_Selection();
			    break;
			case 4:
				ac_NonAc_Selection();
			    break;
			case 5:
				ac_NonAc_Selection();
			    break;
			case 6:
                 objloc.loc();
			     break;
			default:
				System.out.print(" \033[1;31mInvalid choice! Please Select between\033[0m");
			    pry_type();
		}
	}
	void ac_NonAc_Selection()
	{
		System.out.println("\n"+BLUE_BOLD+"Select your option:"+RESET);
        System.out.println(" 1.\033[1;36mAC\033[0m");
        System.out.println(" 2.\033[1;36mNon-AC\033[0m");
		System.out.println(" 3.\033[1;31mIf You Want To Go Back?\033[0m");
		System.out.print("\u001B[33mEnter Your Choice:"+RESET);
        int choice = Location.sc.nextInt();
        if (choice == 1)
		{
            System.out.println(GREEN+" You selected AC.Thank You!"+RESET);
			objhotel_res.res_list();
		}
		else if (choice == 2)
		{
            System.out.println(GREEN+" Your selected Non-AC.Thank You!"+RESET);
			objhotel_res.res_list();
		}
		else if(choice==3)
		{
			Login logobj = new Login();
			pry_type();
		}
		else
		{
            System.out.println("\033[1;31mInvalid selection. Please choose 1 or 2.\033[0m");
			ac_NonAc_Selection();
		}
	}
}

class Hotel_Restrents 
{
	public static final String RESET = "\033[0m"; 
	 public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
	static Property_type objpro = new Property_type();
	static String res_names = "";
	static String str_1 = "";
	static String str_2 = "";
	static String str_3 = "";
	static String str_4 = "";
	static String str_5 = ""; 
	void res_names(String res_names)
	{
		this.res_names = res_names;
		agin_res();
	}
	void clearConsole1()
    {
        try 
		{
			// For Windows
            if (System.getProperty("os.name").toLowerCase().contains("win")) 
	         {
				Thread.sleep(2000);
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("\u001b[32;1m***---welcome"+res_names+"---****\u001b[00;1m");
				Hotel1 objres = new Hotel1();
			    objres.show();
				//Location locobj = new Location();
				//locobj.loc();
				//login_main();
             } 
	         else
	         {
                // For Unix-based systems
                System.out.print("\033[H\033[2J");
                System.out.flush();
             }
		} 
		catch (Exception e) 
		{
			 e.printStackTrace();
		}
	}
	void agin_res()
	{
		System.out.println("\n\033[1;31mIf You Want Go To Back?\033[0m");
		System.out.println(" 1.\033[1;36mYes\033[0m");
		System.out.println(" 2.\033[1;36mNo\033[0m");
		System.out.print("\u001B[33mSelect Your Option:"+RESET);
		int option = Location.sc.nextInt();
		switch(option)
		{
			case 1:
				res_list();
			    break;
			case 2:
				clearConsole1();
			    break;
			default:
				agin_res();
		}
	} 
	void res_list()
	{
		System.out.println(" \n"+BLUE_BOLD+"******---Select your Hotel---******"+RESET);
		System.out.println(" 1."+str_1);
		System.out.println(" 2."+str_2);
		System.out.println(" 3."+str_3);
		System.out.println(" 4."+str_4);
		System.out.println(" 5."+str_5);
		System.out.println(" 6. \033[1;31mIf You Want You Back?\033[0m");
		System.out.print("\u001B[33mEnter Your Option:"+RESET);
		int hotal_num = Location.sc.nextInt();
		switch (hotal_num)
		{
		   case 1:
			   res_names(str_1);
		       break;
		   case 2:
			   res_names(str_2);
		       break;
		   case 3:
			   res_names(str_3);
		       break;
		   case 4:
			   res_names(str_4);
		       break;
		   case 5:
			   res_names(str_5);
		       break;
		   case 6:
			   objpro.ac_NonAc_Selection();
		       break;
		   default:
			   System.out.println(" \033[1;31mPlz Select Your option 1 to 5:\033[0m");
		       res_list();
		}
	}
	void hyd()
	{
		 str_1 = " Super Townhouse (Lakdikapul.)      ";
		 str_2 = " Super Townhouse OAK (RaiDurg)      ";
		 str_3 = " Hotel Silver Clé                   ";
		 str_4 = " Hotel White Fields (HitechCity)    ";
		 str_5 = " The Golkonda Hotel                 ";
		 objpro.pry_type();
	}
    void chy()
	{
		 str_1 = " Mount Residency                    ";
		 str_2 = " The Madras Grand.                  ";
		 str_3 = " OYO Hotel Apple Residency          ";
		 str_4 = " Fabhotel Sai Residency             ";
		 str_5 = " The Saibaba Hotel.                 ";
		 objpro.pry_type();
		
	}
	void bng()
	{
		 str_1 =" ibis Bengaluru Hosur Road.          ";
		 str_2 =" The Lalit Ashok Bangalore           ";
		 str_3 =" The Pride Hotel, Bangalore.         ";
		 str_4 =" Western Keys Hotel.                 ";
		 str_5 =" The Leela Palace Bengaluru          ";
		objpro.pry_type();
	}
	void mub()
	{
		 str_1 = " ibis Mumbai Airport-An Accor Brand ";
		 str_2 = " FabHotel Ascot International II    ";
		 str_3 = " T24 Residency                      ";
		 str_4 = " Hotel Sahara Star                  ";
		 str_5 = " Hotel Supreme Comforts - Mumbai    ";
		objpro.pry_type();
	}
	void kol()
	{
		 str_1 = " OYO 2872 Hotel City Of Joy         ";
		 str_2 = " Fabexpress Vedika                  ";
		 str_3 = " Regencyy Guest House               ";
		 str_4 = " Fabhotel Sapphire Comfort          ";
		 str_5 = " Taj City Centre New Town,Kolkata   ";
		objpro.pry_type();
	} 
}
class Hotel1
{
	static Scanner sc = new Scanner(System.in);
	static int roomnum = 0, percount = 1, n1,per;  //numbersof persones
	static long usermob=0l, ndays = 0l;
	static double totalAmt = 0.0;                  //Total Amount=roomamount+cgst+sgst+maintance charges 
	static double room1 = 4520.00,room2=3520.00,room3=3920.00,room4=3260.00,room5=4290.00,room6=4550.00,mant=382.20,tm=0.0;
	static String name,gen,checkInDate,checkOutDate,randomNumber,adhar;
	static double roomAmt1,roomAmt2,roomAmt3,roomAmt4,roomAmt5,roomAmt6,totromA;
	static double Amt1,Amt2,Amt3,Amt4,Amt5,Amt6;
	static int count1 = 3,countadhar=3, count = 3, countadhar1 = 3;
	static double cgstAmt = 0.0,totalcgstAmt=0.0;    // CGST Amount
    static double sgstAmt = 0.0,totalsgstAmt=0.0;   // SGST Amount
	static boolean funds = false;
	static Cart cart = new Cart();
    static boolean id101 = true;
	static boolean id102 = true;
	static boolean id103 = true;
	static boolean id104 = true;
	static boolean id105 = true;
	static boolean id106 = true;
	static User obj1;
	static User obj2;
	static User obj3;
	static User obj4;
	static User obj5;
	static User obj6;
	
	// Reset
    public static final String RESET = "\033[0m";  // Text Reset
    // Blink
    public static final String blink = "\u001b[5m";

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE
	
    //Methode for the makeRevservation;
    void makeReservation()
	{
		System.out.print("\u001B[33mEnter a Room Number:"+RESET);
	    n1 = sc.nextInt();
		int arr[] = {101,102,103,104,105,106};
		if(n1==101 && id101==true)
		{
			    randomNumber = generateOTP(9);
				System.out.println(GREEN_BACKGROUND+"  Booked  101 "+RESET);
				id101=false;
				roomAmt1 += ndays*room1;
				cgstAmt = roomAmt1*5.0/100;
				sgstAmt = roomAmt1*4.0/100;
				totalcgstAmt +=cgstAmt;
				totalsgstAmt +=sgstAmt;
				totromA +=roomAmt1;
				tm+=mant;
				totalAmt+=cgstAmt+sgstAmt+roomAmt1+mant;
				Amt1 = roomAmt1+cgstAmt+sgstAmt+mant;
				obj1 = new User(name,randomNumber,101,ndays,usermob,checkInDate,checkOutDate,gen,roomAmt1,4520.00,cgstAmt,sgstAmt);
				cart.addUser(obj1);
				cart.cart1(101);
				userchoice();
		}
		else if(n1==102 && id102==true)
	    {
			if(per>=2 && per<=5)
			{
			    randomNumber = generateOTP(9);
				System.out.println(GREEN_BACKGROUND+"  Booked  102 "+RESET);
			    id102=false;
				roomAmt2 += ndays*room2;
				cgstAmt = roomAmt2*5.0/100;
				sgstAmt = roomAmt2*4.0/100;
				totalcgstAmt +=cgstAmt;
				totalsgstAmt +=sgstAmt;
				totromA +=roomAmt2;
				tm+=mant;
				totalAmt+=cgstAmt+sgstAmt+roomAmt2+mant;
				Amt2 = roomAmt2+cgstAmt+sgstAmt+mant;
				randomNumber = generateOTP(9);
				obj2 = new User(name,randomNumber,102,ndays,usermob,checkInDate,checkOutDate,gen,roomAmt2,3520.00,cgstAmt,sgstAmt);
				cart.addUser(obj2);
				cart.cart2(102);
				userchoice();
			}
			else
			{
				System.out.println(RED_BACKGROUND +"Single Bed Room Capacity is 2 to 5 onely"+RESET);
				agianpersons();
			}
	    }
		else if(n1==103 && id103==true)
		{
			   randomNumber = generateOTP(9);
				System.out.println(GREEN_BACKGROUND+"  Booked  103 "+RESET);
				id103=false;
				roomAmt3 += ndays*room3;
				cgstAmt = roomAmt3*5.0/100;
				sgstAmt = roomAmt3*4.0/100;
				totalcgstAmt +=cgstAmt;
				totalsgstAmt +=sgstAmt;
				totromA +=roomAmt3;
				tm+=mant;
				//roomAmt3 += cgstAmt+sgstAmt;
				totalAmt+=cgstAmt+sgstAmt+roomAmt3+mant;
				Amt3 = roomAmt3+cgstAmt+sgstAmt+mant;
				obj3 = new User(name,randomNumber,103,ndays,usermob,checkInDate,checkOutDate,gen,roomAmt3,3920.00,cgstAmt,sgstAmt);
				cart.addUser(obj3);
				cart.cart3(103);
				userchoice();
	    }
		else if(n1==104 && id104==true)
		{
			if(per>=2 && per<=5)
			{
				System.out.println(GREEN_BACKGROUND+"  Booked  104 "+RESET);
				id104=false;
				roomAmt4 += ndays*room4;
				cgstAmt = roomAmt4*5.0/100;
				sgstAmt = roomAmt4*4.0/100;
				totalcgstAmt +=cgstAmt;
				totalsgstAmt +=sgstAmt;
				totromA +=roomAmt4;
				//roomAmt4 += cgstAmt+sgstAmt;
				totalAmt+=cgstAmt+sgstAmt+roomAmt4+mant;
				Amt4 = roomAmt4+cgstAmt+sgstAmt+mant;
				randomNumber = generateOTP(9);
				obj4 = new User(name,randomNumber,104,ndays,usermob,checkInDate,checkOutDate,gen,roomAmt4,3260.00,cgstAmt,sgstAmt);
				cart.addUser(obj4);
				cart.cart4(104);
				userchoice();
			}
			else
			{
				System.out.println(RED_BACKGROUND +"Single Bed Room Capacity is 2 to 5 members onely"+RESET);
				agianpersons();
			}
		}
		else if(n1==105 && id105==true)
		{
			System.out.println(GREEN_BACKGROUND+"  Booked  105 "+RESET);
			id105=false;
			roomAmt5 += ndays*room5;
			cgstAmt = roomAmt5*5.0/100;
			sgstAmt = roomAmt5*4.0/100;
			totalcgstAmt +=cgstAmt;
			totalsgstAmt +=sgstAmt;
			totromA +=roomAmt5;
			//roomAmt5 += cgstAmt+sgstAmt;
			tm+=mant;
			totalAmt+=cgstAmt+sgstAmt+roomAmt5+mant;
			Amt5 = roomAmt5+cgstAmt+sgstAmt+mant;
			randomNumber = generateOTP(9);
			obj5 = new User(name,randomNumber,105,ndays,usermob,checkInDate,checkOutDate,gen,roomAmt5,4290.00,cgstAmt,sgstAmt);
			cart.addUser(obj5);
			cart.cart5(105);
			userchoice();
		}
		else if(n1==106 && id106==true)
		{
			System.out.println(GREEN_BACKGROUND+"  Booked  106 "+RESET);
			id106 = false;
			roomAmt6 += ndays*room6;
			cgstAmt = roomAmt6*5.0/100;
			sgstAmt = roomAmt6*4.0/100;
			totalcgstAmt +=cgstAmt;
			totalsgstAmt +=sgstAmt;
			totromA +=roomAmt6;
			//roomAmt6 += cgstAmt+sgstAmt;
			tm+=mant;
			totalAmt+=cgstAmt+sgstAmt+roomAmt6+mant;
			Amt6 = roomAmt6+cgstAmt+sgstAmt+mant;
			randomNumber = generateOTP(9);
			obj6 = new User(name,randomNumber,106,ndays,usermob,checkInDate,checkOutDate,gen,roomAmt6,4550.00,cgstAmt,sgstAmt);
			cart.addUser(obj6);
		    cart.cart6(106);
			userchoice();
		}
		else if(n1<101 || n1>106)
		{
			System.out.println(RED_BACKGROUND+"Enter a correct room numbers 101 t0 106"+RESET);
			makeReservation();
		}
		else
		{
			System.out.println(BLACK+RED_BACKGROUND+"Sorry! Your Enter Already Booked Room"+RESET);
			System.out.println(BLACK+RED_BACKGROUND+"Select Another Room"+RESET);
			makeReservation();
		}
	}
	void listromm()
	{
		String av1 = "";
		String av2 = "";
		String av3 = "";
		String av4 = "";
		String av5 = "";
		String av6 = "";
		if(id101==true)
			av1 += GREEN+" Available "+RESET;
		else
			av1 +=RED+"   Booked  "+RESET;
		if(id102==true)
			av2 += GREEN+" Available "+RESET;
		else
			av2 +=RED+"   Booked  "+RESET;
		if(id103==true)
			av3 += GREEN+" Available "+RESET;
		else
			av3 +=RED+"   Booked  "+RESET;
		if(id104==true)
			av4 += GREEN+" Available "+RESET;
		else
			av4 +=RED+"   Booked  "+RESET;
		if(id105==true)
			av5 += GREEN+" Available "+RESET;
		else
			av5 +=RED+"   Booked  "+RESET;
		if(id106==true)
			av6 += GREEN+" Available "+RESET;
		else
			av6+=RED+"   Booked  "+RESET;
	    
		System.out.printf("+-------------------------------------------------------------------------------------------------------------------+\n");
		System.out.printf("|\033[0;31m                                                   List of Rooms                                                   \033[0m|\n");
		System.out.printf("+---------+------------+---------------+--------------+---------+-----------+----------------------+----------+-----+%n");
		System.out.printf("|\033[0;33m%8s\033[0m |\033[0;33m %10s\033[0m |\033[0;33m %10s\033[0m |\033[0;33m %8s\033[0m |\033[0;33m%8s\033[0m |\033[0;33m%8s\033[0m  |\033[0;33m  %15s\033[0m  |\033[0;33m%8s\033[0m  |\033[0;33m%5s\033[0m|%n","Room No" ," Room Name" ,"Is Avalilable"," Room Type  "," Wifi " ,"   A/c   " ,"  No Of Persons   "," Price ", "Floor");
		System.out.printf("+---------+------------+---------------+--------------+---------+-----------+----------------------+----------+-----+%n");
		System.out.printf("|\033[0;33m%8s\033[0m |\033[0;33m %10s\033[0m | %10s   |\033[0;33m %10s\033[0m |\033[0;33m%8s\033[0m |\033[0;33m%8s\033[0m  |\033[0;33m  %15s\033[0m  |\033[0;33m%8s\033[0m  |\033[0;33m%5s\033[0m|%n","101  ","101-Double",av1," Double Room"," Yes " ," Optional" ,"5 elders+ 2 adults"," /-4520", "  2  ");
		System.out.printf("|\033[0;33m%8s\033[0m |\033[0;33m %10s\033[0m | %10s   |\033[0;33m %10s\033[0m |\033[0;33m%8s\033[0m |\033[0;33m%8s\033[0m  |\033[0;33m  %15s\033[0m  |\033[0;33m%8s\033[0m  |\033[0;33m%5s\033[0m|%n","102  ","102-Single",av2,"  Single Rom"," Yes " ," Optional" ,"2 elders+ 2 adults"," /-3520", "  2  ");
		System.out.printf("|\033[0;33m%8s\033[0m |\033[0;33m %10s\033[0m | %10s   |\033[0;33m %10s\033[0m |\033[0;33m%8s\033[0m |\033[0;33m%8s\033[0m  |\033[0;33m  %15s\033[0m  |\033[0;33m%8s\033[0m  |\033[0;33m%5s\033[0m|%n","103  ","103-Double",av3," Double Room"," Yes " ," Optional" ,"4 elders+ 2 adults"," /-3920", "  3  ");
		System.out.printf("|\033[0;33m%8s\033[0m |\033[0;33m %10s\033[0m | %10s   |\033[0;33m %10s\033[0m |\033[0;33m%8s\033[0m |\033[0;33m%8s\033[0m  |\033[0;33m  %15s\033[0m  |\033[0;33m%8s\033[0m  |\033[0;33m%5s\033[0m|%n","104  ","104-Single",av4,"  Singl Room"," Yes " ," Optional" ,"2 elders+ 2 adults"," /-3260", "  4  ");
		System.out.printf("|\033[0;33m%8s\033[0m |\033[0;33m %10s\033[0m | %10s   |\033[0;33m %10s\033[0m |\033[0;33m%8s\033[0m |\033[0;33m%8s\033[0m  |\033[0;33m  %15s\033[0m  |\033[0;33m%8s\033[0m  |\033[0;33m%5s\033[0m|%n","105  ","105-Double",av5," Double Room"," Yes " ," Optional" ,"5 elders+ 2 adults"," /-4290", "  5  ");
		System.out.printf("|\033[0;33m%8s\033[0m |\033[0;33m %10s\033[0m | %10s   |\033[0;33m %10s\033[0m |\033[0;33m%8s\033[0m |\033[0;33m%8s\033[0m  |\033[0;33m  %15s\033[0m  |\033[0;33m%8s\033[0m  |\033[0;33m%5s\033[0m|%n","106  ","106-Double",av6," Double Room"," Yes " ," Optional" ,"4 elders+ 2 adults"," /-4550", "  5  ");
		System.out.printf("+---------+------------+---------------+--------------+---------+-----------+----------------------+----------+-----+%n");
		show();
	}
    //calling cart details in thei methode 
	void displaycart1(int n)
	{
		int x = 0;
		if(id101==true && id102==true && id103==true && id104==true && id105==true && id106==true)
		{
			System.out.println("------Bookings not available-----");
			System.out.println(YELLOW+"------Plz Book Your Room-------"+RESET);
			if(n==3)
			{
				Login objlong = new Login();
				objlong.profile();
			}
			else
				show();
        }
		else
		{
			System.out.println(BLUE+"==================================Cart Details=============================="+RESET);
			for(int i=101; i<=106; i++)
			{ 
				if(i==101 && id101==false)
				{
					cart.cart1(i);
					x=1;
				}
				if(i==102 && id102 ==false)
				{
					cart.cart2(i);
					x=1;
				}
				if(i==103 && id103 ==false)
				{
					cart.cart3(i);
					x=1;
				}
				if(i==104 && id104 ==false)
				{
					cart.cart4(i);
					x=1;
				}
				if(i==105 && id105 ==false)
				{
					cart.cart5(i);
					x=1;
				}
				if(i==106 && id106 ==false)
				{
					cart.cart6(i);
					x=1;
				}
			}
		}
		if(x!=0 && n==1)
		{
          String f1 = String.format("%.2f", Hotel1.totalAmt);
		  System.out.println("   Total Pay Amount is: "+f1+"\t\tBooking Status: "+RED+"Pending Payment"+RESET);
		  System.out.println("----------------------------------------------------------------------------------------");
	      System.out.println(BLUE+"==================================================================================="+RESET);
		  userchoice();
		}
		if(x!=0 && n==2)
		{
			String f1 = String.format("%.2f", Hotel1.totalAmt);
		    System.out.println("   Total Pay Amount is: "+f1+"\t\tBooking Status: "+GREEN+"Sucess Payment"+RESET);
		    System.out.println("---------------------------------------------------------------------------------------");
			System.out.println(BLUE+"==================================================================================="+RESET);
			Receipt obj = new Receipt();
			obj.BackInfo();
		}
		if(x!=0 && n==3 && funds==true)
		{
			Login objlong = new Login();
			String f1 = String.format("%.2f", Hotel1.totalAmt);
		    System.out.println("   Total Pay Amount is: "+f1+"\t\tBooking Status: "+GREEN+"Sucess Payment"+RESET);
		    System.out.println("---------------------------------------------------------------------------------------");
			System.out.println(BLUE+"==================================================================================="+RESET);
			Receipt obj = new Receipt();
			objlong.profile();
		}
		if(x!=0 && n==3 && funds==false)
		{
			Login objlong = new Login();
			String f1 = String.format("%.2f", Hotel1.totalAmt);
		    System.out.println("   Total Pay Amount is: "+f1+"\t\tBooking Status: "+RED+"Pending Payment"+RESET);
		    System.out.println("---------------------------------------------------------------------------------------");
			System.out.println(BLUE+"==================================================================================="+RESET);
			Receipt obj = new Receipt();
			objlong.profile();
		}
	}
    boolean teramcon()
	{
			boolean b = false;
			try 
			{
				System.out.println(CYAN+"Terms & conditions"+RESET);
				String str = (RED+"1. Prior to 3 days of check-in date, We will charaged only CGST,SGST and maintance of Rooom cancellation charges will be levied."+RESET+"\r\n"
                              +RED+"2. 3 days to check-in date, a cancellation charge of 8.2% of total booking amount will be charged.92.8% Amount will refund\r\n"
							  +RED+"   A one day retention will be charged if guest informs us through email before 12:00 noon of arrival date about room cancellation."+RESET+"\r\n"
                              +RED+"3. In case of no show with no communication about cancellation full booking amount we be charged.\r\n"
                              +RED+"   Guaranteed reservation room will be held for the guest till next day 6:00 am of arrival date, after which it will be treated as no show booking."+RESET+"\r\n"
                              +RED+"4. In case of dates change existing booking needs to be cancelled, see cancellation policy.\r\n"
							  +RED+"   Reservation of rooms on new dates will be subject to availability."+RESET+"\r\n");
				for(int i=0; i<str.length(); i++)
				{
            		System.out.print(str.charAt(i));
            		Thread.sleep(1);
				}
				System.out.println(GREEN+"If You Accept Cancellation Policy Enter"+RESET+PURPLE_BACKGROUND+" 'Yes' "+RESET);
				String str1 = Hotel1.sc.next();
				if(str1.equalsIgnoreCase("Yes"))
					b = true;
				else
					b = false;
			} 
			catch (InterruptedException e) 
			{
				 Thread.currentThread().interrupt();
				 System.out.println("Thread was interrupted: " + e.getMessage());
			}
			return b;
	  }
	//Methode for cancelHotel
	void cancelRommHotel1()
	{
		
		if(id101==false || id102==false || id103==false || id104==false || id105==false || id106==false)
		{
			if(teramcon())
			{
				 System.out.println(CYAN+"**************ROOM CANCELLATION******************"+RESET);
				 System.out.print("\u001B[33mEnter a Room number:"+RESET);
				 int n = sc.nextInt();
				 if(n==101 && id101==false && roomAmt1>=4520 && roomAmt1>0)
				 {
					if(funds==true)
					{
						 System.out.println(GREEN+" Cancel your room successfully 101 "+RESET);
						 id101=true;
						 totalAmt-=roomAmt1;
						 Login.wlAmt += roomAmt1;
						System.out.println("Transfer Your Amount In	Your wallet");
						System.out.println("-----------------------------------");
						System.out.println("Total refund Amount	is:	"+roomAmt1);
						System.out.println("-----------------------------------");
						System.out.println(GREEN+"Thank	You!!!"+RESET);
						//obj1.BackInfo();
						cn2();
					}
					else
					{
						System.out.println(GREEN+"Cancel your room successfully 101 "+RESET);
					    id101=true;
						//double gst = roomAmt1*5.0+roomAmt1*4.0+382.2;
						totalAmt = totalAmt-Amt1;
						cn3();
					}
			     }
				 else if(n==102 && id102==false && roomAmt2>=3520 && roomAmt2>0)
				 {
					 if(funds==true)
					 {
						System.out.println(GREEN+" Cancel your room successfully 102 "+RESET);
						id102=true;
						//roomAmt2 -= ndays*room2;
						totalAmt-=roomAmt2;
						Login.wlAmt += roomAmt2;
						System.out.println("Transfer Your Amount In Your wallet");
						System.out.println("------------------------------------");
						System.out.println("Total refund Amount is: "+roomAmt2);
						System.out.println("------------------------------------");
						cn2();
					 }
					else
					{
						System.out.println(GREEN+" Cancel your room	successfully 102 "+RESET);
					    id102=true;
						//double gst = roomAmt2*5.0+roomAmt2*4.0+382.2;
						totalAmt = totalAmt-Amt2;
						cn3();
					}
				}
				else if(n==103 && id103==false && roomAmt3>=3920 && roomAmt3>0)
				{
					if(funds==true)
					{
						System.out.println(GREEN+" Cancel your room successfully 102 "+RESET);
						id103=true;
						//roomAmt3 -= ndays*room3;
						totalAmt-=roomAmt3;
						Login.wlAmt += roomAmt3;
						System.out.println("Transfer Your Amount In Your wallet");
						System.out.println("--------------------------------------");
						System.out.println("Total refund Amount is: "+roomAmt3);
						System.out.println("-------------------------------------");
						cn2();
					}
					else
					{
						System.out.println(GREEN+" Cancel your room	successfully 103 "+RESET);
					    id103=true;
						//double gst = roomAmt3*5.0+roomAmt3*4.0+382.2;
						totalAmt = totalAmt-Amt3;
						cn3();
					}
				}
				else if(n==104 && id104==false && roomAmt4>=3260 && roomAmt4>0)
				{
					if(funds==true)
					{
						System.out.println(GREEN+" Cancel your room successfully 104 "+RESET);
						id104=true;
						//roomAmt4 -= ndays*room4;
						totalAmt-=roomAmt4;
						Login.wlAmt += roomAmt4;
						System.out.println("Transfer Your Amount In Your Wallet");
						System.out.println("-------------------------------------------");
						System.out.println("Total refund Amount is: "+roomAmt4);
						System.out.println("-------------------------------------------");
						cn2();
					}
					else
					{
						System.out.println(GREEN+" Cancel your room	successfully 104 "+RESET);
					    id104=true;
						//double gst = roomAmt4*5.0+roomAmt4*4.0+382.2;
						totalAmt = totalAmt - Amt4;
						cn3();
					}
				}
				else if(n==105 && id105==false && roomAmt5>=4290 && roomAmt5>0)
				{
					if(funds==true)
					{
						System.out.println(GREEN+" Cancel your room successfully 105 "+RESET);
						id105=true;
						Login.wlAmt += roomAmt5;
						System.out.println("Transfer Your Amount In Your Wallet");
						System.out.println("----------------------------------------");
						System.out.println("Total refund Amount is: "+roomAmt5);
						System.out.println("----------------------------------------");
						totalAmt-=roomAmt5;
						cn2();
					}
					else
					{
						System.out.println(GREEN+" Cancel your room	successfully 105 "+RESET);
					    id105=true;
						double gst = roomAmt5*5.0+roomAmt5*4.0+382.2;
						totalAmt = totalAmt - Amt5;
						cn3();
					}
				}
				else if(n==106 && id106==false && roomAmt6>=4550 && roomAmt6>0)
				{
					if(funds==true)
					{
						System.out.println(GREEN+" Cancel your room successfully 106 "+RESET);
						id106 = true;
						//roomAmt6 -= ndays*room6;
						totalAmt-=roomAmt6;
						Login.wlAmt += roomAmt6;
						System.out.println("Transfer Your Amount In Your wallet");
						System.out.println("--------------------------------------");
						System.out.println("Total refund Amount is: "+roomAmt6);
						System.out.println("--------------------------------------");
						//25600.00
						cn2();
					}
					else
					{
						System.out.println(GREEN+" Cancel your room	successfully 106 "+RESET);
					    id106=true;
						totalAmt = totalAmt - Amt6;
						cn3();
					}
		         }
			     else if(n<101 || n>106)
			     {
					System.out.println(RED+"Invalid Input please select between 101 to 106"+RESET);
					cancelRommHotel1();
			    }
			    else
			    {
				     System.out.println(RED+"Enter a correct Booked room number"+RESET);
					 System.out.println(YELLOW_BOLD+blink+"Maximum Number of attamps "+ count1 +" Only"+RESET);
					if(count1>=1)
					{
							count1-=1;
							//System.out.println(YELLOW_BOLD+blink+"Maximum Number of attamps "+ count1 +" Only"+RESET);
							cancelRommHotel1();
					}
					else
					{
							count1 = 3;
							System.out.println(RED+"Booking not available"+RESET);
							System.out.println(YELLOW+"Check Your Cart and Cancel !!!"+RESET);
							cn2();
				    }
			     }
			}
		    else
		    {
				System.out.println(RED+"Your Not Accepted terms and conditions"+RESET);
				System.out.println(GREEN+"Accepted terms and conditions 'Cancel Your Reservation'"+RESET);
				cn2();
		    }
		}
		else
		{
			System.out.println(RED+"Not Available Your Bookings"+RESET);
			cn2();
		}
	}
	void cn2()
	{
		System.out.println("\033[1;36mSelect Your Option\u001B[0m");
		System.out.println("\033[1;36m1.Profile               2.Exit\u001B[0m");
		System.out.print("\u001B[33mSelect Your Options: "+RESET);
		int n = sc.nextInt();
		if(n==1)
		{
		   Login objlonin = new Login();
		   objlonin.clearConsoleP1(1);
		}
		else if(n==2)
		{
			Logo obj = new Logo();
			obj.finalExit(1);
		}
		else
			System.out.println("Slect Range(1 or 2)");
	}
	void cn3()
	{
		System.out.println("If You Want Go To Pay Money");
		System.out.println("\033[1;36m1.Yes               2.No\u001B[0m");
		System.out.print("\u001B[33mSelect Your Options: "+RESET);
		int n = sc.nextInt();
		if(n==1)
		    userchoice();
		else if(n==2)
		{
			Login objlonin = new Login();
		    objlonin.clearConsoleP1(1);
		}
		else
			System.out.println("Select Range(1 or 2)");

	}
	void cn4()
	{
		Login obj = new Login();
		if(id101==false || id102==false || id103==false || id104==false || id105==false || id106==false)
		{
			if(funds==false)
			{
				clearConsole5(1);
			}
			else
			{
				System.out.println(GREEN+"An amount of money paid already "+RESET);
				System.out.println(RED+"Check Your Bookings or Cart"+RESET);
				obj.clearConsoleP1(1);
			}
		}
		else
		{
			System.out.println(RED+"Bookings are Not Avilable!! Book Your Best Hotel"+RESET);
			obj.clearConsoleP1(1);
		}
	}
	void addroom()
	{
		System.out.println("\033[1;36mContinue with same dates\u001B[0m");
		System.out.println("\033[1;36m1.Yes               2.No\u001B[0m");
		System.out.print("\u001B[33mSelect Your Options: "+RESET);
		int n = sc.nextInt();
		if(n==1)
		{
		   makeReservation();
		}
		else if(n==2)
		{
			sc.nextLine();
			Gustdetails();
		}
		else
			System.out.println("Select Range(1 or 2)");
	}
	String generateOTP(int length)
	{
        Random random = new Random();
        StringBuilder otp = new StringBuilder(length);
        for (int i = 0; i < length; i++)
	    {
            otp.append(random.nextInt(10)); //Generates a digit between 0 and 9
        }
        return otp.toString();
	}
	void gustInfo()
	{
		displaycart1(1);
	}
	void agianpersons()
	{
		System.out.print(YELLOW+"Enter a Number of Persons: "+RESET);
		per = sc.nextInt();
		if(per>=2 && per<=8)
		{
			sc.nextLine();
			date();
		}
		else
		{
			System.out.println(YELLOW_BOLD+blink+"Maximum Number of Attamps "+count+" Onely"+RESET);
			if(count>=1)
			{
				count-=1;
				agianpersons();
			}
			else
			{
				int count =  3;
				System.out.println(YELLOW_BOLD+blink+"Maximum Number of Attamps Completed!Try Agian"+RESET);
				System.exit(0);
			}
		}
	}
    String generateOTP() 
	{
        Random random = new Random();
        int otp = random.nextInt(900000) + 100000; 
        return String.valueOf(otp);
	}
	void adharprint()
	{
		String adr = adhar+"";
		try
	    {
			String str = (" ------------------------------------------------------------\r\n"
					      +GREEN+"\tSuccessfully Verify Aadhaar Card Details"+RESET+"\r\n"
					      +"\tAdhaar Number: "+"****  ****  "+adr.subSequence(8,12)+"\r\n"
					      +"\tName: "+name+"\r\n"
					      +"\tGender: "+gen+"\r\n"
					      +"\tMobile Number: "+usermob+"\r\n"
					      +"\tState: ***************  \r\n"
					      +"\tAdharr Status is :"+GREEN+"ACTIVE"+RESET+"\r\n"
					      +"------------------------------------------------------------\r\n");
			for(int i=0; i<str.length(); i++)
			{
            		System.out.print(str.charAt(i));
            		Thread.sleep(2);
			}
			makeReservation();
	    } 
	    catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
			System.out.println("Thread was interrupted: " + e.getMessage());
	     }
	}
	void adharotp()
	{
		String otpA = generateOTP();
	    System.out.println(GREEN+"6 Digite OTP is Successfully Genarated"+RESET);
	    System.out.println("Generated OTP: "+otpA);
		System.out.print("\u001B[33mEnter Your Adhaar Otp here:"+RESET);
		String userotp = sc.next();
		if(userotp.equals(otpA))
		{
			adharprint();
		}
		else
		{
			System.out.println("\033[1;31mYour Enter a Wrong OTP:"+RESET);
			while(true)
			{
				System.out.println(YELLOW_BOLD+blink+"Maximum Number of Attamps: "+countadhar+" Only"+RESET);
				otpA = generateOTP();
				System.out.println(GREEN+"6 Digite OTP is Successfully Genarated"+RESET);
				System.out.println("Generated OTP: "+otpA);
				System.out.print(YELLOW+"Agian Enter a OTP:"+RESET);
				userotp = sc.next();
				if(userotp.equals(otpA))
				{
					countadhar-=1;
					adharprint();
					break;
				}
				else
			    {
					if(countadhar>=1)
						countadhar-=1;
					else
					{
						System.out.println("Exiting...(Maximum Number of Attamps Completed)");
						System.exit(0);
						break;
					}
				}
			}
		}
	}
	void adhardetails()
	{
		System.out.print(YELLOW+"Enter Your Adhaar Card Number here: "+RESET);
		adhar = sc.nextLine();
		if(adhar.length()==12 || adhar.length()==14)
		{
			for(int i=0; i<adhar.length(); i++)
			{
				char ch = adhar.charAt(i);
			    if(Character.isDigit(ch))
				{
					adharotp();
				}
				else
				{
					System.out.println(RED+" Plz Enter Digits Only "+RESET);
					adhardetails();
				}
			}	
		}
		else
		{
			if(countadhar1>=1)
			{
					System.out.println(RED+"Invalid Adhaar Details:"+RESET);
					System.out.println(YELLOW_BOLD+blink+"Maximum Number of Attamps: "+countadhar1+" Only"+RESET);
					countadhar1-=1;
					adhardetails();
		    }
			else
		   {
			   System.out.print("Exit......");
			   System.exit(0);
		   }
		}
	}
	void date()
	{
		//If yout stay in below 5 days no need for adhar above 5 days need adhar
	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.print("\u001B[33mEnter the CheckIn date (YYYY-MM-DD): "+RESET);    //Take CheIn Date 
        checkInDate = sc.nextLine();
        System.out.print("\u001B[33mEnter the CheckOut date (YYYY-MM-DD): "+RESET);    //Take Checkout Date
        checkOutDate = sc.nextLine();
		LocalDate CIDate = LocalDate.parse(checkInDate, formatter);
        LocalDate CODate = LocalDate.parse(checkOutDate, formatter);
        // Calculate the difference in days
        ndays = java.time.temporal.ChronoUnit.DAYS.between(CIDate, CODate);
		if(ndays<0)
		{
			System.out.println(RED+"******Enter a Upcomming Dates*******"+RESET);
			//sc.nextLine();
			date();
		}
		if(ndays>=5)
		{
		     adhardetails();
		}
		else
		{
		    if(ndays==0)
		    {
			    ndays = 1;
		    }
			makeReservation();
		}
	}
	void Gustdetails()
	{
		//Take name
		System.out.print("\u001B[33mEnter a Your Name:"+RESET);
	    name = sc.nextLine();
		//TAke the Gender
        System.out.print("\u001B[33mEnter a Mobile Number:"+RESET);
		usermob = sc.nextLong();
		System.out.print("\u001B[33mEnter a Your Gender M/F:"+RESET);
		gen = sc.next();
		//take the Number of Persones
		System.out.println(PURPLE+" ==> Double Bed Room Capacity 4 to 8 members only 5Adults 3Childrens(Above 6years) 5years bellow we don't charage(free)");
		System.out.println(" ==> Single Bed Room Capacity 2 to 4 members only 3 Adults 1Childrens(Above 5years) 4years bellow we don't charge(free)"+RESET);
		System.out.print("\u001B[33mEnter a Number of Persons:"+RESET);
		per = sc.nextInt();
		sc.nextLine();
		if(per>=2 && per<=7)
		{
			date();
		}
		else if(per>=1 && per<=4)
		{
			date();
		}
		else
		{
			System.out.println(RED+" Your Enter a more than capacity of numbers "+RESET);
			agianpersons();
		}
	}
	void userchoice()
	{
		System.out.println("Select Your Option:");
		System.out.println(" 1. \033[1;36mAdd One More Room\u001B[0m");
		System.out.println(" 2. \033[1;36mGo To PayMent\u001B[0m");
		System.out.println(" 3. \033[1;36mMain Menu\u001B[0m");
		System.out.println(" 4. \033[1;36mGo To Cart\u001B[0m");
		System.out.println(" 5. \033[1;36mProfile\u001B[0m");
		System.out.println(" 6. "+RED+"Exit"+RESET);
		System.out.print("\u001B[33mEnter Your Choice:"+RESET);
		int option = Hotel1.sc.nextInt();
		switch (option)
		{
		     case 1:
				 //Gustdetails();
				 addroom();
			     break;
			 case 2:
				 clearConsole5(1);
				 break;
			 case 3:
				 show();
			     break;
			 case 4:
				  displaycart1(1);
			      break;
			 case 5:
				 Login objlonin = new Login();
		         objlonin.clearConsoleP1(1);
			 case 6:
				 System.out.println(RED+"Your Room is Not Booking! Try Agian"+RESET);
			     System.out.println(GREEN+"     Thank You...Revisit Again(:    "+RESET);
				 System.exit(0);
				 break;
			 default:
				  System.out.println(RED+"Invalid choice. Please try again. Range Beetween(1-4)"+RESET);
			      userchoice();
		}

	}
	void dummy()
	{
		displaycart1(2);
	}
	void clearConsole5(int n)
    {
        try 
		{
			// For Windows
            if (System.getProperty("os.name").toLowerCase().contains("win")) 
	         {
				Thread.sleep(2500);
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				if(n==1)
				{
					Payments pay = new Payments();
					pay.option();
				}
				else if(n==2)
					Houserules();
				else if(n==3)
					  show();  
             } 
	         else
	         {
                // For Unix-based systems
                System.out.print("\033[H\033[2J");
                System.out.flush();
             }
		} 
		catch (Exception e) 
		{
			 e.printStackTrace();
		}
	}
	void show()
	{
		System.out.println(" 1. \033[1;36mList Available rooms\u001B[0m");
		System.out.println(" 2. \033[1;36mMake a reservation\u001B[0m");
		//System.out.println(" \033[1;36m3.Cancel a reservation\u001B[0m");
		System.out.println(" 3. \033[1;36mGo to Cart\u001B[0m");
		System.out.println(" 4. \033[1;36mHouse rules\u001B[0m");
		System.out.println(" 5. \033[1;36mProfile\u001B[0m");
		System.out.println(" 6. "+RED+"Go to Back"+RESET);
		System.out.println(" 7. "+RED+"Exit"+RESET);
		System.out.print("\u001B[33mEnter your choice:"+RESET);
        int choice = Location.sc.nextInt();
		//checkroom hotel = new checkroom();
        switch (choice)
	    {
                case 1:
                    listromm();
                    break;
                case 2:
					//Make Reservation start with Gust details end with Booked status and Payment
				    Location.sc.nextLine();
                    Gustdetails();
                    break;
                /*case 3:
                    cancelRommHotel1();
                    break; */
				case 3:
					 displaycart1(1);
				     break;
				case 4:
					 clearConsole5(2);
					  break;
			    case 5:
					   Login objlonin = new Login();
		               objlonin.clearConsoleP1(1);
				case 6:
					Hotel_Restrents obj = new Hotel_Restrents();
				    obj.res_list();
			    case 7:
			         System.out.println(GREEN+"     Thank You...Revisit Again(:    "+RESET);
                     System.exit(0); 
					 break;
                default:
                    System.out.println(RED+"Invalid choice. Please try again. Range Beetween(1-4)"+RESET);
					show();
	   }
	}
	void Houserules()
	{
		System.out.printf(GREEN+"+--------------------------------------------------------------------------+\n"+RESET);
		System.out.print(RED+"|                              House rules                                 |\n"+RESET);
		System.out.print(GREEN+"+--------------------------------------------------------------------------+\n"+RESET);
		System.out.print(YELLOW+"|"+RED+" Check-in                                                                 "+RESET+"|\r\n"
				+ ""+YELLOW+"| From 12:30                                                               |\r\n"
				+ "| You'll need to let the property know in advance what time you'll arrive. |\n"+RESET);
		System.out.print(GREEN+"+--------------------------------------------------------------------------+\n"+RESET);
		System.out.print(YELLOW+"|"+RED+" Check-Out                                                                "+RESET+"|\r\n"
				+""+YELLOW+"| Until 11:00                                                              |\r\n"+RESET);
		System.out.print(GREEN+"+--------------------------------------------------------------------------+\n"+RESET);
		System.out.println(RED+"|                       Cancellation/ prepayment                           |"+RESET);
		System.out.print(GREEN+"+--------------------------------------------------------------------------+\n"+RESET);
		System.out.println(YELLOW+"|Cancellation and prepayment policies vary according to accommodation type.|\n"
				          +"|check the conditions of your required option.                             |"+RESET);
		System.out.print(GREEN+"+--------------------------------------------------------------------------+\n"+RESET);
		System.out.println(RED+"|                        Children and beds                                 |"+RESET);
		System.out.print(GREEN+"+--------------------------------------------------------------------------+\n"+RESET);
		System.out.println(YELLOW+"|"+RED+" Child policies                                                           "+RESET+""+YELLOW+"|\r\n"
				          +"| Children of any age are welcome.                                         |\r\n"
				          +"|                                                                          |\r\n"
				          +"| Children 18 years and above will be charged as adults at this property.  |\r\n"
				          +"|                                                                          |\r\n"
				          +"| To see correct prices and occupancy information,please add the number of |\r\n"
				          +"| children in your group and their ages to your search.                    |\r\n"
				          +"|                                                                          |\r\n"
				          +"| Cot and extra bed policies                                               |\r\n"
				          +"| 3 to 4 years child Free Cost                                             |\r\n"
				          +"| Extra bed upon request      1,100/- per person, per night                |\r\n"
				          +"| Prices for extra beds are not included in the total price and will       |\r\n"
		                  +"| have to be paid for separately during your stay.                         |"+RESET);
		       
		System.out.print(GREEN+"+--------------------------------------------------------------------------+\n"+RESET);
		System.out.println(YELLOW+"|"+RED+"  Age restriction                                                         "+RESET+"|\r\n"
				          +""+YELLOW+"|  The minimum age for check-in is 18                                      |"+RESET);
		System.out.print(GREEN+"+--------------------------------------------------------------------------+\n"+RESET);
		System.out.println(YELLOW+"|"+RED+"  Cash and Online                                                         "+RESET+""+YELLOW+"|\r\n"
				          +"|  This property only accepts cash & online payments.                      |"+RESET);
		System.out.print(GREEN+"+--------------------------------------------------------------------------+\n"+RESET);
		System.out.println(YELLOW+"|"+RED+"  Smoking                                                                 "+RESET+""+YELLOW+"|\r\n"
				          +"|  Smoking is not allowed.                                                 |"+RESET);
		System.out.print(GREEN+"+--------------------------------------------------------------------------+\n"+RESET);
		System.out.println(YELLOW+"|"+RED+"  Parties                                                                 "+RESET+""+YELLOW+"|\r\n"
				          +"|  Parties/events are not allowed                                          |"+RESET);
		System.out.print(GREEN+"+--------------------------------------------------------------------------+\n"+RESET);
		System.out.println(YELLOW+"|"+RED+"  Pets                                                                    "+RESET+""+YELLOW+"|\r\n"
				          +"|  Pets are not allowed.                                                   |"+RESET);	
		System.out.print(GREEN+"+--------------------------------------------------------------------------+\n"+RESET);	
		cn5();
	}
	void cn5()
	{
		System.out.println("Select Your Option");
		System.out.println("\033[1;36m1.Main Menu      2.Exit"+RESET);
		System.out.print(YELLOW+"Enter a Option:"+RESET);
		int option = Location.sc.nextInt();
		switch(option)
		{
			case 1:
				 clearConsole5(3);
			     break;
			case 2:
			     System.out.println(GREEN+"     Thank You...Revisit Again(:    "+RESET);
			     System.exit(0);
				 break;
			default:
				System.out.println(RED+"Select above 2 Options only"+RESET);
			    cn5();
		}
	}
	/*public static void main(String[] args)
	{
		Hotel1 obj = new Hotel1();
		obj.show();
	} */
}
class User extends Hotel1
{
    private  String name;
    private  int roomnum;
	private  long staydays;
	private  long mobnum;
	private  String checkIn;
	private  String checkOut;
	private  String gender;
	private  double Amount;
	private  double eachdayamt;
	private  double cgsamt;
	private  double sgsamt;
	private  String randomNumber;
    public User(String name, String randomNumber,int roomnum,long staydays,long mobnum,String checkIn,String checkOut,String gender,double Amount,double eachdayamt,double cgsamt,double sgsamt)
	{
        this.name = name;
        this.roomnum = roomnum;
		this.staydays = staydays;
		this.mobnum = mobnum;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.gender = gender;
		this.Amount = Amount;
		this.randomNumber = randomNumber;
		this.eachdayamt = eachdayamt;
		this.cgsamt = cgsamt;
		this.sgsamt = sgsamt;
    }
    public String getName()
	{
        return name;
    }
    public int getroomnum()
	{
        return roomnum;
    }
	public long getstaydays()
	{
		return staydays;
	}
	public long getmobnum()
	{
		return mobnum;
	}
	public String getcheckIn()
	{
		return checkIn;
	}
	public String getcheckOut()
	{
		return checkOut;
	}
	public String getgender()
	{
		return gender;
	}
	public double getAmount()
	{
		return Amount;
	}
	public double geteachdayamt()
	{
		return eachdayamt;
	}
	public double getcgsamt()
	{
		return cgsamt;
	}
	public double getsgsamt()
	{
		return sgsamt;
	}
	public String getrandomNumber()
	{
		return randomNumber;
	}
}
class Cart extends Hotel1
{
    private static List<User> users;
	static Hotel1 obj = new Hotel1();
    public Cart() 
	{
        this.users = new ArrayList<>();
    } 
    void addUser(User user)
	{
        users.add(user);
    } 
    void displaydummy(int n)
	{
		displaycart1(n);
	}
	//String f1 = String.format("%.2f", Hotel1.totalcgstAmt);
    //String f2 = String.format("%.2f", Hotel1.totalsgstAmt);
	//String f3 = String.format("%.2f", Hotel1.totromA);
	void cart1(int n)
	{
		    //String f1 = String.format("%.2f", Hotel1.obj1.getAmount());
			System.out.println("-------------------------------------"+CYAN+"Booking Details"+RESET+"--------------------------------");
			System.out.println("   BooKIng ID  :"+Hotel1.obj1.getrandomNumber());
			System.out.println("   Full Name   :"+Hotel1.obj1.getName()+"\t\t\tGender : "+Hotel1.obj1.getgender());
			System.out.println("   Room Number :"+Hotel1.obj1.getroomnum()+"\t\t\tMobile Number: "+Hotel1.obj1.getmobnum());
			System.out.println("   Check In Date: "+Hotel1.obj1.getcheckIn()+"\t\tCheck Out Date : "+Hotel1.obj1.getcheckOut());
			System.out.println("   Stay In Days : "+Hotel1.obj1.getstaydays()+"\t\t\tPerDay Amount: "+Hotel1.obj1.geteachdayamt());
			System.out.println("   CSGST : "+Hotel1.obj1.getcgsamt()+"\t\t\tSCGST: "+Hotel1.obj1.getsgsamt());
			double d1 = Hotel1.obj1.getAmount();
			float f1 = (float)d1;
			System.out.printf("   Room Charges: %.2f\n",f1);
			System.out.println("   Tax:(cgst 5%+sgst 4%):"+Math.ceil(Hotel1.obj1.getcgsamt()+Hotel1.obj1.getsgsamt()));
            System.out.println("   Room Service Chrages: "+382.2);
			System.out.println("   Total Amount: "+Math.ceil(d1+Hotel1.obj1.getcgsamt()+Hotel1.obj1.getsgsamt()+382.20));
			System.out.println("-----------------------------------------------------------------------------------------------");
	}
	void cart2(int n)
	{
		    //String f2 = String.format("%.2f", Hotel1.obj1.getAmount());
			System.out.println("--------------------------------------"+CYAN+"Booking Details"+RESET+"-------------------------------");
			System.out.println("   BooKIng ID  :"+Hotel1.obj2.getrandomNumber());
			System.out.println("   Full Name   :"+Hotel1.obj2.getName()+"\t\t\tGender : "+Hotel1.obj2.getgender());
			System.out.println("   Room Number :"+Hotel1.obj2.getroomnum()+"\t\t\tMobile Number: "+Hotel1.obj2.getmobnum());
			System.out.println("   Check In Date: "+Hotel1.obj2.getcheckIn()+"\t\tCheck Out Date : "+Hotel1.obj2.getcheckOut());
			System.out.println("   Stay In Days : "+Hotel1.obj2.getstaydays()+"\t\t\tPerDay Amount: "+Hotel1.obj2.geteachdayamt());
			System.out.println("   CSGST : "+Hotel1.obj2.getcgsamt()+"\t\t\tSCGST: "+Hotel1.obj2.getsgsamt());
			double d2 = Hotel1.obj2.getAmount();
			float f2 = (float)d2;
			System.out.printf("   Room Charges: %.2f\n",f2);
			System.out.println("   Tax:(cgst 5%+sgst 4%):"+Math.ceil(Hotel1.obj2.getcgsamt()+Hotel1.obj2.getsgsamt()));
            System.out.println("   Room Service Chrages: "+382.2);
			System.out.println("   Total Amount: "+Math.ceil(d2+Hotel1.obj2.getcgsamt()+Hotel1.obj2.getsgsamt()+382.20));
			System.out.println("---------------------------------------------------------------------------------------------");
	}
	void cart3(int n)
	{
		    //String f3 = String.format("%.2f", );
			System.out.println("---------------------------------------"+CYAN+"Booking Details"+RESET+"-------------------------------");
			System.out.println("   BooKIng ID  :"+Hotel1.obj3.getrandomNumber());
			System.out.println("   Full Name   :"+Hotel1.obj3.getName()+"\t\t\tGender : "+Hotel1.obj3.getgender());
			System.out.println("   Room Number :"+Hotel1.obj3.getroomnum()+"\t\t\tMobile Number: "+Hotel1.obj3.getmobnum());
			System.out.println("   Check In Date: "+Hotel1.obj3.getcheckIn()+"\t\tCheck Out Date : "+Hotel1.obj3.getcheckOut());
			System.out.println("   Stay In Days : "+Hotel1.obj3.getstaydays()+"\t\t\tPerDay Amount: "+Hotel1.obj3.geteachdayamt());
			System.out.println("   CSGST : "+Hotel1.obj3.getcgsamt()+"\t\t\tSCGST: "+Hotel1.obj3.getsgsamt());
			double d3 = Hotel1.obj3.getAmount();
			float f3 = (float)d3;
			System.out.printf("   Room Charges: %.2f\n",f3);
			System.out.println("   Tax:(cgst 5%+sgst 4%):"+Math.ceil(Hotel1.obj3.getcgsamt()+Hotel1.obj3.getsgsamt()));
            System.out.println("   Room Service Chrages: "+382.2);
			System.out.println("   Total Amount: "+Math.ceil(d3+Hotel1.obj3.getcgsamt()+Hotel1.obj3.getsgsamt()+382.20));
			System.out.println("--------------------------------------------------------------------------------------------------");
	}
	void cart4(int n)
	{
			System.out.println("---------------------------------------"+CYAN+"Booking Details"+RESET+"------------------------------");
			System.out.println("   BooKIng ID  :"+Hotel1.obj4.getrandomNumber());
			System.out.println("   Full Name   :"+Hotel1.obj4.getName()+"\t\t\tGender : "+Hotel1.obj4.getgender());
			System.out.println("   Room Number :"+Hotel1.obj4.getroomnum()+"\t\t\tMobile Number: "+Hotel1.obj4.getmobnum());
			System.out.println("   Check In Date: "+Hotel1.obj4.getcheckIn()+"\t\tCheck Out Date : "+Hotel1.obj4.getcheckOut());
			System.out.println("   Stay In Days : "+Hotel1.obj4.getstaydays()+"\t\t\tPerDay Amount: "+Hotel1.obj4.geteachdayamt());
			System.out.println("   CSGST : "+Hotel1.obj4.getcgsamt()+"\t\t\tSCGST: "+Hotel1.obj4.getsgsamt());
			double d4 = Hotel1.obj4.getAmount();
			float f4 = (float)d4;
			System.out.printf("   Room Charges: %.2f\n",f4);
			System.out.println("   Tax:(cgst 5%+sgst 4%):"+Math.ceil(Hotel1.obj4.getcgsamt()+Hotel1.obj4.getsgsamt()));
            System.out.println("   Room Service Chrages: "+382.2);
			System.out.println("   Total Amount: "+Math.ceil(d4+Hotel1.obj4.getcgsamt()+Hotel1.obj4.getsgsamt()+382.20));
			System.out.println("---------------------------------------------------------------------------------------------------");
	}
	void cart5(int n)
	{
			System.out.println("--------------------------------------"+CYAN+"Booking Details"+RESET+"---------------------------------");
			System.out.println("   BooKIng ID  :"+Hotel1.obj5.getrandomNumber());
			System.out.println("   Full Name   :"+Hotel1.obj5.getName()+"\t\t\tGender : "+Hotel1.obj5.getgender());
			System.out.println("   Room Number :"+Hotel1.obj5.getroomnum()+"\t\t\tMobile Number: "+Hotel1.obj5.getmobnum());
			System.out.println("   Check In Date: "+Hotel1.obj5.getcheckIn()+"\t\tCheck Out Date : "+Hotel1.obj5.getcheckOut());
			System.out.println("   Stay In Days : "+Hotel1.obj5.getstaydays()+"\t\t\tPerDay Amount: "+Hotel1.obj5.geteachdayamt());
			System.out.println("   CSGST : "+Hotel1.obj5.getcgsamt()+"\t\t\tSCGST: "+Hotel1.obj5.getsgsamt());
			double d5 = Hotel1.obj5.getAmount();
			float f5 = (float)d5;
			System.out.printf("   Room Charges: %.2f\n",f5);
			System.out.println("   Tax:(cgst 5%+sgst 4%):"+Math.ceil(Hotel1.obj5.getcgsamt()+Hotel1.obj5.getsgsamt()));
            System.out.println("   Room Service Chrages: "+382.2);
			System.out.println("   Total Amount: "+Math.ceil(d5+Hotel1.obj5.getcgsamt()+Hotel1.obj5.getsgsamt()+382.20));
			System.out.println("------------------------------------------------------------------------------------------------------");
	}
	void cart6(int n)
	{
		    //String f6 = String.format("%.2f", );
			System.out.println("------------------------------------"+CYAN+"Booking Details"+RESET+"----------------------------------");
			System.out.println("   BooKIng ID  :"+Hotel1.obj6.getrandomNumber());
			System.out.println("   Full Name   :"+Hotel1.obj6.getName()+"\t\t\tGender : "+Hotel1.obj6.getgender());
			System.out.println("   Room Number :"+Hotel1.obj6.getroomnum()+"\t\t\tMobile Number: "+Hotel1.obj6.getmobnum());
			System.out.println("   Check In Date: "+Hotel1.obj6.getcheckIn()+"\t\tCheck Out Date : "+Hotel1.obj6.getcheckOut());
			System.out.println("   Stay In Days : "+Hotel1.obj6.getstaydays()+"\t\t\tPerDay Amount: "+Hotel1.obj6.geteachdayamt());
			System.out.println("   CSGST : "+Hotel1.obj6.getcgsamt()+"\t\t\tSCGST: "+Hotel1.obj6.getsgsamt());
			//System.out.println("   Total Amount:"+Hotel1.obj6.getAmount());
			double d6 = Hotel1.obj6.getAmount();
			float f6 = (float)d6;
			System.out.printf("   Room Charges: %.2f\n",f6);
			System.out.println("   Tax:(cgst 5%+sgst 4%):"+Math.ceil(Hotel1.obj6.getcgsamt()+Hotel1.obj6.getsgsamt()));
            System.out.println("   Room Service Chrages: "+382.2);
			System.out.println("   Total Amount: "+Math.ceil(d6+Hotel1.obj6.getcgsamt()+Hotel1.obj6.getsgsamt()+382.20));
			System.out.println("-----------------------------------------------------------------------------------------------------");
	}
	
}
class Payments
{
	static long sbi = 37763534226l;
    static long hdfc = 850263018116l;
	static String upi = "9346663792@ybl";
    static double amtsbi = 25600.00, amthdfc = 45000.00, amtupi1=16060.00;
    static int count1 = 0,count2 = 0,count3 = 0,countsbi=3,counthdfc=3,countupi=3;
	static Receipt resobj = new Receipt();

	// Reset
    public static final String RESET = "\033[0m";  // Text Reset
    // Blink
    public static final String blink = "\u001b[5m";

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

	void option()
	{
		System.out.println("Select Your Options:");
		System.out.println(" 1. \033[1;36mPaytm \u001B[0m");
		System.out.println(" 2. \033[1;36mGPay \u001B[0m");
		System.out.println(" 3. \033[1;36mPhone Pe \u001B[0m");
		System.out.println(" 4. \033[1;36mThrough UPI Id \u001B[0m");
		System.out.println(" 5. \033[1;36mGo To Cart \u001B[0m");
		System.out.println(" 6. \033[1;36mProfile\u001B[0m");
		System.out.println(" 7. "+RED+"Exit"+RESET);
		System.out.print("\u001B[33mEnter Your Option: "+RESET);
		int choice = Hotel1.sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println(GREEN+"Thanks For Selecting Patyam"+RESET);
			     Bank();
			case 2:
				System.out.println(GREEN+"Thanks For Selecting GPay"+RESET);
			     Bank();
			    break;
			case 3:
				System.out.println(GREEN+"Thanks For Selecting PhonePe"+RESET);
			    Bank();
			    break;
			case 4:
				System.out.println(GREEN+"Thanks For Selecting Through UPI ID"+RESET);
			     upiId();
			    break;
			case 5:
				Cart cart = new Cart();
			    if(Hotel1.funds==true)
					cart.displaydummy(2);
				else
					cart.displaydummy(1);
			    break;
			case 6:
				 Login objl = new Login();
				  objl.clearConsoleP1(1);
			case 7:
			       System.out.println(GREEN+"     Thank You...Revisit Again(:    "+RESET);
			       System.exit(0);
				   break;
			default :
				System.out.println(RED+"Plz select (1-6) beetween"+RESET);
			    option();
			
		}
	}
	void upiId()
	{
		System.out.print("\u001B[33mEnter a UPI Id:"+RESET);
		String upi1 = Hotel1.sc.next();
		if(upivalidation(upi1))
		{
			if(upi1.equals(upi))
			{
			      upiiD1();
			}
			else
			{
				System.out.println(RED+"'Deactivate' UPI Service In Your Bank Account? Plz 'Active' Your UPI Id TryAgian!!"+RESET);
				option();
			}
		}
		else
		{
			    System.out.println(RED+"Enter a valid UPI"+RESET);
				if(count2>=1)
				{
					System.out.println(YELLOW_BOLD+blink+"Enter of times "+count2+" Only"+RESET);
					count2-=1;
					upiId();
				}
				else
				{
					System.out.println(RED+"Number of Attempts Completed Payment Mode Try again"+RESET);
					count2=3;
					System.exit(0);
				}
		}
	}
	void Bank()
	{
		System.out.println("Select Your Bank");
		System.out.println(" \033[1;36m1.HDFC Bank\r\n"      
		                  +" 2.SBI Bank\r\n"
						  +" 3.Check Your Bank Balance?"+RESET+"\r\n"
						  +" 4."+RED+"Go Back"+RESET+"\r\n"
						  +" 5."+RED+"Exit"+RESET);
		System.out.print("\u001B[33mEnter a Option:"+RESET);
		int option = Hotel1.sc.nextInt();
		switch (option)
		{
		    case 1:
				  System.out.println(GREEN+"Thanks For Selecting HDFC Bank"+RESET);
			      hdfcamt();
			      break;
			case 2:
				System.out.println(GREEN+"Thanks For Selecting SBI Bank"+RESET);
			    sbiamt();
			    break;
			case 4:
				System.out.println(GREEN+"Thanks For Selecting Go Back"+RESET);
			    option();
			    break;
			case 3:
				System.out.println(GREEN+"Thanks For Selecting Check Balance"+RESET);
				bankac();
				break;
			case 5:
			     System.out.println(GREEN+"     Thank You...Revisit Again(:    "+RESET);
			     System.exit(0);
			    break;
			default :
				System.out.println(RED+"Plz select (1-4) beetween"+RESET);
				 Bank();
		}
	}
	String generateOTP4Digits() 
    {
        int randomPin = (int) (Math.random() * 9000) + 1000;
        return String.valueOf(randomPin);
    }
	void bankac()
	{
		System.out.println("Select Your Bank:");
		System.out.println(" \033[1;36m1.HDFC Bank\r\n"
		                  +" 2.SBI Bank \u001B[0m\r");
	    System.out.println("\u001B[33mSelect Your Option:"+RESET);
		int option = Hotel1.sc.nextInt();
		if(option==1)
			balanceAmthdfc();
		else
			balanceAmtsbi();				 
	}
	String agianotp()
	{
		String otp = generateOTP4Digits();
		return otp;
	}
	void balanceAmtsbi()
	{
		System.out.println(CYAN+"\n        *****Welcome To SBI Bank*******"+RESET);
		System.out.println(" Your Acount Balance Balance: "+amtsbi+"\n");
		Bank();
	}
	void balanceAmthdfc()
	{
		System.out.println(CYAN+"\n        *****welcome to HDFC Bank*******"+RESET);
		System.out.println(CYAN+" Your Acount Balance Balance: "+amthdfc+"\n"+RESET);
		Bank();
	}
	void sbiamt()
	{
		
		if(Hotel1.totalAmt<amtsbi)
		{
			String otp = generateOTP4Digits();
			System.out.println(GREEN+"4 Digite OTP is Successfully Genarated"+RESET);
			System.out.println("Generated OTP: "+otp);
			System.out.print("\u001B[33mEnter a OTP:"+RESET);
			String uotp = Hotel1.sc.next();
			 if(otp.equals(uotp))
			 {
				 amtsbi = amtsbi-Hotel1.totalAmt;
				 System.out.println(GREEN+"Success Your Payment(:"+RESET);
				 Hotel1.funds = true;
				 clearConsole2();
			 }
			 else
			 {
				 while(true)
				 {
					System.out.println(RED+"Your Enter a Worng otp! TryAgian"+RESET);
					System.out.println(GREEN+"4 Digite OTP is Successfully Genarated"+RESET);
					String otpr = agianotp();
					System.out.println("Generated OTP: "+otpr);
					System.out.print("\u001B[33mEnter a OTP:"+RESET);
					String myotp = Hotel1.sc.next();
					if(otpr.equals(myotp))
					{
				         agianotp();
						 amtsbi = amtsbi-Hotel1.totalAmt;
				         System.out.println(GREEN+"Success Your Payment(:"+RESET);
						 Hotel1.funds = true;
				         clearConsole2();
						 break;
					}
					else
					{
						System.out.println(YELLOW_BOLD+blink+"Maximum Number of Attamps: "+countsbi+" Only"+RESET);
						if(countsbi>=1)
						{
							countsbi-=1;
						}
						else
						{
							break;
						}
					}
			    }
			 }
		}
		else
		{
			System.out.println(RED+"Insufficient Funds");
			System.out.println("Check Your Balance!! Try AgaIn"+RESET);
			sbioption();
		}
	}
	void sbioption()
	{
		System.out.println(YELLOW+"If You Want Check Your SBI Balance!!!"+RESET);
		System.out.println("\033[1;36m1.Yes                            2.No"+RESET);
		System.out.print(YELLOW+"Enter Your Option: "+RESET);
		int option = Hotel1.sc.nextInt();
		if(option==1)
			balanceAmtsbi();
		else
			Bank();
	}
	void hdfcamt()
	{
		if(Hotel1.totalAmt<amthdfc)
		{
			String otp = generateOTP4Digits();
			System.out.println(GREEN+"4 Digits OTP is Successfully Generated"+RESET);
			System.out.println("Generated OTP: "+otp);
			System.out.print("\u001B[33mEnter a OTP:"+RESET);
			String uotp = Hotel1.sc.next();
			 if(otp.equals(uotp))
			 {
				 amthdfc = amthdfc-Hotel1.totalAmt;
				 System.out.println(GREEN+"Success Your Payment!!!"+RESET);
				 Hotel1.funds = true;
				 clearConsole2();
			 }
			 else
			 {
				 while(true)
				 {
					System.out.println(RED+"Your Enter a Wrong otp! TryAgaIn"+RESET);
					System.out.println(GREEN+"4 Digits OTP is Successfully Generated"+RESET);
					String otpr = agianotp();
					System.out.println("Generated OTP: "+otpr);
					System.out.print("\033[1;31mEnter a OTP:"+RESET);
					String myotp = Hotel1.sc.next();
					if(otpr.equals(myotp))
					{
				         agianotp();
						 amtsbi = amtsbi-Hotel1.totalAmt;
				         System.out.println(GREEN+"Success Your Payment(: !!!"+RESET);
						 Hotel1.funds = true;
				         clearConsole2();
						 break;
					}
					else
					{
						System.out.println(YELLOW_BOLD+blink+"Maximum Number of Attempts: "+counthdfc+" Only"+RESET);
						if(counthdfc>=1)
						{
							counthdfc-=1;
						}
						else
						{
							break;
						}
					}
			    }
			 }
		}
		else
		{
			System.out.println(RED+"Insufficient Funds"+RESET);
			System.out.println(CYAN+"Check Your Balance!! Try Agian"+RESET);
			option();
		}
	}
	void hdfcoption()
	{
		System.out.println("If You Want Check Your HDFC Balance!!!");
		System.out.println("\033[1;36m1.Yes                             2.No"+RESET);
		System.out.println(YELLOW_BOLD+"Enter Your Option: "+RESET);
		int option = Hotel1.sc.nextInt();
		if(option==1)
			balanceAmtsbi();
		else
			Bank();
	}
	void upiiD1()
	{
		if(Hotel1.totalAmt<amtupi1)
		{
			 String otp = generateOTP4Digits();
			 System.out.println(GREEN+"4 DigitS OTP is Successfully Generated"+RESET);
			 System.out.println("Generated OTP: "+otp);
			 System.out.print("\033[1;31mEnter a OTP:"+RESET);
			 String uotp = Hotel1.sc.next();
			 if(otp.equals(uotp))
			 {
				 amtupi1=amtupi1-Hotel1.totalAmt;
				 System.out.println(RESET+"Sucess Your Payment!!!"+RESET+"(: ");
				 Hotel1.funds = true;
				 clearConsole2();
			 }
			 else
			 {
				 while(true)
				 {
					System.out.println(RED+"Your Enter a Wrong otp! TryAgian"+RESET);
					System.out.println(GREEN+"4 Digits OTP is Successfully Generated"+RESET);
					String otpr = agianotp();
					System.out.println("Generated OTP: "+otpr);
					System.out.print("\033[1;31mEnter a OTP:"+RESET);
					String myotp = Hotel1.sc.next();
					if(otpr.equals(myotp))
					{
						 amtupi1=amtupi1-Hotel1.totalAmt;
				         System.out.println(GREEN+"Success Your Payment!!!"+RESET+"(: ");
						 Hotel1.funds = true;
				         clearConsole2();
						 break;
					}
					else
					{
						System.out.println(YELLOW_BOLD+blink+"Maximum Number of Attempts "+countupi+" Only"+RESET);
						if(countupi>=1)
						{
							countupi-=1;
						}
						else
						{
							System.out.println(RED+"Maximum Number of Attempts Completed Try...Again.."+RESET);
							System.exit(0);
						}
					}
			    } 
			 }
		}
		else
		{
			System.out.println(RED+"Insufficient Funds"+RESET);
			System.out.println(CYAN+"Check Your Balance!! Try Agian"+RESET);
			option();
		}
	}
	boolean upivalidation(String upi)
	{
		boolean res = false;
		String domian[] = {"@ybl","@axl","@ibl","@apl","@upi","@APL","@YAPL","@RAPL","@paytm","@bank","@okaxis","@okicici","@oksbi","@okcanara","@okyes"};
		for(int i=0; i<domian.length;i++)
		{
			if(upi.endsWith(domian[i]))
			{
				res = true;
				break;
			}
			else
				res = false; 
		}
		return res;
	}
	void clearConsole2()
    {
        try 
		{
			// For Windows
            if (System.getProperty("os.name").toLowerCase().contains("win")) 
	         {
				Thread.sleep(2000);
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				resobj.allIno();
             } 
	         else
	         {
                // For Unix-based systems
                System.out.print("\033[H\033[2J");
                System.out.flush();
             }
		} 
		catch (Exception e) 
		{
			 e.printStackTrace();
		}
	}
}
class Receipt 
{
	// Reset
    public static final String RESET = "\033[0m";  // Text Reset
    // Blink
    public static final String blink = "\u001b[5m";

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE
	static Hotel1 obj = new Hotel1();
    String generateTransactionId() 
    {
	    long timestamp = System.currentTimeMillis();
	    int randomNum = new Random().nextInt(1000); 
	    return "TNX" + timestamp + "U" + randomNum;
	}
	String generatebillNO() 
    {
         int randomPin = (int) (Math.random() * 9000) + 1000;
         return String.valueOf(randomPin);
    }
	String wordcon(int n)
	{
		String k = n+"";
		String word = "";
		String t[] = {"","ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		String w[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","eleven","twelve","thirteen","fourteen","fifteen","Sixteen","seventeen","eighteen","nineteen"};
		String x[] = {"","hundred","thousand","Lakh"};
		if(k.length()==4)
		{
			char ch1 = k.charAt(0);
			char ch2 = k.charAt(1);
			char ch3 = k.charAt(2);
			char ch4 = k.charAt(3);
			int y1 = ch1-'0';
			int y2 = ch2-'0';
			int y3 = ch3-'0';
			int y4 = ch4-'0';
			String s1 = "";
			s1 += k.charAt(2);
			s1 +=k.charAt(3);
			int m = Integer.parseInt(s1);
			if(y2==0 && y3==0 && y4==0)
				word = (w[y1]+" "+x[2]);
			else if(m>=11 && m<=19)
				word = (w[y1]+" "+x[2]+" "+w[y2]+" "+x[1]+" "+t[y3]+" "+w[m]);
			else if(k.length()==4)
			    word = (w[y1]+" "+x[2]+" "+w[y2]+" "+x[1]+" "+t[y3]+" "+w[y4]);
			    
		}
		else if(k.length()==5)
		{
			char ch1 = k.charAt(0);
			char ch2 = k.charAt(1);
			char ch3 = k.charAt(2);
			char ch4 = k.charAt(3);
			char ch5 = k.charAt(4);
			String s = "";
			s += k.charAt(0);
			s +=k.charAt(1);
			String s2 = "";
			s2+=k.charAt(3);
			s2 +=k.charAt(4);
		    int m = Integer.parseInt(s);
			int m1 = Integer.parseInt(s2);
			int y1 = ch1-'0';
			int y2 = ch2-'0';
			int y3 = ch3-'0';
			int y4 = ch4-'0';
			int y5 = ch5-'0';
			if(y2==0 && y3==0 && y4==0 && y5==0)
				word = (w[y1]+" "+x[2]);
			else if(m>=11 && m<=19)
			{
				 if(m1>=11 && m1<=19)
					 word = (w[m]+" "+x[2]+" "+w[y3]+" "+x[1]+" "+t[y4]+" "+w[m1]);
				 else
					 word = (w[m]+" "+x[2]+" "+w[y3]+" "+x[1]+" "+t[y4]+" "+w[y5]);
			}
			else if(k.length()==5)
			    word = (t[y1]+" "+w[y2]+" "+x[2]+" "+w[y3]+" "+x[1]+" "+t[y4]+" "+w[y5]);
		}
		else if(k.length()==6)
		{
			char ch1 = k.charAt(0);
			char ch2 = k.charAt(1);
			char ch3 = k.charAt(2);
			char ch4 = k.charAt(3);
			char ch5 = k.charAt(4);
			char ch6 = k.charAt(5);
			int y1 = ch1-'0';
			int y2 = ch2-'0';
			int y3 = ch3-'0';
			int y4 = ch4-'0';
			int y5 = ch5-'0';
			int y6 = ch6-'0';
			if(y2==0 && y3==0 && y4==0 && y5==0 && y6==0)
				word = (w[y1]+" "+x[3]);
			else if(k.length()==6)
			    word = (w[y1]+" "+x[3]+" "+t[y2]+" "+w[y3]+" "+x[2]+" "+w[y4]+" "+x[1]+" "+t[y5]+" "+w[y6]);
		}
		return word;
	}
	void chrspeed(int speed,String str1,String str2,String formatDate,String formattedTime)
	{
			
			String f1 = String.format("%.2f", Hotel1.totalcgstAmt);
			String f2 = String.format("%.2f", Hotel1.totalsgstAmt);
			String f3 = String.format("%.2f", Hotel1.totromA);
			String f4 = String.format("%.2f", Hotel1.totalAmt);
			String f5 = String.format("%.2f",Hotel1.tm);
			int r =  (int)Math.floor(Hotel1.totalAmt);
			String w = wordcon(r);
			try 
			{
				String str = ("+-----------------------------------------------------------------------+\r\n"
		                +"|\t\t\tHOTEL RECEIPT \t\t\t\t\t|\r\n"
					    +"|\tRestauarant Name:"+Hotel_Restrents.res_names+"\t\t|\r\n"
					    +"|\t1462 MAsonic Drive,Board View,,MT,Mt,59015 \t\t\t|\r\n"
					    +"|\t(123)2345690-Info@123hotel.com--www.hotel.com  \t\t\t|\r\n"
						+"|\tGST No:36AAQCS364G1Z6 \t\t\t\t\t\t|\r\n"
					    +"|\tDate:"+formatDate+"\t\t\tTime:"+formattedTime+"\t\t\t|\r\n"
					    +"+-----------------------------------------------------------------------+\r\n"
						+"|\tTransactionId:"+str1+"\t\t\t\t|\r\n"
						+"|\tReceiptID:"+str2+"A\t\t\t\t\t\t\t|\r\n"
					    +"|\tName:"+Hotel1.name+"\t\t\t\t\t\t\t|\r\n"
					    +"|\tPhone Number:"+Hotel1.usermob+"\t\t\t\t\t\t|\n"
					    +"|\tEmail:abcde@gmail.com\t\t\t\t\t\t|\r\n"
				        +"+-----------------------------------------------------------------------+\r\n"
						+"|\tPayMent Method: Online.\t\t\t\t\t\t|\r\n"
						+"|\tInvoicce.\t\t\t\t\t\t\t|\r\n"
						+"+-----------------------------------------------------------------------+\r\n"
						+"|\tCGST 5%:\t"+f1+"\t\t\t\t\t\t|\r\n"
						+"|\tSGSt 4%:\t"+f2+"\t\t\t\t\t\t|\r\n"
						+"|\tService Charges:"+f5+"\t\t\t\t\t\t|\r\n"
						+"|\tRoom Amount: "+f3+"\t\t\t\t\t\t|\r\n"
						+"|\t\t\t       -----------\t\t\t\t|\r\n"
						+"|\tTotal  Amount:\t\t"+f4+"\t\t\t\t\t|\r\n"
						+"|\t\t\t       -----------\t\t\t\t|\r\n" 
						+"|  "+w+" Rupees\t\t\t|\r\n"
						+"+-----------------------------------------------------------------------+\r\n"
						+"|Thank You!! Please Visit Again.\t\t\t\t\t|\r\n"
						+"|Design By **********\t\t\t\t\t\t\t|\r\n"
						+"+-----------------------------------------------------------------------+\r\n");
				for(int i=0; i<str.length(); i++)
				{
            		System.out.print(str.charAt(i));
            		Thread.sleep(speed);
				}
				BackInfo();
			} 
			catch (InterruptedException e) 
			{
				 Thread.currentThread().interrupt();
				 System.out.println("Thread was interrupted: " + e.getMessage());
			}
	    }
	void allIno() 
	{
	        Receipt obj = new Receipt ();
	        LocalDateTime datetime1 = LocalDateTime.now(); 
	        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
	        String formatDate = datetime1.format(format); 
	        LocalTime now = LocalTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
	        String formattedTime = now.format(formatter);
	     	String str1 = obj.generateTransactionId();
			String str2 =  generatebillNO();
		    obj.chrspeed(20,str1,str2,formatDate,formattedTime);  //Methode Calling 
	}
	void BackInfo()
	{
		System.out.println("Select Your Option");
		System.out.println("  \033[1;36m1.Profile\r\n"
		                  +"  2.Go To Cart\r\n"
		                  +"  3.Exit\u001B[0m\r\n");
		System.out.print("\u001B[33mEnter a Your Option:"+RESET);
		int option = Hotel1.sc.nextInt();
		switch(option)
		{
			case 1:
				  Login objl = new Login();
				  objl.clearConsoleP1(1);
			      break;
			case 2:
				 obj.dummy();
			     break;
			case 3:
				  clearConsole3();
			      break;
			default :
				System.out.println(RED+"Plz Select (1-3) options"+RED);
			    BackInfo();

		}
	}
	void clearConsole3()
    {
        try 
		{
			// For Windows
            if (System.getProperty("os.name").toLowerCase().contains("win")) 
	         {
				Thread.sleep(2000);
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				Logo logo = new Logo();
				logo.finalExit(2);
             } 
	         else
	         {
                // For Unix-based systems
                System.out.print("\033[H\033[2J");
                System.out.flush();
             }
		} 
		catch (Exception e)
		{
			 e.printStackTrace();
		}
	}
	
}
class Logo
{
	// Reset
    public static final String RESET = "\033[0m";  // Text Reset
    // Blink
    public static final String blink = "\u001b[5m";

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE

	void logos(int speed)
	{
		try{
	           String str = (
		         "\n"
			    +"\n"
			    +"\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+CYAN+"@"+RESET+"+++"+CYAN+"@"+RESET+"*+"+CYAN+"@@@@@@"+RESET+"%"+CYAN+"@@@@@@"+RESET+"*"+CYAN+"@@@@@"+RESET+"*"+CYAN+"@@"+RESET+"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+CYAN+"@"+RESET+"***"+CYAN+"@"+RESET+"**"+CYAN+"@"+RESET+"*++#"+CYAN+"@"+RESET+"*++"+CYAN+"@@"+RESET+"++*"+CYAN+"@"+RESET+"#**++"+CYAN+"@@"+RESET+"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+CYAN+"@@@@@"+RESET+"*#"+CYAN+"@"+RESET+"+++*"+CYAN+"@"+RESET+"*++"+CYAN+"@@"+RESET+"++*"+CYAN+"@@@@@"+RESET+"*"+CYAN+"@@"+RESET+"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+CYAN+"@"+RESET+"++*"+CYAN+"@"+RESET+"**"+CYAN+"@"+RESET+"#***"+CYAN+"@"+RESET+"+++"+CYAN+"@@"+RESET+"++*"+CYAN+"@"+RESET+"#**++"+CYAN+"@@"+RESET+"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+CYAN+"@"+RESET+"++*"+CYAN+"@"+RESET+"*+"+CYAN+"@@@@@@"+RESET+"+++"+CYAN+"@@"+RESET+"++*"+CYAN+"@@@@@"+RESET+"#"+CYAN+"@@@@@@"+RESET+"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+PURPLE_BOLD_BRIGHT+blink+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+RESET+"*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+PURPLE_BOLD_BRIGHT+blink+"%@"+RESET+"++++++++++++++++++++++++++++++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+PURPLE_BOLD_BRIGHT+blink+"%@"+RESET+"++++++++++++++++++++++++++++++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+PURPLE_BOLD_BRIGHT+blink+"%@"+RESET+"++"+PURPLE_BOLD_BRIGHT+blink+"@@@@@@@"+RESET+"*+#"+PURPLE_BOLD_BRIGHT+blink+"@@@@@@#"+RESET+"+*"+PURPLE_BOLD_BRIGHT+blink+"@@@@@@%"+RESET+"++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+PURPLE_BOLD_BRIGHT+blink+"%@"+RESET+"+*"+PURPLE_BOLD_BRIGHT+blink+"@#"+RESET+"*"+PURPLE_BOLD_BRIGHT+blink+"@#"+RESET+"*"+PURPLE_BOLD_BRIGHT+blink+"@"+RESET+"%%%"+PURPLE_BOLD_BRIGHT+blink+"%"+RESET+"+"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"*"+PURPLE_BOLD_BRIGHT+blink+"@#"+RESET+"+*"+PURPLE_BOLD_BRIGHT+blink+"@"+RESET+"*"+PURPLE_BOLD_BRIGHT+blink+"#@"+RESET+"+"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+PURPLE_BOLD_BRIGHT+blink+"@@"+RESET+"+*"+PURPLE_BOLD_BRIGHT+blink+"@@"+RESET+"%"+PURPLE_BOLD_BRIGHT+blink+"@%"+RESET+"%"+PURPLE_BOLD_BRIGHT+blink+"@"+RESET+"%#*"+PURPLE_BOLD_BRIGHT+blink+"%"+RESET+"@"+PURPLE_BOLD_BRIGHT+blink+"%@"+RESET+"@"+PURPLE_BOLD_BRIGHT+blink+"%@"+RESET+"#+"+PURPLE_BOLD_BRIGHT+blink+"*"+RESET+"@"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"@"+PURPLE_BOLD_BRIGHT+blink+"%@"+RESET+"%+"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*+"+PURPLE_BOLD_BRIGHT+blink+"%@"+RESET+"+*"+PURPLE_BOLD_BRIGHT+blink+"@#"+RESET+"*"+PURPLE_BOLD_BRIGHT+blink+"@%"+RESET+"*"+PURPLE_BOLD_BRIGHT+blink+"@"+RESET+"@*@"+PURPLE_BOLD_BRIGHT+blink+"%"+RESET+"+"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"*"+PURPLE_BOLD_BRIGHT+blink+"@#"+RESET+"+*"+PURPLE_BOLD_BRIGHT+blink+"@"+RESET+"*"+PURPLE_BOLD_BRIGHT+blink+"#@"+RESET+"+"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++%@%@"+PURPLE_BOLD_BRIGHT+blink+"@@"+RESET+"+*"+PURPLE_BOLD_BRIGHT+blink+"@@"+RESET+"%#++*%%%"+PURPLE_BOLD_BRIGHT+blink+"%"+RESET+"#"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"#"+PURPLE_BOLD_BRIGHT+blink+"@#"+RESET+"+*"+PURPLE_BOLD_BRIGHT+blink+"@"+RESET+"#"+PURPLE_BOLD_BRIGHT+blink+"%@"+RESET+"#"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*@*+%@%*%@#++*%@#++*******++*******++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++%%++%@@@#+++#@#++++++++++++++++++++++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*@#++@@#+++++#%@"+PURPLE_BOLD_BRIGHT+blink+"%%%%%%%%%%%%%%%%%%%%%%@@"+RESET+"%*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*@*++*+++++++++%@%*+++++++++++++++++++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++%%+++++++++++++++%@#*+++++++++++++++++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++#@*++++++++++++++++*%"+PURPLE_BOLD_BRIGHT+blink+"@@@@@@#"+RESET+"+*"+PURPLE_BOLD_BRIGHT+blink+"@@@@@@%"+RESET+"++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*%@*+++++++++++++++++#@"+PURPLE_BOLD_BRIGHT+blink+"%"+RESET+"+"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"*"+PURPLE_BOLD_BRIGHT+blink+"@#"+RESET+"+#"+PURPLE_BOLD_BRIGHT+blink+"@"+RESET+"*"+PURPLE_BOLD_BRIGHT+blink+"#%"+RESET+"+"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++#@#*+++++++++++++++++++#"+PURPLE_BOLD_BRIGHT+blink+"%"+RESET+"+"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"*"+PURPLE_BOLD_BRIGHT+blink+"@#"+RESET+"#+"+PURPLE_BOLD_BRIGHT+blink+"@"+RESET+"*"+PURPLE_BOLD_BRIGHT+blink+"#%"+RESET+"+"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++#@%*+++++++++++++++++*%%*%"+PURPLE_BOLD_BRIGHT+blink+"%"+RESET+"+"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"*"+PURPLE_BOLD_BRIGHT+blink+"@#"+RESET+"+#"+PURPLE_BOLD_BRIGHT+blink+"@"+RESET+"*"+PURPLE_BOLD_BRIGHT+blink+"#%"+RESET+"+"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++#@*++++++++++++++++*%@@*+%"+PURPLE_BOLD_BRIGHT+blink+"%"+RESET+"+"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"*"+PURPLE_BOLD_BRIGHT+blink+"@#"+RESET+"+#"+PURPLE_BOLD_BRIGHT+blink+"@"+RESET+"*"+PURPLE_BOLD_BRIGHT+blink+"#%"+RESET+"+"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*@%+++++++++++++#@%***++********++*******++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*#@#+++++++*%@@#*+++++++++++++++++++++++++"+PURPLE_BOLD_BRIGHT+blink+"%%"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*%@#+*#%@@%"+PURPLE_BOLD_BRIGHT+blink+"#############################%%#"+RESET+"*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*%@@#*************************************++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t+++++++++++++++++++++++++++++++++++++++++++++++++++++"+BLUE_BOLD+"@"+RESET+"+++"+BLUE_BOLD+"@@"+RESET+"+"+BLUE_BOLD+"#@**@#"+RESET+"*"+BLUE_BOLD+"#%@#"+RESET+"*"+BLUE_BOLD+"#@##"+RESET+"**"+BLUE_BOLD+"@"+RESET+"*+++++"+BLUE_BOLD+"%#*%#"+RESET+"+"+BLUE_BOLD+"#@#*%%"+RESET+"+*"+BLUE_BOLD+"%#*#@"+RESET+"**"+BLUE_BOLD+"@"+RESET+"**"+BLUE_BOLD+"@"+RESET+"**"+RED_BOLD+"@"+RESET+"*"+BLUE_BOLD+"#@"+RESET+"*++"+BLUE_BOLD+"@"+RESET+"**"+BLUE_BOLD+"%%#*#"+RESET+"+++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t+++++++++++++++++++++++++++++++++++++++++++++++++++++"+BLUE_BOLD+"@###@@"+RESET+"+"+BLUE_BOLD+"@"+RESET+"++++"+BLUE_BOLD+"%#"+RESET+"+"+BLUE_BOLD+"#%"+RESET+"++"+BLUE_BOLD+"#%##"+RESET+"**"+BLUE_BOLD+"@"+RESET+"*+++++"+BLUE_BOLD+"%##%"+RESET+"**"+BLUE_BOLD+"@*"+RESET+"+++"+BLUE_BOLD+"%#"+RESET+"%"+BLUE_BOLD+"#"+RESET+"+++"+BLUE_BOLD+"*@"+RESET+"*"+BLUE_BOLD+"@%%"+RESET+"++*"+BLUE_BOLD+"@"+RESET+"*"+BLUE_BOLD+"##%"+RESET+"#+"+BLUE_BOLD+"@"+RESET+"*"+BLUE_BOLD+"@#"+RESET+"++**+++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t+++++++++++++++++++++++++++++++++++++++++++++++++++++"+BLUE_BOLD+"@"+RESET+"+++"+BLUE_BOLD+"@@"+RESET+"*"+BLUE_BOLD+"@"+RESET+"*+++"+BLUE_BOLD+"@*"+RESET+"+"+BLUE_BOLD+"#%"+RESET+"++"+BLUE_BOLD+"#%"+RESET+"+++*"+BLUE_BOLD+"@"+RESET+"*+++++"+BLUE_BOLD+"%#"+RESET+"+*"+BLUE_BOLD+"@"+RESET+"*"+BLUE_BOLD+"@"+RESET+"*+++"+BLUE_BOLD+"%*"+RESET+"%"+BLUE_BOLD+"#"+RESET+"+++*"+BLUE_BOLD+"%"+RESET+"*"+BLUE_BOLD+"@"+RESET+"*%"+BLUE_BOLD+"#"+RESET+"+*"+BLUE_BOLD+"@"+RESET+"*"+BLUE_BOLD+"##"+RESET+"+"+BLUE_BOLD+"%"+RESET+"#"+BLUE_BOLD+"@"+RESET+"*"+BLUE_BOLD+"@#"+RESET+"++"+BLUE_BOLD+"*%*"+RESET+"++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t+++++++++++++++++++++++++++++++++++++++++++++++++++++"+BLUE_BOLD+"@"+RESET+"*++"+BLUE_BOLD+"@@"+RESET+"+"+BLUE_BOLD+"#@##@#"+RESET+"++"+BLUE_BOLD+"#%"+RESET+"++"+BLUE_BOLD+"#@###"+RESET+"*"+BLUE_BOLD+"@###"+RESET+"*++"+BLUE_BOLD+"%%#%#"+RESET+"+*"+BLUE_BOLD+"@##%#"+RESET+"+*%"+BLUE_BOLD+"%#%%"+RESET+"**"+BLUE_BOLD+"@"+RESET+"*+#"+BLUE_BOLD+"%"+RESET+"*"+BLUE_BOLD+"@"+RESET+"*"+"##"+RESET+"++"+BLUE_BOLD+"#@"+RESET+"*+"+BLUE_BOLD+"%%##@"+RESET+"*++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n"
				+ "\t\t\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n");
		    for(int i=0; i<str.length(); i++)
			{
				System.out.print(str.charAt(i));
				Thread.sleep(speed);
			}
			Login obj = new Login();
			obj.login_main();
		}
		catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
			System.out.println("Thread was interrupted: " + e.getMessage());
		}
	}
	void finalExit(int speed)
	{
		 String str6 =GREEN+"\t\t\t"+" _____ _                 _     __   __              \r\n"
				+ "\t\t\t"+"|_   _| |__   __ _ _ __ | | __ \\ \\ / /__  _   _     \r\n"
				+ "\t\t\t"+"  | | | '_ \\ / _` | '_ \\| |/ /  \\ V / _ \\| | | |    \r\n"
				+ "\t\t\t"+"  | | | | | | (_| | | | |   <    | | (_) | |_| |    \r\n"
				+ "\t\t\t"+"__|_| |_|_|_|\\__,_|_| |_|_|\\_\\   |_|\\___/ \\__,_|  _ \r\n"
				+ "\t\t\t"+"\\ \\   / (_)___(_) |_     / \\   __ _  __ _(_)_ __ | |\r\n"
				+ "\t\t\t"+" \\ \\ / /| / __| | __|   / _ \\ / _` |/ _` | | '_ \\| |\r\n"
				+ "\t\t\t"+"  \\ V / | \\__ \\ | |_   / ___ \\ (_| | (_| | | | | |_|\r\n"
				+ "\t\t\t"+"   \\_/  |_|___/_|\\__| /_/   \\_\\__, |\\__,_|_|_| |_(_)\r\n"
				+ "\t\t\t"+"                              |___/                 "+RESET;
				System.out.println(str6);
				System.exit(0);

	}
	void pname(int speed)
	{
		 
		try
		{
			String str = (
				      "\n"
			        + "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "\n\n"
					+ "\n"
					+"\n"
					+"\n"
					+"\n"
					+"\n"
					+"\n"
					+"\n"
					+"\n"
					+"\r\n"
					+"\t\t\t----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n"
					+ YELLOW_BRIGHT+"\t\t\t __    __              __                __        _______                                                                 __      __                             ______                         __                             \r\n"
					+ "\t\t\t/  |  /  |            /  |              /  |      /       \\                                                               /  |    /  |                           /      \\                       /  |                            \r\n"
					+ "\t\t\t$$ |  $$ |  ______   _$$ |_     ______  $$ |      $$$$$$$  |  ______    _______   ______    ______   __     __  ______   _$$ |_   $$/   ______   _______        /$$$$$$  | __    __   _______  _$$ |_     ______   _____  ____  \r\n"
					+ "\t\t\t$$ |__$$ | /      \\ / $$   |   /      \\ $$ |      $$ |__$$ | /      \\  /       | /      \\  /      \\ /  \\   /  |/      \\ / $$   |  /  | /      \\ /       \\       $$ \\__$$/ /  |  /  | /       |/ $$   |   /      \\ /     \\/    \\ \r\n"
					+ "\t\t\t$$    $$ |/$$$$$$  |$$$$$$/   /$$$$$$  |$$ |      $$    $$< /$$$$$$  |/$$$$$$$/ /$$$$$$  |/$$$$$$  |$$  \\ /$$/ $$$$$$  |$$$$$$/   $$ |/$$$$$$  |$$$$$$$  |      $$      \\ $$ |  $$ |/$$$$$$$/ $$$$$$/   /$$$$$$  |$$$$$$ $$$$  |\r\n"
					+ "\t\t\t$$$$$$$$ |$$ |  $$ |  $$ | __ $$    $$ |$$ |      $$$$$$$  |$$    $$ |$$      \\ $$    $$ |$$ |  $$/  $$  /$$/  /    $$ |  $$ | __ $$ |$$ |  $$ |$$ |  $$ |       $$$$$$  |$$ |  $$ |$$      \\   $$ | __ $$    $$ |$$ | $$ | $$ |\r\n"
					+ "\t\t\t$$ |  $$ |$$ \\__$$ |  $$ |/  |$$$$$$$$/ $$ |      $$ |  $$ |$$$$$$$$/  $$$$$$  |$$$$$$$$/ $$ |        $$ $$/  /$$$$$$$ |  $$ |/  |$$ |$$ \\__$$ |$$ |  $$ |      /  \\__$$ |$$ \\__$$ | $$$$$$  |  $$ |/  |$$$$$$$$/ $$ | $$ | $$ |\r\n"
					+ "\t\t\t$$ |  $$ |$$    $$/   $$  $$/ $$       |$$ |      $$ |  $$ |$$       |/     $$/ $$       |$$ |         $$$/   $$    $$ |  $$  $$/ $$ |$$    $$/ $$ |  $$ |      $$    $$/ $$    $$ |/     $$/   $$  $$/ $$       |$$ | $$ | $$ |\r\n"
					+ "\t\t\t$$/   $$/  $$$$$$/     $$$$/   $$$$$$$/ $$/       $$/   $$/  $$$$$$$/ $$$$$$$/   $$$$$$$/ $$/           $/     $$$$$$$/    $$$$/  $$/  $$$$$$/  $$/   $$/        $$$$$$/   $$$$$$$ |$$$$$$$/     $$$$/   $$$$$$$/ $$/  $$/  $$/ \r\n"
					+ "\t\t\t                                                                                                                                                                          /  \\__$$ |                                            \r\n"
					+ "\t\t\t                                                                                                                                                                          $$    $$/                                             \r\n"
					+ "\t\t\t                                                                                                                                                                           $$$$$$/                                              \r\n"
			        + "\t\t\t------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"+RESET+"\r\n"
					+"\t\t\t................................................................................................"+YELLOW+"-----------MyBooking.com------------"+RESET+".................................................................................................");

            		/*+ YELLOW_BRIGHT+"\t\t\t\t......  .......         .....            ..++..     .......                                                            ....   ...                           ...........                 ......                          \r\n"
            		+ "\t\t\t\t#%-    .-%+...          .=+...           .#%..     =%%%%%%#:                                                          .+=. ..#%+                           ..=%%%%%%:.                 .=+..                              \r\n"
            		+ "\t\t\t\t#%-..  .-%+..............#%....  .....   .#%..     =%*....%%..  .......  ......   ....... ..........    ........... ...%*........   ...... ..........      .+%*.......... ..............#%..... ...... .................  \r\n"
            		+ "\t\t\t\t#%-..  .-%+ ..#%%##%%+.+%%%%%#..#%%*#%%:..#%.      =%*  .:%#...#%%*%%#:..%%#*%#..:%%#*%%#...%%@%%#*%=.  .#%-=%%##%%=.##%%%%=.#%-. =%%##%%%: .*%%%##%%-.    ..%%=.....=%+.. .+%=-%%*#%#+%%%%%#..*%%*#%%:..#%%%*%%##%##%%...\r\n"
            		+ "\t\t\t\t#%%%%%%%%%+..#%.....*%*..%%.. .%%.....%%..#%.      =%%%%%%-...%%.....%#.=%+......%#.....%*..%%..  .#@...+%*..... .#%...%*   .#%-.:%*. ...#%..*%-....%#.    ...-#%%%:..#%-..:%*.*%:....  #%....#%.....%%..#%:  .+%=.. -%#..\r\n"
            		+ "\t\t\t\t#%-    .-%+ :%*...  :%#..%%.. .%%%%%%%%%..#%.      =%*..:%%..:%%%%%%%%#..:#%%*-.-%%%%%%%%*..%*    ..%#..%#...*%%%%%%...%*   .#%-.#%=  ...*%-.*%.   .%%.      .. ..+%#..%%..#%...-%@%*...#%....%%%%%%%%%..#%.   =%-.  :%#..\r\n"
            		+ "\t\t\t\t#%-    .-%+ .%%.....*%+..%%....#%.........#%.      =%*....%#..%%.............*%-.%#. .......%*..  ..+%##%...%#....#%...%*....#%-.=%*.....#%..*%.   .%%.    ........%%..:%*#%-.......#%..#%....#%.........#%.   =%-.  :%#..\r\n"
            		+ "\t\t\t\t#%-    .-%+..:%%#**%%=...+%***..%%#***%*..#%.      =%* ...=%#.:%%****%=.%%*+*%#..-%@*+*#%+..%*...   .*%%=...*%#**%%%...#%**+.#%-..+%%*+#%%:..*%.. ..%%.    .#%%**#%%:...+%%=...%%*+#%*..=%#*#..#%#+**%*..#%.  .=%-.  :%#..\r\n"
            		+ "\t\t\t\t....    ................. ....................      ....   ...................... ...............    .....   ..................... .......... .... .....    ..........- %#.   .............................  ...... .....\r\n"
            		+ "\t\t\t\t                                                                                                                                                                       #%#..                                              "+RESET+"\r\n" 
            		+ "\t\t\t\t............................................................................................................................................................................................................................\r\n"
					+"                                                                                                                                        "+CYAN+"    Version: 2024.08.26.2000      "+RESET+"                                                                                 \r\n"
					+"\t\t\t\t------------------------------------------------------------------------------------------------------"+YELLOW+"-----------MyBooking.com------------"+RESET+"-------------------------------------------------------------------------------"); */

		    for(int i=0; i<str.length(); i++)
			{
            	System.out.print(str.charAt(i));
            	Thread.sleep(speed);
			}
			clearConsolef();
		}
		catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
			System.out.println("Thread was interrupted: " + e.getMessage());
		}
	}
	void clearConsolef()
    {
        try 
		{
			// For Windows
            if (System.getProperty("os.name").toLowerCase().contains("win")) 
	         {
				Thread.sleep(6000);
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				logos(2);
             } 
	         else
	         {
                // For Unix-based systems
                System.out.print("\033[H\033[2J");
                System.out.flush();
             }
		} 
		catch (Exception e)
		{
			 e.printStackTrace();
		}
	}
}
class Foodie
{
          static Scanner sc=new Scanner(System.in);
          double c=0;
		  public static final String RESET = "\033[0m";  // Text Reset
		 // Blink
		 public static final String blink = "\u001b[5m";

		// Regular Colors
		 public static final String BLACK = "\033[0;30m";   // BLACK
		 public static final String RED = "\033[0;31m";     // RED
		 public static final String GREEN = "\033[0;32m";   // GREEN
         public static final String YELLOW = "\033[0;33m";  // YELLOW
         public static final String BLUE = "\033[0;34m";    // BLUE
         public static final String PURPLE = "\033[0;35m";  // PURPLE
         public static final String CYAN = "\033[0;36m";    // CYAN
         public static final String WHITE = "\033[0;37m";   // WHITE
          void loc()
          {
			    System.out.println(GREEN+"**Select Your Location**"+RESET);
                System.out.println(" 1.Hyderabad");
                System.out.println(" 2.Chennai");
                System.out.println(" 3.Banglore");
                System.out.println(" 4.Mumbai");
                System.out.println(" 5.Kolkata");
				System.out.print(YELLOW+"Enter Your Option:"+RESET);
                int a=sc.nextInt();
                if(a==1)
                    hyderabad();
                else if(a==2)
                    chennai();
                else if(a==3)
                    banglore();
                else if(a==4)
                    mumbai();
                else if(a==5)
                    kolkata();
                else
                {
                    System.out.println(RED+"Invalid Input please select between 1 to 5"+RESET);
                    loc();
                }
          }
          void res()
          {
                System.out.println(GREEN+"**Select any restaurant of your choice**"+RESET);
                System.out.println(" 1.Mehfil");
                System.out.println(" 2.Paradise");
                System.out.println(" 3.Kritunge");
                System.out.println(" 4.Pista House");
                System.out.println(" 5.MCD");
				System.out.print(YELLOW+"Enter Your Option:"+RESET);
                int a=sc.nextInt();
                if(a==1)
                    mehfil();
                else if(a==2)
                    paradise();
                else if(a==3)
                    kritunge();
                else if(a==4)
                    pista();
                else if(a==5)
                    mcd();
                else
                {
                    System.out.println(RED+"Invalid Input please select between 1 to 6"+RESET);
                    loc();
                }
         }
         void type()
         {
                System.out.println(GREEN+"**Select your dish type**"+RESET);
                System.out.println(" 1.Veg");
                System.out.println(" 2.Non-Veg");
				System.out.print(YELLOW+"Enter Your Option:"+RESET);
                int a=sc.nextInt();
                if(a==1)
                    veg();
                else if(a==2)
                    non();
                else
                {
                    System.out.println(RED+"Invalid Input please select 1 or 2"+RESET);
                    loc();
                }

         }
          void hyderabad()
          {
                  res();  
         }
         void chennai()
         {
                  res();
         }
         void banglore()
         {
                  res();
         }
         void mumbai()
         {
                  res();
         }
         void kolkata()
         {
                  res();
         }
         void mehfil()
         {
                  type();
         }
         void paradise()
         {
                  type();
         }
         void kritunge()
         {
                  type();
         }
         void pista()
         {
                  type();
         }
         void mcd()
         {
                 type();
         }
         void veg()
         {
                System.out.println(GREEN+"**select your dish**"+RESET);
                System.out.println(" 1.Veg biryani      - 200/-");
                System.out.println(" 2.Panner biryani   - 260/-");
                System.out.println(" 3.Kaju biryani     - 280/-");
                System.out.println(" 4.Mushroom biryani - 260/-");
                System.out.println(" 5.Gongura biryani  - 250/-");
                System.out.println(" 6.Butternaan       - 50/-");
                System.out.println(" 7.Kaju curry       - 250/-");
                System.out.println(" 8.Panner curry     - 200/-");
                System.out.println(" 9.Methichaman      - 200/-");
                System.out.println(" 10.Curd rice       - 80/-");
				System.out.print(YELLOW+"Enter Your Option:"+RESET);
                int a=sc.nextInt();
                if(a==1)
                    vb();
                else if(a==2)
                    pb();
                else if(a==3)
                    kb();
                else if(a==4)
                    mb();
                else if(a==5)
                    gb();
                else if(a==6)
                    bn();
                else if(a==7)
                    kc();
                else if(a==8)
                    pc();
                else if(a==9)
                    mc();
                else if(a==10)
                    cr();
                else
                {
                    System.out.println(RED+"Invalid Input please select between 1 to 10"+RESET);
                    loc();
                }
         }       
         void non()
         {
                System.out.println(GREEN+"**Select your dish**"+RESET);
                System.out.println(" 1.Chicken biryani      - 250/-");
                System.out.println(" 2.Chicken fry biryani  - 300/-");
                System.out.println(" 3.Mogalai biryani      - 300/-");
                System.out.println(" 4.Wings biryani        - 300/-");
                System.out.println(" 5.Mutton biryani       - 350/-");
                System.out.println(" 6.Fish biryani         - 280/-");
                System.out.println(" 7.Prawns biryani       - 280/-");
                System.out.println(" 8.Butternaan           - 50/-");
                System.out.println(" 9.Sp chicken curry     - 250/-");
                System.out.println(" 10.Mutton curry        - 300/-");
				System.out.print(YELLOW+"Enter Your Opetion: "+RESET);
                int a=sc.nextInt();
                if(a==1)
                    cb();
                else if(a==2)
                    cfb();
                else if(a==3)
                    mob();
                else if(a==4)
                    wb();
                else if(a==5)
                    mub();
                else if(a==6)
                    fb();
                else if(a==7)
                    prb();
                else if(a==8)
                    bn();
                else if(a==9)
                    scc();
                else if(a==10)
                    muc();
                else
                {
                    System.out.println(RED+"Invalid Input please select between 1 to 10"+RESET);
                    loc();
                }
         }
         void vb()
         {
                System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                int n=sc.nextInt();	
                int price=n*200;
                System.out.println("Veg biryani:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         } 
         void pb()
         {
			    System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                
                int n=sc.nextInt();
                int price=n*260;
                System.out.println("Panner biryani:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         } 
         void kb()
         {
                System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                int n=sc.nextInt();
                int price=n*280;
                System.out.println("Kaju biryani:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         } 
         void mb()
         {
                System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                int n=sc.nextInt();
                int price=n*260;
                System.out.println("Mushroom biryani:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         }
         void gb()
         {
                System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                int n=sc.nextInt();
                int price=n*250;
                System.out.println("Gongura biryani:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         }
         void bn()
         {
                System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                int n=sc.nextInt();
                int price=n*50;
                System.out.println("Butternaan:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         } 
         void kc()
         {
                System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                int n=sc.nextInt();
                int price=n*250;
                System.out.println("Kaju curry:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         }
         void pc()
         {
                System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                int n=sc.nextInt();
                int price=n*200;
                System.out.println("Panner curry:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         }
         void mc()
         {
                System.out.println("Enter no of quantity(1 or 2 or More):");
                int n=sc.nextInt();
                int price=n*200;
                System.out.println("Methichaman:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         }
         void cr()
         {
                System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                int n=sc.nextInt();
                int price=n*80;
                System.out.println("Curd rice:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         } 
         void cb()
         {
                System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                int n=sc.nextInt();
                int price=n*250;
                System.out.println("Chicken biryani:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         }
         void cfb()
         {
                System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                int n=sc.nextInt();
                int price=n*300;
                System.out.println("Chicken fry biryani:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         }
         void mob()
         {
                System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                int n=sc.nextInt();
                int price=n*300;
                System.out.println("Mogalai biryani:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         }
         void wb()
         {
                System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                int n=sc.nextInt();
                int price=n*300;
                System.out.println("Wings biryani:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         }
         void mub()
         {
                System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                int n=sc.nextInt();
                int price=n*350;
                System.out.println("Mutton biryani:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         }
         void fb()
         {
                System.out.println("Enter no of quantity(1 or 2 or More):");
                int n=sc.nextInt();
                int price=n*280;
                System.out.println("Fish biryani:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         }
         void prb()
         {
                System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                int n=sc.nextInt();
                int price=n*280;
                System.out.println("Prawns biryani:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         }
         void scc()
         {
                System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                int n=sc.nextInt();
                int price=n*250;
                System.out.println("Sp chicken curry:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         } 
         void muc()
         {
                System.out.print(YELLOW+"Enter no of quantity(1 or 2 or More):"+RESET);
                int n=sc.nextInt();
                int price=n*300;
                System.out.println("Mutton curry:"+n);
                System.out.println("price:"+price+"/-");
                yes(price);
         }
         void yes(int d)
         { 
                c+=d;
                System.out.println(GREEN+"**Do you want any other items**"+RESET);
                System.out.println(BLUE+" 1.Yes"+RESET);
                System.out.println(BLUE+" 2.No"+RESET);
				System.out.print(YELLOW+"Enter Your Option:"+RESET);
                int a=sc.nextInt();
                if(a==1)
                    dish();
                else
                {  
                    System.out.print(YELLOW+"Price of selected items:"+RESET);
                    System.out.println(c+"/-");
                    System.out.println("GST:");
                    System.out.println(CYAN+"\tCGST:     5%  of  "+c+"  "+((c/100)*5)+"/-"+RESET);
                    System.out.println(CYAN+"\tSGST:     5%  of  "+c+"  "+((c/100)*5)+"/-"+RESET);
                    System.out.println(CYAN+"Delivery charges:49/-"+RESET);
                    System.out.print(CYAN+"Total price:"+RESET);
                    System.out.print(no(c));
                    System.out.println("/-");
                    payment(no(c));
                }
         }
         double no(double c)
         {
            c=c+(2*((c/100)*5))+49;
            return c;
         }
         void dish()
         {
                System.out.println(BLUE+" 1.Veg"+RESET);
                System.out.println(BLUE+" 2.Non-veg"+RESET);
                int b=sc.nextInt();
                if(b==1)
                    veg();
                else if(b==2)
                    non();
         }
         void payment(double p)
         {
               System.out.println(GREEN+"**Payment type**"+RESET);
               System.out.println(BLUE+" 1.Cash on delivery"+RESET);
               System.out.println(BLUE+" 2.UPI payment"+RESET);
			   System.out.print(YELLOW+"Enter Your Option:"+RESET);
               int t=sc.nextInt();
               if(t==1)
			   {
                 System.out.println(GREEN+"Order placed"+RESET);
				 exit();
			   }
               else if(t==2)
               {
					System.out.print(GREEN+"Enter your UPI id"+RESET);
					String upi=sc.next() ;
					System.out.println();
					System.out.println(YELLOW+"Enter your 4 digit secret pin"+RESET);
                    int pin=sc.nextInt();
					System.out.print(YELLOW+"Your payment of rupees"+RESET);
					System.out.printf(BLUE+"%.2f",p +RESET);
					System.out.println(GREEN+"/- successful"+RESET);
					System.out.println(GREEN+"Order placed"+RESET);
					exit();
               }
         }
		void exit()
	    {
			System.out.println(YELLOW+"Select Your Option:"+RESET);
			System.out.println(BLUE+"1.Profile           2.Exit"+RESET);
			int option = sc.nextInt();
			Login obj = new Login();
			switch(option)
			{
				case 1:
					  obj.clearConsoleP1(1);
				      break;
			    case 2:
					  obj.clearConsoleP1(3);
					  break;
				default:
					System.out.println("Select Your Option b/w(1 or 2))");
					exit();
			}
		}
}
class Test
{
	public static void main(String[] args)
	{
		Logo logo = new Logo();
		logo.pname(2);
	}
}


                  