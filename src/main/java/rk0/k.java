package rk0;

import java.util.concurrent.CancellationException;
import jn0.h0;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
public final class k extends u implements wn0.l<Throwable, h0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Job f108539c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Job job) {
        super(1);
        this.f108539c = job;
    }

    public final void a(Throwable th2) {
        if (th2 == null) {
            return;
        }
        this.f108539c.cancel(new CancellationException(th2.getMessage()));
    }

    @Override // wn0.l
    public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
        a(th2);
        return h0.f84049a;
    }
}
