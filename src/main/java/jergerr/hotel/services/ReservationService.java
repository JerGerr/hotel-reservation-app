package jergerr.hotel.services;

import java.util.Collection;

import jergerr.hotel.entity.Reservation;
import jergerr.hotel.temp.CurrentReservation;

//Service Pattern for Reservation
public interface ReservationService {
	
	public Reservation getReservationForLoggedUserById(int resId);

	public Collection<Reservation> getReservationsForLoggedUser();
	
	public void saveOrUpdateReservation(CurrentReservation currentReservation);
	
	public void deleteReservation(int resId);

	public CurrentReservation reservationToCurrentReservationById(int resId);

}
