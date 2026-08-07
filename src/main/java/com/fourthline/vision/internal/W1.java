package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerError;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class W1 implements InterfaceC4248n4 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC4241m4.values().length];
            try {
                iArr[EnumC4241m4.GOOGLE_PLAY_SERVICES_NOT_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4241m4.RECOGNITION_MODELS_NOT_DOWNLOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4241m4.CONTENT_DISAPPEARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4241m4.MANUAL_MODE_NOT_ALLOWED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4241m4.MULTIPLE_FACES_DETECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC4241m4.TAKE_SNAPSHOT_NOT_ALLOWED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC4241m4.MOVE_TO_NEXT_STEP_NOT_ALLOWED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC4241m4.RESET_CURRENT_STEP_NOT_ALLOWED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC4241m4.NO_CAMERA_PERMISSION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC4241m4.NO_AUDIO_PERMISSION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC4241m4.INVALID_CONTENT_DETECTION_AREA.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC4241m4.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC4241m4.TIMEOUT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC4241m4.CAMERA_NOT_AVAILABLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC4241m4.RECORDING_FAILED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC4241m4.SCANNER_INTERRUPTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.fourthline.vision.internal.InterfaceC4248n4
    public DocumentScannerError convertError(EnumC4241m4 error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        switch (a.$EnumSwitchMapping$0[error.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalArgumentException(error.name() + " is not a DocumentScannerError");
            case 11:
            case 12:
                return DocumentScannerError.UNKNOWN;
            case 13:
                return DocumentScannerError.TIMEOUT;
            case 14:
                return DocumentScannerError.CAMERA_NOT_AVAILABLE;
            case 15:
                return DocumentScannerError.RECORDING_FAILED;
            case 16:
                return DocumentScannerError.SCANNER_INTERRUPTED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
