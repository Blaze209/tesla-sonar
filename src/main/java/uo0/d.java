package uo0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020 H&¢\u0006\u0004\b!\u0010\"J'\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020#H&¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b'\u0010(JA\u0010,\u001a\u00020\u0004\"\n\b\u0000\u0010)*\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b,\u0010-JA\u0010.\u001a\u00020\u0004\"\b\b\u0000\u0010)*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H'¢\u0006\u0004\b.\u0010-¨\u0006/"}, d2 = {"Luo0/d;", "", "Lto0/f;", "descriptor", "Ljn0/h0;", "c", "(Lto0/f;)V", "", "index", "", "G", "(Lto0/f;I)Z", "value", "A", "(Lto0/f;IZ)V", "", "u", "(Lto0/f;IB)V", "", Gender.FEMALE, "(Lto0/f;IS)V", "", "h", "(Lto0/f;IC)V", "x", "(Lto0/f;II)V", "", "z", "(Lto0/f;IJ)V", "", IntegerTokenConverter.CONVERTER_KEY, "(Lto0/f;IF)V", "", "k", "(Lto0/f;ID)V", "", "e", "(Lto0/f;ILjava/lang/String;)V", "Luo0/f;", "p", "(Lto0/f;I)Luo0/f;", "T", "Lro0/q;", "serializer", "D", "(Lto0/f;ILro0/q;Ljava/lang/Object;)V", "y", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface d {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public static boolean a(d dVar, to0.f descriptor, int i11) {
            s.k(descriptor, "descriptor");
            return true;
        }
    }

    void A(to0.f descriptor, int index, boolean value);

    <T> void D(to0.f descriptor, int index, q<? super T> serializer, T value);

    void F(to0.f descriptor, int index, short value);

    boolean G(to0.f descriptor, int index);

    void c(to0.f descriptor);

    void e(to0.f descriptor, int index, String value);

    void h(to0.f descriptor, int index, char value);

    void i(to0.f descriptor, int index, float value);

    void k(to0.f descriptor, int index, double value);

    f p(to0.f descriptor, int index);

    void u(to0.f descriptor, int index, byte value);

    void x(to0.f descriptor, int index, int value);

    <T> void y(to0.f descriptor, int index, q<? super T> serializer, T value);

    void z(to0.f descriptor, int index, long value);
}
