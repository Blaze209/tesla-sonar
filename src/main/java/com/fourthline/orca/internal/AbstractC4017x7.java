package com.fourthline.orca.internal;

import com.fourthline.vision.document.ocr.OcrValidationError;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.x7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4017x7 {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.x7$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OcrValidationError.values().length];
            try {
                iArr[OcrValidationError.ISSUING_COUNTRY_NOT_SUPPORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OcrValidationError.DOCUMENT_TYPE_NOT_SUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OcrValidationError.NATIONALITY_NOT_SUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OcrValidationError.DOCUMENT_EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OcrValidationError.PERSON_NOT_ADULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AbstractC3641oc a(OcrValidationError ocrValidationError) {
        p013kotlin.jvm.internal.s.k(ocrValidationError, "<this>");
        int i11 = a.$EnumSwitchMapping$0[ocrValidationError.ordinal()];
        if (i11 == 1) {
            return AbstractC3641oc.g.f34200a;
        }
        if (i11 == 2) {
            return AbstractC3641oc.e.f34198a;
        }
        if (i11 == 3) {
            return AbstractC3641oc.i.f34202a;
        }
        if (i11 == 4) {
            return AbstractC3641oc.a.f34194a;
        }
        if (i11 == 5) {
            return AbstractC3641oc.j.f34203a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
