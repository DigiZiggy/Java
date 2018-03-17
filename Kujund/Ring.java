class Ring extends Kujund {
	
int raadius;

// Konstruktor

Ring (int xKoordinaat, int yKoordinaat, int r){
	x=xKoordinaat;
	y=yKoordinaat;
	raadius = r;
}
	
int ankurX(){

	return x - raadius;
}

int ankurY(){

	return y - raadius;
}

double ymberm66t(){

	return (double)(diameeter()*Math.PI);
}	


int diameeter(){

	return 2 * raadius;
}


double pindala(){

	return (double)(Math.PI * (raadius^2));
}


}