package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the address database table.
 * 
 */
@Entity
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ADDRESS_ADDRID_GENERATOR", sequenceName="KEYSEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ADDRESS_ADDRID_GENERATOR")
	@Column(name="ADDR_ID")
	private String addrId;

	@Column(name="ADDR_CITY")
	private String addrCity;

	@Column(name="ADDR_COUNTRY")
	private String addrCountry;

	@Column(name="ADDR_LINE1")
	private String addrLine1;

	@Column(name="ADDR_LINE2")
	private String addrLine2;

	@Column(name="ADDR_LINE3")
	private String addrLine3;

	@Column(name="ADDR_LOCALITY")
	private String addrLocality;

	@Column(name="ADDR_PIN_CODE")
	private int addrPinCode;

	@Column(name="ADDR_STATE")
	private String addrState;

	@Column(name="ADDR_TYPE")
	private String addrType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATED")
	private Date lastUpdated;

	@Column(name="LAST_UPDATED_BY")
	private String lastUpdatedBy;

	@Column(name="USER_ID")
	private BigInteger userId;

	public Address() {
	}

	public String getAddrId() {
		return this.addrId;
	}

	public void setAddrId(String addrId) {
		this.addrId = addrId;
	}

	public String getAddrCity() {
		return this.addrCity;
	}

	public void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}

	public String getAddrCountry() {
		return this.addrCountry;
	}

	public void setAddrCountry(String addrCountry) {
		this.addrCountry = addrCountry;
	}

	public String getAddrLine1() {
		return this.addrLine1;
	}

	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	public String getAddrLine2() {
		return this.addrLine2;
	}

	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	public String getAddrLine3() {
		return this.addrLine3;
	}

	public void setAddrLine3(String addrLine3) {
		this.addrLine3 = addrLine3;
	}

	public String getAddrLocality() {
		return this.addrLocality;
	}

	public void setAddrLocality(String addrLocality) {
		this.addrLocality = addrLocality;
	}

	public int getAddrPinCode() {
		return this.addrPinCode;
	}

	public void setAddrPinCode(int addrPinCode) {
		this.addrPinCode = addrPinCode;
	}

	public String getAddrState() {
		return this.addrState;
	}

	public void setAddrState(String addrState) {
		this.addrState = addrState;
	}

	public String getAddrType() {
		return this.addrType;
	}

	public void setAddrType(String addrType) {
		this.addrType = addrType;
	}

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public BigInteger getUserId() {
		return this.userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

}