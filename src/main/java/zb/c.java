package zb;

import java.util.List;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lzb/c;", "Ljp0/b;", "<init>", "()V", "", "", "Lzb/d;", "c", "(Ljava/util/List;)Lzb/d;", "", "a", "(Ljava/util/List;)Ljava/lang/Integer;", "", "b", "(Lzb/d;)Ljava/lang/String;", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements jp0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f128030a = new c();

    private c() {
    }

    private final Integer a(List<? extends Object> list) {
        Object obj = list.get(4);
        s.i(obj, "null cannot be cast to non-null type kotlin.Number");
        Number number = (Number) obj;
        if (number.doubleValue() != number.intValue()) {
            number = null;
        }
        if (number != null) {
            return Integer.valueOf(number.intValue());
        }
        return null;
    }

    private final String b(JoinToStringArguments joinToStringArguments) {
        return v.y0(joinToStringArguments.a(), joinToStringArguments.getSeparator(), joinToStringArguments.getPrefix(), joinToStringArguments.getPostfix(), joinToStringArguments.getLimit(), joinToStringArguments.getTruncated(), null, 32, null);
    }

    private final JoinToStringArguments c(List<? extends Object> list) {
        Object objB;
        JoinToStringArguments joinToStringArguments;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Integer numA = f128030a.a(list);
            if (numA != null) {
                int iIntValue = numA.intValue();
                List<Object> listC = yr0.a.c(list.get(0));
                Object obj = list.get(1);
                s.i(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object obj2 = list.get(2);
                s.i(obj2, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) obj2;
                Object obj3 = list.get(3);
                s.i(obj3, "null cannot be cast to non-null type kotlin.String");
                Object obj4 = list.get(5);
                s.i(obj4, "null cannot be cast to non-null type kotlin.String");
                joinToStringArguments = new JoinToStringArguments(listC, str, str2, (String) obj3, iIntValue, (String) obj4);
            } else {
                joinToStringArguments = null;
            }
            objB = jn0.s.b(joinToStringArguments);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        if (jn0.s.e(objB) == null) {
            return (JoinToStringArguments) objB;
        }
        return null;
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        JoinToStringArguments joinToStringArgumentsC = c(yr0.a.c(expression));
        if (joinToStringArgumentsC != null) {
            return b(joinToStringArgumentsC);
        }
        return null;
    }
}
