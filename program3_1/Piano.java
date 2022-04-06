package program3_1;

public class Piano extends Instrument {
    @Override
	public void play() {
		System.out.println("Piano is playing  tan tan tan tan");
}
}
 class Flute extends Instrument {

	@Override
	public void play(){
		System.out.println("Flute is playing  toot toot toot toot");
	}
}
 class Guitar extends Instrument {
	 @Override
	 public void play() {
	 	System.out.println("Guitar is playing  tin  tin  tin");
	 }
	 }
  class Ans21
 {
	 public static void main(String[]args)
	 {
      Instrument instruments  []=new Instrument[10];
      instruments[0]=new Piano();
      instruments[1]=new Flute();
      instruments[2]=new Guitar();
      instruments[3]=new Piano();
      instruments[4]=new Flute();
      instruments[5]=new Guitar();
      instruments[6]=new Piano();
      instruments[7]=new Flute();
      instruments[8]=new Guitar();
      instruments[9]=new Piano();
       for (int i=0;i<instruments .length;i++)
       {
    		if (instruments[i] instanceof Piano) 
    	   {
    		   System.out.println("Yes,Its a Piano");
    			instruments[i].play();
    	   }
    		if (instruments[i] instanceof Flute) 
    		{
    			System.out.println("Yes,Its a Flute");
    			instruments[i].play();
    		}
    		if (instruments[i] instanceof Guitar) 
    		{
    			System.out.println("Yes,Its a Guitar");
    			instruments[i].play();
    		}
       }
       
      
	 }
 }