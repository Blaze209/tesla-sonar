package ka;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.n;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import java.lang.ref.WeakReference;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.u;
import p020r2.h2;
import p020r2.k2;
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a)\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\b\u001a\u00020\u0004*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lja/k;", "La3/d;", "saveableStateHolder", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Lja/k;La3/d;Lwn0/p;Lr2/l;I)V", "b", "(La3/d;Lwn0/p;Lr2/l;I)V", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a3.d f85648c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f85649d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(a3.d dVar, p<? super p020r2.l, ? super Integer, h0> pVar) {
            super(2);
            this.f85648c = dVar;
            this.f85649d = pVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-52928304, i11, -1, "androidx.navigation.compose.LocalOwnersProvider.<anonymous> (NavBackStackEntryProvider.kt:51)");
            }
            j.b(this.f85648c, this.f85649d, lVar, 0);
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p011ja.k f85650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a3.d f85651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f85652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f85653f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p011ja.k kVar, a3.d dVar, p<? super p020r2.l, ? super Integer, h0> pVar, int i11) {
            super(2);
            this.f85650c = kVar;
            this.f85651d = dVar;
            this.f85652e = pVar;
            this.f85653f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            j.a(this.f85650c, this.f85651d, this.f85652e, lVar, k2.a(this.f85653f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a3.d f85654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f85655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f85656e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(a3.d dVar, p<? super p020r2.l, ? super Integer, h0> pVar, int i11) {
            super(2);
            this.f85654c = dVar;
            this.f85655d = pVar;
            this.f85656e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            j.b(this.f85654c, this.f85655d, lVar, k2.a(this.f85656e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(p011ja.k kVar, a3.d dVar, p<? super p020r2.l, ? super Integer, h0> pVar, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(-1579360880);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(kVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(dVar) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(pVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-1579360880, i12, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:45)");
            }
            w.b(new h2[]{n7.a.f93383a.b(kVar), k7.a.a().d(kVar), AndroidCompositionLocals_androidKt.j().d(kVar)}, z2.c.e(-52928304, true, new a(dVar, pVar), lVarV, 54), lVarV, h2.f106566i | 48);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(kVar, dVar, pVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a3.d dVar, p<? super p020r2.l, ? super Integer, h0> pVar, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(1211832233);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(pVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(1211832233, i12, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:56)");
            }
            lVarV.H(1729797275);
            f1 f1VarA = n7.a.f93383a.a(lVarV, 6);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            c1 c1VarB = n7.c.b(o0.b(ka.a.class), f1VarA, null, null, f1VarA instanceof n ? ((n) f1VarA).getDefaultViewModelCreationExtras() : CreationExtras.a.f8924b, lVarV, 0, 0);
            lVarV.T();
            ka.a aVar = (ka.a) c1VarB;
            aVar.h(new WeakReference<>(dVar));
            dVar.e(aVar.getId(), pVar, lVarV, ((i12 << 6) & 896) | (i12 & 112));
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(dVar, pVar, i11));
        }
    }
}
