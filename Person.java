
public class Person {
		
		String name;
		String address;
		String phone;
		
		public Person(String name,String address,String phone)	{
			this.name=name;
			this.address=address;
			this.phone=phone;
		}
		
		public String getName()	{
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getAddress() {
			return address;
		}
		
		public void setAddress(String address) {
			this.address = address;
		}
	}

	class Customer extends Person {
		
		String CustomerNumber;
		
		boolean mail;
		
		public Customer(String name, String address, String phone,String number,boolean mail) {
			
			super(name, address, phone);
			this.CustomerNumber=number;
			this.mail=mail;
		}
		
		public String getCustomerNumber() {
			
			return CustomerNumber;
		}
		
		public void setCustomerNumber(String CustomerNumber) {
			
			this.CustomerNumber = CustomerNumber;
		}
		
		public boolean isMail() {
			
			return mail;
		}
		
		public void setMail(boolean mail) {
			
			this.mail = mail;
		}
		
		class PreferredCustomer extends Customer {
			double purchase;
			double discount;
			
			public PreferredCustomer(String name, String address, String telephoneNumber,String customerNumber, boolean mailingList, double purchase) {
				super(name, address, telephoneNumber, customerNumber, mailingList);
				this.purchase = purchase;
				if(purchase >= 2000)
					setDiscount(0.10);
				else if(purchase >= 1500)
					setDiscount(0.07);
				else if(purchase >= 1000)
					setDiscount(0.06);
				else
					setDiscount(0.05);
			}
			
			public void setPurchase(double purchase) {
				this.purchase = purchase;
			}
			
			private void setDiscount(double discount) {
				this.discount = discount;
			}
			
			public double getPurchase() {
				return purchase;
			}
			
			public double getDiscount() {
				return discount;
			}
			
			public String toString() {
				String preferredCustomer = super.toString() + "\nPurchase" + getPurchase() + "\nDiscount " + getDiscount();
				return preferredCustomer;
			}
			
		}
		public class PreferredCustomerDemo {
			public void main(String[] args) {
				PreferredCustomer preferredCustomer = new PreferredCustomer("John Doe", "1 Ripper street", "123-456-7890", "147-A049", true , 1750);
				System.out.println(preferredCustomer.toString());
			}
		}
	}
