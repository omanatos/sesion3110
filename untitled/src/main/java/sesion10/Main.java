package sesion10;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Address
        Address address = new Address("123 Main St", "Springfield", "12345");

        // Crear una instancia de Company con la dirección anterior
        Company company = new Company("Tech Solutions Inc.", address);

        // Mostrar los detalles completos de la empresa
        company.printCompanyDetails();
    }
}
