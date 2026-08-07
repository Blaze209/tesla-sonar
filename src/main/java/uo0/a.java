package uo0;

import kotlinx.serialization.SerializationException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00012\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010-J5\u00102\u001a\u00028\u0000\"\n\b\u0000\u0010.*\u0004\u0018\u00010\u00052\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\n\b\u0002\u00101\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00022\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\u00020\b2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u00122\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\u00020\u00152\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\b@\u0010AJ\u001d\u0010B\u001a\u00020\u00182\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bF\u0010GJ\u001d\u0010H\u001a\u00020!2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bH\u0010IJ\u001d\u0010J\u001a\u00020$2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\u00020\u00012\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u0015H\u0016¢\u0006\u0004\bL\u0010MJ=\u0010N\u001a\u00028\u0000\"\u0004\b\u0000\u0010.2\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\b\u00101\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\bN\u0010OJC\u0010P\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010.*\u00020\u00052\u0006\u0010+\u001a\u00020'2\u0006\u00109\u001a\u00020\u00152\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000/2\b\u00101\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bP\u0010O¨\u0006Q"}, d2 = {"Luo0/a;", "Luo0/e;", "Luo0/c;", "<init>", "()V", "", "J", "()Ljava/lang/Object;", "", "E", "()Z", "", "f", "()Ljava/lang/Void;", "C", "", "H", "()B", "", "k", "()S", "", "z", "()I", "", "h", "()J", "", "B", "()F", "", "l", "()D", "", "m", "()C", "", "r", "()Ljava/lang/String;", "Lto0/f;", "enumDescriptor", "x", "(Lto0/f;)I", "descriptor", "q", "(Lto0/f;)Luo0/e;", "T", "Lro0/c;", "deserializer", "previousValue", "I", "(Lro0/c;Ljava/lang/Object;)Ljava/lang/Object;", "b", "(Lto0/f;)Luo0/c;", "Ljn0/h0;", "c", "(Lto0/f;)V", "index", "w", "(Lto0/f;I)Z", "p", "(Lto0/f;I)B", "u", "(Lto0/f;I)S", "e", "(Lto0/f;I)I", "j", "(Lto0/f;I)J", "D", "(Lto0/f;I)F", "s", "(Lto0/f;I)D", "G", "(Lto0/f;I)C", "t", "(Lto0/f;I)Ljava/lang/String;", "g", "(Lto0/f;I)Luo0/e;", "n", "(Lto0/f;ILro0/c;Ljava/lang/Object;)Ljava/lang/Object;", "v", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a implements e, c {
    @Override // uo0.e
    public float B() {
        Object objJ = J();
        s.i(objJ, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objJ).floatValue();
    }

    @Override // uo0.e
    public boolean C() {
        Object objJ = J();
        s.i(objJ, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objJ).booleanValue();
    }

    @Override // uo0.c
    public final float D(to0.f descriptor, int index) {
        s.k(descriptor, "descriptor");
        return B();
    }

    @Override // uo0.e
    public boolean E() {
        return true;
    }

    @Override // uo0.c
    public int F(to0.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // uo0.c
    public final char G(to0.f descriptor, int index) {
        s.k(descriptor, "descriptor");
        return m();
    }

    @Override // uo0.e
    public abstract byte H();

    public <T> T I(ro0.c<? extends T> deserializer, T previousValue) {
        s.k(deserializer, "deserializer");
        return (T) o(deserializer);
    }

    public Object J() {
        throw new SerializationException(o0.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // uo0.e
    public c b(to0.f descriptor) {
        s.k(descriptor, "descriptor");
        return this;
    }

    @Override // uo0.c
    public void c(to0.f descriptor) {
        s.k(descriptor, "descriptor");
    }

    @Override // uo0.c
    public final int e(to0.f descriptor, int index) {
        s.k(descriptor, "descriptor");
        return z();
    }

    @Override // uo0.e
    public Void f() {
        return null;
    }

    @Override // uo0.c
    public e g(to0.f descriptor, int index) {
        s.k(descriptor, "descriptor");
        return q(descriptor.d(index));
    }

    @Override // uo0.e
    public abstract long h();

    @Override // uo0.c
    public boolean i() {
        return c.a.b(this);
    }

    @Override // uo0.c
    public final long j(to0.f descriptor, int index) {
        s.k(descriptor, "descriptor");
        return h();
    }

    @Override // uo0.e
    public abstract short k();

    @Override // uo0.e
    public double l() {
        Object objJ = J();
        s.i(objJ, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objJ).doubleValue();
    }

    @Override // uo0.e
    public char m() {
        Object objJ = J();
        s.i(objJ, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objJ).charValue();
    }

    @Override // uo0.c
    public <T> T n(to0.f descriptor, int index, ro0.c<? extends T> deserializer, T previousValue) {
        s.k(descriptor, "descriptor");
        s.k(deserializer, "deserializer");
        return (T) I(deserializer, previousValue);
    }

    @Override // uo0.e
    public <T> T o(ro0.c<? extends T> cVar) {
        return (T) e.a.a(this, cVar);
    }

    @Override // uo0.c
    public final byte p(to0.f descriptor, int index) {
        s.k(descriptor, "descriptor");
        return H();
    }

    @Override // uo0.e
    public e q(to0.f descriptor) {
        s.k(descriptor, "descriptor");
        return this;
    }

    @Override // uo0.e
    public String r() {
        Object objJ = J();
        s.i(objJ, "null cannot be cast to non-null type kotlin.String");
        return (String) objJ;
    }

    @Override // uo0.c
    public final double s(to0.f descriptor, int index) {
        s.k(descriptor, "descriptor");
        return l();
    }

    @Override // uo0.c
    public final String t(to0.f descriptor, int index) {
        s.k(descriptor, "descriptor");
        return r();
    }

    @Override // uo0.c
    public final short u(to0.f descriptor, int index) {
        s.k(descriptor, "descriptor");
        return k();
    }

    @Override // uo0.c
    public final <T> T v(to0.f descriptor, int index, ro0.c<? extends T> deserializer, T previousValue) {
        s.k(descriptor, "descriptor");
        s.k(deserializer, "deserializer");
        return (deserializer.getDescriptor().b() || E()) ? (T) I(deserializer, previousValue) : (T) f();
    }

    @Override // uo0.c
    public final boolean w(to0.f descriptor, int index) {
        s.k(descriptor, "descriptor");
        return C();
    }

    @Override // uo0.e
    public int x(to0.f enumDescriptor) {
        s.k(enumDescriptor, "enumDescriptor");
        Object objJ = J();
        s.i(objJ, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objJ).intValue();
    }

    @Override // uo0.e
    public abstract int z();
}
