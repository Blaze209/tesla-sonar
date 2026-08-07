package e40;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements qj0.e<com.stripe.android.paymentsheet.paymentdatacollection.bacs.b> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final x f61779a = new x();
    }

    public static x a() {
        return a.f61779a;
    }

    public static com.stripe.android.paymentsheet.paymentdatacollection.bacs.b c() {
        return (com.stripe.android.paymentsheet.paymentdatacollection.bacs.b) qj0.h.d(l.INSTANCE.n());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.paymentsheet.paymentdatacollection.bacs.b get() {
        return c();
    }
}
