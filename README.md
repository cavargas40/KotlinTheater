# Theather

![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)

Enter in the url https://start.spring.io and start configurating your project.


### First Template
Create a file "helloWorld.html" In the folder:
```sh
 src/main/resources/templates/
```
### First Controller
Create a file "MainController.kt" in the folder:
```sh
 src/main/kotlin/com.yourpackage.theater/
```
And put this code inside the file
```sh
package com.spring.theater.control

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class MainController {

    @RequestMapping("helloWorld")
    fun helloWorld() : ModelAndView{
        return ModelAndView("helloWorld")
    }
}
```


### Automatic Restart application when we make changes
Configure InteliJ Idea in the path
```sh
  File/Settings/Build, Execution, Deployment/Compiler/
```
Check the option "Build project automatically"

Then use the command
```sh
Ctrl + Shift + A
```
type "Registry" and check the option "compiler.automake.allow.when.app.running"


