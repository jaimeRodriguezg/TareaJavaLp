package tarea3;
public interface Personaje {
	public void AsignarVida(int cant);
	public void AsignarNinja(int Aldea);
	public void AsignarNombre(String Nombre);
	public void AsignarAtaqueFisico(int cant);
	public void AsignarObjeto(String objeto);
	public void AsignarRango(String Rango);
	public int RealizarAtaque(int jutsu);
	public void AsignarNivel(int Nivel);
	public int ObtenerNivel ();
	public void AsignarDaño(int cant);
}
