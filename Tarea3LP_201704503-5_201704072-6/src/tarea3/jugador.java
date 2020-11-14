package tarea3;
public class jugador implements Personaje{
	protected String jutsu;
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
	protected int Opcion;
	protected int Cont;
	/*metodo:  Jugador
	parametro: String nombre,int aldea
	retorno:
	descripcion: Constructor de la clase jugador
	*/
	jugador(String nombre,int aldea){
		AsignarNombre(nombre);
		AsignarRango("Ifnin");
		AsignarNinja(aldea);
		AsignarNivel(1);
		AsignarNivelJutsus();
		AsignarOro(0);
		AsignarExperiencia(0);
		AsignarVida(100 + Nivel);
		AsignarEnergia(300);
		AsignarDaño(0);
	}
	/*metodo:  AsignarOpcion
	parametro: int opcion
	retorno: void
	descripcion: Asigna opcion.
	*/
	public void AsignarOpcion(int opcion) {
		this.Opcion=opcion;
	}
	/*metodo:  ObtenerOpcion
	parametro:
	retorno: int
	descripcion: Obtiene opcion.
	*/
	public int ObtenerOpcion() {
		return this.Opcion;
	}
	/*metodo:  AsignarEnergia
	parametro: int energia
	retorno: void
	descripcion: Asigna la energia al jugador
	*/
	public void AsignarEnergia(int energia) {
		this.Energia = energia;
	}
	/*metodo:  ObtenerEnergia
	parametro:
	retorno: int
	descripcion: Obtiene la energia del jugador
	*/
	public int ObtenerEnergia() {
		return this.Energia;
	}
	/*metodo:  AsignarExperiencia
	parametro: int exp
	retorno: void
	descripcion: Asigna la experiencia del jugador
	*/
	public void AsignarExperiencia(int exp) {
		this.Experiencia = exp;
	}
	/*metodo:  ObtenerExperiencia
	parametro:
	retorno: int
	descripcion: Obtiene la experiencia del jugador
	*/
	public int ObtenerExperiencia() {
		return this.Experiencia;
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
	/*metodo:  AsignarOro
	parametro: int oro
	retorno: void
	descripcion: Asigna el oro del jugador.
	*/
	public void AsignarOro(int oro) {
		this.Oro = oro;
	}
	/*metodo:  ObtenerOro
	parametro:
	retorno: int
	descripcion: Obtiene el oro del jugador.
	*/
	public int ObtenerOro() {
		return this.Oro;
	}
	/*metodo:  AsignarVida
	parametro:
	retorno: void
	descripcion: Asigna vida del jugador.
	*/
	public void AsignarVida(int cant) {
		this.Vida = cant;
	}
	/*metodo: ObtenerVida
	parametro:
	retorno: int
	descripcion: Obtiene la vida del jugador
	*/
	public int ObtenerVida() {
		return this.Vida;
	}
	/*metodo:  AsignarNinja
	parametro: int aldea
	retorno: void
	descripcion: Asigna la aldea del jugador
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
		else {
			System.out.println("Ingrese una aldea correcta: ");
		}
	}
	/*metodo:  ObtenerNinja
	parametro:
	retorno: String
	descripcion: Obtiene la aldea del jugador
	*/
	public String ObtenerNinja() {
		return this.Aldea;
	}
	/*metodo:  AsignarNombre
	parametro: String nombre
	retorno: void
	descripcion: Asigna el nombre del jugador
	*/
	public void AsignarNombre(String nombre) {
		this.Nombre=nombre;
	}
	/*metodo:  ObtenerNombre
	parametro:
	retorno: String
	descripcion: Obtiene el nombre del jugador.
	*/
	public String ObtenerNombre() {
		return this.Nombre;
	}
	/*metodo:  AsignarAtaqueFisico
	parametro: int cant
	retorno: void
	descripcion: Asigna el ataque fisico.
	*/
	public void AsignarAtaqueFisico(int cant) {
		AsignarDaño(cant);
	}
	/*metodo:  AsignarObjeto
	parametro: String objeto
	retorno: void
	descripcion: Asigna el objeto del jugador.
	*/
	public void AsignarObjeto(String objeto) {
		this.Objeto=objeto;
	}
	/*metodo:  ObtenerObjeto
	parametro:
	retorno: String
	descripcion: Obtieneel objeto del jugador.
	*/
	public String ObtenerObjeto() {
		return this.Objeto;
	}
	/*metodo:  AsignarRango
	parametro: String rango
	retorno: void
	descripcion: Asigna Rangod del jugador.
	*/
	public void AsignarRango(String rango) {
		this.Rango=rango;
	}
	/*metodo:  ObtenerRango
	parametro:
	retorno: String
	descripcion: Obtiene el rango del jugador.
	*/
	public String ObtenerRango() {
		return this.Rango;
	}
	/*metodo:  RealizarAtaque
	parametro: int jutsu
	retorno: int
	descripcion: Entrega un valor int el cual equivale el daño del ataque realizado por el jugador, sea físco o jutsu.
	*/
	public int RealizarAtaque(int jutsu) {
		int atacar ;
		if(jutsu == 0 ) {
			int ataque=this.Daño+3+ObtenerNivel();
			System.out.println("El valor del ataque es "+ ataque );
			return ObtenerDaño()+3+ObtenerNivel();
		}else {
			if(jutsu==1) {
				AsignarNivelJutsus();
				atacar = Cninja.UsarJutsu(this, 1);
				System.out.println("El valor del ataque es "+ atacar);
				//AsignarAtaqueFisico(this.Daño);
				return atacar;
			}else if(jutsu==2){
				AsignarNivelJutsus();
				atacar = Cninja.UsarJutsu(this, 2);
				System.out.println("El valor del ataque es "+ atacar);
				//AsignarAtaqueFisico(this.Daño);
				return atacar;
			}else {
				AsignarNivelJutsus();
				atacar = Cninja.UsarJutsu(this, 3);
				System.out.println("El valor del ataque es "+ atacar);
				return atacar;
			}
		}
	}
	/*metodo:  AsignarNivel
	parametro: int nivel
	retorno: void
	descripcion: Asigna el nivel del jugador
	*/
	public void AsignarNivel(int nivel) {
		this.Nivel=nivel;
		if (nivel>=1 && nivel<=2){
			AsignarRango("Ifnin");
		}else if (nivel>=3 && nivel<=6){
			AsignarRango("Fornin");
		}else if (nivel>=7 && nivel<=10){
			AsignarRango("Whilenin");
		}
	}
	/*metodo: ObtenerNivel
	parametro:
	retorno:int
	descripcion: Obtiene el nivel del jugador
	*/
	public int ObtenerNivel () {
		return this.Nivel;
	}
	/*metodo:  AsignarDaño
	parametro: int cant
	retorno: void
	descripcion: Asigna el daño que realiza el jugador fisicamente
	*/
	public void AsignarDaño(int cant) {
		this.Daño = cant;
	}
	/*metodo: ObtenerDaño
	parametro:
	retorno:int
	descripcion: Obtiene el daño que realiza el jugador.
	*/
	public int ObtenerDaño() {
		return this.Daño;
	}
	/*metodo:  RecibirDaño
	parametro: int daño
	retorno: void
	descripcion: Recibi daño de un enemigo modificando la vida.
	*/
	public void RecibirDaño(int daño) {
	this.Vida= Vida-daño;
	}
	/*metodo:  AsignarCont
	parametro: int cont
	retorno: void
	descripcion: Asigna un contador que se ocupa en las recompensas.
	*/
	public void AsignarCont(int cont){
		this.Cont = cont;
	}
	/*metodo: ObtenerCont
	parametro:
	retorno:int
	descripcion: Obtiene el contador que se ocupa en las recompensas
	*/
	public int ObtenerCont(){
		return this.Cont;
	}
}
