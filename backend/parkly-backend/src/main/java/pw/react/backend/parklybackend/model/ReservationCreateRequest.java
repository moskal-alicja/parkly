package pw.react.backend.parklybackend.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.Date;

public class ReservationCreateRequest {

    private long parkingId;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateFrom;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateTo;
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String userToken;
    private int spotId;

    public long getParkingId() {
        return parkingId;
    }

    public void setParkingId(long parkingId) {
        this.parkingId = parkingId;
    }

    public LocalDateTime getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDateTime dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDateTime getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDateTime dateTo) {
        this.dateTo = dateTo;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public ReservationCreateRequest(){}

    public ReservationCreateRequest(Reservation reservation) {
        this.userToken = reservation.getUserToken();
        this.parkingId = reservation.getParkingId().getId();
        this.dateFrom = reservation.getDateFrom();
        this.dateTo = reservation.getDateTo();
        this.userFirstName = reservation.getUserFirstName();
        this.userLastName = reservation.getUserLastName();
        this.userEmail = reservation.getUserEmail();
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }
}
