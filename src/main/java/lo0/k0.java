package lo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0006R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\u0006R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0004\"\u0004\b\u0012\u0010\u0006R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010 \u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Llo0/k0;", "", "", "e", "()Ljava/lang/Integer;", "z", "(Ljava/lang/Integer;)V", "minute", DateTokenConverter.CONVERTER_KEY, "k", "second", "a", "o", "nanosecond", "c", "D", "hour", "g", "n", "hourOfAmPm", "Llo0/g;", "m", "()Llo0/g;", "t", "(Llo0/g;)V", "amPm", "Lmo0/a;", "value", "A", "()Lmo0/a;", "E", "(Lmo0/a;)V", "fractionOfSecond", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface k0 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static mo0.a a(k0 k0Var) {
            Integer numA = k0Var.a();
            if (numA != null) {
                return new mo0.a(numA.intValue(), 9);
            }
            return null;
        }

        public static void b(k0 k0Var, mo0.a aVar) {
            k0Var.o(aVar != null ? Integer.valueOf(aVar.b(9)) : null);
        }
    }

    mo0.a A();

    void D(Integer num);

    void E(mo0.a aVar);

    Integer a();

    Integer c();

    Integer d();

    Integer e();

    Integer g();

    void k(Integer num);

    g m();

    void n(Integer num);

    void o(Integer num);

    void t(g gVar);

    void z(Integer num);
}
