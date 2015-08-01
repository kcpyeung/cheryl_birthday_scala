val allDates : Array[String] =
  Array("May 15", "May 16", "May 19", "June 17", "June 18", "July 14", "July 16", "August 14", "August 15", "August 17")

def tell(dates : Array[String], date : String) : Array[String] = {
  dates.filter(d => d.contains(date))
}

def know(dates : Array[String]) : Boolean = {
  dates.length == 1
}


