package v3;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lv3/n0;", "Lkotlin/Function1;", "", "Ljn0/h0;", "<init>", "()V", "disallowIntercept", "a", "(Z)V", "Lv3/g0;", "Lv3/g0;", "getPointerInteropFilter$ui_release", "()Lv3/g0;", "b", "(Lv3/g0;)V", "pointerInteropFilter", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n0 implements wn0.l<Boolean, jn0.h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private g0 pointerInteropFilter;

    public void a(boolean disallowIntercept) {
        g0 g0Var = this.pointerInteropFilter;
        if (g0Var == null) {
            return;
        }
        g0Var.o(disallowIntercept);
    }

    public final void b(g0 g0Var) {
        this.pointerInteropFilter = g0Var;
    }

    @Override // wn0.l
    public /* bridge */ /* synthetic */ jn0.h0 invoke(Boolean bool) {
        a(bool.booleanValue());
        return jn0.h0.f84049a;
    }
}
