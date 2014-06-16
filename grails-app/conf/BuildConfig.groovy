grails.project.work.dir = "target"
grails.project.target.level = 1.6

grails.project.dependency.resolver = "maven"

grails.project.dependency.resolution = {
	inherits "global"
	log "warn"

	repositories {
		grailsHome()
		grailsCentral()
		mavenCentral()
	}

	dependencies {
		compile 'com.icegreen:greenmail:1.3'
		runtime 'javax.mail:mail:1.4.1'
	}
	
	plugins {
		compile(":tomcat:7.0.54", ":hibernate:3.6.10.16") {
			export = false
		}
		test (":spock:0.7", ":mail:1.0") {
			export = false
		}
		build(":release:2.0.4") {
			export = false
		}
	}
}

grails.release.scm.enabled = false
grails.project.repos.default = "ducktape"
