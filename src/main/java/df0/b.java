package df0;

import ic0.h;
import vc0.c2;
import vc0.x2;

/* JADX INFO: loaded from: classes8.dex */
public enum b {
    OK,
    WAIT,
    ERROR;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f60525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f60526c;

        static {
            int[] iArr = new int[b.values().length];
            f60526c = iArr;
            try {
                iArr[b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60526c[b.WAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60526c[b.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[x2.values().length];
            f60525b = iArr2;
            try {
                iArr2[x2.SIGNEDMESSAGE_INFORMATION_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60525b[x2.SIGNEDMESSAGE_INFORMATION_FAULT_NOT_ON_WHITELIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60525b[x2.SIGNEDMESSAGE_INFORMATION_FAULT_AES_DECRYPT_AUTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60525b[x2.SIGNEDMESSAGE_INFORMATION_FAULT_ECDSA_INPUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60525b[x2.SIGNEDMESSAGE_INFORMATION_FAULT_ECDSA_SIGNATURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f60525b[x2.SIGNEDMESSAGE_INFORMATION_FAULT_INVALID_TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f60525b[x2.SIGNEDMESSAGE_INFORMATION_FAULT_IV_SMALLER_THAN_EXPECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f60525b[x2.SIGNEDMESSAGE_INFORMATION_FAULT_LOCAL_ENTITY_RESULT.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f60525b[x2.SIGNEDMESSAGE_INFORMATION_FAULT_LOCAL_ENTITY_START.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f60525b[x2.SIGNEDMESSAGE_INFORMATION_FAULT_TOKEN_AND_COUNTER_INVALID.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f60525b[x2.SIGNEDMESSAGE_INFORMATION_FAULT_UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr3 = new int[c2.values().length];
            f60524a = iArr3;
            try {
                iArr3[c2.OPERATIONSTATUS_OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f60524a[c2.OPERATIONSTATUS_WAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f60524a[c2.OPERATIONSTATUS_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static String fromMessageInformation(x2 x2Var) {
        int i11 = a.f60525b[x2Var.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? "PHONE_KEY_COMMAND_FAILURE" : "PHONE_KEY_NOT_ON_WHITELIST";
        }
        return "PHONE_KEY_COMMAND_NO_ERROR";
    }

    public static b fromOperationStatus(c2 c2Var) {
        int i11 = a.f60524a[c2Var.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? ERROR : WAIT;
        }
        return OK;
    }

    public h toCommandResult() {
        int i11 = a.f60526c[ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? h.RESULT_UNKNOWN_ERROR : h.RESULT_VEHICLE_WAIT_ERROR;
        }
        return h.RESULT_SUCCESS;
    }
}
