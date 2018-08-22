package com.gkeq.webscrap.source

import com.gkeq.webscrap.conf.Settings
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

/**
  * Created by timmy on 22/08/18.
  */
class WebSource {

  def getDocument(settings: Settings): Document = {
    Jsoup.connect(settings.urls.etUrl)
      .timeout(settings.timeout.toInt)
      .get()
  }

}
