package fo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p013kotlin.Metadata;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u0012\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011\"*\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0014*\u0004\u0018\u00010\u00000\u00000\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016\"<\u0010#\u001a*\u0012&\u0012$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0 j\u0002`!\u0012\u0004\u0012\u00020\u000f0\u001f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0016*0\b\u0002\u0010$\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0 2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0 ¨\u0006%"}, d2 = {"", "T", "Ljava/lang/Class;", "jClass", "Lfo0/w0;", "m", "(Ljava/lang/Class;)Lfo0/w0;", "Lco0/g;", "n", "(Ljava/lang/Class;)Lco0/g;", "", "Lco0/s;", "arguments", "", "isMarkedNullable", "Lco0/q;", "k", "(Ljava/lang/Class;Ljava/util/List;Z)Lco0/q;", "l", "Lfo0/a;", "kotlin.jvm.PlatformType", "a", "Lfo0/a;", "K_CLASS_CACHE", "Lfo0/u1;", "b", "K_PACKAGE_CACHE", "c", "CACHE_FOR_BASE_CLASSIFIERS", DateTokenConverter.CONVERTER_KEY, "CACHE_FOR_NULLABLE_BASE_CLASSIFIERS", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "Lkotlin/reflect/jvm/internal/Key;", "e", "CACHE_FOR_GENERIC_CLASSIFIERS", "Key", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a<w0<? extends Object>> f66133a = b.a(c.f66094a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a<u1> f66134b = b.a(d.f66106a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a<co0.q> f66135c = b.a(e.f66115a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a<co0.q> f66136d = b.a(f.f66122a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a<ConcurrentHashMap<Pair<List<co0.s>, Boolean>, co0.q>> f66137e = b.a(g.f66127a);

    /* JADX INFO: Access modifiers changed from: private */
    public static final co0.q a(Class it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return do0.d.b(m(it), p013kotlin.collections.v.m(), false, p013kotlin.collections.v.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap b(Class it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final co0.q c(Class it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return do0.d.b(m(it), p013kotlin.collections.v.m(), true, p013kotlin.collections.v.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w0 d(Class it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return new w0(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 e(Class it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return new u1(it);
    }

    public static final <T> co0.q k(Class<T> jClass, List<co0.s> arguments, boolean z11) {
        p013kotlin.jvm.internal.s.k(jClass, "jClass");
        p013kotlin.jvm.internal.s.k(arguments, "arguments");
        if (arguments.isEmpty()) {
            return z11 ? f66136d.a(jClass) : f66135c.a(jClass);
        }
        return l(jClass, arguments, z11);
    }

    private static final <T> co0.q l(Class<T> cls, List<co0.s> list, boolean z11) {
        ConcurrentHashMap<Pair<List<co0.s>, Boolean>, co0.q> concurrentHashMapA = f66137e.a(cls);
        Pair<List<co0.s>, Boolean> pairA = jn0.x.a(list, Boolean.valueOf(z11));
        co0.q qVar = concurrentHashMapA.get(pairA);
        if (qVar == null) {
            co0.q qVarB = do0.d.b(m(cls), list, z11, p013kotlin.collections.v.m());
            co0.q qVarPutIfAbsent = concurrentHashMapA.putIfAbsent(pairA, qVarB);
            qVar = qVarPutIfAbsent == null ? qVarB : qVarPutIfAbsent;
        }
        p013kotlin.jvm.internal.s.j(qVar, "getOrPut(...)");
        return qVar;
    }

    public static final <T> w0<T> m(Class<T> jClass) {
        p013kotlin.jvm.internal.s.k(jClass, "jClass");
        w2 w2VarA = f66133a.a(jClass);
        p013kotlin.jvm.internal.s.i(w2VarA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (w0) w2VarA;
    }

    public static final <T> co0.g n(Class<T> jClass) {
        p013kotlin.jvm.internal.s.k(jClass, "jClass");
        return f66134b.a(jClass);
    }
}
