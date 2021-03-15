public class Main {

    public static void main(String[] args) {

      ProductDal productDal = new ProductDal();
      productDal.add(new Product(1,"bidon"));

      CustomerDal customerDal= new CustomerDal();
      customerDal.delete(new Customer());

      Customer customer = new Customer();

      Validator validator = new Validator();
      validator.validate(customer);

    }
}
////////////////////////////////////////
public interface IEntity {
}
/////////////////////////////////////////
public interface IEntityRepository <T extends IEntity> {

    void add(T entity);
    void delete(T entity);
    void update(T entity);

}
//////////////////////////////////////////
public class Validator {

    public<T extends IEntity> void validate(T entity){

    }
}
////////////////////////////////////////////
public class ProductDal implements IEntityRepository<Product>{
    @Override
    public void add(Product entity) {
        System.out.println("product eklendi");
    }

    @Override
    public void delete(Product entity) {
        System.out.println("product çıkarıldı");
    }

    @Override
    public void update(Product entity) {
        System.out.println("product guncellendi");
    }
}
///////////////////////////////////////////
public class Product implements IEntity {
    int id;
    String Name;

    public Product(int id,String Name){
        this.id=id;
        this.Name=Name;

    }
    public Product(){

    }

}
////////////////////////////////////////////////
public class CustomerDal implements IEntityRepository <Customer> {


    @Override
    public void add(Customer entity) {
        System.out.println("customer eklendi");
    }

    @Override
    public void delete(Customer entity) {
        System.out.println("customer silindi");
    }

    @Override
    public void update(Customer entity) {
        System.out.println("customer güncellendi");
    }
}
/////////////////////////////////////////////////////////
public class Customer implements IEntity{

    int id;
    String firstName;

}
