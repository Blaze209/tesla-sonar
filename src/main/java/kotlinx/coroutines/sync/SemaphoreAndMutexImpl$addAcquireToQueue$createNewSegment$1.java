package kotlinx.coroutines.sync;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* synthetic */ class SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 extends p implements wn0.p<Long, SemaphoreSegment, SemaphoreSegment> {
    public static final SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 INSTANCE = new SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1();

    SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1() {
        super(2, SemaphoreKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // wn0.p
    public /* bridge */ /* synthetic */ SemaphoreSegment invoke(Long l11, SemaphoreSegment semaphoreSegment) {
        return invoke(l11.longValue(), semaphoreSegment);
    }

    public final SemaphoreSegment invoke(long j11, SemaphoreSegment semaphoreSegment) {
        return SemaphoreKt.createSegment(j11, semaphoreSegment);
    }
}
