package tr0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\u00122\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0012*\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ltr0/g;", "Ljp0/b;", "Ltr0/o;", "<init>", "()V", "", "", "Ltr0/h;", "e", "(Ljava/util/List;)Ltr0/h;", "options", "", "Lkotlin/text/s;", "a", "(Ljava/util/List;)Ljava/util/Set;", "", "regexPattern", "text", "", "c", "(Ljava/lang/String;Ljava/lang/String;)Z", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Z", "b", "(Ltr0/h;)Z", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements jp0.b, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f114943a = new g();

    private g() {
    }

    private final Set<p013kotlin.text.s> a(List<? extends Object> options) {
        List<? extends Object> list = options;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        for (Object obj : list) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(p013kotlin.text.s.valueOf((String) obj));
        }
        return v.r1(arrayList);
    }

    private final boolean b(MatchArguments matchArguments) {
        List<Object> listA = matchArguments.a();
        return (listA == null || listA.isEmpty()) ? c(matchArguments.getRegexPattern(), matchArguments.getText()) : d(matchArguments.a(), matchArguments.getRegexPattern(), matchArguments.getText());
    }

    private final boolean c(String regexPattern, String text) {
        return new p013kotlin.text.q(regexPattern).i(text);
    }

    private final boolean d(List<? extends Object> options, String regexPattern, String text) {
        Set<p013kotlin.text.s> setA = a(options);
        p013kotlin.text.q qVar = new p013kotlin.text.q(regexPattern, setA);
        Set<p013kotlin.text.s> set = setA;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (((p013kotlin.text.s) it.next()) == p013kotlin.text.s.MULTILINE) {
                    List listF1 = p013kotlin.text.t.f1(text, new String[]{"\n"}, false, 0, 6, null);
                    if ((listF1 instanceof Collection) && listF1.isEmpty()) {
                        return true;
                    }
                    Iterator it2 = listF1.iterator();
                    while (it2.hasNext()) {
                        if (!qVar.i((String) it2.next())) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return qVar.i(text);
    }

    private final MatchArguments e(List<? extends Object> list) {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Object obj = list.get(0);
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            p013kotlin.jvm.internal.s.i(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(2);
            p013kotlin.jvm.internal.s.i(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            objB = jn0.s.b(new MatchArguments((String) obj, (String) obj2, (List) obj3));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        if (jn0.s.e(objB) == null) {
            return (MatchArguments) objB;
        }
        return null;
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        MatchArguments matchArgumentsE = e(yr0.a.c(expression));
        if (matchArgumentsE != null) {
            return Boolean.valueOf(b(matchArgumentsE));
        }
        return null;
    }
}
