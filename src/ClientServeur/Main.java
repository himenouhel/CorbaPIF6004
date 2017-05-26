package ClientServeur;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import org.omg.CORBA.ORB;

import PersonnelAPP.Enseignant;
import PersonnelAPP.Etudiant;
import PersonnelAPP.PersonInfo;
import PersonnelAPP.Personnel;
import PersonnelAPP.PersonnelHelper;

import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;

public class Main {
	private static Personnel personnelImpl;

	public static void main(String[] args) throws SQLException {
		
		EnseignantController ec = new EnseignantController();
		Enseignant e1 = new Enseignant(new PersonInfo("Jean yves","Beliveau","jyvesbeliveau@uqtr.ca","developpement web"), 81952815,2101);
	
		 try{
		        // create and initialize the ORB
			 Properties props = new Properties();
		        props.put("org.omg.CORBA.ORBInitialPort", "1000");
		        props.put("org.omg.CORBA.ORBInitialHost", "192.168.0.187");
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
		        personnelImpl.AfficherEtudiants();
		        //personnelImpl.shutdown();

		        } catch (Exception e) {
		          System.out.println("ERROR : " + e) ;
		          e.printStackTrace(System.out);
		          }
		    }
    
		//Test de l insertion enseignant ok 26mai
		//ec.insertion(e1);
		
		// Test de la suppression enseigant ok 26 mai
		//ec.delete(e1);
		/*
		// Test de la selection enseignant ok 26 mai
		ArrayList<Enseignant> ListEnseignant= ec.getEnseignant();
		 for ( Enseignant ens: ListEnseignant ) {
		 	System.out.println(ens.p.nom + ' ' + ens.p.prenom + ' ' + ens.p.domain + ' ' + ens.tel + ' ' + ens.post + ' ' + ens.p.mail);
		 }
		
		// Test de la selection d'enseigant par son nom: 26mai ok
		 //ec.selectEnseignant("boucif");
		

		//PersonnelServant perso=new PersonnelServant();
		//Etudiant e= new Etudiant(new PersonInfo("moudache","salim","m@s","info"),45);
		//perso.creerEtudiant(e); OK
		//perso.chercherEtudiant("moudache");

		
		//Tests Etudiant Conntroller
		//*/
		
		//*
		PersonnelServant perso=new PersonnelServant();
		
		//*	Tester l`ajout
			Etudiant e= new Etudiant(new PersonInfo("moudache","salim","m@s","info"),45);
			//perso.creerEtudiant(e); 
		//*/

		/* Chercher un etudiant
		perso.chercherEtudiant("moudache");
		//*/
		
		/* Afficher les etudiants
		perso.AfficherEtudiants();
		//*/
		
		/*Suppression d etudiant
		 perso.supprimerEtudiant(e);	 
		//*/

		
		/* Update Etudiant
			Etudiant newEtudiant= new Etudiant(new PersonInfo("moudache","salim","m@s","info"),50);
			perso.modifierEtudiant(e, newEtudiant);
		 
		//*/
		
		//*/
	}
