package com.entity;
public class User implements Cloneable{
	int		id;
	String	userName,
			PASSWORD,
			realname,
			sex,
			address,
			question,
			answer,
			email,
			favorite,
			regDate;
	int 	score;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFavorite() {
		return favorite;
	}

	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}


	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
		

	public User(String userName, String pASSWORD, String realname, String sex, String address, String question,
			String answer, String email, String favorite, String regDate, int score) {
		super();
		this.userName = userName;
		PASSWORD = pASSWORD;
		this.realname = realname;
		this.sex = sex;
		this.address = address;
		this.question = question;
		this.answer = answer;
		this.email = email;
		this.favorite = favorite;
		this.regDate = regDate;
		this.score = score;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", PASSWORD=" + PASSWORD + ", realname=" + realname
				+ ", sex=" + sex + ", address=" + address + ", question=" + question + ", answer=" + answer + ", email="
				+ email + ", favorite=" + favorite + ", score=" + score + ", regDate=" + regDate + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		User user=(User)super.clone();
		user.setId(id);
		user.setUserName(userName);
		user.setPASSWORD(PASSWORD);
		user.setAddress(address);
		user.setRealname(realname);
		user.setSex(sex);
		user.setQuestion(question);
		user.setAnswer(answer);
		user.setEmail(email);
		user.setFavorite(favorite);
		user.setRegDate(regDate);
		user.setScore(score);
		return user;
	}
	

}
