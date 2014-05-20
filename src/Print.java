import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Print {

	private int count = 0;

	private String printPath = "C:/Users/Joseph Lai/Desktop/131print/panel ";

	private String $patFirst = "Josiah ";
	private String $patLast = "Mattsson-Bose";
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
	
	private String $monStart = "blank";
	private String $monEnd = "blank";
	private String $monTop = "blank";
	private String $monNote1 = "blank";
	private String $counID1 = "blank";
	private String $monAMTop = "blank";
	private String $monNote2 = "blank";
	private String $counID2 = "blank";
	private String $monPMTop = "blank";
	private String $mondayNotes = "blank";
	private String $counID3 = "blank";


	private String $tuesStart = "blank";
	private String $tuesEnd = "blank";
	private String $tuesTop = "blank";
	private String $tuesNote1 = "blank";
	private String $counID4 = "blank";
	private String $tuesAMTop = "blank";
	private String $tuesNote2 = "blank";
	private String $counID5 = "blank";
	private String $tuesPMTop = "blank";
	private String $tuesNote4 = "blank";
	private String $counID6 = "blank";
	private String $wedStart = "blank";
	private String $wedEnd = "blank";
	private String $wedTop = "blank";
	private String $wedNote1 = "blank";
	private String $counID7 = "blank";
	private String $wedAMTop = "blank";
	
	private String $counID8 = "blank";
	private String $wedPMTop = "blank";
	private String $tuesNote3 = "blank";
	private String $counID9 = "blank";
	 
	private String 	$thursStart = "blank";
	private String $thursEnd = "blank";
	private String $thursTop = "blank";
	private String $thursNote1 = "blank";
	private String $counID10 = "blank";
	private String $thursAMTop = "blank";
	private String $thursNote2 = "blank";
	private String $counID11 = "blank";
	private String $thursPMTop = "blank";
	private String $thursNote3 = "blank";
	private String $counID12 = "blank";
	private String $friStart = "blank";
	private String $friEnd = "blank";
	private String $friTop = "blank";
	private String $friNote1 = "blank";
	private String $counID13 = "blank";
	private String $friAMTop = "blank";
	private String $friNote2 = "blank";
	private String $counID14 = "blank";
	private String $friPMTop = "blank";
	private String $friNote3 = "blank";
	private String $counID15 = "blank";
	private String $satStart = "blank";
	private String $satEnd = "blank";
	private String $satTop = "blank";
	private String $satNote1 = "blank";
	private String $counID16 = "blank";
	private String $satAMTop = "blank";
	private String $satNote2 = "blank";
	private String $counID17 = "blank";
	private String $sunStart = "blank";
	private String $sunEnd = "blank";
	private String $sunTop = "blank";
	private String $sunNote1 = "blank";
	private String $counID18 = "blank";
	private String $weekOf;
	
	
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
	
	
	
	
	
	
	
	public Print() {

	}

	public void screen1() {


		try {
	
			String content = "<style type=\"text/css\">body {	background-image: url(1-Screening%20&%20Client%20Information%20Page%20001.png);	background-repeat: no-repeat;}.end{	position: absolute;	height: 0px;	width: 202px;	left: 254px;	top: 1026px;	right: 20px;	bottom: auto;}.patFirst {	position: absolute; 	height: auto;   width: 190px;	left: 45px;		top: 107px;		right: 20px;	bottom: auto;}.patLast {	position: absolute;	height: auto;	width: 197px;	left: 247px;	top: 109px;	right: 20px;	bottom: auto;}.patDOB {	position: absolute;		height: auto;	width: 100px;	left: 459px;	top: 107px;		right: auto;	bottom: auto;}.patAge {	position: absolute;	height: auto;	width: 42px;	left: 563px;	top: 107px;	right: 20px;	bottom: auto;}.patVET {	position: absolute;	height: auto;	width: 88px;	left: 653px;	top: 109px;	right: 20px;	bottom: auto;	}.patStreet {	position: absolute;	height: auto;	width: 322px;	left: 45px;	top: 145px;	right: 20px;	bottom: auto;}.patCity {	position: absolute;	height: auto;	width: 198px;	left: 371px;	top: 143px;	right: 20px;	bottom: auto;}.ST {	position: absolute;	height: auto;	width: 38px;	left: 577px;	top: 143px;	right: 20px;	bottom: auto;}.ZIP {	position: absolute;	height: auto;	width: 72px;	left: 625px;	top: 143px;	right: 20px;	bottom: auto;}.patCounty{	position: absolute;	height: auto;	width: 214px;	left: 45px;	top: 183px;	right: 20px;	bottom: auto;}.patNumOfYears{	position: absolute;	height: auto;	width: 66px;	left: 263px;	top: 181px;	right: 20px;	bottom: auto;}.patPrimaryNum{	position: absolute;	height: auto;	width: 66px;	left: 333px;	top: 181px;	right: 20px;	bottom: auto;}.patSecondaryNum{	position: absolute;	height: auto;	width: 66px;	left: 519px;	top: 181px;	right: 20px;	bottom: auto;}.patSSN{	position: absolute;	height: auto;	width: 152px;	left: 45px;	top: 219px;	right: 20px;	bottom: auto;}.patDLNo{	position: absolute;	height: auto;	width: 146px;	left: 203px;	top: 219px;	right: 20px;	bottom: auto;}.patDLst{	position: absolute;	height: auto;	width: 44px;	left: 355px;	top: 219px;	right: 20px;	bottom: auto;}.patMarital{	position: absolute;	height: auto;	width: 44px;	left: 401px;	top: 218px;	right: 20px;	bottom: auto;}.patPart{	position: absolute;	height: auto;	width: 184px;	left: 513px;	top: 217px;	right: 20px;	bottom: auto;}.emerName{	position: absolute;	height: auto;	width: 338px;	left: 45px;	top: 295px;	right: 20px;	bottom: auto;}.emerRelate{	position: absolute;	height: auto;	width: 124px;	left: 389px;	top: 293px;	right: 20px;	bottom: auto;}.emerPrimNum{	position: absolute;	height: auto;	width: 184px;	left: 516px;	top: 296px;	right: 20px;	bottom: auto;}.emerAddy{	position: absolute;	height: auto;	width: 214px;	left: 45px;	top: 327px;	right: 20px;	bottom: auto;}.emerCity{	position: absolute;	height: auto;	width: 158px;	left: 263px;	top: 323px;	right: 20px;	bottom: auto;}.emerST{	position: absolute;	height: auto;	width: 34px;	left: 423px;	top: 323px;	right: 20px;	bottom: auto;}.emerZIP{	position: absolute;	height: auto;	width: 46px;	left: 463px;	top: 323px;	right: 20px;	bottom: auto;}.emerSecNum{	position: absolute;	height: auto;	width: 184px;	left: 523px;	top: 323px;	right: 20px;	bottom: auto;}.agenName{	position: absolute;	height: auto;	width: 154px;	left: 47px;	top: 389px;	right: 20px;	bottom: auto;}.agenConPers{	position: absolute;	height: auto;	width: 214px;	left: 207px;	top: 387px;	right: 20px;	bottom: auto;}.agenCounty{	position: absolute;	height: auto;	width: 94px;	left: 425px;	top: 387px;	right: 20px;	bottom: auto;}.agenConPh{	position: absolute;	height: auto;	width: 184px;	left: 523px;	top: 386px;	right: 20px;	bottom: auto;}.agenAddy{	position: absolute;	height: auto;	width: 206px;	left: 45px;	top: 415px;	right: 20px;	bottom: auto;}.agenCity{	position: absolute;	height: auto;	width: 146px;	left: 255px;	top: 417px;	right: 20px;	bottom: auto;}.agenST{	position: absolute;	height: auto;	width: 42px;	left: 406px;	top: 415px;	right: 20px;	bottom: auto;}.agenZIP{	position: absolute;	height: auto;	width: 66px;	left: 447px;	top: 415px;	right: 20px;	bottom: auto;}.agenCell{	position: absolute;	height: auto;	width: 184px;	left: 517px;	top: 417px;	right: 20px;	bottom: auto;}.legPris{	position: absolute;	height: auto;	width: 44px;	left: 213px;	top: 479px;	right: 20px;	bottom: auto;}.legProb{	position: absolute;	height: auto;	width: 54px;	left: 407px;	top: 479px;	right: 20px;	bottom: auto;}.legWhyProb{	position: absolute;	height: auto;	width: 202px;	left: 497px;	top: 479px;	right: 20px;	bottom: auto;}.legName{	position: absolute;	height: auto;	width: 220px;	left: 45px;	top: 507px;	right: 20px;	bottom: auto;}.legAddy{	position: absolute;	height: auto;	width: 252px;	left: 267px;	top: 507px;	right: 20px;	bottom: auto;}.legPh{	position: absolute;	height: auto;	width: 184px;	left: 523px;	top: 507px;	right: 20px;	bottom: auto;}.heaPhys{	position: absolute;	height: auto;	width: 48px;	left: 335px;	top: 571px;	right: 20px;	bottom: auto;}.heaPhysWhy{	position: absolute;	height: auto;	width: 288px;	left: 417px;	top: 569px;	right: 20px;	bottom: auto;}.heaMean{	position: absolute;	height: auto;	width: 48px;	left: 331px;	top: 597px;	right: 20px;	bottom: auto;}.heaMeanWhy{	position: absolute;	height: auto;	width: 288px;	left: 419px;	top: 599px;	right: 20px;	bottom: auto;}.sub1{	position: absolute;	height: auto;	width: 136px;	left: 39px;	top: 651px;	right: 20px;	bottom: auto;}.sub1Last{	position: absolute;	height: auto;	width: 136px;	left: 175px;	top: 650px;	right: 20px;	bottom: auto;}.sub1Freq{	position: absolute;	height: auto;	width: 136px;	left: 312px;	top: 652px;	right: 20px;	bottom: auto;}.sub1Amount{	position: absolute;	height: auto;	width: 136px;	left: 447px;	top: 652px;	right: 20px;	bottom: auto;}.sub1Meth{	position: absolute;	height: auto;	width: 136px;	left: 584px;	top: 650px;	right: 20px;	bottom: auto;}.sub2{	position: absolute;	height: auto;	width: 136px;	left: 39px;	top: 672px;	right: 20px;	bottom: auto;}.sub2Last{	position: absolute;	height: auto;	width: 136px;	left: 175px;	top: 671px;	right: 20px;	bottom: auto;}.sub2Freq{	position: absolute;	height: auto;	width: 136px;	left: 312px;	top: 671px;	right: 20px;	bottom: auto;}.sub2Amount{	position: absolute;	height: auto;	width: 136px;	left: 449px;	top: 672px;	right: 20px;	bottom: auto;}.sub2Meth{	position: absolute;	height: auto;	width: 136px;	left: 584px;	top: 672px;	right: 20px;	bottom: auto;}.sub3{	position: absolute;	height: auto;	width: 136px;	left: 39px;	top: 693px;	right: 20px;	bottom: auto;}.sub3Last{	position: absolute;	height: auto;	width: 136px;	left: 177px;	top: 692px;	right: 20px;	bottom: auto;}.sub3Freq{	position: absolute;	height: auto;	width: 136px;	left: 313px;	top: 692px;	right: 20px;	bottom: auto;}.sub3Amount{	position: absolute;	height: auto;	width: 136px;	left: 449px;	top: 693px;	right: 20px;	bottom: auto;}.sub3Meth{	position: absolute;	height: auto;	width: 136px;	left: 583px;	top: 692px;	right: 20px;	bottom: auto;}.iv12{	position: absolute;	height: auto;	width: 41px;	left: 268px;	top: 724px;	right: 20px;	bottom: auto;}.prior{	position: absolute;	height: auto;	width: 38px;	left: 540px;	top: 723px;	right: 20px;	bottom: auto;}.hmany{	position: absolute;	height: auto;	width: 59px;	left: 667px;	top: 723px;	right: 20px;	bottom: auto;}.whereWhen{	position: absolute;	height: auto;	width: 529px;	left: 184px;	top: 752px;	right: 20px;	bottom: auto;}.clientLog{	position: absolute;	height: auto;	width: 81px;	left: 214px;	top: 892px;	right: 20px;	bottom: auto;}</style><div class=\"patFirst\">"+$patFirst+"</div><div class=\"patLast\">"+$patLast+"</div><div class=\"patDOB\">"+$patDOB+"</div><div class=\"patAge\">"+$patAge+"</div><div class=\"patVET\">"+$patVET+"</div><div class=\"patStreet\">"+$patStreet+"</div><div class=\"patCity\">"+$patCity+"</div><div class=\"ST\">"+$ST+"</div><div class=\"ZIP\">"+$ZIP+"</div><div class=\"patCounty\">"+$patCounty+"</div><div class=\"patNumOfYears\">"+$cntyYrs+"</div><div class=\"patPrimaryNum\">"+$patPhNum+"</div><div class=\"patSecondaryNum\">"+$pat2ndPhNum+"</div><div class=\"patSSN\">"+$patSSN+"</div><div class=\"patDLNo\">"+$DLNo+"</div><div class=\"patDLst\">"+$DLst+"</div><div class=\"patMarital\">"+$Marital+"</div><div class=\"patPart\">"+$patPart+"</div><div class=\"emerName\">"+$emerName+"</div><div class=\"emerRelate\">"+$emerRelate+"</div><div class=\"emerPrimNum\">"+$emerPrimNum+"</div><div class=\"emerAddy\">"+$emerAddy+"</div><div class=\"emerCity\">"+$emerCity+"</div><div class=\"emerST\">"+$eST+"</div><div class=\"emerZIP\">"+$emerZIP+"</div><div class=\"emerSecNum\">"+$emerSecNum+"</div><div class=\"agenName\">"+$agenName+"</div><div class=\"agenConPers\">"+$agenConPers+"</div><div class=\"agenCounty\">"+$agenCounty+"</div><div class=\"agenConPh\">"+$agenConPh+"</div><div class=\"agenAddy\">"+$agenAddy+"</div><div class=\"agenCity\">"+$agenCity+"</div><div class=\"agenZIP\">"+$agenZIP+"</div><div class=\"agenST\">"+$aST+"</div><div class=\"agenCell\">"+$agenCell+"</div><div class=\"legPris\">"+$legPris+"</div><div class=\"legProb\">"+$legProb+"</div><div class=\"legWhyProb\">"+$legWhyProb+"</div><div class=\"legName\">"+$legName+"</div><div class=\"legAddy\">"+$legAddy+"</div><div class=\"legPh\">"+$legPh+"</div><div class=\"heaPhys\">"+$heaPhys+"</div><div class=\"heaPhysWhy\">"+$heaPhysWhy+"</div><div class=\"heaMean\">"+$heamean+"</div><div class=\"heaMeanWhy\">"+$heaMeanWhy+"</div><div class=\"sub1\">"+$sub1+"</div><div class=\"sub1Last\">"+$sub1Last+"</div><div class=\"sub1Freq\">"+$sub1Freq+"</div><div class=\"sub1Amount\">"+$sub1Amount+"</div><div class=\"sub1Meth\">"+$sub1Meth+"</div><div class=\"sub2\">"+$sub2+"</div><div class=\"sub2Last\">"+$sub2Last+"</div><div class=\"sub2Freq\">"+$sub2Freq+"</div><div class=\"sub2Amount\">"+$sub2Amount+"</div><div class=\"sub2Meth\">"+$sub2Meth+"</div><div class=\"sub3\">"+$sub3+"</div><div class=\"sub3Last\">"+$sub3Last+"</div><div class=\"sub3Freq\">"+$sub3Freq+"</div><div class=\"sub3Amount\">"+$sub3Amount+"</div><div class=\"sub3Meth\">"+$sub3Meth+"</div><div class=\"iv12\">"+$iv12+"</div><div class=\"prior\">"+$prior+"</div><div class=\"hmany\">"+$hmany+"</div><div class=\"whereWhen\">"+$whereWhen+"</div><div class=\"clientLog\">"+$clientLog+"</div><div class=\"end\"></div>\"";
 
			File file = new File(printPath+"1/1-Screening & Client Information Page 001.html");//INSERT DIRECTORY HERE
 
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
		
			String content = "<style type=\"text/css\">body {	background-image: url(1-Screening%20&%20Client%20Information%20Page%20002.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.sex {	position: absolute;	height: auto;	width: 84px;	left: 368px;	top: 141px;	right: 20px;	bottom: auto;}.q1 {	position: absolute;	height: auto;	width: 620px;	left: 90px;	top: 317px;	right: 20px;	bottom: auto;}.arson {	position: absolute;	height: auto;	width: 84px;	left: 670px;	top: 141px;	right: 20px;	bottom: auto;}.q2 {	position: absolute;	height: auto;	width: 628px;	left: 88px;	top: 379px;	right: 20px;	bottom: auto;}.q3 {	position: absolute;	height: auto;	width: 628px;	left: 88px;	top: 445px;	right: 20px;	bottom: auto;}.q4 {	position: absolute;	height: auto;	width: 626px;	left: 88px;	top: 509px;	right: 20px;	bottom: auto;}.physLim {	position: absolute;	height: auto;	width: 85px;	left: 642px;	top: 545px;	right: 20px;	bottom: auto;}.diag1 {	position: absolute;	height: auto;	width: 205px;	left: 40px;	top: 645px;	right: 20px;	bottom: auto;}.diag2 {	position: absolute;	height: auto;	width: 205px;	left: 40px;	top: 665px;	right: 20px;	bottom: auto;}.diag3 {	position: absolute;	height: auto;	width: 205px;	left: 40px;	top: 685px;	right: 20px;	bottom: auto;}.med1 {	position: absolute;	height: auto;	width: 205px;	left: 247px;	top: 645px;	right: 20px;	bottom: auto;}.med2 {	position: absolute;	height: auto;	width: 205px;	left: 247px;	top: 665px;	right: 20px;	bottom: auto;}.med3 {	position: absolute;	height: auto;	width: 205px;	left: 247px;	top: 685px;	right: 20px;	bottom: auto;}.dos1 {	position: absolute;	height: auto;	width: 205px;	left: 482px;	top: 645px;	right: 20px;	bottom: auto;}.dos2 {	position: absolute;	height: auto;	width: 205px;	left: 482px;	top: 665px;	right: 20px;	bottom: auto;}.dos3 {	position: absolute;	height: auto;	width: 205px;	left: 482px;	top: 685px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 99px;	left: 230px;	top: 883px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"q1\">"+$q1+"</div><div class=\"q2\">"+$a2+"</div><div class=\"q3\">"+$q3+"</div><div class=\"q4\">"+$q4+"</div><div class=\"physLim\">"+$physLim+"</div><div class=\"diag1\">"+$diag1+"</div><div class=\"diag2\">"+$diag2+"</div><div class=\"diag3\">"+$diag3+"</div><div class=\"med1\">"+$med1+"</div><div class=\"med2\">"+$med2+"</div><div class=\"med3\">"+$med3+"</div><div class=\"dos1\">"+$dos1+"</div><div class=\"dos2\">"+$dos2+"</div><div class=\"dos3\">"+$dos3+"</div><div class=\"sex\">"+$sex+"</div><div class=\"arson\">"+$arson+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
	 
			File file = new File(printPath+"1/1-Screening & Client Information Page 002.html");//INSERT DIRECTORY HERE
	 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(4-CLIENT%20ADMISSION%20AGREEMENT%20revised%20Page%20001.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 62px;	top: 269px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 408px;	left: 158px;	top: 269px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div><div class=\"patName\">"+$patFirst + $patLast+"</div>";
 
			File file = new File(printPath+"1/4-CLIENT ADMISSION AGREEMENT revised Page 001.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(4-CLIENT%20ADMISSION%20AGREEMENT%20revised%20Page%20004.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 188px;	left: 74px;	top: 224px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div>";
 
			File file = new File(printPath+"1/4-CLIENT ADMISSION AGREEMENT revised Page 002.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(5-Financial%20West%20Slope%20Recovery.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 248px;	left: 126px;	top: 115px;	right: 20px;	bottom: auto;}.patSSN {	position: absolute;	height: auto;	width: 142px;	left: 536px;	top: 117px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 142px;	left: 400px;	top: 890px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"patSSN\">"+$patSSN+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"1/5-Financial West Slope Recovery.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(6-CLIENT%20RIGHTS%20AND%20CONSENT%20to%20TREATMENT.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 382px;	top: 884px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"1/6-CLIENT RIGHTS AND CONSENT to TREATMENT.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(7-The%20Program%20and%20Resident%20Rules%20Page%20001.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 932px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 168px;	top: 900px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"1/7-The Program and Resident Rules Page 001.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(7-The%20Program%20and%20Resident%20Rules%20Page%20002.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 916px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 169px;	top: 900px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"1/7-The Program and Resident Rules Page 002.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(8-Group%20Rules.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 352px;	top: 891px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"1/8-Group Rules.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(9-Hygiene%20Standards.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 945px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 404px;	top: 909px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"1/9-Hygiene Standards.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(10-Fire%20Response%20Plan.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 404px;	top: 918px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"1/10-Fire Response Plan.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(1-UA.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 928px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 395px;	top: 894px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">  <p>"+$clientLog+"</p></div>";
 
			File file = new File(printPath+"2/1-UA.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(2-H.Q%20Page%20002.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 20px;	left: 90px;	top: 1000px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 200px;	left: 133px;	top: 143px;	right: 20px;	bottom: auto;}.patDOB {	position: absolute;	height: auto;	width: 200px;	left: 489px;	top: 143px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 200px;	left: 383px;	top: 856px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"patDOB\">"+$patDOB+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"2/2-H.Q Page 002.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(2-H.Q%20Page%20003.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 383px;	top: 845px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"2/2-H.Q Page 003.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(2-H.Q%20Page%20004.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 385px;	top: 860px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"2/2-H.Q Page 004.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(2-H.Q%20Page%20005.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.patDOB {	position: absolute;	height: auto;	width: 126px;	left: 545px;	top: 111px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 268px;	left: 142px;	top: 111px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 374px;	top: 872px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"patDOB\">"+$patDOB+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"2/2-H.Q Page 005.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(1-ADMISSION%20BOOKKEEPING%20FORM.png);	background-repeat: no-repeat;}.adDate {	position: absolute;	height: auto;	width: 84px;	left: 60px;	top: 141px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 325px;	left: 225px;	top: 141px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 140px;	left: 591px;	top: 140px;	right: 20px;	bottom: auto;}.patAddress {	position: absolute;	height: auto;	width: 646px;	left: 61px;	top: 187px;	right: 20px;	bottom: auto;}.patDOB {	position: absolute;	height: auto;	width: 124px;	left: 59px;	top: 243px;	right: 20px;	bottom: auto;}.patSSN {	position: absolute;	height: auto;	width: 144px;	left: 197px;	top: 243px;	right: 20px;	bottom: auto;}.patPhNum {	position: absolute;	height: auto;	width: 144px;	left: 367px;	top: 243px;	right: 20px;	bottom: auto;}.pat2ndPhNum{	position: absolute;	height: auto;	width: 144px;	left: 549px;	top: 243px;	right: 20px;	bottom: auto;}.patDSM{	position: absolute;	height: auto;	width: 68px;	left: 150px;	top: 308px;	right: 20px;	bottom: auto;}.DSM{	position: absolute;	height: auto;	width: 69px;	left: 150px;	top: 308px;	right: 20px;	bottom: auto;}.patCounselor{	position: absolute;	height: auto;	width: 289px;	left: 338px;	top: 308px;	right: 20px;	bottom: auto;}.payMeth{	position: absolute;	height: auto;	width: 101px;	left: 171px;	top: 352px;	right: 20px;	bottom: auto;}.patCounty{	position: absolute;	height: auto;	width: 183px;	left: 320px;	top: 352px;	right: 20px;	bottom: auto;}.priChar{	position: absolute;	height: auto;	width: 79px;	left: 615px;	top: 352px;	right: 20px;	bottom: auto;}.authDateEnd{	position: absolute;	height: auto;	width: 183px;	left: 396px;	top: 400px;	right: 20px;	bottom: auto;}.authDateStart{	position: absolute;	height: auto;	width: 119px;	left: 214px;	top: 400px;	right: 20px;	bottom: auto;}.end{	position: absolute;	height: auto;	width: 183px;	left: 274px;	top: 451px;	right: 20px;	bottom: auto;}</style><div class=\"adDate\">"+$adDate+"</div><div class=\"patName\">"+$patFirst+$patLast+"</div><div class=\"clientLog\">"+$clientLog+"</div><div class=\"patAddress\">"+$patStreet + $patCity + $ST + $ZIP+"</div><div class=\"patDOB\">"+$patDOB+"</div>	<div class=\"patSSN\">"+$patSSN+"</div>	<div class=\"patPhNum\">"+$patPhNum+"</div>	<div class=\"pat2ndPhNum\">"+$pat2ndPhNum+"</div><div class=\"patCounselor\">"+$patCounselor+"</div><div class=\"patCounty\">"+$patCounty+"</div><div class=\"end\"></div><div class=\"DSM\">"+$DSM+"</div><div class=\"payMeth\">"+$payMeth+"</div><div class=\"priChar\">"+$priChar+"</div><div class=\"authDateStart\">"+$authDateStart+"</div><div class=\"authDateEnd\">"+$authDateEnd+"</div>";
 
			File file = new File(printPath+"3/1-ADMISSION BOOKKEEPING FORM.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(2-CFR%20Statement.png);	background-repeat: no-repeat;}.adDate {	position: absolute;	height: auto;	width: 84px;	left: 398px;	top: 894px;	right: 20px;	bottom: auto;}</style><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"3/2-CFR Statement.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(3-Follow-up%20and%20Consent.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 298px;	left: 82px;	top: 159px;	right: 20px;	bottom: auto;}.patAddress {	position: absolute;	height: auto;	width: 624px;	left: 62px;	top: 717px;	right: 20px;	bottom: auto;}.patPhNum {	position: absolute;	height: auto;	width: 182px;	left: 63px;	top: 773px;	right: 20px;	bottom: auto;}.pat2ndPhNum{	position: absolute;	height: auto;	width: 184px;	left: 275px;	top: 774px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 64px;	left: 151px;	top: 842px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"patAddress\">"+$patStreet + $patCity + $ST + $ZIP+"</div><div class=\"patPhNum\">"+$patPhNum+"</div>	<div class=\"pat2ndPhNum\">"+$pat2ndPhNum+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"3/3-Follow-up and Consent.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(4-AUTHORIZATION%20FOR%20RELEASE%20OF%20PSYCHIATRIC.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 262px;	left: 140px;	top: 109px;	right: 20px;	bottom: auto;}.patDOB {	position: absolute;	height: auto;	width: 124px;	left: 544px;	top: 109px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 96px;	left: 373px;	top: 854px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"patDOB\">"+$patDOB+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"3/4-AUTHORIZATION FOR RELEASE OF PSYCHIATRIC.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(5-Consent%20Doc1.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 950px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 290px;	left: 70px;	top: 261px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div>";
 
			File file = new File(printPath+"3/5-Consent Doc1.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(6-Consent%20Doc2.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 1003px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 284px;	left: 78px;	top: 261px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div>";
 
			File file = new File(printPath+"3/5-Consent Doc2.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(7-Criminal%20Justice%20Release.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 340px;	left: 121px;	top: 178px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div>";
 
			File file = new File(printPath+"3/7-Criminal Justice Release.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(2-RULES%20AND%20RIGHTS%20VIOLATION.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 237px;	top: 917px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 326px;	left: 204px;	top: 369px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div>";
 
			File file = new File(printPath+"4/2-RULES AND RIGHTS VIOLATION.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(2-%201on1%20notes%202.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.weekStart {	position: absolute;	height: auto;	width: 102px;	left: 134px;	top: 276px;	right: 20px;	bottom: auto;}.weekEnd {	position: absolute;	height: auto;	width: 78px;	left: 290px;	top: 276px;	right: 20px;	bottom: auto;}.weekEnd {	position: absolute;	height: auto;	width: 78px;	left: 290px;	top: 276px;	right: 20px;	bottom: auto;}.dateOf {	position: absolute;	height: auto;	width: 64px;	left: 445px;	top: 276px;	right: 20px;	bottom: auto;}.timeStart {	position: absolute;	height: auto;	width: 42px;	left: 557px;	top: 276px;	right: 20px;	bottom: auto;}.timeEnd {	position: absolute;	height: auto;	width: 64px;	left: 631px;	top: 276px;	right: 20px;	bottom: auto;}.indivNote {	position: absolute;	height: 464px;	width: 641px;	left: 67px;	top: 344px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 358px;	left: 99px;	top: 855px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 116px;	left: 559px;	top: 857px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"weekStart\">"+$weekStart+"</div><div class=\"weekEnd\">"+$weekEnd+"</div><div class=\"dateOf\">"+$dateOf+"</div><div class=\"timeStart\">"+$timeS+"</div><div class=\"timeEnd\">"+$timeEnd+"</div><div class=\"indivNote\"><p>"+$indivNote+"</p></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"5/2- 1on1 notes 2.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">@media print{@page {size: landscape}}body {	background-image: url(3-TX%20Plan.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 673px;	top: 691px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 122px;	top: 51px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 228px;	left: 128px;	top: 94px;	right: 20px;	bottom: auto;}.admitDate {	position: absolute;	height: auto;	width: 84px;	left: 548px;	top: 95px;	right: 20px;	bottom: auto;</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"admitDate\">"+$adDate+"</div>";
 
			File file = new File(printPath+"5/3-TX Plan.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(4-DSM%20IV.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 24px;	top: 859px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"5/4-DSM IV.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(6-Phase%20Eval.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 919px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 234px;	left: 198px;	top: 205px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 76px;	left: 384px;	top: 887px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"5/6-Phase Eval.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(7-Phase%20II%20Info.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 230px;	left: 198px;	top: 205px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 78px;	left: 395px;	top: 849px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"5/6-Phase II Info.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(1-Exit%20Bookkeeping.png);	background-repeat: no-repeat;}.exitDate {	position: absolute;	height: auto;	width: 84px;	left: 64px;	top: 174px;	right: 20px;	bottom: auto;}.adDate {	position: absolute;	height: auto;	width: 84px;	left: 187px;	top: 174px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 283px;	left: 298px;	top: 174px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 108px;	left: 591px;	top: 175px;	right: 20px;	bottom: auto;}.patAddress {	position: absolute;	height: auto;	width: 646px;	left: 64px;	top: 222px;	right: 20px;	bottom: auto;}.patDOB {	position: absolute;	height: auto;	width: 124px;	left: 59px;	top: 280px;	right: 20px;	bottom: auto;}.patSSN {	position: absolute;	height: auto;	width: 144px;	left: 197px;	top: 279px;	right: 20px;	bottom: auto;}.patPhNum {	position: absolute;	height: auto;	width: 144px;	left: 373px;	top: 280px;	right: 20px;	bottom: auto;}.pat2ndPhNum{	position: absolute;	height: auto;	width: 144px;	left: 553px;	top: 279px;	right: 20px;	bottom: auto;}.patDSM{	position: absolute;	height: auto;	width: 68px;	left: 150px;	top: 308px;	right: 20px;	bottom: auto;}.patCounselor{	position: absolute;	height: auto;	width: 289px;	left: 395px;	top: 344px;	right: 20px;	bottom: auto;}.patCounty{	position: absolute;	height: auto;	width: 183px;	left: 447px;	top: 387px;	right: 20px;	bottom: auto;}.dsmCode{	position: absolute;	height: auto;	width: 71px;	left: 161px;	top: 343px;	right: 20px;	bottom: auto;}.end{	position: absolute;	height: auto;	width: 183px;	left: 302px;	top: 913px;	right: 20px;	bottom: auto;}.payMeth{	position: absolute;	height: auto;	width: 183px;	left: 295px;	top: 388px;	right: 20px;	bottom: auto;}.owed{	position: absolute;	height: 87px;	width: 635px;	left: 63px;	top: 457px;	right: 20px;	bottom: auto;}</style><div class=\"exitDate\">"+$exitDate+"</div><div class=\"adDate\">"+$adDate+"</div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"clientLog\">"+$clientLog+"</div><div class=\"patAddress\">"+$patStreet + $patCity + $ST + $ZIP+"</div><div class=\"patDOB\">"+$patDOB+"</div>	<div class=\"patSSN\">"+$patSSN+"</div>	<div class=\"patPhNum\">"+$patPhNum+"</div>	<div class=\"pat2ndPhNum\">"+$pat2ndPhNum+"</div><div class=\"patCounselor\">"+$patEndCounselor+"</div><div class=\"end\"></div><div class=\"patCounty\">"+$patCounty+"</div><div class=\"dsmCode\">"+$DSM+"</div><div class=\"payMeth\">"+$payMeth+"</div><div class=\"owed\">"+$owed+"</div>";
 
			File file = new File(printPath+"6/1-Exit Bookkeeping.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(3-Discharge%20Criteria.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 903px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 169px;	top: 884px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"6/3-Discharge Criteria.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(4-Discharge%20Summary%20Page%20001.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 941px;	right: 20px;	bottom: auto;}.adDate {	position: absolute;	height: auto;	width: 84px;	left: 180px;	top: 129px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 410px;	left: 60px;	top: 80px;	right: 20px;	bottom: auto;}.exitDate {	position: absolute;	height: auto;	width: 84px;	left: 526px;	top: 131px;	right: 20px;	bottom: auto;}.treatSum {	position: absolute;	height: 235px;	width: 628px;	left: 76px;	top: 367px;	right: 20px;	bottom: auto;}.treatPlanGoal1 {	position: absolute;	height: auto;	width: 314px;	left: 104px;	top: 665px;	right: 20px;	bottom: auto;}.treatPlanGoal2 {	position: absolute;	height: auto;	width: 314px;	left: 104px;	top: 691px;	right: 20px;	bottom: auto;}.treatPlanGoal3 {	position: absolute;	height: auto;	width: 314px;	left: 104px;	top: 716px;	right: 20px;	bottom: auto;}.treatPlanGoal4 {	position: absolute;	height: auto;	width: 314px;	left: 104px;	top: 742px;	right: 20px;	bottom: auto;}.treatPlanGoal5 {	position: absolute;	height: auto;	width: 314px;	left: 104px;	top: 769px;	right: 20px;	bottom: auto;}.treatPlanGoal6 {	position: absolute;	height: auto;	width: 314px;	left: 104px;	top: 794px;	right: 20px;	bottom: auto;}.treatPlanGoalMet1 {	position: absolute;	height: auto;	width: 274px;	left: 442px;	top: 665px;	right: 20px;	bottom: auto;}.treatPlanGoalMet2 {	position: absolute;	height: auto;	width: 274px;	left: 442px;	top: 691px;	right: 20px;	bottom: auto;}.treatPlanGoalMet3 {	position: absolute;	height: auto;	width: 274px;	left: 442px;	top: 716px;	right: 20px;	bottom: auto;}.treatPlanGoalMet4 {	position: absolute;	height: auto;	width: 274px;	left: 442px;	top: 742px;	right: 20px;	bottom: auto;}.treatPlanGoalMet5 {	position: absolute;	height: auto;	width: 274px;	left: 442px;	top: 769px;	right: 20px;	bottom: auto;}.treatPlanGoalMet6 {	position: absolute;	height: auto;	width: 274px;	left: 442px;	top: 794px;	right: 20px;	bottom: auto;}.curDrugUse {	position: absolute;	height: auto;	width: 656px;	left: 66px;	top: 834px;	right: 20px;	bottom: auto;}.curCrim {	position: absolute;	height: 35px;	width: 654px;	left: 65px;	top: 870px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 130px;	left: 172px;	top: 900px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"adDate\">"+$adDate+"</div><div class=\"exitDate\">"+$exitDate+"</div><div class=\"treatSum\">"+$treatSum+"</div><div class=\"treatPlanGoal1\">"+$treatPlanGoal1+"</div><div class=\"treatPlanGoal2\">"+$treatPlanGoal2+"</div><div class=\"treatPlanGoal3\">"+$treatPlanGoal3+"</div><div class=\"treatPlanGoal4\">"+$treatPlanGoal4+"</div><div class=\"treatPlanGoal5\">"+$treatPlanGoal5+"</div><div class=\"treatPlanGoal6\">"+$treatPlanGoal6+"</div><div class=\"treatPlanGoalMet1\">"+$treatPlanGoalMet1+"</div><div class=\"treatPlanGoalMet2\">"+$treatPlanGoalMet2+"</div><div class=\"treatPlanGoalMet3\">"+$treatPlanGoalMet3+"</div><div class=\"treatPlanGoalMet4\">"+$treatPlanGoalMet4+"</div><div class=\"treatPlanGoalMet5\">"+$treatPlanGoalMet5+"</div><div class=\"treatPlanGoalMet6\">"+$treatPlanGoalMet6+"</div><div class=\"curDrugUse\">"+$curDrugUse+"</div><div class=\"curCrim\">"+$curCrim+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"6/4-Discharge Summary Page 001.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(4-Discharge%20Summary%20Page%20002.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 180px;	width: 298px;	left: 252px;	top: 946px;	right: 20px;	bottom: auto;}.addAxis1 {	position: absolute;	height: auto;	width: 84px;	left: 180px;	top: 257px;	right: 20px;	bottom: auto;}.addAxis2 {	position: absolute;	height: auto;	width: 84px;	left: 180px;	top: 280px;	right: 20px;	bottom: auto;}.addAxis3 {	position: absolute;	height: auto;	width: 84px;	left: 180px;	top: 303px;	right: 20px;	bottom: auto;}.addAxis4 {	position: absolute;	height: auto;	width: 84px;	left: 180px;	top: 326px;	right: 20px;	bottom: auto;}.addAxis5 {	position: absolute;	height: auto;	width: 196px;	left: 180px;	top: 349px;	right: 20px;	bottom: auto;}.disAxis1 {	position: absolute;	height: auto;	width: 84px;	left: 518px;	top: 257px;	right: 20px;	bottom: auto;}.disAxis2 {	position: absolute;	height: auto;	width: 84px;	left: 518px;	top: 280px;	right: 20px;	bottom: auto;}.disAxis3 {	position: absolute;	height: auto;	width: 84px;	left: 518px;	top: 303px;	right: 20px;	bottom: auto;}.disAxis4 {	position: absolute;	height: auto;	width: 84px;	left: 518px;	top: 326px;	right: 20px;	bottom: auto;}.disAxis5 {	position: absolute;	height: auto;	width: 196px;	left: 518px;	top: 349px;	right: 20px;	bottom: auto;}.counRec1 {	position: absolute;	height: 57px;	width: 610px;	left: 88px;	top: 427px;	right: 20px;	bottom: auto;}.counRec2 {	position: absolute;	height: 47px;	width: 610px;	left: 88px;	top: 487px;	right: 20px;	bottom: auto;}.counRec3 {	position: absolute;	height: 45px;	width: 610px;	left: 88px;	top: 537px;	right: 20px;	bottom: auto;}.counRec4 {	position: absolute;	height: 57px;	width: 610px;	left: 88px;	top: 587px;	right: 20px;	bottom: auto;}.shouldReturn {	position: absolute;	height: 33px;	width: 610px;	left: 64px;	top: 677px;	right: 20px;	bottom: auto;}.clientComment {	position: absolute;	height: 69px;	width: 610px;	left: 64px;	top: 727px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: 21px;	width: 120px;	left: 170px;	top: 899px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"addAxis1\">"+$addAxis1+"</div><div class=\"addAxis2\">"+$addAxis2+"</div><div class=\"addAxis3\">"+$addAxis3+"</div><div class=\"addAxis4\">"+$addAxis4+"</div><div class=\"addAxis5\">"+$addAxis5 + $addGAFScore+"</div><div class=\"disAxis1\">"+$disAxis1+"</div><div class=\"disAxis2\">"+$disAxis2+"</div><div class=\"disAxis3\">"+$disAxis3+"</div><div class=\"disAxis4\">"+$disAxis4+"</div><div class=\"disAxis5\">"+$disAxis5 + $addGAFScore+"</div><div class=\"counRec1\">"+$counRec1+"</div><div class=\"counRec2\">"+$counRec2+"</div><div class=\"counRec3\">"+$counRec3+"</div><div class=\"counRec4\">"+$counRec4+"</div><div class=\"shouldReturn\">"+$shouldReturn+"</div><div class=\"clientComment\">"+$clientComment+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"6/4-Discharge Summary Page 002.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(5-Client%20Self%20Evaluation%20and%20Exit%20Plan.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 911px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 178px;	top: 895px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 276px;	left: 326px;	top: 895px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">"+$clientLog+"</div><div class=\"patName\">"+$patFirst + $patLast+"</div>";
 
			File file = new File(printPath+"6/5-Client Self Evaluation and Exit Plan.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(6-Safekeeping%20Agreement.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 954px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 84px;	left: 154px;	top: 903px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"clientLog\">  <p>"+$clientLog+"</p></div>";
 
			File file = new File(printPath+"6/6-Safekeeping Agreement.html");//INSERT DIRECTORY HERE
 
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
	
			String content = "<style type=\"text/css\">body {	background-image: url(7-LINEN%20AGREEMENT.png);	background-repeat: no-repeat;}.end {	position: absolute;	height: 0px;	width: 298px;	left: 252px;	top: 933px;	right: 20px;	bottom: auto;}.patName {	position: absolute;	height: auto;	width: 262px;	left: 76px;	top: 135px;	right: 20px;	bottom: auto;}.clientLog {	position: absolute;	height: auto;	width: 262px;	left: 208px;	top: 893px;	right: 20px;	bottom: auto;}</style><div class=\"end\"></div><div class=\"patName\">"+$patFirst + $patLast+"</div><div class=\"clientLog\">"+$clientLog+"</div>";
 
			File file = new File(printPath+"6/7-LINEN AGREEMENT.html");//INSERT DIRECTORY HERE
 
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
	public void group(){//change name

		try {
	
			String content = "<html xmlns:v=\"urn:schemas-microsoft-com:vml\"xmlns:o=\"urn:schemas-microsoft-com:office:office\"xmlns:w=\"urn:schemas-microsoft-com:office:word\"xmlns:m=\"http://schemas.microsoft.com/office/2004/12/omml\"xmlns=\"http://www.w3.org/TR/REC-html40\"><head><meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\" /><meta name=ProgId content=Word.Document><meta name=Generator content=\"Microsoft Word 14\"><meta name=Originator content=\"Microsoft Word 14\"><link rel=File-List href=\"1-GROUP%20NOTES_files/filelist.xml\"><!--[if gte mso 9]><xml> <o:DocumentProperties>  <o:Author>Olson</o:Author>  <o:LastAuthor>Lai, Joseph</o:LastAuthor>  <o:Revision>14</o:Revision>  <o:TotalTime>933</o:TotalTime>  <o:Created>2014-05-17T05:24:00Z</o:Created>  <o:LastSaved>2014-05-17T17:43:00Z</o:LastSaved>  <o:Pages>2</o:Pages>  <o:Words>174</o:Words>  <o:Characters>995</o:Characters>  <o:Company>ECS - CSUS</o:Company>  <o:Lines>8</o:Lines>  <o:Paragraphs>2</o:Paragraphs>  <o:CharactersWithSpaces>1167</o:CharactersWithSpaces>  <o:Version>14.00</o:Version> </o:DocumentProperties> <o:OfficeDocumentSettings>  <o:RelyOnVML/>  <o:AllowPNG/> </o:OfficeDocumentSettings></xml><![endif]--><link rel=themeData href=\"1-GROUP%20NOTES_files/themedata.thmx\"><link rel=colorSchemeMapping href=\"1-GROUP%20NOTES_files/colorschememapping.xml\"><!--[if gte mso 9]><xml> <w:WordDocument>  <w:View>Print</w:View>  <w:SpellingState>Clean</w:SpellingState>  <w:TrackMoves>false</w:TrackMoves>  <w:TrackFormatting/>  <w:PunctuationKerning/>  <w:ValidateAgainstSchemas/>  <w:SaveIfXMLInvalid>false</w:SaveIfXMLInvalid>  <w:IgnoreMixedContent>false</w:IgnoreMixedContent>  <w:AlwaysShowPlaceholderText>false</w:AlwaysShowPlaceholderText>  <w:DoNotPromoteQF/>  <w:LidThemeOther>EN-US</w:LidThemeOther>  <w:LidThemeAsian>X-NONE</w:LidThemeAsian>  <w:LidThemeComplexScript>X-NONE</w:LidThemeComplexScript>  <w:Compatibility>   <w:BreakWrappedTables/>   <w:SnapToGridInCell/>   <w:WrapTextWithPunct/>   <w:UseAsianBreakRules/>   <w:DontGrowAutofit/>   <w:SplitPgBreakAndParaMark/>  </w:Compatibility>  <w:BrowserLevel>MicrosoftInternetExplorer4</w:BrowserLevel>  <m:mathPr>   <m:mathFont m:val=\"Cambria Math\"/>   <m:brkBin m:val=\"before\"/>   <m:brkBinSub m:val=\"&#45;-\"/>   <m:smallFrac m:val=\"off\"/>   <m:dispDef/>   <m:lMargin m:val=\"0\"/>   <m:rMargin m:val=\"0\"/>   <m:defJc m:val=\"centerGroup\"/>   <m:wrapIndent m:val=\"1440\"/>   <m:intLim m:val=\"subSup\"/>   <m:naryLim m:val=\"undOvr\"/>  </m:mathPr></w:WordDocument></xml><![endif]--><!--[if gte mso 9]><xml> <w:LatentStyles DefLockedState=\"false\" DefUnhideWhenUsed=\"true\"  DefSemiHidden=\"true\" DefQFormat=\"false\" DefPriority=\"99\"  LatentStyleCount=\"267\">  <w:LsdException Locked=\"false\" Priority=\"0\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" QFormat=\"true\" Name=\"Normal\"/>  <w:LsdException Locked=\"false\" Priority=\"9\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" QFormat=\"true\" Name=\"heading 1\"/>  <w:LsdException Locked=\"false\" Priority=\"9\" QFormat=\"true\" Name=\"heading 2\"/>  <w:LsdException Locked=\"false\" Priority=\"9\" QFormat=\"true\" Name=\"heading 3\"/>  <w:LsdException Locked=\"false\" Priority=\"9\" QFormat=\"true\" Name=\"heading 4\"/>  <w:LsdException Locked=\"false\" Priority=\"9\" QFormat=\"true\" Name=\"heading 5\"/>  <w:LsdException Locked=\"false\" Priority=\"9\" QFormat=\"true\" Name=\"heading 6\"/>  <w:LsdException Locked=\"false\" Priority=\"9\" QFormat=\"true\" Name=\"heading 7\"/>  <w:LsdException Locked=\"false\" Priority=\"9\" QFormat=\"true\" Name=\"heading 8\"/>  <w:LsdException Locked=\"false\" Priority=\"9\" QFormat=\"true\" Name=\"heading 9\"/>  <w:LsdException Locked=\"false\" Priority=\"39\" Name=\"toc 1\"/>  <w:LsdException Locked=\"false\" Priority=\"39\" Name=\"toc 2\"/>  <w:LsdException Locked=\"false\" Priority=\"39\" Name=\"toc 3\"/>  <w:LsdException Locked=\"false\" Priority=\"39\" Name=\"toc 4\"/>  <w:LsdException Locked=\"false\" Priority=\"39\" Name=\"toc 5\"/>  <w:LsdException Locked=\"false\" Priority=\"39\" Name=\"toc 6\"/>  <w:LsdException Locked=\"false\" Priority=\"39\" Name=\"toc 7\"/>  <w:LsdException Locked=\"false\" Priority=\"39\" Name=\"toc 8\"/>  <w:LsdException Locked=\"false\" Priority=\"39\" Name=\"toc 9\"/>  <w:LsdException Locked=\"false\" Priority=\"35\" QFormat=\"true\" Name=\"caption\"/>  <w:LsdException Locked=\"false\" Priority=\"10\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" QFormat=\"true\" Name=\"Title\"/>  <w:LsdException Locked=\"false\" Priority=\"1\" Name=\"Default Paragraph Font\"/>  <w:LsdException Locked=\"false\" Priority=\"11\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" QFormat=\"true\" Name=\"Subtitle\"/>  <w:LsdException Locked=\"false\" Priority=\"22\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" QFormat=\"true\" Name=\"Strong\"/>  <w:LsdException Locked=\"false\" Priority=\"20\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" QFormat=\"true\" Name=\"Emphasis\"/>  <w:LsdException Locked=\"false\" Priority=\"59\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Table Grid\"/>  <w:LsdException Locked=\"false\" UnhideWhenUsed=\"false\" Name=\"Placeholder Text\"/>  <w:LsdException Locked=\"false\" Priority=\"1\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" QFormat=\"true\" Name=\"No Spacing\"/>  <w:LsdException Locked=\"false\" Priority=\"60\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light Shading\"/>  <w:LsdException Locked=\"false\" Priority=\"61\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light List\"/>  <w:LsdException Locked=\"false\" Priority=\"62\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light Grid\"/>  <w:LsdException Locked=\"false\" Priority=\"63\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Shading 1\"/>  <w:LsdException Locked=\"false\" Priority=\"64\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Shading 2\"/>  <w:LsdException Locked=\"false\" Priority=\"65\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium List 1\"/>  <w:LsdException Locked=\"false\" Priority=\"66\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium List 2\"/>  <w:LsdException Locked=\"false\" Priority=\"67\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 1\"/>  <w:LsdException Locked=\"false\" Priority=\"68\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 2\"/>  <w:LsdException Locked=\"false\" Priority=\"69\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 3\"/>  <w:LsdException Locked=\"false\" Priority=\"70\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Dark List\"/>  <w:LsdException Locked=\"false\" Priority=\"71\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful Shading\"/>  <w:LsdException Locked=\"false\" Priority=\"72\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful List\"/>  <w:LsdException Locked=\"false\" Priority=\"73\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful Grid\"/>  <w:LsdException Locked=\"false\" Priority=\"60\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light Shading Accent 1\"/>  <w:LsdException Locked=\"false\" Priority=\"61\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light List Accent 1\"/>  <w:LsdException Locked=\"false\" Priority=\"62\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light Grid Accent 1\"/>  <w:LsdException Locked=\"false\" Priority=\"63\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Shading 1 Accent 1\"/>  <w:LsdException Locked=\"false\" Priority=\"64\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Shading 2 Accent 1\"/>  <w:LsdException Locked=\"false\" Priority=\"65\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium List 1 Accent 1\"/>  <w:LsdException Locked=\"false\" UnhideWhenUsed=\"false\" Name=\"Revision\"/>  <w:LsdException Locked=\"false\" Priority=\"34\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" QFormat=\"true\" Name=\"List Paragraph\"/>  <w:LsdException Locked=\"false\" Priority=\"29\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" QFormat=\"true\" Name=\"Quote\"/>  <w:LsdException Locked=\"false\" Priority=\"30\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" QFormat=\"true\" Name=\"Intense Quote\"/>  <w:LsdException Locked=\"false\" Priority=\"66\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium List 2 Accent 1\"/>  <w:LsdException Locked=\"false\" Priority=\"67\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 1 Accent 1\"/>  <w:LsdException Locked=\"false\" Priority=\"68\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 2 Accent 1\"/>  <w:LsdException Locked=\"false\" Priority=\"69\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 3 Accent 1\"/>  <w:LsdException Locked=\"false\" Priority=\"70\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Dark List Accent 1\"/>  <w:LsdException Locked=\"false\" Priority=\"71\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful Shading Accent 1\"/>  <w:LsdException Locked=\"false\" Priority=\"72\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful List Accent 1\"/>  <w:LsdException Locked=\"false\" Priority=\"73\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful Grid Accent 1\"/>  <w:LsdException Locked=\"false\" Priority=\"60\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light Shading Accent 2\"/>  <w:LsdException Locked=\"false\" Priority=\"61\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light List Accent 2\"/>  <w:LsdException Locked=\"false\" Priority=\"62\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light Grid Accent 2\"/>  <w:LsdException Locked=\"false\" Priority=\"63\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Shading 1 Accent 2\"/>  <w:LsdException Locked=\"false\" Priority=\"64\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Shading 2 Accent 2\"/>  <w:LsdException Locked=\"false\" Priority=\"65\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium List 1 Accent 2\"/>  <w:LsdException Locked=\"false\" Priority=\"66\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium List 2 Accent 2\"/>  <w:LsdException Locked=\"false\" Priority=\"67\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 1 Accent 2\"/>  <w:LsdException Locked=\"false\" Priority=\"68\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 2 Accent 2\"/>  <w:LsdException Locked=\"false\" Priority=\"69\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 3 Accent 2\"/>  <w:LsdException Locked=\"false\" Priority=\"70\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Dark List Accent 2\"/>  <w:LsdException Locked=\"false\" Priority=\"71\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful Shading Accent 2\"/>  <w:LsdException Locked=\"false\" Priority=\"72\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful List Accent 2\"/>  <w:LsdException Locked=\"false\" Priority=\"73\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful Grid Accent 2\"/>  <w:LsdException Locked=\"false\" Priority=\"60\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light Shading Accent 3\"/>  <w:LsdException Locked=\"false\" Priority=\"61\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light List Accent 3\"/>  <w:LsdException Locked=\"false\" Priority=\"62\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light Grid Accent 3\"/>  <w:LsdException Locked=\"false\" Priority=\"63\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Shading 1 Accent 3\"/>  <w:LsdException Locked=\"false\" Priority=\"64\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Shading 2 Accent 3\"/>  <w:LsdException Locked=\"false\" Priority=\"65\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium List 1 Accent 3\"/>  <w:LsdException Locked=\"false\" Priority=\"66\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium List 2 Accent 3\"/>  <w:LsdException Locked=\"false\" Priority=\"67\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 1 Accent 3\"/>  <w:LsdException Locked=\"false\" Priority=\"68\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 2 Accent 3\"/>  <w:LsdException Locked=\"false\" Priority=\"69\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 3 Accent 3\"/>  <w:LsdException Locked=\"false\" Priority=\"70\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Dark List Accent 3\"/>  <w:LsdException Locked=\"false\" Priority=\"71\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful Shading Accent 3\"/>  <w:LsdException Locked=\"false\" Priority=\"72\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful List Accent 3\"/>  <w:LsdException Locked=\"false\" Priority=\"73\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful Grid Accent 3\"/>  <w:LsdException Locked=\"false\" Priority=\"60\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light Shading Accent 4\"/>  <w:LsdException Locked=\"false\" Priority=\"61\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light List Accent 4\"/>  <w:LsdException Locked=\"false\" Priority=\"62\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light Grid Accent 4\"/>  <w:LsdException Locked=\"false\" Priority=\"63\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Shading 1 Accent 4\"/>  <w:LsdException Locked=\"false\" Priority=\"64\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Shading 2 Accent 4\"/>  <w:LsdException Locked=\"false\" Priority=\"65\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium List 1 Accent 4\"/>  <w:LsdException Locked=\"false\" Priority=\"66\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium List 2 Accent 4\"/>  <w:LsdException Locked=\"false\" Priority=\"67\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 1 Accent 4\"/>  <w:LsdException Locked=\"false\" Priority=\"68\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 2 Accent 4\"/>  <w:LsdException Locked=\"false\" Priority=\"69\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 3 Accent 4\"/>  <w:LsdException Locked=\"false\" Priority=\"70\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Dark List Accent 4\"/>  <w:LsdException Locked=\"false\" Priority=\"71\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful Shading Accent 4\"/>  <w:LsdException Locked=\"false\" Priority=\"72\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful List Accent 4\"/>  <w:LsdException Locked=\"false\" Priority=\"73\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful Grid Accent 4\"/>  <w:LsdException Locked=\"false\" Priority=\"60\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light Shading Accent 5\"/>  <w:LsdException Locked=\"false\" Priority=\"61\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light List Accent 5\"/>  <w:LsdException Locked=\"false\" Priority=\"62\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light Grid Accent 5\"/>  <w:LsdException Locked=\"false\" Priority=\"63\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Shading 1 Accent 5\"/>  <w:LsdException Locked=\"false\" Priority=\"64\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Shading 2 Accent 5\"/>  <w:LsdException Locked=\"false\" Priority=\"65\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium List 1 Accent 5\"/>  <w:LsdException Locked=\"false\" Priority=\"66\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium List 2 Accent 5\"/>  <w:LsdException Locked=\"false\" Priority=\"67\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 1 Accent 5\"/>  <w:LsdException Locked=\"false\" Priority=\"68\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 2 Accent 5\"/>  <w:LsdException Locked=\"false\" Priority=\"69\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 3 Accent 5\"/>  <w:LsdException Locked=\"false\" Priority=\"70\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Dark List Accent 5\"/>  <w:LsdException Locked=\"false\" Priority=\"71\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful Shading Accent 5\"/>  <w:LsdException Locked=\"false\" Priority=\"72\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful List Accent 5\"/>  <w:LsdException Locked=\"false\" Priority=\"73\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful Grid Accent 5\"/>  <w:LsdException Locked=\"false\" Priority=\"60\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light Shading Accent 6\"/>  <w:LsdException Locked=\"false\" Priority=\"61\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light List Accent 6\"/>  <w:LsdException Locked=\"false\" Priority=\"62\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Light Grid Accent 6\"/>  <w:LsdException Locked=\"false\" Priority=\"63\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Shading 1 Accent 6\"/>  <w:LsdException Locked=\"false\" Priority=\"64\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Shading 2 Accent 6\"/>  <w:LsdException Locked=\"false\" Priority=\"65\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium List 1 Accent 6\"/>  <w:LsdException Locked=\"false\" Priority=\"66\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium List 2 Accent 6\"/>  <w:LsdException Locked=\"false\" Priority=\"67\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 1 Accent 6\"/>  <w:LsdException Locked=\"false\" Priority=\"68\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 2 Accent 6\"/>  <w:LsdException Locked=\"false\" Priority=\"69\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Medium Grid 3 Accent 6\"/>  <w:LsdException Locked=\"false\" Priority=\"70\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Dark List Accent 6\"/>  <w:LsdException Locked=\"false\" Priority=\"71\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful Shading Accent 6\"/>  <w:LsdException Locked=\"false\" Priority=\"72\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful List Accent 6\"/>  <w:LsdException Locked=\"false\" Priority=\"73\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" Name=\"Colorful Grid Accent 6\"/>  <w:LsdException Locked=\"false\" Priority=\"19\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" QFormat=\"true\" Name=\"Subtle Emphasis\"/>  <w:LsdException Locked=\"false\" Priority=\"21\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" QFormat=\"true\" Name=\"Intense Emphasis\"/>  <w:LsdException Locked=\"false\" Priority=\"31\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" QFormat=\"true\" Name=\"Subtle Reference\"/>  <w:LsdException Locked=\"false\" Priority=\"32\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" QFormat=\"true\" Name=\"Intense Reference\"/>  <w:LsdException Locked=\"false\" Priority=\"33\" SemiHidden=\"false\"   UnhideWhenUsed=\"false\" QFormat=\"true\" Name=\"Book Title\"/>  <w:LsdException Locked=\"false\" Priority=\"37\" Name=\"Bibliography\"/>  <w:LsdException Locked=\"false\" Priority=\"39\" QFormat=\"true\" Name=\"TOC Heading\"/> </w:LatentStyles></xml><![endif]--><style><!-- /* Font Definitions */ @font-face	{font-family:\"Cambria Math\";	panose-1:0 0 0 0 0 0 0 0 0 0;	mso-font-charset:1;	mso-generic-font-family:roman;	mso-font-format:other;	mso-font-pitch:variable;	mso-font-signature:0 0 0 0 0 0;}@font-face	{font-family:Calibri;	panose-1:2 15 5 2 2 2 4 3 2 4;	mso-font-charset:0;	mso-generic-font-family:swiss;	mso-font-pitch:variable;	mso-font-signature:-536870145 1073786111 1 0 415 0;} /* Style Definitions */ p.MsoNormal, li.MsoNormal, div.MsoNormal	{	mso-style-unhide:no;	mso-style-qformat:yes;	mso-style-parent:\"\";	margin-top:0in;	margin-right:0in;	margin-bottom:10.0pt;	margin-left:0in;	line-height:normal;	mso-pagination:widow-orphan;	font-size:10pt;	font-family:\"Arial\", \"sans-serif\";	mso-fareast-font-family:Calibri;	mso-fareast-theme-font:minor-latin;}p.MsoHeader, li.MsoHeader, div.MsoHeader	{mso-style-priority:99;	mso-style-link:\"Header Char\";	margin:0in;	margin-bottom:.0001pt;	mso-pagination:widow-orphan;	tab-stops:center 3.25in right 6.5in;	font-size:12.0pt;	font-family:\"Arial\",\"sans-serif\";	mso-fareast-font-family:Calibri;	mso-fareast-theme-font:minor-latin;}p.MsoFooter, li.MsoFooter, div.MsoFooter	{mso-style-priority:99;	mso-style-link:\"Footer Char\";	margin:0in;	margin-bottom:.0001pt;	mso-pagination:widow-orphan;	tab-stops:center 3.25in right 6.5in;	font-size:12.0pt;	font-family:\"Arial\",\"sans-serif\";	mso-fareast-font-family:Calibri;	mso-fareast-theme-font:minor-latin;}span.HeaderChar	{mso-style-name:\"Header Char\";	mso-style-priority:99;	mso-style-unhide:no;	mso-style-locked:yes;	mso-style-link:Header;}span.FooterChar	{mso-style-name:\"Footer Char\";	mso-style-priority:99;	mso-style-unhide:no;	mso-style-locked:yes;	mso-style-link:Footer;}span.SpellE	{mso-style-name:\"\";	mso-spl-e:yes;}.MsoChpDefault	{mso-style-type:export-only;	mso-default-props:yes;	font-size:12.0pt;	mso-ansi-font-size:12.0pt;	mso-bidi-font-size:12.0pt;	font-family:\"Arial\",\"sans-serif\";	mso-ascii-font-family:Arial;	mso-fareast-font-family:Calibri;	mso-fareast-theme-font:minor-latin;	mso-hansi-font-family:Arial;	mso-bidi-font-family:Arial;} /* Page Definitions */ @page	{mso-footnote-separator:url(\"1-GROUP%20NOTES_files/header.html\") fs;	mso-footnote-continuation-separator:url(\"1-GROUP%20NOTES_files/header.html\") fcs;	mso-endnote-separator:url(\"1-GROUP%20NOTES_files/header.html\") es;	mso-endnote-continuation-separator:url(\"1-GROUP%20NOTES_files/header.html\") ecs;}@page WordSection1	{size:8.5in 11.0in;	margin:.7in .5in .5in .5in;	mso-header-margin:.5in;	mso-footer-margin:.5in;	mso-even-header:url(\"1-GROUP%20NOTES_files/header.html\") eh1;	mso-header:url(\"1-GROUP%20NOTES_files/header.html\") h1;	mso-even-footer:url(\"1-GROUP%20NOTES_files/header.html\") ef1;	mso-footer:url(\"1-GROUP%20NOTES_files/header.html\") f1;	mso-first-header:url(\"1-GROUP%20NOTES_files/header.html\") fh1;	mso-first-footer:url(\"1-GROUP%20NOTES_files/header.html\") ff1;	mso-paper-source:0;}div.WordSection1	{page:WordSection1;}@page WordSection2	{size:8.5in 11.0in;	margin:.7in .5in .5in .5in;	mso-header-margin:.5in;	mso-footer-margin:.5in;	mso-even-header:url(\"1-GROUP%20NOTES_files/header.html\") eh1;	mso-header:url(\"1-GROUP%20NOTES_files/header.html\") h1;	mso-even-footer:url(\"1-GROUP%20NOTES_files/header.html\") ef1;	mso-footer:url(\"1-GROUP%20NOTES_files/header.html\") f1;	mso-first-header:url(\"1-GROUP%20NOTES_files/header.html\") fh1;	mso-first-footer:url(\"1-GROUP%20NOTES_files/header.html\") ff1;	mso-paper-source:0;}div.WordSection2	{page:WordSection2;}@page WordSection3	{size:8.5in 11.0in;	margin:.7in .5in .5in .5in;	mso-header-margin:.5in;	mso-footer-margin:.5in;	mso-even-header:url(\"1-GROUP%20NOTES_files/header.html\") eh1;	mso-header:url(\"1-GROUP%20NOTES_files/header.html\") h1;	mso-even-footer:url(\"1-GROUP%20NOTES_files/header.html\") ef1;	mso-footer:url(\"1-GROUP%20NOTES_files/header.html\") f1;	mso-first-header:url(\"1-GROUP%20NOTES_files/header.html\") fh1;	mso-first-footer:url(\"1-GROUP%20NOTES_files/header.html\") ff1;	mso-paper-source:0;}div.WordSection3	{page:WordSection3;}-->.notesGoHere {	font-family: Verdana, Geneva, sans-serif;}</style><!--[if gte mso 10]><style> /* Style Definitions */ table.MsoNormalTable	{mso-style-name:\"Table Normal\";	mso-tstyle-rowband-size:0;	mso-tstyle-colband-size:0;	mso-style-noshow:yes;	mso-style-priority:99;	mso-style-parent:\"\";	mso-padding-alt:0in 5.4pt 0in 5.4pt;	mso-para-margin:0in;	mso-para-margin-bottom:.0001pt;	mso-pagination:widow-orphan;	font-size:12.0pt;	font-family:\"Arial\",\"sans-serif\";}table.MsoTableGrid	{mso-style-name:\"Table Grid\";	mso-tstyle-rowband-size:0;	mso-tstyle-colband-size:0;	mso-style-priority:59;	mso-style-unhide:no;	border:solid black 1.0pt;	mso-border-themecolor:text1;	mso-border-alt:solid black .5pt;	mso-border-themecolor:text1;	mso-padding-alt:0in 5.4pt 0in 5.4pt;	mso-border-insideh:.5pt solid black;	mso-border-insideh-themecolor:text1;	mso-border-insidev:.5pt solid black;	mso-border-insidev-themecolor:text1;	mso-para-margin:0in;	mso-para-margin-bottom:.0001pt;	mso-pagination:widow-orphan;	font-size:12.0pt;	font-family:\"Arial\",\"sans-serif\";}table.MsoTableMediumList2	{mso-style-name:\"Medium List 2\";	mso-tstyle-rowband-size:1;	mso-tstyle-colband-size:1;	mso-style-priority:66;	mso-style-unhide:no;	border:solid black 1.0pt;	mso-border-themecolor:text1;	mso-padding-alt:0in 5.4pt 0in 5.4pt;	mso-para-margin:0in;	mso-para-margin-bottom:.0001pt;	mso-pagination:widow-orphan;	font-size:12.0pt;	font-family:\"Cambria\",\"serif\";	mso-ascii-font-family:Cambria;	mso-ascii-theme-font:major-latin;	mso-fareast-font-family:\"Times New Roman\";	mso-fareast-theme-font:major-fareast;	mso-hansi-font-family:Cambria;	mso-hansi-theme-font:major-latin;	mso-bidi-font-family:\"Times New Roman\";	mso-bidi-theme-font:major-bidi;	color:black;	mso-themecolor:text1;}table.MsoTableMediumList2FirstRow	{mso-style-name:\"Medium List 2\";	mso-table-condition:first-row;	mso-style-priority:66;	mso-style-unhide:no;	mso-tstyle-shading:white;	mso-tstyle-shading-themecolor:background1;	mso-tstyle-border-top:cell-none;	mso-tstyle-border-left:cell-none;	mso-tstyle-border-bottom:3.0pt solid black;	mso-tstyle-border-bottom-themecolor:text1;	mso-tstyle-border-right:cell-none;	mso-tstyle-border-insideh:cell-none;	mso-tstyle-border-insidev:cell-none;	font-size:12.0pt;	mso-ansi-font-size:12.0pt;	mso-bidi-font-size:12.0pt;}table.MsoTableMediumList2LastRow	{mso-style-name:\"Medium List 2\";	mso-table-condition:last-row;	mso-style-priority:66;	mso-style-unhide:no;	mso-tstyle-shading:white;	mso-tstyle-shading-themecolor:background1;	mso-tstyle-border-top:1.0pt solid black;	mso-tstyle-border-top-themecolor:text1;	mso-tstyle-border-left:cell-none;	mso-tstyle-border-bottom:cell-none;	mso-tstyle-border-right:cell-none;	mso-tstyle-border-insideh:cell-none;	mso-tstyle-border-insidev:cell-none;}table.MsoTableMediumList2FirstCol	{mso-style-name:\"Medium List 2\";	mso-table-condition:first-column;	mso-style-priority:66;	mso-style-unhide:no;	mso-tstyle-shading:white;	mso-tstyle-shading-themecolor:background1;	mso-tstyle-border-top:cell-none;	mso-tstyle-border-left:cell-none;	mso-tstyle-border-bottom:cell-none;	mso-tstyle-border-right:1.0pt solid black;	mso-tstyle-border-right-themecolor:text1;	mso-tstyle-border-insideh:cell-none;	mso-tstyle-border-insidev:cell-none;}table.MsoTableMediumList2LastCol	{mso-style-name:\"Medium List 2\";	mso-table-condition:last-column;	mso-style-priority:66;	mso-style-unhide:no;	mso-tstyle-shading:white;	mso-tstyle-shading-themecolor:background1;	mso-tstyle-border-top:cell-none;	mso-tstyle-border-left:1.0pt solid black;	mso-tstyle-border-left-themecolor:text1;	mso-tstyle-border-bottom:cell-none;	mso-tstyle-border-right:cell-none;	mso-tstyle-border-insideh:cell-none;	mso-tstyle-border-insidev:cell-none;}table.MsoTableMediumList2OddColumn	{mso-style-name:\"Medium List 2\";	mso-table-condition:odd-column;	mso-style-priority:66;	mso-style-unhide:no;	mso-tstyle-shading:silver;	mso-tstyle-shading-themecolor:text1;	mso-tstyle-shading-themetint:63;	mso-tstyle-border-left:cell-none;	mso-tstyle-border-right:cell-none;	mso-tstyle-border-insideh:cell-none;	mso-tstyle-border-insidev:cell-none;}table.MsoTableMediumList2OddRow	{mso-style-name:\"Medium List 2\";	mso-table-condition:odd-row;	mso-style-priority:66;	mso-style-unhide:no;	mso-tstyle-shading:silver;	mso-tstyle-shading-themecolor:text1;	mso-tstyle-shading-themetint:63;	mso-tstyle-border-top:cell-none;	mso-tstyle-border-bottom:cell-none;	mso-tstyle-border-insideh:cell-none;	mso-tstyle-border-insidev:cell-none;}table.MsoTableMediumList2NWCell	{mso-style-name:\"Medium List 2\";	mso-table-condition:nw-cell;	mso-style-priority:66;	mso-style-unhide:no;	mso-tstyle-shading:white;	mso-tstyle-shading-themecolor:background1;}table.MsoTableMediumList2SWCell	{mso-style-name:\"Medium List 2\";	mso-table-condition:sw-cell;	mso-style-priority:66;	mso-style-unhide:no;	mso-tstyle-border-top:cell-none;}</style><![endif]--><!--[if gte mso 9]><xml> <o:shapedefaults v:ext=\"edit\" spidmax=\"1026\"/></xml><![endif]--><!--[if gte mso 9]><xml> <o:shapelayout v:ext=\"edit\">  <o:idmap v:ext=\"edit\" data=\"1\"/> </o:shapelayout></xml><![endif]--></head><body lang=EN-US style='tab-interval:.5in'><div class=WordSection1><p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;text-align:center;line-height:normal'><span style='font-size:16.0pt'>GROUPNOTES<o:p></o:p></span></p><p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;text-align:center;line-height:normal'><span style='font-size:8.0pt'><o:p>&nbsp;</o:p></span></p><div align=center><table class=MsoTableGrid border=1 cellspacing=0 cellpadding=0 style='border-collapse:collapse;border:none;mso-border-alt:solid black .5pt; mso-border-themecolor:text1;mso-yfti-tbllook:1184;mso-padding-alt:0in 5.4pt 0in 5.4pt'> <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes'>  <td width=734 valign=top style='width:7.65in;border:double windowtext 1.5pt;  border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:text1;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Monday </span>Kick-Off/Time<span  style='font-size:14.0pt'><span style='mso-spacerun:yes'>             </span></span><span  style='font-size:8.0pt'>"+$monStart+" AM</span><span style='font-size:14.0pt'> </span>to<span  style='font-size:14.0pt'><span style='mso-spacerun:yes'>              </span></span><span  style='font-size:8.0pt'>"+$monEnd+" AM -</span>Topic <span style='font-size:14.0pt'>  <o:p></o:p>  </span>"+$monTop+"</p>  </td> </tr> <tr style='mso-yfti-irow:1;height:34.15pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:34.15pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'>  <o:p>"+$monNote1 + $counID1+"</o:p></p><div align=\"left\"></div>  </td> </tr> <tr style='mso-yfti-irow:2'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Monday  A.M.</span> Time 10 00<span style='font-size:8.0pt'>AM</span> to 12 00<span  style='font-size:8.0pt'>PM</span> - Topic "+$monAMTop+"<span style='font-size:14.0pt'>  <o:p></o:p></span></p>  </td> </tr> <tr style='mso-yfti-irow:3;height:53.5pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:53.5pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'>"+$monNote2+"<span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\"> + "+$counID2+"</span></p>  </td> </tr> <tr style='mso-yfti-irow:4'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Monday  P.M. </span>Time 2 00<span style='font-size:8.0pt'>PM</span> to 4 00<span  style='font-size:8.0pt'>PM</span> - Topic <span style='font-size:14.0pt'><o:p></o:p>  </span>"+$monPMTop+"</p>  </td> </tr> <tr style='mso-yfti-irow:5;height:49.9pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:49.9pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'>"+$mondayNotes + $counID3+"</span></p>  </td> </tr> <tr style='mso-yfti-irow:6'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'><p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Tuesday </span><span  style='mso-spacerun:yes'> </span>Kick-Off/Time<span style='font-size:14.0pt'><span  style='mso-spacerun:yes'>             </span></span><span style='font-size:  8.0pt'>"+$tuesStart+" AM</span> to <span  style='font-size:14.0pt'><span style='mso-spacerun:yes'>             </span></span><span  style='font-size:8.0pt'>"+$tuesEnd+" AM -</span>Topic "+$tuesTop+" <span style='font-size:14.0pt'>  <o:p></o:p>  </span></p>  </td> </tr> <tr style='mso-yfti-irow:7;height:35.5pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:35.5pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'>"+$tuesNote1 + $counID4+"</p>  </td> </tr> <tr style='mso-yfti-irow:8'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Tuesday  A.M. </span>Time 10 00<span style='font-size:8.0pt'>AM</span> to 12 00<span  style='font-size:8.0pt'>PM</span> - Topic "+$tuesAMTop+"<span style='font-size:14.0pt'>  <o:p></o:p>  </span></p></td> </tr> <tr style='mso-yfti-irow:9;height:49.0pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:49.0pt'><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\">"+$tuesNote2 + $counID5+"</span></td> </tr> <tr style='mso-yfti-irow:10'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Tuesday  P.M. </span>Time 2 00<span style='font-size:8.0pt'>PM</span> to 4 00<span  style='font-size:8.0pt'>PM</span> - Topic "+$tuesPMTop+"<span style='font-size:14.0pt'>  <o:p></o:p></span></p>  </td> </tr> <tr style='mso-yfti-irow:11;height:49.9pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:49.9pt'><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\">"+$tuesNote4 + $counID6+"</span></td> </tr> <tr style='mso-yfti-irow:12'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Wednesday</span>  Kick-Off/Time<span style='font-size:14.0pt'><span  style='mso-spacerun:yes'>              </span></span><span style='font-size:  8.0pt'>"+$wedStart+" AM</span><span style='font-size:14.0pt'> </span>to<span  style='font-size:14.0pt'><span style='mso-spacerun:yes'>              </span></span><span  style='font-size:8.0pt'><span style=\"font-size:  8.0pt\">"+$wedEnd+"</span> AM -</span>Topic "+$wedTop+"<span style='font-size:14.0pt'>  <o:p></o:p>  </span></p></td> </tr> <tr style='mso-yfti-irow:13;height:31.0pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:31.0pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\">"+$wedNote1 +$counID7+"</span></p></td> </tr> <tr style='mso-yfti-irow:14'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Wednesday  A.M. </span>Time 10 00<span style='font-size:8.0pt'>AM</span> to 12 00<span  style='font-size:8.0pt'>PM</span> - Topic "+$wedAMTop+" <span style='font-size:14.0pt'>  <o:p></o:p></span></p>  </td> </tr> <tr style='mso-yfti-irow:15;height:49.9pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:49.9pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\">"+$tuesNote2 + $counID8+"</span></p></td> </tr> <tr style='mso-yfti-irow:16'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Wednesday  P.M. </span>Time 2 00<span style='font-size:8.0pt'>PM</span> to 4 00<span  style='font-size:8.0pt'>PM</span> – Topic "+$wedPMTop+"<span style='font-size:14.0pt'>  <o:p></o:p></span></p>  </td> </tr> <tr style='mso-yfti-irow:17;mso-yfti-lastrow:yes;height:49.0pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:49.0pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\">"+$tuesNote3 + $counID9+"</span></p></td> </tr></table></div></div><span style='font-size:12.0pt;line-height:115%;font-family:\"Arial\",\"sans-serif\";mso-fareast-font-family:Calibri;mso-fareast-theme-font:minor-latin;mso-ansi-language:EN-US;mso-fareast-language:EN-US;mso-bidi-language:AR-SA'><br clear=allstyle='page-break-before:auto;mso-break-type:section-break'></span><p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;text-align:center'>  <o:p></o:p></p><div class=WordSection3>    <div align=center><table class=MsoTableGrid border=0 cellspacing=0 cellpadding=0 width=525 style='width:393.8pt;border-collapse:collapse;border:none;mso-yfti-tbllook: 1184;mso-padding-alt:0in 5.4pt 0in 5.4pt;mso-border-insideh:none;mso-border-insidev: none'> <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;height:21.75pt'>  <td width=263 valign=top style='width:196.9pt;border:none;border-bottom:solid windowtext 1.0pt;  mso-border-bottom-alt:solid windowtext .5pt;padding:0in 5.4pt 0in 5.4pt;  height:21.75pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:center'><o:p>&nbsp;</o:p></p>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:center'>"+$patFirst + $patLast + $clientLog+"</td>  <td width=263 valign=top style='width:196.9pt;border:none;border-bottom:solid windowtext 1.0pt;  mso-border-bottom-alt:solid windowtext .5pt;padding:0in 5.4pt 0in 5.4pt;  height:21.75pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:center'>  <o:p>&nbsp;</o:p></p>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:center'>"+$weekOf+"</td> </tr> <tr style='mso-yfti-irow:1;mso-yfti-lastrow:yes;height:21.75pt'>  <td width=263 valign=top style='width:196.9pt;border:none;mso-border-top-alt:  solid windowtext .5pt;padding:0in 5.4pt 0in 5.4pt;height:21.75pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:center'><b style='mso-bidi-font-weight:normal'><span  style='font-size:10.0pt;line-height:115%'>CLIENT NAME &amp; LOG        <o:p></o:p></span></b></p>  </td>  <td width=263 valign=top style='width:196.9pt;border:none;mso-border-top-alt:  solid windowtext .5pt;padding:0in 5.4pt 0in 5.4pt;height:21.75pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:center'><b style='mso-bidi-font-weight:normal'><span  style='font-size:10.0pt;line-height:115%'>WEEK OF<o:p></o:p></span></b></p>  </td> </tr></table></div><p class=MsoNormal style='margin-bottom:0in;margin-bottom:.0001pt'><o:p>&nbsp;</o:p></p></div><p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;text-align:center;line-height:normal'><span style='font-size:16.0pt'>GROUPNOTES<o:p></o:p></span></p><div align=center><table class=MsoTableGrid border=1 cellspacing=0 cellpadding=0 style='border-collapse:collapse;border:none;mso-border-alt:solid black .5pt; mso-border-themecolor:text1;mso-yfti-tbllook:1184;mso-padding-alt:0in 5.4pt 0in 5.4pt'> <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes'>  <td width=734 valign=top style='width:7.65in;border:double windowtext 1.5pt;  border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:text1;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Thursday</span><span  style='mso-spacerun:yes'>  </span>Kick-Off/Time<span style='font-size:14.0pt'><span  style='mso-spacerun:yes'>             </span></span><span style='font-size:  8.0pt'>"+$thursStart+" AM</span><span style='font-size:14.0pt'> </span>to<span  style='font-size:14.0pt'><span style='mso-spacerun:yes'>              </span></span><span  style='font-size:8.0pt'><span style=\"font-size:  8.0pt\">"+$thursEnd+" </span>AM -</span>Topic "+$thursTop+"<b style='mso-bidi-font-weight:normal'><span  style='font-size:14.0pt'>    <o:p></o:p></span></b></p>  </td> </tr> <tr style='mso-yfti-irow:1;height:35.5pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:35.5pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\">"+$thursNote1 + $counID10+"</span></p>  </td> </tr> <tr style='mso-yfti-irow:2'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Thursday  A.M. </span>Time 10 00<span style='font-size:8.0pt'>AM</span> to 12 00<span  style='font-size:8.0pt'>PM</span> - Topic "+$thursAMTop+"<b style='mso-bidi-font-weight:  normal'><span style='font-size:14.0pt'>  <o:p></o:p></span></b></p>  </td> </tr> <tr style='mso-yfti-irow:3;height:49.0pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:49.0pt'><p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\"><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\">"+$thursNote2 + $counID11+"</span></span></p>  </td> </tr> <tr style='mso-yfti-irow:4'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Thursday  P.M. </span>Time 2 00<span style='font-size:8.0pt'>PM</span> to 4 00<span  style='font-size:8.0pt'>PM</span> - Topic "+$thursPMTop+"<b style='mso-bidi-font-weight:  normal'><span style='font-size:14.0pt'>  <o:p></o:p></span></b></p>  </td> </tr> <tr style='mso-yfti-irow:5;height:45.4pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:45.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\"><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\">"+$thursNote3 + $counID12+"</span></span></p></td> </tr> <tr style='mso-yfti-irow:6'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Friday </span><span  style='mso-spacerun:yes'> </span>Kick-Off/Time<span style='font-size:14.0pt'><span  style='mso-spacerun:yes'>             </span></span><span style='font-size:  8.0pt'>"+$friStart+" AM</span> to <span  style='font-size:14.0pt'><span style='mso-spacerun:yes'>             </span></span><span  style='font-size:8.0pt'><span style=\"font-size:  8.0pt\">"+$friEnd+" </span>AM -</span>Topic "+$friTop+"<b style='mso-bidi-font-weight:normal'><span  style='font-size:14.0pt'>  <o:p></o:p></span></b></p>  </td> </tr> <tr style='mso-yfti-irow:7;height:31.0pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:31.0pt'><p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\"><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\">"+$friNote1 + $counID13+"</span></span></p></td> </tr> <tr style='mso-yfti-irow:8'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Friday  A.M. </span>Time 10 00<span style='font-size:8.0pt'>AM</span> to 12 00<span  style='font-size:8.0pt'>PM</span> - Topic "+$friAMTop+"<b style='mso-bidi-font-weight:  normal'><span style='font-size:14.0pt'>  <o:p></o:p></span></b></p>  </td> </tr> <tr style='mso-yfti-irow:9;height:49.0pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:49.0pt'><p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\"><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\"><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\">"+$friNote2 + $counID14+"</span></span></span></p></td> </tr> <tr style='mso-yfti-irow:10'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Friday  P.M. </span>Time 2 00<span style='font-size:8.0pt'>PM</span> to 4 00<span  style='font-size:8.0pt'>PM</span> - Topic "+$friPMTop+"<b style='mso-bidi-font-weight:  normal'><span style='font-size:14.0pt'>  <o:p></o:p></span></b></p>  </td> </tr> <tr style='mso-yfti-irow:11;height:49.9pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:49.9pt'><p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\"><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\"><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\">"+$friNote3 + $counID15+"</span></span></span></p></td> </tr> <tr style='mso-yfti-irow:12'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Saturday  </span><span style='mso-spacerun:yes'> </span>Kick-Off/Time <span  style='font-size:14.0pt'><span style='mso-spacerun:yes'>            </span></span><span  style='font-size:8.0pt'>"+$satStart+" AM</span> to <span  style='font-size:14.0pt'></span><span  style='font-size:8.0pt'>"+$satEnd+" AM -</span>Topic satTop<b style='mso-bidi-font-weight:normal'><span  style='font-size:14.0pt'>  <o:p></o:p></span></b></p>  </td> </tr> <tr style='mso-yfti-irow:13;height:35.5pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:35.5pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\"><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\"><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\">"+$satNote1 + $counID16+"</span></span></span></p></td> </tr> <tr style='mso-yfti-irow:14'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Saturday  A.M. </span>Time 10 00<span style='font-size:8.0pt'>AM</span> to 12 00<span  style='font-size:8.0pt'>PM</span> - Topic <b style='mso-bidi-font-weight:  normal'><span style='font-size:14.0pt'><o:p></o:p>  </span></b>"+$satAMTop+"</p>  </td> </tr> <tr style='mso-yfti-irow:15;height:31.9pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:31.9pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\"><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\"><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\"><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\">"+$satNote2+"</span></span></span></span> + "+$counID17+"</p></td> </tr> <tr style='mso-yfti-irow:16'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span style='font-size:14.0pt'>Sunday </span>Time<span  style='font-size:14.0pt'><span style='mso-spacerun:yes'></span></span> "+$sunStart+" to "+$sunEnd+"<span style='font-size:14.0pt'><span  style='mso-spacerun:yes'>                </span></span><span  style='font-size:8.0pt'><span style='mso-spacerun:yes'> </span></span>Topic <b  style='mso-bidi-font-weight:normal'><span style='font-size:14.0pt'>  <o:p></o:p>  </span></b>"+$sunTop+"</p>  </td> </tr> <tr style='mso-yfti-irow:17;height:31.0pt'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt;  height:31.0pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal'><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\"><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\"><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\"><span class=\"MsoNormal\" style=\"margin-bottom:0in;margin-bottom:.0001pt;  text-align:left;line-height:normal\">"+$sunNote1 + $counID18+"</span></span></span></span></p></td> </tr> <tr style='mso-yfti-irow:18'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:double windowtext 1.5pt;  mso-border-alt:double windowtext 1.5pt;mso-border-bottom-alt:solid black .5pt;  mso-border-bottom-themecolor:text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:center;line-height:normal'>Day<span style='font-size:14.0pt'><span  style='mso-spacerun:yes'>                      </span></span>Time<span  style='font-size:14.0pt'><span style='mso-spacerun:yes'>                 </span></span>to<span style='font-size:14.0pt'><span  style='mso-spacerun:yes'>                </span></span><span  style='font-size:8.0pt'><span style='mso-spacerun:yes'> </span>(<span  class=SpellE>Wkly</span> Pick-up)</span><span style='font-size:10.0pt'><span  style='mso-spacerun:yes'>  </span>Topic </span><b style='mso-bidi-font-weight:  normal'><span style='font-size:14.0pt'><o:p></o:p></span></b></p>  </td> </tr> <tr style='mso-yfti-irow:19'>  <td width=734 valign=top style='width:7.65in;border-top:none;border-left:  double windowtext 1.5pt;border-bottom:solid black 1.0pt;mso-border-bottom-themecolor:  text1;border-right:double windowtext 1.5pt;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-top-alt:solid black .5pt;  mso-border-top-themecolor:text1;mso-border-left-alt:double windowtext 1.5pt;  mso-border-bottom-alt:solid black .5pt;mso-border-bottom-themecolor:text1;  mso-border-right-alt:double windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:center;line-height:normal'><b style='mso-bidi-font-weight:normal'><span  style='font-size:14.0pt'><o:p>&nbsp;</o:p></span></b></p>  </td> </tr> <tr style='mso-yfti-irow:20;mso-yfti-lastrow:yes'>  <td width=734 valign=top style='width:7.65in;border:double windowtext 1.5pt;  border-top:none;mso-border-top-alt:solid black .5pt;mso-border-top-themecolor:  text1;padding:0in 5.4pt 0in 5.4pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:center;line-height:normal'><b style='mso-bidi-font-weight:normal'><span  style='font-size:14.0pt'><o:p>&nbsp;</o:p></span></b></p>  </td> </tr></table></div></div><div class=WordSection3>    <div align=center><table class=MsoTableGrid border=0 cellspacing=0 cellpadding=0 width=525 style='width:393.8pt;border-collapse:collapse;border:none;mso-yfti-tbllook: 1184;mso-padding-alt:0in 5.4pt 0in 5.4pt;mso-border-insideh:none;mso-border-insidev: none'> <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;height:21.75pt'>  <td width=263 valign=top style='width:196.9pt;border:none;border-bottom:solid windowtext 1.0pt;  mso-border-bottom-alt:solid windowtext .5pt;padding:0in 5.4pt 0in 5.4pt;  height:21.75pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:center'><o:p>&nbsp;</o:p></p>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:center'>"+$patFirst + $patLast +    $clientLog+"</td>  <td width=263 valign=top style='width:196.9pt;border:none;border-bottom:solid windowtext 1.0pt;  mso-border-bottom-alt:solid windowtext .5pt;padding:0in 5.4pt 0in 5.4pt;  height:21.75pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:center'>  <o:p>&nbsp;</o:p></p>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:center'>"+$weekOf+"</td> </tr> <tr style='mso-yfti-irow:1;mso-yfti-lastrow:yes;height:21.75pt'>  <td width=263 valign=top style='width:196.9pt;border:none;mso-border-top-alt:  solid windowtext .5pt;padding:0in 5.4pt 0in 5.4pt;height:21.75pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:center'><b style='mso-bidi-font-weight:normal'><span  style='font-size:10.0pt;line-height:115%'>CLIENT NAME &amp; LOG        <o:p></o:p></span></b></p>  </td>  <td width=263 valign=top style='width:196.9pt;border:none;mso-border-top-alt:  solid windowtext .5pt;padding:0in 5.4pt 0in 5.4pt;height:21.75pt'>  <p class=MsoNormal align=center style='margin-bottom:0in;margin-bottom:.0001pt;  text-align:center'><b style='mso-bidi-font-weight:normal'><span  style='font-size:10.0pt;line-height:115%'>WEEK OF<o:p></o:p></span></b></p>  </td> </tr></table></div><p class=MsoNormal style='margin-bottom:0in;margin-bottom:.0001pt'><o:p>&nbsp;</o:p></p></div></body></html>";
 
			File file = new File(printPath+"5/1-GROUP NOTES.html");//INSERT DIRECTORY HERE
 
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
		
}