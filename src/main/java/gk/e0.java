package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
@ro0.p
public final class e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b0 f69037h = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f69041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f69042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f69043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f69044g;

    public /* synthetic */ e0(int i11, String str, String str2, String str3, int i12, int i13, String str4, String str5) {
        if (127 != (i11 & 127)) {
            vo0.h1.b(i11, 127, z.f69166a.getDescriptor());
        }
        this.f69038a = str;
        this.f69039b = str2;
        this.f69040c = str3;
        this.f69041d = i12;
        this.f69042e = i13;
        this.f69043f = str4;
        this.f69044g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return p013kotlin.jvm.internal.s.f(this.f69038a, e0Var.f69038a) && p013kotlin.jvm.internal.s.f(this.f69039b, e0Var.f69039b) && p013kotlin.jvm.internal.s.f(this.f69040c, e0Var.f69040c) && this.f69041d == e0Var.f69041d && this.f69042e == e0Var.f69042e && p013kotlin.jvm.internal.s.f(this.f69043f, e0Var.f69043f) && p013kotlin.jvm.internal.s.f(this.f69044g, e0Var.f69044g);
    }

    public final int hashCode() {
        return this.f69044g.hashCode() + c0.a(this.f69043f, (Integer.hashCode(this.f69042e) + ((Integer.hashCode(this.f69041d) + c0.a(this.f69040c, c0.a(this.f69039b, this.f69038a.hashCode() * 31, 31), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "TokenizeCardDto(holderName=" + this.f69038a + ", cardNumber=" + this.f69039b + ", cvv=" + this.f69040c + ", expirationMonth=" + this.f69041d + ", expirationYear=" + this.f69042e + ", countryCode=" + this.f69043f + ", apiKey=" + this.f69044g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public e0(String holderName, String cardNumber, String cvv, int i11, int i12, String countryCode, String apiKey) {
        p013kotlin.jvm.internal.s.k(holderName, "holderName");
        p013kotlin.jvm.internal.s.k(cardNumber, "cardNumber");
        p013kotlin.jvm.internal.s.k(cvv, "cvv");
        p013kotlin.jvm.internal.s.k(countryCode, "countryCode");
        p013kotlin.jvm.internal.s.k(apiKey, "apiKey");
        this.f69038a = holderName;
        this.f69039b = cardNumber;
        this.f69040c = cvv;
        this.f69041d = i11;
        this.f69042e = i12;
        this.f69043f = countryCode;
        this.f69044g = apiKey;
    }
}
