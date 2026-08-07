package androidx.media3.session;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class q6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f12148e = s7.q0.N0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f12149f = s7.q0.N0(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f12150g = s7.q0.N0(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f12151h = s7.q0.N0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f12152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12155d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f12156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f12157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f12158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Bundle f12159d = Bundle.EMPTY;

        public q6 a() {
            return new q6(this.f12159d, this.f12156a, this.f12157b, this.f12158c);
        }

        public a b(Bundle bundle) {
            this.f12159d = (Bundle) s7.a.f(bundle);
            return this;
        }

        public a c(boolean z11) {
            this.f12157b = z11;
            return this;
        }

        public a d(boolean z11) {
            this.f12156a = z11;
            return this;
        }

        public a e(boolean z11) {
            this.f12158c = z11;
            return this;
        }
    }

    public static q6 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f12148e);
        boolean z11 = bundle.getBoolean(f12149f, false);
        boolean z12 = bundle.getBoolean(f12150g, false);
        boolean z13 = bundle.getBoolean(f12151h, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new q6(bundle2, z11, z12, z13);
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f12148e, this.f12152a);
        bundle.putBoolean(f12149f, this.f12153b);
        bundle.putBoolean(f12150g, this.f12154c);
        bundle.putBoolean(f12151h, this.f12155d);
        return bundle;
    }

    private q6(Bundle bundle, boolean z11, boolean z12, boolean z13) {
        this.f12152a = new Bundle(bundle);
        this.f12153b = z11;
        this.f12154c = z12;
        this.f12155d = z13;
    }
}
