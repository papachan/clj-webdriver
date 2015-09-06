(defproject clj-webdriver "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.1"]
                 [ring/ring-defaults "0.1.2"]]
  :plugins [[lein-ring "0.8.13"]]
  :ring {:handler clj-webdriver-tutorial.handler/app}
  :profiles
  {:dev {:dependencies [[clj-webdriver "0.7.1"]
                        [org.seleniumhq.selenium/selenium-server "2.47.0"]
                        [javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]
                        [ring/ring-jetty-adapter "1.4.0"]]}})




