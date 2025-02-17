package tfg.fractalgenerator.gui.panels;

import javax.swing.JPanel;

import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import tfg.fractalgenerator.gui.MandelbrotSetGUI;

import javax.swing.JButton;
import java.awt.Font;

/**
 * This view is meant to be a simple selector for different modes of operation
 * of the application. It's a simple {@link JPanel} with two buttons, so only
 * two options to choose from. Each one leads to another view.
 * 
 * @author -$BOSS$-
 */
public class ModeSelectionPanel extends JPanel {
	/**
	 * Serial version number. Using the default one.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Static reference to the name of this class which is used as the name
	 * of the component. The name is based on the {@code Class}'s name. Useful
	 * for the card layout since it makes a lot easier to have access to a
	 * component's name. 
	 */
	public static final String NAME = ModeSelectionPanel.class.getSimpleName();

	/**
	 * Initialization of the Panel and it's layout.
	 * It also contains the {@link ActionListener} for each button.
	 */
	public ModeSelectionPanel() {
		this.setSize(MandelbrotSetGUI.size);
		this.setName(NAME);
		
		JButton btnRealTimeView = new JButton("Visualización en tiempo real");
		btnRealTimeView.setToolTipText("Ir al panel de visualización en tiempo real.");
		btnRealTimeView.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnRealTimeView.addActionListener(e -> MandelbrotSetGUI.getInstance().changeCard(RealtimeViewPanelScalable.NAME));
		
		JButton btnGenerateAndExport = new JButton("Solo exportar a imagen");
		btnGenerateAndExport.setToolTipText("Ir al panel de exportación a fichero de imagen.");
		btnGenerateAndExport.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnGenerateAndExport.addActionListener(e -> MandelbrotSetGUI.getInstance().changeCard(ExportToFilePanel.NAME));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnRealTimeView, GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnGenerateAndExport, GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnGenerateAndExport, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
						.addComponent(btnRealTimeView, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE))
					.addContainerGap())
		);
		setLayout(groupLayout);

	}

}
