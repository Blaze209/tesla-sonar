package kp0;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkp0/e;", "Ljp0/b;", "Lkotlin/Function1;", "", "Ljn0/h0;", "logger", "<init>", "(Lwn0/l;)V", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "a", "Lwn0/l;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements jp0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<Object, h0> logger;

    public e(l<Object, h0> lVar) {
        this.logger = lVar;
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        Object objQ0 = v.q0(yr0.a.c(expression));
        l<Object, h0> lVar = this.logger;
        if (lVar != null) {
            lVar.invoke(objQ0);
        }
        return objQ0;
    }
}
