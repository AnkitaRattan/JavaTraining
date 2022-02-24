package string;
import java.util.*;
public class Stringjoiner
{
public static void main(String[] args)
{

StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter

joinNames.add("Rahul");
joinNames.add("Raju");
joinNames.add("Peter");
joinNames.add("Raheem");
System.out.println(joinNames);
}
}