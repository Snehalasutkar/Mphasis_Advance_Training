package program3_2;

public interface MedicineInfo {
	public default   void displayLabel(){
    	  System.out.println("Company Name:Medplus"); 
    	  System.out.println("Address:Pune");
       }
}
 class Tablet implements MedicineInfo{
	 public void displayLabel() {
		 System.out.println("Store in cool dry place");
 }
 }
 class Syrup implements MedicineInfo{
	public void displayLabe() {
		 System.out.println("Consumption as directed by the doctor");
	 }
 }
 class Ointment implements MedicineInfo{
	 public void displayLabel(){
		 System.out.println("for external use only");
		 }
	 }