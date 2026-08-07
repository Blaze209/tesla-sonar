package vo0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.ArrayList;
import kotlinx.serialization.SerializationException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00028\u0000*\u00020\u00072\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020!H\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\tH\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u00100\u001a\u00020\u0007H\u0014¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0007H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0018¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u001b¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u001e¢\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020!¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020&¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020)¢\u0006\u0004\bF\u0010GJ\u001d\u0010H\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0007H\u0014¢\u0006\u0004\bL\u0010KJ%\u0010M\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\bM\u0010NJ%\u0010O\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0015¢\u0006\u0004\bO\u0010PJ%\u0010Q\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0018¢\u0006\u0004\bQ\u0010RJ%\u0010S\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\bS\u0010TJ%\u0010U\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001b¢\u0006\u0004\bU\u0010VJ%\u0010W\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001e¢\u0006\u0004\bW\u0010XJ%\u0010Y\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020!¢\u0006\u0004\bY\u0010ZJ%\u0010[\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020&¢\u0006\u0004\b[\u0010\\J%\u0010]\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020)¢\u0006\u0004\b]\u0010^J\u001d\u0010_\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b_\u0010`JA\u0010c\u001a\u00020\u0012\"\n\b\u0001\u0010**\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00010a2\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\bc\u0010dJA\u0010e\u001a\u00020\u0012\"\b\b\u0001\u0010**\u00020\u00012\u0006\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00010a2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\be\u0010dJ\u0017\u0010g\u001a\u00020\u00122\u0006\u0010f\u001a\u00028\u0000H\u0004¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00028\u0000H\u0004¢\u0006\u0004\bi\u0010jR$\u0010o\u001a\u0012\u0012\u0004\u0012\u00028\u00000kj\b\u0012\u0004\u0012\u00028\u0000`l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010q\u001a\u00028\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bp\u0010jR\u0016\u0010s\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\br\u0010j¨\u0006t"}, d2 = {"Lvo0/d2;", "", "Tag", "Luo0/f;", "Luo0/d;", "<init>", "()V", "Lto0/f;", "desc", "", "index", "", "H", "(Lto0/f;I)Z", "X", "(Lto0/f;I)Ljava/lang/Object;", "tag", "value", "Ljn0/h0;", "Q", "(Ljava/lang/Object;I)V", "", "K", "(Ljava/lang/Object;B)V", "", "S", "(Ljava/lang/Object;S)V", "", "R", "(Ljava/lang/Object;J)V", "", Gender.OTHER, "(Ljava/lang/Object;F)V", "", Gender.MALE, "(Ljava/lang/Object;D)V", "J", "(Ljava/lang/Object;Z)V", "", "L", "(Ljava/lang/Object;C)V", "", "T", "(Ljava/lang/Object;Ljava/lang/String;)V", "enumDescriptor", "ordinal", Gender.NONE, "(Ljava/lang/Object;Lto0/f;I)V", "inlineDescriptor", "P", "(Ljava/lang/Object;Lto0/f;)Luo0/f;", "descriptor", "E", "(Lto0/f;)Luo0/f;", "l", "(Z)V", "f", "(B)V", "j", "(S)V", "o", "(I)V", "v", "(J)V", "m", "(F)V", "r", "(D)V", "B", "(C)V", "q", "(Ljava/lang/String;)V", "g", "(Lto0/f;I)V", "c", "(Lto0/f;)V", Gender.UNKNOWN, "A", "(Lto0/f;IZ)V", "u", "(Lto0/f;IB)V", Gender.FEMALE, "(Lto0/f;IS)V", "x", "(Lto0/f;II)V", "z", "(Lto0/f;IJ)V", IntegerTokenConverter.CONVERTER_KEY, "(Lto0/f;IF)V", "k", "(Lto0/f;ID)V", "h", "(Lto0/f;IC)V", "e", "(Lto0/f;ILjava/lang/String;)V", "p", "(Lto0/f;I)Luo0/f;", "Lro0/q;", "serializer", "D", "(Lto0/f;ILro0/q;Ljava/lang/Object;)V", "y", "name", "Z", "(Ljava/lang/Object;)V", "Y", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "tagStack", "V", "currentTag", "W", "currentTagOrNull", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class d2<Tag> implements uo0.f, uo0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<Tag> tagStack = new ArrayList<>();

    private final boolean H(to0.f desc, int index) {
        Z(X(desc, index));
        return true;
    }

    @Override // uo0.d
    public final void A(to0.f descriptor, int index, boolean value) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        J(X(descriptor, index), value);
    }

    @Override // uo0.f
    public final void B(char value) {
        L(Y(), value);
    }

    @Override // uo0.d
    public <T> void D(to0.f descriptor, int index, ro0.q<? super T> serializer, T value) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        p013kotlin.jvm.internal.s.k(serializer, "serializer");
        if (H(descriptor, index)) {
            s(serializer, value);
        }
    }

    @Override // uo0.f
    public uo0.f E(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return P(Y(), descriptor);
    }

    @Override // uo0.d
    public final void F(to0.f descriptor, int index, short value) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        S(X(descriptor, index), value);
    }

    public <T> void I(ro0.q<? super T> qVar, T t11) {
        uo0.f.a.c(this, qVar, t11);
    }

    protected abstract void J(Tag tag, boolean value);

    protected abstract void K(Tag tag, byte value);

    protected abstract void L(Tag tag, char value);

    protected abstract void M(Tag tag, double value);

    protected abstract void N(Tag tag, to0.f enumDescriptor, int ordinal);

    protected abstract void O(Tag tag, float value);

    protected uo0.f P(Tag tag, to0.f inlineDescriptor) {
        p013kotlin.jvm.internal.s.k(inlineDescriptor, "inlineDescriptor");
        Z(tag);
        return this;
    }

    protected abstract void Q(Tag tag, int value);

    protected abstract void R(Tag tag, long value);

    protected abstract void S(Tag tag, short value);

    protected abstract void T(Tag tag, String value);

    protected abstract void U(to0.f descriptor);

    protected final Tag V() {
        return (Tag) p013kotlin.collections.v.A0(this.tagStack);
    }

    protected final Tag W() {
        return (Tag) p013kotlin.collections.v.C0(this.tagStack);
    }

    protected abstract Tag X(to0.f fVar, int i11);

    protected final Tag Y() {
        if (this.tagStack.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        ArrayList<Tag> arrayList = this.tagStack;
        return arrayList.remove(p013kotlin.collections.v.o(arrayList));
    }

    protected final void Z(Tag name) {
        this.tagStack.add(name);
    }

    @Override // uo0.d
    public final void c(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        if (!this.tagStack.isEmpty()) {
            Y();
        }
        U(descriptor);
    }

    @Override // uo0.d
    public final void e(to0.f descriptor, int index, String value) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        p013kotlin.jvm.internal.s.k(value, "value");
        T(X(descriptor, index), value);
    }

    @Override // uo0.f
    public final void f(byte value) {
        K(Y(), value);
    }

    @Override // uo0.f
    public final void g(to0.f enumDescriptor, int index) {
        p013kotlin.jvm.internal.s.k(enumDescriptor, "enumDescriptor");
        N(Y(), enumDescriptor, index);
    }

    @Override // uo0.d
    public final void h(to0.f descriptor, int index, char value) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        L(X(descriptor, index), value);
    }

    @Override // uo0.d
    public final void i(to0.f descriptor, int index, float value) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        O(X(descriptor, index), value);
    }

    @Override // uo0.f
    public final void j(short value) {
        S(Y(), value);
    }

    @Override // uo0.d
    public final void k(to0.f descriptor, int index, double value) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        M(X(descriptor, index), value);
    }

    @Override // uo0.f
    public final void l(boolean value) {
        J(Y(), value);
    }

    @Override // uo0.f
    public final void m(float value) {
        O(Y(), value);
    }

    @Override // uo0.f
    public final void o(int value) {
        Q(Y(), value);
    }

    @Override // uo0.d
    public final uo0.f p(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return P(X(descriptor, index), descriptor.d(index));
    }

    @Override // uo0.f
    public final void q(String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        T(Y(), value);
    }

    @Override // uo0.f
    public final void r(double value) {
        M(Y(), value);
    }

    @Override // uo0.f
    public abstract <T> void s(ro0.q<? super T> qVar, T t11);

    @Override // uo0.f
    public uo0.d t(to0.f fVar, int i11) {
        return uo0.f.a.a(this, fVar, i11);
    }

    @Override // uo0.d
    public final void u(to0.f descriptor, int index, byte value) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        K(X(descriptor, index), value);
    }

    @Override // uo0.f
    public final void v(long value) {
        R(Y(), value);
    }

    @Override // uo0.d
    public final void x(to0.f descriptor, int index, int value) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        Q(X(descriptor, index), value);
    }

    @Override // uo0.d
    public <T> void y(to0.f descriptor, int index, ro0.q<? super T> serializer, T value) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        p013kotlin.jvm.internal.s.k(serializer, "serializer");
        if (H(descriptor, index)) {
            I(serializer, value);
        }
    }

    @Override // uo0.d
    public final void z(to0.f descriptor, int index, long value) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        R(X(descriptor, index), value);
    }
}
