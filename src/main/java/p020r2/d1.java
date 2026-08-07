package p020r2;

import androidx.compose.runtime.internal.PlatformOptimizedCancellationException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr2/d1;", "Landroidx/compose/runtime/internal/PlatformOptimizedCancellationException;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class d1 extends PlatformOptimizedCancellationException {
    public d1() {
        super("The coroutine scope left the composition");
    }
}
