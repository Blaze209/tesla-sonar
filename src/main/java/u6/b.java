package u6;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.atomic.AtomicInteger;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0007R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lu6/b;", "", "", "initialValue", "<init>", "(I)V", "c", "()I", "a", "b", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "delegate", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger delegate;

    public b(int i11) {
        this.delegate = new AtomicInteger(i11);
    }

    public final int a() {
        return this.delegate.decrementAndGet();
    }

    public final int b() {
        return this.delegate.get();
    }

    public final int c() {
        return this.delegate.getAndIncrement();
    }

    public final int d() {
        return this.delegate.incrementAndGet();
    }
}
