package sesion10.models;

public class Address {
    private String street;
    private String city;
    private String postalCode;

    // Constructor
    public Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    // Métodos get
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    // Metodo para obtener la dirección completa
    public String getFullAddress() {
        return getStreet() + ", " + getCity() + ", " + getPostalCode();
    }
}
