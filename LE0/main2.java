/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

 class GetterSetter{
     private String name;
     public void setname(String N){
         this.name=N;
     }
    public String getname(){
       return name;
    }
 }
 
public class main2
{
	public static void main(String[] args) {
		GetterSetter obj= new GetterSetter();
		obj.setname("Shreyash Dhande");	
		System.out.println(obj.getname());
}
}