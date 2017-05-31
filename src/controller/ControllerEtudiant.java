package controller;

import java.sql.SQLException;
import java.util.Properties;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import swing.FormEventEtudiant;
import PersonnelAPP.Etudiant;
import PersonnelAPP.PersonInfo;
import PersonnelAPP.Personnel;
import PersonnelAPP.PersonnelHelper;

public class ControllerEtudiant {
	private static Personnel  personnelImpl ;

	public ControllerEtudiant(){
		try{
			// create and initialize the ORB
			Properties props = new Properties();
			props.put("org.omg.CORBA.ORBInitialPort", "1000");
			props.put("org.omg.CORBA.ORBInitialHost", "192.168.0.187");
			String[] args = null;
			ORB orb = ORB.init(args, props);
			// get the root naming context
			org.omg.CORBA.Object objRef = 
					orb.resolve_initial_references("NameService");
			// Use NamingContextExt instead of NamingContext. This is 
			// part of the Interoperable naming Service.  
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			// resolve the Object Reference in Naming
			String name = "Personnel";
			personnelImpl = PersonnelHelper.narrow(ncRef.resolve_str(name));

			System.out.println("Obtained a handle on server object: " + personnelImpl);
			//personnelImpl.shutdown();

		} catch (Exception e) {
			System.out.println("ERROR : " + e) ;
			e.printStackTrace(System.out);
		}
	}

	public Etudiant[] getEtudiants(){
		return personnelImpl.AfficherEtudiants();

	}
	
	public void addEtudiant(FormEventEtudiant ev) throws SQLException {
		String nom = ev.getNom();
		String prenom = ev.getPrenom();
		String courriel = ev.getCourriel();
		String domaine = ev.getDomaine();
		String matricule = ev.getMatricule();

		Etudiant etudiant = new Etudiant(new PersonInfo(nom,prenom,courriel,domaine),matricule) ;
		personnelImpl.creerEtudiant(etudiant);
	}
}