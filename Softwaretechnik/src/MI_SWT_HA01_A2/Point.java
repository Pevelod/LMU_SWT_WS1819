package MI_SWT_HA01_A2;

/**
 * Eine Klasse die Punkte erzeugt 
 * @author (Student) 
 * @version (20.10.2018)
 */
public class Point
{
    private int xKoordinate;
    private int yKoordinate;
    private String pointName;


    public Point(String name,int x,int y){
    	
    	pointName = name;
    	xKoordinate = x;
        yKoordinate = y;
    }


	public int getxKoordinate(){
		return xKoordinate;
	}


	public void setxKoordinate(int xKoordinate){
		this.xKoordinate = xKoordinate;
	}


	public int getyKoordinate(){
		return yKoordinate;
	}


	public void setyKoordinate(int yKoordinate){
		this.yKoordinate = yKoordinate;
	}


	public String getPointName(){
		return pointName;
	}


	public void setPointName(String pointName){
		this.pointName = pointName;
	}
    
    
}
