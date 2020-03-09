package com.concon.evetns.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
public class BookApi {

    @PostMapping
    public void bookHotel(@RequestBody HotelBookRequest hotelBookRequest){

    }
    public class HotelBookRequest{
        private String userId;
        private String hotelId;

        public HotelBookRequest(String userId, String hotelId) {
            this.userId = userId;
            this.hotelId = hotelId;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getHotelId() {
            return hotelId;
        }

        public void setHotelId(String hotelId) {
            this.hotelId = hotelId;
        }
    }
}
