package com.gkeq.webscrap.source

import com.gkeq.webscrap.conf.Settings
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

class WebSource {

  def getRecomDocument(settings: Settings): Document = {
    Jsoup.connect(settings.urls.etUrl)
      .timeout(settings.timeout.toInt)
      .get()
  }

  def getNewsDocument(settings: Settings): Document = {
    Jsoup.connect(settings.urls.etNewsUrl)
      .timeout(settings.timeout.toInt)
      .get()
  }

}
