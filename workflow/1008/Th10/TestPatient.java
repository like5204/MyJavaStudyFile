public class TestPatient
{
	public static void main(String[] args)
	{
		Patient apri1 = new Patient();
		apri1.setName("ZhangSan");
		apri1.setAge(14);
		apri1.setSex('男');
		apri1.setWeight(62f);
		apri1.setAllergies(true);
		
		showMsg(apri1);

		Patient apri2 = new Patient();
		apri2.setName("LiSi");
		apri2.setAge(16);
		apri2.setSex('女');
		apri2.setWeight(40f);
		apri2.setAllergies(false);
		System.out.println();
		
		showMsg(apri2);

		System.out.println(apri2);
		
	}

	public static void showMsg(Patient p)
	{
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getSex());
		System.out.println(p.getWeight());
		System.out.println(p.getAllergies());
	}
}
