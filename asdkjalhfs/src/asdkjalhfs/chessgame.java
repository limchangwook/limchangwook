package asdkjalhfs;

public class chessgame {
	private int p_x,B_x,K_x,R_x,Q_x,king_x;
	private int p_y,B_y,K_y,R_y,Q_y,king_y;
	private int p_count=0,B_count=0,K_count=0,R_count=0,Q_count=0,king_count=0;
	public String Pawn(){
		if(p_count==0){
			p_y+=2;
		}
		else{
			p_y+=1;
		}
	}
	public String Bishop(){
		
	}
	public String knight(){
		
	}
	public String Rook(){
		
	}
	public String Queen(){
		
	}
	public String King(){
		
	}
	public chessgame(int x,int y){
		this.x=x;
		this.y=y;
	}
}
