val allDates : Array[String] =
  Array("May 15", "May 16", "May 19", "June 17", "June 18", "July 14", "July 16", "August 14", "August 15", "August 17")

def tell(datePart : String) : Array[String] = {
  allDates.filter(d => d.contains(datePart))
}

def know(dates : Array[String]) : Boolean = {
  dates.length == 1
}

def monthOf(date : String) : String = {
  date.split(" ")(0)
}

def dayOf(date : String) : String = {
  date.split(" ")(1)
}

def statement1(date : String) : Boolean = {
  val whatAlbertNarrowsDownTo = tell(monthOf(date))
  !know(whatAlbertNarrowsDownTo) && !whatAlbertNarrowsDownTo.map(dayOf(_)).map(tell(_)).map(know(_)).contains(true)
}

def statement2(date : String) : Boolean = {
  val whatBernardNarrowsDownTo = tell(dayOf(date))
  !know(whatBernardNarrowsDownTo) && know(whatBernardNarrowsDownTo.filter(statement1(_)))
}

def statement3(date : String) : Boolean = {
  val whatAlbertNarrowsDownTo = tell(monthOf(date))
  know(whatAlbertNarrowsDownTo.filter(statement2(_)))
}

val cheryls_birthday = allDates.filter(d => statement1(d) && statement2(d) && statement3(d))

println(know(cheryls_birthday))

println(cheryls_birthday.head)
