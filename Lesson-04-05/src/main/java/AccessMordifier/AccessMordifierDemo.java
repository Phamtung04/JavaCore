package AccessMordifier;

import AccessMordifier.Privates.Group;
import AccessMordifier.publics.Department;

public class AccessMordifierDemo {
    public static void main(String[] args) {
        // Dùng: class, method, property
        // public: Có thể truy cập ở khắp mọi nơi
        Department department1 =new Department();
        System.out.println("department1.id = " + department1.id);
        System.out.println("department1.name = " + department1.name);

        // prorected: chỉ truy cập được trong Package
        // default: chỉ truy cập được trong Package

        // private: chỉ truy cập được trong class

    }
}
