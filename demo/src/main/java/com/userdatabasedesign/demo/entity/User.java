package com.userdatabasedesign.demo.entity;

import lombok.*;
import jakarta.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name = "user")
@Data

public class User {
    // userId NOR NULL AUTO-INCREASE
    // userName VARCHAR(50) DEFAULT NULL
	// password VARCHAR(100) DEFAULT NULL
    // passwordHash VARCHAR(300) DEFAULT NULL
    // passwordSalt VARCHAR(100) DEFAULT NULL
    // emailAddress VARCHAR(50) DEFAULT NULL
    // emailValidationId Interger DEFAULT NULL
    // company VARCHAR(50) DEFAULT NULL
    // department VARCHAR(50) DEFAULT NULL
    // tokenGenrationTime TIMESTAMP DEFAULT NULL
    // registerDate TIMESTAMP DEFAULT NULL
    // lastLoginDate TIMESTAMP DEFAULT NULL
    // lastPasswordDate TIMESTAMP DEFAULT NULL
    // accountState boolean TINYINT DEFAULT 1
    // passwordRecovereryToken varchar(100) DEFAULT NULL
    // recovereryTokenTime TIMESTAMP DEFAULT NULL



    public User(long usedId, String userName, String password, String passwordHash, String passwordSalt, String emailAddress,
			int emailValidationId, String company, String department, Timestamp tokenGenerationDate,
			Timestamp registerDate, Timestamp lastLoginDate, Timestamp lastPasswordDate, boolean accountState,
			String passwordRecovereryToken, Timestamp recoveryTokenTime) {
		this.usedId = usedId;
		this.userName = userName;
		this.password = password;
		this.passwordHash = passwordHash;
		this.passwordSalt = passwordSalt;
		this.emailAddress = emailAddress;
		this.emailValidationId = emailValidationId;
		this.company = company;
		this.department = department;
		this.tokenGenerationDate = tokenGenerationDate;
		this.registerDate = registerDate;
		this.lastLoginDate = lastLoginDate;
		this.lastPasswordDate = lastPasswordDate;
		this.accountState = accountState;
		this.passwordRecovereryToken = passwordRecovereryToken;
		this.recoveryTokenTime = recoveryTokenTime;
	}

	@Id
    @Column(name = "userId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long usedId;

	public long getUsedId() {
		return this.usedId;
	}

	public void setUsedId(long usedId) {
		this.usedId = usedId;
	}

    @Column(name = "userName", length = 50)
    private String userName;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
   
    @Column(name = "password", length = 100)
	private String password;

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    @Column(name = "passwordHash", length = 300)
    private String passwordHash;

	public String getPasswordHash() {
		return this.passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

    @Column(name = "passwordSalt", length = 100)
    private String passwordSalt;

	public String getPasswordSalt() {
		return this.passwordSalt;
	}

	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}


    @Column(name = "emailAddress", length = 50)
    private String emailAddress;

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

    @Column(name = "emailValidationId")
    private int emailValidationId;

	public int getEmailValidationId() {
		return this.emailValidationId;
	}

	public void setEmailValidationId(int emailValidationId) {
		this.emailValidationId = emailValidationId;
	}


    @Column(name = "company", length = 50)
    private String company;    

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

    @Column(name = "department", length = 50)
    private String department;

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@Column(name = "tokenGenerationDate")
	private Timestamp tokenGenerationDate;

	public Timestamp getTokenGenerationDate() {
		return this.tokenGenerationDate;
	}

	public void setTokenGenerationDate(Timestamp tokenGenerationDate) {
		this.tokenGenerationDate = tokenGenerationDate;
	}

    @Column(name = "registerDate")
    private Timestamp registerDate;

	public Timestamp getRegisterDate() {
		return this.registerDate;
	}



	public void setRegisterDate(Timestamp registerDate) {
		this.registerDate = registerDate;
	}

	@Column(name = "lastLoginDate")
	private Timestamp lastLoginDate;

	public Timestamp getLastLoginDate() {
		return this.lastLoginDate;
	}

	public void setLastLoginDate(Timestamp lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	@Column(name = "lastPasswordDate")
	private Timestamp lastPasswordDate;

	public Timestamp getLastPasswordDate() {
		return this.lastPasswordDate;
	}

	public void setLastPasswordDate(Timestamp lastPasswordDate) {
		this.lastPasswordDate = lastPasswordDate;
	}

	@Column(name = "accountState", columnDefinition = "TINYINT default 1")
	private boolean accountState;

	public boolean isAccountState() {
		return this.accountState;
	}

	public void setAccountState(boolean accountState) {
		this.accountState = accountState;
	}

	@Column(name = "passwordRecovereryToken", length = 100)
	private String passwordRecovereryToken;

	public String getPasswordRecovereryToken() {
		return this.passwordRecovereryToken;
	}

	public void setPasswordRecovereryToken(String passwordRecovereryToken) {
		this.passwordRecovereryToken = passwordRecovereryToken;
	}


	@Column(name = "recoveryTokenTime")
	private Timestamp recoveryTokenTime;

	public Timestamp getRecoveryTokenTime() {
		return this.recoveryTokenTime;
	}

	public void setRecoveryTokenTime(Timestamp recoveryTokenTime) {
		this.recoveryTokenTime = recoveryTokenTime;
	}

	@Override
	public String toString() {
		return "User [usedId=" + usedId + ", userName=" + userName + ", password=" + password + ", passwordHash=" + passwordHash
				+ ", passwordSalt=" + passwordSalt + ", emailAddress=" + emailAddress + ", emailValidationId="
				+ emailValidationId + ", company=" + company + ", department=" + department + ", tokenGenerationDate="
				+ tokenGenerationDate + ", registerDate=" + registerDate + ", lastLoginDate=" + lastLoginDate
				+ ", lastPasswordDate=" + lastPasswordDate + ", accountState=" + accountState
				+ ", passwordRecovereryToken=" + passwordRecovereryToken + ", recoveryTokenTime=" + recoveryTokenTime
				+ "]";
	}

}
