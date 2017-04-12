package test;
import dao.ClienteDao;
import datos.Cliente;
public class TestTraerClienteYContacto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteDao dao= new ClienteDao();
		long idCliente=1;
		Cliente c=dao.traerClienteYContacto(idCliente);
		System. out .println( "\ntraer Cliente y contacto\n" +c+ "\n" +c.getContacto());
	}

}
