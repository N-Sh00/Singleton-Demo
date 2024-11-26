public class SingleObject {

        private static SingleObject instance = null;

        private SingleObject() { }

        public  static SingleObject getInstance() {
            //Checking to see if an instance is made
            if(instance == null) {
                synchronized (SingleObject.class){
                    //checking again to make sure
                    if (instance == null){
                        instance = new SingleObject();
                    }
                }
            }
            return instance;
        }

        public void showMessage() {
            System.out.println("Done.");
        }



}
