package t70;

import com.stripe.android.paymentsheet.analytics.EventReporter;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements qj0.e<EventReporter.Mode> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final h f112863a = new h();
    }

    public static h a() {
        return a.f112863a;
    }

    public static EventReporter.Mode c() {
        return (EventReporter.Mode) qj0.h.d(g.f112862a.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public EventReporter.Mode get() {
        return c();
    }
}
