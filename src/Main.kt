fun main() {
        val morningNotification = 51
        val eveningNotification = 135
        printNotificationSummary(morningNotification)
        printNotificationSummary(eveningNotification)
    }
    fun printNotificationSummary(numberOfMessages: Int) {
        if (numberOfMessages<100){
            println("you have $numberOfMessages notificaciones")

        } else{
            println("tu iphone is blowing up! You have 99+ notificaciones ")
        }
    }
