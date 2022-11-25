package org.bank;

public class BankInfo  extends AxisBank {
	public void saving() {
		System.out.println("10000");
	}
	public void fixed() {
		System.out.println("20000");
	}
	public static void main(String[] args) {
		BankInfo bankdetails= new BankInfo();
		bankdetails.saving();
		bankdetails.fixed();
		bankdetails.deposit();
	}

}
