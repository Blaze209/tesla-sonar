package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f69072c;

    public j(String apiKey, String countryCode, boolean z11) {
        p013kotlin.jvm.internal.s.k(apiKey, "apiKey");
        p013kotlin.jvm.internal.s.k(countryCode, "countryCode");
        this.f69070a = apiKey;
        this.f69071b = countryCode;
        this.f69072c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p013kotlin.jvm.internal.s.f(this.f69070a, jVar.f69070a) && p013kotlin.jvm.internal.s.f(this.f69071b, jVar.f69071b) && this.f69072c == jVar.f69072c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69072c) + c0.a(this.f69071b, this.f69070a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Settings(apiKey=" + this.f69070a + ", countryCode=" + this.f69071b + ", testMode=" + this.f69072c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
