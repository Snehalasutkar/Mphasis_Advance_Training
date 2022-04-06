package program6_3;

import java.util.Vector;

public class TestEmployee {
	public static void main(String[]args) {
		Vector<Employeee> v=addInput();
		display(v);
	}
	public static Vector<Employeee> addInput(){
		Employeee e1=new Employeee(101,"Gnaneswari","Chittoor");
		Employeee e2=new Employeee(102,"Vivek","Kadapa");
		Employeee e3=new Employeee(103,"Padhmaja","Madanapalli");
		Vector<Employeee>v = new Vector<Employeee>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		return v;



	}
	public static void display(Vector<Employeee>v)
	{
		for(Employeee e:v)
		{
			System.out.println(e.getEmpNo()+"\t"+e.getEmpName()+"\t"+e.getAddress());
		}
	}

}