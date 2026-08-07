package so0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import io0.b;
import java.util.List;
import java.util.Map;
import jn0.a0;
import jn0.b0;
import jn0.f0;
import jn0.g0;
import jn0.h0;
import jn0.y;
import jn0.z;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.k;
import p013kotlin.jvm.internal.l;
import p013kotlin.jvm.internal.r;
import p013kotlin.jvm.internal.r0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import p013kotlin.jvm.internal.v;
import ro0.d;
import vo0.a1;
import vo0.b1;
import vo0.c0;
import vo0.d0;
import vo0.e;
import vo0.f2;
import vo0.g;
import vo0.g2;
import vo0.h;
import vo0.i0;
import vo0.i2;
import vo0.j;
import vo0.j0;
import vo0.j2;
import vo0.l2;
import vo0.m0;
import vo0.m2;
import vo0.n;
import vo0.o;
import vo0.o2;
import vo0.p2;
import vo0.q2;
import vo0.r2;
import vo0.s0;
import vo0.t;
import vo0.u;
import vo0.x1;
import vo0.y1;
import vo0.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\u0004\b\r\u0010\u0007\u001a\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u0007\u001a\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001H\u0007¢\u0006\u0004\b\u0017\u0010\u0007\u001a\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0001*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001¢\u0006\u0004\b\u001d\u0010\u0007\u001a\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0001H\u0007¢\u0006\u0004\b\u001f\u0010\u0007\u001a\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0001*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0001¢\u0006\u0004\b%\u0010\u0007\u001a\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0001H\u0007¢\u0006\u0004\b'\u0010\u0007\u001a\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0001*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0001¢\u0006\u0004\b-\u0010\u0007\u001a\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0001*\u00020.¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0001¢\u0006\u0004\b3\u0010\u0007\u001a\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0001*\u000204¢\u0006\u0004\b6\u00107\u001a\u0013\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0001¢\u0006\u0004\b9\u0010\u0007\u001a\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0001*\u00020:¢\u0006\u0004\b;\u0010<\u001a\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0001*\u00020=¢\u0006\u0004\b?\u0010@\u001a-\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000C0\u0001\"\u0004\b\u0000\u0010A2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bD\u0010E\u001aG\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010J0\u0001\"\u0004\b\u0000\u0010F\"\u0004\b\u0001\u0010G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\u0004\bK\u0010L\u001a\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u0001*\u00020M¢\u0006\u0004\bO\u0010P\u001a\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020R0\u0001*\u00020Q¢\u0006\u0004\bS\u0010T\u001a\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\u0001*\u00020U¢\u0006\u0004\bW\u0010X\u001a\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\u0001*\u00020Y¢\u0006\u0004\b[\u0010\\\u001a\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u0001*\u00020]¢\u0006\u0004\b_\u0010`\u001a\u0019\u0010c\u001a\b\u0012\u0004\u0012\u00020b0\u0001*\u00020aH\u0007¢\u0006\u0004\bc\u0010d\u001a\u0015\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\u0001H\u0007¢\u0006\u0004\bf\u0010\u0007\"3\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\"\b\b\u0000\u0010A*\u00020g*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\f\u0012\u0004\bi\u0010j\u001a\u0004\bh\u0010E¨\u0006l"}, d2 = {"Lkotlin/Char$Companion;", "Lro0/d;", "", "z", "(Lkotlin/jvm/internal/g;)Lro0/d;", "", "c", "()Lro0/d;", "Lkotlin/Byte$Companion;", "", "y", "(Lkotlin/jvm/internal/e;)Lro0/d;", "", "b", "Ljn0/z;", "l", "Lkotlin/Short$Companion;", "", "E", "(Lkotlin/jvm/internal/r0;)Lro0/d;", "", "k", "Ljn0/g0;", "o", "Lkotlin/Int$Companion;", "", "C", "(Lkotlin/jvm/internal/r;)Lro0/d;", "", "f", "Ljn0/b0;", "m", "Lkotlin/Long$Companion;", "", "D", "(Lkotlin/jvm/internal/v;)Lro0/d;", "", "h", "Ljn0/d0;", "n", "Lkotlin/Float$Companion;", "", "B", "(Lkotlin/jvm/internal/l;)Lro0/d;", "", "e", "Lkotlin/Double$Companion;", "", "A", "(Lkotlin/jvm/internal/k;)Lro0/d;", "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Boolean$Companion;", "", "x", "(Lkotlin/jvm/internal/d;)Lro0/d;", "", "a", "Ljn0/h0;", "v", "(Ljn0/h0;)Lro0/d;", "Lkotlin/String$Companion;", "", Gender.FEMALE, "(Lkotlin/jvm/internal/t0;)Lro0/d;", "T", "elementSerializer", "", "g", "(Lro0/d;)Lro0/d;", "K", "V", "keySerializer", "valueSerializer", "", IntegerTokenConverter.CONVERTER_KEY, "(Lro0/d;Lro0/d;)Lro0/d;", "Ljn0/a0$a;", "Ljn0/a0;", "s", "(Ljn0/a0$a;)Lro0/d;", "Ljn0/c0$a;", "Ljn0/c0;", "t", "(Ljn0/c0$a;)Lro0/d;", "Ljn0/y$a;", "Ljn0/y;", "r", "(Ljn0/y$a;)Lro0/d;", "Ljn0/f0$a;", "Ljn0/f0;", "u", "(Ljn0/f0$a;)Lro0/d;", "Lio0/b$a;", "Lio0/b;", "q", "(Lio0/b$a;)Lro0/d;", "Ljo0/a$a;", "Ljo0/a;", "w", "(Ljo0/a$a;)Lro0/d;", "", "j", "", "p", "getNullable$annotations", "(Lro0/d;)V", "nullable", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final d<Double> A(k kVar) {
        s.k(kVar, "<this>");
        return t.f119690a;
    }

    public static final d<Float> B(l lVar) {
        s.k(lVar, "<this>");
        return d0.f119601a;
    }

    public static final d<Integer> C(r rVar) {
        s.k(rVar, "<this>");
        return j0.f119632a;
    }

    public static final d<Long> D(v vVar) {
        s.k(vVar, "<this>");
        return s0.f119686a;
    }

    public static final d<Short> E(r0 r0Var) {
        s.k(r0Var, "<this>");
        return y1.f119722a;
    }

    public static final d<String> F(t0 t0Var) {
        s.k(t0Var, "<this>");
        return z1.f119730a;
    }

    public static final d<boolean[]> a() {
        return g.f119615c;
    }

    public static final d<byte[]> b() {
        return j.f119631c;
    }

    public static final d<char[]> c() {
        return n.f119661c;
    }

    public static final d<double[]> d() {
        return vo0.s.f119685c;
    }

    public static final d<float[]> e() {
        return c0.f119596c;
    }

    public static final d<int[]> f() {
        return i0.f119628c;
    }

    public static final <T> d<List<T>> g(d<T> elementSerializer) {
        s.k(elementSerializer, "elementSerializer");
        return new e(elementSerializer);
    }

    public static final d<long[]> h() {
        return vo0.r0.f119681c;
    }

    public static final <K, V> d<Map<K, V>> i(d<K> keySerializer, d<V> valueSerializer) {
        s.k(keySerializer, "keySerializer");
        s.k(valueSerializer, "valueSerializer");
        return new m0(keySerializer, valueSerializer);
    }

    public static final d j() {
        return a1.f119584a;
    }

    public static final d<short[]> k() {
        return x1.f119717c;
    }

    public static final d<z> l() {
        return f2.f119614c;
    }

    public static final d<b0> m() {
        return i2.f119630c;
    }

    public static final d<jn0.d0> n() {
        return l2.f119643c;
    }

    public static final d<g0> o() {
        return o2.f119668c;
    }

    public static final <T> d<T> p(d<T> dVar) {
        s.k(dVar, "<this>");
        return dVar.getDescriptor().b() ? dVar : new b1(dVar);
    }

    public static final d<b> q(b.Companion companion) {
        s.k(companion, "<this>");
        return u.f119697a;
    }

    public static final d<y> r(y.Companion companion) {
        s.k(companion, "<this>");
        return g2.f119618a;
    }

    public static final d<a0> s(a0.Companion companion) {
        s.k(companion, "<this>");
        return j2.f119635a;
    }

    public static final d<jn0.c0> t(jn0.c0.Companion companion) {
        s.k(companion, "<this>");
        return m2.f119659a;
    }

    public static final d<f0> u(f0.Companion companion) {
        s.k(companion, "<this>");
        return p2.f119672a;
    }

    public static final d<h0> v(h0 h0Var) {
        s.k(h0Var, "<this>");
        return q2.f119677b;
    }

    public static final d<jo0.a> w(jo0.a.Companion companion) {
        s.k(companion, "<this>");
        return r2.f119683a;
    }

    public static final d<Boolean> x(p013kotlin.jvm.internal.d dVar) {
        s.k(dVar, "<this>");
        return h.f119620a;
    }

    public static final d<Byte> y(p013kotlin.jvm.internal.e eVar) {
        s.k(eVar, "<this>");
        return vo0.k.f119637a;
    }

    public static final d<Character> z(p013kotlin.jvm.internal.g gVar) {
        s.k(gVar, "<this>");
        return o.f119664a;
    }
}
