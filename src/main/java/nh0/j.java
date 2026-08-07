package nh0;

import java.util.List;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0096A¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lnh0/j;", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/withpersona/sdk2/inquiry/nfc/a;", "<init>", "()V", "output", "", "a", "(Lcom/withpersona/sdk2/inquiry/nfc/a;)Z", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "b", "nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements SharedFlow<com.withpersona.sdk2.inquiry.nfc.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final MutableSharedFlow<com.withpersona.sdk2.inquiry.nfc.a> f95028c = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ MutableSharedFlow<com.withpersona.sdk2.inquiry.nfc.a> f95029a = f95028c;

    public final boolean a(com.withpersona.sdk2.inquiry.nfc.a output) {
        s.k(output, "output");
        return f95028c.tryEmit(output);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super com.withpersona.sdk2.inquiry.nfc.a> flowCollector, Continuation<?> continuation) {
        return this.f95029a.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<com.withpersona.sdk2.inquiry.nfc.a> getReplayCache() {
        return this.f95029a.getReplayCache();
    }
}
