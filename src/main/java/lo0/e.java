package lo0;

import no0.BasicFormatStructure;
import no0.SignedFormatStructure;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llo0/e;", "Llo0/o$d;", "Lno0/o;", "Llo0/n0;", "structure", "Ljn0/h0;", "l", "(Lno0/o;)V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface e extends o.d {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static void a(e eVar, n<ko0.i> format) {
            p013kotlin.jvm.internal.s.k(format, "format");
            if (format instanceof o0) {
                eVar.l(((o0) format).b());
            }
        }

        public static void b(e eVar, h0 padding) {
            p013kotlin.jvm.internal.s.k(padding, "padding");
            eVar.l(new SignedFormatStructure(new BasicFormatStructure(new s0(padding)), true));
        }

        public static void c(e eVar, h0 padding) {
            p013kotlin.jvm.internal.s.k(padding, "padding");
            eVar.l(new BasicFormatStructure(new q0(padding)));
        }

        public static void d(e eVar, h0 padding) {
            p013kotlin.jvm.internal.s.k(padding, "padding");
            eVar.l(new BasicFormatStructure(new r0(padding)));
        }
    }

    void l(no0.o<? super n0> structure);
}
