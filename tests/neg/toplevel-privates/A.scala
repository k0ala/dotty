package p22

private val x = 10

val y = x

private[p22] val xx = 10

val yy = xx

private class C {
  val z = x
}

