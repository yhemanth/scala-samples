object App {

  def main(args: Array[String]): Unit = {
    val rover = new Rover(Position(0, 0), Direction.EAST, Plateau(10, 10))
    val commands = Array (
      new MoveCommand,
      new MoveCommand,
      new MoveCommand,
      new MoveCommand,
      new MoveCommand,
      new TurnLeftCommand,
      new MoveCommand,
      new MoveCommand,
      new TurnRightCommand
    )
    for (cmd <- commands) {
      cmd.execute(rover)
    }
    println(rover)
  }
}
