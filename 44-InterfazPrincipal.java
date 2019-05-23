import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
	private JmenuBar mb;
	private JMenu menuOpciones,menuCalcular,menuAcercaDe,menuColorFondo;
	private JMenuItem miCalculo,miRojo,miNegro,miMorado,miElCreador,miSalir,miNuevo;
	private JLabel labelLogo,labelBienvenido,labelTitle,labelNombre,labelAPaterno,labelAMaterno,
					labelDepartamento,labelAntiguedad,labelResultado,labelFooter;
	private JTextField txtNombreTrabajador,txtAPaternoTrabajador,txtAMaternoTrabajador;
	private JComboBox comboDepartamento,comboAntiguedad;
	private JScrollPane scrollPane1;
	private JTextArea textArea1;

	public Principal(){
		setLayout(null);
		setTitle("Pantalla Principal");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

		mb=new JMenuBar();
		ms.setBackground(new Color(255,0,0));
		setJBMenuBar(mb);

		menuOpciones=new JMenu("Opciones");
		menuOpciones.setBackground(new Color(255,0,0));
		menuOpciones.setFont(new Font("Andale Mono",1,14));
		menuOpciones.setForeground(new Color(255,255,255));
		mb.add(menuOpciones);

		menuCalcular=new JMenu("Calcular");
		menuCalcular.setBackground(new Color(255,0,0));
		menuCalcular.setFont(new Font("Andale Mono",1,14));
		menuCalcular.setForeground(new Color(255,255,255));
		mb.add(menuCalcular);

		menuAcercaDe=new JMenu("Acerca de");
	}
}