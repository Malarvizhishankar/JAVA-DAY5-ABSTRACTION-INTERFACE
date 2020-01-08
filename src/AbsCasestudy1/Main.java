package AbsCasestudy1;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		String planetname;
		Scanner sc=new Scanner(System.in);
        
        int type;   
        float              radius;
        float              width;
        float              length;
        float height;
        float side;
        System.out.print("1.Cubical Planet\r\n" + "2.Spherical Planet\r\n" + "3.Conical Planet\r\n" + "4.Cuboidal Planet");
        System.out.print("\nEnter your choice:");
        type=sc.nextInt();
        System.out.print("Enter name");
        planetname=sc.next();
        if(type==1)
        {   
        	System.out.print("Enter side");
        	side=sc.nextFloat();
        	CubicalPlanet cube=new CubicalPlanet(planetname,side);
        	System.out.print("Volume:"+cube.calculateVolume()+"Km3");
        	
        }
        else if(type==2)
        {
        	System.out.print("Enter radius");
        	radius=sc.nextFloat();
        	SphericalPlanet sphere=new SphericalPlanet(planetname,radius);
        	System.out.print("Volume:"+sphere.calculateVolume()+"Km3");
        }
        else if(type==3)
        {
        	System.out.print("Enter height");
        	height=sc.nextFloat();
        	System.out.print("Enter radius");
        	radius=sc.nextFloat();
        	ConicalPlanet cone=new ConicalPlanet(planetname,height,radius);
        	System.out.print("Volume:"+cone.calculateVolume()+"Km3");
        }
        else if(type==4)
        {
        	System.out.print("Enter height");
        	height=sc.nextFloat();
        	System.out.print("Enter width");
        	width=sc.nextFloat();
        	System.out.print("Enter length");
        	length=sc.nextFloat();
        	CuboidalPlanet cuboid=new CuboidalPlanet(planetname,height,width,length);
        	System.out.print("Volume:"+cuboid.calculateVolume()+"Km3");
        }
	}


}
