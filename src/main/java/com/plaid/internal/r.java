package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC4427g7 f48075a;

    public r(EnumC4427g7 enumC4427g7) {
        super("device descriptor contains an error");
        this.f48075a = enumC4427g7;
    }

    public final T0 a() {
        return getCause() instanceof C4509q ? ((C4509q) getCause()).f48048a : T0.GENERIC_UNKNOWN_REASON;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "step=" + this.f48075a + "; " + super.getMessage();
    }

    public r(EnumC4427g7 enumC4427g7, Throwable th2) {
        super(th2.getMessage(), th2);
        this.f48075a = enumC4427g7;
    }
}
