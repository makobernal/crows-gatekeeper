package com.engicrowd.crows.gatekeeper

import scala.annotation.tailrec

object Main extends App {

  import Commands._

  @tailrec
  private def commandLoop(): Unit = {
    Console.readLine() match {
      case QuitCommand         => return
      case StartProducerCommand(producer) => println(producer)
      case _                   => println("WTF??!!")
    }
    commandLoop()
  }

  // start processing the commands
  commandLoop()


}

object Commands {
  val QuitCommand = "quit"
  val StartProducerCommand = "startproducer (.*)".r
}
