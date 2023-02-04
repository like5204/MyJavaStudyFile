//5.  声明一个Person 类，属性有姓名、性别、身高、体重；
//    创建几个 Person 对象，将其放入 ArrayList （或 vector)中，
//    然后按照身高进行排序，并输出在屏幕上。


import java.util.Collections;
import java.util.ArrayList;

class Person implements Comparable<Person>
{
	public String name;
	char gender;
	public float height;
	float weight;

	public Person(String n, char g, float h, float w)
	{
		name = n;
		gender = g;
		height = h;
		weight = w;
	}

	@Override
	public int compareTo(Person p1)
	{
		return (int)Math.ceil(this.height - p1.height);
	}
	
}


public class SortPerson
{
	public static void main(String[] args)
	{
		ArrayList<Person> aps = new ArrayList<Person>();
		
		
		aps.add(new Person("a",'男',176.8f,62.3f));
		aps.add(new Person("b",'男',184.4f,52.3f));
		aps.add(new Person("c",'女',166.3f,72.3f));
		aps.add(new Person("d",'男',171.1f,66.3f));
		aps.add(new Person("e",'女',186.9f,59.3f));


		Collections.sort(aps);

		System.out.println("将身高按升序进行排列");
		System.out.println();
		for(Person p1:aps)
		{
			System.out.println("My name is " + p1.name + " my height is " + p1.height);
		}

	}
}




