package ou;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    private static final class b<T> implements q<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<? extends q<? super T>> f100016a;

        @Override // ou.q
        public boolean apply(T t11) {
            for (int i11 = 0; i11 < this.f100016a.size(); i11++) {
                if (!this.f100016a.get(i11).apply(t11)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f100016a.equals(((b) obj).f100016a);
            }
            return false;
        }

        public int hashCode() {
            return this.f100016a.hashCode() + 306654252;
        }

        public String toString() {
            return r.d("and", this.f100016a);
        }

        private b(List<? extends q<? super T>> list) {
            this.f100016a = list;
        }
    }

    public static <T> q<T> b(q<? super T> qVar, q<? super T> qVar2) {
        return new b(c((q) p.m(qVar), (q) p.m(qVar2)));
    }

    private static <T> List<q<? super T>> c(q<? super T> qVar, q<? super T> qVar2) {
        return Arrays.asList(qVar, qVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        boolean z11 = true;
        for (Object obj : iterable) {
            if (!z11) {
                sb2.append(CoreConstants.COMMA_CHAR);
            }
            sb2.append(obj);
            z11 = false;
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }
}
