/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packethiding;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.awt.*;
import java.io.*;
import static java.lang.System.exit;
import java.math.BigInteger;
import java.net.*;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.*;
import javax.swing.JOptionPane;
/**
 *
 * @author priyanka
 */
public class Source extends javax.swing.JFrame {

    
    public byte filebyte[]=new byte[100000];
	public int filint[];
	public String filstr[];
	public String filmer[];
	public String filtfr[];
        public byte eebyte[][];
	public String filsep[][];	
	public String filorg[];
	public char pakch[][];
	public char shufch[][];
	String Dest1,Dest2;
	public int ch;
        
       public SecretKey theKey ;
       public BigInteger N,e;
        
       public byte[] keyy;
	Socket st;
	int i,j,k,l;
        byte[] skey = new byte[1000];
	String skeyString;
	static byte[] raw;
       public static String tt2[];
	String inputMessage,encryptedData[],decryptedMessage[];
	public static int flen;
       public static byte tt[][],ttd[][];
        public static SecretKey myDesKey;
        public static Cipher desCipher;
    public Source() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SOURCE ");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Open Source File");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Channel Encoding");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Interleaving");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Encrypt Text");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Send Packets");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Receive public key");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Encrypt Key");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Send Key");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jLabel3.setText("Status Information:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if (k!=5)
		{
			String msg="Load The File and then Start Channel Encoding";
			JOptionPane op=new JOptionPane();
			op.showMessageDialog(op,msg)	;
		}
		else
		{
			k=10;
		System.out.println("\n************************Channel Encoding Started****************");
		
		//Conversion of Byte to Binary
		
		jTextArea1.append("\n\n   Channel Encoding Started");
		System.out.println(flen);
		for(i=0;i<flen;i++)
		{
			
			filint[i]=(int)filebyte[i];
			System.out.println("Int Value : ["+i+"] = "+filint[i]);
			filstr[i] = Integer.toBinaryString(filint[i]);
			
		}
			
		//Printing Binary Values of Each Character
		for(i=0;i<flen;i++)
		{
			
			System.out.println(filstr[i]);
			try
				{
					//Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}
		
		//Separation of each binary values in to 2Dimensional String array
		for(i=0;i<flen;i++)
		{
			for(j=0;j<filstr[i].length();j++)
			{
				
				filsep[i][j]=Character.toString(filstr[i].charAt(j));
			}
		}
               // System.out.println("1....");
                //Printing This values
		/*for(i=0;i<flen;i++)
		{
			for(j=0;j<filstr[i].length();j++)
			{
				System.out.print(filsep[i][j]+" ");
			}
			System.out.print("\n");
			try
				{
					//Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}

		*/
            /*     System.out.println("3....");
		//Printing This values
		for(i=0;i<flen;i++)
		{
			for(j=0;j<filstr[i].length();j++)
			{
				System.out.print(filsep[i][j]+" ");
			}
			System.out.print("\n");
			try
				{
					Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}
*/
		//Adding redundant Data to the Binary values
		for(i=0;i<flen;i++)
		{
			for(j=0;j<filstr[i].length();j++)
			{
				
				filsep[i][j]=filsep[i][j]+filsep[i][j]+filsep[i][j];
			}
		}
		//Printing the values
                System.out.println("Add Redundant Bits:");
		for(i=0;i<flen;i++)
		{
			for(j=0;j<filstr[i].length();j++)
			{
				System.out.print(filsep[i][j]+" ");
			}
			System.out.print("\n");
			try
				{
					//Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}
 
             /*   System.out.println("2....");
                 //Printing This values
		for(i=0;i<flen;i++)
		{
			for(j=0;j<filstr[i].length();j++)
			{
				System.out.print(filsep[i][j]+" ");
			}
			System.out.print("\n");
			try
				{
					//Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}

                */
//Merging for Interleaving
                System.out.println("Merging for Interleaving");
		for(i=0;i<flen;i++)
		{
			filmer[i]="";
			for(j=0;j<filstr[i].length();j++)
			{
				filmer[i]+=filsep[i][j];
			}
		}
		
		//Printing the values
		for(i=0;i<flen;i++)
		{
			
			System.out.println(filmer[i]+" ");
			try
				{
					Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
			
		}System.out.println("\n************************Channel Encoding Completed****************");
		jTextArea1.append("\n\n   Channel Encoding Completed");
		}
		
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (k!=10)
		{
			String msg="Load The File, Complete the Channel Encoding and then Start Interleaving";
			JOptionPane op=new JOptionPane();
			op.showMessageDialog(op,msg)	;
		}
		else
		{
			k=15;
		jTextArea1.append("\n\n   Interleaving Process Started");
		System.out.println("\n***********************Interleaving Started**************");
		
		//Seperating the String for Interleaving
		
		for(i=0;i<flen;i++)
		{
			for(j=0;j<filmer[i].length();j++)
			{
				pakch[i][j]=filmer[i].charAt(j);
			}
		}
		//Printing the values
		/*for(i=0;i<flen;i++)
		{
			for(j=0;j<filmer[i].length();j++)
			{
				System.out.print(pakch[i][j]+" ");
			}
			System.out.print("\n");
			try
				{
					//Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}
*/
		
		for(i=0;i<flen;i++)
		{
			for(j=0;j<1;j++)
			{
				if((filmer[i].length())==21)
				{
				shufch[i][0]=pakch[i][5];
				shufch[i][1]=pakch[i][12];
				shufch[i][2]=pakch[i][11];
				shufch[i][3]=pakch[i][9];
				shufch[i][4]=pakch[i][6];
				shufch[i][5]=pakch[i][10];
				shufch[i][6]=pakch[i][8];
				shufch[i][7]=pakch[i][20];
				shufch[i][8]=pakch[i][0];
				shufch[i][9]=pakch[i][4];
				shufch[i][10]=pakch[i][1];
				shufch[i][11]=pakch[i][19];
				shufch[i][12]=pakch[i][13];
				shufch[i][13]=pakch[i][7];
				shufch[i][14]=pakch[i][16];
				shufch[i][15]=pakch[i][3];
				shufch[i][16]=pakch[i][17];
				shufch[i][17]=pakch[i][15];
				shufch[i][18]=pakch[i][2];
				shufch[i][19]=pakch[i][18];
				shufch[i][20]=pakch[i][14];
				}
				else if((filmer[i].length())==18)
				{
				shufch[i][0]=pakch[i][5];
				shufch[i][1]=pakch[i][12];
				shufch[i][2]=pakch[i][11];
				shufch[i][3]=pakch[i][9];
				shufch[i][4]=pakch[i][6];
				shufch[i][5]=pakch[i][10];
				shufch[i][6]=pakch[i][8];
				shufch[i][7]=pakch[i][0];
				shufch[i][8]=pakch[i][4];
				shufch[i][9]=pakch[i][1];
				shufch[i][10]=pakch[i][15];
				shufch[i][11]=pakch[i][7];
				shufch[i][12]=pakch[i][16];
				shufch[i][13]=pakch[i][3];
				shufch[i][14]=pakch[i][17];
				shufch[i][15]=pakch[i][13];
				shufch[i][16]=pakch[i][2];
				shufch[i][17]=pakch[i][14];
				}
				else
				{
				shufch[i][0]=pakch[i][5];
				shufch[i][1]=pakch[i][11];
				shufch[i][2]=pakch[i][10];
				shufch[i][3]=pakch[i][9];
				shufch[i][4]=pakch[i][6];
				shufch[i][5]=pakch[i][2];
				shufch[i][6]=pakch[i][8];
				shufch[i][7]=pakch[i][0];
				shufch[i][8]=pakch[i][4];
				shufch[i][9]=pakch[i][1];
				shufch[i][10]=pakch[i][3];
				shufch[i][11]=pakch[i][7];
				}

			}
		}
		//Bottle neck
		
		if(flen<=50)
			{
			l=(int)(Math.random()*3);
			for(int a=0;a<=3;a+=l)
				{
				j=(int)(Math.random()*10);
				shufch[a][j]='\0';
				}
			}
			else if(flen>=51&&flen<=210)
			{
				l=(int)(Math.random()*4);
				for(int a=31;a<=10;a+=l)
				{
				j=(int)(Math.random()*10);
				shufch[a][j]='\0';
				}
			}
			else if(flen>=251&&flen<=500)
			{
				l=(int)(Math.random()*4);
				for(int a=110;a<=192;a+=l)
				{
				j=(int)(Math.random()*10);
				shufch[a][j]='\0';
				}
			}
			else if(flen>=501&&flen<=750)
			{
				l=(int)(Math.random()*4);
				for(int a=440;a<=501;a+=l)
				{
				j=(int)(Math.random()*10);
				shufch[a][j]='\0';
				}
			}
			else if(flen>=751&&flen<=1000)
			{
				l=(int)(Math.random()*4);
				for(int a=652;a<=751;a+=l)
				{
				j=(int)(Math.random()*10);
				shufch[a][j]='\0';
				}
			}
			else 
			{
				l=(int)(Math.random()*4);
				for(int a=500;a<=610;a+=l)
				{
				j=(int)(Math.random()*10);
				shufch[a][j]='\0';
				}
			}

		//Printing the values
		for(i=0;i<flen;i++)
		{
			for(j=0;j<filmer[i].length();j++)
			{
				System.out.print(shufch[i][j]+" ");
			}
			System.out.print("\n");
			try
				{
					//Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}
		//Merging for Transfering
		System.out.println("After Interleaving:");
		for(i=0;i<flen;i++)
		{
			filtfr[i]="";
			for(j=0;j<filmer[i].length();j++)
			{
				filtfr[i]+=shufch[i][j];
			}
		}
		for(i=0;i<flen;i++)
		{
			
			System.out.println("Packet ["+i+"] = "+filtfr[i]);
			try
			{
				//Thread.sleep(2);
			}
			catch (Exception er)
			{
				System.out.println("Sleep Disturbed : "+er);
			}
			
		}
		System.out.println("\n********************Interleaving Completed**************");
		jTextArea1.append("\n\n   Interleaving Process Completed");
		}

		
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           k=5;
           System.out.println("File Loaded");
           try {
               
               FileDialog fd=new FileDialog(this, "Open", FileDialog.LOAD);
               fd.show();
               FileInputStream fis=new FileInputStream(fd.getDirectory()+fd.getFile());
               File f = new File(fd.getDirectory()+fd.getFile());
               jTextField1.setText(fd.getDirectory()+fd.getFile());
               fis.read(filebyte);
               flen=(int)f.length();
               jTextArea1.setText("\n File Loaded");
               filint=new int[flen];			
               filstr=new String[flen];
		encryptedData=new String[flen];	
                eebyte=new byte[flen][1000];
               filmer=new String[flen];
	       filtfr=new String[flen];
	       filsep=new String[flen][100];
		filorg=new String[flen];
		pakch=new char[flen+25][100];
		shufch=new char[flen+25][100];
                tt2=new String[flen];
            
        } catch (Exception e) {
            System.out.println(e);
        }
                 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       System.out.println("\nBrowse For File");
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        
        try
    {

         tt=new byte[flen][1000];
      byte[] encryptKey = "This is a test DESede key".getBytes();
      DESedeKeySpec spec = new DESedeKeySpec(encryptKey);
      SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
       theKey = keyFactory.generateSecret(spec);
      Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
      IvParameterSpec IvParameters = new IvParameterSpec(
        new byte[] { 12, 34, 56, 78, 90, 87, 65, 43 });
      cipher.init(Cipher.ENCRYPT_MODE, theKey, IvParameters);
      
             for(i=0;i<flen;i++)
		{
      byte[] plaintext =filtfr[i].getBytes();
      byte[] encrypted = cipher.doFinal(plaintext);
      tt[i]=encrypted;
                }
              System.out.println("After Encryption and Padding"); 
      for(i=0;i<flen;i++)
		{
                System.out.println(Arrays.toString(tt[i])); 
                }
             
             String s1=Base64.encode(tt[0]);
             int len=s1.length();
             char tt1[][]=new char[flen][len];
             
             
             
     //Permutation
             for(i=0;i<flen;i++)
             {
                 String s=Base64.encode(tt[i]);
                 for(j=0;j<len;j++)
                 {
                     tt1[i][j]=s.charAt(j);
                 }
             }
             char t;
            for(i=0;i<(len-3);i++)
             {
                if(i%2==0){
               t=tt1[0][i];    
               for(j=0;j<flen-1;j++)
                {
                    tt1[j][i]=tt1[j+1][i];
          
                    }tt1[flen-1][i]=t;
                }
               else
               { t=tt1[flen-1][i];    
                 for(j=flen-1;j>0;j--)
                 {
                      tt1[j][i]=tt1[j-1][i];
          
                     }tt1[0][i]=t;
            
        }
    }
          for(i=0;i<flen;i++)
             {
                 String s="";
                 for(j=0;j<len;j++)
                 {
                     s=s+tt1[i][j];
                 }
                 tt2[i]=s;
             }    
           
          System.out.println("After Permutation"); 
      for(i=0;i<flen;i++)
		{
                System.out.println("Packet["+i+"]="+tt2[i]); 
                }
             
    }
    catch (Exception exc)
    {
      exc.printStackTrace();
    }
        
        
        jTextArea1.append("\n\n   Packets Encyption Complete");
       // jTextArea1.append("\n\n   Key Encyption Started");
       // jTextArea1.append("\n\n   Key Encyption Complete");
    }//GEN-LAST:event_jButton4ActionPerformed

   
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.out.println("\nExit");
		Runtime.getRuntime().exit(1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            
         if (k!=15)
		{
			final ImageIcon icon = new ImageIcon("attack.png");
			JOptionPane op=new JOptionPane();
            op.showMessageDialog(null, "Complete the Channel Encoding, Interleaving and then Send the Packets", "Alert Message", JOptionPane.INFORMATION_MESSAGE, icon);

			//String msg="Complete the Channel Encoding, Interleaving and then Send the Packets";
			//JOptionPane op=new JOptionPane();
			//op.showMessageDialog(op,msg)	;
		}
		else
		{
                    jTextArea1.append("\n\n   Sending Key to Destination");
                    
		jTextArea1.append("\n\n   Sending Packets to Destination");
		System.out.println("\nSending Packets Started");
		// TODO: Add any handling code here
		System.out.println(N);
                System.out.println(e);
                System.out.println(theKey.toString());
		try
		{
                    
                  
				Dest1="localhost";
				//FileInputStream fis1=new FileInputStream("QueueAddress.txt");
				//while((ch=fis1.read())!=-1)
				//Dest1+=(char)ch;
				//Dest1.trim();
                               
                                 FileOutputStream out = new FileOutputStream("encrypted.dat");
                              
                                out.close();
				st=new Socket(Dest1,4500);
				DataOutputStream dos=new DataOutputStream(st.getOutputStream());
                              
				dos.writeInt(flen);
                                
				//dos.writeUTF("Dest2");	
                                dos.writeUTF(Arrays.toString(keyy));
				
                                for(i=0;i<flen;i++)
				{
                                    System.out.println(Base64.encode(tt[i]));
				dos.writeUTF(tt2[i]);
				}
                                
				dos.close();
				
			
		}
		catch (Exception er)
		{
			System.out.println(er);
		}
		jTextArea1.append("\n\n   Packets Sent to Destination");
		System.out.println("\nSending Packets Completed");
		}

        
        
        
        
        
        
        
        
        
        
 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        ServerSocket ss;
	Socket so;
        try
		{
			 ss=new ServerSocket(4505);
			while(true)
			{
				so=ss.accept();
				System.out.println("**************Public key is Arriving *********");
				jTextArea1.setText("\n   Key Recieving Started");
				DataInputStream dis=new DataInputStream(so.getInputStream());
				int fillen=dis.readInt();
				
				//jTextField1.setText("//Destination 2/Result2.txt");
                                
                                
				
				//System.out.println("fillen : "+fillen);
                                
                                
				 
					String N1=dis.readUTF();
                                        String e1=dis.readUTF();
                                        //tt[i]=Base64.decode(filtfr[i]);
					//System.out.println("Packet : [key] = "+N1);
                                       // System.out.println("Packet : [key] = "+e1);
					//Thread.sleep(25);
				 
                                  N=new BigInteger(N1);
                                  e=new BigInteger(e1);
                                 //N = N.add(BigInteger.valueOf(Long.parseLong(N1)));
                                 //e=e.add(BigInteger.valueOf(Long.parseLong(e1)));
                                 System.out.println("Packet : [key] = "+N);
                                        System.out.println("Packet : [key] = "+e);
				System.out.println("**********key Recieved From The Source***********");
				
				jTextArea1.append("\n\n   key Received");
				//System.out.println("fillen : "+fillen);
                                break;
			}
		}
		catch (Exception er)
		{
			System.out.println(er);
		}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        
        //  String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
                    
                    
                    byte[] keyBytes = theKey.toString().getBytes(); 
                   // String algorithm = theKey.getAlgorithm();
                    //String kb=Arrays.toString(keyBytes);
                    //String kb1=algorithm+" "+kb;
                   String p="Priyanka";
                    keyy = (new BigInteger(keyBytes)).modPow(e, N).toByteArray();
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Source.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Source.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Source.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Source.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Source().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}