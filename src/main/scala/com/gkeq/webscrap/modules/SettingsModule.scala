package com.gkeq.webscrap.modules

import com.gkeq.webscrap.conf.Settings
import com.typesafe.config.Config
import com.softwaremill.macwire._

trait SettingsModule {

  val conf: Config
  lazy val settings: Settings = wire[Settings]
}
