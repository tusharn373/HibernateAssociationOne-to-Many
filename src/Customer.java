import javax.persistence.*;

@Entity
@Table
public class Customer {
	@Id
	int cid;
		@Column
	String cname;
		@Column
	String caddr;
		public Customer()
		{}
		public Customer(int cid, String cname, String caddr) {
			super();
			this.cid = cid;
			this.cname = cname;
			this.caddr = caddr;
		}
		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", cname=" + cname + ", caddr=" + caddr + "]";
		}
}
