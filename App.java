package com.bhaskar.ds.dtw;

public class App {
	
	public void digitToWord(Integer digit){
		Saved saved = new Saved();
		//Block 1. Base Case
		if(digit==1||digit==2||digit==3||digit==4||digit==5||digit==6||digit==7||digit==8||digit==9||digit==10||
				digit==11||digit==12||digit==13||digit==14||digit==15||digit==16||digit==17||digit==18||digit==19||digit==20||
						digit==30||digit==40||digit==50||digit==60||digit==70||digit==80||digit==90||digit==100||digit==1000||digit==100000){
			saved.getSaved(digit);
		}//Block 2
		else if(digit>20 && digit<100){
										//Suppose digit is 25
			digitToWord((digit/10)*10);	//Print word 'Twenty' (Tens' value). It will come from Base Case
			digitToWord(digit%10);		//Print word 'Five'. It will come from Base Case
		}//Block 3
		else if(digit>=100 && digit<1000){
										//Suppose digit is 525
			digitToWord(digit/100);		//Print word 'Five' here (Hundreds' value)
			digitToWord(100);			//Print word 'Hundred'
			digitToWord(digit%100);		//Print 'Twenty Five'. It will recursively go back to block 2
		}//Block 4
		else if(digit>=1000 && digit<100000){
										//Suppose digit is 18,525
			digitToWord(digit/1000);	//Print word 'Eighteen' here (Thosand's value)
			digitToWord(1000);			//Print word 'Thousand'
			digitToWord(digit%1000);	//Print 'Five Hundred Twenty Five'. It will recursively go back to block 3
		}//Block 4
		else if(digit>=1000 && digit<100000){
										//Suppose digit is 18,525
			digitToWord(digit/1000);	//Print word 'Eighteen' here (Thosand's value)
			digitToWord(1000);			//Print word 'Thousand'
			digitToWord(digit%1000);	//Print 'Five Hundred Twenty Five'. It will recursively go back to block 3
		}//Block 5
		else if(digit>=100000 && digit<10000000){
										//Suppose digit is 98,18,525
			digitToWord(digit/100000);	//Print word 'Ninety Eight' here (Lakh's value)
			digitToWord(100000);		//Print word 'Lakh'
			digitToWord(digit%100000);	//Print 'Eighteen Thousand Five Hundred Twenty Five'. It will recursively go back to block 4
		}
		}

	public static void main(String[] args) {
		App app = new App();
		app.digitToWord(9818526);
	}

}
