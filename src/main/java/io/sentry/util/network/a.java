package io.sentry.util.network;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f81467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f81468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f81469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f81470d;

    public String a() {
        return this.f81467a;
    }

    public b b() {
        return null;
    }

    public Long c() {
        return this.f81469c;
    }

    public b d() {
        return null;
    }

    public Long e() {
        return this.f81470d;
    }

    public Integer f() {
        return this.f81468b;
    }

    public String toString() {
        return "NetworkRequestData{method='" + this.f81467a + CoreConstants.SINGLE_QUOTE_CHAR + ", statusCode=" + this.f81468b + ", requestBodySize=" + this.f81469c + ", responseBodySize=" + this.f81470d + ", request=" + ((Object) null) + ", response=" + ((Object) null) + CoreConstants.CURLY_RIGHT;
    }
}
