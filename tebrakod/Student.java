public class Student {

	private String namn;
	private int f�delse�r, status, id;


	public Student(){}

	public String getNamn() {
		return namn;
	}
	public void setNamn(String nyNamn) {
		namn=nyNamn;
	}
	public int getId() {
		return id;
	}
	public void setId(int nyId) {
		id=nyId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int nyStatus) {
		status=nyStatus;
	}
	public int getF�delse�r() {
		return f�delse�r;
	}
	public void setF�delse�r(int nyF�delse�r) {
		f�delse�r=nyF�delse�r;
	}
	public String print() {
		return namn+"\t"+id+"\t"+f�delse�r;
	}
}
