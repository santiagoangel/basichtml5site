
#Basic HTML5 Site

Spring MVC, Twitter's Bootstrap and Freemarker.



##Running on OpenShift:

...
$ rhc app create MyApp jbossas-7

$ cd MyApp

$ rm *

$git remote add upstream -m master https://github.com/santiagoangel/basichtml5site

$git pull -s recursive -X theirs upstream master

$write some changes

$ git add 

$ git commit -m "Adding my changes"

$ git push
...
