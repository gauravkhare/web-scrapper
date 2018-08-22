package com.gkeq.webscrap.source

import com.gkeq.webscrap.conf.Settings
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

class WebSource {

  def getDocument(settings: Settings): Document = {
    Jsoup.connect(settings.urls.etUrl)
      .timeout(settings.timeout.toInt)
      .get()
  }

}
