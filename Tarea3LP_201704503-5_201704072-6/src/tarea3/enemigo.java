package tarea3;
import java.util.Random;
public class enemigo implements Personaje{
	protected int Vida;
	protected String Aldea;
	protected String Objeto;
	protected String Rango;
	protected int Daño;
	protected int Nivel;
	protected int Energia;
	protected int Experiencia;
	protected int Oro;
	protected String Nombre;
	protected ninja Cninja;
	enemigo(){
		/*metodo:  enemigo
		parametro:
		retorno:
		descripcion: Constructor de la clase enemigo
		*/
		AsignarNombre(Seleccionnombre());
		int aldea  = generaNumeroAleatorio(1,5);
		AsignarNinja(aldea);
	}
	/*metodo:  enemigo
	parametro: String aldea
	retorno:
	descripcion: Segundo Constructor de la clase enemigo
	*/
	enemigo(String aldea){
		if (aldea == "Pythonia") {
			AsignarNinja(1);
			AsignarNombre("Comic San");
			AsignarNivel(15);
			AsignarObjeto("Fierro con clavos");
		}
		else if (aldea == "Cthonia") {
			AsignarNinja(2);
			AsignarNombre("Papá Noel");
			AsignarNivel(15);
			AsignarObjeto("Fierro con clavos");
		}
		else if (aldea == "Javania") {
			AsignarNinja(3);
			AsignarNombre("Pepe");
			AsignarNivel(15);
			AsignarObjeto("Fierro con clavos");
		}
		else if (aldea == "Schemia") {
			AsignarNinja(4);
			AsignarNombre("Alabarlaalabarda Sama");
			AsignarNivel(15);
			AsignarObjeto("Fierro con clavos");
		}
		else if (aldea == "Prolonia") {
			AsignarNinja(5);
			AsignarNombre("Porlosbor Des");
			AsignarNivel(15);
			AsignarObjeto("Fierro con clavos");
		}
	}
	/*metodo:  AsignarNivelJutsus
	parametro:
	retorno: void
	descripcion: Asigna los niveles de los jutsus.
	*/
	public void AsignarNivelJutsus() {
		if (this.Rango == "Ifnin" ) {
			Cninja.AsignarNivelJutsus(this, 1);
		}else if (this.Rango == "Fornin") {
			Cninja.AsignarNivelJutsus(this, 2);
		}else if (this.Rango == " Whilenin") {
			Cninja.AsignarNivelJutsus(this, 3);
		}else if (this.Rango == "Kage") {
			Cninja.AsignarNivelJutsus(this, 4);
		}
	}
	/*metodo:  AsignarNombre
	parametro: String nombre
	retorno: void
	descripcion: Asigna el nombre del enemigo.
	*/
	public void AsignarNombre(String nombre) {
		this.Nombre=nombre;
	}
	/*metodo:  ObtenerNombre
	parametro:
	retorno: String
	descripcion: Obtiene el nombre del enemigo.
	*/
	public String ObtenerNombre() {
		return this.Nombre;
	}
	/*metodo:  Seleccionnombre
	parametro:
	retorno: String
	descripcion: Selecciona un nombre de enemigo aleatoriamente.
	*/
	public String Seleccionnombre() {
		int azar  = generaNumeroAleatorio(1,15);
		if(azar==1){
			return "Voldemort";
		}
		if(azar==2){
			return("Thanos");
		}
		if(azar==3){
			return("Ricardo Milos");
		}
		if(azar==4){
			return("Darcy");
		}
		if(azar==5){
			return("Bowser");
		}
		if(azar==6){
			return("Doofenshmirtz");
		}
		if(azar==7){
			return("Draco Malfoy");
		}
		if(azar==8){
			return("Ganondorf");
		}
		if(azar==9){
			return("King boo");
		}
		if(azar==10){
			return("Mike Tyson");
		}
		if(azar==11){
			return("Birdo");
		}
		if(azar==12){
			return("Nabbit");
		}
		if(azar==13){
			return("Escupico");
		}
		if(azar==14){
			return("Mother Brain");
		}
		if(azar==15){
			return("Bellatrix");
		}
		return ("jeje");
	}
	/*metodo:  AsignarVida
	parametro:
	retorno: void
	descripcion: Asigna vida del enemigo.
	*/
	public void AsignarVida(int cant) {
		this.Vida=cant;
	}
	/*metodo: ObtenerVida
	parametro:
	retorno: int
	descripcion: Obtiene la vida del enemigo.
	*/
	public int ObtenerVida() {
		return this.Vida;
	}
	/*metodo:  AsignarNivel
	parametro: int nivel
	retorno: void
	descripcion: Asigna el nivel del enemigo.
	*/
	public void AsignarNivel(int nivel) {
		this.Nivel=nivel;
		if (nivel==1){
			AsignarRango("Ifnin");
		}else if (nivel==4){
			AsignarRango("Fornin");
		}else if (nivel==6){
			AsignarRango("Fornin");
		}else if (nivel==8){
			AsignarRango("Whilenin");
		}else if (nivel==10){
			AsignarRango("Whilenin");
		}
		AsignarNivelJutsus();
		AsignarVida(100 + ObtenerNivel());
	}
	/*metodo: ObtenerNivel
	parametro:
	retorno:int
	descripcion: Obtiene el nivel del enemigo.
	*/
	public int ObtenerNivel() {
		return this.Nivel;
	}
	/*metodo:  RealizarAtaque
	parametro: int jutsu
	retorno: int
	descripcion: Entrega un valor int el cual equivale el daño del ataque realizado por el enemigo, sea físco o jutsu, además que es aleatorio.
	*/
	public int RealizarAtaque(int jutsu) {
		int atacar ;
		int valor  = generaNumeroAleatorio(1,2);
		if (valor==1){
			System.out.println("Vamos a pelear fisicamente terrible brigido");
			int ataque=3+ObtenerNivel();
			System.out.println("El valor del ataque es "+ ataque );
			return 3+ObtenerNivel();
		}else{
			int valor2  = generaNumeroAleatorio(1,3);
			System.out.println("preparate para un JUTSU otaku");
			if(valor2==1) {
				AsignarNivelJutsus();
				atacar = Cninja.UsarJutsu(this, 1);
				System.out.println("El valor del ataque es "+ atacar);
				return atacar;
			}else if(valor2==2){
				AsignarNivelJutsus();
				atacar = Cninja.UsarJutsu(this, 2);
				System.out.println("El valor del ataque es "+ atacar);
				return atacar;
			}else {
				AsignarNivelJutsus();
				atacar = Cninja.UsarJutsu(this, 3);
				System.out.println("El valor del ataque es "+ atacar);
				return atacar;

			}
		}
	}
	/*metodo:  AsignarRango
	parametro: String rango
	retorno: void
	descripcion: Asigna Rangod del enemigo.
	*/
	public void AsignarRango(String rango) {
		this.Rango=rango;
	}
	/*metodo:  ObtenerRango
	parametro:
	retorno: String
	descripcion: Obtiene el rango del enemigo.
	*/
	public String ObtenerRango() {
		return this.Rango;
	}
	/*metodo:  AsignarObjeto
	parametro: String objeto
	retorno: void
	descripcion: Asigna el objeto del enemigo.
	*/
	public void AsignarObjeto(String objeto) {
		this.Objeto=objeto;
	}
	/*metodo:  ObtenerObjeto
	parametro:
	retorno: String
	descripcion: Obtiene el objeto del enemigo.
	*/
	public String ObtenerObjeto() {
		return this.Objeto;
	}
	/*metodo:  AsignarNinja
	parametro: int aldea
	retorno: void
	descripcion: Asigna la aldea del enemigo.
	*/
	public void AsignarNinja(int aldea) {
		if (aldea == 1) {
			this.Aldea = "Pythonia";
			this.Cninja = new pythonia();
		}
		else if (aldea == 2) {
			this.Aldea = "Cthonia";
			this.Cninja = new cthonia();
		}
		else if (aldea == 3) {
			this.Aldea = "Javania";
			this.Cninja = new javania();
		}
		else if (aldea == 4) {
			this.Aldea = "Schemia";
			this.Cninja = new schemia();
		}
		else if (aldea == 5) {
			this.Aldea = "Prolonia";
			this.Cninja = new prolonia();
		}
	}
	/*metodo:  ObtenerNinja
	parametro:
	retorno: String
	descripcion: Obtiene la aldea del enemigo.
	*/
	public String ObtenerNinja() {
		return this.Aldea;
	}
	/*metodo:  AsignarDaño
	parametro: int cant
	retorno: void
	descripcion: Asigna el daño que realiza el enemigo fisicamente.
	*/
	public void AsignarDaño(int cant) {
		this.Daño = cant;
	}
	/*metodo: ObtenerDaño
	parametro:
	retorno:int
	descripcion: Obtiene el daño que realiza el enemigo.
	*/
	public int ObtenerDaño() {
		return this.Daño;
	}
	/*metodo:  AsignarAtaqueFisico
	parametro: int cant
	retorno: void
	descripcion: Asigna el ataque fisico.
	*/
	public void AsignarAtaqueFisico(int cant) {
		AsignarDaño(cant);
	}
	/*metodo:  RecibirDaño
	parametro: int daño
	retorno: void
	descripcion: Recibi daño de un jugador modificando la vida.
	*/
	public void RecibirDaño(int daño){
		this.Vida = Vida-daño;
	}
	/*metodo:  generaNumeroAleatorio
	parametro: int minimo,int maximo
	retorno: int
	descripcion: Genera un número aleatorio con un mínimo y un máximo dado.
	*/
	public static int generaNumeroAleatorio(int minimo,int maximo){
       int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
       return num;
   }
}
