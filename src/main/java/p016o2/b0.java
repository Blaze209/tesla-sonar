package p016o2;

import androidx.compose.foundation.layout.t;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import v1.m0;
import v1.o0;
import v1.p0;
import v1.y;
import w4.h;
import wn0.l;
import wn0.p;
import wn0.q;
import z3.g1;
import z3.i1;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0098\u0001\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001an\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "Ljn0/h0;", "topBar", "bottomBar", "snackbarHost", "floatingActionButton", "Lo2/o;", "floatingActionButtonPosition", "Lk3/p1;", "containerColor", "contentColor", "Lv1/m0;", "contentWindowInsets", "Lkotlin/Function1;", "Lv1/y;", "content", "a", "(Landroidx/compose/ui/d;Lwn0/p;Lwn0/p;Lwn0/p;Lwn0/p;IJJLv1/m0;Lwn0/q;Lr2/l;II)V", "fabPosition", "snackbar", "fab", "b", "(ILwn0/p;Lwn0/q;Lwn0/p;Lwn0/p;Lv1/m0;Lwn0/p;Lr2/l;I)V", "Lw4/h;", Gender.FEMALE, "FabSpacing", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f95731a = h.g(16);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv1/m0;", "consumedWindowInsets", "Ljn0/h0;", "a", "(Lv1/m0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<m0, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p2.e f95732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m0 f95733d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p2.e eVar, m0 m0Var) {
            super(1);
            this.f95732c = eVar;
            this.f95733d = m0Var;
        }

        public final void a(m0 m0Var) {
            this.f95732c.f(o0.e(this.f95733d, m0Var));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(m0 m0Var) {
            a(m0Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f95734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f95735d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q<y, p020r2.l, Integer, h0> f95736e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f95737f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f95738g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p2.e f95739h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f95740i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i11, p<? super p020r2.l, ? super Integer, h0> pVar, q<? super y, ? super p020r2.l, ? super Integer, h0> qVar, p<? super p020r2.l, ? super Integer, h0> pVar2, p<? super p020r2.l, ? super Integer, h0> pVar3, p2.e eVar, p<? super p020r2.l, ? super Integer, h0> pVar4) {
            super(2);
            this.f95734c = i11;
            this.f95735d = pVar;
            this.f95736e = qVar;
            this.f95737f = pVar2;
            this.f95738g = pVar3;
            this.f95739h = eVar;
            this.f95740i = pVar4;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1979205334, i11, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
            }
            b0.b(this.f95734c, this.f95735d, this.f95736e, this.f95737f, this.f95738g, this.f95739h, this.f95740i, lVar, 0);
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
    static final class c extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f95741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f95742d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f95743e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f95744f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f95745g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f95746h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f95747i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f95748j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ m0 f95749k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ q<y, p020r2.l, Integer, h0> f95750l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f95751m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f95752n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.d dVar, p<? super p020r2.l, ? super Integer, h0> pVar, p<? super p020r2.l, ? super Integer, h0> pVar2, p<? super p020r2.l, ? super Integer, h0> pVar3, p<? super p020r2.l, ? super Integer, h0> pVar4, int i11, long j11, long j12, m0 m0Var, q<? super y, ? super p020r2.l, ? super Integer, h0> qVar, int i12, int i13) {
            super(2);
            this.f95741c = dVar;
            this.f95742d = pVar;
            this.f95743e = pVar2;
            this.f95744f = pVar3;
            this.f95745g = pVar4;
            this.f95746h = i11;
            this.f95747i = j11;
            this.f95748j = j12;
            this.f95749k = m0Var;
            this.f95750l = qVar;
            this.f95751m = i12;
            this.f95752n = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            b0.a(this.f95741c, this.f95742d, this.f95743e, this.f95744f, this.f95745g, this.f95746h, this.f95747i, this.f95748j, this.f95749k, this.f95750l, lVar, k2.a(this.f95751m | 1), this.f95752n);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz3/i1;", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "a", "(Lz3/i1;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements p<i1, w4.b, j0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f95753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f95754d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f95755e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f95756f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ m0 f95757g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f95758h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ q<y, p020r2.l, Integer, h0> f95759i;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements l<w0.a, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<w0> f95760c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<w0> f95761d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ List<w0> f95762e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<w0> f95763f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ n f95764g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f95765h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f95766i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ m0 f95767j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ i1 f95768k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f95769l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ int f95770m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Integer f95771n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ List<w0> f95772o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Integer f95773p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends w0> list, List<? extends w0> list2, List<? extends w0> list3, List<? extends w0> list4, n nVar, int i11, int i12, m0 m0Var, i1 i1Var, int i13, int i14, Integer num, List<? extends w0> list5, Integer num2) {
                super(1);
                this.f95760c = list;
                this.f95761d = list2;
                this.f95762e = list3;
                this.f95763f = list4;
                this.f95764g = nVar;
                this.f95765h = i11;
                this.f95766i = i12;
                this.f95767j = m0Var;
                this.f95768k = i1Var;
                this.f95769l = i13;
                this.f95770m = i14;
                this.f95771n = num;
                this.f95772o = list5;
                this.f95773p = num2;
            }

            public final void a(w0.a aVar) {
                List<w0> list = this.f95760c;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    w0.a.h(aVar, list.get(i11), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
                }
                List<w0> list2 = this.f95761d;
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    w0.a.h(aVar, list2.get(i12), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
                }
                List<w0> list3 = this.f95762e;
                int i13 = this.f95765h;
                int i14 = this.f95766i;
                m0 m0Var = this.f95767j;
                i1 i1Var = this.f95768k;
                int i15 = this.f95769l;
                int i16 = this.f95770m;
                int size3 = list3.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    w0.a.h(aVar, list3.get(i17), ((i13 - i14) / 2) + m0Var.c(i1Var, i1Var.getLayoutDirection()), i15 - i16, BitmapDescriptorFactory.HUE_RED, 4, null);
                }
                List<w0> list4 = this.f95763f;
                int i18 = this.f95769l;
                Integer num = this.f95771n;
                int size4 = list4.size();
                for (int i19 = 0; i19 < size4; i19++) {
                    w0.a.h(aVar, list4.get(i19), 0, i18 - (num != null ? num.intValue() : 0), BitmapDescriptorFactory.HUE_RED, 4, null);
                }
                n nVar = this.f95764g;
                if (nVar != null) {
                    List<w0> list5 = this.f95772o;
                    int i21 = this.f95769l;
                    Integer num2 = this.f95773p;
                    int size5 = list5.size();
                    for (int i22 = 0; i22 < size5; i22++) {
                        w0 w0Var = list5.get(i22);
                        int left = nVar.getLeft();
                        s.h(num2);
                        w0.a.h(aVar, w0Var, left, i21 - num2.intValue(), BitmapDescriptorFactory.HUE_RED, 4, null);
                    }
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
                a(aVar);
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m0 f95774c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ i1 f95775d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ List<w0> f95776e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f95777f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<w0> f95778g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Integer f95779h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ q<y, p020r2.l, Integer, h0> f95780i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(m0 m0Var, i1 i1Var, List<? extends w0> list, int i11, List<? extends w0> list2, Integer num, q<? super y, ? super p020r2.l, ? super Integer, h0> qVar) {
                super(2);
                this.f95774c = m0Var;
                this.f95775d = i1Var;
                this.f95776e = list;
                this.f95777f = i11;
                this.f95778g = list2;
                this.f95779h = num;
                this.f95780i = qVar;
            }

            public final void a(p020r2.l lVar, int i11) {
                Integer num;
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(-1213360416, i11, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)");
                }
                y yVarD = o0.d(this.f95774c, this.f95775d);
                this.f95780i.invoke(t.d(t.g(yVarD, this.f95775d.getLayoutDirection()), this.f95776e.isEmpty() ? yVarD.getTop() : this.f95775d.w(this.f95777f), t.f(yVarD, this.f95775d.getLayoutDirection()), (this.f95778g.isEmpty() || (num = this.f95779h) == null) ? yVarD.getBottom() : this.f95775d.w(num.intValue())), lVar, 0);
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

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p<p020r2.l, Integer, h0> f95781c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(p<? super p020r2.l, ? super Integer, h0> pVar) {
                super(2);
                this.f95781c = pVar;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(-2146438447, i11, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:209)");
                }
                this.f95781c.invoke(lVar, 0);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(p<? super p020r2.l, ? super Integer, h0> pVar, p<? super p020r2.l, ? super Integer, h0> pVar2, p<? super p020r2.l, ? super Integer, h0> pVar3, int i11, m0 m0Var, p<? super p020r2.l, ? super Integer, h0> pVar4, q<? super y, ? super p020r2.l, ? super Integer, h0> qVar) {
            super(2);
            this.f95753c = pVar;
            this.f95754d = pVar2;
            this.f95755e = pVar3;
            this.f95756f = i11;
            this.f95757g = m0Var;
            this.f95758h = pVar4;
            this.f95759i = qVar;
        }

        public final j0 a(i1 i1Var, long j11) {
            Object obj;
            Object obj2;
            Object obj3;
            int i11;
            n nVar;
            Object obj4;
            Integer numValueOf;
            int iIntValue;
            int height;
            int iB;
            Object obj5;
            Object obj6;
            int iI1;
            int iI2;
            int iL = w4.b.l(j11);
            int iK = w4.b.k(j11);
            long jD = w4.b.d(j11, 0, 0, 0, 0, 10, null);
            List<z3.h0> listC1 = i1Var.c1(c0.TopBar, this.f95753c);
            ArrayList arrayList = new ArrayList(listC1.size());
            int size = listC1.size();
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(listC1.get(i12).x0(jD));
            }
            if (!arrayList.isEmpty()) {
                obj = arrayList.get(0);
                int i13 = ((w0) obj).getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                int iO = v.o(arrayList);
                if (1 <= iO) {
                    int i14 = 1;
                    while (true) {
                        Object obj7 = arrayList.get(i14);
                        int i15 = ((w0) obj7).getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                        if (i13 < i15) {
                            obj = obj7;
                            i13 = i15;
                        }
                        if (i14 == iO) {
                            break;
                        }
                        i14++;
                    }
                }
            } else {
                obj = null;
            }
            w0 w0Var = (w0) obj;
            int i16 = w0Var != null ? w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() : 0;
            List<z3.h0> listC2 = i1Var.c1(c0.Snackbar, this.f95754d);
            m0 m0Var = this.f95757g;
            ArrayList arrayList2 = new ArrayList(listC2.size());
            int size2 = listC2.size();
            int i17 = 0;
            while (i17 < size2) {
                arrayList2.add(listC2.get(i17).x0(w4.c.o(jD, (-m0Var.c(i1Var, i1Var.getLayoutDirection())) - m0Var.a(i1Var, i1Var.getLayoutDirection()), -m0Var.b(i1Var))));
                i17++;
                arrayList = arrayList;
                listC2 = listC2;
            }
            ArrayList arrayList3 = arrayList;
            if (arrayList2.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = arrayList2.get(0);
                int i18 = ((w0) obj2).getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                int iO2 = v.o(arrayList2);
                if (1 <= iO2) {
                    Object obj8 = obj2;
                    int i19 = i18;
                    int i21 = 1;
                    while (true) {
                        Object obj9 = arrayList2.get(i21);
                        int i22 = ((w0) obj9).getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                        if (i19 < i22) {
                            obj8 = obj9;
                            i19 = i22;
                        }
                        if (i21 == iO2) {
                            break;
                        }
                        i21++;
                    }
                    obj2 = obj8;
                }
            }
            w0 w0Var2 = (w0) obj2;
            int i23 = w0Var2 != null ? w0Var2.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() : 0;
            if (arrayList2.isEmpty()) {
                obj3 = null;
            } else {
                obj3 = arrayList2.get(0);
                int i24 = ((w0) obj3).getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
                int iO3 = v.o(arrayList2);
                if (1 <= iO3) {
                    Object obj10 = obj3;
                    int i25 = i24;
                    int i26 = 1;
                    while (true) {
                        Object obj11 = arrayList2.get(i26);
                        int i27 = ((w0) obj11).getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
                        if (i25 < i27) {
                            obj10 = obj11;
                            i25 = i27;
                        }
                        if (i26 == iO3) {
                            break;
                        }
                        i26++;
                    }
                    obj3 = obj10;
                }
            }
            w0 w0Var3 = (w0) obj3;
            int i28 = w0Var3 != null ? w0Var3.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() : 0;
            List<z3.h0> listC3 = i1Var.c1(c0.Fab, this.f95755e);
            m0 m0Var2 = this.f95757g;
            int i29 = i28;
            ArrayList arrayList4 = new ArrayList(listC3.size());
            int size3 = listC3.size();
            int i31 = 0;
            while (i31 < size3) {
                int i32 = i23;
                List<z3.h0> list = listC3;
                w0 w0VarX0 = listC3.get(i31).x0(w4.c.o(jD, (-m0Var2.c(i1Var, i1Var.getLayoutDirection())) - m0Var2.a(i1Var, i1Var.getLayoutDirection()), -m0Var2.b(i1Var)));
                if (w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() == 0 || w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() == 0) {
                    w0VarX0 = null;
                }
                if (w0VarX0 != null) {
                    arrayList4.add(w0VarX0);
                }
                i31++;
                i23 = i32;
                listC3 = list;
            }
            int i33 = i23;
            if (arrayList4.isEmpty()) {
                i11 = i16;
                nVar = null;
            } else {
                if (arrayList4.isEmpty()) {
                    obj5 = null;
                } else {
                    obj5 = arrayList4.get(0);
                    int i34 = ((w0) obj5).getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
                    int iO4 = v.o(arrayList4);
                    if (1 <= iO4) {
                        Object obj12 = obj5;
                        int i35 = i34;
                        int i36 = 1;
                        while (true) {
                            Object obj13 = arrayList4.get(i36);
                            int i37 = ((w0) obj13).getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
                            if (i35 < i37) {
                                obj12 = obj13;
                                i35 = i37;
                            }
                            if (i36 == iO4) {
                                break;
                            }
                            i36++;
                        }
                        obj5 = obj12;
                    }
                }
                s.h(obj5);
                int i38 = ((w0) obj5).getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
                if (arrayList4.isEmpty()) {
                    i11 = i16;
                    obj6 = null;
                } else {
                    obj6 = arrayList4.get(0);
                    int i39 = ((w0) obj6).getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                    int iO5 = v.o(arrayList4);
                    if (1 <= iO5) {
                        Object obj14 = obj6;
                        int i41 = i39;
                        int i42 = 1;
                        while (true) {
                            Object obj15 = arrayList4.get(i42);
                            i11 = i16;
                            int i43 = ((w0) obj15).getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                            if (i41 < i43) {
                                i41 = i43;
                                obj14 = obj15;
                            }
                            if (i42 == iO5) {
                                break;
                            }
                            i42++;
                            i16 = i11;
                        }
                        obj6 = obj14;
                    } else {
                        i11 = i16;
                    }
                }
                s.h(obj6);
                int i44 = ((w0) obj6).getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                int i45 = this.f95756f;
                o.Companion companion = o.INSTANCE;
                if (!o.e(i45, companion.c())) {
                    if (!(o.e(i45, companion.a()) ? true : o.e(i45, companion.b()))) {
                        iI1 = (iL - i38) / 2;
                    } else if (i1Var.getLayoutDirection() == w4.t.Ltr) {
                        iI2 = i1Var.i1(b0.f95731a);
                        iI1 = (iL - iI2) - i38;
                    } else {
                        iI1 = i1Var.i1(b0.f95731a);
                    }
                } else if (i1Var.getLayoutDirection() == w4.t.Ltr) {
                    iI1 = i1Var.i1(b0.f95731a);
                } else {
                    iI2 = i1Var.i1(b0.f95731a);
                    iI1 = (iL - iI2) - i38;
                }
                nVar = new n(iI1, i38, i44);
            }
            List<z3.h0> listC4 = i1Var.c1(c0.BottomBar, z2.c.c(-2146438447, true, new c(this.f95758h)));
            ArrayList arrayList5 = new ArrayList(listC4.size());
            int size4 = listC4.size();
            for (int i46 = 0; i46 < size4; i46++) {
                arrayList5.add(listC4.get(i46).x0(jD));
            }
            if (!arrayList5.isEmpty()) {
                obj4 = arrayList5.get(0);
                int i47 = ((w0) obj4).getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                int iO6 = v.o(arrayList5);
                if (1 <= iO6) {
                    int i48 = 1;
                    while (true) {
                        Object obj16 = arrayList5.get(i48);
                        int i49 = ((w0) obj16).getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                        if (i47 < i49) {
                            i47 = i49;
                            obj4 = obj16;
                        }
                        if (i48 == iO6) {
                            break;
                        }
                        i48++;
                    }
                }
            } else {
                obj4 = null;
            }
            w0 w0Var4 = (w0) obj4;
            Integer numValueOf2 = w0Var4 != null ? Integer.valueOf(w0Var4.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()) : null;
            if (nVar != null) {
                int i51 = this.f95756f;
                m0 m0Var3 = this.f95757g;
                if (numValueOf2 == null || o.e(i51, o.INSTANCE.b())) {
                    height = nVar.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() + i1Var.i1(b0.f95731a);
                    iB = m0Var3.b(i1Var);
                } else {
                    height = numValueOf2.intValue() + nVar.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                    iB = i1Var.i1(b0.f95731a);
                }
                numValueOf = Integer.valueOf(height + iB);
            } else {
                numValueOf = null;
            }
            if (i33 != 0) {
                iIntValue = i33 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : this.f95757g.b(i1Var));
            } else {
                iIntValue = 0;
            }
            List<z3.h0> listC5 = i1Var.c1(c0.MainContent, z2.c.c(-1213360416, true, new b(this.f95757g, i1Var, arrayList3, i11, arrayList5, numValueOf2, this.f95759i)));
            ArrayList arrayList6 = new ArrayList(listC5.size());
            int size5 = listC5.size();
            for (int i52 = 0; i52 < size5; i52++) {
                arrayList6.add(listC5.get(i52).x0(jD));
            }
            return k0.N1(i1Var, iL, iK, null, new a(arrayList6, arrayList3, arrayList2, arrayList5, nVar, iL, i29, this.f95757g, i1Var, iK, iIntValue, numValueOf2, arrayList4, numValueOf), 4, null);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ j0 invoke(i1 i1Var, w4.b bVar) {
            return a(i1Var, bVar.getValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f95782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f95783d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q<y, p020r2.l, Integer, h0> f95784e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f95785f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f95786g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ m0 f95787h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f95788i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f95789j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(int i11, p<? super p020r2.l, ? super Integer, h0> pVar, q<? super y, ? super p020r2.l, ? super Integer, h0> qVar, p<? super p020r2.l, ? super Integer, h0> pVar2, p<? super p020r2.l, ? super Integer, h0> pVar3, m0 m0Var, p<? super p020r2.l, ? super Integer, h0> pVar4, int i12) {
            super(2);
            this.f95782c = i11;
            this.f95783d = pVar;
            this.f95784e = qVar;
            this.f95785f = pVar2;
            this.f95786g = pVar3;
            this.f95787h = m0Var;
            this.f95788i = pVar4;
            this.f95789j = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            b0.b(this.f95782c, this.f95783d, this.f95784e, this.f95785f, this.f95786g, this.f95787h, this.f95788i, lVar, k2.a(this.f95789j | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0116  */
    /* JADX WARN: Code duplicated, block: B:102:0x011b  */
    /* JADX WARN: Code duplicated, block: B:104:0x011f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0127  */
    /* JADX WARN: Code duplicated, block: B:107:0x012a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0138  */
    /* JADX WARN: Code duplicated, block: B:115:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x0164  */
    /* JADX WARN: Code duplicated, block: B:130:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x0192  */
    /* JADX WARN: Code duplicated, block: B:132:0x0195  */
    /* JADX WARN: Code duplicated, block: B:134:0x0199  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01be  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:158:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:160:0x0207  */
    /* JADX WARN: Code duplicated, block: B:163:0x0213  */
    /* JADX WARN: Code duplicated, block: B:164:0x021f  */
    /* JADX WARN: Code duplicated, block: B:167:0x022a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0230  */
    /* JADX WARN: Code duplicated, block: B:175:0x023d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0245  */
    /* JADX WARN: Code duplicated, block: B:180:0x0259  */
    /* JADX WARN: Code duplicated, block: B:182:0x025f  */
    /* JADX WARN: Code duplicated, block: B:188:0x026d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0275  */
    /* JADX WARN: Code duplicated, block: B:193:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:197:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x010e  */
    public static final void a(androidx.compose.ui.d dVar, p<? super p020r2.l, ? super Integer, h0> pVar, p<? super p020r2.l, ? super Integer, h0> pVar2, p<? super p020r2.l, ? super Integer, h0> pVar3, p<? super p020r2.l, ? super Integer, h0> pVar4, int i11, long j11, long j12, m0 m0Var, q<? super y, ? super p020r2.l, ? super Integer, h0> qVar, p020r2.l lVar, int i12, int i13) {
        int i14;
        p<? super p020r2.l, ? super Integer, h0> pVar5;
        int i15;
        p<? super p020r2.l, ? super Integer, h0> pVar6;
        int i16;
        int i17;
        p<? super p020r2.l, ? super Integer, h0> pVar7;
        int i18;
        int i19;
        p<? super p020r2.l, ? super Integer, h0> pVar8;
        int i21;
        int i22;
        int i23;
        int i24;
        androidx.compose.ui.d dVar2;
        p<? super p020r2.l, ? super Integer, h0> pVarA;
        p<? super p020r2.l, ? super Integer, h0> pVarB;
        p<? super p020r2.l, ? super Integer, h0> pVarC;
        p<? super p020r2.l, ? super Integer, h0> pVarD;
        int iA;
        long background;
        long jC;
        m0 m0VarA;
        long j13;
        boolean z11;
        Object objI;
        p2.e eVar;
        boolean zN;
        Object objI2;
        p020r2.l lVar2;
        androidx.compose.ui.d dVar3;
        p<? super p020r2.l, ? super Integer, h0> pVar9;
        p<? super p020r2.l, ? super Integer, h0> pVar10;
        p<? super p020r2.l, ? super Integer, h0> pVar11;
        p<? super p020r2.l, ? super Integer, h0> pVar12;
        int i25;
        long j14;
        long j15;
        w2 w2VarX;
        int i26;
        int i27;
        p020r2.l lVarV = lVar.v(-1219521777);
        int i28 = i13 & 1;
        if (i28 != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = (lVarV.n(dVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i29 = i13 & 2;
        if (i29 == 0) {
            if ((i12 & 48) == 0) {
                pVar5 = pVar;
                i14 |= lVarV.K(pVar5) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
                    pVar6 = pVar2;
                    if (lVarV.K(pVar6)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 8;
                if (i17 != 0) {
                    if ((i12 & 3072) == 0) {
                        pVar7 = pVar3;
                        if (lVarV.K(pVar7)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 16;
                    if (i19 != 0) {
                        if ((i12 & 24576) == 0) {
                            pVar8 = pVar4;
                            if (lVarV.K(pVar8)) {
                                i21 = 16384;
                            } else {
                                i21 = PKIFailureInfo.certRevoked;
                            }
                            i14 |= i21;
                        }
                        i22 = i13 & 32;
                        if (i22 != 0) {
                            i14 |= 196608;
                        } else if ((i12 & 196608) == 0) {
                            if (lVarV.r(i11)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i14 |= i23;
                        }
                        if ((i12 & 1572864) != 0) {
                            if ((i13 & 64) == 0 || !lVarV.s(j11)) {
                                i27 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i27 = PKIFailureInfo.badCertTemplate;
                            }
                            i14 |= i27;
                        }
                        if ((i12 & 12582912) != 0) {
                            if ((i13 & 128) == 0 || !lVarV.s(j12)) {
                                i26 = 4194304;
                            } else {
                                i26 = 8388608;
                            }
                            i14 |= i26;
                        }
                        if ((i12 & 100663296) != 0) {
                            i14 |= ((i13 & 256) == 0 || !lVarV.n(m0Var)) ? 33554432 : 67108864;
                        }
                        if ((i13 & 512) != 0) {
                            if ((i12 & 805306368) == 0) {
                                if (lVarV.K(qVar)) {
                                    i24 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i24 = 268435456;
                                }
                                i14 |= i24;
                            }
                            if ((i14 & 306783379) == 306783378 || !lVarV.b()) {
                                lVarV.L();
                                if ((i12 & 1) != 0 || lVarV.k()) {
                                    if (i28 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    } else {
                                        dVar2 = dVar;
                                    }
                                    if (i29 != 0) {
                                        pVarA = k.f95948a.a();
                                    } else {
                                        pVarA = pVar5;
                                    }
                                    if (i15 != 0) {
                                        pVarB = k.f95948a.b();
                                    } else {
                                        pVarB = pVar6;
                                    }
                                    if (i17 != 0) {
                                        pVarC = k.f95948a.c();
                                    } else {
                                        pVarC = pVar7;
                                    }
                                    if (i19 != 0) {
                                        pVarD = k.f95948a.d();
                                    } else {
                                        pVarD = pVar8;
                                    }
                                    if (i22 != 0) {
                                        iA = o.INSTANCE.a();
                                    } else {
                                        iA = i11;
                                    }
                                    if ((i13 & 64) != 0) {
                                        i14 &= -3670017;
                                        background = t.f96158a.a(lVarV, 6).getBackground();
                                    } else {
                                        background = j11;
                                    }
                                    if ((i13 & 128) != 0) {
                                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                        i14 &= -29360129;
                                    } else {
                                        jC = j12;
                                    }
                                    if ((i13 & 256) != 0) {
                                        m0VarA = a0.f95716a.a(lVarV, 6);
                                        i14 &= -234881025;
                                    } else {
                                        m0VarA = m0Var;
                                    }
                                    j13 = jC;
                                } else {
                                    lVarV.j();
                                    if ((i13 & 64) != 0) {
                                        i14 &= -3670017;
                                    }
                                    if ((i13 & 128) != 0) {
                                        i14 &= -29360129;
                                    }
                                    if ((i13 & 256) != 0) {
                                        i14 &= -234881025;
                                    }
                                    dVar2 = dVar;
                                    iA = i11;
                                    background = j11;
                                    m0VarA = m0Var;
                                    pVarA = pVar5;
                                    pVarB = pVar6;
                                    pVarC = pVar7;
                                    pVarD = pVar8;
                                    j13 = j12;
                                }
                                lVarV.C();
                                if (o.J()) {
                                    o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                                }
                                int i31 = (234881024 & i14) ^ r19;
                                z11 = (i31 <= 67108864 && lVarV.n(m0VarA)) || (i14 & r19) == 67108864;
                                objI = lVarV.I();
                                if (z11 || objI == p020r2.l.INSTANCE.a()) {
                                    objI = new p2.e(m0VarA);
                                    lVarV.B(objI);
                                }
                                eVar = (p2.e) objI;
                                long j16 = background;
                                zN = ((i31 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                                objI2 = lVarV.I();
                                if (zN || objI2 == p020r2.l.INSTANCE.a()) {
                                    objI2 = new a(eVar, m0VarA);
                                    lVarV.B(objI2);
                                }
                                int i32 = i14 >> 12;
                                lVar2 = lVarV;
                                m0.a(p0.b(dVar2, (l) objI2), null, j16, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i32 & 896) | 12582912 | (i32 & 7168), 114);
                                if (o.J()) {
                                    o.R();
                                }
                                dVar3 = dVar2;
                                pVar9 = pVarA;
                                pVar10 = pVarB;
                                pVar11 = pVarC;
                                pVar12 = pVarD;
                                i25 = iA;
                                j14 = j16;
                                j15 = j13;
                            } else {
                                lVarV.j();
                                m0VarA = m0Var;
                                lVar2 = lVarV;
                                pVar9 = pVar5;
                                pVar10 = pVar6;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                dVar3 = dVar;
                                i25 = i11;
                                j14 = j11;
                                j15 = j12;
                            }
                            w2VarX = lVar2.x();
                            if (w2VarX != null) {
                                w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                            }
                        }
                        i14 |= 805306368;
                        if ((i14 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i12 & 1) != 0) {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            } else {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            int i33 = (234881024 & i14) ^ r19;
                            if (i33 <= 67108864) {
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            } else {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            }
                            eVar = (p2.e) objI;
                            long j17 = background;
                            zN = ((i33 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                            objI2 = lVarV.I();
                            if (zN) {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            } else {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            }
                            int i34 = i14 >> 12;
                            lVar2 = lVarV;
                            m0.a(p0.b(dVar2, (l) objI2), null, j17, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i34 & 896) | 12582912 | (i34 & 7168), 114);
                            if (o.J()) {
                                o.R();
                            }
                            dVar3 = dVar2;
                            pVar9 = pVarA;
                            pVar10 = pVarB;
                            pVar11 = pVarC;
                            pVar12 = pVarD;
                            i25 = iA;
                            j14 = j17;
                            j15 = j13;
                        } else {
                            lVarV.L();
                            if ((i12 & 1) != 0) {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            } else {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            int i35 = (234881024 & i14) ^ r19;
                            if (i35 <= 67108864) {
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            } else {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            }
                            eVar = (p2.e) objI;
                            long j18 = background;
                            zN = ((i35 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                            objI2 = lVarV.I();
                            if (zN) {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            } else {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            }
                            int i36 = i14 >> 12;
                            lVar2 = lVarV;
                            m0.a(p0.b(dVar2, (l) objI2), null, j18, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i36 & 896) | 12582912 | (i36 & 7168), 114);
                            if (o.J()) {
                                o.R();
                            }
                            dVar3 = dVar2;
                            pVar9 = pVarA;
                            pVar10 = pVarB;
                            pVar11 = pVarC;
                            pVar12 = pVarD;
                            i25 = iA;
                            j14 = j18;
                            j15 = j13;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                        }
                    }
                    i14 |= 24576;
                    pVar8 = pVar4;
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= 196608;
                    } else if ((i12 & 196608) == 0) {
                        if (lVarV.r(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    if ((i12 & 1572864) != 0) {
                        if ((i13 & 64) == 0) {
                            i27 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i27 = PKIFailureInfo.signerNotTrusted;
                        }
                        i14 |= i27;
                    }
                    if ((i12 & 12582912) != 0) {
                        if ((i13 & 128) == 0) {
                            i26 = 4194304;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i12 & 100663296) != 0) {
                        i14 |= ((i13 & 256) == 0 || !lVarV.n(m0Var)) ? 33554432 : 67108864;
                    }
                    if ((i13 & 512) != 0) {
                        if ((i12 & 805306368) == 0) {
                            if (lVarV.K(qVar)) {
                                i24 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i24 = 268435456;
                            }
                            i14 |= i24;
                        }
                        if ((i14 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i12 & 1) != 0) {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            } else {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            int i37 = (234881024 & i14) ^ r19;
                            if (i37 <= 67108864) {
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            } else {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            }
                            eVar = (p2.e) objI;
                            long j19 = background;
                            zN = ((i37 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                            objI2 = lVarV.I();
                            if (zN) {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            } else {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            }
                            int i38 = i14 >> 12;
                            lVar2 = lVarV;
                            m0.a(p0.b(dVar2, (l) objI2), null, j19, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i38 & 896) | 12582912 | (i38 & 7168), 114);
                            if (o.J()) {
                                o.R();
                            }
                            dVar3 = dVar2;
                            pVar9 = pVarA;
                            pVar10 = pVarB;
                            pVar11 = pVarC;
                            pVar12 = pVarD;
                            i25 = iA;
                            j14 = j19;
                            j15 = j13;
                        } else {
                            lVarV.L();
                            if ((i12 & 1) != 0) {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            } else {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            int i39 = (234881024 & i14) ^ r19;
                            if (i39 <= 67108864) {
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            } else {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            }
                            eVar = (p2.e) objI;
                            long j110 = background;
                            zN = ((i39 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                            objI2 = lVarV.I();
                            if (zN) {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            } else {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            }
                            int i310 = i14 >> 12;
                            lVar2 = lVarV;
                            m0.a(p0.b(dVar2, (l) objI2), null, j110, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i310 & 896) | 12582912 | (i310 & 7168), 114);
                            if (o.J()) {
                                o.R();
                            }
                            dVar3 = dVar2;
                            pVar9 = pVarA;
                            pVar10 = pVarB;
                            pVar11 = pVarC;
                            pVar12 = pVarD;
                            i25 = iA;
                            j14 = j110;
                            j15 = j13;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    if ((i14 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i311 = (234881024 & i14) ^ r19;
                        if (i311 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j111 = background;
                        zN = ((i311 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i312 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j111, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i312 & 896) | 12582912 | (i312 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j111;
                        j15 = j13;
                    } else {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i313 = (234881024 & i14) ^ r19;
                        if (i313 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j112 = background;
                        zN = ((i313 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i314 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j112, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i314 & 896) | 12582912 | (i314 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j112;
                        j15 = j13;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                    }
                }
                i14 |= 3072;
                pVar7 = pVar3;
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        pVar8 = pVar4;
                        if (lVarV.K(pVar8)) {
                            i21 = 16384;
                        } else {
                            i21 = PKIFailureInfo.certRevoked;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= 196608;
                    } else if ((i12 & 196608) == 0) {
                        if (lVarV.r(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    if ((i12 & 1572864) != 0) {
                        if ((i13 & 64) == 0) {
                            i27 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i27 = PKIFailureInfo.signerNotTrusted;
                        }
                        i14 |= i27;
                    }
                    if ((i12 & 12582912) != 0) {
                        if ((i13 & 128) == 0) {
                            i26 = 4194304;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i12 & 100663296) != 0) {
                        i14 |= ((i13 & 256) == 0 || !lVarV.n(m0Var)) ? 33554432 : 67108864;
                    }
                    if ((i13 & 512) != 0) {
                        if ((i12 & 805306368) == 0) {
                            if (lVarV.K(qVar)) {
                                i24 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i24 = 268435456;
                            }
                            i14 |= i24;
                        }
                        if ((i14 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i12 & 1) != 0) {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            } else {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            int i315 = (234881024 & i14) ^ r19;
                            if (i315 <= 67108864) {
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            } else {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            }
                            eVar = (p2.e) objI;
                            long j113 = background;
                            zN = ((i315 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                            objI2 = lVarV.I();
                            if (zN) {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            } else {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            }
                            int i316 = i14 >> 12;
                            lVar2 = lVarV;
                            m0.a(p0.b(dVar2, (l) objI2), null, j113, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i316 & 896) | 12582912 | (i316 & 7168), 114);
                            if (o.J()) {
                                o.R();
                            }
                            dVar3 = dVar2;
                            pVar9 = pVarA;
                            pVar10 = pVarB;
                            pVar11 = pVarC;
                            pVar12 = pVarD;
                            i25 = iA;
                            j14 = j113;
                            j15 = j13;
                        } else {
                            lVarV.L();
                            if ((i12 & 1) != 0) {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            } else {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            int i317 = (234881024 & i14) ^ r19;
                            if (i317 <= 67108864) {
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            } else {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            }
                            eVar = (p2.e) objI;
                            long j114 = background;
                            zN = ((i317 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                            objI2 = lVarV.I();
                            if (zN) {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            } else {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            }
                            int i318 = i14 >> 12;
                            lVar2 = lVarV;
                            m0.a(p0.b(dVar2, (l) objI2), null, j114, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i318 & 896) | 12582912 | (i318 & 7168), 114);
                            if (o.J()) {
                                o.R();
                            }
                            dVar3 = dVar2;
                            pVar9 = pVarA;
                            pVar10 = pVarB;
                            pVar11 = pVarC;
                            pVar12 = pVarD;
                            i25 = iA;
                            j14 = j114;
                            j15 = j13;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    if ((i14 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i319 = (234881024 & i14) ^ r19;
                        if (i319 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j115 = background;
                        zN = ((i319 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i3110 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j115, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3110 & 896) | 12582912 | (i3110 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j115;
                        j15 = j13;
                    } else {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i3111 = (234881024 & i14) ^ r19;
                        if (i3111 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j116 = background;
                        zN = ((i3111 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i3112 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j116, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3112 & 896) | 12582912 | (i3112 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j116;
                        j15 = j13;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                    }
                }
                i14 |= 24576;
                pVar8 = pVar4;
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (lVarV.r(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                if ((i12 & 1572864) != 0) {
                    if ((i13 & 64) == 0) {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i27;
                }
                if ((i12 & 12582912) != 0) {
                    if ((i13 & 128) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i12 & 100663296) != 0) {
                    i14 |= ((i13 & 256) == 0 || !lVarV.n(m0Var)) ? 33554432 : 67108864;
                }
                if ((i13 & 512) != 0) {
                    if ((i12 & 805306368) == 0) {
                        if (lVarV.K(qVar)) {
                            i24 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i24 = 268435456;
                        }
                        i14 |= i24;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i3113 = (234881024 & i14) ^ r19;
                        if (i3113 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j117 = background;
                        zN = ((i3113 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i3114 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j117, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3114 & 896) | 12582912 | (i3114 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j117;
                        j15 = j13;
                    } else {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i3115 = (234881024 & i14) ^ r19;
                        if (i3115 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j118 = background;
                        zN = ((i3115 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i3116 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j118, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3116 & 896) | 12582912 | (i3116 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j118;
                        j15 = j13;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                    }
                }
                i14 |= 805306368;
                if ((i14 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i3117 = (234881024 & i14) ^ r19;
                    if (i3117 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j119 = background;
                    zN = ((i3117 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i3118 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j119, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3118 & 896) | 12582912 | (i3118 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j119;
                    j15 = j13;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i3119 = (234881024 & i14) ^ r19;
                    if (i3119 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j1110 = background;
                    zN = ((i3119 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i31110 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j1110, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31110 & 896) | 12582912 | (i31110 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j1110;
                    j15 = j13;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                }
            }
            i14 |= KyberEngine.KyberPolyBytes;
            pVar6 = pVar2;
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    pVar7 = pVar3;
                    if (lVarV.K(pVar7)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        pVar8 = pVar4;
                        if (lVarV.K(pVar8)) {
                            i21 = 16384;
                        } else {
                            i21 = PKIFailureInfo.certRevoked;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= 196608;
                    } else if ((i12 & 196608) == 0) {
                        if (lVarV.r(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    if ((i12 & 1572864) != 0) {
                        if ((i13 & 64) == 0) {
                            i27 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i27 = PKIFailureInfo.signerNotTrusted;
                        }
                        i14 |= i27;
                    }
                    if ((i12 & 12582912) != 0) {
                        if ((i13 & 128) == 0) {
                            i26 = 4194304;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i12 & 100663296) != 0) {
                        i14 |= ((i13 & 256) == 0 || !lVarV.n(m0Var)) ? 33554432 : 67108864;
                    }
                    if ((i13 & 512) != 0) {
                        if ((i12 & 805306368) == 0) {
                            if (lVarV.K(qVar)) {
                                i24 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i24 = 268435456;
                            }
                            i14 |= i24;
                        }
                        if ((i14 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i12 & 1) != 0) {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            } else {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            int i31111 = (234881024 & i14) ^ r19;
                            if (i31111 <= 67108864) {
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            } else {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            }
                            eVar = (p2.e) objI;
                            long j1111 = background;
                            zN = ((i31111 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                            objI2 = lVarV.I();
                            if (zN) {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            } else {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            }
                            int i31112 = i14 >> 12;
                            lVar2 = lVarV;
                            m0.a(p0.b(dVar2, (l) objI2), null, j1111, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31112 & 896) | 12582912 | (i31112 & 7168), 114);
                            if (o.J()) {
                                o.R();
                            }
                            dVar3 = dVar2;
                            pVar9 = pVarA;
                            pVar10 = pVarB;
                            pVar11 = pVarC;
                            pVar12 = pVarD;
                            i25 = iA;
                            j14 = j1111;
                            j15 = j13;
                        } else {
                            lVarV.L();
                            if ((i12 & 1) != 0) {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            } else {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            int i31113 = (234881024 & i14) ^ r19;
                            if (i31113 <= 67108864) {
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            } else {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            }
                            eVar = (p2.e) objI;
                            long j1112 = background;
                            zN = ((i31113 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                            objI2 = lVarV.I();
                            if (zN) {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            } else {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            }
                            int i31114 = i14 >> 12;
                            lVar2 = lVarV;
                            m0.a(p0.b(dVar2, (l) objI2), null, j1112, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31114 & 896) | 12582912 | (i31114 & 7168), 114);
                            if (o.J()) {
                                o.R();
                            }
                            dVar3 = dVar2;
                            pVar9 = pVarA;
                            pVar10 = pVarB;
                            pVar11 = pVarC;
                            pVar12 = pVarD;
                            i25 = iA;
                            j14 = j1112;
                            j15 = j13;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    if ((i14 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i31115 = (234881024 & i14) ^ r19;
                        if (i31115 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j1113 = background;
                        zN = ((i31115 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i31116 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j1113, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31116 & 896) | 12582912 | (i31116 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j1113;
                        j15 = j13;
                    } else {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i31117 = (234881024 & i14) ^ r19;
                        if (i31117 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j1114 = background;
                        zN = ((i31117 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i31118 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j1114, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31118 & 896) | 12582912 | (i31118 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j1114;
                        j15 = j13;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                    }
                }
                i14 |= 24576;
                pVar8 = pVar4;
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (lVarV.r(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                if ((i12 & 1572864) != 0) {
                    if ((i13 & 64) == 0) {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i27;
                }
                if ((i12 & 12582912) != 0) {
                    if ((i13 & 128) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i12 & 100663296) != 0) {
                    i14 |= ((i13 & 256) == 0 || !lVarV.n(m0Var)) ? 33554432 : 67108864;
                }
                if ((i13 & 512) != 0) {
                    if ((i12 & 805306368) == 0) {
                        if (lVarV.K(qVar)) {
                            i24 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i24 = 268435456;
                        }
                        i14 |= i24;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i31119 = (234881024 & i14) ^ r19;
                        if (i31119 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j1115 = background;
                        zN = ((i31119 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i311110 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j1115, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i311110 & 896) | 12582912 | (i311110 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j1115;
                        j15 = j13;
                    } else {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i311111 = (234881024 & i14) ^ r19;
                        if (i311111 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j1116 = background;
                        zN = ((i311111 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i311112 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j1116, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i311112 & 896) | 12582912 | (i311112 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j1116;
                        j15 = j13;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                    }
                }
                i14 |= 805306368;
                if ((i14 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i311113 = (234881024 & i14) ^ r19;
                    if (i311113 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j1117 = background;
                    zN = ((i311113 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i311114 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j1117, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i311114 & 896) | 12582912 | (i311114 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j1117;
                    j15 = j13;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i311115 = (234881024 & i14) ^ r19;
                    if (i311115 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j1118 = background;
                    zN = ((i311115 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i311116 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j1118, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i311116 & 896) | 12582912 | (i311116 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j1118;
                    j15 = j13;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                }
            }
            i14 |= 3072;
            pVar7 = pVar3;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    pVar8 = pVar4;
                    if (lVarV.K(pVar8)) {
                        i21 = 16384;
                    } else {
                        i21 = PKIFailureInfo.certRevoked;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (lVarV.r(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                if ((i12 & 1572864) != 0) {
                    if ((i13 & 64) == 0) {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i27;
                }
                if ((i12 & 12582912) != 0) {
                    if ((i13 & 128) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i12 & 100663296) != 0) {
                    i14 |= ((i13 & 256) == 0 || !lVarV.n(m0Var)) ? 33554432 : 67108864;
                }
                if ((i13 & 512) != 0) {
                    if ((i12 & 805306368) == 0) {
                        if (lVarV.K(qVar)) {
                            i24 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i24 = 268435456;
                        }
                        i14 |= i24;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i311117 = (234881024 & i14) ^ r19;
                        if (i311117 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j1119 = background;
                        zN = ((i311117 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i311118 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j1119, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i311118 & 896) | 12582912 | (i311118 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j1119;
                        j15 = j13;
                    } else {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i311119 = (234881024 & i14) ^ r19;
                        if (i311119 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j11110 = background;
                        zN = ((i311119 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i3111110 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j11110, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3111110 & 896) | 12582912 | (i3111110 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j11110;
                        j15 = j13;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                    }
                }
                i14 |= 805306368;
                if ((i14 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i3111111 = (234881024 & i14) ^ r19;
                    if (i3111111 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j11111 = background;
                    zN = ((i3111111 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i3111112 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j11111, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3111112 & 896) | 12582912 | (i3111112 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j11111;
                    j15 = j13;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i3111113 = (234881024 & i14) ^ r19;
                    if (i3111113 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j11112 = background;
                    zN = ((i3111113 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i3111114 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j11112, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3111114 & 896) | 12582912 | (i3111114 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j11112;
                    j15 = j13;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                }
            }
            i14 |= 24576;
            pVar8 = pVar4;
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= 196608;
            } else if ((i12 & 196608) == 0) {
                if (lVarV.r(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            if ((i12 & 1572864) != 0) {
                if ((i13 & 64) == 0) {
                    i27 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i14 |= i27;
            }
            if ((i12 & 12582912) != 0) {
                if ((i13 & 128) == 0) {
                    i26 = 4194304;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i12 & 100663296) != 0) {
                i14 |= ((i13 & 256) == 0 || !lVarV.n(m0Var)) ? 33554432 : 67108864;
            }
            if ((i13 & 512) != 0) {
                if ((i12 & 805306368) == 0) {
                    if (lVarV.K(qVar)) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                    i14 |= i24;
                }
                if ((i14 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i3111115 = (234881024 & i14) ^ r19;
                    if (i3111115 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j11113 = background;
                    zN = ((i3111115 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i3111116 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j11113, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3111116 & 896) | 12582912 | (i3111116 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j11113;
                    j15 = j13;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i3111117 = (234881024 & i14) ^ r19;
                    if (i3111117 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j11114 = background;
                    zN = ((i3111117 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i3111118 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j11114, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3111118 & 896) | 12582912 | (i3111118 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j11114;
                    j15 = j13;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                }
            }
            i14 |= 805306368;
            if ((i14 & 306783379) == 306783378) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                } else {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                int i3111119 = (234881024 & i14) ^ r19;
                if (i3111119 <= 67108864) {
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                } else {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                }
                eVar = (p2.e) objI;
                long j11115 = background;
                zN = ((i3111119 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                } else {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                }
                int i31111110 = i14 >> 12;
                lVar2 = lVarV;
                m0.a(p0.b(dVar2, (l) objI2), null, j11115, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31111110 & 896) | 12582912 | (i31111110 & 7168), 114);
                if (o.J()) {
                    o.R();
                }
                dVar3 = dVar2;
                pVar9 = pVarA;
                pVar10 = pVarB;
                pVar11 = pVarC;
                pVar12 = pVarD;
                i25 = iA;
                j14 = j11115;
                j15 = j13;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                } else {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                int i31111111 = (234881024 & i14) ^ r19;
                if (i31111111 <= 67108864) {
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                } else {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                }
                eVar = (p2.e) objI;
                long j11116 = background;
                zN = ((i31111111 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                } else {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                }
                int i31111112 = i14 >> 12;
                lVar2 = lVarV;
                m0.a(p0.b(dVar2, (l) objI2), null, j11116, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31111112 & 896) | 12582912 | (i31111112 & 7168), 114);
                if (o.J()) {
                    o.R();
                }
                dVar3 = dVar2;
                pVar9 = pVarA;
                pVar10 = pVarB;
                pVar11 = pVarC;
                pVar12 = pVarD;
                i25 = iA;
                j14 = j11116;
                j15 = j13;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
            }
        }
        i14 |= 48;
        pVar5 = pVar;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
                pVar6 = pVar2;
                if (lVarV.K(pVar6)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i14 |= i16;
            }
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    pVar7 = pVar3;
                    if (lVarV.K(pVar7)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        pVar8 = pVar4;
                        if (lVarV.K(pVar8)) {
                            i21 = 16384;
                        } else {
                            i21 = PKIFailureInfo.certRevoked;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= 196608;
                    } else if ((i12 & 196608) == 0) {
                        if (lVarV.r(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    if ((i12 & 1572864) != 0) {
                        if ((i13 & 64) == 0) {
                            i27 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i27 = PKIFailureInfo.signerNotTrusted;
                        }
                        i14 |= i27;
                    }
                    if ((i12 & 12582912) != 0) {
                        if ((i13 & 128) == 0) {
                            i26 = 4194304;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i12 & 100663296) != 0) {
                        i14 |= ((i13 & 256) == 0 || !lVarV.n(m0Var)) ? 33554432 : 67108864;
                    }
                    if ((i13 & 512) != 0) {
                        if ((i12 & 805306368) == 0) {
                            if (lVarV.K(qVar)) {
                                i24 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i24 = 268435456;
                            }
                            i14 |= i24;
                        }
                        if ((i14 & 306783379) == 306783378) {
                            lVarV.L();
                            if ((i12 & 1) != 0) {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            } else {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            int i31111113 = (234881024 & i14) ^ r19;
                            if (i31111113 <= 67108864) {
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            } else {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            }
                            eVar = (p2.e) objI;
                            long j11117 = background;
                            zN = ((i31111113 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                            objI2 = lVarV.I();
                            if (zN) {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            } else {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            }
                            int i31111114 = i14 >> 12;
                            lVar2 = lVarV;
                            m0.a(p0.b(dVar2, (l) objI2), null, j11117, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31111114 & 896) | 12582912 | (i31111114 & 7168), 114);
                            if (o.J()) {
                                o.R();
                            }
                            dVar3 = dVar2;
                            pVar9 = pVarA;
                            pVar10 = pVarB;
                            pVar11 = pVarC;
                            pVar12 = pVarD;
                            i25 = iA;
                            j14 = j11117;
                            j15 = j13;
                        } else {
                            lVarV.L();
                            if ((i12 & 1) != 0) {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            } else {
                                if (i28 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i29 != 0) {
                                    pVarA = k.f95948a.a();
                                } else {
                                    pVarA = pVar5;
                                }
                                if (i15 != 0) {
                                    pVarB = k.f95948a.b();
                                } else {
                                    pVarB = pVar6;
                                }
                                if (i17 != 0) {
                                    pVarC = k.f95948a.c();
                                } else {
                                    pVarC = pVar7;
                                }
                                if (i19 != 0) {
                                    pVarD = k.f95948a.d();
                                } else {
                                    pVarD = pVar8;
                                }
                                if (i22 != 0) {
                                    iA = o.INSTANCE.a();
                                } else {
                                    iA = i11;
                                }
                                if ((i13 & 64) != 0) {
                                    i14 &= -3670017;
                                    background = t.f96158a.a(lVarV, 6).getBackground();
                                } else {
                                    background = j11;
                                }
                                if ((i13 & 128) != 0) {
                                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                    i14 &= -29360129;
                                } else {
                                    jC = j12;
                                }
                                if ((i13 & 256) != 0) {
                                    m0VarA = a0.f95716a.a(lVarV, 6);
                                    i14 &= -234881025;
                                } else {
                                    m0VarA = m0Var;
                                }
                                j13 = jC;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                            }
                            int i31111115 = (234881024 & i14) ^ r19;
                            if (i31111115 <= 67108864) {
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            } else {
                                objI = new p2.e(m0VarA);
                                lVarV.B(objI);
                            }
                            eVar = (p2.e) objI;
                            long j11118 = background;
                            zN = ((i31111115 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                            objI2 = lVarV.I();
                            if (zN) {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            } else {
                                objI2 = new a(eVar, m0VarA);
                                lVarV.B(objI2);
                            }
                            int i31111116 = i14 >> 12;
                            lVar2 = lVarV;
                            m0.a(p0.b(dVar2, (l) objI2), null, j11118, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31111116 & 896) | 12582912 | (i31111116 & 7168), 114);
                            if (o.J()) {
                                o.R();
                            }
                            dVar3 = dVar2;
                            pVar9 = pVarA;
                            pVar10 = pVarB;
                            pVar11 = pVarC;
                            pVar12 = pVarD;
                            i25 = iA;
                            j14 = j11118;
                            j15 = j13;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    if ((i14 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i31111117 = (234881024 & i14) ^ r19;
                        if (i31111117 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j11119 = background;
                        zN = ((i31111117 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i31111118 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j11119, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31111118 & 896) | 12582912 | (i31111118 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j11119;
                        j15 = j13;
                    } else {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i31111119 = (234881024 & i14) ^ r19;
                        if (i31111119 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j111110 = background;
                        zN = ((i31111119 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i311111110 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j111110, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i311111110 & 896) | 12582912 | (i311111110 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j111110;
                        j15 = j13;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                    }
                }
                i14 |= 24576;
                pVar8 = pVar4;
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (lVarV.r(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                if ((i12 & 1572864) != 0) {
                    if ((i13 & 64) == 0) {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i27;
                }
                if ((i12 & 12582912) != 0) {
                    if ((i13 & 128) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i12 & 100663296) != 0) {
                    i14 |= ((i13 & 256) == 0 || !lVarV.n(m0Var)) ? 33554432 : 67108864;
                }
                if ((i13 & 512) != 0) {
                    if ((i12 & 805306368) == 0) {
                        if (lVarV.K(qVar)) {
                            i24 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i24 = 268435456;
                        }
                        i14 |= i24;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i311111111 = (234881024 & i14) ^ r19;
                        if (i311111111 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j111111 = background;
                        zN = ((i311111111 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i311111112 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j111111, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i311111112 & 896) | 12582912 | (i311111112 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j111111;
                        j15 = j13;
                    } else {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i311111113 = (234881024 & i14) ^ r19;
                        if (i311111113 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j111112 = background;
                        zN = ((i311111113 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i311111114 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j111112, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i311111114 & 896) | 12582912 | (i311111114 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j111112;
                        j15 = j13;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                    }
                }
                i14 |= 805306368;
                if ((i14 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i311111115 = (234881024 & i14) ^ r19;
                    if (i311111115 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j111113 = background;
                    zN = ((i311111115 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i311111116 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j111113, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i311111116 & 896) | 12582912 | (i311111116 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j111113;
                    j15 = j13;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i311111117 = (234881024 & i14) ^ r19;
                    if (i311111117 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j111114 = background;
                    zN = ((i311111117 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i311111118 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j111114, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i311111118 & 896) | 12582912 | (i311111118 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j111114;
                    j15 = j13;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                }
            }
            i14 |= 3072;
            pVar7 = pVar3;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    pVar8 = pVar4;
                    if (lVarV.K(pVar8)) {
                        i21 = 16384;
                    } else {
                        i21 = PKIFailureInfo.certRevoked;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (lVarV.r(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                if ((i12 & 1572864) != 0) {
                    if ((i13 & 64) == 0) {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i27;
                }
                if ((i12 & 12582912) != 0) {
                    if ((i13 & 128) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i12 & 100663296) != 0) {
                    i14 |= ((i13 & 256) == 0 || !lVarV.n(m0Var)) ? 33554432 : 67108864;
                }
                if ((i13 & 512) != 0) {
                    if ((i12 & 805306368) == 0) {
                        if (lVarV.K(qVar)) {
                            i24 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i24 = 268435456;
                        }
                        i14 |= i24;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i311111119 = (234881024 & i14) ^ r19;
                        if (i311111119 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j111115 = background;
                        zN = ((i311111119 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i3111111110 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j111115, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3111111110 & 896) | 12582912 | (i3111111110 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j111115;
                        j15 = j13;
                    } else {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i3111111111 = (234881024 & i14) ^ r19;
                        if (i3111111111 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j111116 = background;
                        zN = ((i3111111111 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i3111111112 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j111116, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3111111112 & 896) | 12582912 | (i3111111112 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j111116;
                        j15 = j13;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                    }
                }
                i14 |= 805306368;
                if ((i14 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i3111111113 = (234881024 & i14) ^ r19;
                    if (i3111111113 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j111117 = background;
                    zN = ((i3111111113 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i3111111114 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j111117, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3111111114 & 896) | 12582912 | (i3111111114 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j111117;
                    j15 = j13;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i3111111115 = (234881024 & i14) ^ r19;
                    if (i3111111115 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j111118 = background;
                    zN = ((i3111111115 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i3111111116 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j111118, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3111111116 & 896) | 12582912 | (i3111111116 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j111118;
                    j15 = j13;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                }
            }
            i14 |= 24576;
            pVar8 = pVar4;
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= 196608;
            } else if ((i12 & 196608) == 0) {
                if (lVarV.r(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            if ((i12 & 1572864) != 0) {
                if ((i13 & 64) == 0) {
                    i27 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i14 |= i27;
            }
            if ((i12 & 12582912) != 0) {
                if ((i13 & 128) == 0) {
                    i26 = 4194304;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i12 & 100663296) != 0) {
                i14 |= ((i13 & 256) == 0 || !lVarV.n(m0Var)) ? 33554432 : 67108864;
            }
            if ((i13 & 512) != 0) {
                if ((i12 & 805306368) == 0) {
                    if (lVarV.K(qVar)) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                    i14 |= i24;
                }
                if ((i14 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i3111111117 = (234881024 & i14) ^ r19;
                    if (i3111111117 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j111119 = background;
                    zN = ((i3111111117 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i3111111118 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j111119, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3111111118 & 896) | 12582912 | (i3111111118 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j111119;
                    j15 = j13;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i3111111119 = (234881024 & i14) ^ r19;
                    if (i3111111119 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j1111110 = background;
                    zN = ((i3111111119 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i31111111110 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j1111110, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31111111110 & 896) | 12582912 | (i31111111110 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j1111110;
                    j15 = j13;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                }
            }
            i14 |= 805306368;
            if ((i14 & 306783379) == 306783378) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                } else {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                int i31111111111 = (234881024 & i14) ^ r19;
                if (i31111111111 <= 67108864) {
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                } else {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                }
                eVar = (p2.e) objI;
                long j1111111 = background;
                zN = ((i31111111111 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                } else {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                }
                int i31111111112 = i14 >> 12;
                lVar2 = lVarV;
                m0.a(p0.b(dVar2, (l) objI2), null, j1111111, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31111111112 & 896) | 12582912 | (i31111111112 & 7168), 114);
                if (o.J()) {
                    o.R();
                }
                dVar3 = dVar2;
                pVar9 = pVarA;
                pVar10 = pVarB;
                pVar11 = pVarC;
                pVar12 = pVarD;
                i25 = iA;
                j14 = j1111111;
                j15 = j13;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                } else {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                int i31111111113 = (234881024 & i14) ^ r19;
                if (i31111111113 <= 67108864) {
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                } else {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                }
                eVar = (p2.e) objI;
                long j1111112 = background;
                zN = ((i31111111113 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                } else {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                }
                int i31111111114 = i14 >> 12;
                lVar2 = lVarV;
                m0.a(p0.b(dVar2, (l) objI2), null, j1111112, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31111111114 & 896) | 12582912 | (i31111111114 & 7168), 114);
                if (o.J()) {
                    o.R();
                }
                dVar3 = dVar2;
                pVar9 = pVarA;
                pVar10 = pVarB;
                pVar11 = pVarC;
                pVar12 = pVarD;
                i25 = iA;
                j14 = j1111112;
                j15 = j13;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
            }
        }
        i14 |= KyberEngine.KyberPolyBytes;
        pVar6 = pVar2;
        i17 = i13 & 8;
        if (i17 != 0) {
            if ((i12 & 3072) == 0) {
                pVar7 = pVar3;
                if (lVarV.K(pVar7)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i14 |= i18;
            }
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    pVar8 = pVar4;
                    if (lVarV.K(pVar8)) {
                        i21 = 16384;
                    } else {
                        i21 = PKIFailureInfo.certRevoked;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (lVarV.r(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                if ((i12 & 1572864) != 0) {
                    if ((i13 & 64) == 0) {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i27;
                }
                if ((i12 & 12582912) != 0) {
                    if ((i13 & 128) == 0) {
                        i26 = 4194304;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i12 & 100663296) != 0) {
                    i14 |= ((i13 & 256) == 0 || !lVarV.n(m0Var)) ? 33554432 : 67108864;
                }
                if ((i13 & 512) != 0) {
                    if ((i12 & 805306368) == 0) {
                        if (lVarV.K(qVar)) {
                            i24 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i24 = 268435456;
                        }
                        i14 |= i24;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i31111111115 = (234881024 & i14) ^ r19;
                        if (i31111111115 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j1111113 = background;
                        zN = ((i31111111115 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i31111111116 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j1111113, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31111111116 & 896) | 12582912 | (i31111111116 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j1111113;
                        j15 = j13;
                    } else {
                        lVarV.L();
                        if ((i12 & 1) != 0) {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        } else {
                            if (i28 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i29 != 0) {
                                pVarA = k.f95948a.a();
                            } else {
                                pVarA = pVar5;
                            }
                            if (i15 != 0) {
                                pVarB = k.f95948a.b();
                            } else {
                                pVarB = pVar6;
                            }
                            if (i17 != 0) {
                                pVarC = k.f95948a.c();
                            } else {
                                pVarC = pVar7;
                            }
                            if (i19 != 0) {
                                pVarD = k.f95948a.d();
                            } else {
                                pVarD = pVar8;
                            }
                            if (i22 != 0) {
                                iA = o.INSTANCE.a();
                            } else {
                                iA = i11;
                            }
                            if ((i13 & 64) != 0) {
                                i14 &= -3670017;
                                background = t.f96158a.a(lVarV, 6).getBackground();
                            } else {
                                background = j11;
                            }
                            if ((i13 & 128) != 0) {
                                jC = j.c(background, lVarV, (i14 >> 18) & 14);
                                i14 &= -29360129;
                            } else {
                                jC = j12;
                            }
                            if ((i13 & 256) != 0) {
                                m0VarA = a0.f95716a.a(lVarV, 6);
                                i14 &= -234881025;
                            } else {
                                m0VarA = m0Var;
                            }
                            j13 = jC;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                        }
                        int i31111111117 = (234881024 & i14) ^ r19;
                        if (i31111111117 <= 67108864) {
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        } else {
                            objI = new p2.e(m0VarA);
                            lVarV.B(objI);
                        }
                        eVar = (p2.e) objI;
                        long j1111114 = background;
                        zN = ((i31111111117 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                        objI2 = lVarV.I();
                        if (zN) {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new a(eVar, m0VarA);
                            lVarV.B(objI2);
                        }
                        int i31111111118 = i14 >> 12;
                        lVar2 = lVarV;
                        m0.a(p0.b(dVar2, (l) objI2), null, j1111114, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31111111118 & 896) | 12582912 | (i31111111118 & 7168), 114);
                        if (o.J()) {
                            o.R();
                        }
                        dVar3 = dVar2;
                        pVar9 = pVarA;
                        pVar10 = pVarB;
                        pVar11 = pVarC;
                        pVar12 = pVarD;
                        i25 = iA;
                        j14 = j1111114;
                        j15 = j13;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                    }
                }
                i14 |= 805306368;
                if ((i14 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i31111111119 = (234881024 & i14) ^ r19;
                    if (i31111111119 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j1111115 = background;
                    zN = ((i31111111119 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i311111111110 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j1111115, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i311111111110 & 896) | 12582912 | (i311111111110 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j1111115;
                    j15 = j13;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i311111111111 = (234881024 & i14) ^ r19;
                    if (i311111111111 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j1111116 = background;
                    zN = ((i311111111111 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i311111111112 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j1111116, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i311111111112 & 896) | 12582912 | (i311111111112 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j1111116;
                    j15 = j13;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                }
            }
            i14 |= 24576;
            pVar8 = pVar4;
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= 196608;
            } else if ((i12 & 196608) == 0) {
                if (lVarV.r(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            if ((i12 & 1572864) != 0) {
                if ((i13 & 64) == 0) {
                    i27 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i14 |= i27;
            }
            if ((i12 & 12582912) != 0) {
                if ((i13 & 128) == 0) {
                    i26 = 4194304;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i12 & 100663296) != 0) {
                i14 |= ((i13 & 256) == 0 || !lVarV.n(m0Var)) ? 33554432 : 67108864;
            }
            if ((i13 & 512) != 0) {
                if ((i12 & 805306368) == 0) {
                    if (lVarV.K(qVar)) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                    i14 |= i24;
                }
                if ((i14 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i311111111113 = (234881024 & i14) ^ r19;
                    if (i311111111113 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j1111117 = background;
                    zN = ((i311111111113 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i311111111114 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j1111117, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i311111111114 & 896) | 12582912 | (i311111111114 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j1111117;
                    j15 = j13;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i311111111115 = (234881024 & i14) ^ r19;
                    if (i311111111115 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j1111118 = background;
                    zN = ((i311111111115 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i311111111116 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j1111118, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i311111111116 & 896) | 12582912 | (i311111111116 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j1111118;
                    j15 = j13;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                }
            }
            i14 |= 805306368;
            if ((i14 & 306783379) == 306783378) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                } else {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                int i311111111117 = (234881024 & i14) ^ r19;
                if (i311111111117 <= 67108864) {
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                } else {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                }
                eVar = (p2.e) objI;
                long j1111119 = background;
                zN = ((i311111111117 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                } else {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                }
                int i311111111118 = i14 >> 12;
                lVar2 = lVarV;
                m0.a(p0.b(dVar2, (l) objI2), null, j1111119, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i311111111118 & 896) | 12582912 | (i311111111118 & 7168), 114);
                if (o.J()) {
                    o.R();
                }
                dVar3 = dVar2;
                pVar9 = pVarA;
                pVar10 = pVarB;
                pVar11 = pVarC;
                pVar12 = pVarD;
                i25 = iA;
                j14 = j1111119;
                j15 = j13;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                } else {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                int i311111111119 = (234881024 & i14) ^ r19;
                if (i311111111119 <= 67108864) {
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                } else {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                }
                eVar = (p2.e) objI;
                long j11111110 = background;
                zN = ((i311111111119 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                } else {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                }
                int i3111111111110 = i14 >> 12;
                lVar2 = lVarV;
                m0.a(p0.b(dVar2, (l) objI2), null, j11111110, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3111111111110 & 896) | 12582912 | (i3111111111110 & 7168), 114);
                if (o.J()) {
                    o.R();
                }
                dVar3 = dVar2;
                pVar9 = pVarA;
                pVar10 = pVarB;
                pVar11 = pVarC;
                pVar12 = pVarD;
                i25 = iA;
                j14 = j11111110;
                j15 = j13;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
            }
        }
        i14 |= 3072;
        pVar7 = pVar3;
        i19 = i13 & 16;
        if (i19 != 0) {
            if ((i12 & 24576) == 0) {
                pVar8 = pVar4;
                if (lVarV.K(pVar8)) {
                    i21 = 16384;
                } else {
                    i21 = PKIFailureInfo.certRevoked;
                }
                i14 |= i21;
            }
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= 196608;
            } else if ((i12 & 196608) == 0) {
                if (lVarV.r(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            if ((i12 & 1572864) != 0) {
                if ((i13 & 64) == 0) {
                    i27 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i14 |= i27;
            }
            if ((i12 & 12582912) != 0) {
                if ((i13 & 128) == 0) {
                    i26 = 4194304;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i12 & 100663296) != 0) {
                i14 |= ((i13 & 256) == 0 || !lVarV.n(m0Var)) ? 33554432 : 67108864;
            }
            if ((i13 & 512) != 0) {
                if ((i12 & 805306368) == 0) {
                    if (lVarV.K(qVar)) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                    i14 |= i24;
                }
                if ((i14 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i3111111111111 = (234881024 & i14) ^ r19;
                    if (i3111111111111 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j11111111 = background;
                    zN = ((i3111111111111 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i3111111111112 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j11111111, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3111111111112 & 896) | 12582912 | (i3111111111112 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j11111111;
                    j15 = j13;
                } else {
                    lVarV.L();
                    if ((i12 & 1) != 0) {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    } else {
                        if (i28 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i29 != 0) {
                            pVarA = k.f95948a.a();
                        } else {
                            pVarA = pVar5;
                        }
                        if (i15 != 0) {
                            pVarB = k.f95948a.b();
                        } else {
                            pVarB = pVar6;
                        }
                        if (i17 != 0) {
                            pVarC = k.f95948a.c();
                        } else {
                            pVarC = pVar7;
                        }
                        if (i19 != 0) {
                            pVarD = k.f95948a.d();
                        } else {
                            pVarD = pVar8;
                        }
                        if (i22 != 0) {
                            iA = o.INSTANCE.a();
                        } else {
                            iA = i11;
                        }
                        if ((i13 & 64) != 0) {
                            i14 &= -3670017;
                            background = t.f96158a.a(lVarV, 6).getBackground();
                        } else {
                            background = j11;
                        }
                        if ((i13 & 128) != 0) {
                            jC = j.c(background, lVarV, (i14 >> 18) & 14);
                            i14 &= -29360129;
                        } else {
                            jC = j12;
                        }
                        if ((i13 & 256) != 0) {
                            m0VarA = a0.f95716a.a(lVarV, 6);
                            i14 &= -234881025;
                        } else {
                            m0VarA = m0Var;
                        }
                        j13 = jC;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                    }
                    int i3111111111113 = (234881024 & i14) ^ r19;
                    if (i3111111111113 <= 67108864) {
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    } else {
                        objI = new p2.e(m0VarA);
                        lVarV.B(objI);
                    }
                    eVar = (p2.e) objI;
                    long j11111112 = background;
                    zN = ((i3111111111113 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                    objI2 = lVarV.I();
                    if (zN) {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new a(eVar, m0VarA);
                        lVarV.B(objI2);
                    }
                    int i3111111111114 = i14 >> 12;
                    lVar2 = lVarV;
                    m0.a(p0.b(dVar2, (l) objI2), null, j11111112, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3111111111114 & 896) | 12582912 | (i3111111111114 & 7168), 114);
                    if (o.J()) {
                        o.R();
                    }
                    dVar3 = dVar2;
                    pVar9 = pVarA;
                    pVar10 = pVarB;
                    pVar11 = pVarC;
                    pVar12 = pVarD;
                    i25 = iA;
                    j14 = j11111112;
                    j15 = j13;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
                }
            }
            i14 |= 805306368;
            if ((i14 & 306783379) == 306783378) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                } else {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                int i3111111111115 = (234881024 & i14) ^ r19;
                if (i3111111111115 <= 67108864) {
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                } else {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                }
                eVar = (p2.e) objI;
                long j11111113 = background;
                zN = ((i3111111111115 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                } else {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                }
                int i3111111111116 = i14 >> 12;
                lVar2 = lVarV;
                m0.a(p0.b(dVar2, (l) objI2), null, j11111113, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3111111111116 & 896) | 12582912 | (i3111111111116 & 7168), 114);
                if (o.J()) {
                    o.R();
                }
                dVar3 = dVar2;
                pVar9 = pVarA;
                pVar10 = pVarB;
                pVar11 = pVarC;
                pVar12 = pVarD;
                i25 = iA;
                j14 = j11111113;
                j15 = j13;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                } else {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                int i3111111111117 = (234881024 & i14) ^ r19;
                if (i3111111111117 <= 67108864) {
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                } else {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                }
                eVar = (p2.e) objI;
                long j11111114 = background;
                zN = ((i3111111111117 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                } else {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                }
                int i3111111111118 = i14 >> 12;
                lVar2 = lVarV;
                m0.a(p0.b(dVar2, (l) objI2), null, j11111114, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i3111111111118 & 896) | 12582912 | (i3111111111118 & 7168), 114);
                if (o.J()) {
                    o.R();
                }
                dVar3 = dVar2;
                pVar9 = pVarA;
                pVar10 = pVarB;
                pVar11 = pVarC;
                pVar12 = pVarD;
                i25 = iA;
                j14 = j11111114;
                j15 = j13;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
            }
        }
        i14 |= 24576;
        pVar8 = pVar4;
        i22 = i13 & 32;
        if (i22 != 0) {
            i14 |= 196608;
        } else if ((i12 & 196608) == 0) {
            if (lVarV.r(i11)) {
                i23 = 131072;
            } else {
                i23 = 65536;
            }
            i14 |= i23;
        }
        if ((i12 & 1572864) != 0) {
            if ((i13 & 64) == 0) {
                i27 = PKIFailureInfo.signerNotTrusted;
            } else {
                i27 = PKIFailureInfo.signerNotTrusted;
            }
            i14 |= i27;
        }
        if ((i12 & 12582912) != 0) {
            if ((i13 & 128) == 0) {
                i26 = 4194304;
            } else {
                i26 = 4194304;
            }
            i14 |= i26;
        }
        if ((i12 & 100663296) != 0) {
            i14 |= ((i13 & 256) == 0 || !lVarV.n(m0Var)) ? 33554432 : 67108864;
        }
        if ((i13 & 512) != 0) {
            if ((i12 & 805306368) == 0) {
                if (lVarV.K(qVar)) {
                    i24 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i24 = 268435456;
                }
                i14 |= i24;
            }
            if ((i14 & 306783379) == 306783378) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                } else {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                int i3111111111119 = (234881024 & i14) ^ r19;
                if (i3111111111119 <= 67108864) {
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                } else {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                }
                eVar = (p2.e) objI;
                long j11111115 = background;
                zN = ((i3111111111119 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                } else {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                }
                int i31111111111110 = i14 >> 12;
                lVar2 = lVarV;
                m0.a(p0.b(dVar2, (l) objI2), null, j11111115, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31111111111110 & 896) | 12582912 | (i31111111111110 & 7168), 114);
                if (o.J()) {
                    o.R();
                }
                dVar3 = dVar2;
                pVar9 = pVarA;
                pVar10 = pVarB;
                pVar11 = pVarC;
                pVar12 = pVarD;
                i25 = iA;
                j14 = j11111115;
                j15 = j13;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                } else {
                    if (i28 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i29 != 0) {
                        pVarA = k.f95948a.a();
                    } else {
                        pVarA = pVar5;
                    }
                    if (i15 != 0) {
                        pVarB = k.f95948a.b();
                    } else {
                        pVarB = pVar6;
                    }
                    if (i17 != 0) {
                        pVarC = k.f95948a.c();
                    } else {
                        pVarC = pVar7;
                    }
                    if (i19 != 0) {
                        pVarD = k.f95948a.d();
                    } else {
                        pVarD = pVar8;
                    }
                    if (i22 != 0) {
                        iA = o.INSTANCE.a();
                    } else {
                        iA = i11;
                    }
                    if ((i13 & 64) != 0) {
                        i14 &= -3670017;
                        background = t.f96158a.a(lVarV, 6).getBackground();
                    } else {
                        background = j11;
                    }
                    if ((i13 & 128) != 0) {
                        jC = j.c(background, lVarV, (i14 >> 18) & 14);
                        i14 &= -29360129;
                    } else {
                        jC = j12;
                    }
                    if ((i13 & 256) != 0) {
                        m0VarA = a0.f95716a.a(lVarV, 6);
                        i14 &= -234881025;
                    } else {
                        m0VarA = m0Var;
                    }
                    j13 = jC;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                }
                int i31111111111111 = (234881024 & i14) ^ r19;
                if (i31111111111111 <= 67108864) {
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                } else {
                    objI = new p2.e(m0VarA);
                    lVarV.B(objI);
                }
                eVar = (p2.e) objI;
                long j11111116 = background;
                zN = ((i31111111111111 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
                objI2 = lVarV.I();
                if (zN) {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                } else {
                    objI2 = new a(eVar, m0VarA);
                    lVarV.B(objI2);
                }
                int i31111111111112 = i14 >> 12;
                lVar2 = lVarV;
                m0.a(p0.b(dVar2, (l) objI2), null, j11111116, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31111111111112 & 896) | 12582912 | (i31111111111112 & 7168), 114);
                if (o.J()) {
                    o.R();
                }
                dVar3 = dVar2;
                pVar9 = pVarA;
                pVar10 = pVarB;
                pVar11 = pVarC;
                pVar12 = pVarD;
                i25 = iA;
                j14 = j11111116;
                j15 = j13;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
            }
        }
        i14 |= 805306368;
        if ((i14 & 306783379) == 306783378) {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i28 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar2 = dVar;
                }
                if (i29 != 0) {
                    pVarA = k.f95948a.a();
                } else {
                    pVarA = pVar5;
                }
                if (i15 != 0) {
                    pVarB = k.f95948a.b();
                } else {
                    pVarB = pVar6;
                }
                if (i17 != 0) {
                    pVarC = k.f95948a.c();
                } else {
                    pVarC = pVar7;
                }
                if (i19 != 0) {
                    pVarD = k.f95948a.d();
                } else {
                    pVarD = pVar8;
                }
                if (i22 != 0) {
                    iA = o.INSTANCE.a();
                } else {
                    iA = i11;
                }
                if ((i13 & 64) != 0) {
                    i14 &= -3670017;
                    background = t.f96158a.a(lVarV, 6).getBackground();
                } else {
                    background = j11;
                }
                if ((i13 & 128) != 0) {
                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                    i14 &= -29360129;
                } else {
                    jC = j12;
                }
                if ((i13 & 256) != 0) {
                    m0VarA = a0.f95716a.a(lVarV, 6);
                    i14 &= -234881025;
                } else {
                    m0VarA = m0Var;
                }
                j13 = jC;
            } else {
                if (i28 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar2 = dVar;
                }
                if (i29 != 0) {
                    pVarA = k.f95948a.a();
                } else {
                    pVarA = pVar5;
                }
                if (i15 != 0) {
                    pVarB = k.f95948a.b();
                } else {
                    pVarB = pVar6;
                }
                if (i17 != 0) {
                    pVarC = k.f95948a.c();
                } else {
                    pVarC = pVar7;
                }
                if (i19 != 0) {
                    pVarD = k.f95948a.d();
                } else {
                    pVarD = pVar8;
                }
                if (i22 != 0) {
                    iA = o.INSTANCE.a();
                } else {
                    iA = i11;
                }
                if ((i13 & 64) != 0) {
                    i14 &= -3670017;
                    background = t.f96158a.a(lVarV, 6).getBackground();
                } else {
                    background = j11;
                }
                if ((i13 & 128) != 0) {
                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                    i14 &= -29360129;
                } else {
                    jC = j12;
                }
                if ((i13 & 256) != 0) {
                    m0VarA = a0.f95716a.a(lVarV, 6);
                    i14 &= -234881025;
                } else {
                    m0VarA = m0Var;
                }
                j13 = jC;
            }
            lVarV.C();
            if (o.J()) {
                o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
            }
            int i31111111111113 = (234881024 & i14) ^ r19;
            if (i31111111111113 <= 67108864) {
            }
            objI = lVarV.I();
            if (z11) {
                objI = new p2.e(m0VarA);
                lVarV.B(objI);
            } else {
                objI = new p2.e(m0VarA);
                lVarV.B(objI);
            }
            eVar = (p2.e) objI;
            long j11111117 = background;
            zN = ((i31111111111113 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
            objI2 = lVarV.I();
            if (zN) {
                objI2 = new a(eVar, m0VarA);
                lVarV.B(objI2);
            } else {
                objI2 = new a(eVar, m0VarA);
                lVarV.B(objI2);
            }
            int i31111111111114 = i14 >> 12;
            lVar2 = lVarV;
            m0.a(p0.b(dVar2, (l) objI2), null, j11111117, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31111111111114 & 896) | 12582912 | (i31111111111114 & 7168), 114);
            if (o.J()) {
                o.R();
            }
            dVar3 = dVar2;
            pVar9 = pVarA;
            pVar10 = pVarB;
            pVar11 = pVarC;
            pVar12 = pVarD;
            i25 = iA;
            j14 = j11111117;
            j15 = j13;
        } else {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i28 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar2 = dVar;
                }
                if (i29 != 0) {
                    pVarA = k.f95948a.a();
                } else {
                    pVarA = pVar5;
                }
                if (i15 != 0) {
                    pVarB = k.f95948a.b();
                } else {
                    pVarB = pVar6;
                }
                if (i17 != 0) {
                    pVarC = k.f95948a.c();
                } else {
                    pVarC = pVar7;
                }
                if (i19 != 0) {
                    pVarD = k.f95948a.d();
                } else {
                    pVarD = pVar8;
                }
                if (i22 != 0) {
                    iA = o.INSTANCE.a();
                } else {
                    iA = i11;
                }
                if ((i13 & 64) != 0) {
                    i14 &= -3670017;
                    background = t.f96158a.a(lVarV, 6).getBackground();
                } else {
                    background = j11;
                }
                if ((i13 & 128) != 0) {
                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                    i14 &= -29360129;
                } else {
                    jC = j12;
                }
                if ((i13 & 256) != 0) {
                    m0VarA = a0.f95716a.a(lVarV, 6);
                    i14 &= -234881025;
                } else {
                    m0VarA = m0Var;
                }
                j13 = jC;
            } else {
                if (i28 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar2 = dVar;
                }
                if (i29 != 0) {
                    pVarA = k.f95948a.a();
                } else {
                    pVarA = pVar5;
                }
                if (i15 != 0) {
                    pVarB = k.f95948a.b();
                } else {
                    pVarB = pVar6;
                }
                if (i17 != 0) {
                    pVarC = k.f95948a.c();
                } else {
                    pVarC = pVar7;
                }
                if (i19 != 0) {
                    pVarD = k.f95948a.d();
                } else {
                    pVarD = pVar8;
                }
                if (i22 != 0) {
                    iA = o.INSTANCE.a();
                } else {
                    iA = i11;
                }
                if ((i13 & 64) != 0) {
                    i14 &= -3670017;
                    background = t.f96158a.a(lVarV, 6).getBackground();
                } else {
                    background = j11;
                }
                if ((i13 & 128) != 0) {
                    jC = j.c(background, lVarV, (i14 >> 18) & 14);
                    i14 &= -29360129;
                } else {
                    jC = j12;
                }
                if ((i13 & 256) != 0) {
                    m0VarA = a0.f95716a.a(lVarV, 6);
                    i14 &= -234881025;
                } else {
                    m0VarA = m0Var;
                }
                j13 = jC;
            }
            lVarV.C();
            if (o.J()) {
                o.S(-1219521777, i14, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
            }
            int i31111111111115 = (234881024 & i14) ^ r19;
            if (i31111111111115 <= 67108864) {
            }
            objI = lVarV.I();
            if (z11) {
                objI = new p2.e(m0VarA);
                lVarV.B(objI);
            } else {
                objI = new p2.e(m0VarA);
                lVarV.B(objI);
            }
            eVar = (p2.e) objI;
            long j11111118 = background;
            zN = ((i31111111111115 <= 67108864 && lVarV.n(m0VarA)) || (i14 & 100663296) == 67108864) | lVarV.n(eVar);
            objI2 = lVarV.I();
            if (zN) {
                objI2 = new a(eVar, m0VarA);
                lVarV.B(objI2);
            } else {
                objI2 = new a(eVar, m0VarA);
                lVarV.B(objI2);
            }
            int i31111111111116 = i14 >> 12;
            lVar2 = lVarV;
            m0.a(p0.b(dVar2, (l) objI2), null, j11111118, j13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, z2.c.e(-1979205334, true, new b(iA, pVarA, qVar, pVarC, pVarD, eVar, pVarB), lVarV, 54), lVar2, (i31111111111116 & 896) | 12582912 | (i31111111111116 & 7168), 114);
            if (o.J()) {
                o.R();
            }
            dVar3 = dVar2;
            pVar9 = pVarA;
            pVar10 = pVarB;
            pVar11 = pVarC;
            pVar12 = pVarD;
            i25 = iA;
            j14 = j11111118;
            j15 = j13;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new c(dVar3, pVar9, pVar10, pVar11, pVar12, i25, j14, j15, m0VarA, qVar, i12, i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(int i11, p<? super p020r2.l, ? super Integer, h0> pVar, q<? super y, ? super p020r2.l, ? super Integer, h0> qVar, p<? super p020r2.l, ? super Integer, h0> pVar2, p<? super p020r2.l, ? super Integer, h0> pVar3, m0 m0Var, p<? super p020r2.l, ? super Integer, h0> pVar4, p020r2.l lVar, int i12) {
        int i13;
        q<? super y, ? super p020r2.l, ? super Integer, h0> qVar2;
        p<? super p020r2.l, ? super Integer, h0> pVar5;
        m0 m0Var2;
        p020r2.l lVarV = lVar.v(-975511942);
        if ((i12 & 6) == 0) {
            i13 = (lVarV.r(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= lVarV.K(pVar) ? 32 : 16;
        }
        if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
            qVar2 = qVar;
            i13 |= lVarV.K(qVar2) ? 256 : 128;
        } else {
            qVar2 = qVar;
        }
        if ((i12 & 3072) == 0) {
            i13 |= lVarV.K(pVar2) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            pVar5 = pVar3;
            i13 |= lVarV.K(pVar5) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            pVar5 = pVar3;
        }
        if ((196608 & i12) == 0) {
            m0Var2 = m0Var;
            i13 |= lVarV.n(m0Var2) ? 131072 : 65536;
        } else {
            m0Var2 = m0Var;
        }
        if ((i12 & 1572864) == 0) {
            i13 |= lVarV.K(pVar4) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i13 & 599187) == 599186 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-975511942, i13, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)");
            }
            boolean z11 = ((i13 & 112) == 32) | ((i13 & 7168) == 2048) | ((458752 & i13) == 131072) | ((57344 & i13) == 16384) | ((i13 & 14) == 4) | ((3670016 & i13) == 1048576) | ((i13 & 896) == 256);
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                d dVar = new d(pVar, pVar2, pVar5, i11, m0Var2, pVar4, qVar2);
                lVarV.B(dVar);
                objI = dVar;
            }
            g1.a(null, (p) objI, lVarV, 0, 1);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new e(i11, pVar, qVar, pVar2, pVar3, m0Var, pVar4, i12));
        }
    }
}
