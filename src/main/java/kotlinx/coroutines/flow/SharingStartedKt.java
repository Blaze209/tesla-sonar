package kotlinx.coroutines.flow;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/flow/SharingStarted$Companion;", "Lio0/b;", "stopTimeout", "replayExpiration", "Lkotlinx/coroutines/flow/SharingStarted;", "WhileSubscribed-5qebJ5I", "(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJ)Lkotlinx/coroutines/flow/SharingStarted;", "WhileSubscribed", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SharingStartedKt {
    /* JADX INFO: renamed from: WhileSubscribed-5qebJ5I, reason: not valid java name */
    public static final SharingStarted m561WhileSubscribed5qebJ5I(SharingStarted.Companion companion, long j11, long j12) {
        return new StartedWhileSubscribed(io0.b.p(j11), io0.b.p(j12));
    }

    /* JADX INFO: renamed from: WhileSubscribed-5qebJ5I$default, reason: not valid java name */
    public static /* synthetic */ SharingStarted m562WhileSubscribed5qebJ5I$default(SharingStarted.Companion companion, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = io0.b.INSTANCE.c();
        }
        if ((i11 & 2) != 0) {
            j12 = io0.b.INSTANCE.a();
        }
        return m561WhileSubscribed5qebJ5I(companion, j11, j12);
    }
}
