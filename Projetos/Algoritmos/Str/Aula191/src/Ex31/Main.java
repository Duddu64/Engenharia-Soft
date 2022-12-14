package Ex31;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Medico ob1=new Medico();
		Paciente ob2=new Paciente();
		Consulta ob3=new Consulta();
		try {
			ob1.setNome(JOptionPane.showInputDialog("Digite o nome do médico: "));
			ob1.setCrm(Integer.parseInt(JOptionPane.showInputDialog("Digite o CRM do medico: ")));
			ob1.setEspecialidade(JOptionPane.showInputDialog("Digite a especialidade do medico: "));
			ob2.setNome(JOptionPane.showInputDialog("Digite o nome do Paciente: "));
			ob2.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do Paciente: ")));
			ob2.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade do Paciente: ")));
			
			ob3.setMed(ob1);
			ob3.setPacil(ob2);
			JOptionPane.showMessageDialog(null, "Medico: "+ob3.getMed().getNome() +"\nEscialidade: "+ob3.getMed().getEspecialidade()+"\nCRM: "+ob3.getMed().getCrm()+"\nPaciente : "
											+ ob3.getPacil().getNome()+"\nCodigo do Paciente: "+ob3.getPacil().getCodigo()+"\nIdade do Paciente: "+ob3.getPacil().getIdade());
		}
		catch(Exception e) {
			System.out.println("Os entrada de dados inválida!!");
		}
	}
}
