package com.gkeq.webscrap.conf

import com.typesafe.config.Config

case class Urls(etUrl: String, etNewsUrl: String)
case class Files(etFile: String, etNewsFile:String)
class Settings(val conf: Config) {

  val timeout: String = conf.getString("timeout")

  val urls = Urls(etUrl = conf.getString("urls.et_url"), etNewsUrl = conf.getString("urls.et_news_url"))

  val files = Files(conf.getString("files.et_file"), etNewsFile = conf.getString("files.et_news_file"))

}
