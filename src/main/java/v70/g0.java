package v70;

import com.stripe.android.paymentsheet.analytics.EventReporter;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements qj0.e<EventReporter.Mode> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g0 f118192a = new g0();
    }

    public static g0 a() {
        return a.f118192a;
    }

    public static EventReporter.Mode c() {
        return (EventReporter.Mode) qj0.h.d(f0.INSTANCE.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public EventReporter.Mode get() {
        return c();
    }
}
