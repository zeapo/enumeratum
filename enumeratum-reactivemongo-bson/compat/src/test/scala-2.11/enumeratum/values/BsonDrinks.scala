package enumeratum.values

/**
 * @author Alessandro Lacava
 * @since 2016-04-23
 */
sealed abstract class BsonDrinks(val value: Short, name: String) extends ShortEnumEntry

case object BsonDrinks extends ShortEnum[BsonDrinks] with ShortReactiveMongoBsonValueEnum[BsonDrinks] {

  case object OrangeJuice extends BsonDrinks(value = 1, name = "oj")
  case object AppleJuice extends BsonDrinks(value = 2, name = "aj")
  case object Cola extends BsonDrinks(value = 3, name = "cola")
  case object Beer extends BsonDrinks(value = 4, name = "beer")

  val values = findValues

}

sealed abstract class BsonContentType(val value: Long, name: String) extends LongEnumEntry

case object BsonContentType
    extends LongEnum[BsonContentType]
    with LongReactiveMongoBsonValueEnum[BsonContentType] {

  val values = findValues

  case object Text extends BsonContentType(value = 1L, name = "text")
  case object Image extends BsonContentType(value = 2L, name = "image")
  case object Video extends BsonContentType(value = 3L, name = "video")
  case object Audio extends BsonContentType(value = 4L, name = "audio")

}

sealed abstract class BsonLibraryItem(val value: Int, val name: String) extends IntEnumEntry

case object BsonLibraryItem extends IntEnum[BsonLibraryItem] with IntReactiveMongoBsonValueEnum[BsonLibraryItem] {

  // A good mix of named, unnamed, named + unordered args
  case object Book extends BsonLibraryItem(value = 1, name = "book")
  case object Movie extends BsonLibraryItem(name = "movie", value = 2)
  case object Magazine extends BsonLibraryItem(3, "magazine")
  case object CD extends BsonLibraryItem(4, name = "cd")

  val values = findValues

}