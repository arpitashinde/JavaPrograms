
import java.rmi.*;
public class Client{  
public static void main(String args[]){  
try{  
MSG stub=(MSG)Naming.lookup("rmi://localhost:5000/sonoo");
stub.display("this is using remote class");
}catch(Exception e){}
}  
}  