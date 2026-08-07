package ka;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import p011ja.p;
import p011ja.u;
import p013kotlin.Metadata;
import p015o1.v;
import wn0.r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÕ\u0001\u0010\u0015\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u001e\b\u0002\u0010\f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b2\u001e\b\u0002\u0010\u000e\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\b2\u001e\b\u0002\u0010\u000f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b2\u001e\b\u0002\u0010\u0010\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\b2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aó\u0001\u0010\u0019\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u001e\b\u0002\u0010\f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b2\u001e\b\u0002\u0010\u000e\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\b2\u001e\b\u0002\u0010\u000f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b2\u001e\b\u0002\u0010\u0010\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\b2\u001e\b\u0002\u0010\u0018\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\b2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lja/u;", "", PlaceTypes.ROUTE, "", "Lja/e;", "arguments", "Lja/p;", "deepLinks", "Lkotlin/Function1;", "Landroidx/compose/animation/d;", "Lja/k;", "Landroidx/compose/animation/i;", "enterTransition", "Landroidx/compose/animation/k;", "exitTransition", "popEnterTransition", "popExitTransition", "Lkotlin/Function2;", "Lo1/b;", "Ljn0/h0;", "content", "b", "(Lja/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lwn0/l;Lwn0/l;Lwn0/l;Lwn0/l;Lwn0/r;)V", "Lo1/v;", "sizeTransform", "a", "(Lja/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lwn0/l;Lwn0/l;Lwn0/l;Lwn0/l;Lwn0/l;Lwn0/r;)V", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {
    public static final void a(u uVar, String str, List<p011ja.e> list, List<p> list2, wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.i> lVar, wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.k> lVar2, wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.i> lVar3, wn0.l<androidx.compose.animation.d<p011ja.k>, androidx.compose.animation.k> lVar4, wn0.l<androidx.compose.animation.d<p011ja.k>, v> lVar5, r<? super p015o1.b, ? super p011ja.k, ? super p020r2.l, ? super Integer, h0> rVar) {
        f fVar = new f((e) uVar.getProvider().d(e.class), str, rVar);
        for (p011ja.e eVar : list) {
            fVar.a(eVar.getName(), eVar.getArgument());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            fVar.c((p) it.next());
        }
        fVar.h(lVar);
        fVar.i(lVar2);
        fVar.j(lVar3);
        fVar.k(lVar4);
        fVar.l(lVar5);
        uVar.h(fVar);
    }

    @jn0.e
    public static final /* synthetic */ void b(u uVar, String str, List list, List list2, wn0.l lVar, wn0.l lVar2, wn0.l lVar3, wn0.l lVar4, r rVar) {
        f fVar = new f((e) uVar.getProvider().d(e.class), str, rVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p011ja.e eVar = (p011ja.e) it.next();
            fVar.a(eVar.getName(), eVar.getArgument());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            fVar.c((p) it2.next());
        }
        fVar.h(lVar);
        fVar.i(lVar2);
        fVar.j(lVar3);
        fVar.k(lVar4);
        uVar.h(fVar);
    }

    public static /* synthetic */ void c(u uVar, String str, List list, List list2, wn0.l lVar, wn0.l lVar2, wn0.l lVar3, wn0.l lVar4, wn0.l lVar5, r rVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = p013kotlin.collections.v.m();
        }
        List list3 = list;
        if ((i11 & 4) != 0) {
            list2 = p013kotlin.collections.v.m();
        }
        List list4 = list2;
        wn0.l lVar6 = (i11 & 8) != 0 ? null : lVar;
        wn0.l lVar7 = (i11 & 16) != 0 ? null : lVar2;
        a(uVar, str, list3, list4, lVar6, lVar7, (i11 & 32) != 0 ? lVar6 : lVar3, (i11 & 64) != 0 ? lVar7 : lVar4, (i11 & 128) != 0 ? null : lVar5, rVar);
    }

    public static /* synthetic */ void d(u uVar, String str, List list, List list2, wn0.l lVar, wn0.l lVar2, wn0.l lVar3, wn0.l lVar4, r rVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = p013kotlin.collections.v.m();
        }
        List list3 = list;
        if ((i11 & 4) != 0) {
            list2 = p013kotlin.collections.v.m();
        }
        List list4 = list2;
        wn0.l lVar5 = (i11 & 8) != 0 ? null : lVar;
        wn0.l lVar6 = (i11 & 16) != 0 ? null : lVar2;
        b(uVar, str, list3, list4, lVar5, lVar6, (i11 & 32) != 0 ? lVar5 : lVar3, (i11 & 64) != 0 ? lVar6 : lVar4, rVar);
    }
}
