# gambler_master

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.iamrajendra:gambler_master:0.1.0'
	}
Share this release:

 download the sample 
 
![alt text](https://github.com/iamrajendra/gambler_master/blob/master/device-2019-03-10-194947.png)
