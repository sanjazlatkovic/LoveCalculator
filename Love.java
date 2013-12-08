
public class Love {

	public int racunanje (String a, String b){
		
		String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char x;
		char y;
		int brojac1 = 0;
		int brojac2 = 0;
		int procenat = 0;
		int razlikaSlova = 0;
		int razlikaBrojaca = 0;
		
		x = a.charAt(0);
		y = b.charAt(0);
		
		for(int i = 0; i < alfabet.length(); i++){
			
			brojac1++;
			
			if(alfabet.charAt(i)==x)
				break;
			
		}
		
		for(int j = 0; j < alfabet.length(); j++){
			
			brojac2++;
			
			if(alfabet.charAt(j)==y)
				break;
			
		}
		
		razlikaBrojaca = Math.abs(brojac1-brojac2);
		razlikaSlova = Math.abs(a.length()-b.length());
		
		
		if(razlikaBrojaca>=0 && razlikaBrojaca<=2){
			
			procenat = 90+razlikaSlova;
			
		}
		
		if(razlikaBrojaca>=3 && razlikaBrojaca<=4){
			
			procenat = 80+razlikaSlova;
			
		}
		
		if(razlikaBrojaca>=5 && razlikaBrojaca<=6){
			
			procenat = 70+razlikaSlova;
			
		}
		
		if(razlikaBrojaca>=7 && razlikaBrojaca<=8){
			
			procenat = 60+razlikaSlova;
			
		}
		
		if(razlikaBrojaca>=9 && razlikaBrojaca<=10){
			
			procenat = 50+razlikaSlova;
			
		}
		
		if(razlikaBrojaca>=11 && razlikaBrojaca<=12){
			
			procenat = 40+razlikaSlova;
			
		}
		
		if(razlikaBrojaca>=13 && razlikaBrojaca<=14){
			
			procenat = 30+razlikaSlova;
			
		}
		
		if(razlikaBrojaca>=15 && razlikaBrojaca<=16){
			
			procenat = 20+razlikaSlova;
			
		}
		
		if(razlikaBrojaca>=17 && razlikaBrojaca<=18){
			
			procenat = 10+razlikaSlova;
			
		}
		
		if(razlikaBrojaca>=19 && razlikaBrojaca<=24){
			
			procenat = 0+razlikaSlova;
			
		}
	
	
	return procenat;
	
	
	
	
	
	
	
	
	}
	
	
	public String druga(int a){
		
		
		if(a>=0 && a<=9){
			
			return "Vi niste jedno za drugo";
			
		}
		
		if(a>=10 && a<=19){
			
			return "Trud je uzaludan. Sada mozda sve izgleda sjajno, ali vam se putevi potpuno razilaze";
			
		}
		
		if(a>=20 && a<=29){
			
			return "Iako je dobro da budete razliciti, i da svako ima svoje stavove, vas dvoje ste previse otisli u krajnost. Ova veza nema izgleda za uspeh";
			
		}
		
		if(a>=30 && a<=39){
			
			return "Preveliki broj svadja, neslaganja. Mozda je bolje da se razidjete i pokusate na drugim stranama sa drugim osobama";
			
		}
		
		if(a>=40 && a<=49){
			
			return "Ukoliko se oboje potrudite, ima izgleda da uspete da kreirate"+"\n" +"zajednicku buducnost";
			
		}
		
		if(a>=50 && a<=59){
			
			return "Oboje imate svoju privatnost, svoje zivote, ali vam je isto tako dobro kada ste zajedno. Potpuno ste umereni.";
			
		}
		
		if(a>=60 && a<=69){
			
			return "Vreme ce pokazati svoje, samo od vas zavisi buducnost vase veze. Osecanja postoje, ukoliko bude i zelje da uspete, to ce se i ostvariti";
			
		}
		
		if(a>=70 && a<=79){
			
			return "Vas dvoje ste dve zive vatre. U nekim trenucima imate zelju da ubijete partnera, ali ipak ne mozete jedno bez drugog";
			
		}
		
		if(a>=80 && a<=89){
			
			return "Vi imate izuzetan odnos. Za vas ljubav ne predstavlja nikakav napor. Vas odnos kompatibilnosti je izvanredan.";
			
		}
		
		
			
			return "Vi ste stvoreni jedno za drugo. Ukoliko nije jos uvek doslo do njega, mozda je vreme za sledeci ozbiljni korak: zajednicki zivot, veridba?";
			
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
