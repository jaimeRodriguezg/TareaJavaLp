package tarea3;
import java.util.Random;
import java.util.Scanner;
import java.util.LinkedList;
public class juego {
	/*metodo: Fortuna
	parametro: jugador jugador1
	retorno: void
	descripcion: Si se tiene el dinero para comprar una caja, la cobra al jugador, selecciona una categoria de arma y dentro de esta un arma en particular.
	*/
	public static void Fortuna(jugador jugador1){
		int z;
		if (jugador1.ObtenerOro() >= 300) {
			jugador1.AsignarOro(jugador1.ObtenerOro()-300);
			int random  = generaNumeroAleatorio(1,100);
			if (random <= 50 ) {
				System.out.println("Categoría obtenida: \033[34mArmas Comunes\u001b[0m");
				int x = generaNumeroAleatorio(1,3);
				if (x==1) {
					System.out.println("El objeto es \033[31mShuriken\u001b[0m");
					System.out.println("1.Obtener \n2.Desechar ");
					z= Verificar(2,1);
					Limpiar();
					if (z==1) {
						jugador1.AsignarObjeto("Shuriken");
						jugador1.AsignarAtaqueFisico(2);
					}
				}
				else if (x==2) {
					System.out.println("El objeto es \033[31mKunai\u001b[0m");
					System.out.println("1.Obtener \n2.Desechar ");
					z= Verificar(2,1);
					Limpiar();
					if (z==1) {
						jugador1.AsignarObjeto("Kunai");
						jugador1.AsignarAtaqueFisico(2);
					}
				}else if (x==3) {
					System.out.println("El objeto es \033[31mSello explosivo\u001b[0m");
					System.out.println("1.Obtener \n2.Desechar ");
					z= Verificar(2,1);
					Limpiar();
					if (z==1) {
						jugador1.AsignarObjeto("Sello explosivo");
						jugador1.AsignarAtaqueFisico(2);
					}
				}
			}
			else if (random > 50 && random <= 80) {
				System.out.println("Categoría obtenida: \033[34mArmas Raras\u001b[0m");
				int x = generaNumeroAleatorio(1,2);
				if (x==1) {
					System.out.println("El objeto es \033[31mFuma shuriken\u001b[0m");
					System.out.println("1.Obtener \n2.Desechar ");
					z= Verificar(2,1);
					Limpiar();
					if (z==1) {
						jugador1.AsignarObjeto("Fuma shuriken");
						jugador1.AsignarAtaqueFisico(3);
					}
				}
				else if (x==2) {
					System.out.println("El objeto es \033[31mSenbon\u001b[0m");
					System.out.println("1.Obtener \n2.Desechar ");
					z= Verificar(2,1);
					Limpiar();
					if (z==1) {
						jugador1.AsignarObjeto("Senbon");
						jugador1.AsignarAtaqueFisico(3);
					}
				}
			}
			else if (random > 80 && random <= 95) {
				System.out.println("Categoría obtenida: \033[34mArmas Épicas\u001b[0m");
				int x = generaNumeroAleatorio(1,2);
				if (x==1) {
					System.out.println("El objeto es \033[31mGuadañas\u001b[0m");
					System.out.println("1.Obtener \n2.Desechar ");
					z= Verificar(2,1);
					Limpiar();
					if (z==1) {
						jugador1.AsignarObjeto("Guadañas");
						jugador1.AsignarAtaqueFisico(4);
					}
				}
				else if (x==2) {
					System.out.println("El objeto es \033[31mEspada\u001b[0m");
					System.out.println("1.Obtener \n2.Desechar ");
					z= Verificar(2,1);
					Limpiar();
					if (z==1) {
						jugador1.AsignarObjeto("Espada");
						jugador1.AsignarAtaqueFisico(4);
					}
				}
			}
			else if (random > 95 && random <= 100) {
				System.out.println("Categoría obtenida: \033[34mArmas Legendarias\u001b[0m");
				System.out.println("El objeto es \033[31mFierro con clavos\u001b[0m");
				System.out.println("1.Obtener \n2.Desechar ");
				z= Verificar(2,1);
				Limpiar();
				if (z==1) {
					jugador1.AsignarObjeto("Fierro con clavos");
					jugador1.AsignarAtaqueFisico(5);
				}
			}
		}
	}
	/*metodo: Limpiar
	parametro: no tiene.
	retorno: void
	descripcion: Limpia la pantalla de la consola.
	*/
	public static void Limpiar() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	/*metodo: Verificar
	parametro: int max, int min
	retorno: int
	descripcion: Pide un numero hasta que este este dentro del rango aceptado.
	*/
	public static int Verificar(int max, int min) {
		int  x = 0;
		int y;
		boolean z;
		do {
			try {
				Scanner input = new Scanner(System.in);
				y = input.nextInt();
				z=VerificarRango(max,min,y);
				while (z==false) {
					System.out.println("Valor fuera de rango, ingrese un nuevo valor.");
					y=input.nextInt();
					z=VerificarRango(max,min,y);
				}
				x=1;
				return y;
			}catch (Exception e) {
				System.out.println("Ingrese un valor numerico: ");
			}
		}
		while(x==0);
		return x;
	}
	/*metodo:  VerificarRango
	parametro: int max, int min, int y
	retorno: boolean
	descripcion: Veifica el rango de los numeros, en caso que este en el rango, retorna true, sino retorna false
	*/
	public static boolean VerificarRango(int max, int min, int y) {
		if (y <= max && y >= min) {
			return true;
		}else {
			return false;
		}
	}
	/*metodo: inicio
	parametro: jugador j
	retorno: void
	descripcion: Crea un inicio interactivo segun el valor de energia.
	*/
	public static void inicio(jugador j){
		if (j.ObtenerEnergia()>=275) {
				System.out.println("╔══════════════════════╗     |");
				System.out.println("║╔════════════════════╗╚╗    |");
				System.out.println("║║████████████████████╚╗╚╗   |");
				System.out.println("║║████████Energia:"+j.ObtenerEnergia()+"█─║║║   | Vida:"+j.ObtenerVida());
				System.out.println("║║████████████████████╔╝╔╝   | Experiencia:"+j.ObtenerExperiencia());
				System.out.println("║╚════════════════════╝╔╝    | Oro:"+j.ObtenerOro());
				System.out.println("╚══════════════════════╝     | Nivel:"+j.ObtenerNivel()+" Rango:"+j.ObtenerRango());
			}else if(j.ObtenerEnergia()>=250){
				System.out.println("╔══════════════════════╗     |");
				System.out.println("║╔════════════════════╗╚╗    |");
				System.out.println("║║█████████████████   ╚╗╚╗   |");
				System.out.println("║║████████Energia:"+j.ObtenerEnergia()+" ─║║║   | Vida:"+j.ObtenerVida());
				System.out.println("║║█████████████████   ╔╝╔╝   | Experiencia:"+j.ObtenerExperiencia());
				System.out.println("║╚════════════════════╝╔╝    | Oro:"+j.ObtenerOro());
				System.out.println("╚══════════════════════╝     | Nivel:"+j.ObtenerNivel()+" Rango:"+j.ObtenerRango());
			}else if(j.ObtenerEnergia()>=225){
				System.out.println("╔══════════════════════╗     |");
				System.out.println("║╔════════════════════╗╚╗    |");
				System.out.println("║║███████████████     ╚╗╚╗   |");
				System.out.println("║║████████Energia:"+j.ObtenerEnergia()+" ─║║║   | Vida:"+j.ObtenerVida());
				System.out.println("║║███████████████     ╔╝╔╝   | Experiencia:"+j.ObtenerExperiencia());
				System.out.println("║╚════════════════════╝╔╝    | Oro:"+j.ObtenerOro());
				System.out.println("╚══════════════════════╝     | Nivel:"+j.ObtenerNivel()+" Rango:"+j.ObtenerRango());
			}else if(j.ObtenerEnergia()>=200){
				System.out.println("╔══════════════════════╗     |");
				System.out.println("║╔════════════════════╗╚╗    |");
				System.out.println("║║█████████████       ╚╗╚╗   |");
				System.out.println("║║████████Energia:"+j.ObtenerEnergia()+" ─║║║   | Vida:"+j.ObtenerVida());
				System.out.println("║║█████████████       ╔╝╔╝   | Experiencia:"+j.ObtenerExperiencia());
				System.out.println("║╚════════════════════╝╔╝    | Oro:"+j.ObtenerOro());
				System.out.println("╚══════════════════════╝     | Nivel:"+j.ObtenerNivel()+" Rango:"+j.ObtenerRango());
			}else if(j.ObtenerEnergia()>=150){
				System.out.println("╔══════════════════════╗     |");
				System.out.println("║╔════════════════════╗╚╗    |");
				System.out.println("║║██████████          ╚╗╚╗   |");
				System.out.println("║║████████Energia:"+j.ObtenerEnergia()+" ─║║║   | Vida:"+j.ObtenerVida());
				System.out.println("║║██████████          ╔╝╔╝   | Experiencia:"+j.ObtenerExperiencia());
				System.out.println("║╚════════════════════╝╔╝    | Oro:"+j.ObtenerOro());
				System.out.println("╚══════════════════════╝     | Nivel:"+j.ObtenerNivel()+" Rango:"+j.ObtenerRango());
			}else if(j.ObtenerEnergia()>=100){
				System.out.println("╔══════════════════════╗     |");
				System.out.println("║╔════════════════════╗╚╗    |");
				System.out.println("║║████████            ╚╗╚╗   |");
				System.out.println("║║████████Energia:"+j.ObtenerEnergia()+"─║║║   | Vida:"+j.ObtenerVida());
				System.out.println("║║████████            ╔╝╔╝   | Experiencia:"+j.ObtenerExperiencia());
				System.out.println("║╚════════════════════╝╔╝    | Oro:"+j.ObtenerOro());
				System.out.println("╚══════════════════════╝     | Nivel:"+j.ObtenerNivel()+" Rango:"+j.ObtenerRango());
			}else if(j.ObtenerEnergia()>=75){
				System.out.println("╔══════════════════════╗     |");
				System.out.println("║╔════════════════════╗╚╗    |");
				System.out.println("║║█████               ╚╗╚╗   |");
				System.out.println("║║█████   Energia:"+j.ObtenerEnergia()+"─║║║   | Vida:"+j.ObtenerVida());
				System.out.println("║║█████               ╔╝╔╝   | Experiencia:"+j.ObtenerExperiencia());
				System.out.println("║╚════════════════════╝╔╝    | Oro:"+j.ObtenerOro());
				System.out.println("╚══════════════════════╝     | Nivel:"+j.ObtenerNivel()+" Rango:"+j.ObtenerRango());
			}else if(j.ObtenerEnergia()>=50){
				System.out.println("╔══════════════════════╗     |");
				System.out.println("║╔════════════════════╗╚╗    |");
				System.out.println("║║███                 ╚╗╚╗   |");
				System.out.println("║║███     Energia:"+j.ObtenerEnergia()+"─║║║   | Vida:"+j.ObtenerVida());
				System.out.println("║║███                 ╔╝╔╝   | Experiencia:"+j.ObtenerExperiencia());
				System.out.println("║╚════════════════════╝╔╝    | Oro:"+j.ObtenerOro());
				System.out.println("╚══════════════════════╝     | Nivel:"+j.ObtenerNivel()+" Rango:"+j.ObtenerRango());
			}else if(j.ObtenerEnergia()>=25){
				System.out.println("╔══════════════════════╗     |");
				System.out.println("║╔════════════════════╗╚╗    |");
				System.out.println("║║█                   ╚╗╚╗   |");
				System.out.println("║║█       Energia:"+j.ObtenerEnergia()+"─║║║   | Vida:"+j.ObtenerVida());
				System.out.println("║║█                   ╔╝╔╝   | Experiencia:"+j.ObtenerExperiencia());
				System.out.println("║╚════════════════════╝╔╝    | Oro:"+j.ObtenerOro());
				System.out.println("╚══════════════════════╝     | Nivel:"+j.ObtenerNivel()+" Rango:"+j.ObtenerRango());
			}else{
				System.out.println("╔══════════════════════╗     |");
				System.out.println("║╔════════════════════╗╚╗    |");
				System.out.println("║║                    ╚╗╚╗   |");
				System.out.println("║║        Energia:"+j.ObtenerEnergia()+"─║║║   | Vida:"+j.ObtenerVida());
				System.out.println("║║                    ╔╝╔╝   | Experiencia:"+j.ObtenerExperiencia());
				System.out.println("║╚════════════════════╝╔╝    | Oro:"+j.ObtenerOro());
				System.out.println("╚══════════════════════╝     | Nivel:"+j.ObtenerNivel()+" Rango:"+j.ObtenerRango());
			}
	}
	/*metodo: Combate_help
	parametro: jugador jugador1,enemigo en,int mision
	retorno: void
	descripcion: Ayuda a la funcion combate para las batallas 1 vs 1
	*/
	public static void Combate_help(jugador jugador1,enemigo en,int mision){
		while(ComprobarVida(jugador1,en)){
			if (mision==3||mision==4||mision==5){
				System.out.println("\n\n\t\t\tRONDA N°"+jugador1.ObtenerCont());
			}
			System.out.println("\n\n\t\t\tBATALLA");
			System.out.println("Escoge una forma de atacar a tu oponente: ");
			System.out.println("1.Ataque fisico \n2.Jutsu \n");
			int atacar = Verificar(2,1);
			//Limpiar();
			if (atacar ==1) {
				Batallas1vs1(jugador1,en,0,mision);
			}else {
				int jutsu;
				System.out.println("¿Qué ninjutsu desea ocupar? ");
				if(jugador1.ObtenerNinja()=="Pythonia") {
					System.out.println("1.Jutsu Mil Anos de Interpretacion \n2.Jutsu Multi Tamaño \n3.Tecnica de Confusión de Variables \n");
					jutsu=Verificar(3,1);
					Limpiar();
					if (jutsu == 1) {
						Batallas1vs1(jugador1,en,1,mision);
					}else if(jutsu == 2) {
						Batallas1vs1(jugador1,en,2,mision);
					}else {
						Batallas1vs1(jugador1,en,3,mision);
					}
				}else if(jugador1.ObtenerNinja() == "Cthonia") {
					System.out.println("1.Freedori \n2.Punteringan \n3. Malloc Tensei \n");
					jutsu=Verificar(3,1);
					Limpiar();
					if(jutsu == 1) {
						Batallas1vs1(jugador1,en,1,mision);
					}else if(jutsu == 2) {
						Batallas1vs1(jugador1,en,2,mision);
					}else {
						Batallas1vs1(jugador1,en,3,mision);
					}
				}else if(jugador1.ObtenerNinja() == "Javania") {
					System.out.println("1.Jutsu Clones de Clases \n2.Atadura de Super Clase \n3.Tsunami de Objetos \n");
					jutsu=Verificar(3,1);
					Limpiar();
					if(jutsu == 1) {
						Batallas1vs1(jugador1,en,1,mision);
					}else if(jutsu == 2) {
						Batallas1vs1(jugador1,en,2,mision);
					}else {
						Batallas1vs1(jugador1,en,3,mision);
					}
				}else if(jugador1.ObtenerNinja() == "Schemia") {
					System.out.println("1.Parentesiyomi Infinito \n2.Jutsu Recursion de Fuego \n3.Letsano \n");
					jutsu=Verificar(3,1);
					Limpiar();
					if(jutsu == 1) {
						Batallas1vs1(jugador1,en,1,mision);
					}else if(jutsu == 2) {
						Batallas1vs1(jugador1,en,2,mision);
					}else {
						Batallas1vs1(jugador1,en,3,mision);
					}
				}else if(jugador1.ObtenerNinja() == "Prolonia") {
					System.out.println("1.Confusion Falso Verdadero \n2.Querykugan \n3.Gran Explosion de Backtracking \n");
					jutsu=Verificar(3,1);
					Limpiar();
					if(jutsu == 1) {
						Batallas1vs1(jugador1,en,1,mision);
					}else if(jutsu == 2) {
						Batallas1vs1(jugador1,en,2,mision);
					}else {
						Batallas1vs1(jugador1,en,3,mision);
					}
				}
			}
			System.out.println("\n\n\t\t\tFIN BATALLA\n");
		}
		if (mision==3||mision==4||mision==5){
			System.out.println("\n\n\t\t\tFIN RONDA N°"+jugador1.ObtenerCont());
		}
	}
	/*metodo: Combate_help
	parametro: jugador jugador1,enemigo en1,enemigo en2,int mision
	retorno: void
	descripcion: Ayuda a la funcion combate para las batallas 1 vs 2
	*/
	public static void Combate_help2(jugador jugador1,enemigo en1,enemigo en2,int mision){
		System.out.println("¿A cual enemigo deseas atacar?");
		System.out.println("1."+en1.ObtenerNombre()+" el ninja "+en1.ObtenerRango()+" de la aldea "+en1.ObtenerNinja()+" \n2."+en2.ObtenerNombre()+" el ninja "+en2.ObtenerRango()+" de la aldea "+en2.ObtenerNinja()+" \n");
		int tipo_enemigo = Verificar(2,1);
		System.out.println("Escoge una forma de atacar a tu oponente: ");
		System.out.println("1.Ataque fisico \n2.Jutsu \n");
		int atacar = Verificar(2,1);
		//Limpiar();
		if (atacar ==1) {
			Batallas1vs2(jugador1,en1,en2,0,tipo_enemigo);
		}else {
			int jutsu;
			System.out.println("¿Qué ninjutsu desea ocupar? ");
			if(jugador1.ObtenerNinja()=="Pythonia") {
				System.out.println("1.Jutsu Mil Anos de Interpretacion \n2.Jutsu Multi Tamano \n3.Tecnica de Confusión de Variables \n");
				jutsu=Verificar(3,1);
				Limpiar();
				if (jutsu == 1) {
					Batallas1vs2(jugador1,en1,en2,1,tipo_enemigo);
				}else if(jutsu == 2) {
					Batallas1vs2(jugador1,en1,en2,2,tipo_enemigo);
				}else {
					Batallas1vs2(jugador1,en1,en2,3,tipo_enemigo);
				}
			}else if(jugador1.ObtenerNinja() == "Cthonia") {
				System.out.println("1.Freedori \n2.Punteringan \n3. Malloc Tensei \n");
				jutsu=Verificar(3,1);
				Limpiar();
				if(jutsu == 1) {
					Batallas1vs2(jugador1,en1,en2,1,tipo_enemigo);
				}else if(jutsu == 2) {
					Batallas1vs2(jugador1,en1,en2,2,tipo_enemigo);
				}else {
					Batallas1vs2(jugador1,en1,en2,3,tipo_enemigo);
				}
			}else if(jugador1.ObtenerNinja() == "Javania") {
				System.out.println("1.Jutsu Clones de Clases \n2.Atadura de Super Clase \n3.Tsunami de Objetos \n");
				jutsu=Verificar(3,1);
				Limpiar();
				if (jutsu == 1) {
					Batallas1vs2(jugador1,en1,en2,1,tipo_enemigo);
				}else if(jutsu == 2) {
					Batallas1vs2(jugador1,en1,en2,2,tipo_enemigo);
				}else {
					Batallas1vs2(jugador1,en1,en2,3,tipo_enemigo);
				}
			}else if(jugador1.ObtenerNinja() == "Schemia") {
				System.out.println("1.Parentesiyomi Infinito \n2.Jutsu Recursion de Fuego \n3.Letsano \n");
				jutsu=Verificar(3,1);
				Limpiar();
				if (jutsu == 1) {
					Batallas1vs2(jugador1,en1,en2,1,tipo_enemigo);
				}else if(jutsu == 2) {
					Batallas1vs2(jugador1,en1,en2,2,tipo_enemigo);
				}else {
					Batallas1vs2(jugador1,en1,en2,3,tipo_enemigo);
				}
			}else if(jugador1.ObtenerNinja() == "Prolonia") {
				System.out.println("1.Confusion Falso Verdadero \n2.Querykugan \n3.Gran Explosion de Backtracking \n");
				jutsu=Verificar(3,1);
				Limpiar();
				if (jutsu == 1) {
					Batallas1vs2(jugador1,en1,en2,1,tipo_enemigo);
				}else if(jutsu == 2) {
					Batallas1vs2(jugador1,en1,en2,2,tipo_enemigo);
				}else {
					Batallas1vs2(jugador1,en1,en2,3,tipo_enemigo);
				}
			}
		}
	}
	/*metodo: Combate
	parametro: jugador jugador1, int tipo_mision
	retorno: void
	descripcion: Inicializa los enemigos segun el tipo de mision que corresponda
	*/
	public static void Combate(jugador jugador1, int tipo_mision){
		if(tipo_mision==1){
			int opcion = generaNumeroAleatorio(1,2);
			if(opcion==1){
				jugador1.AsignarCont(0);
				System.out.println("Que suerte tienes "+jugador1.ObtenerNombre()+"! No te topaste con un enemigo en esta oportunidad.");
				Recompensas(jugador1,1);
			}else {
				enemigo en= new enemigo();
				en.AsignarNivel(1);
				System.out.println("Tu enemigo es "+en.ObtenerNombre()+" el ninja "+en.ObtenerRango()+" de la aldea "+en.ObtenerNinja()+" su nivel es "+en.ObtenerNivel()+"\n");
				jugador1.AsignarCont(0);
				Combate_help(jugador1,en,1);
			}
		}else if (tipo_mision==2){
			enemigo en= new enemigo();
			en.AsignarNivel(4);
			System.out.println("Tu enemigo es "+en.ObtenerNombre()+" el ninja "+en.ObtenerRango()+" de la aldea "+en.ObtenerNinja()+" su nivel es "+en.ObtenerNivel()+"\n");
			jugador1.AsignarCont(0);
			Combate_help(jugador1,en,2);
		}else if (tipo_mision==3){
			int rivales=generaNumeroAleatorio(1,2);
			if(rivales==1){
				System.out.println("En esta ocasión te tocará enfrentar en una primera ronda a \033[31mun enemigo\u001b[0m y si sobrevives, enfrentas una segunda ronda con \033[31motro enemigo\u001b[0m. ¿Estás preparado para el desafío?\n");
				enemigo en1= new enemigo();
				en1.AsignarNivel(6);
				System.out.println("Tu primer enemigo es "+en1.ObtenerNombre()+" el ninja "+en1.ObtenerRango()+" de la aldea "+en1.ObtenerNinja()+" y su nivel es "+en1.ObtenerNivel()+"\n");
				jugador1.AsignarCont(1);
				Combate_help(jugador1,en1,3);
				enemigo en2= new enemigo();
				en2.AsignarNivel(6);
				System.out.println("Tu ultimo enemigo es "+en2.ObtenerNombre()+" el ninja "+en2.ObtenerRango()+" de la aldea "+en2.ObtenerNinja()+" y su nivel es "+en2.ObtenerNivel()+"\n");
				jugador1.AsignarCont(2);
				Combate_help(jugador1,en2,3);
			}else {
				System.out.println("En esta ocasión te tocará enfrentar en una primera ronda a \033[31mdos enemigos\u001b[0m y si sobrevives, enfrentas una segunda ronda con \033[31motro enemigo\u001b[0m. ¿Estás preparado para el desafío?\n");
				enemigo en1= new enemigo();
				enemigo en2= new enemigo();
				en1.AsignarNivel(6);
				en2.AsignarNivel(6);
				System.out.println("Tus enemigos de la primera ronda son "+en1.ObtenerNombre()+" el ninja "+en1.ObtenerRango()+" de la aldea "+en1.ObtenerNinja()+" y "+en2.ObtenerNombre()+" el ninja "+en2.ObtenerRango()+" de la aldea "+en2.ObtenerNinja()+", ambos de nivel "+en1.ObtenerNivel()+"\n");
				jugador1.AsignarCont(1);
				while(jugador1.ObtenerVida()>=0 && en1.ObtenerVida()>=0 && en2.ObtenerVida()>=0){
				System.out.println("\n\n\t\t\tRONDA N°"+jugador1.ObtenerCont());
					System.out.println("\n\n\t\t\tBATALLA");
					Combate_help2(jugador1,en1,en2,3);
				}
				if (jugador1.ObtenerVida()<=0){
					Limpiar();
					System.out.println("Has perdido la primera batalla, intenta nuevamente ");
				}
				if (en1.ObtenerVida()<=0){
					System.out.println("FELICIDADES DERROTASTE A " + en1.ObtenerNombre()+" Tu ataque ahora ira dirigido a "+ en2.ObtenerNombre());
					Combate_help(jugador1,en2,3);
				}
				if (en2.ObtenerVida()<=0){
					System.out.println("FELICIDADES DERROTASTE A " + en2.ObtenerNombre()+" Tu ataque ahora ira dirigido a "+ en1.ObtenerNombre());
					Combate_help(jugador1,en1,3);
				}
				enemigo en3= new enemigo();
				en3.AsignarNivel(6);
				System.out.println("Tu ultimo enemigo es "+en3.ObtenerNombre()+" el ninja "+en3.ObtenerRango()+" de la aldea "+en3.ObtenerNinja()+" y su nivel es "+en3.ObtenerNivel()+"\n");
				jugador1.AsignarCont(2);
				Combate_help(jugador1,en3,3);
			}
		}else if (tipo_mision==4){
			int rivalesronda1=generaNumeroAleatorio(1,2);
			int rivalesronda2=generaNumeroAleatorio(1,2);
			if (rivalesronda1==1){
				if (rivalesronda2==1){
					System.out.println("En esta ocasión te tocará enfrentar en una primera ronda a \033[31mun enemigo\u001b[0m y si sobrevives, enfrentas una segunda ronda con \033[31motro enemigo\u001b[0m. ¿Estás preparado para el desafío?\n");
					enemigo en1= new enemigo();
					en1.AsignarNivel(8);
					System.out.println("Tu primer enemigo es "+en1.ObtenerNombre()+" el ninja "+en1.ObtenerRango()+" de la aldea "+en1.ObtenerNinja()+" y su nivel es "+en1.ObtenerNivel()+"\n");
					jugador1.AsignarCont(1);
					Combate_help(jugador1,en1,4);
					enemigo en2= new enemigo();
					en2.AsignarNivel(8);
					System.out.println("Tu ultimo enemigo es "+en2.ObtenerNombre()+" el ninja "+en2.ObtenerRango()+" de la aldea "+en2.ObtenerNinja()+" y su nivel es "+en2.ObtenerNivel()+"\n");
					jugador1.AsignarCont(2);
					Combate_help(jugador1,en2,4);
				}else{
					System.out.println("En esta ocasión te tocará enfrentar en una primera ronda a \033[31mun enemigo\u001b[0m y si sobrevives, enfrentas una segunda ronda con \033[31mdos enemigos\u001b[0m. ¿Estás preparado para el desafío?\n");
					enemigo en1= new enemigo();
					en1.AsignarNivel(8);
					System.out.println("Tu primer enemigo es "+en1.ObtenerNombre()+" el ninja "+en1.ObtenerRango()+" de la aldea "+en1.ObtenerNinja()+" y su nivel es "+en1.ObtenerNivel()+"\n");
					jugador1.AsignarCont(1);
					Combate_help(jugador1,en1,4);
					enemigo en2= new enemigo();
					enemigo en3= new enemigo();
					en2.AsignarNivel(8);
					en3.AsignarNivel(8);
					System.out.println("Tus enemigos de la segunda ronda son "+en2.ObtenerNombre()+" el ninja "+en2.ObtenerRango()+" de la aldea "+en2.ObtenerNinja()+" y "+en3.ObtenerNombre()+" el ninja "+en3.ObtenerRango()+" de la aldea "+en3.ObtenerNinja()+", ambos de nivel "+en2.ObtenerNivel()+"\n");
					int n=1;
					jugador1.AsignarCont(2);
					while(jugador1.ObtenerVida()>=0 && en2.ObtenerVida()>=0 && en3.ObtenerVida()>=0){
					System.out.println("\n\n\t\t\tRONDA N°"+jugador1.ObtenerCont());
						System.out.println("\n\n\t\t\tBATALLA");
						Combate_help2(jugador1,en2,en3,4);
						System.out.println("\n\n\t\t\tFIN BATALLA");
					}
					if (jugador1.ObtenerVida()<=0){
						Limpiar();
						System.out.println("Has perdido la primera batalla, intenta nuevamente ");
					}
					if (en2.ObtenerVida()<=0){
						System.out.println("FELICIDADES DERROTASTE A " + en2.ObtenerNombre()+" Tu ataque ahora ira dirigido a "+ en3.ObtenerNombre());
						Combate_help(jugador1,en3,4);
					}
					if (en3.ObtenerVida()<=0){
						System.out.println("FELICIDADES DERROTASTE A " + en3.ObtenerNombre()+" Tu ataque ahora ira dirigido a "+ en2.ObtenerNombre());
						Combate_help(jugador1,en2,4);
					}
				}
			}else{
				if (rivalesronda2==1){
					System.out.println("En esta ocasión te tocará enfrentar en una primera ronda a \033[31mdos enemigos\u001b[0m y si sobrevives, enfrentas una segunda ronda con \033[31motro enemigo\u001b[0m. ¿Estás preparado para el desafío?\n");
					enemigo en1= new enemigo();
					enemigo en2= new enemigo();
					en1.AsignarNivel(8);
					en2.AsignarNivel(8);
					System.out.println("Tus enemigos de la primera ronda son "+en1.ObtenerNombre()+" el ninja "+en1.ObtenerRango()+" de la aldea "+en1.ObtenerNinja()+" y "+en2.ObtenerNombre()+" el ninja "+en2.ObtenerRango()+" de la aldea "+en2.ObtenerNinja()+", ambos de nivel "+en1.ObtenerNivel()+"\n");
					jugador1.AsignarCont(1);
					while(jugador1.ObtenerVida()>=0 && en1.ObtenerVida()>=0 && en2.ObtenerVida()>=0){
					System.out.println("\n\n\t\t\tRONDA N°"+jugador1.ObtenerCont());
						System.out.println("\n\n\t\t\tBATALLA");
						Combate_help2(jugador1,en1,en2,4);
					}
					if (jugador1.ObtenerVida()<=0){
						Limpiar();
						System.out.println("Has perdido la primera batalla, intenta nuevamente ");

					}
					if (en1.ObtenerVida()<=0){
						System.out.println("FELICIDADES DERROTASTE A " + en1.ObtenerNombre()+" Tu ataque ahora ira dirigido a "+ en2.ObtenerNombre());
						Combate_help(jugador1,en2,4);
					}
					if (en2.ObtenerVida()<=0){
						System.out.println("FELICIDADES DERROTASTE A " + en2.ObtenerNombre()+" Tu ataque ahora ira dirigido a "+ en1.ObtenerNombre());
						Combate_help(jugador1,en1,4);
					}
					enemigo en3= new enemigo();
					en3.AsignarNivel(8);
					System.out.println("Tu ultimo enemigo es "+en3.ObtenerNombre()+" el ninja "+en3.ObtenerRango()+" de la aldea "+en3.ObtenerNinja()+" y su nivel es "+en3.ObtenerNivel()+"\n");
					jugador1.AsignarCont(2);
					Combate_help(jugador1,en3,4);
				}else{
					System.out.println("En esta ocasión te tocará enfrentar en una primera ronda a \033[31mdos enemigos\u001b[0m y si sobrevives, enfrentas una segunda ronda con \033[31mdos enemigos\u001b[0m. ¿Estás preparado para el desafío?\n");
					enemigo en1= new enemigo();
					enemigo en2= new enemigo();
					en1.AsignarNivel(8);
					en2.AsignarNivel(8);
					System.out.println("Tus enemigos de la primera ronda son "+en1.ObtenerNombre()+" el ninja "+en1.ObtenerRango()+" de la aldea "+en1.ObtenerNinja()+" y "+en2.ObtenerNombre()+" el ninja "+en2.ObtenerRango()+" de la aldea "+en2.ObtenerNinja()+", ambos de nivel "+en1.ObtenerNivel()+"\n");
					jugador1.AsignarCont(1);
					while(jugador1.ObtenerVida()>=0 && en1.ObtenerVida()>=0 && en2.ObtenerVida()>=0){
					System.out.println("\n\n\t\t\tRONDA N°"+jugador1.ObtenerCont());
						System.out.println("\n\n\t\t\tBATALLA");
						Combate_help2(jugador1,en1,en2,4);
					}
					if (jugador1.ObtenerVida()<=0){
						Limpiar();
						System.out.println("Has perdido la primera batalla, intenta nuevamente ");

					}
					if (en1.ObtenerVida()<=0){
						System.out.println("FELICIDADES DERROTASTE A " + en1.ObtenerNombre()+" Tu ataque ahora ira dirigido a "+ en2.ObtenerNombre());
						Combate_help(jugador1,en2,4);
					}
					if (en2.ObtenerVida()<=0){
						System.out.println("FELICIDADES DERROTASTE A " + en2.ObtenerNombre()+" Tu ataque ahora ira dirigido a "+ en1.ObtenerNombre());
						Combate_help(jugador1,en1,4);
					}
					enemigo en3= new enemigo();
					enemigo en4= new enemigo();
					en3.AsignarNivel(8);
					en4.AsignarNivel(8);
					System.out.println("Tus enemigos de la segunda ronda son "+en3.ObtenerNombre()+" el ninja "+en3.ObtenerRango()+" de la aldea "+en3.ObtenerNinja()+" y "+en4.ObtenerNombre()+" el ninja "+en4.ObtenerRango()+" de la aldea "+en4.ObtenerNinja()+", ambos de nivel "+en3.ObtenerNivel()+"\n");
					jugador1.AsignarCont(2);
					while(jugador1.ObtenerVida()>=0 && en3.ObtenerVida()>=0 && en4.ObtenerVida()>=0){
					System.out.println("\n\n\t\t\tRONDA N°"+jugador1.ObtenerCont());
						System.out.println("\n\n\t\t\tBATALLA");
						Combate_help2(jugador1,en3,en4,4);
					}
					if (jugador1.ObtenerVida()<=0){
						Limpiar();
						System.out.println("Has perdido la primera batalla, intenta nuevamente ");
					}
					if (en3.ObtenerVida()<=0){
						System.out.println("FELICIDADES DERROTASTE A " + en3.ObtenerNombre()+" Tu ataque ahora ira dirigido a "+ en4.ObtenerNombre());
						Combate_help(jugador1,en4,4);
					}
					if (en4.ObtenerVida()<=0){
						System.out.println("FELICIDADES DERROTASTE A " + en4.ObtenerNombre()+" Tu ataque ahora ira dirigido a "+ en3.ObtenerNombre());
						Combate_help(jugador1,en3,4);
					}
				}
			}
		}else if(tipo_mision==5){
			System.out.println("En esta ocasión te tocará enfrentar en una primera ronda a \033[31mdos enemigos\u001b[0m y si sobrevives, enfrentas una segunda ronda con \033[31mdos enemigos\u001b[0m, finalmente si sigues con vida habrá una tercera ronda con \033[31mun enemigo\u001b[0m. ¿Estás preparado para el desafío?\n");
			enemigo en1= new enemigo();
			enemigo en2= new enemigo();
			en1.AsignarNivel(10);
			en2.AsignarNivel(10);
			System.out.println("Tus enemigos de la primera ronda son "+en1.ObtenerNombre()+" el ninja "+en1.ObtenerRango()+" de la aldea "+en1.ObtenerNinja()+" y "+en2.ObtenerNombre()+" el ninja "+en2.ObtenerRango()+" de la aldea "+en2.ObtenerNinja()+", ambos de nivel "+en1.ObtenerNivel()+"\n");
			jugador1.AsignarCont(1);
			while(jugador1.ObtenerVida()>=0 && en1.ObtenerVida()>=0 && en2.ObtenerVida()>=0){
			System.out.println("\n\n\t\t\tRONDA N°"+jugador1.ObtenerCont());
				System.out.println("\n\n\t\t\tBATALLA");
				Combate_help2(jugador1,en1,en2,5);
			}
			if (jugador1.ObtenerVida()<=0){
				Limpiar();
				System.out.println("Has perdido la primera batalla, intenta nuevamente ");

			}
			if (en1.ObtenerVida()<=0){
				System.out.println("FELICIDADES DERROTASTE A " + en1.ObtenerNombre()+" Tu ataque ahora ira dirigido a "+ en2.ObtenerNombre());
				Combate_help(jugador1,en2,5);
			}
			if (en2.ObtenerVida()<=0){
				System.out.println("FELICIDADES DERROTASTE A " + en2.ObtenerNombre()+" Tu ataque ahora ira dirigido a "+ en1.ObtenerNombre());
				Combate_help(jugador1,en1,5);
			}
			enemigo en3= new enemigo();
			enemigo en4= new enemigo();
			en3.AsignarNivel(10);
			en4.AsignarNivel(10);
			System.out.println("Tus enemigos de la segunda ronda son "+en3.ObtenerNombre()+" el ninja "+en3.ObtenerRango()+" de la aldea "+en3.ObtenerNinja()+" y "+en4.ObtenerNombre()+" el ninja "+en4.ObtenerRango()+" de la aldea "+en4.ObtenerNinja()+", ambos de nivel "+en3.ObtenerNivel()+"\n");
			jugador1.AsignarCont(2);
			while(jugador1.ObtenerVida()>=0 && en3.ObtenerVida()>=0 && en4.ObtenerVida()>=0){
			System.out.println("\n\n\t\t\tRONDA N°"+jugador1.ObtenerCont());
				System.out.println("\n\n\t\t\tBATALLA");
				Combate_help2(jugador1,en3,en4,5);
			}
			if (jugador1.ObtenerVida()<=0){
				Limpiar();
				System.out.println("Has perdido la primera batalla, intenta nuevamente ");
			}
			if (en3.ObtenerVida()<=0){
				System.out.println("FELICIDADES DERROTASTE A " + en3.ObtenerNombre()+" Tu ataque ahora ira dirigido a "+ en4.ObtenerNombre());
				Combate_help(jugador1,en4,5);
			}
			if (en4.ObtenerVida()<=0){
				System.out.println("FELICIDADES DERROTASTE A " + en4.ObtenerNombre()+" Tu ataque ahora ira dirigido a "+ en3.ObtenerNombre());
				Combate_help(jugador1,en3,5);
			}
			enemigo en5= new enemigo();
			en5.AsignarNivel(10);
			System.out.println("Tu ultimo enemigo es "+en5.ObtenerNombre()+" el ninja "+en5.ObtenerRango()+" de la aldea "+en5.ObtenerNinja()+" y su nivel es "+en5.ObtenerNivel()+"\n");
			jugador1.AsignarCont(3);
			Combate_help(jugador1,en5,5);
		}else if (tipo_mision == 11){
			String kage;
			String ninja=jugador1.ObtenerNinja();
			if(ninja=="Pythonia"){
				kage="Pykage";
			}else if (ninja=="Cthonia"){
				kage="Ckage";
			}else if (ninja=="Javania"){
				kage="Javakage";
			}else if (ninja=="Schemia"){
				kage="Schekage";
			}else{
				kage="Prokage";
			}
			System.out.println("Debes triunfar en la siguiente prueba para volverte kage de tu aldea, "+jugador1.ObtenerNombre()+" "+jugador1.ObtenerRango()+" de "+ninja+"\n");
			enemigo enkage = new enemigo(ninja);
			Combate_help(jugador1,enkage,11);
			if (jugador1.ObtenerVida() > 0 && enkage.ObtenerVida() <= 0){
				System.out.println("¡FELICIDADES HAS GANADO UNA BATALLA BRUTAL, ERES EL NUEVO KAGE DE TU ALDEA!");
			}else{
				System.out.println("Has perdido una batalla digna, no te preocupes e intenta nuevamente ");
			}
		}
	}
	/*metodo: Batallas1vs1
	parametro: jugador jugador1, enemigo enemigo1, int jutsu, int tipo_mision
	retorno: void
	descripcion: Realiza una batalla de un jugador vs un enemigo.
	*/
	public static void Batallas1vs1(jugador jugador1, enemigo enemigo1, int jutsu, int tipo_mision){
		System.out.println(jugador1.ObtenerNombre()+" realizara su ataque \n");
		System.out.println("La vida del enemigo antes del ataque es "+enemigo1.ObtenerVida());
		enemigo1.RecibirDaño(jugador1.RealizarAtaque(jutsu));
		System.out.println("La vida del enemigo despues del ataque es "+enemigo1.ObtenerVida()+"\n");
		System.out.println(enemigo1.ObtenerNombre()+" realizara su ataque \n");
		System.out.println("La vida de " +jugador1.ObtenerNombre() +" antes del ataque es "+ jugador1.ObtenerVida());
		jugador1.RecibirDaño(enemigo1.RealizarAtaque(jutsu));
		System.out.println("La vida de " +jugador1.ObtenerNombre() +" despues del ataque es "+ jugador1.ObtenerVida()+"\n");
		if (enemigo1.ObtenerVida() <= 0){
			Limpiar();
			System.out.println("FELICIDADES DERROTASTE A "+enemigo1.ObtenerNombre()+ "!!!");
			Recompensas(jugador1,tipo_mision);
		}else if(jugador1.ObtenerVida() <= 0){
			Limpiar();
			System.out.println("Has perdido la batalla, intenta nuevamente ");
		}
	}
	/*metodo: Batallas1vs2
	parametro: jugador jugador1, enemigo enemigo1,enemigo enemigo2, int jutsu, int tipo_enemigo
	retorno: void
	descripcion: Realiza una batalla de un jugador vs dos enemigos.
	*/
	public static void Batallas1vs2(jugador jugador1, enemigo enemigo1,enemigo enemigo2, int jutsu, int tipo_enemigo){
		if (tipo_enemigo == 1){
			System.out.println(jugador1.ObtenerNombre()+" realizara su ataque \n");
			System.out.println("La vida del enemigo antes del ataque es "+enemigo1.ObtenerVida());
			enemigo1.RecibirDaño(jugador1.RealizarAtaque(jutsu));
			System.out.println("La vida del enemigo despues del ataque es "+enemigo1.ObtenerVida()+"\n");
			System.out.println(enemigo1.ObtenerNombre()+" realizara su ataque \n");
			System.out.println("La vida de " +jugador1.ObtenerNombre() +" antes del ataque es "+ jugador1.ObtenerVida());
			jugador1.RecibirDaño(enemigo1.RealizarAtaque(jutsu));
			System.out.println("La vida de " +jugador1.ObtenerNombre() +" despues del ataque es "+ jugador1.ObtenerVida()+"\n");
			System.out.println(enemigo2.ObtenerNombre()+" realizara su ataque \n");
			System.out.println("La vida de " +jugador1.ObtenerNombre() +" antes del ataque es "+ jugador1.ObtenerVida());
			jugador1.RecibirDaño(enemigo2.RealizarAtaque(jutsu));
			System.out.println("La vida de " +jugador1.ObtenerNombre() +" despues del ataque es "+ jugador1.ObtenerVida()+"\n");
		}else if (tipo_enemigo == 2){
			System.out.println(jugador1.ObtenerNombre()+" realizara su ataque \n");
			System.out.println("La vida del enemigo antes del ataque es "+enemigo2.ObtenerVida());
			enemigo2.RecibirDaño(jugador1.RealizarAtaque(jutsu));
			System.out.println("La vida del enemigo despues del ataque es "+enemigo2.ObtenerVida()+"\n");
			System.out.println(enemigo2.ObtenerNombre()+" realizara su ataque \n");
			System.out.println("La vida de " +jugador1.ObtenerNombre() +" antes del ataque es "+ jugador1.ObtenerVida());
			jugador1.RecibirDaño(enemigo2.RealizarAtaque(jutsu));
			System.out.println("La vida de " +jugador1.ObtenerNombre() +" despues del ataque es "+ jugador1.ObtenerVida()+"\n");
			System.out.println(enemigo1.ObtenerNombre()+" realizara su ataque \n");
			System.out.println("La vida de " +jugador1.ObtenerNombre() +" antes del ataque es "+ jugador1.ObtenerVida());
			jugador1.RecibirDaño(enemigo1.RealizarAtaque(jutsu));
			System.out.println("La vida de " +jugador1.ObtenerNombre() +" despues del ataque es "+ jugador1.ObtenerVida()+"\n");
		}
	}
	/*metodo: generaNumeroAleatorio
	parametro: int minimo,int maximo
	retorno: int
	descripcion: genera un numero aleatorio entre los dos numeros entregados, incluyendo estos valores.
	*/
	public static int generaNumeroAleatorio(int minimo,int maximo){
       int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
       return num;
   }
	 /*metodo: Recompensas
 	parametro: jugador jugador1, int mision
 	retorno: void
 	descripcion: Entrega las recompensas correspondientes segun el tipo de mision, siempre que se haya terminado la ultima ronda.
 	*/
	public static void Recompensas(jugador jugador1, int mision){
		if ((jugador1.ObtenerCont()==0) || (mision==3 && jugador1.ObtenerCont()==2)||(mision==4 && jugador1.ObtenerCont()==2)||(mision==5 && jugador1.ObtenerCont()==3)){
			int exp;
			int oro;
			if (mision==1){
				exp=10;
				oro =generaNumeroAleatorio(5,10);
			}else if (mision==2){
				exp=30;
				oro =generaNumeroAleatorio(20,30);
			}else if (mision==3){
				exp=45;
				oro =generaNumeroAleatorio(50,80);
			}else if (mision==4){
				exp=70;
				oro =generaNumeroAleatorio(100,120);
			}else {
				exp=100;
				oro =generaNumeroAleatorio(130,160);
			}
			jugador1.AsignarExperiencia(jugador1.ObtenerExperiencia()+exp);
			jugador1.AsignarOro(jugador1.ObtenerOro()+oro);
			System.out.println("Felicidades por completar la misión! Tus recompensas son "+exp+" de experiencia y "+oro+" de oro!");
		}else{
			if (mision==3||mision==4){
				System.out.println("Felicidades!, has sobrevivido a la primera ronda, debes sobrevivir a la segunda para completar la mision!");
			}
			if(mision==5 && jugador1.ObtenerCont()==1){
				System.out.println("Felicidades!, has sobrevivido a la primera ronda, debes sobrevivir a la segunda y a la tercera para completar la mision!");
			}else if(mision==5 && jugador1.ObtenerCont()==2){
				System.out.println("Felicidades!, has sobrevivido a la segunds ronda, debes sobrevivir a la tercera para completar la mision!");
			}
		}
	}
	/*metodo: VerificarRangoNinja
	parametro: jugador jugador1, int n
	retorno: int
	descripcion: Verifica el rango del ninja para saber si puede hacer una dicha mision.
	*/
	public static int VerificarRangoNinja(jugador jugador1, int n) {
		int x=0;
		int nivel,q;
		boolean z;
		nivel=jugador1.ObtenerNivel();
		do {
			if(n==1) {
				z=VerificarRango(2,1,nivel);
				jugador1.AsignarOpcion(1);
				while(z==false) {
					System.out.println("No tiene el nivel para Realizar esta mision, ingrese una nueva mision. ");
					q = Verificar(5,1);
					VerificarRangoNinja(jugador1,q);
					break;
				}
				x=1;
			}else if (n==2) {
				z=VerificarRango(6,1,nivel);
				jugador1.AsignarOpcion(2);
				while(z==false) {
					System.out.println("No tiene el nivel para Realizar esta mision, ingrese una nueva mision. ");
					q = Verificar(5,1);
					VerificarRangoNinja(jugador1,q);
					break;
				}
				x=1;
			}else if (n==3) {
				z=VerificarRango(6,3,nivel);
				jugador1.AsignarOpcion(3);
				while(z==false) {
					System.out.println("No tiene el nivel para Realizar esta mision, ingrese una nueva mision. ");
					q=Verificar(5,1);
					VerificarRangoNinja(jugador1,q);
					break;
				}
				x=1;
			}else if (n ==4) {
				z=VerificarRango(10,7,nivel);
				jugador1.AsignarOpcion(4);
				while(z==false) {
					System.out.println("No tiene el nivel para Realizar esta mision, ingrese una nueva mision. ");
					q = Verificar(5,1);
					VerificarRangoNinja(jugador1,q);
					break;
				}
				x=1;
			}else if (n == 5) {
				z=VerificarRango(11,7,nivel); //max 11?
				jugador1.AsignarOpcion(5);
				while(z==false) {
					System.out.println("No tiene el nivel para Realizar esta mision, ingrese una nueva mision. ");
					q = Verificar(5,1);
					VerificarRangoNinja(jugador1,q);
					break;
				}
				x=1;
			}
			return jugador1.ObtenerOpcion();
		}
		while(x==0);
	}
	/*metodo: ComprobarVida
	parametro: jugador jugador1, enemigo enemigo1
	retorno: boolean
	descripcion: Comprueba la vida del jugador y del enemigo con el fin de saber si uno de los sigue vivo.
	*/
	public static boolean ComprobarVida(jugador jugador1, enemigo enemigo1){
		if (jugador1.ObtenerVida() <= 0 || enemigo1.ObtenerVida() <= 0 ){
			return false;
		}else{
			return true;
		}
	}
	/*metodo: main
	parametro: String[] args
	retorno: void
	descripcion: Realiza el juego, muestra el inicio y menu de opciones a realizar.
	*/
	public static void main(String[] args) {
		Limpiar();
		System.out.println("*****╔╦╦╦═╦╗╔═╦═╦══╦═╗*****");
		System.out.println("     ║║║║╩╣╚╣═╣║║║║║╩╣");
		System.out.println("*****╚══╩═╩═╩═╩═╩╩╩╩═╝*****");
		Scanner input = new Scanner(System.in);
		boolean juego=true;;
		int fin;
		int desbloqueo=0;
		System.out.println("Ingrese su nombre");
		String line	 = input.nextLine();
		Limpiar();
		System.out.println("Elige una de las cinco aldeas! ");
		System.out.println("1.Pythonia \n2.Cthonia \n3.Javania \n4.Schemia \n5.Prolonia \n");
		int aldea = Verificar(5,1);
		Limpiar();
		jugador jugador1 = new jugador(line,aldea);
		System.out.println("\033[36mTE DAMOS LA BIENVENIDA \033[35m"+jugador1.ObtenerNombre()+" "+jugador1.ObtenerRango()+" de "+jugador1.ObtenerNinja()+"\u001b[0m\n");
		while(juego) {
			if(jugador1.ObtenerExperiencia()>=100){
				jugador1.AsignarNivel(jugador1.ObtenerNivel()+1);
				jugador1.AsignarExperiencia(jugador1.ObtenerExperiencia()-100);
				System.out.println("\033[36mHas alcanzado 100 de experiencia!! Por lo tanto subes de nivel, tu nuevo nivel es "+jugador1.ObtenerNivel()+"\u001b[0m");
			}
			inicio(jugador1);
			if (jugador1.ObtenerEnergia()<=0){
				System.out.println("\033[36mGAME OVER, buena partida \033[35m"+jugador1.ObtenerNombre()+" "+jugador1.ObtenerRango()+" de "+jugador1.ObtenerNinja()+"\u001b[0m, hasta la próxima!\u001b[0m");
			}
			if (jugador1.ObtenerEnergia()<20){
				System.out.println("\033[41mCUIDA TU ENERGIA!! Si llega a cero es el fin del juego!\u001b[0m");
				Limpiar();
			}
			enemigo en = new enemigo();
			if (jugador1.ObtenerNivel()==11){
				System.out.println("\n\033[36mFelicidades, "+jugador1.ObtenerNombre()+" ahora eres un ninja "+jugador1.ObtenerRango()+" de nivel 11! Se desbloqueó una nueva opción en el menú.\u001b[0m\n");
				desbloqueo=1;
			}
			if (desbloqueo==0){
				System.out.println("Elige una opcion a Realizar: ");
				System.out.println("1. Realizar Mision \n2. Obtener Caja \n3. Salir \n");
				int x = Verificar(3,1);
				Limpiar();
				if (x == 1) {
					jugador1.AsignarEnergia(jugador1.ObtenerEnergia()-5);
					System.out.println("Escoge un tipo de mision: ");
					System.out.println("1.Mision D \n2.Mision C \n3.Mision B \n4.Mision A \n5.Mision S ");
					int z=Verificar(5,1);
					fin = VerificarRangoNinja(jugador1,z);
					Limpiar();
					if (fin==1) {
						Combate(jugador1,1);
					}else if (fin==2){
						Combate(jugador1,2);
					}else if (fin==3){
						Combate(jugador1,3);
					}else if (fin==4){
						Combate(jugador1,4);
					}else if (fin==5){
						Combate(jugador1,5);
					}
					jugador1.AsignarVida(100+jugador1.ObtenerNivel());
				}else if (x==2) {
					if(jugador1.ObtenerOro() >= 300) {
						System.out.println("El costo de tu caja fue de 300 oros\n");
						Fortuna(jugador1);
						System.out.println("El objeto obtenido es \033[31m"+ jugador1.ObtenerObjeto()+"\u001b[0m y el daño extra que provoca es "+jugador1.ObtenerDaño());
					}else {
						System.out.println("\033[41mNo posee suficiente oro para comprar una caja.\u001b[0m \n");
					}
				}else {
					juego=false;
					input.close();
				}
			}else { //debloqueo != 0 para cuando se desbloquea la opcion 4
				System.out.println("Elige una opcion a Realizar: ");
				System.out.println("1. Realizar Mision \n2. Obtener Caja \n3. Salir \n4. Realizar prueba para volverse Kage \n");
				int x = Verificar(4,1);
				Limpiar();
				if (x == 1) {
					jugador1.AsignarEnergia(jugador1.ObtenerEnergia()-5);
					System.out.println("Escoge un tipo de mision: ");
					System.out.println("1.Mision D \n2.Mision C \n3.Mision B \n4.Mision A \n5.Mision S ");
					int z=Verificar(5,1);
					fin = VerificarRangoNinja(jugador1,z);
					Limpiar();
					if (fin==1) {
						Combate(jugador1,1);
					}else if (fin==2){
						Combate(jugador1,2);
					}else if (fin==3){
						Combate(jugador1,3);
					}else if (fin==4){
						Combate(jugador1,4);
					}else if (fin==5){
						Combate(jugador1,5);
					}
					jugador1.AsignarVida(100+jugador1.ObtenerNivel());
				}else if (x==2) {
					if(jugador1.ObtenerOro() >= 300) {
						System.out.println("El costo de tu caja fue de 300 oros\n");
						Fortuna(jugador1);
						System.out.println("El objeto obtenido es \033[31m"+ jugador1.ObtenerObjeto()+"\u001b[0m y el daño extra que provoca es "+jugador1.ObtenerDaño());
					}else {
						System.out.println("\033[41mNo posee suficiente oro para comprar una caja.\u001b[0m \n");
					}
				}else if(x==3) {
					juego=false;
					Limpiar();
					input.close();
				}else {
					Combate(jugador1, 11);
				}
			}
		}
	}
}
