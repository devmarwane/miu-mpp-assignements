package prop3;

public class Laptop {
    private String model;
    private String reference;
    private Employee assignedTo;

    public Laptop(String model, String reference){
        this.model = model;
        this.reference = reference;
        this.assignedTo = null;
    }

    public String getModel() {
        return this.model;
    }

    public String getReference() {
        return this.reference;
    }

    public Employee getEmployee() {
        return this.assignedTo;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void assignEmployee(Employee emp) {
        if(this.assignedTo == null) {
            this.assignedTo = emp;
        }
    }

    @Override
    public String toString() {
        return "Model "+this.model + " - Ref : "+this.reference+" - assigned to : "+this.assignedTo;
    }
}
