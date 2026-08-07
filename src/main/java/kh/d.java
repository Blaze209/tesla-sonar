package kh;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f86086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f86088c = System.currentTimeMillis() + CoreConstants.MILLIS_IN_ONE_DAY;

    public d(String str, int i11) {
        this.f86086a = str;
        this.f86087b = i11;
    }

    public String toString() {
        return "ValueData{value='" + this.f86086a + CoreConstants.SINGLE_QUOTE_CHAR + ", code=" + this.f86087b + ", expired=" + this.f86088c + CoreConstants.CURLY_RIGHT;
    }
}
