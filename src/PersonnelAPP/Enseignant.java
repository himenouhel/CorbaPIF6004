package PersonnelAPP;

public final class Enseignant implements org.omg.CORBA.portable.IDLEntity
{
	/**
	 * PersonnelAPP/Enseignant.java .
	 * Generated by the IDL-to-Java compiler (portable), version "3.2"
	 * from PersonnelAPP.idl
	 * vendredi 2 juin 2017 16 h 03 EDT
	 */
	private static final long serialVersionUID = 1L;
	public PersonnelAPP.PersonInfo p = null;
	public long tel = (long)0;
	public long post = (long)0;

	public Enseignant ()
	{
	} // ctor

	public Enseignant (PersonnelAPP.PersonInfo _p, long _tel, long _post)
	{
		p = _p;
		tel = _tel;
		post = _post;
	} // ctor

} // class Enseignant
