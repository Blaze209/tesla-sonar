package tr0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltr0/q;", "Ljp0/b;", "Ltr0/o;", "<init>", "()V", "", "", "Ltr0/r;", "b", "(Ljava/util/List;)Ltr0/r;", "", "Ltr0/s;", "c", "(Ljava/lang/String;)Ltr0/s;", "a", "(Ltr0/r;)Ljava/lang/String;", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q implements jp0.b, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f114956a = new q();

    private q() {
    }

    private final String a(TrimArguments trimArguments) {
        s mode = trimArguments.getMode();
        if (p013kotlin.jvm.internal.s.f(mode, s.c.f114962a)) {
            return p013kotlin.text.t.I1(trimArguments.getText(), trimArguments.getChar());
        }
        if (p013kotlin.jvm.internal.s.f(mode, s.b.f114961a)) {
            return p013kotlin.text.t.H1(trimArguments.getText(), trimArguments.getChar());
        }
        if (p013kotlin.jvm.internal.s.f(mode, s.a.f114960a)) {
            return p013kotlin.text.t.G1(trimArguments.getText(), trimArguments.getChar());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final TrimArguments b(List<? extends Object> list) {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Object obj = list.get(0);
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            p013kotlin.jvm.internal.s.i(obj2, "null cannot be cast to non-null type kotlin.String");
            char cS1 = p013kotlin.text.t.S1((String) obj2);
            q qVar = f114956a;
            Object obj3 = list.get(2);
            p013kotlin.jvm.internal.s.i(obj3, "null cannot be cast to non-null type kotlin.String");
            objB = jn0.s.b(new TrimArguments((String) obj, cS1, qVar.c((String) obj3)));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        if (jn0.s.e(objB) == null) {
            return (TrimArguments) objB;
        }
        return null;
    }

    private final s c(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 100571) {
                if (iHashCode != 109757538) {
                    if (iHashCode == 2144573977 && str.equals("bothEnds")) {
                        return s.a.f114960a;
                    }
                } else if (str.equals("start")) {
                    return s.c.f114962a;
                }
            } else if (str.equals("end")) {
                return s.b.f114961a;
            }
        }
        throw new IllegalStateException("Invalid TrimMode value");
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        TrimArguments trimArgumentsB = b(yr0.a.c(expression));
        if (trimArgumentsB != null) {
            return a(trimArgumentsB);
        }
        return null;
    }
}
