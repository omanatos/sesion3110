package sesion10.models;

public class Company {
    private String companyName;
    private Address address; // Composición: una empresa tiene una dirección

    // Constructor
    public Company(String companyName, Address address) {
        this.companyName = companyName;
        this.address = address;
    }

    // Métodos get
    public String getCompanyName() {
        return companyName;
    }

    public Address getAddress() {
        return address;
    }

    // Metodo para mostrar los detalles completos de la empresa
    public void printCompanyDetails() {
        System.out.println("Company Name: " + getCompanyName());
        System.out.println("Address: " + getAddress().getFullAddress());
    }
}
