package zb;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lzb/h;", "Ljp0/b;", "<init>", "()V", "", "Lzb/i;", "c", "(Ljava/lang/String;)Lzb/i;", "", "", "sortingMode", "b", "(Ljava/util/List;Lzb/i;)Ljava/lang/Object;", "Lkotlin/Function0;", "ascSort", "descSort", "a", "(Lzb/i;Lwn0/a;Lwn0/a;)Ljava/lang/Object;", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h implements jp0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f128040a = new h();

    private h() {
    }

    private final Object a(i sortingMode, wn0.a<? extends Object> ascSort, wn0.a<? extends Object> descSort) {
        if (s.f(sortingMode, i.b.f128042a)) {
            return descSort.invoke();
        }
        if (s.f(sortingMode, i.a.f128041a)) {
            return ascSort.invoke();
        }
        if (s.f(sortingMode, i.c.f128043a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object b(List<? extends Object> list, i iVar) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
            numValueOf = Integer.valueOf(arrayList.size());
        } else {
            numValueOf = null;
        }
        if (s.f(numValueOf, list != null ? Integer.valueOf(list.size()) : null)) {
            if (!(list instanceof List)) {
                list = null;
            }
            if (list != null) {
                return a(iVar, new f(list), new g(list));
            }
            return null;
        }
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof Boolean) {
                    arrayList2.add(obj2);
                }
            }
            numValueOf2 = Integer.valueOf(arrayList2.size());
        } else {
            numValueOf2 = null;
        }
        if (s.f(numValueOf2, list != null ? Integer.valueOf(list.size()) : null)) {
            if (!(list instanceof List)) {
                list = null;
            }
            if (list != null) {
                return a(iVar, new f(list), new g(list));
            }
            return null;
        }
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof Number) {
                    arrayList3.add(obj3);
                }
            }
            numValueOf3 = Integer.valueOf(arrayList3.size());
        } else {
            numValueOf3 = null;
        }
        if (!s.f(numValueOf3, list != null ? Integer.valueOf(list.size()) : null)) {
            return null;
        }
        List listL0 = v.l0(yr0.a.b(list));
        return a(iVar, new f(listL0), new g(listL0));
    }

    private final i c(String str) {
        if (s.f(str, "desc")) {
            return i.b.f128042a;
        }
        return s.f(str, "asc") ? i.a.f128041a : i.c.f128043a;
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        List<Object> listC = yr0.a.c(expression);
        Object objQ0 = v.q0(listC);
        List<? extends Object> list = objQ0 instanceof List ? (List) objQ0 : null;
        if (list == null) {
            return null;
        }
        h hVar = f128040a;
        Object objB = yr0.c.b(listC);
        return hVar.b(list, hVar.c(objB instanceof String ? (String) objB : null));
    }
}
