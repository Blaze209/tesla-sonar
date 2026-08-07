package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public final class y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f81618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f81619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Double f81620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f81621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Double f81622e;

    public y8(Boolean bool) {
        this(bool, null);
    }

    public Double a() {
        return this.f81622e;
    }

    public Boolean b() {
        return this.f81621d;
    }

    public Double c() {
        return this.f81620c;
    }

    public Double d() {
        return this.f81619b;
    }

    public Boolean e() {
        return this.f81618a;
    }

    public y8(Boolean bool, Double d11) {
        this(bool, d11, null, Boolean.FALSE, null);
    }

    public y8(Boolean bool, Double d11, Double d12) {
        this(bool, d11, d12, Boolean.FALSE, null);
    }

    public y8(Boolean bool, Double d11, Boolean bool2, Double d12) {
        this(bool, d11, null, bool2, d12);
    }

    public y8(Boolean bool, Double d11, Double d12, Boolean bool2, Double d13) {
        this.f81618a = bool;
        this.f81619b = d11;
        this.f81620c = d12;
        this.f81621d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f81622e = d13;
    }
}
