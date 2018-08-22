package com.gkeq.webscrap.scrape

import com.gkeq.webscrap.model.Recom
import org.jsoup.nodes.Document
import org.slf4j.LoggerFactory

class EtRecomScraper {

  private val logger = LoggerFactory.getLogger(getClass)

  def scrapRecommendations(document: Document): List[Recom] = {
    val elements = document.getElementById("all").children()

    import scala.collection.JavaConverters._
    val it = elements.iterator().asScala

    // TODO use NLP to extract information
    // TODO include header if file does not exist
    val res = for (ele <- it if ele.select("time").text()!="")
      yield
        Recom(ele.select("time").text().replace(",",""),
        None,
        None,
        None,
        None,
        None,
        ele.select("p").text())

    res.toList
  }
}
