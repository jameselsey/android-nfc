android-nfc
===========

This is just a small example of an android NFC enabled app that I've been experimenting with, hopefully it'll be useful to others.

## Prerequisies
* Maven 3.0.4
* Android SDK with API level 17 installed
* An NFC enabled device. Tested against a Galaxy Nexus 4.2.2


## How to use this app
1. Download it using `git clone https://github.com/jameselsey/android-nfc.git`
2. `cd android-nfc`
3. Connect a device via USB, use `adb devices` to ensure the device is connected and online
4. Run `mvn clean install` to build the app, integration tests, and deploy both to device
5. Write a tag, or read an existing tag, have fun!

Currently this only works for tags with a MIME type of text/plain, but feel free to improve or hassle me on Twitter [@jameselsey1986](https://twitter.com/jameselsey1986)
