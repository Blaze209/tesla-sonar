package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\tJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R'\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u001cj\b\u0012\u0004\u0012\u00020\u0006`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!¨\u0006#"}, d2 = {"Lb4/n;", "", "", "extraAssertions", "<init>", "(Z)V", "Lb4/g0;", "node", "b", "(Lb4/g0;)Z", "Ljn0/h0;", "a", "(Lb4/g0;)V", "f", "e", "()Lb4/g0;", DateTokenConverter.CONVERTER_KEY, "()Z", "", "toString", "()Ljava/lang/String;", "Z", "", "", "Lkotlin/Lazy;", "c", "()Ljava/util/Map;", "mapOfOriginalDepth", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "Ljava/util/Comparator;", "DepthComparator", "Lb4/z1;", "Lb4/z1;", "set", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean extraAssertions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy mapOfOriginalDepth = jn0.m.a(jn0.p.NONE, b.f16228c);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Comparator<g0> DepthComparator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z1<g0> set;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u001f\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"b4/n$a", "Ljava/util/Comparator;", "Lb4/g0;", "Lkotlin/Comparator;", "a", "b", "", "(Lb4/g0;Lb4/g0;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Comparator<g0> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g0 a11, g0 b11) {
            int iM = p013kotlin.jvm.internal.s.m(a11.getDepth(), b11.getDepth());
            return iM != 0 ? iM : p013kotlin.jvm.internal.s.m(a11.hashCode(), b11.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lb4/g0;", "", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<Map<g0, Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f16228c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        public final Map<g0, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    public n(boolean z11) {
        this.extraAssertions = z11;
        a aVar = new a();
        this.DepthComparator = aVar;
        this.set = new z1<>(aVar);
    }

    private final Map<g0, Integer> c() {
        return (Map) this.mapOfOriginalDepth.getValue();
    }

    public final void a(g0 node) {
        if (!node.K0()) {
            y3.a.b("DepthSortedSet.add called on an unattached node");
        }
        if (this.extraAssertions) {
            Integer num = c().get(node);
            if (num == null) {
                c().put(node, Integer.valueOf(node.getDepth()));
            } else {
                if (!(num.intValue() == node.getDepth())) {
                    y3.a.b("invalid node depth");
                }
            }
        }
        this.set.add(node);
    }

    public final boolean b(g0 node) {
        boolean zContains = this.set.contains(node);
        if (this.extraAssertions) {
            if (!(zContains == c().containsKey(node))) {
                y3.a.b("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public final boolean d() {
        return this.set.isEmpty();
    }

    public final g0 e() {
        g0 g0VarFirst = this.set.first();
        f(g0VarFirst);
        return g0VarFirst;
    }

    public final boolean f(g0 node) {
        if (!node.K0()) {
            y3.a.b("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.set.remove(node);
        if (this.extraAssertions) {
            if (!p013kotlin.jvm.internal.s.f(c().remove(node), zRemove ? Integer.valueOf(node.getDepth()) : null)) {
                y3.a.b("invalid node depth");
            }
        }
        return zRemove;
    }

    public String toString() {
        return this.set.toString();
    }
}
