package lo0;

import java.util.ArrayList;
import lo0.b;
import no0.AlternativesParsing;
import no0.ConstantFormatStructure;
import no0.Optional;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0014\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u00020\u0003J\u000f\u0010\u0004\u001a\u00028\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005JO\u0010\u000b\u001a\u00020\b2*\u0010\t\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Llo0/b;", "Target", "ActualSelf", "Llo0/o;", "n", "()Llo0/b;", "", "Lkotlin/Function1;", "Ljn0/h0;", "otherFormats", "mainFormat", "j", "([Lwn0/l;Lwn0/l;)V", "", "onZero", "format", "k", "(Ljava/lang/String;Lwn0/l;)V", "Lno0/d;", "g", "()Lno0/d;", "actualBuilder", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b<Target, ActualSelf extends b<Target, ActualSelf>> extends o {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static <Target, ActualSelf extends b<Target, ActualSelf>> void a(b<Target, ActualSelf> bVar, wn0.l<? super ActualSelf, jn0.h0>[] otherFormats, wn0.l<? super ActualSelf, jn0.h0> mainFormat) {
            p013kotlin.jvm.internal.s.k(otherFormats, "otherFormats");
            p013kotlin.jvm.internal.s.k(mainFormat, "mainFormat");
            ArrayList arrayList = new ArrayList(otherFormats.length);
            for (wn0.l<? super ActualSelf, jn0.h0> lVar : otherFormats) {
                b bVarN = bVar.n();
                lVar.invoke(bVarN);
                arrayList.add(bVarN.g().b());
            }
            b bVarN2 = bVar.n();
            mainFormat.invoke(bVarN2);
            bVar.g().a(new AlternativesParsing(bVarN2.g().b(), arrayList));
        }

        public static <Target, ActualSelf extends b<Target, ActualSelf>> void b(b<Target, ActualSelf> bVar, String onZero, wn0.l<? super ActualSelf, jn0.h0> format) {
            p013kotlin.jvm.internal.s.k(onZero, "onZero");
            p013kotlin.jvm.internal.s.k(format, "format");
            no0.d<Target> dVarG = bVar.g();
            b bVarN = bVar.n();
            format.invoke(bVarN);
            jn0.h0 h0Var = jn0.h0.f84049a;
            dVarG.a(new Optional(onZero, bVarN.g().b()));
        }

        public static <Target, ActualSelf extends b<Target, ActualSelf>> no0.f<Target> c(b<Target, ActualSelf> bVar) {
            return new no0.f<>(bVar.g().b().c());
        }

        public static <Target, ActualSelf extends b<Target, ActualSelf>> void d(b<Target, ActualSelf> bVar, String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            bVar.g().a(new ConstantFormatStructure(value));
        }
    }

    no0.d<Target> g();

    void j(wn0.l<? super ActualSelf, jn0.h0>[] otherFormats, wn0.l<? super ActualSelf, jn0.h0> mainFormat);

    void k(String onZero, wn0.l<? super ActualSelf, jn0.h0> format);

    ActualSelf n();
}
