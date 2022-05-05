public class HerenicaPersona {

    public static void main(String[] args) {

        Cliente deudor = new Cliente();
        System.out.println("objeto deudor -> cliente");
        System.out.println(deudor.getEdad());
        System.out.println(deudor.getNombre());
        System.out.println(deudor.getTelefono());
        System.out.println(deudor.getCredito());

        Trabajador pago = new Trabajador();
        System.out.println("objeto pago -> Trabajador");
        System.out.println(pago.getEdad());
        System.out.println(pago.getNombre());
        System.out.println(pago.getTelefono());
        System.out.println(pago.getSalario());

    }

}

class Persona{
    int edad = 20;
    String nombre ="ChemaDeudor";
    String telefono = "312-130-14-76";

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    double credito = 56.99;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
     double salario = 1999.99;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}