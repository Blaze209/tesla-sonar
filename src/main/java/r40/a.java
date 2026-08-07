package r40;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.n;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import i50.SharedPartnerAuthState;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import s50.i;
import s50.j;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements l<String, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f106971c = new c();

        c() {
            super(1);
        }

        public final void a(String it) {
            s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(String str) {
            a(str);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls50/j;", "it", "Ljn0/h0;", "a", "(Ls50/j;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements l<j, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f106972c = new d();

        d() {
            super(1);
        }

        public final void a(j it) {
            s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(j jVar) {
            a(jVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f106974c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i11) {
            super(2);
            this.f106974c = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            a.a(lVar, k2.a(this.f106974c | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(p020r2.l lVar, int i11) {
        p020r2.l lVarV = lVar.v(-71657115);
        if (i11 == 0 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-71657115, i11, -1, "com.stripe.android.financialconnections.features.bankauthrepair.BankAuthRepairScreen (BankAuthRepairScreen.kt:10)");
            }
            lVarV.H(1481344674);
            ViewModelProvider.Factory factoryA = r40.b.INSTANCE.a(s50.b.b(lVarV, 0).w().getActivityRetainedComponent());
            lVarV.H(1729797275);
            f1 f1VarA = n7.a.f93383a.a(lVarV, 6);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            c1 c1VarC = n7.c.c(r40.b.class, f1VarA, null, factoryA, f1VarA instanceof n ? ((n) f1VarA).getDefaultViewModelCreationExtras() : CreationExtras.a.f8924b, lVarV, 36936, 0);
            lVarV.T();
            lVarV.T();
            p022s40.n.g((SharedPartnerAuthState) r90.f.a(((r40.b) ((i) c1VarC)).h(), lVarV, 8).getValue(), C2270a.f106969c, b.f106970c, c.f106971c, d.f106972c, e.f106973c, false, lVarV, 1797560);
            lVarV = lVarV;
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new f(i11));
        }
    }

    /* JADX INFO: renamed from: r40.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class C2270a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2270a f106969c = new C2270a();

        C2270a() {
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
        public static final b f106970c = new b();

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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f106973c = new e();

        e() {
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
