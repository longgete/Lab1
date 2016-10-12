import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.elephant.data.Expression;
public class UserIn {
	
	String userinput = "";
	Expression myexpression=new Expression();
	
	public void userinput()
	{
		Scanner in = new Scanner(System.in);
		userinput = in.nextLine();
	}
	
	
	//匹配用户输入数据
	public void match()
	{
		String monomial = "(\\s*)(\\d+|[a-zA-Z]+(\\^\\d+)?)(\\s*)((\\*(\\s*)(\\d+|[a-zA-Z]+(\\^\\d+)?)(\\s*))*)";
		
		Pattern expressionP = Pattern.compile("(("+monomial+"){1}?)(((\\+|\\-)"+monomial+")*)");
		Matcher expressionM = expressionP.matcher(userinput);
		
		Pattern simplifyP = Pattern.compile("!simplify((\\s*)([a-zA-Z]+=\\d+))*");
		Matcher simplifyM = simplifyP.matcher(userinput);
		
		Pattern derivativeP = Pattern.compile("!d/d(\\s*)[a-zA-Z]+");
		Matcher derivativeM = derivativeP.matcher(userinput);
		
		if(expressionM.matches())
		{
			myexpression.getExpression(userinput);
			
        }
		else if(simplifyM.matches())
		{
			myexpression.simplify(userinput);
		}
		else if(derivativeM.matches())
		{
			myexpression.derivative(userinput);
		}
		else
		{
			System.out.println("input error!");
		}
		
		
	}
	
	
	//程序入口函数
	public static void  main(String[] args)
	{
		UserIn myuser = new UserIn();
		while(!myuser.userinput.equals("exit"))//输入exit，程序退出
		{
<<<<<<< HEAD
			System.out.println("这是第一次修改的结果");
=======
			
>>>>>>> a6bf7ac19e26c53685f05da39e935174c3feaf95
			myuser.userinput();
			myuser.match();
		}
		
    }
}
<<<<<<< HEAD
=======
//修改1
//B2分支上的修改
//实验场景2：分支管理.4
//实验场景2：分支管理.5
//解决冲突

>>>>>>> a6bf7ac19e26c53685f05da39e935174c3feaf95
