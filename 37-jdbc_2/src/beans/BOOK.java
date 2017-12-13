package beans;
public class BOOK
{
	private java.math.BigDecimal id;
	private oracle.sql.CLOB content;
	public void setId(java.math.BigDecimal id)
	{
		this.id = id;
	}
	public java.math.BigDecimal getId()
	{
		return this.id;
	}
	public void setContent(oracle.sql.CLOB content)
	{
		this.content = content;
	}
	public oracle.sql.CLOB getContent()
	{
		return this.content;
	}
}