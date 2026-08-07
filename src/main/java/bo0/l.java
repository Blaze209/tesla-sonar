package bo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;
import p013kotlin.collections.t0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Lbo0/l;", "Lkotlin/collections/t0;", "", "first", "last", "step", "<init>", "(JJJ)V", "", "hasNext", "()Z", "nextLong", "()J", "a", "J", "getStep", "b", "finalElement", "c", "Z", DateTokenConverter.CONVERTER_KEY, "next", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long step;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long finalElement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long next;

    public l(long j11, long j12, long j13) {
        this.step = j13;
        this.finalElement = j12;
        boolean z11 = false;
        if (j13 <= 0 ? j11 >= j12 : j11 <= j12) {
            z11 = true;
        }
        this.hasNext = z11;
        this.next = z11 ? j11 : j12;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // p013kotlin.collections.t0
    public long nextLong() {
        long j11 = this.next;
        if (j11 != this.finalElement) {
            this.next = this.step + j11;
            return j11;
        }
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        this.hasNext = false;
        return j11;
    }
}
