package po0;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p013kotlin.Metadata;
import p013kotlin.collections.g0;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a+\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "", "Lpo0/p;", "b", "(Ljava/util/List;)Lpo0/p;", "Lpo0/i;", "errors", "", "e", "(Ljava/util/List;)Ljava/lang/String;", "kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpo0/i;", "it", "", "a", "(Lpo0/i;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<i, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f103505c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(i it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return "position " + it.getPosition() + ": '" + it.a().invoke() + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }

    public static final <T> p<T> b(List<? extends p<? super T>> list) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        p pVar = new p(v.m(), v.m());
        if (!list.isEmpty()) {
            ListIterator<? extends p<? super T>> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                pVar = c(listIterator.previous(), pVar);
            }
        }
        return d(pVar, v.m());
    }

    private static final <T> p<T> c(p<? super T> pVar, p<? super T> pVar2) {
        if (pVar.a().isEmpty()) {
            return new p<>(v.P0(pVar.b(), pVar2.b()), pVar2.a());
        }
        List<n<? super T>> listB = pVar.b();
        List<p<? super T>> listA = pVar.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(c((p) it.next(), pVar2));
        }
        return new p<>(listB, arrayList);
    }

    private static final <T> p<T> d(p<? super T> pVar, List<t<T>> list) {
        List listE;
        ArrayList arrayList = new ArrayList();
        List listP1 = v.p1(list);
        List listP2 = null;
        for (n<? super T> nVar : pVar.b()) {
            if (nVar instanceof h) {
                if (listP2 != null) {
                    listP2.addAll(((h) nVar).c());
                } else {
                    listP2 = v.p1(((h) nVar).c());
                }
            } else if (nVar instanceof t) {
                listP1.add(nVar);
            } else {
                if (listP2 != null) {
                    arrayList.add(new h(listP2));
                    listP2 = null;
                }
                arrayList.add(nVar);
            }
        }
        List<p<? super T>> listA = pVar.a();
        List arrayList2 = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            p pVarD = d((p) it.next(), listP1);
            if (pVarD.b().isEmpty()) {
                List listA2 = pVarD.a();
                if (listA2.isEmpty()) {
                    listA2 = v.e(pVarD);
                }
                listE = listA2;
            } else {
                listE = v.e(pVarD);
            }
            v.E(arrayList2, listE);
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = v.e(new p(listP1, v.m()));
        }
        List list2 = arrayList2;
        if (listP2 == null) {
            return new p<>(arrayList, list2);
        }
        List<p> list3 = list2;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                n nVar2 = (n) v.q0(((p) it2.next()).b());
                if (nVar2 != null && (nVar2 instanceof h)) {
                    ArrayList arrayList3 = new ArrayList(v.y(list3, 10));
                    for (p pVar2 : list3) {
                        n nVar3 = (n) v.q0(pVar2.b());
                        arrayList3.add(nVar3 instanceof h ? new p(v.P0(v.e(new h(v.P0(listP2, ((h) nVar3).c()))), v.i0(pVar2.b(), 1)), pVar2.a()) : nVar3 == null ? new p(v.e(new h(listP2)), pVar2.a()) : new p(v.P0(v.e(new h(listP2)), pVar2.b()), pVar2.a()));
                    }
                    return new p<>(arrayList, arrayList3);
                }
            }
        }
        arrayList.add(new h(listP2));
        return new p<>(arrayList, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(List<i> list) {
        if (list.size() != 1) {
            String string = ((StringBuilder) g0.v0(list, new StringBuilder(list.size() * 33), (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "Errors: ", (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : a.f103505c)).toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            return string;
        }
        return "Position " + list.get(0).getPosition() + ": " + list.get(0).a().invoke();
    }
}
