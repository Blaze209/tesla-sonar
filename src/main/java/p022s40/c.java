package p022s40;

import com.plaid.internal.EnumC4419g;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import i40.i;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import p023w50.C4789j;
import q50.TopAppBarState;
import v1.y;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f109816a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p<l, Integer, h0> f109817b = z2.c.c(-117198573, false, a.f109822c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p<l, Integer, h0> f109818c = z2.c.c(-2052014915, false, b.f109823c);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p<l, Integer, h0> f109819d = z2.c.c(-530833761, false, C2331c.f109824c);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static q<y, l, Integer, h0> f109820e = z2.c.c(-1209818533, false, d.f109826c);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static p<l, Integer, h0> f109821f = z2.c.c(-1980911826, false, e.f109830c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f109822c = new a();

        a() {
            super(2);
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-117198573, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt.lambda-1.<anonymous> (ErrorContent.kt:46)");
            }
            m.c(e4.e.c(i.f75843i, lVar, 0), null, null, null, null, lVar, 24584, 14);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f109823c = new b();

        b() {
            super(2);
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-2052014915, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt.lambda-2.<anonymous> (ErrorContent.kt:68)");
            }
            m.c(e4.e.c(i.f75843i, lVar, 0), null, null, null, null, lVar, 24584, 14);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f109830c = new e();

        e() {
            super(2);
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1980911826, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt.lambda-5.<anonymous> (ErrorContent.kt:330)");
            }
            c cVar = c.f109816a;
            C4789j.a(cVar.c(), cVar.d(), lVar, 54);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public final p<l, Integer, h0> a() {
        return f109817b;
    }

    public final p<l, Integer, h0> b() {
        return f109818c;
    }

    public final p<l, Integer, h0> c() {
        return f109819d;
    }

    public final q<y, l, Integer, h0> d() {
        return f109820e;
    }

    /* JADX INFO: renamed from: s40.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class C2331c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2331c f109824c = new C2331c();

        C2331c() {
            super(2);
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-530833761, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt.lambda-3.<anonymous> (ErrorContent.kt:332)");
            }
            p023w50.o.c(new TopAppBarState(false, false, false, null, false, false, false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), a.f109825c, lVar, 56);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: s40.c$c$a */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f109825c = new a();

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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv1/y;", "it", "Ljn0/h0;", "a", "(Lv1/y;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements q<y, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f109826c = new d();

        d() {
            super(3);
        }

        public final void a(y it, l lVar, int i11) {
            s.k(it, "it");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1209818533, i11, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$ErrorContentKt.lambda-4.<anonymous> (ErrorContent.kt:338)");
            }
            f.f(new AccountLoadError(true, true, new FinancialConnectionsInstitution(false, "3", false, "Random Institution", null, null, null, "Random Institution url"), new APIException(null, null, 0, null, null, 31, null)), a.f109827c, b.f109828c, C2332c.f109829c, lVar, 3504);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(y yVar, l lVar, Integer num) {
            a(yVar, lVar, num.intValue());
            return h0.f84049a;
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f109827c = new a();

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

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class b extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f109828c = new b();

            b() {
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

        /* JADX INFO: renamed from: s40.c$d$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class C2332c extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C2332c f109829c = new C2332c();

            C2332c() {
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
