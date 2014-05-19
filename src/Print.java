import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Print {

	private int count = 0;

	//TODO need to correct the Print Path
	private String printPath = "";
	private URL url;
	private String $patFirst = "First ";
	private String $patLast = "Last";
	private String $patDOB = "blank";
	private String $patAge = "blank";
	private String $patVET = "blank";
	private String $patStreet = "blank";
	private String $patCity = "blank";
	private String $ST = "blank";
	private String $ZIP = "blank";
	private String $patCounty = "blank";
	private String $cntyYrs = "blank";
	private String $patPhNum = "blank";
	private String $pat2ndPhNum = "blank";
	private String $patSSN = "blank";
	private String $DLNo = "blank";
	private String $DLst = "blank";
	private String $Marital = "blank";
	private String $patPart = "blank";
	private String $emerName = "blank";
	private String $emerRelate = "blank";
	private String $emerPrimNum = "blank";
	private String $emerAddy = "blank";
	private String $emerCity = "blank";
	private String $eST = "blank";
	private String $emerZIP = "blank";
	private String $emerSecNum = "blank";
	private String $agenName = "blank";
	private String $agenConPers = "blank";
	private String $agenCounty = "blank";
	private String $agenConPh = "blank";
	private String $agenAddy = "blank";
	private String $agenCity = "blank";
	private String $agenZIP = "blank";
	private String $aST = "blank";
	private String $agenCell = "blank";
	private String $legPris = "blank";
	private String $legProb = "blank";
	private String $legWhyProb = "blank";
	private String $legName = "blank";
	private String $legAddy = "blank";
	private String $legPh = "blank";
	private String $heaPhys = "blank";
	private String $heaPhysWhy = "blank";
	private String $heamean = "blank";
	private String $heaMeanWhy = "blank";
	private String $sub1 = "blank";
	private String $sub1Last = "blank";
	private String $sub1Freq = "blank";
	private String $sub1Amount = "blank";
	private String $sub1Meth = "blank";
	private String $sub2 = "blank";
	private String $sub2Last = "blank";
	private String $sub2Freq = "blank";
	private String $sub2Amount = "blank";
	private String $sub2Meth = "blank";
	private String $sub3 = "blank";
	private String $sub3Last = "blank";
	private String $sub3Freq = "blank";
	private String $sub3Amount = "blank";
	private String $sub3Meth = "blank";
	private String $iv12 = "blank";
	private String $prior = "blank";
	private String $hmany = "blank";
	private String $whereWhen = "blank";
	private String $clientLog = "blank";
	
	
	private String $q1 = "blank";
	private String $a2 = "blank";
	private String $q3 = "blank";
	private String $q4 = "blank";
	private String $physLim = "blank";
	private String $diag1 = "blank";
	private String $diag2 = "blank";
	private String $diag3 = "blank";
	private String $med1 = "blank";
	private String $med2 = "blank";
	private String $med3 = "blank";
	private String $dos1 = "blank";
	private String $dos2 = "blank";
	private String $dos3 = "blank";
	private String $sex = "blank";
	private String $arson = "blank";
	
	private String $patCounselor = "blank";
	
	//groupnotes
	private String $mondayStart = "blank";
	private String $mondayEnd = "blank";
	private String $mondayTopic = "blank";
	private String $mondayNotes = "blank";
	private String $mondayAMTopic = "blank";
	private String $mondayAMNotes = "blank";
	private String $mondayPMTopic = "blank";
	private String $mondayPMNotes = "blank";
	private String $tuesdayStart = "blank";
	private String $tuesdayEnd = "blank";
	private String $tuesdayTopic = "blank";
	private String $tuesdayNotes = "blank";
	private String $tuesdayAMTopic = "blank";
	private String $tuesdayAMNotes = "blank";
	private String $tuesdayPMTopic = "blank";
	private String $tuesdayPMNotes = "blank";
	private String $wednesdayStart = "blank";
	private String $wednesdayEnd = "blank";
	private String $wednesdayTopic = "blank";
	private String $wednesdayNotes = "blank";
	private String $wednesdayAMTopic = "blank";
	
	
	private String $wednesdayAMNotes = "blank";
	private String $wednesdayPMTopic = "blank";
	private String $wednesdayPMNotes = "blank";
	private String $thursdayStart = "blank";
	private String $thursdayEnd = "blank";
	private String $thursdayTopic = "blank";
	private String $thursdayNotes = "blank";
	private String $thursdayAMTopic = "blank";
	private String $thursdayAMNotes = "blank";
	private String $thursdayPMTopic = "blank";
	private String $thursdayPMNotes = "blank";
	private String $fridayStart = "blank";
	private String $fridayEnd = "blank";
	private String $fridayTopic = "blank";
	private String $fridayNotes = "blank";
	private String $fridayAMTopic = "blank";
	private String $fridayAMNotes = "blank";
	private String $fridayPMTopic = "blank";
	private String $fridayPMNotes = "blank";
	
	private String $saturdayStart = "blank";
	private String $saturdayEnd = "blank";
	private String $saturdayTopic = "blank";
	private String $saturdayNotes = "blank";
	private String $saturdayAMTopic = "blank";
	private String $saturdayAMNotes = "blank";
	private String $sundayStart = "blank";
	private String $sundayEnd = "blank";
	private String $sundayTopic = "blank";
	private String $sundayNotes = "blank";
	
	private String $weekStart = "blank";
	private String $weekEnd = "blank";
	private String $dateOf = "blank";
	private String $timeS = "blank";
	private String $timeEnd = "blank";
	private String $indivNote = "blank";
	
	private String $DSM = "blank";
	private String $payMeth;
	private String $priChar;
	private String $authDateStart;
	private String $authDateEnd;
	private String $adDate;
	private String $owed;
	private String $exitDate;
	private String $patEndCounselor;
	private String $treatPlanGoal1;
	private String $treatPlanGoal2;
	private String $treatPlanGoal3;
	private String $treatPlanGoal4;
	private String $treatPlanGoal5;
	private String $treatPlanGoal6;
	
	private String $treatPlanGoalMet1;
	private String $treatPlanGoalMet2;
	private String $treatPlanGoalMet3;
	private String $treatPlanGoalMet4;
	private String $treatPlanGoalMet5;
	private String $treatPlanGoalMet6;
	
	private String $treatSum;
	private String $curDrugUse;
	private String $curCrim;
	
	private String $addAxis1;
	private String $addAxis2;
	private String $addAxis3;
	private String $addAxis4;
	private String $addAxis5;
	private String $addGAFScore;
	private String $disAxis1;
	private String $disAxis2;
	private String $disAxis3;
	private String $disAxis4;
	private String $disAxis5;
		
	private String $counRec1;
	private String $counRec2;
	private String $counRec3;
	private String $counRec4;
	
	private String $shouldReturn;
	private String $clientComment;

	private String macHidden;
	
	private String tableName = "";
	private String ID = "";
	
	
	public Print(String table, String ID) 
	{
		getInfo(table, ID);
		try {
			update();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//these actually export the files
		screen1();
		screen2();
		admissionAgreement();
		admissionAgreement2();
		financial();
		rights();
		rules1();
		rules2();
		groupRules();
		hygiene();
		fire();
		//panel2
		ua();
		hq2();
		hq3();
		hq4();
		hq5();
		//panel3
		bookkeeping();
		cfr();
		followUp();
		auth();
		consent1();
		consent2();
		crim();
		//panel4
		viol();
		//panel5
		indiv();
		tx();
		dsmiv();
		pheval();
		pheval2();
		//panel6
		exitBook();
		disCrit();
		exitBook();
		disSum1();
		disSum2();
		safeKeep();
		linen();

	}
	
	//this gets the info from the table
	public boolean getInfo(String table, String ID)
	{
		Boolean Success = false;
		SQLRetrieveInfo get = new SQLRetrieveInfo();
		
		Object[] data = get.getPaperworkInfo(table, ID);
		int step = 0;
		$clientLog =ID;
		$patLast=(String)data[step];step++;
		$patFirst =(String)data[step] + " ";step++;
		step++; //Middle
		step++; //Gender
		$patPhNum =(String)data[step];step++;
		$pat2ndPhNum =(String)data[step];step++;
		$patDOB =(String)data[step];step++;
		$patSSN =(String)data[step];step++;
		$patAge = ""; //TODO
		$patStreet =(String)data[step];step++;
		$patCity =(String)data[step];step++;
		$ST =(String)data[step];step++;
		$ZIP =(String)data[step];step++;
		$patCounty =(String)data[step];step++;
		$cntyYrs =(String)data[step];step++;
		if((int)data[step] == 1)
			$patVET ="Y";
		else
			$patVET = "N";
		
		step++;
		$DLNo =(String)data[step];step++;
		$DLst =(String)data[step];step++;
		$Marital =(String)data[step];step++;
		$patPart =(String)data[step];step++;
		step++;//Intake Date this is filled out when signed
		
		//emergency fields
		$emerName =(String)data[step];step++;
		$emerRelate =(String)data[step];step++;
		$emerPrimNum =(String)data[step];step++;
		$emerSecNum =(String)data[step];step++;
		$emerAddy =(String)data[step];step++;
		$emerCity =(String)data[step];step++;
		$eST =(String)data[step];step++;
		$emerZIP =(String)data[step];step++;
		
		//agency fields
		$agenName =(String)data[step];step++;
		$agenConPers =(String)data[step];step++;
		$agenCounty =(String)data[step];step++;
		$agenConPh =(String)data[step];step++;
		$agenCell =(String)data[step];step++;
		$agenAddy =(String)data[step];step++;
		$agenCity =(String)data[step];step++;
		$agenZIP =(String)data[step];step++;
		$aST =(String)data[step];step++;
		
		//legal fields
		if((int)data[step] == 1)
		$legPris = "Y";
		else
			$legPris = "N";
		step++;
		$legProb = "" ;
		$legWhyProb =(String)data[step];step++;
		$legName =(String)data[step];step++;
		$legAddy =(String)data[step];step++;
		$legPh =(String)data[step];step++;
		
		//Health Fields
		if((int)data[step] == 1)
			$heaPhys = "Y";
			else
				$heaPhys = "N";
			step++;
		$heaPhysWhy =(String)data[step];step++;
		if((int)data[step] == 1)
			$heamean = "Y";
			else
				$heamean = "N";
			step++;
		$heaMeanWhy =(String)data[step];step++;
		if((int)data[step] == 1)
			$iv12 = "Y";
			else
				$iv12 = "N";
			step++;
		if((int)data[step] == 1)
			$prior = "Y";
			else
				$prior = "N";
			step++;
		$hmany =(String)data[step];step++;
		$whereWhen =(String)data[step];step++;
		
		//substance fields
		$sub1 =(String)data[step];step++;
		$sub1Last =(String)data[step];step++;
		$sub1Amount =(String)data[step];step++;
		$sub1Freq =(String)data[step];step++;
		$sub1Meth =(String)data[step];step++;
		$sub2 =(String)data[step];step++;
		$sub2Last =(String)data[step];step++;
		$sub2Amount =(String)data[step];step++;
		$sub2Freq =(String)data[step];step++;
		$sub2Meth =(String)data[step];step++;	
		$sub3 =(String)data[step];step++;
		$sub3Last =(String)data[step];step++;
		$sub3Amount =(String)data[step];step++;
		$sub3Freq =(String)data[step];step++;
		$sub3Meth =(String)data[step];step++;
		
		//ASAM Fields
		$diag1 =(String)data[step];step++;
		$diag2 =(String)data[step];step++;
		$diag3 =(String)data[step];step++;
		$med1 =(String)data[step];step++;
		$med2 =(String)data[step];step++;
		$med3 =(String)data[step];step++;
		$dos1 =(String)data[step];step++;
		$dos2 =(String)data[step];step++;
		$dos3 =(String)data[step];step++;

		//END OF RETRIEVE FROM THOSE FIELDS
		
		
		//TODO
		//GROUP NOTES
		//INDIVIDUAL NOTES
		
		
		

		
		
		
		
		
		
		
		
		return Success;
	}
	
	
	//This method pulls the correct path for the 
	public boolean update() throws IOException, URISyntaxException
	{
		
		
		String fileName ="";
		
		
		//here we get the filesystem type based on the OS that the software is running on
		 java.nio.file.FileSystem fs = FileSystems.getDefault();
		 
		 if (fs.toString().contains("MacOSXFileSystem"))
		 {
			 printPath = System.getProperty ("user.home") + fs.getSeparator() + "Desktop" + fs.getSeparator() + $patFirst + $patLast;
		 }
		else
		{
			printPath = System.getProperty ("user.home") + fs.getSeparator() + "Desktop" + fs.getSeparator() + $patFirst + $patLast;
		}
		File theDir = new File(printPath);
		if (!theDir.exists()) {
		    System.out.println("creating directory: " + printPath);
		    boolean result = theDir.mkdir();  

		     if(result) {    
		       System.out.println("DIR created");  
		       fileName = theDir.getCanonicalPath();
		     }
		  }
		String pngPath = "";
		 if (fs.toString().contains("MacOSXFileSystem"))
		 {
			 pngPath = printPath + fs.getSeparator() + "." ; //TODO + "."
			 printPath = printPath + fs.getSeparator();
			 macHidden = ".";
		 }
		else
		{
			 Runtime.getRuntime().exec("attrib +H myHiddenFile.java");
			pngPath = printPath + fs.getSeparator();
			printPath = printPath + fs.getSeparator();
		}
		 
		
		 
		 
		 
		 
		File a = new File("resources/1-ADMISSION BOOKKEEPING FORM.png");
		 File b = new File(pngPath + "1-ADMISSION BOOKKEEPING FORM.png");

		 copyFile(a,b);
		 File c = new File("resources/1-Exit Bookkeeping.png");
		 File d = new File(pngPath + "1-Exit Bookkeeping.png");
		 copyFile(c,d);
		 File e = new File("resources/1-Screening & Client Information Page 001.png");
		 File f = new File(pngPath + "1-Screening & Client Information Page 001.png");
		 copyFile(e,f);
		 File g = new File("resources/1-Screening & Client Information Page 002.png");
		 File h = new File(pngPath + "1-Screening & Client Information Page 002.png");
		 copyFile(g,h);
		 File i= new File("resources/1-UA.png");
		 File j = new File(pngPath + "1-UA.png");
		 copyFile(i,j);
		 File k = new File("resources/10-Fire Response Plan.png");
		 File l= new File(pngPath + "10-Fire Response Plan.png");
		 copyFile(k,l);
		 File m = new File("resources/2- 1on1 notes 2.png");
		 File n = new File(pngPath + "2- 1on1 notes 2.png");
		 copyFile(m,n);
		 File o = new File("resources/2-CFR Statement.png");
		 File p = new File(pngPath + "2-CFR Statement.png");
		 copyFile(o,p);
		 File q = new File("resources/2-H.Q Page 002.png");
		 File r = new File(pngPath + "2-H.Q Page 002.png");
		 copyFile(q,r);
		 File s = new File("resources/2-H.Q Page 003.png");
		 File t = new File(pngPath + "2-H.Q Page 003.png");
		 copyFile(s,t);
		 File u = new File("resources/2-H.Q Page 004.png");
		 File v = new File(pngPath + "2-H.Q Page 004.png");
		 copyFile(u,v);
		 File w = new File("resources/2-H.Q Page 005.png");
		 File x = new File(pngPath + "2-H.Q Page 005.png");
		 copyFile(w,x);
		 File y = new File("resources/2-RULES AND RIGHTS VIOLATION.png");
		 File z = new File(pngPath + "2-RULES AND RIGHTS VIOLATION.png");
		 copyFile(y,z);
		 File a1= new File("resources/3-Discharge Criteria.png");
		 File b1 = new File(pngPath + "3-Discharge Criteria.png");
		 copyFile(a1, b1);
		 File c1 = new File("resources/3-Follow-up and Consent.png");
		 File d1 = new File(pngPath + "3-Follow-up and Consent.png");
		 copyFile(c1,d1);
		 File e1 = new File("resources/3-TX Plan.png");
		 File f1 = new File(pngPath + "3-TX Plan.png");
		 copyFile(e1,f1);
		 File g1= new File("resources/4-AUTHORIZATION FOR RELEASE OF PSYCHIATRIC.png");
		 File h1 = new File(pngPath + "4-AUTHORIZATION FOR RELEASE OF PSYCHIATRIC.png");
		 copyFile(g1,h1);
		 File i1 = new File("resources/4-CLIENT ADMISSION AGREEMENT revised Page 001.png");
		 File j1 = new File(pngPath + "4-CLIENT ADMISSION AGREEMENT revised Page 001.png");
		 copyFile(i1,j1); 
		 File k1 = new File("resources/4-CLIENT ADMISSION AGREEMENT revised Page 004.png");
		 File l1 = new File(pngPath + "4-CLIENT ADMISSION AGREEMENT revised Page 004.png");
		 copyFile(k1,l1); 
		 File m1 = new File("resources/4-Discharge Summary Page 001.png");
		 File n1 = new File(pngPath + "4-Discharge Summary Page 001.png");
		 copyFile(m1,n1);
		 File o1 = new File("resources/4-Discharge Summary Page 002.png");
		 File p1 = new File(pngPath + "4-Discharge Summary Page 002.png");
		 copyFile(o1, p1);
		 File q1 = new File("resources/4-DSM IV.png");
		 File r1 = new File(pngPath + "4-DSM IV.png");
		 copyFile(q1,r1);
		 File s1 = new File("resources/5-Client Self Evaluation and Exit Plan.png");
		 File t1 = new File(pngPath + "5-Client Self Evaluation and Exit Plan.png");
		 copyFile(s1, t1);
		 File u1 = new File("resources/5-Consent Doc1.png");
		 File v1 = new File(pngPath + "5-Consent Doc1.png");
		 copyFile(u1,v1);	 
		 File xj = new File("resources/5-Financial West Slope Recovery.png");
		 File xy = new File(pngPath + "5-Financial West Slope Recovery.png");
		 copyFile(xj,xy);
		 File xd = new File("resources/6-CLIENT RIGHTS AND CONSENT to TREATMENT.png");
		 File xs = new File(pngPath + "6-CLIENT RIGHTS AND CONSENT to TREATMENT.png");
		 copyFile(xd,xs);
		 File xq = new File("resources/6-Consent Doc2.png");
		 File xw = new File(pngPath + "6-Consent Doc2.png");
		 copyFile(xq,xw);
		 File w1 = new File("resources/6-Phase Eval.png");
		 File x1 = new File(pngPath + "6-Phase Eval.png");
		 copyFile(w1,x1);
		 File y1 = new File("resources/6-Safekeeping Agreement.png");
		 File z1 = new File(pngPath + "6-Safekeeping Agreement.png");
		 copyFile(y1,z1);
		 File a2 = new File("resources/7-Criminal Justice Release.png");
		 File b2 = new File(pngPath + "7-Criminal Justice Release.png");
		 copyFile(a2, b2);
		 File c2 = new File("resources/7-LINEN AGREEMENT.png");
		 File d2 = new File(pngPath + "7-LINEN AGREEMENT.png");
		 copyFile(c2, d2);//
		 File e2 = new File("resources/7-Phase II Info.png");
		 File f2 = new File(pngPath + "7-Phase II Info.png");
		 copyFile(e2,f2);
		 File g2 = new File("resources/7-The Program and Resident Rules Page 001.png");
		 File h2 = new File(pngPath + "7-The Program and Resident Rules Page 001.png");
		 copyFile(g2,h2);
		 File i2 = new File("resources/7-The Program and Resident Rules Page 002.png");
		 File j2 = new File(pngPath + "7-The Program and Resident Rules Page 002.png");
		 copyFile(i2,j2);
		 File k2 = new File("resources/8-Group Rules.png");
		 File l2 = new File(pngPath + "8-Group Rules.png");
		 copyFile(k2,l2);
		 File m2 = new File("resources/9-Hygiene Standards.png");
		 File n2 = new File(pngPath + "9-Hygiene Standards.png");
		 copyFile(m2,n2);

		 System.out.println(a.exists());
		 
		 
         
		 
		//here we return a boolean value stating whether or not updating the filepath worked or not.
		return true;
}
	
	public void copyFile( File from, File to) throws IOException 
	{
	    Files.copy( from.toPath(), to.toPath() );
	}

	public void screen1() {


		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"1-Screening%20&%20Client%20Information%20Page%20001.png);	background-repeat: no-repeat;}.end{	position: absolute;	height: 0px;	width: 202px;	left: 254px;	top: 1026px;	right: 20px;	bottom: auto;}.patFirst {	position: absolute; 	height: auto;   width: 190px;	left: 45px;		top: 107px;		right: 20px;	bottom: auto;}.patLast {	position: absolute;	height: auto;	width: 197px;	left: 247px;	top: 109px;	right: 20px;	bottom: auto;}.patDOB {	position: absolute;		height: auto;	width: 100px;	left: 459px;	top: 107px;		right: auto;	bottom: auto;}.patAge {	position: absolute;	height: auto;	width: 42px;	left: 563px;	top: 107px;	right: 20px;	bottom: auto;}.patVET {	position: absolute;	height: auto;	width: 88px;	left: 653px;	top: 109px;	right: 20px;	bottom: auto;	}.patStreet {	position: absolute;	height: auto;	width: 322px;	left: 45px;	top: 145px;	right: 20px;	bottom: auto;}.patCity {	position: absolute;	height: auto;	width: 198px;	left: 371px;	top: 143px;	right: 20px;	bottom: auto;}.ST {	position: absolute;	height: auto;	width: 38px;	left: 577px;	top: 143px;	right: 20px;	bottom: auto;}.ZIP {	position: absolute;	height: auto;	width: 72px;	left: 625px;	top: 143px;	right: 20px;	bottom: auto;}.patCounty{	position: absolute;	height: auto;	width: 214px;	left: 45px;	top: 183px;	right: 20px;	bottom: auto;}.patNumOfYears{	position: absolute;	height: auto;	width: 66px;	left: 263px;	top: 181px;	right: 20px;	bottom: auto;}.patPrimaryNum{	position: absolute;	height: auto;	width: 66px;	left: 333px;	top: 181px;	right: 20px;	bottom: auto;}.patSecondaryNum{	position: absolute;	height: auto;	width: 66px;	left: 519px;	top: 181px;	right: 20px;	bottom: auto;}.patSSN{	position: absolute;	height: auto;	width: 152px;	left: 45px;	top: 219px;	right: 20px;	bottom: auto;}.patDLNo{	position: absolute;	height: auto;	width: 146px;	left: 203px;	top: 219px;	right: 20px;	bottom: auto;}.patDLst{	position: absolute;	height: auto;	width: 44px;	left: 355px;	top: 219px;	right: 20px;	bottom: auto;}.patMarital{	position: absolute;	height: auto;	width: 44px;	left: 401px;	top: 218px;	right: 20px;	bottom: auto;}.patPart{	position: absolute;	height: auto;	width: 184px;	left: 513px;	top: 217px;	right: 20px;	bottom: auto;}.emerName{	position: absolute;	height: auto;	width: 338px;	left: 45px;	top: 295px;	right: 20px;	bottom: auto;}.emerRelate{	position: absolute;	height: auto;	width: 124px;	left: 389px;	top: 293px;	right: 20px;	bottom: auto;}.emerPrimNum{	position: absolute;	height: auto;	width: 184px;	left: 516px;	top: 296px;	right: 20px;	bottom: auto;}.emerAddy{	position: absolute;	height: auto;	width: 214px;	left: 45px;	top: 327px;	right: 20px;	bottom: auto;}.emerCity{	position: absolute;	height: auto;	width: 158px;	left: 263px;	top: 323px;	right: 20px;	bottom: auto;}.emerST{	position: absolute;	height: auto;	width: 34px;	left: 423px;	top: 323px;	right: 20px;	bottom: auto;}.emerZIP{	position: absolute;	height: auto;	width: 46px;	left: 463px;	top: 323px;	right: 20px;	bottom: auto;}.emerSecNum{	position: absolute;	height: auto;	width: 184px;	left: 523px;	top: 323px;	right: 20px;	bottom: auto;}.agenName{	position: absolute;	height: auto;	width: 154px;	left: 47px;	top: 389px;	right: 20px;	bottom: auto;}.agenConPers{	position: absolute;	height: auto;	width: 214px;	left: 207px;	top: 387px;	right: 20px;	bottom: auto;}.agenCounty{	position: absolute;	height: auto;	width: 94px;	left: 425px;	top: 387px;	right: 20px;	bottom: auto;}.agenConPh{	position: absolute;	height: auto;	width: 184px;	left: 523px;	top: 386px;	right: 20px;	bottom: auto;}.agenAddy{	position: absolute;	height: auto;	width: 206px;	left: 45px;	top: 415px;	right: 20px;	bottom: auto;}.agenCity{	position: absolute;	height: auto;	width: 146px;	left: 255px;	top: 417px;	right: 20px;	bottom: auto;}.agenST{	position: absolute;	height: auto;	width: 42px;	left: 406px;	top: 415px;	right: 20px;	bottom: auto;}.agenZIP{	position: absolute;	height: auto;	width: 66px;	left: 447px;	top: 415px;	right: 20px;	bottom: auto;}.agenCell{	position: absolute;	height: auto;	width: 184px;	left: 517px;	top: 417px;	right: 20px;	bottom: auto;}.legPris{	position: absolute;	height: auto;	width: 44px;	left: 213px;	top: 479px;	right: 20px;	bottom: auto;}.legProb{	position: absolute;	height: auto;	width: 54px;	left: 407px;	top: 479px;	right: 20px;	bottom: auto;}.legWhyProb{	position: absolute;	height: auto;	width: 202px;	left: 497px;	top: 479px;	right: 20px;	bottom: auto;}.legName{	position: absolute;	height: auto;	width: 220px;	left: 45px;	top: 507px;	right: 20px;	bottom: auto;}.legAddy{	position: absolute;	height: auto;	width: 252px;	left: 267px;	top: 507px;	right: 20px;	bottom: auto;}.legPh{	position: absolute;	height: auto;	width: 184px;	left: 523px;	top: 507px;	right: 20px;	bottom: auto;}.heaPhys{	position: absolute;	height: auto;	width: 48px;	left: 335px;	top: 571px;	right: 20px;	bottom: auto;}.heaPhysWhy{	position: absolute;	height: auto;	width: 288px;	left: 417px;	top: 569px;	right: 20px;	bottom: auto;}.heaMean{	position: absolute;	height: auto;	width: 48px;	left: 331px;	top: 597px;	right: 20px;	bottom: auto;}.heaMeanWhy{	position: absolute;	height: auto;	width: 288px;	left: 419px;	top: 599px;	right: 20px;	bottom: auto;}.sub1{	position: absolute;	height: auto;	width: 136px;	left: 39px;	top: 651px;	right: 20px;	bottom: auto;}.sub1Last{	position: absolute;	height: auto;	width: 136px;	left: 175px;	top: 650px;	right: 20px;	bottom: auto;}.sub1Freq{	position: absolute;	height: auto;	width: 136px;	left: 312px;	top: 652px;	right: 20px;	bottom: auto;}.sub1Amount{	position: absolute;	height: auto;	width: 136px;	left: 447px;	top: 652px;	right: 20px;	bottom: auto;}.sub1Meth{	position: absolute;	height: auto;	width: 136px;	left: 584px;	top: 650px;	right: 20px;	bottom: auto;}.sub2{	position: absolute;	height: auto;	width: 136px;	left: 39px;	top: 672px;	right: 20px;	bottom: auto;}.sub2Last{	position: absolute;	height: auto;	width: 136px;	left: 175px;	top: 671px;	right: 20px;	bottom: auto;}.sub2Freq{	position: absolute;	height: auto;	width: 136px;	left: 312px;	top: 671px;	right: 20px;	bottom: auto;}.sub2Amount{	position: absolute;	height: auto;	width: 136px;	left: 449px;	top: 672px;	right: 20px;	bottom: auto;}.sub2Meth{	position: absolute;	height: auto;	width: 136px;	left: 584px;	top: 672px;	right: 20px;	bottom: auto;}.sub3{	position: absolute;	height: auto;	width: 136px;	left: 39px;	top: 693px;	right: 20px;	bottom: auto;}.sub3Last{	position: absolute;	height: auto;	width: 136px;	left: 177px;	top: 692px;	right: 20px;	bottom: auto;}.sub3Freq{	position: absolute;	height: auto;	width: 136px;	left: 313px;	top: 692px;	right: 20px;	bottom: auto;}.sub3Amount{	position: absolute;	height: auto;	width: 136px;	left: 449px;	top: 693px;	right: 20px;	bottom: auto;}.sub3Meth{	position: absolute;	height: auto;	width: 136px;	left: 583px;	top: 692px;	right: 20px;	bottom: auto;}.iv12{	position: absolute;	height: auto;	width: 41px;	left: 268px;	top: 724px;	right: 20px;	bottom: auto;}.prior{	position: absolute;	height: auto;	width: 38px;	left: 540px;	top: 723px;	right: 20px;	bottom: auto;}.hmany{	position: absolute;	height: auto;	width: 59px;	left: 667px;	top: 723px;	right: 20px;	bottom: auto;}.whereWhen{	position: absolute;	height: auto;	width: 529px;	left: 184px;	top: 752px;	right: 20px;	bottom: auto;}.clientLog{	position: absolute;	height: auto;	width: 81px;	left: 214px;	top: 892px;	right: 20px;	bottom: auto;}</style><div class=\"patFirst\">"+$patFirst+"</div><div class=\"patLast\">"+$patLast+"</div><div class=\"patDOB\">"+$patDOB+"</div><div class=\"patAge\">"+$patAge+"</div><div class=\"patVET\">"+$patVET+"</div><div class=\"patStreet\">"+$patStreet+"</div><div class=\"patCity\">"+$patCity+"</div><div class=\"ST\">"+$ST+"</div><div class=\"ZIP\">"+$ZIP+"</div><div class=\"patCounty\">"+$patCounty+"</div><div class=\"patNumOfYears\">"+$cntyYrs+"</div><div class=\"patPrimaryNum\">"+$patPhNum+"</div><div class=\"patSecondaryNum\">"+$pat2ndPhNum+"</div><div class=\"patSSN\">"+$patSSN+"</div><div class=\"patDLNo\">"+$DLNo+"</div><div class=\"patDLst\">"+$DLst+"</div><div class=\"patMarital\">"+$Marital+"</div><div class=\"patPart\">"+$patPart+"</div><div class=\"emerName\">"+$emerName+"</div><div class=\"emerRelate\">"+$emerRelate+"</div><div class=\"emerPrimNum\">"+$emerPrimNum+"</div><div class=\"emerAddy\">"+$emerAddy+"</div><div class=\"emerCity\">"+$emerCity+"</div><div class=\"emerST\">"+$eST+"</div><div class=\"emerZIP\">"+$emerZIP+"</div><div class=\"emerSecNum\">"+$emerSecNum+"</div><div class=\"agenName\">"+$agenName+"</div><div class=\"agenConPers\">"+$agenConPers+"</div><div class=\"agenCounty\">"+$agenCounty+"</div><div class=\"agenConPh\">"+$agenConPh+"</div><div class=\"agenAddy\">"+$agenAddy+"</div><div class=\"agenCity\">"+$agenCity+"</div><div class=\"agenZIP\">"+$agenZIP+"</div><div class=\"agenST\">"+$aST+"</div><div class=\"agenCell\">"+$agenCell+"</div><div class=\"legPris\">"+$legPris+"</div><div class=\"legProb\">"+$legProb+"</div><div class=\"legWhyProb\">"+$legWhyProb+"</div><div class=\"legName\">"+$legName+"</div><div class=\"legAddy\">"+$legAddy+"</div><div class=\"legPh\">"+$legPh+"</div><div class=\"heaPhys\">"+$heaPhys+"</div><div class=\"heaPhysWhy\">"+$heaPhysWhy+"</div><div class=\"heaMean\">"+$heamean+"</div><div class=\"heaMeanWhy\">"+$heaMeanWhy+"</div><div class=\"sub1\">"+$sub1+"</div><div class=\"sub1Last\">"+$sub1Last+"</div><div class=\"sub1Freq\">"+$sub1Freq+"</div><div class=\"sub1Amount\">"+$sub1Amount+"</div><div class=\"sub1Meth\">"+$sub1Meth+"</div><div class=\"sub2\">"+$sub2+"</div><div class=\"sub2Last\">"+$sub2Last+"</div><div class=\"sub2Freq\">"+$sub2Freq+"</div><div class=\"sub2Amount\">"+$sub2Amount+"</div><div class=\"sub2Meth\">"+$sub2Meth+"</div><div class=\"sub3\">"+$sub3+"</div><div class=\"sub3Last\">"+$sub3Last+"</div><div class=\"sub3Freq\">"+$sub3Freq+"</div><div class=\"sub3Amount\">"+$sub3Amount+"</div><div class=\"sub3Meth\">"+$sub3Meth+"</div><div class=\"iv12\">"+$iv12+"</div><div class=\"prior\">"+$prior+"</div><div class=\"hmany\">"+$hmany+"</div><div class=\"whereWhen\">"+$whereWhen+"</div><div class=\"clientLog\">"+$clientLog+"</div><div class=\"end\"></div>\"";
 
			File file = new File(printPath+"1-1-Screening & Client Information Page 001.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void screen2() {


		try {
		
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"1-Screening%20&%20Client%20Information%20Page%20002.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.sex {	position: absolute;	height: auto;	width: 84px;	left: 368px;	top: 141px;	right: 20px;	bottom: auto;}.q1 {	position: absolute;	height: auto;	width: 620px;	left: 90px;	top: 317px;	right: 20px;	bottom: auto;}.arson {	position: absolute;	height: auto;	width: 84px;	left: 670px;	top: 141px;	right: 20px;	bottom: auto;}.q2 {	position: absolute;	height: auto;	width: 628px;	left: 88px;	top: 379px;	right: 20px;	bottom: auto;}.q3 {	position: absolute;	height: auto;	width: 628px;	left: 88px;	top: 445px;	right: 20px;	bottom: auto;}.q4 {	position: absolute;	height: auto;	width: 626px;	left: 88px;	top: 509px;	right: 20px;	bottom: auto;}.physLim {	position: absolute;	height: auto;	width: 85px;	left: 642px;	top: 545px;	right: 20px;	bottom: auto;}.diag1 {	position: absolute;	height: auto;	width: 205px;	left: 40px;	top: 645px;	right: 20px;	bottom: auto;}.diag2 {	position: absolute;	height: auto;	width: 205px;	left: 40px;	top: 665px;	right: 20px;	bottom: auto;}.diag3 {	position: absolute;	height: auto;	width: 205px;	left: 40px;	top: 685px;	right: 20px;	bottom: auto;}.med1 {	position: absolute;	height: auto;	width: 205px;	left: 247px;	top: 645px;	right: 20px;	bottom: auto;}.med2 {	position: absolute;	height: auto;	width: 205px;	left: 247px;	top: 665px;	right: 20px;	bottom: auto;}.med3 {	position: absolute;	height: auto;	width: 205px;	left: 247px;	top: 685px;	right: 20px;	bottom: auto;}.dos1 {	position: absolute;	height: auto;	width: 205px;	left: 482px;	top: 645px;	right: 20px;	bottom: auto;}.dos2 {	position: absolute;	height: auto;	width: 205px;	left: 482px;	top: 665px;	right: 20px;	bottom: auto;}.dos3 {	position: absolute;	height: auto;	width: 205px;	left: 482px;	top: 685px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 99px;	left: 230px;	top: 883px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"q1\">"+$q1+"</div><div class=\"q2\">"+$a2+"</div><div class=\"q3\">"+$q3+"</div><div class=\"q4\">"+$q4+"</div><div class=\"physLim\">"+$physLim+"</div><div class=\"diag1\">"+$diag1+"</div><div class=\"diag2\">"+$diag2+"</div><div class=\"diag3\">"+$diag3+"</div><div class=\"med1\">"+$med1+"</div><div class=\"med2\">"+$med2+"</div><div class=\"med3\">"+$med3+"</div><div class=\"dos1\">"+$dos1+"</div><div class=\"dos2\">"+$dos2+"</div><div class=\"dos3\">"+$dos3+"</div><div class=\"sex\">"+$sex+"</div><div class=\"arson\">"+$arson+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
	 
			File file = new File(printPath+"1-1-Screening & Client Information Page 002.html");//INSERT DIRECTORY HERE
	 
				// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
	 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
	 
			System.out.println("Done");
	 
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
		
	public void admissionAgreement(){

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"4-CLIENT%20ADMISSION%20AGREEMENT%20revised%20Page%20001.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 62px;	top: 269px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 408px;	left: 158px;	top: 269px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div><div class=\"patName\">"+$patFirst + $patLast+"</div>";
 
			File file = new File(printPath+"1-4-CLIENT ADMISSION AGREEMENT revised Page 001.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void admissionAgreement2(){

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"4-CLIENT%20ADMISSION%20AGREEMENT%20revised%20Page%20004.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 188px;	left: 74px;	top: 224px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div>";
 
			File file = new File(printPath+"1-4-CLIENT ADMISSION AGREEMENT revised Page 002.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void financial(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"5-Financial%20West%20Slope%20Recovery.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 248px;	left: 126px;	top: 115px;	right: 20px;	bottom: auto;}.patSSN {	position: absolute;	height: auto;	width: 142px;	left: 536px;	top: 117px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 142px;	left: 400px;	top: 890px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"patSSN\">"+$patSSN+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"1-5-Financial West Slope Recovery.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void rights(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"6-CLIENT%20RIGHTS%20AND%20CONSENT%20to%20TREATMENT.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 382px;	top: 884px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"1-6-CLIENT RIGHTS AND CONSENT to TREATMENT.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void rules1(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"7-The%20Program%20and%20Resident%20Rules%20Page%20001.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 932px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 168px;	top: 900px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"1-7-The Program and Resident Rules Page 001.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void rules2(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"7-The%20Program%20and%20Resident%20Rules%20Page%20002.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 916px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 169px;	top: 900px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"1-7-The Program and Resident Rules Page 002.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void groupRules(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"8-Group%20Rules.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 352px;	top: 891px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"1-8-Group Rules.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void hygiene(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"9-Hygiene%20Standards.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 945px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 404px;	top: 909px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"1-9-Hygiene Standards.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void fire(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"10-Fire%20Response%20Plan.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 404px;	top: 918px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"1-10-Fire Response Plan.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void ua(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"1-UA.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 928px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 395px;	top: 894px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">  <p>"+$clientLog+"</p></div>";
 
			File file = new File(printPath+"2-1-UA.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void hq2(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"2-H.Q%20Page%20002.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 20px;	left: 90px;	top: 1000px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 200px;	left: 133px;	top: 143px;	right: 20px;	bottom: auto;}.patDOB {	position: absolute;	height: auto;	width: 200px;	left: 489px;	top: 143px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 200px;	left: 383px;	top: 856px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"patDOB\">"+$patDOB+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"2-2-H.Q Page 002.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void hq3(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"2-H.Q%20Page%20003.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 383px;	top: 845px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"2-2-H.Q Page 003.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void hq4(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"2-H.Q%20Page%20004.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 385px;	top: 860px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"2-2-H.Q Page 004.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void hq5(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"2-H.Q%20Page%20005.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.patDOB {	position: absolute;	height: auto;	width: 126px;	left: 545px;	top: 111px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 268px;	left: 142px;	top: 111px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 374px;	top: 872px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"patDOB\">"+$patDOB+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"2-2-H.Q Page 005.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void bookkeeping(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"1-ADMISSION%20BOOKKEEPING%20FORM.png);	background-repeat: no-repeat;}.adDate {	position: absolute;	height: auto;	width: 84px;	left: 60px;	top: 141px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 325px;	left: 225px;	top: 141px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 140px;	left: 591px;	top: 140px;	right: 20px;	bottom: auto;}.patAddress {	position: absolute;	height: auto;	width: 646px;	left: 61px;	top: 187px;	right: 20px;	bottom: auto;}.patDOB {	position: absolute;	height: auto;	width: 124px;	left: 59px;	top: 243px;	right: 20px;	bottom: auto;}.patSSN {	position: absolute;	height: auto;	width: 144px;	left: 197px;	top: 243px;	right: 20px;	bottom: auto;}.patPhNum {	position: absolute;	height: auto;	width: 144px;	left: 367px;	top: 243px;	right: 20px;	bottom: auto;}.pat2ndPhNum{	position: absolute;	height: auto;	width: 144px;	left: 549px;	top: 243px;	right: 20px;	bottom: auto;}.patDSM{	position: absolute;	height: auto;	width: 68px;	left: 150px;	top: 308px;	right: 20px;	bottom: auto;}.DSM{	position: absolute;	height: auto;	width: 69px;	left: 150px;	top: 308px;	right: 20px;	bottom: auto;}.patCounselor{	position: absolute;	height: auto;	width: 289px;	left: 338px;	top: 308px;	right: 20px;	bottom: auto;}.payMeth{	position: absolute;	height: auto;	width: 101px;	left: 171px;	top: 352px;	right: 20px;	bottom: auto;}.patCounty{	position: absolute;	height: auto;	width: 183px;	left: 320px;	top: 352px;	right: 20px;	bottom: auto;}.priChar{	position: absolute;	height: auto;	width: 79px;	left: 615px;	top: 352px;	right: 20px;	bottom: auto;}.authDateEnd{	position: absolute;	height: auto;	width: 183px;	left: 396px;	top: 400px;	right: 20px;	bottom: auto;}.authDateStart{	position: absolute;	height: auto;	width: 119px;	left: 214px;	top: 400px;	right: 20px;	bottom: auto;}.end{	position: absolute;	height: auto;	width: 183px;	left: 274px;	top: 451px;	right: 20px;	bottom: auto;}</style><div class=\"adDate\">"+$adDate+"</div><div class=\"patName\">"+$patFirst+$patLast+"</div><div class=\"clientLog\">"+$clientLog+"</div><div class=\"patAddress\">"+$patStreet + $patCity + $ST + $ZIP+"</div><div class=\"patDOB\">"+$patDOB+"</div>	<div class=\"patSSN\">"+$patSSN+"</div>	<div class=\"patPhNum\">"+$patPhNum+"</div>	<div class=\"pat2ndPhNum\">"+$pat2ndPhNum+"</div><div class=\"patCounselor\">"+$patCounselor+"</div><div class=\"patCounty\">"+$patCounty+"</div><div class=\"end\"></div><div class=\"DSM\">"+$DSM+"</div><div class=\"payMeth\">"+$payMeth+"</div><div class=\"priChar\">"+$priChar+"</div><div class=\"authDateStart\">"+$authDateStart+"</div><div class=\"authDateEnd\">"+$authDateEnd+"</div>";
 
			File file = new File(printPath+"3-1-ADMISSION BOOKKEEPING FORM.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void cfr(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"2-CFR%20Statement.png);	background-repeat: no-repeat;}.adDate {	position: absolute;	height: auto;	width: 84px;	left: 398px;	top: 894px;	right: 20px;	bottom: auto;}</style><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"3-2-CFR Statement.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void followUp(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"3-Follow-up%20and%20Consent.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 298px;	left: 82px;	top: 159px;	right: 20px;	bottom: auto;}.patAddress {	position: absolute;	height: auto;	width: 624px;	left: 62px;	top: 717px;	right: 20px;	bottom: auto;}.patPhNum {	position: absolute;	height: auto;	width: 182px;	left: 63px;	top: 773px;	right: 20px;	bottom: auto;}.pat2ndPhNum{	position: absolute;	height: auto;	width: 184px;	left: 275px;	top: 774px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 64px;	left: 151px;	top: 842px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"patAddress\">"+$patStreet + $patCity + $ST + $ZIP+"</div><div class=\"patPhNum\">"+$patPhNum+"</div>	<div class=\"pat2ndPhNum\">"+$pat2ndPhNum+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"3-3-Follow-up and Consent.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void auth(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"4-AUTHORIZATION%20FOR%20RELEASE%20OF%20PSYCHIATRIC.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 262px;	left: 140px;	top: 109px;	right: 20px;	bottom: auto;}.patDOB {	position: absolute;	height: auto;	width: 124px;	left: 544px;	top: 109px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 96px;	left: 373px;	top: 854px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"patDOB\">"+$patDOB+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"3-4-AUTHORIZATION FOR RELEASE OF PSYCHIATRIC.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void consent1(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"5-Consent%20Doc1.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 950px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 290px;	left: 70px;	top: 261px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div>";
 
			File file = new File(printPath+"3-5-Consent Doc1.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void consent2(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"6-Consent%20Doc2.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 1003px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 284px;	left: 78px;	top: 261px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div>";
 
			File file = new File(printPath+"3-5-Consent Doc2.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void crim(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"7-Criminal%20Justice%20Release.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 340px;	left: 121px;	top: 178px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div>";
 
			File file = new File(printPath+"3-7-Criminal Justice Release.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void viol(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"2-RULES%20AND%20RIGHTS%20VIOLATION.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 237px;	top: 917px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 326px;	left: 204px;	top: 369px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div>";
 
			File file = new File(printPath+"4-2-RULES AND RIGHTS VIOLATION.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void indiv(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"2-%201on1%20notes%202.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.weekStart {	position: absolute;	height: auto;	width: 102px;	left: 134px;	top: 276px;	right: 20px;	bottom: auto;}.weekEnd {	position: absolute;	height: auto;	width: 78px;	left: 290px;	top: 276px;	right: 20px;	bottom: auto;}.weekEnd {	position: absolute;	height: auto;	width: 78px;	left: 290px;	top: 276px;	right: 20px;	bottom: auto;}.dateOf {	position: absolute;	height: auto;	width: 64px;	left: 445px;	top: 276px;	right: 20px;	bottom: auto;}.timeStart {	position: absolute;	height: auto;	width: 42px;	left: 557px;	top: 276px;	right: 20px;	bottom: auto;}.timeEnd {	position: absolute;	height: auto;	width: 64px;	left: 631px;	top: 276px;	right: 20px;	bottom: auto;}.indivNote {	position: absolute;	height: 464px;	width: 641px;	left: 67px;	top: 344px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 358px;	left: 99px;	top: 855px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 116px;	left: 559px;	top: 857px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"weekStart\">"+$weekStart+"</div><div class=\"weekEnd\">"+$weekEnd+"</div><div class=\"dateOf\">"+$dateOf+"</div><div class=\"timeStart\">"+$timeS+"</div><div class=\"timeEnd\">"+$timeEnd+"</div><div class=\"indivNote\"><p>"+$indivNote+"</p></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"5-2- 1on1 notes 2.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void tx(){//change name

		try {
	
			String content = "<style type=\"text/css\">@media print{@page {size: landscape}}body {	background-image: url("+macHidden+"3-TX%20Plan.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 673px;	top: 691px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 122px;	top: 51px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 228px;	left: 128px;	top: 94px;	right: 20px;	bottom: auto;}.admitDate {	position: absolute;	height: auto;	width: 84px;	left: 548px;	top: 95px;	right: 20px;	bottom: auto;</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"admitDate\">"+$adDate+"</div>";
 
			File file = new File(printPath+"5-3-TX Plan.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}public void dsmiv(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"4-DSM%20IV.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 24px;	top: 859px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"5-4-DSM IV.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}public void pheval(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"6-Phase%20Eval.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 919px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 234px;	left: 198px;	top: 205px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 76px;	left: 384px;	top: 887px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"5-6-Phase Eval.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}public void pheval2(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"7-Phase%20II%20Info.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 230px;	left: 198px;	top: 205px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 78px;	left: 395px;	top: 849px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"5-6-Phase II Info.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}public void exitBook(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"1-Exit%20Bookkeeping.png);	background-repeat: no-repeat;}.exitDate {	position: absolute;	height: auto;	width: 84px;	left: 64px;	top: 174px;	right: 20px;	bottom: auto;}.adDate {	position: absolute;	height: auto;	width: 84px;	left: 187px;	top: 174px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 283px;	left: 298px;	top: 174px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 108px;	left: 591px;	top: 175px;	right: 20px;	bottom: auto;}.patAddress {	position: absolute;	height: auto;	width: 646px;	left: 64px;	top: 222px;	right: 20px;	bottom: auto;}.patDOB {	position: absolute;	height: auto;	width: 124px;	left: 59px;	top: 280px;	right: 20px;	bottom: auto;}.patSSN {	position: absolute;	height: auto;	width: 144px;	left: 197px;	top: 279px;	right: 20px;	bottom: auto;}.patPhNum {	position: absolute;	height: auto;	width: 144px;	left: 373px;	top: 280px;	right: 20px;	bottom: auto;}.pat2ndPhNum{	position: absolute;	height: auto;	width: 144px;	left: 553px;	top: 279px;	right: 20px;	bottom: auto;}.patDSM{	position: absolute;	height: auto;	width: 68px;	left: 150px;	top: 308px;	right: 20px;	bottom: auto;}.patCounselor{	position: absolute;	height: auto;	width: 289px;	left: 395px;	top: 344px;	right: 20px;	bottom: auto;}.patCounty{	position: absolute;	height: auto;	width: 183px;	left: 447px;	top: 387px;	right: 20px;	bottom: auto;}.dsmCode{	position: absolute;	height: auto;	width: 71px;	left: 161px;	top: 343px;	right: 20px;	bottom: auto;}.end{	position: absolute;	height: auto;	width: 183px;	left: 302px;	top: 913px;	right: 20px;	bottom: auto;}.payMeth{	position: absolute;	height: auto;	width: 183px;	left: 295px;	top: 388px;	right: 20px;	bottom: auto;}.owed{	position: absolute;	height: 87px;	width: 635px;	left: 63px;	top: 457px;	right: 20px;	bottom: auto;}</style><div class=\"exitDate\">"+$exitDate+"</div><div class=\"adDate\">"+$adDate+"</div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"clientLog\">"+$clientLog+"</div><div class=\"patAddress\">"+$patStreet + $patCity + $ST + $ZIP+"</div><div class=\"patDOB\">"+$patDOB+"</div>	<div class=\"patSSN\">"+$patSSN+"</div>	<div class=\"patPhNum\">"+$patPhNum+"</div>	<div class=\"pat2ndPhNum\">"+$pat2ndPhNum+"</div><div class=\"patCounselor\">"+$patEndCounselor+"</div><div class=\"end\"></div><div class=\"patCounty\">"+$patCounty+"</div><div class=\"dsmCode\">"+$DSM+"</div><div class=\"payMeth\">"+$payMeth+"</div><div class=\"owed\">"+$owed+"</div>";
 
			File file = new File(printPath+"6-1-Exit Bookkeeping.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}public void disCrit(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"3-Discharge%20Criteria.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 169px;	top: 884px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"6-3-Discharge Criteria.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}public void disSum1(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"4-Discharge%20Summary%20Page%20001.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 941px;	right: 20px;	bottom: auto;}.adDate {	position: absolute;	height: auto;	width: 84px;	left: 180px;	top: 129px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 410px;	left: 60px;	top: 80px;	right: 20px;	bottom: auto;}.exitDate {	position: absolute;	height: auto;	width: 84px;	left: 526px;	top: 131px;	right: 20px;	bottom: auto;}.treatSum {	position: absolute;	height: 235px;	width: 628px;	left: 76px;	top: 367px;	right: 20px;	bottom: auto;}.treatPlanGoal1 {	position: absolute;	height: auto;	width: 314px;	left: 104px;	top: 665px;	right: 20px;	bottom: auto;}.treatPlanGoal2 {	position: absolute;	height: auto;	width: 314px;	left: 104px;	top: 691px;	right: 20px;	bottom: auto;}.treatPlanGoal3 {	position: absolute;	height: auto;	width: 314px;	left: 104px;	top: 716px;	right: 20px;	bottom: auto;}.treatPlanGoal4 {	position: absolute;	height: auto;	width: 314px;	left: 104px;	top: 742px;	right: 20px;	bottom: auto;}.treatPlanGoal5 {	position: absolute;	height: auto;	width: 314px;	left: 104px;	top: 769px;	right: 20px;	bottom: auto;}.treatPlanGoal6 {	position: absolute;	height: auto;	width: 314px;	left: 104px;	top: 794px;	right: 20px;	bottom: auto;}.treatPlanGoalMet1 {	position: absolute;	height: auto;	width: 274px;	left: 442px;	top: 665px;	right: 20px;	bottom: auto;}.treatPlanGoalMet2 {	position: absolute;	height: auto;	width: 274px;	left: 442px;	top: 691px;	right: 20px;	bottom: auto;}.treatPlanGoalMet3 {	position: absolute;	height: auto;	width: 274px;	left: 442px;	top: 716px;	right: 20px;	bottom: auto;}.treatPlanGoalMet4 {	position: absolute;	height: auto;	width: 274px;	left: 442px;	top: 742px;	right: 20px;	bottom: auto;}.treatPlanGoalMet5 {	position: absolute;	height: auto;	width: 274px;	left: 442px;	top: 769px;	right: 20px;	bottom: auto;}.treatPlanGoalMet6 {	position: absolute;	height: auto;	width: 274px;	left: 442px;	top: 794px;	right: 20px;	bottom: auto;}.curDrugUse {	position: absolute;	height: auto;	width: 656px;	left: 66px;	top: 834px;	right: 20px;	bottom: auto;}.curCrim {	position: absolute;	height: 35px;	width: 654px;	left: 65px;	top: 870px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 130px;	left: 172px;	top: 900px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"adDate\">"+$adDate+"</div><div class=\"exitDate\">"+$exitDate+"</div><div class=\"treatSum\">"+$treatSum+"</div><div class=\"treatPlanGoal1\">"+$treatPlanGoal1+"</div><div class=\"treatPlanGoal2\">"+$treatPlanGoal2+"</div><div class=\"treatPlanGoal3\">"+$treatPlanGoal3+"</div><div class=\"treatPlanGoal4\">"+$treatPlanGoal4+"</div><div class=\"treatPlanGoal5\">"+$treatPlanGoal5+"</div><div class=\"treatPlanGoal6\">"+$treatPlanGoal6+"</div><div class=\"treatPlanGoalMet1\">"+$treatPlanGoalMet1+"</div><div class=\"treatPlanGoalMet2\">"+$treatPlanGoalMet2+"</div><div class=\"treatPlanGoalMet3\">"+$treatPlanGoalMet3+"</div><div class=\"treatPlanGoalMet4\">"+$treatPlanGoalMet4+"</div><div class=\"treatPlanGoalMet5\">"+$treatPlanGoalMet5+"</div><div class=\"treatPlanGoalMet6\">"+$treatPlanGoalMet6+"</div><div class=\"curDrugUse\">"+$curDrugUse+"</div><div class=\"curCrim\">"+$curCrim+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"6-4-Discharge Summary Page 001.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}public void disSum2(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"4-Discharge%20Summary%20Page%20002.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 180px;	width: 298px;	left: 252px;	top: 946px;	right: 20px;	bottom: auto;}.addAxis1 {	position: absolute;	height: auto;	width: 84px;	left: 180px;	top: 257px;	right: 20px;	bottom: auto;}.addAxis2 {	position: absolute;	height: auto;	width: 84px;	left: 180px;	top: 280px;	right: 20px;	bottom: auto;}.addAxis3 {	position: absolute;	height: auto;	width: 84px;	left: 180px;	top: 303px;	right: 20px;	bottom: auto;}.addAxis4 {	position: absolute;	height: auto;	width: 84px;	left: 180px;	top: 326px;	right: 20px;	bottom: auto;}.addAxis5 {	position: absolute;	height: auto;	width: 196px;	left: 180px;	top: 349px;	right: 20px;	bottom: auto;}.disAxis1 {	position: absolute;	height: auto;	width: 84px;	left: 518px;	top: 257px;	right: 20px;	bottom: auto;}.disAxis2 {	position: absolute;	height: auto;	width: 84px;	left: 518px;	top: 280px;	right: 20px;	bottom: auto;}.disAxis3 {	position: absolute;	height: auto;	width: 84px;	left: 518px;	top: 303px;	right: 20px;	bottom: auto;}.disAxis4 {	position: absolute;	height: auto;	width: 84px;	left: 518px;	top: 326px;	right: 20px;	bottom: auto;}.disAxis5 {	position: absolute;	height: auto;	width: 196px;	left: 518px;	top: 349px;	right: 20px;	bottom: auto;}.counRec1 {	position: absolute;	height: 57px;	width: 610px;	left: 88px;	top: 427px;	right: 20px;	bottom: auto;}.counRec2 {	position: absolute;	height: 47px;	width: 610px;	left: 88px;	top: 487px;	right: 20px;	bottom: auto;}.counRec3 {	position: absolute;	height: 45px;	width: 610px;	left: 88px;	top: 537px;	right: 20px;	bottom: auto;}.counRec4 {	position: absolute;	height: 57px;	width: 610px;	left: 88px;	top: 587px;	right: 20px;	bottom: auto;}.shouldReturn {	position: absolute;	height: 33px;	width: 610px;	left: 64px;	top: 677px;	right: 20px;	bottom: auto;}.clientComment {	position: absolute;	height: 69px;	width: 610px;	left: 64px;	top: 727px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: 21px;	width: 120px;	left: 170px;	top: 899px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"addAxis1\">"+$addAxis1+"</div><div class=\"addAxis2\">"+$addAxis2+"</div><div class=\"addAxis3\">"+$addAxis3+"</div><div class=\"addAxis4\">"+$addAxis4+"</div><div class=\"addAxis5\">"+$addAxis5 + $addGAFScore+"</div><div class=\"disAxis1\">"+$disAxis1+"</div><div class=\"disAxis2\">"+$disAxis2+"</div><div class=\"disAxis3\">"+$disAxis3+"</div><div class=\"disAxis4\">"+$disAxis4+"</div><div class=\"disAxis5\">"+$disAxis5 + $addGAFScore+"</div><div class=\"counRec1\">"+$counRec1+"</div><div class=\"counRec2\">"+$counRec2+"</div><div class=\"counRec3\">"+$counRec3+"</div><div class=\"counRec4\">"+$counRec4+"</div><div class=\"shouldReturn\">"+$shouldReturn+"</div><div class=\"clientComment\">"+$clientComment+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"6-4-Discharge Summary Page 002.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}public void evalExit(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"5-Client%20Self%20Evaluation%20and%20Exit%20Plan.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 911px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 178px;	top: 895px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 276px;	left: 326px;	top: 895px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div><div class=\"patName\">"+$patFirst + $patLast+"</div>";
 
			File file = new File(printPath+"6-5-Client Self Evaluation and Exit Plan.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}public void safeKeep(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"6-Safekeeping%20Agreement.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 954px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 154px;	top: 903px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">  <p>"+$clientLog+"</p></div>";
 
			File file = new File(printPath+"6-6-Safekeeping Agreement.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}public void linen(){//change name

		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url("+macHidden+"7-LINEN%20AGREEMENT.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 933px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 262px;	left: 76px;	top: 135px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 262px;	left: 208px;	top: 893px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"6-7-LINEN AGREEMENT.html");//INSERT DIRECTORY HERE
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
			}catch (IOException e) {
				e.printStackTrace();
			}
	}

	//main method is for testing
	public static void main (String[] args) {

		Print testprint = new Print("Client_Record", "1");
		
		
		
		
		}

}

