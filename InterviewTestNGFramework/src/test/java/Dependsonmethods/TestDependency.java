package Dependsonmethods;

import org.testng.annotations.Test;
//Tests executes in alphabetical order 
// if CreateShipment method fails then 
public class TestDependency {

	String TrackingNumber;
	@Test
	public void CreateShipment() {
		System.out.println(12/0);
		System.out.println("Create Shipment");
		TrackingNumber="ABCEG1123";
	}
	@Test(dependsOnMethods="CreateShipment")
	public void TrackShipment() throws Exception {
		if(TrackingNumber!=null) {
			System.out.println("Track Shipment");
		}
			else
			{
				throw new Exception ("Invalid Tracking Number");	
			}
		}
	@Test(dependsOnMethods="CreateShipment")
	public void CancelShipment() throws Exception {
		if(TrackingNumber!=null) {
			System.out.println("Cancel Shipment");
		}
			else
			{
				throw new Exception ("Invalid Tracking Number");	
			}
		}
}
