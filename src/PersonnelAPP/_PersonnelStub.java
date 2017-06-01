package PersonnelAPP;


/**
* PersonnelAPP/_PersonnelStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PersonnelAPP.idl
* jeudi 1 juin 2017 15 h 28 EDT
*/


//Service de l'App
public class _PersonnelStub extends org.omg.CORBA.portable.ObjectImpl implements PersonnelAPP.Personnel
{

  public boolean creerEnseignant (PersonnelAPP.Enseignant e)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("creerEnseignant", true);
                PersonnelAPP.EnseignantHelper.write ($out, e);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return creerEnseignant (e        );
            } finally {
                _releaseReply ($in);
            }
  } // creerEnseignant

  public boolean creerEtudiant (PersonnelAPP.Etudiant e)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("creerEtudiant", true);
                PersonnelAPP.EtudiantHelper.write ($out, e);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return creerEtudiant (e        );
            } finally {
                _releaseReply ($in);
            }
  } // creerEtudiant

  public PersonnelAPP.Enseignant chercherEnseignant (String nom, String prenom)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("chercherEnseignant", true);
                $out.write_string (nom);
                $out.write_string (prenom);
                $in = _invoke ($out);
                PersonnelAPP.Enseignant $result = PersonnelAPP.EnseignantHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return chercherEnseignant (nom, prenom        );
            } finally {
                _releaseReply ($in);
            }
  } // chercherEnseignant

  public PersonnelAPP.Etudiant chercherEtudiant (String nom, String prenom)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("chercherEtudiant", true);
                $out.write_string (nom);
                $out.write_string (prenom);
                $in = _invoke ($out);
                PersonnelAPP.Etudiant $result = PersonnelAPP.EtudiantHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return chercherEtudiant (nom, prenom        );
            } finally {
                _releaseReply ($in);
            }
  } // chercherEtudiant

  public PersonnelAPP.Enseignant[] AfficherEnseigants ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("AfficherEnseigants", true);
                $in = _invoke ($out);
                PersonnelAPP.Enseignant $result[] = PersonnelAPP.EnseignantsHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return AfficherEnseigants (        );
            } finally {
                _releaseReply ($in);
            }
  } // AfficherEnseigants

  public PersonnelAPP.Etudiant[] AfficherEtudiants ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("AfficherEtudiants", true);
                $in = _invoke ($out);
                PersonnelAPP.Etudiant $result[] = PersonnelAPP.EtudiantsHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return AfficherEtudiants (        );
            } finally {
                _releaseReply ($in);
            }
  } // AfficherEtudiants

  public void supprimerEtudiant (PersonnelAPP.Etudiant e)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("supprimerEtudiant", true);
                PersonnelAPP.EtudiantHelper.write ($out, e);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                supprimerEtudiant (e        );
            } finally {
                _releaseReply ($in);
            }
  } // supprimerEtudiant

  public void supprimerEnseigant (PersonnelAPP.Enseignant e)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("supprimerEnseigant", true);
                PersonnelAPP.EnseignantHelper.write ($out, e);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                supprimerEnseigant (e        );
            } finally {
                _releaseReply ($in);
            }
  } // supprimerEnseigant

  public void modifierEnseignant (PersonnelAPP.Enseignant e, PersonnelAPP.Enseignant newEnseigant)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("modifierEnseignant", true);
                PersonnelAPP.EnseignantHelper.write ($out, e);
                PersonnelAPP.EnseignantHelper.write ($out, newEnseigant);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                modifierEnseignant (e, newEnseigant        );
            } finally {
                _releaseReply ($in);
            }
  } // modifierEnseignant

  public void modifierEtudiant (PersonnelAPP.Etudiant e, PersonnelAPP.Etudiant newEtudiant)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("modifierEtudiant", true);
                PersonnelAPP.EtudiantHelper.write ($out, e);
                PersonnelAPP.EtudiantHelper.write ($out, newEtudiant);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                modifierEtudiant (e, newEtudiant        );
            } finally {
                _releaseReply ($in);
            }
  } // modifierEtudiant

  public void shutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shutdown

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:PersonnelAPP/Personnel:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _PersonnelStub
