/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimulacionBD;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class Cuadrados_Medios {
	
	public static void main(String[]args) {
		frame s = new frame();
		//s.Metodo_Mixto();
		s.pack();
		s.setVisible(true);
		s.setResizable(true);
		s.setLocationRelativeTo(null);
		
		
		
		
//		double ago;
//		int ceros=(int) Math.pow(2001, 2);
//		int deci=(int) Math.pow(10, 8);
//		String p=ceros+"";
//		ago=(ceros*1.0)/deci;
//		System.out.println(ceros+" tiene de longitud "+p.length());
//		p=ago+"";
//		System.out.println(ago+" tiene de longitud "+p.length());
//		//p=p.substring(0);
//		p=p.substring(2);
//		System.out.println(p+" tiene de longitud "+p.length());
//		
//		p=p.substring(0,6);
//		p=p.substring(2);
//		
//		
//		System.out.println(p+" tiene de longitud "+p.length());
		
	}
	
}


class frame extends JFrame{
	DefaultTableModel dft;
	String numeroale[];
	String semillas[];
	String potencias[];
	JTable table ;
	char c;
	String matriz[][];
	JTextArea area;
	int numero_Calcular, Rsemi;
	String numal;
	public frame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Simulador venta de tambores miel");
		setLayout(new BorderLayout());
		
        JPanel Panel_Superior = new JPanel(new FlowLayout());
		
		JLabel Numeros_Calcular1 = new JLabel("Numeros a calcular:");
		Panel_Superior.add(Numeros_Calcular1);
		TextField Numeros_Calcular = new TextField(10);
		Numeros_Calcular.addKeyListener(new KeyListener(){// este metodo hace que solo me acepte hasta cierto numeros que yo decida
			public void keyTyped(KeyEvent e)
			{
				c=e.getKeyChar();
				if(Character.isLetter(c)) {// este metodo hace que solo acepete numeros,getToolkit().beep(); esta madre hace que suene		              
		              e.consume();
		          }
				if (Numeros_Calcular.getText().length()== 4)// el cuatro es que solo acepeta4
			     e.consume();
			}
			public void keyPressed(KeyEvent arg0) {
			}
			public void keyReleased(KeyEvent arg0) {
			}
			});
		Panel_Superior.add(Numeros_Calcular);
		
		
		JLabel Semilla1 = new JLabel("Semilla(xn):");
		Panel_Superior.add(Semilla1);
		TextField Semilla = new TextField(10);
		Semilla.addKeyListener(new KeyListener(){// este metodo hace que solo me acepte hasta cierto numeros que yo decida
			public void keyTyped(KeyEvent e)
			{
				c=e.getKeyChar();
				if(Character.isLetter(c)) {// este metodo hace que solo acepete numeros,getToolkit().beep(); esta madre hace que suene		              
		              e.consume();
		          }
				if (Semilla.getText().length()== 4)// el cuatro es que solo acepeta4
			     e.consume();
			}
			public void keyPressed(KeyEvent arg0) {
			}
			public void keyReleased(KeyEvent arg0) {
			}
			});
		Panel_Superior.add(Semilla);
		
        JButton Calcular_Valores = new JButton("SIMULAR");
		Panel_Superior.add(Calcular_Valores);
		
		
		
		add(Panel_Superior,BorderLayout.NORTH);
		JTable table = new JTable();
		JScrollPane scrollPane = new JScrollPane(table);
		
		String[] cabeceratabla = new String[3];
		cabeceratabla[0]="dias";
//		cabeceratabla[1]="semillas";
//		cabeceratabla[2]="potencia";
//		cabeceratabla[3]="resultado";
		cabeceratabla[1]="dinero";
		cabeceratabla[2]="kilos";
		
		dft = new DefaultTableModel(null,cabeceratabla);
		table.setModel(dft);
		
		area = new JTextArea(5,5);
		JScrollPane scrolarea = new JScrollPane (area);
		area.setOpaque(false);
		area.setEnabled(true);
		
		Calcular_Valores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//System.out.println("sirve?");
				 int ban1=0;
				area.setText("");
				for(int i=table.getRowCount()-1;i>=0;i--) {
					dft.removeRow(i);
					}
					try {
					numero_Calcular=Integer.parseInt(Numeros_Calcular.getText());
					Rsemi= Integer.parseInt(Semilla.getText());
					ban1=1;
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Llene todos los datos", "Error", JOptionPane.ERROR_MESSAGE);
				
					ban1=0;
				}
					 semillas = new String [numero_Calcular];
					 numeroale = new String [numero_Calcular];
					 matriz = new String [numero_Calcular][5];
			
				if(ban1==1) {
					for(int i=0;i<numero_Calcular;i++) {
						cuadrados(i);
						for(int k=0;k<i;k++) {
							if(numeroale[i].equals(numeroale[k])) {
							JOptionPane.showMessageDialog(null,"se repite el numero "+numeroale[i]+" en las posiciones ("+i+","+k+")");
							area.append("se repite el numero "+numeroale[i]+" en las posiciones ("+i+","+k+")"+"\n");
							String nuevo=JOptionPane.showInputDialog("Escriba la semilla a modificada (Nota: la semilla es: "+semillas[i]+")");
							
							Rsemi=Integer.parseInt(nuevo);
							area.append("Se cambio la semilla "+semillas[i]+" a "+Rsemi+" en la posicion "+i+"\n");
							cuadrados(i);
							
								
								
							}
						}
						
					}
					//System.out.println("hola");
				}
				
