package v70;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements qj0.e<com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final v f118322a = new v();
    }

    public static v a() {
        return a.f118322a;
    }

    public static com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a c() {
        return (com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a) qj0.h.d(r.INSTANCE.f());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a get() {
        return c();
    }
}
