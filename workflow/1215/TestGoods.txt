import java.util.ArrayList;//导入Arraylist为后面存储数据做准备
class Goods implements Cloneable 
{
	//商品类
	private String name;//商品名称
	private int id;//商品编号
	private double price;//商品价格
	private int num;//商品数量

	private String addTime;//商品上架时间
	
	@Override
	public Object clone()
	{
		//重写拷贝方法，为货架添加商品做准备
		Goods g = null;
		try
		{
			g = (Goods)super.clone();
		}
		catch(CloneNotSupportedException cse)
		{
			cse.printStackTrace();
		}
		return g;
	}
	@Override
	public boolean equals(Object o)
	{
		//重写equals 为后面调用ArrayList的remvoe方法做准备
		if(o instanceof Goods)
		{
			Goods g = (Goods)o;
			return this.getName()==g.getName()&&this.getId()==g.getId();
		}
		return false;
	}

	public void setName(String n)
	{
		if(n != "")
		this.name = n;
	}
	public String getName()
	{
		return this.name;
	}

	public void setId(int i)
	{
		if(i != 0)
		this.id=i;
	}
	public int getId()
	{
		return this.id;
	}

	public void setNum(int n)
	{
		//商品数量控制在0～100
		if(n>=0&&n<=100)
		{
			this.num = n;
		}
		else
		{
			this.num = 0;
		}
	}
	public int getNum()
	{
		return this.num;
	}

	public void setPrice(double p)
	{
		//商品价格控制
		if(p>=0&&p<=10000)
		{
			this.price = p;
		}
		else
		{
			this.price = 0;
		}
	}
	public double getPrice(){return this.price;}
	public String getAddTime(){return this.addTime;}
	public void setAddTime(String t){if(t!="")this.addTime=t;}

	public Goods(String n,int i, double p,int nu,String addTime)
	{
		//构造函数:初始化属性
		setName(n);
		setId(i);
		setNum(nu);
		setPrice(p);
		setAddTime(addTime);
	}


}
abstract class Storage
{
	//存储抽象类
	ArrayList<Goods> alg;
	
	public Storage()
	{
		alg = new ArrayList<Goods>();
		//初始化数组用来存储商品.
	}
	

	//抽象方法，货架类和购物车类都需要使用的方法
	public abstract boolean addGoods(Goods g);
	public abstract boolean delGoods(Goods g);
	public abstract  boolean showGoods();
	public abstract boolean addGoodsAll(Goods[] gs);	
}
class Shelve extends Storage
{
	//货架类
	public Shelve()
	{
		super();
	}

	public boolean addGoods(Goods g)
	{
		Goods new_g = (Goods)g.clone();
		return alg.add(new_g);
	}
	public boolean addGoodsAll(Goods[] gs)
	{
		for(int i = 0; i < gs.length; i++)
		{
			//循环整个数组，进行多个商品添加
			boolean x = addGoods(gs[i]);
			if(!x)return x;//如果一个商品添加失败，则返回false;
		}
		return true;
	}
	public boolean delGoods(Goods g)
	{
		return alg.remove(g);
	}
	public boolean showGoods()
	{
		//货架类的展示货物,额外增加了上架时间的显示，方便工作人员点货
		System.out.printf("\n------------***********************-------------\n");
		System.out.println("------------您 购 物 车 中 的 商 品-------------");
		System.out.println("------------------------------------------------");
		System.out.printf("序号\t商品名\t商品数量\t商品价格\t上架时间\n");
		for(int i = 0; i < alg.size(); i++)
		{
			Goods g = alg.get(i);//赋值临时商品类,方便后续调用
			System.out.printf("%s\t%s\t%d\t\t%.2f\t\t%s\n",i+1, g.getName(), g.getNum(), g.getPrice(),g.getAddTime());
		}
		System.out.println("------------------------------------------------");
		System.out.printf("------------***********************-------------\n\n");
		return true;
	}

