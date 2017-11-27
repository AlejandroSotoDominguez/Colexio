
package colexio;

public class Colexio {

    public static void main(String[] args) {
        Estudante est1 = new Estudante("Pedro","Garcia Barbon","Daniel Castelao","3º");
        System.out.println(est1.toString());
        
        EstudanteInternacional est2 = new EstudanteInternacional("Manuel","Travesia","Daniel Castelao","3º","España");
        System.out.println(est2.toString());
        
        Ensinante ens1 = new Ensinante("Pablo","Garcia Barbon","Matemáticas");
        System.out.println(ens1.toString());
        
        est1.setNivel("5º");
        System.out.println(est1.getNivel());
        ens1.setMateria("Inglés");
        System.out.println(ens1.getMateria());
    } 
}
