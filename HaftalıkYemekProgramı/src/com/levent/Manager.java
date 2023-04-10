package com.levent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Manager {
public static void main(String[] args) {
	/*
	 * Enum method hatırlatma 
	 * ordinal() enum ifadedenin indexini veririr
	 * compareTo ifadeleri sıralı hale getirir.
	 * toString string dizisi olarak döndürür.
	 * name()tanımlı enum string ifade olarak geri döner
	 * valueOf belirtilen değerin indisini döner
	 * values verilen enum değerini enum dizisi olarak döner.
	 */

	
	//Kurgumuz haftanın yedi gününe göre olacak her üründen yedi adet olduğundan hergün random kullanılan yemekleri
	//seçilecekler arasından eksilterek gideceğiz ve sonunda Haftanın her günü için benzersiz bir içerik oluşacak.
	
	ECorba[] eCorbaDizi= ECorba.values();
	EYemekler[] eYemeklersDizi=EYemekler.values();
	EIcecekler[] eIceceklersDizi=EIcecekler.values();
	ETatlılar[] eTatlılarsDizi=ETatlılar.values();
	EGunler[] eGunlerDizi=EGunler.values();
	
	ArrayList<String>CorbaStr=new ArrayList<>();
	ArrayList<String>YemekStr=new ArrayList<>();
	ArrayList<String>IcecekStr=new ArrayList<>();
	ArrayList<String>GunlerStr=new ArrayList<>();
	ArrayList<String>TatlılarStr=new ArrayList<>();
	
	for (int i = 0; i < eGunlerDizi.length; i++) {
		CorbaStr.add(i, eCorbaDizi[i].name());
		YemekStr.add(i,eYemeklersDizi[i].name());
		IcecekStr.add(i,eIceceklersDizi[i].name());
		TatlılarStr.add(i,eTatlılarsDizi[i].name());
		GunlerStr.add(i,eGunlerDizi[i].name());
	}
	
	for (int i = 0; i < eGunlerDizi.length; i++) {
		
		
	}
	
	System.out.println("******HAFTALIK YEMEK BELİRLEME PROGRAMI*******");
	Manager manager=new Manager();

	
		manager.haftalıkYemek( CorbaStr, YemekStr, IcecekStr, TatlılarStr, GunlerStr);
	

	
}

public void haftalıkYemek(  ArrayList<String> CorbaStr, ArrayList<String> YemekStr,ArrayList<String>IcecekStr, ArrayList<String> TatlılarStr,ArrayList<String>GunlerStr) {
	Menu menu1=new Menu();
	for (int i = 0; i < 7; i++) {
	int j=7-i	;
	
	
	Random random= new Random();//Rastgele ürün indexi belirleyeceğiz
	System.out.println("\n"+GunlerStr.get(i) + " GÜNÜ MENÜSÜ");
	
	int rdDeger=0;
	rdDeger=random.nextInt(0,j);
	menu1.corba= CorbaStr.get(rdDeger);
	CorbaStr.remove(rdDeger);
	
	
	rdDeger=random.nextInt(0,j);
	menu1.anaYemek= YemekStr.get(rdDeger);
	YemekStr.remove(rdDeger);

	
	rdDeger=random.nextInt(0,j);
	menu1.icecek= IcecekStr.get(rdDeger);
	
	IcecekStr.remove(rdDeger);
	
	//rdDeger=random.nextInt(0,j);
	menu1.tatlı= TatlılarStr.get(rdDeger);
	TatlılarStr.remove(rdDeger);
	
	System.out.println(menu1);
	
	}
}

}

