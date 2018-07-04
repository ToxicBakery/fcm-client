# FCM Client [![CircleCI](https://circleci.com/gh/ToxicBakery/fcm-client/tree/master.svg?style=svg)](https://circleci.com/gh/ToxicBakery/fcm-client/tree/master) [![codecov](https://codecov.io/gh/ToxicBakery/fcm-client/branch/master/graph/badge.svg)](https://codecov.io/gh/ToxicBakery/fcm-client)
Kotlin library for sending Firebase Cloud Messages using the v1 HTTP protocol.

## Requirements
Sending of messages to FCM requires the admin service account credentials.
* Navigate to your project in the Firebase console
* Click the settings gear icon and then `Project settings` in the drop down
* Click the `Service Accounts` tab
* Click `Generate new private key` on the `Firebase Admin SDK` tab

## Sample Usage
```kotlin
// Create the client using the downloaded google-services.json
val fcmClient = File("google-services.json")
   .inputStream()
   .let { accountStream -> GoogleServiceAccountResolver(accountStream) }
   .let { accountResolver -> HttpUrlFcmClient(accountResolver) }

// Create a message and give it to the client for delivery to FCM
fcmClient.send(
   Message(
      data = mapOf(
         "Hello" to "World!"
      ),
      android = AndroidConfig(
         restrictedPackageName = "com.sample.package"
      ),
      condition = "'my-channel' in topics"
   )
)
```

## Install
```groovy
implementation "com.ToxicBakery.fcmclient:fcm-client:1.+"
```
