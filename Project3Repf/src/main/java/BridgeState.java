/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andys
 */
public interface BridgeState {
 
    void next(Bridge pkg);
    void prev(Bridge pkg);
    void printStatus() throws InterruptedException;
}