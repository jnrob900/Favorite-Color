import java.util.*;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
@SupportedSourceVersion(SourceVersion.RELEASE_8)
class Magazine
{

String name;
String author;
int publishYear;
int pages;


  
Magazine(String name, String author, int publishYear, int pages) throws Exception//constructors
{
//check if name is Empty
if ("".equals(name))
{
throw new Exception("EmptyStringException");
}
//check if author is Empty
if ("".equals(author))
{
throw new Exception("EmptyStringException");
}
//check if publishYear is less than 1900
if (publishYear < 1900)
{
throw new Exception("InvalidPublishYearException");
}
this.author = author;
this.name = name;
this.publishYear = publishYear;
this.pages = pages;
System.out.println( "GOOD JOB ");

}

  
String getName() //return values
{
return name;
}
String getAuthor()
{
return author;
}
int getPublishYear()
{
return publishYear;
}
int getPages()
{
return pages;
}

};

public class Main
{
public static void main(String argv[])
{
String name;
String author;
int year;
int pages;
char ans;
Scanner sc = new Scanner(System.in);
do
{
  
System.out.print( "*************************Welcome to my Library********************************************" ); //Inputs the infomration from the customer
System.out.println();
System.out.print( "What is the name of your book : ");
name=sc.next();
System.out.println();
System.out.print( "Who is the author : ");
author=sc.next();
System.out.println();
System.out.print("What year was the book published :");
year=sc.nextInt();
System.out.println();
System.out.print( "Number of Pages :");
pages=sc.nextInt();
System.out.println();

try
{

Magazine Book = new Magazine(name, author, year, pages);
}
catch (Exception e)
{
//prints the error message
System.out.println(e);
return ;
}

System.out.print("Do you want to run again? (y/n) ");
ans = sc.next().charAt(0);
System.out.println();

}
while (ans == 'Y' || ans == 'y');

return ;
}
}