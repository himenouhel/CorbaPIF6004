package PersonnelAPP;


/**
* PersonnelAPP/Etudiant.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PersonnelAPP.idl
* vendredi 2 juin 2017 16 h 03 EDT
*/

public final class Etudiant implements org.omg.CORBA.portable.IDLEntity
{
  public PersonnelAPP.PersonInfo p = null;
  public String matricul = null;

  public Etudiant ()
  {
  } // ctor

  public Etudiant (PersonnelAPP.PersonInfo _p, String _matricul)
  {
    p = _p;
    matricul = _matricul;
  } // ctor

} // class Etudiant
