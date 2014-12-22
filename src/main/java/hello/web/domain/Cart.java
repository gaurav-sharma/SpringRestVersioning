package hello.web.domain;

import java.util.List;

public class Cart {

	private AccountType accountType;
	private String coverageZip;
	private boolean isCovered;

	private List<Device> deviceList;
	private Address billingAddress;
	private Address shippingAddress;

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public String getCoverageZip() {
		return coverageZip;
	}

	public void setCoverageZip(String coverageZip) {
		this.coverageZip = coverageZip;
	}

	public boolean isCovered() {
		return isCovered;
	}

	public void setCovered(boolean isCovered) {
		this.isCovered = isCovered;
	}

	public List<Device> getDeviceList() {
		return deviceList;
	}

	public void setDeviceList(List<Device> deviceList) {
		this.deviceList = deviceList;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

}
