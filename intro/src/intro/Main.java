package intro;

public class Main {

	public static void main(String[] args) {

		 String internetSubeButonu="�nternet �ubesi";
	       double dolarDun =8.16;
	       double dolarBugun=8.16;
	       int vade=36;
	       boolean durum = true;
	       
	       System.out.println(internetSubeButonu);
	       
	        if(dolarBugun < dolarDun) {
	     	  System.out.println("Dolar d��t� resmi"); 
	        }else if (dolarBugun > dolarDun){
	     	   System.out.println("Dolar y�kseldi resmi");
	        }else {
	     	   System.out.println("Dolar e�ittir resmi");
	        }
	        

	       String[] krediler = {"H�zl� Kredi","Mutlu Emekli Kredisi","Konut Kredisi"};
	       
//	       for(String kredi:krediler) {
//	    	   System.out.println(kredi);
//	       }
	       
	       for(int i=0;i<krediler.length;i++) {
	    	   System.out.println(krediler[i]);
	       }
	       
	       int sayi1=10;
	       int sayi2=20;
	       sayi1=sayi2;
	       sayi2=100;
	       System.out.println(sayi1);
	       
	       int[] sayilar1= {1,2,3,4,5};
	       int[] sayilar2= {10,20,30,40,50};
	       sayilar1 = sayilar2;
	       sayilar2[0]=100;
	       System.out.println(sayilar1[0]);
	       
	       String sehir1="Ankara";
	       String sehir2="�stanbul";
	       sehir1=sehir2;
	       sehir2="�zmir";
	       System.out.println(sehir1);
	        
	}

}


