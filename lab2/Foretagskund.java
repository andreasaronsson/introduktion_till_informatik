/*
 *  Metoder för klassen i lab2
 *  Andreas Aronsson, ik01-46 den 22 oktober 2001
 */

import java.util.*;

public class Foretagskund {

    private int kundNr;
    private int boxNr;
    private String foretagsNamn;

    public Foretagskund (int nyttKundNr, String nyttForetagsNamn, int nyttBoxNr) {
	kundNr=nyttKundNr;
	foretagsNamn=nyttForetagsNamn;
	boxNr=nyttBoxNr;
    }

    public Foretagskund() {}

    public Foretagskund(String aLine) {
	StringTokenizer sT = new StringTokenizer(aLine);
	kundNr=Integer.parseInt(sT.nextToken());
	foretagsNamn=sT.nextToken();
	boxNr=Integer.parseInt(sT.nextToken());
    }

    public int getKundNr() {
	return kundNr;
    }

    public int getBoxNr() {
	return boxNr;
    }

    public String getForetagsNamn() {
	return foretagsNamn;
    }

    public String getHela() {
	return kundNr + " " + foretagsNamn + " " + boxNr;
    }


    public void setKundNr(int nyttKundNr) {
	kundNr=nyttKundNr;
    }

    public void setForetagsNamn(String nyttForetagsNamn) {
	foretagsNamn=nyttForetagsNamn;
    }

    public void setBoxNr(int nyttBoxNr) {
	boxNr=nyttBoxNr;
    }

    public void skrivUt() {
        System.out.println(kundNr  +"\t" + foretagsNamn + "\t" + boxNr);
    }   

}//slut Foretagskund
