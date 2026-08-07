package tr0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004*\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ltr0/m;", "Ljp0/b;", "<init>", "()V", "", "", "Ltr0/n;", "b", "(Ljava/util/List;)Ltr0/n;", "", "a", "(Ltr0/n;)Ljava/util/List;", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m implements jp0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f114952a = new m();

    private m() {
    }

    private final List<String> a(SplitArguments splitArguments) {
        List<Object> listA = splitArguments.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (Object obj : listA) {
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) obj);
        }
        String[] strArr = (String[]) v.r1(arrayList).toArray(new String[0]);
        return p013kotlin.text.t.f1(splitArguments.getText(), (String[]) Arrays.copyOf(strArr, strArr.length), false, 0, 6, null);
    }

    private final SplitArguments b(List<? extends Object> list) {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Object obj = list.get(0);
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            p013kotlin.jvm.internal.s.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            objB = jn0.s.b(new SplitArguments((String) obj, (List) obj2));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        if (jn0.s.e(objB) == null) {
            return (SplitArguments) objB;
        }
        return null;
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        SplitArguments splitArgumentsB = b(yr0.a.c(expression));
        if (splitArgumentsB != null) {
            return a(splitArgumentsB);
        }
        return null;
    }
}
