package ar.edu.ungs.prog2.smartgrids;

import java.util.List;
import java.util.Map;
import java.time.LocalDateTime;
import java.util.HashMap;


public class SmartGrids implements ISmartGrids {
	private Map<String, PlantaElectrica> plantas;

	public SmartGrids() {
    plantas = new HashMap<>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registrarPlantaSolar(String nombre, String direccion, double capacidadMaxima,
			String fechaHoraPuestaEnFuncionamiento, String fuentePrimaria, double eficienciaPromedio,
			double superficieCubierta, int cantidadPaneles, double horasRadiacionDiaria) {
		if (plantas.containsKey(nombre)) {
    		throw new RuntimeException("La planta ya existe");
		}
		 LocalDateTime fecha =
            LocalDateTime.parse(fechaHoraPuestaEnFuncionamiento);

   		PlantaSolar solar = new PlantaSolar(
            nombre,
            direccion,
            capacidadMaxima,
            fecha,
            fuentePrimaria,
            eficienciaPromedio,
            superficieCubierta,
            cantidadPaneles,
            horasRadiacionDiaria);

    	plantas.put(nombre, solar);	
		
	}

	@Override
	public void registrarPlantaEolica(String nombre, String direccion, double capacidadMaxima,
			String fechaHoraPuestaEnFuncionamiento, String fuentePrimaria, double eficienciaPromedio,
			int cantidadAerogeneradores, double alturaTorres, double velocidadMinimaViento) {
		if (plantas.containsKey(nombre)) {
        	throw new RuntimeException("La planta ya existe");
    	}
		
	    LocalDateTime fecha = LocalDateTime.parse(fechaHoraPuestaEnFuncionamiento);
		PlantaEolica eolica = new PlantaEolica(
            nombre,
            direccion,
            capacidadMaxima,
            fecha,
            fuentePrimaria,
            eficienciaPromedio,
            cantidadAerogeneradores,
            alturaTorres,
            velocidadMinimaViento);
		plantas.put(nombre, eolica);
	}

	@Override
	public void registrarPlantaHidraulica(String nombre, String direccion, double capacidadMaxima,
			String fechaHoraPuestaEnFuncionamiento, String fuentePrimaria, double eficienciaPromedio,
			int cantidadTurbinas, double capacidadEmbalse) {
		if (plantas.containsKey(nombre)) {
        	throw new RuntimeException("La planta ya existe");
    	}

    	LocalDateTime fecha =LocalDateTime.parse(fechaHoraPuestaEnFuncionamiento);
	
    	PlantaHidraulica hidraulica = new PlantaHidraulica(
            nombre,
            direccion,
            capacidadMaxima,
            fecha,
            fuentePrimaria,
            eficienciaPromedio,
            cantidadTurbinas,
            capacidadEmbalse);

   		plantas.put(nombre, hidraulica);
	}

	@Override
	public void registrarPlantaTermica(String nombre, String direccion, double capacidadMaxima,
			String fechaHoraPuestaEnFuncionamiento, String tipoCombustible, double objetivoEmisionesCo2PorHora,
			double capacidadAlmacenamientoCombustible) {
		if (plantas.containsKey(nombre)) {
        	throw new RuntimeException("La planta ya existe");
    	}

    	LocalDateTime fecha = LocalDateTime.parse(fechaHoraPuestaEnFuncionamiento);

   		PlantaTermica termica = new PlantaTermica(
            nombre,
            direccion,
            capacidadMaxima,
            fecha,
            tipoCombustible,
            objetivoEmisionesCo2PorHora,
            capacidadAlmacenamientoCombustible);

  		plantas.put(nombre, termica);
	}

	@Override
	public List<String> consultarPlantas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double capacidadMinimaCuota(String nombre) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void activarPlanta(String nombre, String fechaHora) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desactivarPlanta(String nombre, String fechaHora) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean estaActiva(String nombre) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void registrarMonitoreo(String nombre, String fechaHora, double energiaGenerada, int incidencias) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarMonitoreo(String nombre, String fechaHora, double energiaGenerada, int incidencias,
			double velocidadViento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarMonitoreo(String nombre, String fechaHora, double energiaGenerada, int incidencias,
			double co2Emitido, double combustibleUtilizado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double totalGenerado(String nombre) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] incidenciasPorHora(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] histogramaCumplimiento(String nombre, String fechaDesde, String fechaHasta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Integer> plantasRenovablesPorFuente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> plantasQueNuncaCumplieronCuota() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String horasSinVelocidadMinimaPorPlantaEolica() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int limpiarMonitoreosSinDatos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<String> plantasOrdenadasPorEnergiaGenerada() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> plantasInactivasEn(String fechaHora) {
		// TODO Auto-generated method stub
		return null;
	}

}
