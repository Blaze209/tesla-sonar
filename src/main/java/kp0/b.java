package kp0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J9\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0018\u00010\u00052\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0018\u00010\u00052\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lkp0/b;", "Lkp0/a;", "", "first", "second", "", "e", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/util/List;", "c", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface b extends kp0.a {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static List<Comparable<?>> a(b bVar, Comparable<?> comparable, Comparable<?> comparable2) {
            boolean z11 = comparable instanceof Number;
            if (z11 && (comparable2 instanceof Number)) {
                return v.p(Double.valueOf(((Number) comparable).doubleValue()), Double.valueOf(((Number) comparable2).doubleValue()));
            }
            if ((comparable instanceof String) && (comparable2 instanceof Number)) {
                return v.p(t.u((String) comparable), Double.valueOf(((Number) comparable2).doubleValue()));
            }
            if (z11 && (comparable2 instanceof String)) {
                return v.p(Double.valueOf(((Number) comparable).doubleValue()), t.u((String) comparable2));
            }
            return ((comparable instanceof Boolean) || (comparable2 instanceof Boolean)) ? v.p(bVar.b(comparable), bVar.b(comparable2)) : bVar.c(comparable, comparable2);
        }

        public static List<Comparable<?>> b(b bVar, Comparable<?> comparable, Comparable<?> comparable2) {
            if (comparable != 0 && comparable2 != 0 && comparable.getClass() == comparable2.getClass()) {
                return v.p(comparable, comparable2);
            }
            if (comparable == 0 && comparable2 == 0) {
                return v.p((Void) comparable, (Void) comparable2);
            }
            return null;
        }

        public static Boolean c(b bVar, Object obj) {
            return kp0.a.C1877a.a(bVar, obj);
        }
    }

    List<Comparable<?>> c(Comparable<?> first, Comparable<?> second);

    List<Comparable<?>> e(Comparable<?> first, Comparable<?> second);
}
