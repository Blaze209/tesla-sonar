package v70;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements qj0.e<com.stripe.android.paymentsheet.paymentdatacollection.bacs.b> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final t f118320a = new t();
    }

    public static t a() {
        return a.f118320a;
    }

    public static com.stripe.android.paymentsheet.paymentdatacollection.bacs.b c() {
        return (com.stripe.android.paymentsheet.paymentdatacollection.bacs.b) qj0.h.d(r.INSTANCE.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.paymentsheet.paymentdatacollection.bacs.b get() {
        return c();
    }
}
