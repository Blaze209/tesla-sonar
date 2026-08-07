package qp0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lqp0/b;", "Lkp0/c;", "Lsp0/a;", "Lsp0/c;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface b extends kp0.c, sp0.a, sp0.c {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static boolean a(b bVar, Object obj, p<? super Integer, ? super Integer, Boolean> operator) {
            s.k(operator, "operator");
            List<Object> listC = yr0.a.c(obj);
            Object objD = bVar.d(v.q0(listC));
            Object objD2 = bVar.d(yr0.c.b(listC));
            c cVar = c.f105828a;
            List<Object> listA = cVar.a(objD);
            List<Object> listA2 = cVar.a(objD2);
            if (listA != null || listA2 != null) {
                if (listA != null ? listA.contains(objD2) : false) {
                    return true;
                }
                return listA2 != null ? listA2.contains(objD) : false;
            }
            List<Object> list = listC;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(bVar.a(it.next()));
            }
            return bVar.g(arrayList, operator);
        }

        public static boolean b(b bVar, List<? extends Object> list, p<? super Integer, ? super Integer, Boolean> operator) {
            s.k(operator, "operator");
            return kp0.c.a.b(bVar, list, operator);
        }

        public static List<Comparable<?>> c(b bVar, Comparable<?> comparable, Comparable<?> comparable2) {
            return kp0.c.a.d(bVar, comparable, comparable2);
        }

        public static List<Comparable<?>> d(b bVar, Comparable<?> comparable, Comparable<?> comparable2) {
            return kp0.c.a.e(bVar, comparable, comparable2);
        }

        public static Object e(b bVar, Object obj) {
            return sp0.c.a.c(bVar, obj);
        }

        public static Object f(b bVar, Object obj) {
            return sp0.a.C2383a.c(bVar, obj);
        }

        public static Boolean g(b bVar, Object obj) {
            return kp0.c.a.f(bVar, obj);
        }
    }
}
