package System;

public class Member extends SystemUser {
	
	private int totalBookCheckedOut;
	
	Search searchObj;
	BookIssueService issueService;
	
	public Member(String firstName, String lastName, String email, String phoneNumber, Account account) {
        super(firstName, lastName, email, phoneNumber, account);
        this.totalBookCheckedOut = 0;
        this.searchObj = new Search();
        this.issueService = new BookIssueService();
    }

	public int getTotalBookCheckedOut() {
		return totalBookCheckedOut;
	}

	public void setTotalBookCheckedOut(int totalBookCheckedOut) {
		this.totalBookCheckedOut = totalBookCheckedOut;
	}

	public Search getSearchObj() {
		return searchObj;
	}

	public void setSearchObj(Search searchObj) {
		this.searchObj = searchObj;
	}

	public BookIssueService getIssueService() {
		return issueService;
	}

	public void setIssueService(BookIssueService issueService) {
		this.issueService = issueService;
	}
	
	

}
