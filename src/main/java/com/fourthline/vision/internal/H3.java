package com.fourthline.vision.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerConfig;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class H3 implements InterfaceC4234l4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f37744b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f37745c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4227k4 f37746a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentType.PAPER_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public H3(InterfaceC4227k4 dataSource) {
        p013kotlin.jvm.internal.s.k(dataSource, "dataSource");
        this.f37746a = dataSource;
    }

    private final int mrzTop(C4165c4 c4165c4) {
        double d11;
        int top = c4165c4.getTop();
        double dHeight = c4165c4.height();
        double d12 = 1;
        switch (b.$EnumSwitchMapping$0[((DocumentScannerConfig) this.f37746a.config()).getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
                d11 = 0.43d;
                break;
            case 4:
                d11 = 0.264d;
                break;
            case 5:
                d11 = 0.314d;
                break;
            case 6:
                d11 = 0.225d;
                break;
            case 7:
            case 8:
            case 9:
                d11 = 0.0d;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return top + ((int) (dHeight * (d12 - d11)));
    }

    @Override // com.fourthline.vision.internal.InterfaceC4234l4
    public C4165c4 contentDetectionArea() {
        C4165c4 c4165c4ContentDetectionArea = this.f37746a.contentDetectionArea();
        return C4165c4.copy$default(c4165c4ContentDetectionArea, 0, mrzTop(c4165c4ContentDetectionArea), 0, 0, 13, null);
    }
}
