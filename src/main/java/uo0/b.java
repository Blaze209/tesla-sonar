package uo0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import kotlinx.serialization.SerializationException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import ro0.q;
import vo0.y0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u00103J%\u00104\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b4\u00105J%\u00106\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0018¢\u0006\u0004\b6\u00107J%\u00108\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u001b¢\u0006\u0004\b8\u00109J%\u0010:\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b:\u0010;J%\u0010<\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020 ¢\u0006\u0004\b<\u0010=J%\u0010>\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020#¢\u0006\u0004\b>\u0010?J%\u0010@\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020&¢\u0006\u0004\b@\u0010AJ%\u0010B\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020)¢\u0006\u0004\bB\u0010CJ%\u0010D\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020,¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bF\u0010GJA\u0010K\u001a\u00020\t\"\n\b\u0000\u0010H*\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\bK\u0010LJA\u0010M\u001a\u00020\t\"\b\b\u0000\u0010H*\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I2\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bM\u0010L¨\u0006N"}, d2 = {"Luo0/b;", "Luo0/f;", "Luo0/d;", "<init>", "()V", "Lto0/f;", "descriptor", "b", "(Lto0/f;)Luo0/d;", "Ljn0/h0;", "c", "(Lto0/f;)V", "", "index", "", "H", "(Lto0/f;I)Z", "", "value", "J", "(Ljava/lang/Object;)V", "w", "l", "(Z)V", "", "f", "(B)V", "", "j", "(S)V", "o", "(I)V", "", "v", "(J)V", "", "m", "(F)V", "", "r", "(D)V", "", "B", "(C)V", "", "q", "(Ljava/lang/String;)V", "enumDescriptor", "g", "(Lto0/f;I)V", "E", "(Lto0/f;)Luo0/f;", "A", "(Lto0/f;IZ)V", "u", "(Lto0/f;IB)V", Gender.FEMALE, "(Lto0/f;IS)V", "x", "(Lto0/f;II)V", "z", "(Lto0/f;IJ)V", IntegerTokenConverter.CONVERTER_KEY, "(Lto0/f;IF)V", "k", "(Lto0/f;ID)V", "h", "(Lto0/f;IC)V", "e", "(Lto0/f;ILjava/lang/String;)V", "p", "(Lto0/f;I)Luo0/f;", "T", "Lro0/q;", "serializer", "D", "(Lto0/f;ILro0/q;Ljava/lang/Object;)V", "y", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b implements f, d {
    @Override // uo0.d
    public final void A(to0.f descriptor, int index, boolean value) {
        s.k(descriptor, "descriptor");
        if (H(descriptor, index)) {
            l(value);
        }
    }

    @Override // uo0.f
    public void B(char value) {
        J(Character.valueOf(value));
    }

    @Override // uo0.f
    public void C() {
        f.a.b(this);
    }

    @Override // uo0.d
    public <T> void D(to0.f descriptor, int index, q<? super T> serializer, T value) {
        s.k(descriptor, "descriptor");
        s.k(serializer, "serializer");
        if (H(descriptor, index)) {
            s(serializer, value);
        }
    }

    @Override // uo0.f
    public f E(to0.f descriptor) {
        s.k(descriptor, "descriptor");
        return this;
    }

    @Override // uo0.d
    public final void F(to0.f descriptor, int index, short value) {
        s.k(descriptor, "descriptor");
        if (H(descriptor, index)) {
            j(value);
        }
    }

    @Override // uo0.d
    public boolean G(to0.f fVar, int i11) {
        return d.a.a(this, fVar, i11);
    }

    public boolean H(to0.f descriptor, int index) {
        s.k(descriptor, "descriptor");
        return true;
    }

    public <T> void I(q<? super T> qVar, T t11) {
        f.a.c(this, qVar, t11);
    }

    public void J(Object value) {
        s.k(value, "value");
        throw new SerializationException("Non-serializable " + o0.b(value.getClass()) + " is not supported by " + o0.b(getClass()) + " encoder");
    }

    @Override // uo0.f
    public d b(to0.f descriptor) {
        s.k(descriptor, "descriptor");
        return this;
    }

    @Override // uo0.d
    public void c(to0.f descriptor) {
        s.k(descriptor, "descriptor");
    }

    @Override // uo0.d
    public final void e(to0.f descriptor, int index, String value) {
        s.k(descriptor, "descriptor");
        s.k(value, "value");
        if (H(descriptor, index)) {
            q(value);
        }
    }

    @Override // uo0.f
    public void f(byte value) {
        J(Byte.valueOf(value));
    }

    @Override // uo0.f
    public void g(to0.f enumDescriptor, int index) {
        s.k(enumDescriptor, "enumDescriptor");
        J(Integer.valueOf(index));
    }

    @Override // uo0.d
    public final void h(to0.f descriptor, int index, char value) {
        s.k(descriptor, "descriptor");
        if (H(descriptor, index)) {
            B(value);
        }
    }

    @Override // uo0.d
    public final void i(to0.f descriptor, int index, float value) {
        s.k(descriptor, "descriptor");
        if (H(descriptor, index)) {
            m(value);
        }
    }

    @Override // uo0.f
    public void j(short value) {
        J(Short.valueOf(value));
    }

    @Override // uo0.d
    public final void k(to0.f descriptor, int index, double value) {
        s.k(descriptor, "descriptor");
        if (H(descriptor, index)) {
            r(value);
        }
    }

    @Override // uo0.f
    public void l(boolean value) {
        J(Boolean.valueOf(value));
    }

    @Override // uo0.f
    public void m(float value) {
        J(Float.valueOf(value));
    }

    @Override // uo0.f
    public void o(int value) {
        J(Integer.valueOf(value));
    }

    @Override // uo0.d
    public final f p(to0.f descriptor, int index) {
        s.k(descriptor, "descriptor");
        return H(descriptor, index) ? E(descriptor.d(index)) : y0.f119720a;
    }

    @Override // uo0.f
    public void q(String value) {
        s.k(value, "value");
        J(value);
    }

    @Override // uo0.f
    public void r(double value) {
        J(Double.valueOf(value));
    }

    @Override // uo0.f
    public <T> void s(q<? super T> qVar, T t11) {
        f.a.d(this, qVar, t11);
    }

    @Override // uo0.f
    public d t(to0.f fVar, int i11) {
        return f.a.a(this, fVar, i11);
    }

    @Override // uo0.d
    public final void u(to0.f descriptor, int index, byte value) {
        s.k(descriptor, "descriptor");
        if (H(descriptor, index)) {
            f(value);
        }
    }

    @Override // uo0.f
    public void v(long value) {
        J(Long.valueOf(value));
    }

    @Override // uo0.f
    public void w() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // uo0.d
    public final void x(to0.f descriptor, int index, int value) {
        s.k(descriptor, "descriptor");
        if (H(descriptor, index)) {
            o(value);
        }
    }

    @Override // uo0.d
    public <T> void y(to0.f descriptor, int index, q<? super T> serializer, T value) {
        s.k(descriptor, "descriptor");
        s.k(serializer, "serializer");
        if (H(descriptor, index)) {
            I(serializer, value);
        }
    }

    @Override // uo0.d
    public final void z(to0.f descriptor, int index, long value) {
        s.k(descriptor, "descriptor");
        if (H(descriptor, index)) {
            v(value);
        }
    }
}
