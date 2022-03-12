package com.rsk

import java.lang.IllegalArgumentException

class Meeting(val meetingName : String) {
    private val logger = Logger()

    fun addParticipant(participant: Participant){
        if(verifyParticipant(participant))
            println("Added ${participant.participantName}")
    }

    private fun verifyParticipant(participant: Participant) : Boolean{
        println("verifying if ${participant.participantName} already exists")
        return true
    }
}

class Participant(var name : Name = Name(), var email : String){
    val participantName = name.name
    val canonicalEmail
        get() = email.toUpperCase()
}

/*
We can use this type of samll classes to validate using setters
*/
class Name{
    var name = ""
    set(value) {
        if(value.isNullOrBlank()) throw IllegalArgumentException()
        field = value
    }
}