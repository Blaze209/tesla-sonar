package v70;

import com.stripe.android.paymentsheet.analytics.EventReporter;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements qj0.e<EventReporter.Mode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f118311a;

    public o(n nVar) {
        this.f118311a = nVar;
    }

    public static o a(n nVar) {
        return new o(nVar);
    }

    public static EventReporter.Mode c(n nVar) {
        return (EventReporter.Mode) qj0.h.d(nVar.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public EventReporter.Mode get() {
        return c(this.f118311a);
    }
}
