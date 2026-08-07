package fz;

import dz.d0;
import dz.x0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lfz/d;", "Lfz/h;", "", "", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "toBarcodeType", "()I", "Ljava/lang/String;", "getUnionValue", "()Ljava/lang/String;", "Companion", "a", "CODE_128", "CODE_39", "CODE_93", "CODABAR", "EAN_13", "EAN_8", "ITF", "UPC_E", "UPC_A", "QR", "PDF_417", "AZTEC", "DATA_MATRIX", "UNKNOWN", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum d implements h {
    CODE_128("code-128"),
    CODE_39("code-39"),
    CODE_93("code-93"),
    CODABAR("codabar"),
    EAN_13("ean-13"),
    EAN_8("ean-8"),
    ITF("itf"),
    UPC_E("upc-e"),
    UPC_A("upc-a"),
    QR("qr"),
    PDF_417("pdf-417"),
    AZTEC("aztec"),
    DATA_MATRIX("data-matrix"),
    UNKNOWN("unknown");

    private final String unionValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: fz.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lfz/d$a;", "", "Lfz/d;", "<init>", "()V", "", "barcodeType", "a", "(I)Lfz/d;", "", "unionValue", "b", "(Ljava/lang/String;)Lfz/d;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(int barcodeType) {
            if (barcodeType == 1) {
                return d.CODE_128;
            }
            if (barcodeType == 2) {
                return d.CODE_39;
            }
            switch (barcodeType) {
                case 4:
                    return d.CODE_93;
                case 8:
                    return d.CODABAR;
                case 16:
                    return d.DATA_MATRIX;
                case 32:
                    return d.EAN_13;
                case 64:
                    return d.EAN_8;
                case 128:
                    return d.ITF;
                case 256:
                    return d.QR;
                case 512:
                    return d.UPC_A;
                case 1024:
                    return d.UPC_E;
                case 2048:
                    return d.PDF_417;
                case 4096:
                    return d.AZTEC;
                default:
                    return d.UNKNOWN;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public d b(String unionValue) throws x0 {
            if (unionValue != null) {
                switch (unionValue.hashCode()) {
                    case -1310519683:
                        if (unionValue.equals("ean-13")) {
                            return d.EAN_13;
                        }
                        break;
                    case -869195177:
                        if (unionValue.equals("code-128")) {
                            return d.CODE_128;
                        }
                        break;
                    case -720296449:
                        if (unionValue.equals("pdf-417")) {
                            return d.PDF_417;
                        }
                        break;
                    case 3617:
                        if (unionValue.equals("qr")) {
                            return d.QR;
                        }
                        break;
                    case 104603:
                        if (unionValue.equals("itf")) {
                            return d.ITF;
                        }
                        break;
                    case 93330745:
                        if (unionValue.equals("aztec")) {
                            return d.AZTEC;
                        }
                        break;
                    case 96272509:
                        if (unionValue.equals("ean-8")) {
                            return d.EAN_8;
                        }
                        break;
                    case 111485180:
                        if (unionValue.equals("upc-a")) {
                            return d.UPC_A;
                        }
                        break;
                    case 111485184:
                        if (unionValue.equals("upc-e")) {
                            return d.UPC_E;
                        }
                        break;
                    case 941726090:
                        if (unionValue.equals("codabar")) {
                            return d.CODABAR;
                        }
                        break;
                    case 941792838:
                        if (unionValue.equals("code-39")) {
                            return d.CODE_39;
                        }
                        break;
                    case 941793018:
                        if (unionValue.equals("code-93")) {
                            return d.CODE_93;
                        }
                        break;
                    case 1350827844:
                        if (unionValue.equals("data-matrix")) {
                            return d.DATA_MATRIX;
                        }
                        break;
                }
            }
            if (unionValue == null) {
                unionValue = "(null)";
            }
            throw new x0("codeType", unionValue);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66737a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.CODE_128.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.CODE_39.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CODE_93.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.CODABAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.EAN_13.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.EAN_8.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d.ITF.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d.UPC_E.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d.UPC_A.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[d.QR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[d.PDF_417.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[d.AZTEC.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[d.DATA_MATRIX.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[d.UNKNOWN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f66737a = iArr;
        }
    }

    d(String str) {
        this.unionValue = str;
    }

    public static EnumEntries<d> getEntries() {
        return $ENTRIES;
    }

    @Override // fz.h
    public String getUnionValue() {
        return this.unionValue;
    }

    public final int toBarcodeType() throws d0 {
        switch (b.f66737a[ordinal()]) {
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
                return 1024;
            case 9:
                return 512;
            case 10:
                return 256;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 16;
            case 14:
                throw new d0(getUnionValue());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
