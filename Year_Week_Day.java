public class Year_Week_Day
{ 
public static void main (string args[])
{
int X,year,week,day;
Scanner s= new Scanner(System.in);
System.out.print (" enter the number of days :");
X=s.nextInt();
year=X/365;
X=X%365;
System.out.println(" no.of yeras :" +year);
week=X/7;
X=X%7;
System.out.println(" no.of weeks :" +week);
day=X;
System.out.println(" no.of days:" +day );
}
}