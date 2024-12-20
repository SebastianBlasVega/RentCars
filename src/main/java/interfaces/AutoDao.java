package interfaces;

import java.util.ArrayList;

import modelo.clases.Auto;

public interface AutoDao {
	public void registrarAuto(Auto auto);

	public void modificarAuto(int id, Auto auto);

	public void eliminarAuto(int id);

	public ArrayList<Auto> listarAutos();

	public Auto obtenerAuto(int id);
	
	public void cambiarEstado(int id, String estado);
	
	
	public ArrayList<Auto> buscarAutosConMasKilometraje();
}
