public class Patient
{
	private String name;
	private char sex;
	private int age;
	private float weight;
	private boolean allergies;

	public String getName(){return name;}
	public char getSex(){return sex;}
	public int getAge(){return age;}
	public float getWeight(){return weight;}
	public boolean getAllergies(){return allergies;}


	public void setName(String name){this.name=name;}
	public void setSex(char sex){this.sex=sex;} 
	public void setWeight(float weight){this.weight=weight;}
	public void setAge(int age){this.age=age;}
	public void setAllergies(boolean allergies){this.allergies=allergies;}
	
	public String toString()
	{
			
		return "My name is " + this.getName()+ " My sex is " +this.getSex()+" My age is " + this.getAge()+"My allergies is " + this.getAllergies();
		
	}
}
