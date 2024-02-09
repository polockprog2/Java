package classes;
import java.lang.*;

public class Doctor
{
	private String name;
	private String gender;
	private String docId;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public void setDocId(String docid)
	{
		this.docId = docId;
	}
	public String getName()
	{
		return name;
	}
	public String getGender()
	{
		return gender;
	}
	public String getDocId()
	{
		return docId;
	}

}