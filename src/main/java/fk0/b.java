package fk0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;
import p013kotlin.text.t;
import wn0.p;
import yr0.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J7\u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfk0/b;", "", "", "formattedArgument", "Lkotlin/Function2;", "", "formatFloatingPoint", "formatAsFloatingDecimal", "(Ljava/lang/String;Ljava/lang/String;Lwn0/p;)Ljava/lang/String;", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface b {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private static String a(b bVar, String str, String str2, p<? super String, ? super Double, String> pVar) {
            Double dU;
            if (!new q("%[\\d|.]*[f]").i(str) || (dU = t.u(str2)) == null) {
                return null;
            }
            return pVar.invoke(str, Double.valueOf(dU.doubleValue()));
        }

        public static String b(b bVar, Object obj, Object obj2, p<? super String, ? super Double, String> formatFloatingPoint) {
            Object objB;
            s.k(formatFloatingPoint, "formatFloatingPoint");
            List<Object> listC = yr0.a.c(obj);
            String strValueOf = String.valueOf(v.q0(listC));
            String strValueOf2 = String.valueOf(c.b(listC));
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(a(bVar, strValueOf, strValueOf2, formatFloatingPoint));
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            if (jn0.s.e(objB) == null) {
                return (String) objB;
            }
            return null;
        }
    }
}
