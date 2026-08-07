package lo0;

import no0.BasicFormatStructure;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llo0/c;", "Llo0/o$a;", "Lno0/o;", "Llo0/h;", "structure", "Ljn0/h0;", "e", "(Lno0/o;)V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface c extends o.a {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static void a(c cVar, n<ko0.d> format) {
            p013kotlin.jvm.internal.s.k(format, "format");
            if (format instanceof y) {
                cVar.e(((y) format).b());
            }
        }

        public static void b(c cVar, h0 padding) {
            p013kotlin.jvm.internal.s.k(padding, "padding");
            cVar.e(new BasicFormatStructure(new q(padding)));
        }

        public static void c(c cVar, s names) {
            p013kotlin.jvm.internal.s.k(names, "names");
            cVar.e(new BasicFormatStructure(new r(names)));
        }

        public static void d(c cVar, f0 names) {
            p013kotlin.jvm.internal.s.k(names, "names");
            cVar.e(new BasicFormatStructure(new e0(names)));
        }

        public static void e(c cVar, h0 padding) {
            p013kotlin.jvm.internal.s.k(padding, "padding");
            cVar.e(new BasicFormatStructure(new d0(padding)));
        }

        public static void f(c cVar, h0 padding) {
            p013kotlin.jvm.internal.s.k(padding, "padding");
            cVar.e(new BasicFormatStructure(new t0(padding, false, 2, null)));
        }
    }

    void e(no0.o<? super h> structure);
}
