package com.gkeq.webscrap.model

case class EtNewsModel(date: String, newsText: String) {

  override def toString: String =
    date + "~" + newsText
}
