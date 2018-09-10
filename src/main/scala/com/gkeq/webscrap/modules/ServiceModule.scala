package com.gkeq.webscrap.modules

import com.gkeq.webscrap.scrape.{EtNewsScraper, EtRecomScraper}
import com.gkeq.webscrap.service.EtWebScrapService
import com.gkeq.webscrap.sink.FileSink
import com.gkeq.webscrap.source.WebSource
import com.softwaremill.macwire._

trait ServiceModule extends SettingsModule {

  lazy val etWebScrapService: EtWebScrapService = wire[EtWebScrapService]
  lazy val webSource: WebSource = wire[WebSource]
  lazy val fileSink: FileSink = wire[FileSink]
  lazy val etRecomScraper: EtRecomScraper = wire[EtRecomScraper]
  lazy val etNewsScraper: EtNewsScraper = wire[EtNewsScraper]

}
