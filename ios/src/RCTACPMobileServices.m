#import "RCTACPMobileServices.h"
#import "ACPMobileServices.h"


@implementation RCTACPMobileServices

RCT_EXPORT_MODULE(ACPMobileServices);

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}

RCT_EXPORT_METHOD(extensionVersion: (RCTPromiseResolveBlock) resolve rejecter:(RCTPromiseRejectBlock) reject) {
    resolve([ACPMobileServices extensionVersion]);
}

RCT_EXPORT_METHOD(registerExtension) {
    [ACPMobileServices registerExtension];
}

RCT_EXPORT_METHOD(trackDeepLink: (nonnull NSURL*) deepLinkURL) {
    [ACPMobileServices trackAdobeDeepLink:deepLinkURL];
}

@end
