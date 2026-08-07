package p007h2;

import androidx.compose.ui.c;
import androidx.compose.ui.d;
import b4.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import p020r2.x;
import wn0.l;
import wn0.p;
import z3.i0;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Landroidx/compose/ui/d;Lwn0/p;Lr2/l;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e0 {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz3/k0;", "", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class a implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f70245a = new a();

        /* JADX INFO: renamed from: h2.e0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class C1454a extends u implements l<w0.a, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<w0> f70246c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1454a(List<? extends w0> list) {
                super(1);
                this.f70246c = list;
            }

            public final void a(w0.a aVar) {
                List<w0> list = this.f70246c;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    w0.a.h(aVar, list.get(i11), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
                a(aVar);
                return h0.f84049a;
            }
        }

        a() {
        }

        @Override // z3.i0
        public final j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
            ArrayList arrayList = new ArrayList(list.size());
            Integer numValueOf = 0;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(list.get(i11).x0(j11));
            }
            int size2 = arrayList.size();
            Integer numValueOf2 = numValueOf;
            for (int i12 = 0; i12 < size2; i12++) {
                numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((w0) arrayList.get(i12)).getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String()));
            }
            int iIntValue = numValueOf2.intValue();
            int size3 = arrayList.size();
            for (int i13 = 0; i13 < size3; i13++) {
                numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((w0) arrayList.get(i13)).getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()));
            }
            return k0.N1(k0Var, iIntValue, numValueOf.intValue(), null, new C1454a(arrayList), 4, null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f70247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f70248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f70249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f70250f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(d dVar, p<? super p020r2.l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f70247c = dVar;
            this.f70248d = pVar;
            this.f70249e = i11;
            this.f70250f = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            e0.a(this.f70247c, this.f70248d, lVar, k2.a(this.f70249e | 1), this.f70250f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(d dVar, p<? super p020r2.l, ? super Integer, h0> pVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        p020r2.l lVarV = lVar.v(-2105228848);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.K(pVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                dVar = d.INSTANCE;
            }
            if (o.J()) {
                o.S(-2105228848, i13, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:31)");
            }
            a aVar = a.f70245a;
            int i15 = ((i13 >> 3) & 14) | KyberEngine.KyberPolyBytes | ((i13 << 3) & 112);
            int iA = j.a(lVarV, 0);
            x xVarC = lVarV.c();
            d dVarE = c.e(lVarV, dVar);
            g.Companion companion = g.INSTANCE;
            wn0.a<g> aVarA = companion.a();
            int i16 = ((i15 << 6) & 896) | 6;
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = d4.a(lVarV);
            d4.b(lVarA, aVar, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<g, Integer, h0> pVarB = companion.b();
            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion.d());
            pVar.invoke(lVarV, Integer.valueOf((i16 >> 6) & 14));
            lVarV.g();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(dVar, pVar, i11, i12));
        }
    }
}
