trait RoverCommand {
  def execute(rover: Rover)
}

class MoveCommand extends RoverCommand {
  override def execute(rover: Rover): Unit = {
    rover.move()
  }
}

class TurnLeftCommand extends RoverCommand {
  override def execute(rover: Rover) = {
    rover.turnLeft()
  }
}

class TurnRightCommand extends RoverCommand{
  override def execute(rover: Rover): Unit = {
    rover.turnRight()
  }
}
