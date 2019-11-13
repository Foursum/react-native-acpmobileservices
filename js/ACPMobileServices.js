import { NativeModules } from 'react-native';

const RCTACPMobileServices = NativeModules.ACPMobileServices;

export default class ACPMobileServices {
  /**
   * Returns the version of ACPMobileServices extension
   */
  static extensionVersion = () => {
    return Promise.resolve(RCTACPMobileServices.extensionVersion());
  }

  /**
   * Registers the ACPMobileServices extension with ACPCore
   */
  static registerExtension = () => {
    RCTACPMobileServices.registerExtension();
  }

  static trackDeepLink = deepLinkURL => {
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
}