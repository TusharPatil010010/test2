package com.rsk

fun main(args : Array<String>){
    val meeting = Meeting("Review")

    println("Created : $meeting with name ${meeting.meetingName}")
    val name = Name()
    name.name = "Tushar"
    val participant = Participant(name, "tushar@gmail.com")

    meeting.addParticipant(participant)

//    meeting.meetingName = "Review"
}