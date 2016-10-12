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
	
	
	//ƥ���û���������
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
	
	
	//������ں���
	public static void  main(String[] args)
	{
		UserIn myuser = new UserIn();
		while(!myuser.userinput.equals("exit"))//����exit�������˳�
		{
<<<<<<< HEAD
			System.out.println("���ǵ�һ���޸ĵĽ��");
=======
			
>>>>>>> a6bf7ac19e26c53685f05da39e935174c3feaf95
			myuser.userinput();
			myuser.match();
		}
		
    }
}
<<<<<<< HEAD
=======
//�޸�1
//B2��֧�ϵ��޸�
//ʵ�鳡��2����֧����.4
//ʵ�鳡��2����֧����.5
//�����ͻ

>>>>>>> a6bf7ac19e26c53685f05da39e935174c3feaf95
