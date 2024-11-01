package sesion10.models;

public class Product {
    // Atributos privados
    private String name;
    private double price;
    private int quantityAvailable;

    // Constructor
    public Product(String name, double price, int quantityAvailable) {
        this.name = name;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    // Métodos get
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    // Metodo para actualizar la cantidad disponible (solo valores no negativos)
    public void updateQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantityAvailable = quantity;
        } else {
            System.out.println("Cantidad inválida. La cantidad no puede ser negativa.");
        }
    }

    // Metodo para calcular el valor total de la existencia del producto
    public double calculateTotalValue() {
        return price * quantityAvailable;
    }

    // Metodo para imprimir información del producto
    public void printProductInfo() {
        System.out.println("Product Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Quantity Available: " + getQuantityAvailable());
        System.out.println("Total Value: $" + calculateTotalValue());
    }
}
