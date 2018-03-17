class Ruut extends Kujund {
	
int kylg;


// Konstruktor

Ruut (int xKoordinaat, int yKoordinaat, int kyljepikkus){
	x=xKoordinaat;
	y=yKoordinaat;
	kylg = kyljepikkus;
	}
	
	double ymberm66t() {

	return (double)(4 * kylg);
	}
	
	double pindala() {

	return (double)(kylg * kylg);
	}
	
}