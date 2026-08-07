package com.fourthline.orca.internal;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.sdk.R;
import com.fourthline.vision.document.DocumentScannerStep;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class A6 implements InterfaceC3511lb {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentFileSide.values().length];
            try {
                iArr[DocumentFileSide.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentFileSide.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentFileSide.INSIDE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentFileSide.INSIDE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3511lb
    public QA a(DocumentScannerStep step, DocumentType documentType) {
        p013kotlin.jvm.internal.s.k(step, "step");
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        int i11 = a.$EnumSwitchMapping$0[step.getFileSide().ordinal()];
        if (i11 == 1) {
            if (documentType == DocumentType.PASSPORT) {
                return step.isAngled() ? QA.f27433a.a(R.string.step_document_capture_header_scan_tilted_passport, R.string.shared_document_scanner_instruction_passport_front_tilted_accessibility) : QA.f27433a.a(R.string.step_document_capture_header_scan_passport, R.string.shared_document_scanner_instruction_passport_front_accessibility);
            }
            return step.isAngled() ? QA.f27433a.a(R.string.step_document_capture_header_scan_tilted, R.string.shared_document_scanner_instruction_ID_front_tilted_accessibility) : QA.f27433a.a(R.string.step_document_capture_header_scan, R.string.shared_document_scanner_instruction_ID_front_accessibility);
        }
        if (i11 == 2) {
            if (step.isAngled()) {
                return QA.f27433a.a(R.string.step_document_capture_header_scan_tilted_back, R.string.shared_document_scanner_instruction_ID_back_tilted_accessibility);
            }
            return QA.f27433a.a(R.string.step_document_capture_header_scan_back, documentType == DocumentType.PAPER_ID ? R.string.shared_document_scanner_instruction_ID_back_accessibility : R.string.shared_document_scanner_instruction_ID_back_accessibility);
        }
        if (i11 == 3) {
            return QA.f27433a.a(R.string.step_document_capture_header_inner_left, R.string.shared_document_scanner_instruction_paper_id_left_accessibility);
        }
        if (i11 == 4) {
            return step.isAngled() ? QA.f27433a.a(R.string.step_document_capture_header_inner_tilted_right, R.string.shared_document_scanner_instruction_paper_id_right_tilted_accessibility) : QA.f27433a.a(R.string.step_document_capture_header_inner_right, R.string.shared_document_scanner_instruction_paper_id_right_accessibility);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3511lb
    public QA a(DocumentScannerStep step, DocumentType documentType, boolean z11) {
        p013kotlin.jvm.internal.s.k(step, "step");
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        int i11 = a.$EnumSwitchMapping$0[step.getFileSide().ordinal()];
        if (i11 == 1) {
            if (step.isAngled()) {
                return QA.a.a(QA.f27433a, R.string.step_document_capture_message_place_in_frame_front_tilt, 0, 2, null);
            }
            return QA.a.a(QA.f27433a, R.string.step_document_capture_message_place_in_frame_front, 0, 2, null);
        }
        if (i11 == 2) {
            if (step.isAngled()) {
                return QA.a.a(QA.f27433a, R.string.step_document_capture_message_place_in_frame_back_tilt, 0, 2, null);
            }
            if (z11) {
                return QA.a.a(QA.f27433a, R.string.step_document_capture_message_flip_your_document, 0, 2, null);
            }
            return QA.a.a(QA.f27433a, R.string.step_document_capture_message_place_in_frame, 0, 2, null);
        }
        if (i11 != 3 && i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (step.isAngled()) {
            return QA.a.a(QA.f27433a, R.string.step_document_capture_message_place_in_frame_front_tilt, 0, 2, null);
        }
        return QA.b.f27435b;
    }
}
