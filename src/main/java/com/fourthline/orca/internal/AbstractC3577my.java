package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import com.fourthline.vision.selfie.SelfieScannerError;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.my, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3577my {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.my$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelfieScannerError.values().length];
            try {
                iArr[SelfieScannerError.TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieScannerError.FACE_DISAPPEARED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieScannerError.SCANNER_INTERRUPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfieScannerError.MULTIPLE_FACES_DETECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfieScannerError.RECORDING_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SelfieScannerError.CAMERA_NOT_AVAILABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SelfieScannerError.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SelfieScannerError.GOOGLE_PLAY_SERVICES_NOT_AVAILABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SelfieScannerError.RECOGNITION_MODELS_NOT_DOWNLOADED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SelfieScannerError.CAMERA_PERMISSION_NOT_GRANTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SelfieScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QA.d b(SelfieScannerError selfieScannerError) {
        switch (a.$EnumSwitchMapping$0[selfieScannerError.ordinal()]) {
            case 1:
                return QA.a.a(QA.f27433a, R.string.shared_dialog_error_motion_timeout_title, 0, 2, null);
            case 2:
                return QA.a.a(QA.f27433a, R.string.step_selfie_capture_message_face_not_detected, 0, 2, null);
            case 3:
                return QA.a.a(QA.f27433a, R.string.shared_dialog_error_scanner_stopped_title, 0, 2, null);
            case 4:
                return QA.a.a(QA.f27433a, R.string.shared_dialog_error_selfie_multiple_faces_title, 0, 2, null);
            case 5:
            case 6:
            case 7:
                return QA.a.a(QA.f27433a, R.string.shared_dialog_error_selfie_generic_error_title, 0, 2, null);
            case 8:
                return QA.a.a(QA.f27433a, R.string.shared_dialog_error_camera_google_play_services_not_available_title, 0, 2, null);
            case 9:
                return QA.a.a(QA.f27433a, R.string.shared_dialog_error_camera_google_play_services_not_available_title, 0, 2, null);
            case 10:
                throw new IllegalStateException("FL developer error. Scanner should have asked for permissions");
            case 11:
                throw new IllegalStateException("Audio recording is not yet supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
