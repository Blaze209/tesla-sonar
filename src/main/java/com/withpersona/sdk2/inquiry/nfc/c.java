package com.withpersona.sdk2.inquiry.nfc;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import java.util.List;
import nh0.MrzKey;
import nh0.PassportNfcStrings;
import nh0.m;
import qj0.f;
import qj0.i;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f58355a;

    c(m mVar) {
        this.f58355a = mVar;
    }

    public static i<b.a> b(m mVar) {
        return f.a(new c(mVar));
    }

    @Override // com.withpersona.sdk2.inquiry.nfc.b.a
    public b a(String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends nh0.c> list, StepStyles.UiStepStyle uiStepStyle, Integer num, GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        return this.f58355a.b(str, mrzKey, passportNfcStrings, list, uiStepStyle, num, governmentIdNfcScanStyles);
    }
}
