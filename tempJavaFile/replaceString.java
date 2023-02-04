public class replaceString
{
	public static void main(String[] args)
	{
String intro = "今天时星其天，外面时下雨天。妈米去买菜了，漏网在家写作业。" + "语文作业时”其”写 5 行，数学使第10 页。";
		
		intro = intro.replaceAll("[时使]","是");
		intro = intro.replaceAll("其","期");
		intro = intro.replaceAll("米","咪");
		intro = intro.replaceAll("漏","上");

		System.out.println(intro);
		
	}
}
