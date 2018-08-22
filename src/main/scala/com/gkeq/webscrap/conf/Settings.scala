package com.gkeq.webscrap.conf

import com.typesafe.config.Config

case class Urls(etUrl: String)
case class Files(etFile: String)
class Settings(val conf: Config) {

  val timeout: String = conf.getString("timeout")

  val urls = Urls(etUrl = conf.getString("urls.et_url"))

  val files = Files(conf.getString("files.et_file"))

}
