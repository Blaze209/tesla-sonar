package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.mrz.IdlMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.nfc.NfcScannerSecurityKey;
import com.fourthline.vision.document.DocumentScannerResult;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class Gw implements Qn {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.fourthline.orca.internal.Qn
    public Jn a(C4104z8 bundle, Jp personBundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        X7 x7O = bundle.o();
        DocumentType documentTypeC = x7O != null ? x7O.c() : null;
        if ((documentTypeC == null ? -1 : a.$EnumSwitchMapping$0[documentTypeC.ordinal()]) == 1) {
            DocumentScannerResult documentScannerResultB = bundle.b();
            MrzInfo mrzInfo = documentScannerResultB != null ? documentScannerResultB.getMrzInfo() : null;
            IdlMrzInfo idlMrzInfo = mrzInfo instanceof IdlMrzInfo ? (IdlMrzInfo) mrzInfo : null;
            String rawMrz = (idlMrzInfo == null || !idlMrzInfo.getValidationErrors().isEmpty()) ? null : idlMrzInfo.getRawMrz();
            if (rawMrz != null) {
                return new Jn.a(NfcScannerSecurityKey.INSTANCE.createWithIdlMrz(rawMrz));
            }
            return null;
        }
        String strG = bundle.g().g();
        Date dateB = bundle.g().b();
        Date dateB2 = personBundle.b();
        if (strG == null || dateB == null || dateB2 == null) {
            return null;
        }
        NfcScannerSecurityKey.Companion companion = NfcScannerSecurityKey.INSTANCE;
        String upperCase = strG.toUpperCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
        return new Jn.b(companion.createWithMrtdData(upperCase, dateB2, dateB));
    }
}
