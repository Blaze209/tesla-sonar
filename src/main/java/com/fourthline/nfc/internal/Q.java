package com.fourthline.nfc.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.core.DocumentType;
import com.fourthline.nfc.ExtraNfcScannerConfig;
import com.fourthline.nfc.NfcDataGroup;
import com.fourthline.nfc.NfcScannerConfig;
import com.fourthline.nfc.NfcScannerError;
import com.fourthline.nfc.NfcScannerResult;
import com.fourthline.nfc.NfcScannerSecurityKey;
import com.fourthline.nfc.NfcScannerStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NfcScannerConfig f24616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f24617b;

    public Q(NfcScannerConfig nfcScannerConfig, ExtraNfcScannerConfig extraNfcScannerConfig) {
        String str;
        DocumentType documentType;
        String strA;
        String issueCountry;
        p013kotlin.jvm.internal.s.k(nfcScannerConfig, "nfcScannerConfig");
        this.f24616a = nfcScannerConfig;
        String str2 = "N/A";
        Pair pairA = jn0.x.a("issuing_country", (extraNfcScannerConfig == null || (issueCountry = extraNfcScannerConfig.getIssueCountry()) == null) ? "N/A" : issueCountry);
        if (extraNfcScannerConfig != null && (documentType = extraNfcScannerConfig.getDocumentType()) != null && (strA = a(documentType)) != null) {
            str2 = strA;
        }
        Pair pairA2 = jn0.x.a(AnalyticsAttribute.DocumentType, str2);
        NfcScannerSecurityKey key = nfcScannerConfig.getKey();
        if ((key instanceof NfcScannerSecurityKey.BacKey) || (key instanceof NfcScannerSecurityKey.PaceKey)) {
            str = "mrtd";
        } else {
            if (!(key instanceof NfcScannerSecurityKey.BapKey)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "idl";
        }
        this.f24617b = p013kotlin.collections.v0.o(pairA, pairA2, jn0.x.a("security_key_type", str));
    }

    private final void b() {
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.clearContext(AnalyticsContext.Scanner);
        }
    }

    @Override // com.fourthline.nfc.internal.K
    public void a() {
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "nfc_start", null, p013kotlin.collections.v0.m(jn0.x.a("document_attributes", this.f24617b), a("nfc_start")), 2, null);
        L l11 = new L(this.f24616a.getKey());
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.registerContext(l11);
        }
        O o11 = O.f24612a;
        AnalyticsInterface analytics2 = fourthlineAnalytics.getAnalytics();
        if (analytics2 != null) {
            analytics2.trackNew(o11);
        }
    }

    @Override // com.fourthline.nfc.internal.K
    public void onStepUpdate(NfcScannerStep step) {
        p013kotlin.jvm.internal.s.k(step, "step");
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "nfc_step_update", null, p013kotlin.collections.v0.m(jn0.x.a("document_attributes", this.f24617b), a(step), a("nfc_step_update")), 2, null);
        P p11 = new P(step);
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(p11);
        }
    }

    @Override // com.fourthline.nfc.internal.K
    public void onSuccess(NfcScannerResult result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "nfc_success", null, p013kotlin.collections.v0.m(jn0.x.a("document_attributes", this.f24617b), a(result.getDataGroups()), a("nfc_success")), 2, null);
        M m11 = new M(result.getDataGroups());
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(m11);
        }
        b();
    }

    @Override // com.fourthline.nfc.internal.K
    public void a(NfcScannerStep step, NfcScannerError error, Throwable th2) {
        p013kotlin.jvm.internal.s.k(step, "step");
        p013kotlin.jvm.internal.s.k(error, "error");
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        fourthlineAnalytics.e("nfc_fail", th2, p013kotlin.collections.v0.m(jn0.x.a("document_attributes", this.f24617b), a(step), a(error), a(th2), a("nfc_fail")));
        N n11 = new N(error, th2, step);
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(n11);
        }
        b();
    }

    private final Pair a(Throwable th2) {
        String str;
        if (th2 != null) {
            str = th2.getClass().getSimpleName() + " - " + th2.getMessage();
        } else {
            str = "N/A";
        }
        return jn0.x.a("error_description", str);
    }

    private final Pair a(List list) {
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(((NfcDataGroup) it.next()).getType()));
        }
        return jn0.x.a("data_groups", arrayList);
    }

    private final Pair a(NfcScannerError nfcScannerError) {
        return jn0.x.a("fatal_error", a((Enum) nfcScannerError));
    }

    private final Pair a(NfcScannerStep nfcScannerStep) {
        return jn0.x.a("step", a((Enum) nfcScannerStep));
    }

    private final Pair a(String str) {
        return jn0.x.a("nfc_flow", str);
    }

    private final String a(Enum r11) {
        String strName = r11.name();
        Locale ROOT = Locale.ROOT;
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
