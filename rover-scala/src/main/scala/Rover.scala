class Rover(var position: Position, var direction: Direction.Value, plateau: Plateau) {
  def turnRight(): Unit = {
    direction = direction match {
      case Direction.NORTH => Direction.EAST
      case Direction.SOUTH => Direction.WEST
      case Direction.EAST => Direction.SOUTH
      case Direction.WEST => Direction.NORTH
    }
  }

  def turnLeft(): Unit = {
    direction = direction match {
      case Direction.NORTH => Direction.WEST
      case Direction.SOUTH => Direction.EAST
      case Direction.EAST => Direction.NORTH
      case Direction.WEST => Direction.SOUTH
    }
  }

  def move(): Unit = {
    position = direction match {
      case Direction.NORTH => Position(position.xPos, position.yPos+1)
      case Direction.SOUTH => Position(position.xPos, position.yPos-1)
      case Direction.EAST => Position(position.xPos+1, position.yPos)
      case Direction.WEST => Position(position.xPos-1, position.yPos)
    }
  }

  override def toString: String = s"position = $position, direction = $direction"
}

case class Position(xPos: Int, yPos: Int)

object Direction extends Enumeration {
  val NORTH, SOUTH, EAST, WEST = Value
}

case class Plateau(length: Int, breadth: Int)
