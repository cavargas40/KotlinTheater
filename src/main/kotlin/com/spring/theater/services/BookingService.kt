package com.spring.theater.services

import com.spring.theater.domain.Seat
import org.springframework.stereotype.Service

@Service
class BookingService() {
    fun isSeatFree(seat: Seat) : Boolean {
        return true
    }
}