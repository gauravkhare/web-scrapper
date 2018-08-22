package com.gkeq.webscrap.model

// TODO Use another case class for storing clean attributes and use that in Recom
case class Recom(datetime: String,
                 stock: Option[String],
                 view: Option[Double],
                 entry: Option[Double],
                 target: Option[Double],
                 stoploss: Option[Double],
                 recom: String) {

  override def toString: String =
    datetime + "," +
      recom +
      stock.getOrElse("") + "," +
      view.getOrElse("") + "," +
      entry.getOrElse(-1) + "," +
      target.getOrElse(-1) + "," +
      stoploss.getOrElse(-1)

}
