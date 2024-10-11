public class Employee{
   String name;
   int age;
   String department;

   Employee() {
   }

   Employee(String name, int age, String department) {
     this.name = name;
     this.age = age;
     this.department = department;
   }

   String getName() {
     return this.name;
   }

   void setName(String name) {
     this.name = name;
   }

   int getAge() {
     return this.age;
   }

   public void setAge(int age) {
     this.age = age;
   };

   public void setDepartment(String department){
     this.department = department;    
   }

   public String getDepartment(){
     return this.department;
   }
  
}