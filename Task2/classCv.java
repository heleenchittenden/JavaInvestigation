public final class classCv {

	int iNumQual; //Number of qualifications
	int iNumWorkHis; //Number of work history entries
	
	public setNumQual(int iNq) {
		iNumQual = iNq;
	}
	
	public setNumWorkHis(int iWh) {
		iNumWorkHis = iWh;
	}
	
	//Class (structure) defining work history
	public final class classWorkHistory {
		public String sCompany;
		public String sPosition;
		public String sStartDate;
		public String sEndDate;
		
		//classWorkHistory value assignment
		public classWorkHistory(String sCompany, String sPosition, String sStartDate, String sEndDate) {
			this.sCompany = sCompany;
			this.sPosition = sPosition;
			this.sStartDate = sStartDate;
			this.sEndDate = sEndDate;			
		}
	}
	
	public String sName;
	public String sEmail;
	public String sCellphone;
	
	private String[iNq] sQualifications;
	classWorkHistory[iWh] cWorkHistory;
	
	public static void main(String[] args) {
		
		int iNumQual; //Number of qualifications
		int iNumWorkHis; //Number of work history entries
		
		classCv myCv = new classCv;
		myCv.setNumQual(iNumQual);
		myCv.setNumWorkHis(iNumWorkHis);
	}
}