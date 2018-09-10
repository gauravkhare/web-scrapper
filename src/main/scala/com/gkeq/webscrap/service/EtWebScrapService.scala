package com.gkeq.webscrap.service

import com.gkeq.webscrap.conf.Settings
import com.gkeq.webscrap.scrape.{EtNewsScraper, EtRecomScraper}
import com.gkeq.webscrap.sink.FileSink
import com.gkeq.webscrap.source.WebSource
import org.slf4j.LoggerFactory

class EtWebScrapService(settings: Settings,
                        webSource: WebSource,
                        fileSink: FileSink,
                        etRecomScraper: EtRecomScraper,
                        etNewsScraper: EtNewsScraper) {

  private lazy val logger = LoggerFactory.getLogger(getClass)

  def run(): Unit = {
    logger.info("Starting scraping of URL => "+settings.urls.etUrl)
    val doc = webSource.getRecomDocument(settings)

    val recommendations = etRecomScraper.scrapRecommendations(doc)

    fileSink.save(recommendations)

    logger.info("Output stored here => "+settings.files.etFile)

    // for storing news
    logger.info("Starting scraping of URL => "+settings.urls.etNewsUrl)
    val docNews = webSource.getNewsDocument(settings)
    val news = etNewsScraper.scrapNews(docNews)
    fileSink.saveNews(news)
    logger.info("Output stored here => "+settings.files.etNewsFile)
  }

}
