package de.fhrosenheim.gui.customer.search.api;

/**
 * Einfaches data transfer object für einen Kunden
 * 
 * @author dominik.haas
 */
public class CustomerDto {
    private final String id;
    private final String name;
    private final String lastName;

    public CustomerDto(String id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + '}';
    }
   
    
}
