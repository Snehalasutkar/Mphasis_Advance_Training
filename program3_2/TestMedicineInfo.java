package program3_2;

import java.util.concurrent.ThreadLocalRandom;

public class TestMedicineInfo  {
	public static int generateRandomInt()
	{
		int randomNum=ThreadLocalRandom.current().nextInt(1,3+1);
		return randomNum;
	}

public static void main(String[]args) {
	MedicineInfo medicine[]=new MedicineInfo[10];
	for (int i=0;i<10;i++)
	{
		int random =generateRandomInt();
		if(random == 1)
		{
			medicine[i]=new Tablet();	
		}
		else if(random == 2)
		{
			medicine[i]=new Syrup();
		}
		else if(random == 3)
		{
			medicine[i]=new Ointment();
		}
	}
	for(int i=0;i<10;i++)
	{
		medicine[i].displayLabel();
	}
}
}