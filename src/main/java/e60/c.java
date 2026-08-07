package e60;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Le60/c;", "", "Le60/e;", "linkEventsReporter", "<init>", "(Le60/e;)V", "Ljn0/h0;", "a", "()V", "Lcom/stripe/android/link/a;", "linkActivityResult", "c", "(Lcom/stripe/android/link/a;)V", "b", "Le60/e;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e linkEventsReporter;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62118a;

        static {
            int[] iArr = new int[com.stripe.android.link.a.Canceled.b.values().length];
            try {
                iArr[com.stripe.android.link.a.Canceled.b.BackPressed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.stripe.android.link.a.Canceled.b.LoggedOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f62118a = iArr;
        }
    }

    public c(e linkEventsReporter) {
        s.k(linkEventsReporter, "linkEventsReporter");
        this.linkEventsReporter = linkEventsReporter;
    }

    public final void a() {
        this.linkEventsReporter.a();
    }

    public final void b() {
        this.linkEventsReporter.j();
    }

    public final void c(com.stripe.android.link.a linkActivityResult) {
        s.k(linkActivityResult, "linkActivityResult");
        if (!(linkActivityResult instanceof com.stripe.android.link.a.Canceled)) {
            if (linkActivityResult instanceof com.stripe.android.link.a.Completed) {
                this.linkEventsReporter.f();
                return;
            } else {
                if (linkActivityResult instanceof com.stripe.android.link.a.Failed) {
                    this.linkEventsReporter.k(((com.stripe.android.link.a.Failed) linkActivityResult).getError());
                    return;
                }
                return;
            }
        }
        int i11 = a.f62118a[((com.stripe.android.link.a.Canceled) linkActivityResult).getReason().ordinal()];
        if (i11 == 1) {
            this.linkEventsReporter.h();
        } else {
            if (i11 != 2) {
                return;
            }
            this.linkEventsReporter.l();
        }
    }
}
