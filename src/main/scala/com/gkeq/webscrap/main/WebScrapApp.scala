package com.gkeq.webscrap.main

import com.gkeq.webscrap.modules.ApplicationModule
import com.typesafe.config.ConfigFactory

object WebScrapApp extends App {

  private val config = ConfigFactory.load()
  val applicationModule = new ApplicationModule(config)
  // run
  applicationModule.etWebScrapService.run()

}
