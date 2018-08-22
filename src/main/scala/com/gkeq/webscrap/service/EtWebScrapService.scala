package com.gkeq.webscrap.service

import com.gkeq.webscrap.conf.Settings
import com.gkeq.webscrap.scrape.EtRecomScraper
import com.gkeq.webscrap.sink.FileSink
import com.gkeq.webscrap.source.WebSource
import org.slf4j.LoggerFactory

class EtWebScrapService(settings: Settings,
                        webSource: WebSource,
                        fileSink: FileSink,
                        etRecomScraper: EtRecomScraper) {

  private lazy val logger = LoggerFactory.getLogger(getClass)

  def run(): Unit = {
    logger.info("Starting scraping of URL => "+settings.urls.etUrl)
    val doc = webSource.getDocument(settings)

    val recommendations = etRecomScraper.scrapRecommendations(doc)

    fileSink.save(recommendations)

    logger.info("Output stored here => "+settings.files.etFile)

  }

}
