package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.i;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.jvm.internal.u;
import w4.b;
import w4.c;
import w4.n;
import w4.o;
import wn0.l;
import z3.i0;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0010\u001a\u00020\u000f*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lb2/h1;", "Lz3/i0;", "Lkotlin/Function0;", "", "shouldMeasureLinks", "", "Lj3/i;", "placements", "<init>", "(Lwn0/a;Lwn0/a;)V", "Lz3/k0;", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;", "a", "Lwn0/a;", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class h1 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Boolean> shouldMeasureLinks;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<List<i>> placements;

    @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<p013kotlin.Pair<w0, n>> f15595c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<p013kotlin.Pair<w0, wn0.a<n>>> f15596d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends p013kotlin.Pair<? extends w0, n>> list, List<? extends p013kotlin.Pair<? extends w0, ? extends wn0.a<n>>> list2) {
            super(1);
            this.f15595c = list;
            this.f15596d = list2;
        }

        public final void a(w0.a aVar) {
            List<p013kotlin.Pair<w0, n>> list = this.f15595c;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    p013kotlin.Pair<w0, n> pair = list.get(i11);
                    w0.a.j(aVar, pair.a(), pair.b().getPackedValue(), BitmapDescriptorFactory.HUE_RED, 2, null);
                }
            }
            List<p013kotlin.Pair<w0, wn0.a<n>>> list2 = this.f15596d;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    p013kotlin.Pair<w0, wn0.a<n>> pair2 = list2.get(i12);
                    w0 w0VarA = pair2.a();
                    wn0.a<n> aVarB = pair2.b();
                    w0.a.j(aVar, w0VarA, aVarB != null ? aVarB.invoke().getPackedValue() : n.INSTANCE.a(), BitmapDescriptorFactory.HUE_RED, 2, null);
                }
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h1(wn0.a<Boolean> aVar, wn0.a<? extends List<i>> aVar2) {
        this.shouldMeasureLinks = aVar;
        this.placements = aVar2;
    }

    @Override // z3.i0
    public j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            z3.h0 h0Var = list.get(i11);
            if (!(h0Var.getParentData() instanceof l1)) {
                arrayList.add(h0Var);
            }
        }
        List<i> listInvoke = this.placements.invoke();
        ArrayList arrayList2 = null;
        if (listInvoke != null) {
            ArrayList arrayList3 = new ArrayList(listInvoke.size());
            int size2 = listInvoke.size();
            for (int i12 = 0; i12 < size2; i12++) {
                i iVar = listInvoke.get(i12);
                p013kotlin.Pair pair = iVar != null ? new p013kotlin.Pair(((z3.h0) arrayList.get(i12)).x0(c.b(0, (int) Math.floor(iVar.o()), 0, (int) Math.floor(iVar.h()), 5, null)), n.b(o.a(Math.round(iVar.getLeft()), Math.round(iVar.getTop())))) : null;
                if (pair != null) {
                    arrayList3.add(pair);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i13 = 0; i13 < size3; i13++) {
            z3.h0 h0Var2 = list.get(i13);
            if (h0Var2.getParentData() instanceof l1) {
                arrayList4.add(h0Var2);
            }
        }
        return k0.N1(k0Var, b.l(j11), b.k(j11), null, new a(arrayList2, d.i(arrayList4, this.shouldMeasureLinks)), 4, null);
    }
}
