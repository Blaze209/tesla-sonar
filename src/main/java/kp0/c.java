package kp0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u00020\u00072\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ=\u0010\f\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000b0\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\f\u0010\nJ-\u0010\u000f\u001a\u0004\u0018\u00010\u00062\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkp0/c;", "Lkp0/b;", "", "", "values", "Lkotlin/Function2;", "", "", "operator", "g", "(Ljava/util/List;Lwn0/p;)Z", "", "compare", "first", "second", "compareOrNull", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface c extends b {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private static boolean a(c cVar, List<? extends Comparable<?>> list, p<? super Integer, ? super Integer, Boolean> pVar) {
            Integer numC = c(cVar, (Comparable) v.q0(list), (Comparable) yr0.c.b(list));
            if (numC != null) {
                return pVar.invoke(Integer.valueOf(numC.intValue()), 0).booleanValue();
            }
            return false;
        }

        public static boolean b(c cVar, List<? extends Object> list, p<? super Integer, ? super Integer, Boolean> operator) {
            List<Comparable<?>> listD;
            s.k(operator, "operator");
            if (list == null || (listD = yr0.a.d(list)) == null) {
                return false;
            }
            return a(cVar, listD, operator);
        }

        private static Integer c(c cVar, Comparable<?> comparable, Comparable<?> comparable2) {
            List<Comparable<?>> listE = cVar.e(comparable, comparable2);
            if (listE == null) {
                return null;
            }
            List<Comparable<?>> list = listE;
            boolean z11 = list instanceof Collection;
            if (!z11 || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((Comparable) it.next()) != null) {
                        if (!z11 || !list.isEmpty()) {
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (((Comparable) it2.next()) == null) {
                                    return null;
                                }
                            }
                        }
                        return Integer.valueOf(mn0.a.d((Comparable) v.q0(listE), (Comparable) yr0.c.b(listE)));
                    }
                }
            }
            return Integer.valueOf(mn0.a.d((Comparable) v.q0(listE), (Comparable) yr0.c.b(listE)));
        }

        public static List<Comparable<?>> d(c cVar, Comparable<?> comparable, Comparable<?> comparable2) {
            return b.a.a(cVar, comparable, comparable2);
        }

        public static List<Comparable<?>> e(c cVar, Comparable<?> comparable, Comparable<?> comparable2) {
            return b.a.b(cVar, comparable, comparable2);
        }

        public static Boolean f(c cVar, Object obj) {
            return b.a.c(cVar, obj);
        }
    }

    boolean g(List<? extends Object> values, p<? super Integer, ? super Integer, Boolean> operator);
}
