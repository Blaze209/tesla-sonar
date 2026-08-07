package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.sdk.R;
import com.fourthline.vision.document.DocumentScannerStep;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3677pB implements InterfaceC3511lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MA f34469a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pB$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MA.values().length];
            try {
                iArr[MA.ITA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MA.ESP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MA.NLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C3677pB(MA taxationCountry) {
        p013kotlin.jvm.internal.s.k(taxationCountry, "taxationCountry");
        this.f34469a = taxationCountry;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3511lb
    public QA a(DocumentScannerStep step, DocumentType documentType) {
        p013kotlin.jvm.internal.s.k(step, "step");
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        int i11 = a.$EnumSwitchMapping$0[this.f34469a.ordinal()];
        if (i11 == 1) {
            return QA.f27433a.a(R.string.step_tin_capture_header_tin_ita, R.string.shared_tin_scanner_instruction_codice_fiscale_accessibility);
        }
        if (i11 == 2) {
            return QA.f27433a.a(R.string.step_tin_capture_header_tin_esp, R.string.shared_tin_scanner_instruction_NIE_accessibility);
        }
        if (i11 == 3) {
            return QA.f27433a.a(R.string.step_tin_capture_header_page_qr_code, R.string.shared_tin_scanner_instruction_passport_QR_code_accessibility);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3511lb
    public QA a(DocumentScannerStep step, DocumentType documentType, boolean z11) {
        p013kotlin.jvm.internal.s.k(step, "step");
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        int i11 = a.$EnumSwitchMapping$0[this.f34469a.ordinal()];
        if (i11 == 1) {
            return QA.a.a(QA.f27433a, R.string.step_tin_capture_message_tin_ita, 0, 2, null);
        }
        if (i11 == 2) {
            return QA.a.a(QA.f27433a, R.string.step_tin_capture_message_tin_esp, 0, 2, null);
        }
        if (i11 == 3) {
            return QA.a.a(QA.f27433a, R.string.step_tin_capture_message_tin_nld, 0, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
