package p020r2;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import wn0.a;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\bJ!\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H'¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H'¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H'¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u0004H'¢\u0006\u0004\b\u001c\u0010\bJ#\u0010\u001f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH'¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H'¢\u0006\u0004\b!\u0010\bJ\u000f\u0010\"\u001a\u00020\u0004H'¢\u0006\u0004\b\"\u0010\bJ!\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b#\u0010\rJ\u000f\u0010$\u001a\u00020\u0004H'¢\u0006\u0004\b$\u0010\bJ=\u0010)\u001a\u00020\u0004\"\u0004\b\u0000\u0010%\"\u0004\b\u0001\u0010\u00072\u0006\u0010&\u001a\u00028\u00002\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040'H'¢\u0006\u0004\b)\u0010*J\u0011\u0010+\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0017H\u0017¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00172\u0006\u0010&\u001a\u000203H\u0017¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0002H\u0017¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00172\u0006\u0010&\u001a\u000208H\u0017¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00172\u0006\u0010&\u001a\u00020;H\u0017¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0004\b>\u00100J\u0017\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H'¢\u0006\u0004\bA\u0010BJ\u001d\u0010D\u001a\u00020\u00042\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040\u001dH'¢\u0006\u0004\bD\u0010 J#\u0010F\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000EH'¢\u0006\u0004\bF\u0010GJ#\u0010K\u001a\u00020\u00042\u0012\u0010J\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030I0HH'¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0004H'¢\u0006\u0004\bM\u0010\bJ\u001b\u0010N\u001a\u00020\u00042\n\u0010&\u001a\u0006\u0012\u0002\b\u00030IH'¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0004H'¢\u0006\u0004\bP\u0010\bJ\u000f\u0010Q\u001a\u00020\u0004H&¢\u0006\u0004\bQ\u0010\bJ\u000f\u0010S\u001a\u00020RH'¢\u0006\u0004\bS\u0010TR\u001e\u0010Y\u001a\u0006\u0012\u0002\b\u00030U8&X§\u0004¢\u0006\f\u0012\u0004\bX\u0010\b\u001a\u0004\bV\u0010WR\u001a\u0010]\u001a\u00020\u00178&X§\u0004¢\u0006\f\u0012\u0004\b\\\u0010\b\u001a\u0004\bZ\u0010[R\u001a\u0010`\u001a\u00020\u00178&X§\u0004¢\u0006\f\u0012\u0004\b_\u0010\b\u001a\u0004\b^\u0010[R\u001a\u0010c\u001a\u00020\u00178&X§\u0004¢\u0006\f\u0012\u0004\bb\u0010\b\u001a\u0004\ba\u0010[R\u001c\u0010g\u001a\u0004\u0018\u00010?8&X§\u0004¢\u0006\f\u0012\u0004\bf\u0010\b\u001a\u0004\bd\u0010eR\u001a\u0010k\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\bj\u0010\b\u001a\u0004\bh\u0010iR\u0014\u0010o\u001a\u00020l8&X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8&X¦\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u001a\u0010x\u001a\u00020t8gX§\u0004¢\u0006\f\u0012\u0004\bw\u0010\b\u001a\u0004\bu\u0010v\u0082\u0001\u0001yø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006zÀ\u0006\u0001"}, d2 = {"Lr2/l;", "", "", Action.KEY_ATTRIBUTE, "Ljn0/h0;", "H", "(I)V", "T", "()V", "o", "l", "dataKey", Gender.MALE, "(ILjava/lang/Object;)V", "S", "L", "C", "v", "(I)Lr2/l;", "Lr2/w2;", "x", "()Lr2/w2;", "j", "", "changed", "a", "(Z)V", "y", "h", "Lkotlin/Function0;", "factory", "z", "(Lwn0/a;)V", DateTokenConverter.CONVERTER_KEY, "g", IntegerTokenConverter.CONVERTER_KEY, "G", "V", "value", "Lkotlin/Function2;", "block", "f", "(Ljava/lang/Object;Lwn0/p;)V", "I", "()Ljava/lang/Object;", "B", "(Ljava/lang/Object;)V", "n", "(Ljava/lang/Object;)Z", "p", "(Z)Z", "", "t", "(C)Z", "r", "(I)Z", "", "q", "(F)Z", "", "s", "(J)Z", "K", "Lr2/i2;", "scope", "P", "(Lr2/i2;)V", "effect", "E", "Lr2/u;", Gender.UNKNOWN, "(Lr2/u;)Ljava/lang/Object;", "", "Lr2/h2;", "values", Gender.NONE, "([Lr2/h2;)V", "Q", Gender.OTHER, "(Lr2/h2;)V", "e", "D", "Lr2/q;", "m", "()Lr2/q;", "Lr2/f;", "w", "()Lr2/f;", "getApplier$annotations", "applier", "u", "()Z", "getInserting$annotations", "inserting", "b", "getSkipping$annotations", "skipping", "k", "getDefaultsInvalid$annotations", "defaultsInvalid", Gender.FEMALE, "()Lr2/i2;", "getRecomposeScope$annotations", "recomposeScope", "R", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "Lr2/x;", "c", "()Lr2/x;", "currentCompositionLocalMap", "Lc3/a;", "J", "()Lc3/a;", "compositionData", "Lkotlin/coroutines/CoroutineContext;", "A", "()Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Lr2/m;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f106610a;

    /* JADX INFO: renamed from: r2.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lr2/l$a;", "", "<init>", "()V", "b", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "Empty", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f106610a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final Object Empty = new C2264a();

        /* JADX INFO: renamed from: r2.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"r2/l$a$a", "", "", "toString", "()Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C2264a {
            C2264a() {
            }

            public String toString() {
                return "Empty";
            }
        }

        private Companion() {
        }

        public final Object a() {
            return Empty;
        }
    }

    CoroutineContext A();

    void B(Object value);

    void C();

    void D();

    void E(a<h0> effect);

    i2 F();

    void G();

    void H(int key);

    Object I();

    c3.a J();

    default boolean K(Object value) {
        return n(value);
    }

    void L();

    void M(int key, Object dataKey);

    void N(h2<?>[] values);

    void O(h2<?> value);

    void P(i2 scope);

    void Q();

    int R();

    void S();

    void T();

    <T> T U(u<T> key);

    void a(boolean changed);

    boolean b();

    x c();

    void d();

    void e();

    <V, T> void f(V value, p<? super T, ? super V, h0> block);

    void g();

    void h();

    void i(int key, Object dataKey);

    void j();

    boolean k();

    void l();

    q m();

    boolean n(Object value);

    void o(int key);

    default boolean p(boolean value) {
        return p(value);
    }

    default boolean q(float value) {
        return q(value);
    }

    default boolean r(int value) {
        return r(value);
    }

    default boolean s(long value) {
        return s(value);
    }

    default boolean t(char value) {
        return t(value);
    }

    boolean u();

    l v(int key);

    f<?> w();

    w2 x();

    void y();

    <T> void z(a<? extends T> factory);
}
