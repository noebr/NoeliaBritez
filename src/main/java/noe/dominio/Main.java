package noe.dominio;

import java.util.ArrayList;
import java.util.List;

import noe.hibernate.MunicipalidadDao;
import noe.hibernate.PlazaDao;

public class Main {

	public static void main(String[] args) {

		PlazaDao plazaDao = new PlazaDao();
		
		Plaza plazaPineral=new Plaza("Pineral", "Puan 5397", 14);
		Plaza plazaPeron=new Plaza("Peron", "Pazelli 6566", 30);
		Plaza plazaAlmagro=new Plaza("Almagro", "Almagro444", 20);
		
		List<Plaza> plazas = new ArrayList<Plaza>();
		plazas.add(plazaPineral);
		plazas.add(plazaPeron);
		plazas.add(plazaAlmagro);
		
		
		Municipalidad muniCaseros = new Municipalidad(plazas);
		muniCaseros.setNombre("MunicipalidadCaseros");
		
		//--------------------------------------------------------------------------DAO
		
		plazaDao.savePlaza(plazaPineral);
		plazaDao.savePlaza(plazaPeron);
		plazaDao.savePlaza(plazaAlmagro);
		
		MunicipalidadDao municipalidadDao = new MunicipalidadDao();
		municipalidadDao.saveMunicipalidad(muniCaseros);
		
		
		plazaDao.getPlazas();
		
		plazaDao.getPlazas();
		
	}

}
