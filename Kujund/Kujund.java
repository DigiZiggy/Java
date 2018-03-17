class Kujund {
	int x;
	int y;

	Kujund(){
		x=0;
		y=0;
	}	


Kujund (int xKoordinaat, int yKoordinaat){
	x=xKoordinaat;
	y=yKoordinaat;
	}

int ankurX(){

		return x;
}

int ankurY(){

		return y;
}

double ymberm66t(){

		return 0.0;
}	

double pindala(){

		return 0.0;
}

	public String toString() {
	return getClass().getName() +
			"[x=" + x + ", y=" + y + " ankur=(" + ankurX() +
			", " + ankurY() + "), Umberm66t=" + ymberm66t() + "]";
	}	


	public String toString2() {

		return getClass().getName() + " pindala on: " + pindala();
	}
}