	public <T>  boolean searchGoods(T t)
	{
		//String 名称查询
		//int id查询

		Goods g1 = null;
		if(t instanceof Integer)
		{
			int i1  = (Integer)t;
			//判断传入值的类型，并循环查找
			for(int i = 0; i < alg.size(); i++)
			{
				Goods g = alg.get(i);
				if(g.getId()-i1==0)
				{
					System.out.println("第"+i1+"号商品," + "查找成功!");
					g1 = g;break;
				}
			}
		}
		else if(t instanceof String)
		{
			String s1 = (String)t;
			for(int i = 0; i < alg.size(); i++)
			{
				Goods g = alg.get(i);
				if(s1.equals(g.getName()))
				{
					System.out.println(s1+"商品,查找成功!");
					g1=g;break;
				}
			}
		}
		else{System.out.println("您传入的数据类型无法查询...");}

		if(g1!=null)
		{
			//当g1这个商品对象，不为空时，进一步显示信息
			System.out.printf("商品名\t商品数量\t商品价格\t上架时间\n");
			System.out.printf("%s\t%d\t\t%.2f\t\t%s\n\n",g1.getName(), g1.getNum(), g1.getPrice(),g1.getAddTime());
			return true;
		}
		else{System.out.printf("查找商品失败!\n\n");return false;}
	}

	
}
class Cart extends Storage
{
	//购物车类
	public Cart()
	{
		super();
	}
	public boolean addGoods(Goods g)
	{
		return alg.add(g);
	}
	public boolean addGoodsAll(Goods[] gs)
	{
		for(int i = 0; i < gs.length; i++)
		{
			boolean x = addGoods(gs[i]);
			if(!x)return false;
		}
		return true;
	}
	public boolean delGoods(Goods g)
	{
		return alg.remove(g);	
	}
	public boolean showGoods()
	{
		System.out.printf("\n------------***********************-------------\n");
		System.out.println("------------您 购 物 车 中 的 商 品-------------");
		System.out.println("------------------------------------------------");
		System.out.printf("序号\t商品名\t商品数量\t商品价格\n");
		for(int i = 0; i < alg.size(); i++)
		{
			Goods g = alg.get(i);
			System.out.printf("%d\t%s\t\t%d\t\t%.2f\n",i+1, g.getName(), g.getNum(), g.getPrice());
		}
		System.out.println("------------------------------------------------");
		System.out.printf("------------***********************-------------\n\n");

		return true;
	}

	public double settlement()
	{
		//结账
		double sum = 0;

		for(Goods g: this.alg)
		{
			sum += g.getPrice();
		}
		System.out.printf("您好，您购物车中的商品一共是%.2f元\n",sum);
		return sum;
	}

	public void clear()
	{
		//清空购物车
		alg.clear();
	}

}
public class TestGoods
{
	public static void main(String[] args)
	{
		Shelve sl = new Shelve();//创建货架对象	
		
		Goods[] gs = new Goods[10];//初始化多个商品对象
		gs[0]= new Goods("苹果",1,4.7f,1,"2022-12-15");
		gs[1]= new Goods("香蕉",2,10.8f,5,"2022-12-15");
		gs[2] = new Goods("橘子",3,8.3f,15,"2022-12-16");
		gs[3] = new Goods("猕猴桃",4,8.9f,4,"2022-12-16");
		gs[4] = new Goods("笔记本",21,8.0f,1,"2022-10-4");
		gs[5] = new Goods("墨水",22,4.0f,1,"2022-03-09");
		gs[6] = new Goods("洗发液",41,32.0f,1,"2021-12-5");
		gs[7] = new Goods("牛奶",51,64f,1,"2022-9-28");
		gs[8] = new Goods("可乐",52,2.5f,1,"2022-11-11");
		gs[9] = new Goods("雪碧",53,2.5f,1,"2022-11-15");
				// 名称，编号，价格，数量，上架时间

		sl.addGoodsAll(gs);//批量添加商品到货架上
		
		sl.showGoods();//展示货架商品

		//在货架上搜索商品,分别尝试名称搜索，搜索失败，id搜索
		sl.searchGoods("洗发液");
		sl.searchGoods("沐浴露");
		sl.searchGoods(53);

		Cart c1 = new Cart();//创建购物车对象

		c1.addGoods(gs[3]);//购买4个猕猴桃
		c1.addGoods(gs[7]);
		c1.addGoods(gs[5]);
		c1.addGoods(gs[0]);
		c1.addGoods(gs[9]);
		
		System.out.println("删除商品之前");
		c1.showGoods();

		c1.delGoods(gs[0]);
		c1.delGoods(gs[3]);
		c1.delGoods(gs[1]);//尝试删除不存在的商品

		
		System.out.println("删除商品之后");
		c1.showGoods();


		c1.settlement();	

		c1.clear();

		System.out.println("正在执行清空购物车");
		c1.showGoods();

	}
}
