/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.creational;

/**
 *
 * @author cw1491
 */
public interface Door extends MapSite{
  public Room getOtherSide(Room enteringRoom) throws InvalidDoorEntry;
}
