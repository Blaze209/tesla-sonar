package g30;

import android.os.Parcelable;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.s0;
import java.io.Closeable;
import java.util.UUID;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lg30/g;", "", "<init>", "()V", "Landroidx/lifecycle/s0;", "savedStateHandle", "Ljn0/h0;", "g", "(Landroidx/lifecycle/s0;)V", "f", "e", "Landroidx/lifecycle/c1;", "viewModel", "Lkotlin/Function0;", "c", "(Landroidx/lifecycle/c1;Landroidx/lifecycle/s0;)Lwn0/a;", "", "b", "Z", "sessionLocked", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static boolean sessionLocked;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f67187a = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f67189c = 8;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s0 f67190c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s0 s0Var) {
            super(0);
            this.f67190c = s0Var;
        }

        public final void b() {
            g.f67187a.f(this.f67190c);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(s0 savedStateHandle) {
        s.k(savedStateHandle, "$savedStateHandle");
        f67187a.e(savedStateHandle);
    }

    private final void e(s0 savedStateHandle) {
        e eVar = (e) savedStateHandle.f("STRIPE_ANALYTICS_LOCAL_SESSION");
        if (eVar == null || !(eVar instanceof e.Owner)) {
            return;
        }
        sessionLocked = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(s0 savedStateHandle) {
        e eVar = (e) savedStateHandle.f("STRIPE_ANALYTICS_LOCAL_SESSION");
        if (eVar == null || !(eVar instanceof e.Owner)) {
            return;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        w30.e.Companion companion = w30.e.INSTANCE;
        s.h(uuidRandomUUID);
        companion.b(uuidRandomUUID);
        String string = uuidRandomUUID.toString();
        s.j(string, "toString(...)");
        savedStateHandle.n("STRIPE_ANALYTICS_LOCAL_SESSION", new e.Owner(string));
    }

    private final void g(s0 savedStateHandle) {
        Parcelable owner;
        e eVar = (e) savedStateHandle.f("STRIPE_ANALYTICS_LOCAL_SESSION");
        if (eVar != null) {
            if (eVar instanceof e.Owner) {
                w30.e.Companion companion = w30.e.INSTANCE;
                UUID uuidFromString = UUID.fromString(((e.Owner) eVar).getId());
                s.j(uuidFromString, "fromString(...)");
                companion.b(uuidFromString);
                sessionLocked = true;
                return;
            }
            return;
        }
        if (sessionLocked) {
            owner = e.a.f67184a;
        } else {
            sessionLocked = true;
            UUID uuidRandomUUID = UUID.randomUUID();
            w30.e.Companion companion2 = w30.e.INSTANCE;
            s.h(uuidRandomUUID);
            companion2.b(uuidRandomUUID);
            String string = uuidRandomUUID.toString();
            s.j(string, "toString(...)");
            owner = new e.Owner(string);
        }
        savedStateHandle.n("STRIPE_ANALYTICS_LOCAL_SESSION", owner);
    }

    public final wn0.a<h0> c(c1 viewModel, final s0 savedStateHandle) {
        s.k(viewModel, "viewModel");
        s.k(savedStateHandle, "savedStateHandle");
        g(savedStateHandle);
        viewModel.addCloseable(new Closeable() { // from class: g30.f
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                g.d(savedStateHandle);
            }
        });
        return new a(savedStateHandle);
    }
}
