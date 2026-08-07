package com.fourthline.orca.internal;

import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public enum Tj {
    BavIntro("bav-intro.json"),
    SelfieLiveness("liveness.json"),
    SelfieLivenessLeft("liveness-left.json"),
    SelfieLivenessRight("liveness-right.json"),
    LoadingSpinner("loading-spinner.json"),
    NetworkSpinnerThick("network-spinner-thick.json"),
    NetworkSpinnerBold("network-spinner-bold.json"),
    CameraPermission("orca-img-permission-camera.json"),
    DocumentIntro("document-intro.json"),
    SelfieIntro("selfie-intro.json"),
    LocationIntro("location-intro.json"),
    LocationPermission("orca-img-permission-location.json"),
    LocationPermissionPrecise("orca-img-permission-location-precise.json"),
    PoaDocumentPlaceholder("poa-document-placeholder.json"),
    DocumentReady("document-ready.json"),
    PoaIntro("poa-intro.json"),
    TinIntro("tin-intro.json"),
    QesIntro("sign-intro.json"),
    NfcIntro("nfc-intro.json"),
    NfcCanIntro("nfc-can-intro.json"),
    NfcEnable("orca-img-enable-nfc.json"),
    IdCard("id-card.json"),
    IdCardBack("id-card-back.json"),
    IdCardFrench("id-card-french.json"),
    IdCardBackTilt("id-card-back-tilt.json"),
    IdCardTilt("id-card-tilt.json"),
    IdCardFrenchBack("id-card-french-back.json"),
    IdCardFrenchBackTilt("id-card-french-back-tilt.json"),
    IdCardFrenchTilt("id-card-french-tilt.json"),
    DriverLicense("driver-license.json"),
    DriverLicenseBack("driver-license-back.json"),
    DriverLicenseBackTilt("driver-license-back-tilt.json"),
    DriverLicenseTilt("driver-license-tilt.json"),
    DutchDriverLicense("dutch-driver-license.json"),
    DutchDriverLicenseBack("dutch-driver-license-back.json"),
    DutchDriverLicenseBackTilt("dutch-driver-license-back-tilt.json"),
    DutchDriverLicenseTilt("dutch-driver-license-tilt.json"),
    Passport("passport.json"),
    PassportTilt("passport-tilt.json"),
    PaperIdInsideLeft("paper-id-inside-left.json"),
    PaperIdInsideRight("paper-id-inside-right.json"),
    PaperIdInsideRightTilted("paper-id-inside-right-tilted.json"),
    PaperIdBack("paper-id-back.json"),
    PassportBackQr("passport-back-qr.json");

    private static final /* synthetic */ EnumEntries V = on0.a.a(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27914b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27939a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    Tj(String str) {
        this.f27939a = str;
    }

    public final String b() {
        return this.f27939a;
    }
}
