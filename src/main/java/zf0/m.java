package zf0;

import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0007J\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lzf0/m;", "", "<init>", "()V", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Ldg0/c;", "c", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "Ljn0/s;", "Lzf0/q0;", "b", "Lpj0/a;", "Leg0/b;", "realCameraStatsManager", "Leg0/a;", "a", "(Lpj0/a;)Leg0/a;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class m {
    public eg0.a a(pj0.a<eg0.b> realCameraStatsManager) {
        p013kotlin.jvm.internal.s.k(realCameraStatsManager, "realCameraStatsManager");
        eg0.b bVar = realCameraStatsManager.get();
        p013kotlin.jvm.internal.s.j(bVar, "get(...)");
        return bVar;
    }

    public final MutableSharedFlow<jn0.s<q0>> b() {
        return SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public final MutableSharedFlow<dg0.c> c() {
        return SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }
}
