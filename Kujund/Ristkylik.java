class Ristkylik extends Kujund {
	
int kylg1;
int kylg2;

// Konstruktor

Ristkylik (int xKoordinaat, int yKoordinaat, int kylga, int kylgb){
	x=xKoordinaat;
	y=yKoordinaat;
	kylg1 = kylga;
	kylg2 = kylgb;
	}
	
	double ymberm66t() {

	return (double)(2 * (kylg1 + kylg2));
	}
	
	double pindala() {

	return (double)(kylg1 * kylg2);
	}
	
}