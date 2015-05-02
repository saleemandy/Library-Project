package myLibraryProject;

public class Magazine extends Publication {
private int issueNo;


public Magazine(int issueNo, String title) {
	super(title);
	this.issueNo = issueNo;
}

public int getIssueNo() {
	return issueNo;
}

public void setIssueNo(int issueNo) {
	this.issueNo = issueNo;
}

}
