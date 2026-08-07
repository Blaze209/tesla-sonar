package lo0;

import no0.BasicFormatStructure;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llo0/f;", "Llo0/o$c;", "Lno0/o;", "Llo0/k0;", "structure", "Ljn0/h0;", "v", "(Lno0/o;)V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface f extends o.c {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static void a(f fVar, h0 padding) {
            p013kotlin.jvm.internal.s.k(padding, "padding");
            fVar.v(new BasicFormatStructure(new u(padding)));
        }

        public static void b(f fVar, h0 padding) {
            p013kotlin.jvm.internal.s.k(padding, "padding");
            fVar.v(new BasicFormatStructure(new c0(padding)));
        }

        public static void c(f fVar, h0 padding) {
            p013kotlin.jvm.internal.s.k(padding, "padding");
            fVar.v(new BasicFormatStructure(new i0(padding)));
        }

        public static void d(f fVar, int i11, int i12) {
            fVar.v(new BasicFormatStructure(new t(i11, i12, null, 4, null)));
        }
    }

    void v(no0.o<? super k0> structure);
}
