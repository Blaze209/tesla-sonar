package rk0;

import jn0.h0;
import kotlinx.coroutines.DisposableHandle;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
public final class j extends u implements wn0.l<Throwable, h0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ DisposableHandle f108538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DisposableHandle disposableHandle) {
        super(1);
        this.f108538c = disposableHandle;
    }

    public final void a(Throwable th2) {
        this.f108538c.dispose();
    }

    @Override // wn0.l
    public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
        a(th2);
        return h0.f84049a;
    }
}
