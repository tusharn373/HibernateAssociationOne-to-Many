import java.util.Set;

import javax.persistence.*;

//import com.Customer;
@Entity
@Table
public class Vendor {
	@Id
	int vid;
		@Column
	String vname;
		@Column
	String vaddr;
		@OneToMany(cascade=CascadeType.ALL)
		Set<Customer>cust;
	public Vendor()
	{}
	public Vendor(int vid, String vname, String vaddr, Set<Customer> cust) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vaddr = vaddr;
		this.cust = cust;
	}
	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", vname=" + vname + ", vaddr=" + vaddr + ", cust=" + cust + "]";
	}
}
