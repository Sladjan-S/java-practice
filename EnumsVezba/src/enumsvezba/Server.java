/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumsvezba;

import org.omg.CORBA.UNKNOWN;


public class Server
{
    public int id;
    public String name;
    public ServerStatus status;
    
    public ServerStatus getStatus(String status)
    {
    ServerStatus res = ServerStatus.UNKNOWN;
    
        try
        {
            res = ServerStatus.valueOf(status);
        }
        catch (Exception e)
        {
        }
        return res;
    }
    
    public enum ServerStatus
    {
    STOPPED,RUNNING,UNKNOWN;
    }
    public Server()//podrazumjevani konstrukto
    {
    
    }
    
    public Server(String pars)
    {
    String []parsArray = pars.split("&");
    
    this.id = Integer.parseInt(parsArray[0].split("=")[1]);
    this.name = parsArray[1].split("=")[1].toString();
    
    this.status = getStatus(parsArray[2].split("=")[1].toString());
    }
    
    @Override
    public String toString()
    {
    return "Server id: "+this.id+"\nServer name: "+this.name+"\nServer status: "+this.status+"\n";
    }
    
}
