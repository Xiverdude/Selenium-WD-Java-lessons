package testpackage;

//ИНКАПСУЛЯЦИЯ - скрывать реализацию от пользователя (модификкаторы доступа)

import mypackage.TestClass28Animal;
import mypackage.TestClass28Dog;

//        public class FirstClass {
//        void method(){
//        TestClass28Dog dog = new TestClass28Dog();
//        dog.var = 10;}


    public class FirstClass extends TestClass28Animal {//если protected дает доступ к наследнику
        void method(){
            var = 10;
}




}
