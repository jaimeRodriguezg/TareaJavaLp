package tarea3;
public abstract class ninja {
	public String Jutsu_1;
	public String Jutsu_2;
	public String Jutsu_3;
	public int Nivel_Jutsu;
	/*metodo:  CrearNinja
	parametro:
	retorno: void
	descripcion: Clase abstracta que crea ninja.
	*/
	public abstract void CrearNinja();
	/*metodo:  AsignarNivelJutsus
	parametro: Personaje ninja, int nivel
	retorno: void
	descripcion: CLase abstracta que asigna nivel a los jutsus
	*/
	public abstract void AsignarNivelJutsus(Personaje ninja, int nivel);
	/*metodo:  	UsarJutsus
	parametro: Personaje ninja, int n
	retorno: int
	descripcion: CLase abstracta que entrega el valor de un jutsu en una pelea.
	*/
	public abstract int UsarJutsu(Personaje jugador1,int n);
}