				for(int j=0;j<numero_Calcular;j++) {
					dft.addRow(matriz[j]);					
				}
				
				area.append("Gasto Mensual $"+ pinchesuma());
				JOptionPane.showMessageDialog(null, "Gasto Mensual $"+ pinchesuma());
	    }});
		
        add(scrolarea,BorderLayout.SOUTH);
		
		add(scrollPane,BorderLayout.CENTER);
	}
	
	public void cuadrados(int p) {
//		cabeceratabla[0]="n";
//		cabeceratabla[1]="semillas";
//		cabeceratabla[2]="potencia";
//		cabeceratabla[3]="resultado";
//		cabeceratabla[4]="#aleatorio";
		
		
		matriz[p][0]=p+"";
		
		matriz[p][1]=Rsemi+"";
		semillas[p]=Rsemi+"";
		
		int potencia=(int) Math.pow(Rsemi, 2);
		matriz[p][2]=resultado(potencia);
		
		matriz[p][1]=numal;
		numeroale[p]=numal;
		matriz[p][4]="."+numal;
		DecimalFormat formato1 = new DecimalFormat("#.00");
		
		matriz[p][2]=(formato1.format(Double.parseDouble(numal)/44))+"";
		Rsemi=Integer.parseInt(numal);
		
	}
	
	public String resultado(int potencia) {
		String p=potencia+"";
		
		if(p.length()==8) {
			String aux1,aux2,aux3;
    	 	
	    	aux1=p.substring(2);
	    	//System.out.println(aux1+" la cadena aux1");
	    	
	    	aux2=aux1.substring(0,4);
	    	//System.out.println(aux2+" la cadena aux2");
	    	
	    	aux3=aux1.substring(4);
	    	//System.out.println(aux3+" la cadena aux3");
	    	
	    	aux1=p.substring(0,2);
	    	//System.out.println(aux1+" la cadena aux1");
	    	
	    	//System.out.println("el resultado es "+aux1+"-"+aux2+"-"+aux3);
	    	p=aux1+"-"+aux2+"-"+aux3;
	    	numal=aux2;
			
		}
		if(p.length()==7) {
			
			String aux1,aux2,aux3;
	    	
	    	aux1=p.substring(1);
	    	//System.out.println(aux1+" la cadena aux1");
	    	
	    	aux2=aux1.substring(0,4);
	    	//System.out.println(aux2+" la cadena aux2");
	    	
	    	aux3=aux1.substring(4);
	    	//System.out.println(aux3+" la cadena aux3");
	    	
	    	aux1="0"+p.substring(0,1);
	    	//System.out.println(aux1+" la cadena aux1");
	    	
	    	//System.out.println("el resultado es "+aux1+"-"+aux2+"-"+aux3);
			p=aux1+"-"+aux2+"-"+aux3;
			numal=aux2;
		}
		
		if(p.length()==6) {
			String aux1,aux2,aux3;
        	
	        aux1=p.substring(1);
	    	//System.out.println(aux1+" la cadena aux1");
	    	
	        aux2=aux1.substring(0,4);
	    	//System.out.println(aux2+" la cadena aux2");
	    	
	    	aux3=aux1.substring(4);
	    	//System.out.println(aux3+" la cadena aux3");
	       
	        aux1=p.substring(0,1);
	    	//System.out.println(aux1+" la cadena aux1");	
	    		
	    	//System.out.println("el resultado es "+aux1+"-"+aux2+"-"+aux3);
	    	p=aux1+"-"+aux2+"-"+aux3;
			numal=aux2;
		}
		if(p.length()==5) {
			String aux1,aux2,aux3;
	    	p="0"+p;
	    	aux1=p.substring(1);
	    	//System.out.println(aux1+" la cadena aux1");
	    	
	    	aux2=aux1.substring(0,4);
	    	//System.out.println(aux2+" la cadena aux2");
	    	
	    	aux3=aux1.substring(4);
	    	//System.out.println(aux3+" la cadena aux3");
	    	
	    	aux1=p.substring(0,1);
	    	//System.out.println(aux1+" la cadena aux1");
	    	
	    	//System.out.println("el resultado es "+aux1+"-"+aux2+"-"+aux3);
	    	p=aux1+"-"+aux2+"-"+aux3;
	    	numal=aux2;
		}
		
		if(p.length()==4) {
			numal=p;
		}
		
		return p;
	}
	 public int pinchesuma() {
		 int suma=0;
		
		 for(int i =0;i<numero_Calcular;i++) {
		 suma=suma+Integer.parseInt(matriz[i][1]);
		// System.out.println(matriz[i][1]);
		 }
		 return suma;
	 }
	
}