package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BavPaymentMethod f29382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC3582n2 f29383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29384d;

    public W0(String redirectUrl, BavPaymentMethod bavPaymentMethod, AbstractC3582n2 abstractC3582n2, String str) {
        p013kotlin.jvm.internal.s.k(redirectUrl, "redirectUrl");
        this.f29381a = redirectUrl;
        this.f29382b = bavPaymentMethod;
        this.f29383c = abstractC3582n2;
        this.f29384d = str;
    }

    public final BavPaymentMethod a() {
        return this.f29382b;
    }

    public final String b() {
        AbstractC3582n2 abstractC3582n2 = this.f29383c;
        if (abstractC3582n2 instanceof AbstractC3582n2.Sepa) {
            return ((AbstractC3582n2.Sepa) abstractC3582n2).getPreferredMarket();
        }
        return null;
    }

    public final AbstractC3582n2 c() {
        return this.f29383c;
    }

    public final String d() {
        return this.f29381a;
    }

    public final List e() {
        AbstractC3582n2 abstractC3582n2 = this.f29383c;
        return abstractC3582n2 instanceof AbstractC3582n2.Sepa ? ((AbstractC3582n2.Sepa) abstractC3582n2).getIbanConfiguration() : p013kotlin.collections.v.m();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W0)) {
            return false;
        }
        W0 w11 = (W0) obj;
        return p013kotlin.jvm.internal.s.f(this.f29381a, w11.f29381a) && p013kotlin.jvm.internal.s.f(this.f29382b, w11.f29382b) && p013kotlin.jvm.internal.s.f(this.f29383c, w11.f29383c) && p013kotlin.jvm.internal.s.f(this.f29384d, w11.f29384d);
    }

    public int hashCode() {
        int iHashCode = this.f29381a.hashCode() * 31;
        BavPaymentMethod bavPaymentMethod = this.f29382b;
        int iHashCode2 = (iHashCode + (bavPaymentMethod == null ? 0 : bavPaymentMethod.hashCode())) * 31;
        AbstractC3582n2 abstractC3582n2 = this.f29383c;
        int iHashCode3 = (iHashCode2 + (abstractC3582n2 == null ? 0 : abstractC3582n2.hashCode())) * 31;
        String str = this.f29384d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "BavBundle(redirectUrl=" + this.f29381a + ", paymentMethod=" + this.f29382b + ", providerConfig=" + this.f29383c + ", accountNumber=" + this.f29384d + ")";
    }

    public final void a(BavPaymentMethod bavPaymentMethod) {
        this.f29382b = bavPaymentMethod;
    }

    public final void a(AbstractC3582n2 abstractC3582n2) {
        this.f29383c = abstractC3582n2;
    }

    public final void a(String str) {
        this.f29384d = str;
    }

    public /* synthetic */ W0(String str, BavPaymentMethod bavPaymentMethod, AbstractC3582n2 abstractC3582n2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "fourthline://orca/bav_status/success" : str, (i11 & 2) != 0 ? null : bavPaymentMethod, (i11 & 4) != 0 ? null : abstractC3582n2, (i11 & 8) != 0 ? null : str2);
    }
}
