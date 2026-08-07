package io.sentry.android.core;

import io.sentry.q7;

/* JADX INFO: loaded from: classes9.dex */
final class o0 implements io.sentry.transport.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f79639a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f79640a;

        static {
            int[] iArr = new int[io.sentry.m0.a.values().length];
            f79640a = iArr;
            try {
                iArr[io.sentry.m0.a.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79640a[io.sentry.m0.a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f79640a[io.sentry.m0.a.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    o0(q7 q7Var) {
        this.f79639a = q7Var;
    }

    boolean a(io.sentry.m0.a aVar) {
        int i11 = a.f79640a[aVar.ordinal()];
        return i11 == 1 || i11 == 2 || i11 == 3;
    }

    @Override // io.sentry.transport.r
    public boolean isConnected() {
        return a(this.f79639a.getConnectionStatusProvider().q0());
    }
}
