package tarea3;
public class schemia extends ninja {
	protected int jutsu1,jutsu2,jutsu3;
	/*metodo:  schemia
	parametro:
	retorno:
	descripcion: Construye la clase scthonia
	*/
	schemia(){
		CrearNinja();
	}
	/*metodo:  CrearNinja
	parametro:
	retorno: void
	descripcion: Inicializa cada tipo de Jutsu y el nivel del jutsu.
	*/
	public void CrearNinja() {
		this.Jutsu_1 = "Parentesiyomi Infinito";
		this.Jutsu_2 = "Jutsu Recursion de Fuego";
		this.Jutsu_3 = "Letsano";
		this.Nivel_Jutsu=0;
	}
	/*metodo:  AsignarNivelJutsus
	parametro: Personaje ninja, int nive
	retorno: void
	descripcion: Asigna el nivel del jutsu correspondiente.
	*/
	public void AsignarNivelJutsus(Personaje ninja, int nivel){
		jutsu1 = ninja.ObtenerNivel()*nivel;
		jutsu2 = 2*nivel;
		jutsu3 = 3*ninja.ObtenerNivel();
	}
	/*metodo:  ObtenerNivelJutsus
	parametro: String jutsu
	retorno: int
	descripcion: Obtiene el nivel de un jutsu dado.
	*/
	public int ObtenerNivelJutsu(String jutsu) {
		if (jutsu == Jutsu_1) {
			jutsu1=Nivel_Jutsu;
			return this.Nivel_Jutsu;
		}else if(jutsu == Jutsu_2) {
			jutsu2=Nivel_Jutsu;
			return this.Nivel_Jutsu;
		}else {
			jutsu3=Nivel_Jutsu;
			return this.Nivel_Jutsu;
		}
	}
	/*metodo:  UsarJutsu
	parametro: Personaje jugador1,int n
	retorno: int
	descripcion: funcion que entrega el valor de un jutsu pedido en una batalla.
	*/
	public int UsarJutsu(Personaje jugador1,int n) {
		if(n==1) {
			return jutsu1;
		}else if(n==2) {
			return jutsu2;
		}else {
			return jutsu3;
		}
	}
}
