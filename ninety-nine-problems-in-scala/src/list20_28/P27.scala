package list20_28

import P26.combin
/*
 * Group the elements of a set into disjoint subsets.

 * a) In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons? 
 * Write a function that generates all the possibilities and returns them in a list.
 * 
 * b) Generalize the above predicate in a way that we can specify a list of group sizes and the predicate will return a list of groups.
 */

object P27 {
  def main(args: Array[String]) {
  	print(group(Range(0,9).toList, List(2,2,5)))
  }

  def group[A](l: List[A], ns: List[Int]): (List[List[List[A]]], Int) = {

    def groupSub[A](l: List[A], ns: List[Int]): List[List[List[A]]] =
      if (ns.size == 0) List(List(l))
      else {
        val heads = combin(l, ns.head)
        heads.map(x => groupSub(l.diff(x), ns.tail).map(y => x::y)).flatten
      }
    
    val t = groupSub(l,ns)
    (t, t.size)

  }
}