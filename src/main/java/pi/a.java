package pi;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\b\u0010\u0006R\u001b\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpi/a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/flow/FlowCollector;", "owner", "<init>", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "Ljn0/h0;", "a", "Lkotlinx/coroutines/flow/FlowCollector;", "getOwner", "()Lkotlinx/coroutines/flow/FlowCollector;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
final class a extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FlowCollector<?> owner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FlowCollector<?> owner) {
        super("Flow was aborted, no more elements needed");
        s.k(owner, "owner");
        this.owner = owner;
    }

    public final void a(FlowCollector<?> owner) {
        s.k(owner, "owner");
        if (this.owner != owner) {
            throw this;
        }
    }
}
