package com.rncamerakit;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/rncamerakit/f;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "toBarcodeType", "()I", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Companion", "a", "CODE_128", "CODE_39", "CODE_93", "CODABAR", "EAN_13", "EAN_8", "ITF", "UPC_A", "UPC_E", "QR", "PDF_417", "AZTEC", "DATA_MATRIX", "UNKNOWN", "react-native-camera-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum f {
    CODE_128("code-128"),
    CODE_39("code-39"),
    CODE_93("code-93"),
    CODABAR("codabar"),
    EAN_13("ean-13"),
    EAN_8("ean-8"),
    ITF("itf"),
    UPC_A("upc-a"),
    UPC_E("upc-e"),
    QR("qr"),
    PDF_417("pdf-417"),
    AZTEC("aztec"),
    DATA_MATRIX("data-matrix"),
    UNKNOWN("unknown");

    private final String code;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.rncamerakit.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/rncamerakit/f$a;", "", "<init>", "()V", "", "barcodeType", "Lcom/rncamerakit/f;", "a", "(I)Lcom/rncamerakit/f;", "", "name", "b", "(Ljava/lang/String;)Lcom/rncamerakit/f;", "react-native-camera-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(int barcodeType) {
            if (barcodeType == 1) {
                return f.CODE_128;
            }
            if (barcodeType == 2) {
                return f.CODE_39;
            }
            switch (barcodeType) {
                case 4:
                    return f.CODE_93;
                case 8:
                    return f.CODABAR;
                case 16:
                    return f.DATA_MATRIX;
                case 32:
                    return f.EAN_13;
                case 64:
                    return f.EAN_8;
                case 128:
                    return f.ITF;
                case 256:
                    return f.QR;
                case 512:
                    return f.UPC_A;
                case 1024:
                    return f.UPC_E;
                case 2048:
                    return f.PDF_417;
                case 4096:
                    return f.AZTEC;
                default:
                    return f.UNKNOWN;
            }
        }

        public final f b(String name) {
            for (f fVar : f.values()) {
                if (s.f(fVar.getCode(), name)) {
                    return fVar;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49012a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.CODE_128.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.CODE_39.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.CODE_93.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.CODABAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.EAN_13.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.EAN_8.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f.ITF.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[f.UPC_A.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[f.UPC_E.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[f.QR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[f.PDF_417.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[f.AZTEC.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[f.DATA_MATRIX.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[f.UNKNOWN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f49012a = iArr;
        }
    }

    f(String str) {
        this.code = str;
    }

    public static EnumEntries<f> getEntries() {
        return $ENTRIES;
    }

    public final String getCode() {
        return this.code;
    }

    public final int toBarcodeType() {
        switch (b.f49012a[ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 512;
            case 9:
                return 1024;
            case 10:
                return 256;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 16;
            case 14:
                return -1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
