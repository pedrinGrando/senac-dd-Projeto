package model.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import Exceptions.CampoInvalidoException;
import model.vo.*;
import controller.EnderecoController;

public class TelaEndereco extends JFrame {

	private JPanel contentPane;
	private JTextField campRua;
	private JTextField campNumero;
	private JTextField campBairro;
	private JTextField campCidade;
	private JTextField campEstado;
	private JLabel lblCep;
	private MaskFormatter mascaraCep;
	private JFormattedTextField campoCep;
	private JLabel lblRua;
	private JLabel lblNumero;
	private JLabel lblBairro;
	private JLabel lblCidade;
	private JLabel lblEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEndereco frame = new TelaEndereco();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws java.text.ParseException 
	 */
	public TelaEndereco() throws java.text.ParseException, ParseException {
		setTitle("Cadastro de endereco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 361);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(73dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		lblCep = new JLabel("CEP: ");
		lblCep.setForeground(new Color(255, 255, 0));
		lblCep.setBackground(new Color(255, 255, 0));
		lblCep.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		contentPane.add(lblCep, "2, 2, 1, 2, right, default");
		
		try {
		mascaraCep = new MaskFormatter("#####-###");
		mascaraCep.setValueContainsLiteralCharacters(false);
		} catch (ParseException e ) {
			JOptionPane.showMessageDialog(null, "Erro ao criar máscara!");
		}
		
		
		campoCep = new JFormattedTextField(mascaraCep);
		contentPane.add(campoCep, "4, 2, fill, default");
		
		lblRua = new JLabel("Rua: ");
		lblRua.setForeground(new Color(255, 255, 0));
		lblRua.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		contentPane.add(lblRua, "2, 4, 1, 2, right, default");
		
		campRua = new JTextField();
		contentPane.add(campRua, "4, 4, fill, default");
		campRua.setColumns(10);
		
		lblNumero = new JLabel("Número:");
		lblNumero.setForeground(new Color(255, 255, 0));
		lblNumero.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		contentPane.add(lblNumero, "2, 6, 1, 2, right, default");
		
		
		campNumero = new JTextField();
		contentPane.add(campNumero, "4, 6, fill, default");
		campNumero.setColumns(10);
		
		lblBairro = new JLabel("Bairro:");
		lblBairro.setForeground(new Color(255, 255, 0));
		lblBairro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		contentPane.add(lblBairro, "2, 8, 1, 2, right, default");
		
		campBairro = new JTextField();
		contentPane.add(campBairro, "4, 8, fill, default");
		campBairro.setColumns(10);
		
		lblCidade = new JLabel("Cidade:");
		lblCidade.setForeground(new Color(255, 255, 0));
		lblCidade.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		contentPane.add(lblCidade, "2, 10, 1, 2, right, default");
		
		campCidade = new JTextField();
		contentPane.add(campCidade, "4, 10, fill, default");
		campCidade.setColumns(10);
		
		lblEstado = new JLabel("Estado: ");
		lblEstado.setForeground(new Color(255, 255, 0));
		lblEstado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		contentPane.add(lblEstado, "2, 12, 1, 2, right, default");
		
		campEstado = new JTextField();
		contentPane.add(campEstado, "4, 12, fill, default");
		campEstado.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon(TelaEndereco.class.getResource("/images/saveIcon.png")));
		btnSalvar.setBackground(new Color(192, 192, 192));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EnderecoController enderecoController = new EnderecoController();
				EnderecoVO novoEndereco = new EnderecoVO();
				novoEndereco.setBairro(campBairro.getText());
				
				String cepInformado = "";
				 try {
					 cepInformado = (String) mascaraCep.stringToValue(campoCep.getText());
				 } catch (ParseException e1) {
					 //Sem Ação
				 }
				
				novoEndereco.setCep(campoCep.getText());
				novoEndereco.setRua(campRua.getText());
				novoEndereco.setNumero(campNumero.getText());
				novoEndereco.setEstado(campEstado.getText());
				novoEndereco.setCidade(campCidade.getText());
				
				try {
					enderecoController.salvarEnderecoController(novoEndereco);
					JOptionPane.showMessageDialog(null, "Endereco cadastrado com sucesso!");
				}catch(CampoInvalidoException e1) {
					JOptionPane.showMessageDialog(null, "Os campos abaixo são obrigatórios!\n " + e1.getMessage());
				}
				
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		contentPane.add(btnSalvar, "4, 18");
	}
}
