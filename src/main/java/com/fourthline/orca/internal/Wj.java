package com.fourthline.orca.internal;

import com.fourthline.sdk.assets.R;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Wj implements Uj {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Tj.values().length];
            try {
                iArr[Tj.BavIntro.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tj.CameraPermission.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Tj.DocumentIntro.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Tj.SelfieIntro.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Tj.NfcIntro.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Tj.PoaIntro.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Tj.TinIntro.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Tj.QesIntro.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Tj.NfcCanIntro.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Tj.NfcEnable.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Tj.LocationIntro.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Tj.LocationPermission.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Tj.LocationPermissionPrecise.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Tj.LoadingSpinner.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Tj.SelfieLiveness.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Tj.SelfieLivenessLeft.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Tj.SelfieLivenessRight.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Tj.NetworkSpinnerThick.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[Tj.NetworkSpinnerBold.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[Tj.PoaDocumentPlaceholder.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[Tj.DocumentReady.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[Tj.IdCard.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[Tj.IdCardBack.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[Tj.IdCardBackTilt.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[Tj.IdCardTilt.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[Tj.IdCardFrench.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[Tj.IdCardFrenchBack.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[Tj.IdCardFrenchBackTilt.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[Tj.IdCardFrenchTilt.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[Tj.DriverLicense.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[Tj.DriverLicenseBack.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[Tj.DriverLicenseBackTilt.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[Tj.DriverLicenseTilt.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[Tj.DutchDriverLicense.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[Tj.DutchDriverLicenseBack.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[Tj.DutchDriverLicenseBackTilt.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[Tj.DutchDriverLicenseTilt.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[Tj.Passport.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[Tj.PassportTilt.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[Tj.PaperIdInsideLeft.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[Tj.PaperIdInsideRight.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[Tj.PaperIdInsideRightTilted.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[Tj.PaperIdBack.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[Tj.PassportBackQr.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.fourthline.orca.internal.Uj
    public Yj a(Tj key) {
        int i11;
        p013kotlin.jvm.internal.s.k(key, "key");
        try {
            switch (a.$EnumSwitchMapping$0[key.ordinal()]) {
                case 1:
                    i11 = R.raw.bav_intro;
                    break;
                case 2:
                    i11 = R.raw.orca_img_permission_camera;
                    break;
                case 3:
                    i11 = R.raw.document_intro;
                    break;
                case 4:
                    i11 = R.raw.selfie_intro;
                    break;
                case 5:
                    i11 = R.raw.nfc_intro;
                    break;
                case 6:
                    i11 = R.raw.poa_intro;
                    break;
                case 7:
                    i11 = R.raw.tin_intro;
                    break;
                case 8:
                    i11 = R.raw.sign_intro;
                    break;
                case 9:
                    i11 = R.raw.nfc_can_intro;
                    break;
                case 10:
                    i11 = R.raw.orca_img_enable_nfc;
                    break;
                case 11:
                    i11 = R.raw.location_intro;
                    break;
                case 12:
                    i11 = R.raw.orca_img_permission_location;
                    break;
                case 13:
                    i11 = R.raw.orca_img_permission_location_precise;
                    break;
                case 14:
                    i11 = R.raw.loading_spinner;
                    break;
                case 15:
                    i11 = R.raw.liveness;
                    break;
                case 16:
                    i11 = R.raw.liveness_left;
                    break;
                case 17:
                    i11 = R.raw.liveness_right;
                    break;
                case 18:
                    i11 = R.raw.network_spinner_thick;
                    break;
                case 19:
                    i11 = R.raw.network_spinner_bold;
                    break;
                case 20:
                    i11 = R.raw.poa_document_placeholder;
                    break;
                case 21:
                    i11 = R.raw.document_ready;
                    break;
                case 22:
                    i11 = R.raw.id_card;
                    break;
                case 23:
                    i11 = R.raw.id_card_back;
                    break;
                case 24:
                    i11 = R.raw.id_card_back_tilt;
                    break;
                case 25:
                    i11 = R.raw.id_card_tilt;
                    break;
                case 26:
                    i11 = R.raw.id_card_french;
                    break;
                case 27:
                    i11 = R.raw.id_card_french_back;
                    break;
                case 28:
                    i11 = R.raw.id_card_french_back_tilt;
                    break;
                case 29:
                    i11 = R.raw.id_card_french_tilt;
                    break;
                case 30:
                    i11 = R.raw.driver_license;
                    break;
                case 31:
                    i11 = R.raw.driver_license_back;
                    break;
                case 32:
                    i11 = R.raw.driver_license_back_tilt;
                    break;
                case 33:
                    i11 = R.raw.driver_license_tilt;
                    break;
                case 34:
                    i11 = R.raw.dutch_driver_license;
                    break;
                case 35:
                    i11 = R.raw.dutch_driver_license_back;
                    break;
                case 36:
                    i11 = R.raw.dutch_driver_license_back_tilt;
                    break;
                case 37:
                    i11 = R.raw.dutch_driver_license_tilt;
                    break;
                case 38:
                    i11 = R.raw.passport;
                    break;
                case 39:
                    i11 = R.raw.passport_tilt;
                    break;
                case 40:
                    i11 = R.raw.paper_id_inside_left;
                    break;
                case 41:
                    i11 = R.raw.paper_id_inside_right;
                    break;
                case 42:
                    i11 = R.raw.paper_id_inside_right_tilted;
                    break;
                case 43:
                    i11 = R.raw.paper_id_back;
                    break;
                case 44:
                    i11 = R.raw.passport_back_qr;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return new Yj.b(i11);
        } catch (NoClassDefFoundError unused) {
            return new Yj.b(0);
        }
    }
}
