import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
/**
  * En klass som �r en panel och vilken vi d�rmed kan placera
  * ut komponenter i. Vi anv�nder oss av GridBagLayout, vilken
  * ger oss en stor frihet.
  * Klassen �rver fr�n JPanel och �r d�rmed en panel (container)
  * Klassen ing�r i en lite st�rre struktur tillsammans med 
  * PersonVector och Person.
  * 
  * @author Aron&Franz
  */
public class KvittoPanel extends JPanel {

    private JLabel v�lkommen, summa, pk, datum;
    private JButton avbrytKnapp;
    private JTextArea k�pTA;
    private JScrollPane k�pSP; 

    public KvittoPanel
	(VaruValActionListener lyssnare, K�p[] k�pArray) {

	Locale.setDefault(new Locale("sv","SE"));
	Date today = new Date(); // h�mtar nuvarande tidpunkt
	DateFormat df = DateFormat.getDateTimeInstance
	    (DateFormat.MEDIUM, DateFormat.SHORT);
	NumberFormat r=NumberFormat.getCurrencyInstance();
	//	r.setMaximumFractionDigits(2);
	//r.setMinimumFractionDigits(2);

	pk=new JLabel("pk01-14, pk01-26  AA, FH");
	datum=new JLabel(df.format(today));
        v�lkommen= new JLabel("Kal's Livs");
	k�pTA=new JTextArea(5, 30);
	k�pSP=new JScrollPane(k�pTA);
        avbrytKnapp = new JButton("St�ng");
	double attBetala=0;
	int antalVaror=0;
	r.format(attBetala);
	for (int i=0;i<k�pArray.length;i++)
	    if (k�pArray[i]!=null) {
		attBetala=attBetala
                            +k�pArray[i].getUtMgd()*k�pArray[i].getAPris();
		antalVaror=(int)(antalVaror+k�pArray[i].getUtMgd());
		k�pTA.append(k�pArray[i].getVaruNamn()+"\n"
                          +k�pArray[i].getUtMgd()
			  +" � "+r.format(k�pArray[i].getAPris())+"\t   "
		    +r.format(k�pArray[i].getUtMgd()*k�pArray[i].getAPris())
                     +"\n");
	    }
	summa=new JLabel ("Att betala:  "+r.format(attBetala)+"  Varav moms:  "
			  +r.format((attBetala/28)*3));
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
	k�pSP.setVerticalScrollBarPolicy(k�pSP.VERTICAL_SCROLLBAR_ALWAYS);

	gbc.gridwidth=3;
        gbc.ipadx=2;
        gbc.gridx=0;
        gbc.insets=new Insets(0,2,0,2);
        add(v�lkommen, gbc);

	gbc.gridy=1;
	add(pk, gbc);

	gbc.gridy=2;
	add(datum, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets=new Insets(0,3,0,0);

	gbc.gridwidth=3;
	gbc.gridx=0;
	gbc.gridy=3;
	add(k�pSP, gbc);

	gbc.gridwidth=1;
	gbc.gridx=0;
	gbc.gridy=4;
	add(summa, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx=0;
        gbc.gridy=5;
        add(avbrytKnapp, gbc);

        avbrytKnapp.setActionCommand("avbryt kvitto");
        avbrytKnapp.addActionListener(lyssnare);
        lyssnare.setKvittoPanel(this);
    }

}
