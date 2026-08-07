package vo0;

import ezvcard.property.Gender;
import java.util.ArrayList;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00028\u0000*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH$¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\rH\u0014¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010/\u001a\u00020\rH\u0014¢\u0006\u0004\b0\u00101J3\u00105\u001a\u00028\u0001\"\n\b\u0001\u00100*\u0004\u0018\u00010\u00012\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u0001022\b\u00104\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00032\u0006\u00107\u001a\u00020\rH\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u0012¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0015¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0018¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u000e¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u001d¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020 ¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020#¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020&¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020)¢\u0006\u0004\bM\u0010NJ\u0015\u0010O\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\r¢\u0006\u0004\bO\u0010PJ\u001d\u0010Q\u001a\u00020\u00122\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bQ\u0010RJ\u001d\u0010S\u001a\u00020\u00152\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bS\u0010TJ\u001d\u0010U\u001a\u00020\u00182\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bU\u0010VJ\u001d\u0010W\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bW\u0010XJ\u001d\u0010Y\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bY\u0010ZJ\u001d\u0010[\u001a\u00020 2\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b[\u0010\\J\u001d\u0010]\u001a\u00020#2\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b]\u0010^J\u001d\u0010_\u001a\u00020&2\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b_\u0010`J\u001d\u0010a\u001a\u00020)2\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\ba\u0010bJ\u001d\u0010c\u001a\u00020\u00032\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bc\u0010dJA\u0010e\u001a\u00028\u0001\"\n\b\u0001\u00100*\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u0001022\b\u00104\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\be\u0010fJC\u0010g\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u00100*\u00020\u00012\u0006\u00107\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u0001022\b\u00104\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bg\u0010fJ\u0017\u0010j\u001a\u00020i2\u0006\u0010h\u001a\u00028\u0000H\u0004¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00028\u0000H\u0004¢\u0006\u0004\bl\u0010mR*\u0010t\u001a\u0012\u0012\u0004\u0012\u00028\u00000nj\b\u0012\u0004\u0012\u00028\u0000`o8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0016\u0010v\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010\u0010R\u0016\u0010x\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bw\u0010m¨\u0006y"}, d2 = {"Lvo0/c2;", "", "Tag", "Luo0/e;", "Luo0/c;", "<init>", "()V", "E", "tag", "Lkotlin/Function0;", "block", "d0", "(Ljava/lang/Object;Lwn0/a;)Ljava/lang/Object;", "Lto0/f;", "", "index", "Z", "(Lto0/f;I)Ljava/lang/Object;", "", Gender.NONE, "(Ljava/lang/Object;)Z", "", Gender.OTHER, "(Ljava/lang/Object;)B", "", "W", "(Ljava/lang/Object;)S", Gender.UNKNOWN, "(Ljava/lang/Object;)I", "", "V", "(Ljava/lang/Object;)J", "", "S", "(Ljava/lang/Object;)F", "", "Q", "(Ljava/lang/Object;)D", "", "P", "(Ljava/lang/Object;)C", "", "X", "(Ljava/lang/Object;)Ljava/lang/String;", "enumDescriptor", "R", "(Ljava/lang/Object;Lto0/f;)I", "inlineDescriptor", "T", "(Ljava/lang/Object;Lto0/f;)Luo0/e;", "Lro0/c;", "deserializer", "previousValue", Gender.MALE, "(Lro0/c;Ljava/lang/Object;)Ljava/lang/Object;", "descriptor", "q", "(Lto0/f;)Luo0/e;", "", "f", "()Ljava/lang/Void;", "C", "()Z", "H", "()B", "k", "()S", "z", "()I", "h", "()J", "B", "()F", "l", "()D", "m", "()C", "r", "()Ljava/lang/String;", "x", "(Lto0/f;)I", "w", "(Lto0/f;I)Z", "p", "(Lto0/f;I)B", "u", "(Lto0/f;I)S", "e", "(Lto0/f;I)I", "j", "(Lto0/f;I)J", "D", "(Lto0/f;I)F", "s", "(Lto0/f;I)D", "G", "(Lto0/f;I)C", "t", "(Lto0/f;I)Ljava/lang/String;", "g", "(Lto0/f;I)Luo0/e;", "n", "(Lto0/f;ILro0/c;Ljava/lang/Object;)Ljava/lang/Object;", "v", "name", "Ljn0/h0;", "c0", "(Ljava/lang/Object;)V", "b0", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "a0", "()Ljava/util/ArrayList;", "tagStack", "b", "flag", "Y", "currentTagOrNull", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class c2<Tag> implements uo0.e, uo0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<Tag> tagStack = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean flag;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K(c2 c2Var, ro0.c cVar, Object obj) {
        return (cVar.getDescriptor().b() || c2Var.E()) ? c2Var.M(cVar, obj) : c2Var.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object L(c2 c2Var, ro0.c cVar, Object obj) {
        return c2Var.M(cVar, obj);
    }

    private final <E> E d0(Tag tag, wn0.a<? extends E> block) {
        c0(tag);
        E eInvoke = block.invoke();
        if (!this.flag) {
            b0();
        }
        this.flag = false;
        return eInvoke;
    }

    @Override // uo0.e
    public final float B() {
        return S(b0());
    }

    @Override // uo0.e
    public final boolean C() {
        return N(b0());
    }

    @Override // uo0.c
    public final float D(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return S(Z(descriptor, index));
    }

    @Override // uo0.c
    public int F(to0.f fVar) {
        return uo0.c.a.a(this, fVar);
    }

    @Override // uo0.c
    public final char G(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return P(Z(descriptor, index));
    }

    @Override // uo0.e
    public final byte H() {
        return O(b0());
    }

    protected <T> T M(ro0.c<? extends T> deserializer, T previousValue) {
        p013kotlin.jvm.internal.s.k(deserializer, "deserializer");
        return (T) o(deserializer);
    }

    protected abstract boolean N(Tag tag);

    protected abstract byte O(Tag tag);

    protected abstract char P(Tag tag);

    protected abstract double Q(Tag tag);

    protected abstract int R(Tag tag, to0.f enumDescriptor);

    protected abstract float S(Tag tag);

    protected uo0.e T(Tag tag, to0.f inlineDescriptor) {
        p013kotlin.jvm.internal.s.k(inlineDescriptor, "inlineDescriptor");
        c0(tag);
        return this;
    }

    protected abstract int U(Tag tag);

    protected abstract long V(Tag tag);

    protected abstract short W(Tag tag);

    protected abstract String X(Tag tag);

    protected final Tag Y() {
        return (Tag) p013kotlin.collections.v.C0(this.tagStack);
    }

    protected abstract Tag Z(to0.f fVar, int i11);

    public final ArrayList<Tag> a0() {
        return this.tagStack;
    }

    protected final Tag b0() {
        ArrayList<Tag> arrayList = this.tagStack;
        Tag tagRemove = arrayList.remove(p013kotlin.collections.v.o(arrayList));
        this.flag = true;
        return tagRemove;
    }

    protected final void c0(Tag name) {
        this.tagStack.add(name);
    }

    @Override // uo0.c
    public final int e(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return U(Z(descriptor, index));
    }

    @Override // uo0.e
    public final Void f() {
        return null;
    }

    @Override // uo0.c
    public final uo0.e g(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return T(Z(descriptor, index), descriptor.d(index));
    }

    @Override // uo0.e
    public final long h() {
        return V(b0());
    }

    @Override // uo0.c
    public boolean i() {
        return uo0.c.a.b(this);
    }

    @Override // uo0.c
    public final long j(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return V(Z(descriptor, index));
    }

    @Override // uo0.e
    public final short k() {
        return W(b0());
    }

    @Override // uo0.e
    public final double l() {
        return Q(b0());
    }

    @Override // uo0.e
    public final char m() {
        return P(b0());
    }

    @Override // uo0.c
    public final <T> T n(to0.f descriptor, int index, final ro0.c<? extends T> deserializer, final T previousValue) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        p013kotlin.jvm.internal.s.k(deserializer, "deserializer");
        return (T) d0(Z(descriptor, index), new wn0.a() { // from class: vo0.a2
            @Override // wn0.a
            public final Object invoke() {
                return c2.L(this.f119586a, deserializer, previousValue);
            }
        });
    }

    @Override // uo0.e
    public abstract <T> T o(ro0.c<? extends T> cVar);

    @Override // uo0.c
    public final byte p(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return O(Z(descriptor, index));
    }

    @Override // uo0.e
    public uo0.e q(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return T(b0(), descriptor);
    }

    @Override // uo0.e
    public final String r() {
        return X(b0());
    }

    @Override // uo0.c
    public final double s(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return Q(Z(descriptor, index));
    }

    @Override // uo0.c
    public final String t(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return X(Z(descriptor, index));
    }

    @Override // uo0.c
    public final short u(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return W(Z(descriptor, index));
    }

    @Override // uo0.c
    public final <T> T v(to0.f descriptor, int index, final ro0.c<? extends T> deserializer, final T previousValue) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        p013kotlin.jvm.internal.s.k(deserializer, "deserializer");
        return (T) d0(Z(descriptor, index), new wn0.a() { // from class: vo0.b2
            @Override // wn0.a
            public final Object invoke() {
                return c2.K(this.f119593a, deserializer, previousValue);
            }
        });
    }

    @Override // uo0.c
    public final boolean w(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return N(Z(descriptor, index));
    }

    @Override // uo0.e
    public final int x(to0.f enumDescriptor) {
        p013kotlin.jvm.internal.s.k(enumDescriptor, "enumDescriptor");
        return R(b0(), enumDescriptor);
    }

    @Override // uo0.e
    public final int z() {
        return U(b0());
    }
}
