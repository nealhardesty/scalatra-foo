package com.roadwaffle.scalatrafoo

import org.scalatra._
import scalate.ScalateSupport

class ScalatraFooServlet extends ScalatraFooStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  
}
