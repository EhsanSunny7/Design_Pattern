/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.LAB8.Proxy.labwork;

import GOF.LAB8.Proxy.base.Image;

/**
 *
 * @author FA20-BSE-068
 */
public class RemoteProxyImage implements Image{
    private String remoteSource;
    public RemoteProxyImage(String rSource){
        this.remoteSource = rSource;
    }
    public void display(String rSource) {
        if(remoteSource.equals(rSource)){
            new RemoteImage().display(rSource);
        }
        else{
            System.out.println("Loaing image from fake source of type "+ rSource);
        }
    }
}