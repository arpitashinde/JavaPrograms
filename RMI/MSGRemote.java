

import java.rmi.*;
import java.rmi.server.*;  
public class MSGRemote extends UnicastRemoteObject implements MSG{
public MSGRemote()throws RemoteException{
super();  
}  
public void display(String n){
    System.out.println(n);
}
}
