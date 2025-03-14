package application;

// import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.UsuarioDao;
import model.entities.Usuario;

public class Program {

  public static void main(String[] args) {

    limparTela();
    Scanner sc = new Scanner(System.in);

    UsuarioDao usuarioDao = DaoFactory.createUsuarioDao();

    System.out.println("\n\t=== TEST 1: usuario findById =====");
    Usuario usuario = usuarioDao.findById(1);
    System.out.println(usuario);

    // System.out.println("\n\t=== TEST 2: usuario findAll =====");
    // List<Usuario> list = usuarioDao.findAll();
    // for (Usuario obj : list) {
    // System.out.println(obj);
    // }

    // System.out.println("\n\t=== TEST 3: usuario insert =====");
    // Integer id = usuarioDao.cadastrar();
    // System.out.println("\n\tInserted! New id: " + id);

    // System.out.println("\n\t=== TEST 5: seller update =====");
    // Usuario usuario = usuarioDao.findById(1);
    // usuario.setSenha("12341010");
    // usuarioDao.update(usuario);
    // System.out.println("\n\tUpdate completed");

    sc.close();

  }

  public static void limparTela() {
    try {
      final String os = System.getProperty("os.name");

      if (os.contains("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } else {
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
    } catch (final Exception e) {
      // Trata exceções (pode ser uma exceção de interrupção)
      e.printStackTrace();
    }
  }

  public static void pausar(Scanner scan) {
    System.out.print("\n\tPressione ENTER para continuar...");
    scan.nextLine();
  }
}
