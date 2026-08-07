package kotlin;

import androidx.compose.ui.c;
import b4.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.Placeholder;
import i4.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.x;
import wn0.p;
import wn0.q;
import z3.i0;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u001aa\u0010\r\u001a:\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007j\u0002`\f0\u00060\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00002\"\u0010\u0013\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007j\u0002`\f0\u0006H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"L\u0010\u0017\u001a:\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007j\u0002`\f0\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016*0\b\u0000\u0010\u0018\"\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u00072\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\u0007*\u0018\b\u0000\u0010\u0019\"\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u001a"}, d2 = {"Li4/d;", "", "", "Lb2/q;", "inlineContent", "Lkotlin/Pair;", "", "Li4/d$c;", "Li4/w;", "Landroidx/compose/foundation/text/PlaceholderRange;", "Lkotlin/Function1;", "Ljn0/h0;", "Landroidx/compose/foundation/text/InlineContentRange;", "c", "(Li4/d;Ljava/util/Map;)Lkotlin/Pair;", "", "b", "(Li4/d;)Z", "text", "inlineContents", "a", "(Li4/d;Ljava/util/List;Lr2/l;I)V", "Lkotlin/Pair;", "EmptyInlineContent", "InlineContentRange", "PlaceholderRange", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p013kotlin.Pair<List<d.Range<Placeholder>>, List<d.Range<q<String, l, Integer, h0>>>> f15334a = new p013kotlin.Pair<>(v.m(), v.m());

    @p013kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz3/k0;", "", "Lz3/h0;", "children", "Lw4/b;", "constrains", "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class a implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15335a = new a();

        /* JADX INFO: renamed from: b2.b$a$a, reason: collision with other inner class name */
        @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class C0279a extends u implements wn0.l<w0.a, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<w0> f15336c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0279a(List<? extends w0> list) {
                super(1);
                this.f15336c = list;
            }

            public final void a(w0.a aVar) {
                List<w0> list = this.f15336c;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    w0.a.l(aVar, list.get(i11), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
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
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(list.get(i11).x0(j11));
            }
            return k0.N1(k0Var, w4.b.l(j11), w4.b.k(j11), null, new C0279a(arrayList), 4, null);
        }
    }

    /* JADX INFO: renamed from: b2.b$b, reason: collision with other inner class name */
    @p013kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C0280b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f15337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<d.Range<q<String, l, Integer, h0>>> f15338d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f15339e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0280b(d dVar, List<d.Range<q<String, l, Integer, h0>>> list, int i11) {
            super(2);
            this.f15337c = dVar;
            this.f15338d = list;
            this.f15339e = i11;
        }

        public final void a(l lVar, int i11) {
            b.a(this.f15337c, this.f15338d, lVar, k2.a(this.f15339e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(d dVar, List<d.Range<q<String, l, Integer, h0>>> list, l lVar, int i11) {
        int i12;
        l lVarV = lVar.v(-1794596951);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(list) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-1794596951, i12, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:73)");
            }
            int size = list.size();
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                d.Range<q<String, l, Integer, h0>> range = list.get(i14);
                q<String, l, Integer, h0> qVarA = range.a();
                int start = range.getStart();
                int end = range.getEnd();
                a aVar = a.f15335a;
                androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
                int iA = j.a(lVarV, i13);
                x xVarC = lVarV.c();
                androidx.compose.ui.d dVarE = c.e(lVarV, companion);
                g.Companion companion2 = g.INSTANCE;
                wn0.a<g> aVarA = companion2.a();
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                l lVarA = d4.a(lVarV);
                int i15 = i13;
                d4.b(lVarA, aVar, companion2.c());
                d4.b(lVarA, xVarC, companion2.e());
                p<g, Integer, h0> pVarB = companion2.b();
                if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE, companion2.d());
                qVarA.invoke(dVar.subSequence(start, end).getText(), lVarV, Integer.valueOf(i15));
                lVarV.g();
                i14++;
                i13 = i15;
            }
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new C0280b(dVar, list, i11));
        }
    }

    public static final boolean b(d dVar) {
        return dVar.p("androidx.compose.foundation.text.inlineContent", 0, dVar.getText().length());
    }

    public static final p013kotlin.Pair<List<d.Range<Placeholder>>, List<d.Range<q<String, l, Integer, h0>>>> c(d dVar, Map<String, q> map) {
        if (map == null || map.isEmpty()) {
            return f15334a;
        }
        List<d.Range<String>> listJ = dVar.j("androidx.compose.foundation.text.inlineContent", 0, dVar.getText().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = listJ.size();
        for (int i11 = 0; i11 < size; i11++) {
            d.Range<String> range = listJ.get(i11);
            q qVar = map.get(range.e());
            if (qVar != null) {
                arrayList.add(new d.Range(qVar.getPlaceholder(), range.f(), range.d()));
                arrayList2.add(new d.Range(qVar.a(), range.f(), range.d()));
            }
        }
        return new p013kotlin.Pair<>(arrayList, arrayList2);
    }
}
