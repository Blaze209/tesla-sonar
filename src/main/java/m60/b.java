package m60;

import androidx.compose.foundation.layout.t;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import p009i2.m2;
import p010i90.a0;
import p010i90.f1;
import p010i90.j0;
import p010i90.q0;
import p010i90.r1;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.o;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f91323a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q<p015o1.e, p020r2.l, Integer, h0> f91324b = z2.c.c(-1188167286, false, a.f91327c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p<p020r2.l, Integer, h0> f91325c = z2.c.c(-549453615, false, C1948b.f91328c);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p<p020r2.l, Integer, h0> f91326d = z2.c.c(1855839629, false, c.f91330c);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo1/e;", "Ljn0/h0;", "a", "(Lo1/e;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements q<p015o1.e, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f91327c = new a();

        a() {
            super(3);
        }

        public final void a(p015o1.e AnimatedVisibility, p020r2.l lVar, int i11) {
            s.k(AnimatedVisibility, "$this$AnimatedVisibility");
            if (o.J()) {
                o.S(-1188167286, i11, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt.lambda-1.<anonymous> (LinkInlineSignup.kt:258)");
            }
            k60.g.a(false, false, t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), t4.j.INSTANCE.f(), lVar, 438, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(p015o1.e eVar, p020r2.l lVar, Integer num) {
            a(eVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f91330c = new c();

        c() {
            super(2);
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1855839629, i11, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt.lambda-3.<anonymous> (LinkInlineSignup.kt:273)");
            }
            m2.a(null, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, b.f91323a.b(), lVar, 1572864, 63);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public final q<p015o1.e, p020r2.l, Integer, h0> a() {
        return f91324b;
    }

    public final p<p020r2.l, Integer, h0> b() {
        return f91325c;
    }

    /* JADX INFO: renamed from: m60.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class C1948b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1948b f91328c = new C1948b();

        C1948b() {
            super(2);
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-549453615, i11, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt.lambda-2.<anonymous> (LinkInlineSignup.kt:274)");
            }
            f1 f1Var = new f1(null, v.m());
            r1 r1VarB = a0.Companion.b(a0.INSTANCE, "email@me.co", false, 2, null);
            q0 q0VarB = q0.Companion.b(q0.INSTANCE, "5555555555", null, null, false, false, 30, null);
            r1 r1VarA = j0.INSTANCE.a("My Name");
            o60.b bVar = o60.b.InputtingRemainingFields;
            a aVar = a.f91329c;
            int i12 = (f1.f76526c << 3) | 920322054;
            int i13 = r1.f76877x;
            h.f("Example, Inc.", f1Var, r1VarB, q0VarB, r1VarA, bVar, true, true, true, null, aVar, null, lVar, i12 | (i13 << 6) | (q0.f76828s << 9) | (i13 << 12), 6, 2048);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: m60.b$b$a */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f91329c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }

            public final void b() {
            }
        }
    }
}
