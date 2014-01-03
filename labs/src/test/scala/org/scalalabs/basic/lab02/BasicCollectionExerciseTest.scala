package org.scalalabs.basic.lab02

import org.scalatest.junit.JUnitSuite
import org.junit.Test
import java.lang.{ IllegalArgumentException => IAE }
import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import org.scalalabs.basic.lab02.BasicListManipulationExercise02.{ Person => _ }
import org.scalalabs.basic.lab02.BasicCollectionExercise.Person
/**
 * This Lab contains exercises where the usage of
 * higher order collection methods can be rehearsed.
 */
@RunWith(classOf[JUnitRunner])
class BasicCollectionExerciseTest extends Specification {

  "Exercise 1: GoogleCodeJam" should {
    "get first Element in list" in {
      val in1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi"
      val in2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd"
      val in3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv"
      val out1 = "our language is impossible to understand"
      val out2 = "there are twenty six factorial possibilities"
      val out3 = "so it is okay if you want to just give up"
        
      val result = BasicCollectionExercise.googleCodeJamGooglerese(in1, in2, in3)
      Seq(out1, out2, out3) === result
    }
  }

  "Exercise 2:" should {
    "group a list of adults by age group. Each group is sorted by name" in {
      val jack = new Person(14, "Jack")
      val duke = new Person(32, "Duke")
      val jeniffer = new Person(34, "Jeniffer")
      val erik = new Person(24, "Erik")
      val susy = new Person(40, "Susy")
      
      val result = BasicCollectionExercise.groupAdultsPerAgeGroup(Seq(jack, duke, jeniffer, erik, susy))
      Map(20 -> Seq(erik), 30 -> Seq(duke, jeniffer), 40 -> Seq(susy)) ==== result
    }
  }

  "Exercise 3:" should {
    "calculate the length of the longest word in a list of sentences" in {
      val l1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque pharetra lorem ut sem feugiat tristique. "
      val l2 = "Etiam id magna ut libero ullamcorperano scelerisque. "
        
      val result = BasicCollectionExercise.calcLengthLongestWord(l1, l2)
      "ullamcorperano".length() === result
    }
  }

}