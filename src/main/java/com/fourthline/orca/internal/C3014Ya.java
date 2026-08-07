package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import com.fourthline.vision.document.DocumentScannerError;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3014Ya implements InterfaceC3216ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f29850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f29851b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ya$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentScannerError.values().length];
            try {
                iArr[DocumentScannerError.TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentScannerError.SCANNER_INTERRUPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentScannerError.RECORDING_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentScannerError.CAMERA_NOT_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentScannerError.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentScannerError.CAMERA_PERMISSION_NOT_GRANTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C3014Ya(boolean z11, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f29850a = z11;
        this.f29851b = imageServiceLocator;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3216ef
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e buildStateFor(AbstractC3502l8.e error) {
        QA.d dVarA;
        p013kotlin.jvm.internal.s.k(error, "error");
        switch (a.$EnumSwitchMapping$0[error.a().ordinal()]) {
            case 1:
                dVarA = QA.a.a(QA.f27433a, R.string.shared_dialog_error_document_timeout_title, 0, 2, null);
                break;
            case 2:
                dVarA = QA.a.a(QA.f27433a, R.string.shared_dialog_error_scanner_stopped_title, 0, 2, null);
                break;
            case 3:
            case 4:
            case 5:
                dVarA = QA.a.a(QA.f27433a, R.string.shared_dialog_error_document_generic_error_title, 0, 2, null);
                break;
            case 6:
            case 7:
                throw new IllegalStateException("Permissions should be granted prior starting the scanner!");
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new InterfaceC4001ws.e(this.f29851b.a(EnumC3689ph.B0), dVarA, new InterfaceC3807sD.l(null, 1, null), this.f29850a ? new InterfaceC3807sD.a(null, 1, null) : null, true);
    }
}
