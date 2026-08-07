package w80;

import com.stripe.android.core.exception.StripeException;
import jn0.t;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lw80/p;", "Lw80/o;", "Lh70/h;", "errorReporter", "<init>", "(Lh70/h;)V", "Ljn0/h0;", "a", "()V", "b", "Lh70/h;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class p implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h70.h errorReporter;

    public p(h70.h errorReporter) {
        s.k(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    @Override // w80.o
    public void a() {
        Object objB;
        IllegalStateException illegalStateException = new IllegalStateException("Missing stripecardscan dependency, please add it to your apps build.gradle");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(Class.forName("androidx.test.InstrumentationRegistry"));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        this.errorReporter.a(h70.h.f.MISSING_CARDSCAN_DEPENDENCY, StripeException.INSTANCE.b(illegalStateException), v0.f(x.a("has_instrumentation", String.valueOf(jn0.s.h(objB)))));
    }
}
