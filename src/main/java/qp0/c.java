package qp0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.x;
import org.webrtc.WebrtcBuildVersion;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s0;
import sp0.SingleNestedValue;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f*\b\u0012\u0004\u0012\u00020\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f*\b\u0012\u0004\u0012\u00020\u000f0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\f*\b\u0012\u0004\u0012\u00020\u000f0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f*\b\u0012\u0004\u0012\u00020\u000f0\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ$\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u001a"}, d2 = {"Lqp0/c;", "", "<init>", "()V", "", "value", "", "c", "(I)[Ljava/lang/Object;", "", "b", "(D)[Ljava/lang/Object;", "", "f", "(Ljava/util/List;)Ljava/util/List;", "", DateTokenConverter.CONVERTER_KEY, "e", "Ljava/io/Serializable;", "g", Action.KEY_ATTRIBUTE, "a", "(Ljava/lang/Object;)Ljava/util/List;", "", "Ljava/util/Map;", "tableOfTruth", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f105828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<Object, List<Object>> tableOfTruth;

    static {
        c cVar = new c();
        f105828a = cVar;
        Boolean bool = Boolean.TRUE;
        s0 s0Var = new s0(2);
        s0Var.a(bool);
        s0Var.b(cVar.c(1));
        Pair pairA = x.a(bool, v.p(s0Var.d(new Object[s0Var.c()])));
        Boolean bool2 = Boolean.FALSE;
        s0 s0Var2 = new s0(7);
        s0Var2.a(bool2);
        s0Var2.b(cVar.c(0));
        s0Var2.a("");
        s0Var2.a(v.m());
        s0Var2.a(new SingleNestedValue(v.m()));
        s0Var2.a(new SingleNestedValue(""));
        s0Var2.a(new SingleNestedValue(null));
        Pair pairA2 = x.a(bool2, v.p(s0Var2.d(new Object[s0Var2.c()])));
        s0 s0Var3 = new s0(2);
        s0Var3.a(bool);
        s0Var3.b(cVar.c(1));
        Pair pairA3 = x.a(1, v.p(s0Var3.d(new Object[s0Var3.c()])));
        s0 s0Var4 = new s0(7);
        s0Var4.a(bool2);
        s0Var4.b(cVar.c(0));
        s0Var4.a("");
        s0Var4.a(v.m());
        s0Var4.a(new SingleNestedValue(v.m()));
        s0Var4.a(new SingleNestedValue(""));
        s0Var4.a(new SingleNestedValue(null));
        Pair pairA4 = x.a(0, v.p(s0Var4.d(new Object[s0Var4.c()])));
        Pair pairA5 = x.a("true", v.e("true"));
        Pair pairA6 = x.a("false", v.e("false"));
        Double dValueOf = Double.valueOf(1.0d);
        Pair pairA7 = x.a("1", v.p(bool, 1, dValueOf, "1", new SingleNestedValue(1), new SingleNestedValue(dValueOf), new SingleNestedValue("1")));
        Double dValueOf2 = Double.valueOf(0.0d);
        Pair pairA8 = x.a(WebrtcBuildVersion.maint_version, v.p(bool2, 0, dValueOf2, WebrtcBuildVersion.maint_version, new SingleNestedValue(0), new SingleNestedValue(dValueOf2), new SingleNestedValue(WebrtcBuildVersion.maint_version)));
        Pair pairA9 = x.a("", v.p(bool2, 0, "", v.m(), new SingleNestedValue(v.m()), new SingleNestedValue(""), new SingleNestedValue(null)));
        Pair pairA10 = x.a(null, v.e(null));
        Pair pairA11 = x.a(v.m(), v.p(bool2, 0, dValueOf2, ""));
        Pair pairA12 = x.a(new SingleNestedValue(null), v.p(bool2, 0, dValueOf2, ""));
        Pair pairA13 = x.a(new SingleNestedValue(""), v.p(bool2, 0, dValueOf2, ""));
        Pair pairA14 = x.a(new SingleNestedValue(v.m()), v.p(bool2, 0, dValueOf2, ""));
        Pair pairA15 = x.a(new SingleNestedValue(0), v.p(bool2, 0, dValueOf2, WebrtcBuildVersion.maint_version));
        Pair pairA16 = x.a(new SingleNestedValue(1), v.p(bool, 1, dValueOf, "1"));
        Pair pairA17 = x.a(new SingleNestedValue("1"), v.p(bool, 1, dValueOf, "1"));
        Pair pairA18 = x.a(new SingleNestedValue(WebrtcBuildVersion.maint_version), v.p(bool2, 0, dValueOf2, WebrtcBuildVersion.maint_version));
        Pair pairA19 = x.a(new SingleNestedValue(dValueOf2), v.p(bool2, 0, dValueOf2, WebrtcBuildVersion.maint_version));
        Pair pairA20 = x.a(new SingleNestedValue(dValueOf), v.p(bool, 1, dValueOf, "1"));
        Pair pairA21 = x.a(new SingleNestedValue("1.0"), v.p(bool, 1, dValueOf));
        Pair pairA22 = x.a(new SingleNestedValue("0.0"), v.p(bool2, 0, dValueOf2));
        Pair pairA23 = x.a(dValueOf, v.p(dValueOf, new SingleNestedValue(dValueOf), new SingleNestedValue(1), new SingleNestedValue("1.0"), "1", 1, bool, "1.0"));
        Pair pairA24 = x.a("1.0", v.p("1.0", dValueOf, 1, bool));
        s0 s0Var5 = new s0(4);
        s0Var5.b(cVar.b(0.0d));
        s0Var5.a(bool2);
        s0Var5.a(v.m());
        s0Var5.a(new SingleNestedValue(v.m()));
        tableOfTruth = v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, pairA17, pairA18, pairA19, pairA20, pairA21, pairA22, pairA23, pairA24, x.a(dValueOf2, v.p(s0Var5.d(new Object[s0Var5.c()]))), x.a("0.0", v.p("0.0", dValueOf2, 0, bool2)));
    }

    private c() {
    }

    private final Object[] b(double value) {
        return f(g(e(v.e(Double.valueOf(value))))).toArray(new Object[0]);
    }

    private final Object[] c(int value) {
        return f(g(d(v.e(Integer.valueOf(value))))).toArray(new Object[0]);
    }

    private final List<Number> d(List<? extends Number> list) {
        List<? extends Number> list2 = list;
        List<? extends Number> list3 = list;
        ArrayList arrayList = new ArrayList(v.y(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it.next()).doubleValue()));
        }
        return v.P0(list2, arrayList);
    }

    private final List<Number> e(List<? extends Number> list) {
        List<? extends Number> list2 = list;
        List<? extends Number> list3 = list;
        ArrayList arrayList = new ArrayList(v.y(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) it.next()).intValue()));
        }
        return v.P0(list2, arrayList);
    }

    private final List<Object> f(List<? extends Object> list) {
        List<? extends Object> list2 = list;
        List<? extends Object> list3 = list;
        ArrayList arrayList = new ArrayList(v.y(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(new SingleNestedValue(it.next()));
        }
        return v.P0(list2, arrayList);
    }

    private final List<Serializable> g(List<? extends Number> list) {
        List<? extends Number> list2 = list;
        List<? extends Number> list3 = list;
        ArrayList arrayList = new ArrayList(v.y(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Number) it.next()).toString());
        }
        return v.P0(list2, arrayList);
    }

    public final List<Object> a(Object key) {
        return tableOfTruth.get(key);
    }
}
