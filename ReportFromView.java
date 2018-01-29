import java.sql.*;

class ReportFromView
{
public static void main(String args[])
{
Connection con;
Statement st;
ResultSet rs;

try
{
Class.forName("com.mysql.jdbc.Driver");

con=DriverManager.getConnection("jdbc:mysql://sohamglobal:3306/visadb0645?user=root&password=crosspolo&useSSL=false");

st=con.createStatement();

rs=st.executeQuery("select * from fdlist where deposit>25000;");

while(rs.next())
{
System.out.print(rs.getString("name")+"\t");
System.out.print(rs.getString("deposit")+"\t");
System.out.println(rs.getString("futurevalue"));
}
con.close();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
