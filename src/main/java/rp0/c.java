package rp0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrp0/c;", "Lqp0/b;", "", "wrappedValue", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface c extends qp0.b {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static boolean a(c cVar, Object obj, p<? super Integer, ? super Integer, Boolean> operator) {
            s.k(operator, "operator");
            List<Object> listC = yr0.a.c(obj);
            if (listC.size() == 1) {
                return false;
            }
            List<Object> list = listC;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(cVar.a(it.next()));
            }
            return cVar.g(arrayList, operator);
        }

        public static boolean b(c cVar, List<? extends Object> list, p<? super Integer, ? super Integer, Boolean> operator) {
            s.k(operator, "operator");
            return qp0.b.a.b(cVar, list, operator);
        }

        public static List<Comparable<?>> c(c cVar, Comparable<?> comparable, Comparable<?> comparable2) {
            return cVar.c(comparable, comparable2);
        }

        public static List<Comparable<?>> d(c cVar, Comparable<?> comparable, Comparable<?> comparable2) {
            return qp0.b.a.d(cVar, comparable, comparable2);
        }

        public static Object e(c cVar, Object obj) {
            return qp0.b.a.e(cVar, obj);
        }

        public static Object f(c cVar, Object obj) {
            Number number = obj instanceof Number ? (Number) obj : null;
            return number != null ? Double.valueOf(number.doubleValue()) : obj;
        }

        public static Boolean g(c cVar, Object obj) {
            return qp0.b.a.g(cVar, obj);
        }
    }

    Object a(Object wrappedValue);
}
