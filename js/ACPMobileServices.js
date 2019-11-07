import { NativeModules } from 'react-native';

const RCTACPMobileServices = NativeModules.ACPMobileServices;

/**
 * Returns the version of ACPMobileServices extension
 */
const extensionVersion = () => {
  return Promise.resolve(RCTACPMobileServices.extensionVersion());
}

/**
 * Registers the ACPMobileServices extension with ACPCore
 */
const registerExtension = () => {
  RCTACPMobileServices.registerExtension();
}

const trackDeepLink = deepLinkURL => {
  if (deepLinkURL !== undefined && deepLinkURL !== null && deepLinkURL !== "")
    try {
      RCTACPMobileServices.trackDeepLink(deepLinkURL)
    }
    catch(err) { 
      throw "Deep link could not be tracked or was invalid!";
    }
  else
    throw "Deep link URL is required!";
}

export { extensionVersion, registerExtension }