def myMethod(List<String> list) {
  if (list != null) {
    list.each { element ->
      println element
    }
  } else {
    println "List is null"
  }
}

myMethod(null)

//Alternative solution using safe navigation operator
def myMethodSafe(List<String> list) {
  list?.each { element ->
    println element
  }
}

myMethodSafe(null)