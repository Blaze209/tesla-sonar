package rc;

import kotlinx.coroutines.Deferred;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lrc/m;", "Lrc/d;", "Lkotlinx/coroutines/Deferred;", "Lrc/j;", "job", "<init>", "(Lkotlinx/coroutines/Deferred;)V", "a", "Lkotlinx/coroutines/Deferred;", "getJob", "()Lkotlinx/coroutines/Deferred;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Deferred<j> job;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Deferred<? extends j> deferred) {
        this.job = deferred;
    }
}
