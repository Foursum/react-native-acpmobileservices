# react-native-acpmobileservices

## Getting started

`$ npm install react-native-acpmobileservices --save`

### Mostly automatic installation

`$ react-native link react-native-acpmobileservices`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-acpmobileservices` and add `RCTACPMobileServices.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRCTACPMobileServices.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.foursum.reactnative.RCTACPMobileServicesPackage;` to the imports at the top of the file
  - Add `new RCTACPMobileServicesPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-acpmobileservices'
  	project(':react-native-acpmobileservices').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-acpmobileservices/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      implementation project(':react-native-acpmobileservices')
  	```


## Usage
```javascript
import ACPMobileServices from 'react-native-acpmobileservices';

ACPMobileServices.registerExtension();
ACPMobileServices.extensionVersion();
ACPMobileServices.trackDeepLink(URL_FROM_DEEPLINK);
```
