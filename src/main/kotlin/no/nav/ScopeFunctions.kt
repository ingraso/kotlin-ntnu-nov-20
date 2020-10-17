package no.nav

import java.io.File

fun main() {
   with("whatever") {
      println("'$this' in uppercase is ${this.toUpperCase()}")
   }

   System.getProperty("java.io.tmpdir").let { tmpdir ->
      File("$tmpdir/myfile.txt").writer().use { writer ->
         writer.write("something")
      }.also {
         println("wrote file to folder '$tmpdir'")
      }
   }
}

