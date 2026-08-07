package kotlinx.coroutines.debug.internal;

import java.util.Comparator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t11, T t12) {
        return mn0.a.d(Long.valueOf(((DebugProbesImpl.CoroutineOwner) t11).info.sequenceNumber), Long.valueOf(((DebugProbesImpl.CoroutineOwner) t12).info.sequenceNumber));
    }
}
