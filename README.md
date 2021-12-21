# Toaster-Library
Library For Toast with different colors



To get a Git project into your build:

# Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
# Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Zeeshan-The-Dev:Toaster-Library:0.1.3'
	}
	
# Simple Toast
       ToasterMessage.showToast(context , message)
       
# Success Toast
       ToasterMessage.showSuccessToast(context , message)

# Warning Toast
       ToasterMessage.showWarningToast(context , message)

# Error Toast
       ToasterMessage.showErrorToast(context , message)


