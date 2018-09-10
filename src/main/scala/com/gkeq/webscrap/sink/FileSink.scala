package com.gkeq.webscrap.sink

import java.io.{File, FileWriter, PrintWriter}

import com.gkeq.webscrap.conf.Settings
import com.gkeq.webscrap.model.{EtNewsModel, Recom}
import org.slf4j.LoggerFactory


class FileSink(settings: Settings) {

  private lazy val logger = LoggerFactory.getLogger(getClass)

  def save(recommendations: List[Recom]): Unit = {
    logger.info("size of recomm list => "+recommendations.size)
    // TODO  handle exceptions
    val writer = new FileWriter(new File(settings.files.etFile),true)
    recommendations.foreach(recom => writer.append(recom.toString+"\n"))
    writer.flush()
    writer.close()
  }

  def saveNews(recommendations: List[EtNewsModel]): Unit = {
    logger.info("size of recomm list => "+recommendations.size)
    // TODO  handle exceptions
    val writer = new FileWriter(new File(settings.files.etNewsFile),true)
    recommendations.foreach(recom => writer.append(recom.toString+"\n"))
    writer.flush()
    writer.close()
  }

}
