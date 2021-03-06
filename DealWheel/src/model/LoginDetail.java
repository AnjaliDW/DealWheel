package model;

import java.io.Serializable;
import static services.utility.GenericConstant.*;
import javax.persistence.*;

import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the login_detail database table.
 * 
 */
@Entity
@Table(name="login_detail")
@NamedQueries({
	@NamedQuery(name=LOGIN_DETAIL_FIND_ALL, query="SELECT l FROM LoginDetail l"),
	@NamedQuery(name=LOGIN_DETAIL_FIND_USING_USER_NAME, query="SELECT l FROM LoginDetail l where l.lognUserName = :loginUserName"),
	@NamedQuery(name=LOGIN_DETAIL_UPDATE_LAST_LOGIN, query="update LoginDetail l set l.lognLastLoginDetail = :lastLoginDetail where l.lognUserName = :loginUserName")
})

public class LoginDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LOGIN_DETAIL_LOGNID_GENERATOR", sequenceName="KEYSEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LOGIN_DETAIL_LOGNID_GENERATOR")
	@Column(name="LOGN_ID")
	private String lognId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATED")
	private Date lastUpdated;

	@Column(name="LAST_UPDATED_BY")
	private String lastUpdatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LOGN_LAST_LOGIN_DETAIL")
	private Date lognLastLoginDetail;

	@Column(name="LOGN_PASSWORD")
	private String lognPassword;

	@Column(name="LOGN_USER_ID")
	private BigInteger lognUserId;

	@Column(name="LOGN_USER_NAME")
	private String lognUserName;

	public LoginDetail() {
	}

	public String getLognId() {
		return this.lognId;
	}

	public void setLognId(String lognId) {
		this.lognId = lognId;
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

	public Date getLognLastLoginDetail() {
		return this.lognLastLoginDetail;
	}

	public void setLognLastLoginDetail(Date lognLastLoginDetail) {
		this.lognLastLoginDetail = lognLastLoginDetail;
	}

	public String getLognPassword() {
		return this.lognPassword;
	}

	public void setLognPassword(String lognPassword) {
		this.lognPassword = lognPassword;
	}

	public BigInteger getLognUserId() {
		return this.lognUserId;
	}

	public void setLognUserId(BigInteger lognUserId) {
		this.lognUserId = lognUserId;
	}

	public String getLognUserName() {
		return this.lognUserName;
	}

	public void setLognUserName(String lognUserName) {
		this.lognUserName = lognUserName;
	}

}