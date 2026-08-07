package kp0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkp0/d;", "Ljp0/b;", "<init>", "()V", "", "expression", "data", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements jp0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f89293a = new d();

    private d() {
    }

    @Override // jp0.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean f(Object expression, Object data) {
        Object objQ0 = v.q0(yr0.a.c(expression));
        Object objB = yr0.c.b(yr0.a.c(expression));
        if (objB instanceof String) {
            return Boolean.valueOf(t.h0((CharSequence) objB, String.valueOf(objQ0), false, 2, null));
        }
        return objB instanceof List ? Boolean.valueOf(((List) objB).contains(objQ0)) : Boolean.FALSE;
    }
}
