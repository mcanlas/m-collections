# Next actions

* don't use stock iterator
* Implement factory methods
  * With apply* constructor
  * With empty instance
  * Could be super naive? (Fold of immutable starting at empty
* Implement collections operations
  * Like +, ++, filter, and so on
* When does Can Build From occur?
  * Only needed to map out of specialized collections?
* need mutable builders if collections operations are based on foreach (side effects)
  * start with empty
  * just does var = set + elemt, repeatedly
