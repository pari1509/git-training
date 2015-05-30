
public class House {
		int numKitchen;
		int numBedrooms;
		int numBathroom;
		
		void SetNumKitchen(int a){
			numKitchen = a;
		}
		void SetNumBedrooms(int b){
			numBedrooms = b;
			}
		void SetNumBathrooms(int c){
			numBathroom = c;
		}
		public House(int a, int b, int c){
			numKitchen = a;
			numBedrooms =b;
			numBathroom = c;
		}
		public House() {
			numKitchen = 0;
			numBedrooms = 0;
			numBathroom = 0;
		}
		int GetNumKitchen(){
			return numKitchen; 
		}
		int GetNumBedrooms(){
			return numBedrooms;
		}
		int GetNumBathroom(){
			return numBathroom;
		}
		public static void main (String args[]){
			House H1 = new House(1,4,4);
			      H1.SetNumKitchen(1);
			      H1.SetNumBedrooms(4);
			      H1.SetNumBathrooms(4);
			House H2 = new House(1,2,3);
				H2.SetNumKitchen(1);
				H2.SetNumBedrooms(2);
				H2.SetNumBathrooms(3);
			House H3 = new House(4,3,1);
				  //H3.NumKitchen(1);
				  //H3.NumBedrooms(4);
				  //H3.NumBathrooms(3);
		System.out.println("H1 has " + H1.GetNumBathroom() + " bathrooms");
	
		System.out.println("H2 has " + H2.GetNumBathroom() + " bathrooms");
		
		System.out.println("H3 has " + H3.GetNumBathroom() + " bathrooms");
	}
}
