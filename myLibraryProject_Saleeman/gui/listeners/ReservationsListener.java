/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.listeners;

import java.util.List;
import myLibraryProject.Reservation;

public interface ReservationsListener {
    public void onReservationCreated(Reservation reservation);
    public void onReservationCancelled(Reservation reservation);
    public void onReservationPickedUp(Reservation reservation);
    public List<Reservation> getReservations();
}
