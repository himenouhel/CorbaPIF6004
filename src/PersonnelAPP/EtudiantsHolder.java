package PersonnelAPP;


/**
* PersonnelAPP/EtudiantsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PersonnelAPP.idl
* mercredi 31 mai 2017 13 h 55 EDT
*/

public final class EtudiantsHolder implements org.omg.CORBA.portable.Streamable
{
  public PersonnelAPP.Etudiant value[] = null;

  public EtudiantsHolder ()
  {
  }

  public EtudiantsHolder (PersonnelAPP.Etudiant[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PersonnelAPP.EtudiantsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PersonnelAPP.EtudiantsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PersonnelAPP.EtudiantsHelper.type ();
  }

}
