package yh0;

import java.util.concurrent.atomic.AtomicInteger;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lyh0/e0;", "", "<init>", "()V", "Lyh0/d0;", "a", "()Lyh0/d0;", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "viewTypeGeneratorCount", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f125508a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static AtomicInteger viewTypeGeneratorCount = new AtomicInteger(0);

    private e0() {
    }

    public final d0 a() {
        return new d0((viewTypeGeneratorCount.getAndIncrement() * 4096) + 268435456);
    }
}
