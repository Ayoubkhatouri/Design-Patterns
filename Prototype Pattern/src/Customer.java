public class Customer implements Cloneable{ //this also should implements clonable so that when we clone bankAccount
                                            //we don't clone its address memory(same obj) but we clone just attr
    private Long id;
    private String name;

    public Customer(Long id,String name){
        this.id=id;
        this.name=name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Customer clone() throws CloneNotSupportedException {
        return (Customer) super.clone();
    }
}
