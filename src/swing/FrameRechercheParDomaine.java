package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import controller.ControllerEnseignant;

public class FrameRechercheParDomaine extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextPanel textPanel;
	FormPanelRechercheDomaine formRechDom;
	FormPanelRechercheNom formRechNom;
	private TablePanel tablePanel;
	private Toolbar toolbar;

	private ControllerEnseignant controller;
	
	public FrameRechercheParDomaine() throws SQLException{
		super("Infos Enseignant");
		controller = new ControllerEnseignant();
		setLayout(new BorderLayout());
		
		textPanel = new TextPanel();
		formRechDom = new FormPanelRechercheDomaine();
		formRechNom = new FormPanelRechercheNom();
		tablePanel = new TablePanel();
		toolbar = new Toolbar();

		

		tablePanel.setData(controller.getProfesseurs());
		setJMenuBar(createMenuBar());
		toolbar.setStringListener(new StringListener(){
			public void textEmitted(String text){
				textPanel.appendText(text);
			}
		});
		
		formRechDom.setFormListener(new FormListener() {
			
			@Override
			public void formEventOccuredUpdateEnseignant(FormEventEnseignat e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void formEventOccuredCancelEnseignant() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void formEventOccuredCancelDomain() {
				tablePanel.setData(controller.getProfesseurs());
				tablePanel.refresh();
				formRechDom.clearfileds();
				
			}
			
			@Override
			public void formEventOccured(FormEventEnseignat e) throws SQLException {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void formEventOccuredSearchByDomain(String domain) {
				tablePanel.setData(controller.getProfesseursByDomain(domain));
				tablePanel.refresh();
				formRechDom.clearfileds();
			}

			@Override
			public void formEventOccuredSearchByNomPrenom(String nom, String prenom) {
				// TODO Auto-generated method stub
				
			}
		});

		add(formRechDom,BorderLayout.WEST);
		add(formRechNom,BorderLayout.EAST);
		add(toolbar,BorderLayout.NORTH);
		add(tablePanel,BorderLayout.CENTER);

		setMinimumSize(new Dimension(1000,400));
		setSize(600,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	//Menu Bar
	private JMenuBar createMenuBar(){
		JMenuBar menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");
		JMenuItem exitItem = new JMenuItem("Exit");
		fileMenu.add(exitItem);

		JMenu windowMenu = new JMenu("Window");
		JMenu showMenu = new JMenu("Show");

		JCheckBoxMenuItem showFormItem = new JCheckBoxMenuItem("Recherche par Domaine d'activit�");
		showFormItem.setSelected(true);
		JCheckBoxMenuItem showFormItem1 = new JCheckBoxMenuItem("Recherche par Nom & Pr�nom");
		//showFormItem1.setSelected(true);
		showMenu.add(showFormItem);
		showMenu.add(showFormItem1);
		windowMenu.add(showMenu);

		menuBar.add(fileMenu);
		menuBar.add(windowMenu);
		
		
		//ACTION ITEM RECHERCHE PAR DOMAINE
		showFormItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev) {
				JCheckBoxMenuItem menuItem = (JCheckBoxMenuItem) ev.getSource();

				formRechDom.setVisible(menuItem.isSelected());

			}
		});
		//ACTION ITEM RECHERCHE PAR DOMAIN
		showFormItem1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JCheckBoxMenuItem menuItem1 = (JCheckBoxMenuItem) e.getSource();
				formRechNom.setVisible(menuItem1.isSelected());
			}
		});
		fileMenu.setMnemonic(KeyEvent.VK_F);
		exitItem.setMnemonic(KeyEvent.VK_X);

		exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));

		exitItem.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {

				int action = JOptionPane.showConfirmDialog(FrameRechercheParDomaine.this, 
						"D�sirez-vous fermer cette fenetre?", "Confirmer", JOptionPane.OK_CANCEL_OPTION);
				System.out.println(JOptionPane.getRootFrame());
				if (action == JOptionPane.OK_OPTION){
					FrameRechercheParDomaine.this.controller.shutDown();
					FrameRechercheParDomaine.this.dispose();
				}
					
			}
		});
		return menuBar;
	}
}
