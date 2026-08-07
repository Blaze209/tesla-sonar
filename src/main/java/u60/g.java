package u60;

import bo0.n;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import v60.a1;
import v60.b0;
import v60.c1;
import v60.e0;
import v60.e1;
import v60.g0;
import v60.g1;
import v60.i0;
import v60.i1;
import v60.k0;
import v60.k1;
import v60.m;
import v60.m0;
import v60.m1;
import v60.o;
import v60.o0;
import v60.o1;
import v60.q;
import v60.q0;
import v60.q1;
import v60.s;
import v60.s1;
import v60.u;
import v60.u0;
import v60.u1;
import v60.w;
import v60.w0;
import v60.w1;
import v60.y0;
import v60.y1;
import v60.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR'\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, d2 = {"Lu60/g;", "", "<init>", "()V", "", "Lu60/c;", "b", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "all", "", "", "c", "Lkotlin/Lazy;", "()Ljava/util/Map;", "definitionsByCode", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f115773a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Set<c> all = d1.i(v60.a.f117928a, v60.c.f117940a, v60.e.f117951a, v60.g.f117963a, v60.i.f117975a, v60.k.f117987a, m.f117999a, o.f118011a, q.f118023a, s.f118035a, u.f118047a, w.f118059a, z.f118078a, b0.f117936a, e0.f117954a, g0.f117966a, i0.f117978a, k0.f117990a, m0.f118002a, o0.f118014a, q0.f118026a, u0.f118050a, w0.f118062a, y0.f118072a, a1.f117932a, c1.f117944a, e1.f117957a, g1.f117969a, i1.f117981a, k1.f117993a, m1.f118005a, o1.f118017a, q1.f118029a, s1.f118041a, u1.f118053a, w1.f118065a, y1.f118075a);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Lazy definitionsByCode = jn0.m.b(a.f115777c);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f115776d = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "Lu60/c;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<Map<String, ? extends c>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f115777c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        public final Map<String, ? extends c> invoke() {
            Set<c> setA = g.f115773a.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(setA, 10)), 16));
            for (Object obj : setA) {
                linkedHashMap.put(((c) obj).getType().code, obj);
            }
            return linkedHashMap;
        }
    }

    private g() {
    }

    public final Set<c> a() {
        return all;
    }

    public final Map<String, c> b() {
        return (Map) definitionsByCode.getValue();
    }
}
