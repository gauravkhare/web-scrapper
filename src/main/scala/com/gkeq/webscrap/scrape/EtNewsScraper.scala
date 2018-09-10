package com.gkeq.webscrap.scrape

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import com.gkeq.webscrap.model.{EtNewsModel, Recom}
import org.jsoup.nodes.Document
import org.slf4j.LoggerFactory

class EtNewsScraper {

  private val logger = LoggerFactory.getLogger(getClass)

  // https://jsoup.org/cookbook/extracting-data/selector-syntax
  def scrapNews(document: Document): List[EtNewsModel] = {
    val elements = document.getElementById("pageContent").select("li,p,stname")

    import scala.collection.JavaConverters._
    val it = elements.iterator().asScala

    val res = for (ele <- it)
      yield
        EtNewsModel(
          DateTimeFormatter.BASIC_ISO_DATE.format(LocalDate.now()),
          ele.text()
        )

    res.toList.filter(_.newsText!="")
  }
}
