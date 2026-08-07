package up0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J9\u0010\b\u001a\u00020\u0006*\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lup0/e;", "Lkp0/c;", "", "", "Lkotlin/Function2;", "", "", "operator", "between", "(Ljava/util/List;Lwn0/p;)Z", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface e extends kp0.c {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private static boolean a(e eVar, List<? extends Comparable<?>> list, p<? super Integer, ? super Integer, Boolean> pVar) {
            return eVar.g(v.p((Comparable) v.q0(list), (Comparable) yr0.c.b(list)), pVar) && eVar.g(v.p((Comparable) yr0.c.b(list), (Comparable) yr0.c.c(list)), pVar);
        }

        public static boolean b(e eVar, List<? extends Object> list, p<? super Integer, ? super Integer, Boolean> operator) {
            s.k(operator, "operator");
            return kp0.c.a.b(eVar, list, operator);
        }

        public static boolean c(e eVar, List<? extends Object> list, p<? super Integer, ? super Integer, Boolean> operator) {
            List<Comparable<?>> listD;
            s.k(operator, "operator");
            if (list != null && (listD = yr0.a.d(list)) != null) {
                if (listD.size() == 2) {
                    return eVar.g(listD, operator);
                }
                if (listD.size() > 2) {
                    return a(eVar, listD, operator);
                }
            }
            return false;
        }

        public static List<Comparable<?>> d(e eVar, Comparable<?> comparable, Comparable<?> comparable2) {
            return kp0.c.a.d(eVar, comparable, comparable2);
        }

        public static List<Comparable<?>> e(e eVar, Comparable<?> comparable, Comparable<?> comparable2) {
            return kp0.c.a.e(eVar, comparable, comparable2);
        }

        public static Boolean f(e eVar, Object obj) {
            return kp0.c.a.f(eVar, obj);
        }
    }
}
