package io.ktor.utils.io.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\r\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0011J\r\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u001cJ\r\u0010 \u001a\u00020\u0013¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$¨\u0006%"}, d2 = {"Lio/ktor/utils/io/internal/i;", "", "", "totalCapacity", "<init>", "(I)V", "remaining", "update", "n", "", "b", "(III)Ljava/lang/Void;", "pending", DateTokenConverter.CONVERTER_KEY, "(II)Ljava/lang/Void;", "Ljn0/h0;", "j", "()V", IntegerTokenConverter.CONVERTER_KEY, "", "m", "(I)Z", "l", "(I)I", "o", "a", "c", "e", "()Z", "k", "f", "g", "h", "", "toString", "()Ljava/lang/String;", "I", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f78768b = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availableForRead$internal");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f78769c = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availableForWrite$internal");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ AtomicIntegerFieldUpdater f78770d = AtomicIntegerFieldUpdater.newUpdater(i.class, "_pendingToFlush");
    public volatile /* synthetic */ int _availableForWrite$internal;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int totalCapacity;
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    volatile /* synthetic */ int _pendingToFlush = 0;

    public i(int i11) {
        this.totalCapacity = i11;
        this._availableForWrite$internal = i11;
    }

    private final Void b(int remaining, int update, int n11) {
        throw new IllegalArgumentException("Completed read overflow: " + remaining + " + " + n11 + " = " + update + " > " + this.totalCapacity);
    }

    private final Void d(int pending, int n11) {
        throw new IllegalArgumentException("Complete write overflow: " + pending + " + " + n11 + " > " + this.totalCapacity);
    }

    public final void a(int n11) {
        int i11;
        int i12;
        do {
            i11 = this._availableForWrite$internal;
            i12 = i11 + n11;
            if (i12 > this.totalCapacity) {
                b(i11, i12, n11);
                throw new KotlinNothingValueException();
            }
        } while (!f78769c.compareAndSet(this, i11, i12));
    }

    public final void c(int n11) {
        int i11;
        int i12;
        do {
            i11 = this._pendingToFlush;
            i12 = i11 + n11;
            if (i12 > this.totalCapacity) {
                d(i11, n11);
                throw new KotlinNothingValueException();
            }
        } while (!f78770d.compareAndSet(this, i11, i12));
    }

    public final boolean e() {
        int andSet = f78770d.getAndSet(this, 0);
        if (andSet == 0) {
            return this._availableForRead$internal > 0;
        }
        return f78768b.addAndGet(this, andSet) > 0;
    }

    public final void f() {
        f78769c.getAndSet(this, 0);
    }

    public final boolean g() {
        return this._availableForWrite$internal == this.totalCapacity;
    }

    public final boolean h() {
        return this._availableForWrite$internal == 0;
    }

    public final void i() {
        this._availableForRead$internal = this.totalCapacity;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    public final void j() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.totalCapacity;
    }

    public final boolean k() {
        int i11;
        do {
            i11 = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i11 != this.totalCapacity) {
                return false;
            }
        } while (!f78769c.compareAndSet(this, i11, 0));
        return true;
    }

    public final int l(int n11) {
        int i11;
        int iMin;
        do {
            i11 = this._availableForRead$internal;
            iMin = Math.min(n11, i11);
            if (iMin == 0) {
                return 0;
            }
        } while (!f78768b.compareAndSet(this, i11, i11 - iMin));
        return Math.min(n11, i11);
    }

    public final boolean m(int n11) {
        int i11;
        do {
            i11 = this._availableForRead$internal;
            if (i11 < n11) {
                return false;
            }
        } while (!f78768b.compareAndSet(this, i11, i11 - n11));
        return true;
    }

    public final int n(int n11) {
        int i11;
        do {
            i11 = this._availableForWrite$internal;
            if (i11 < n11) {
                return 0;
            }
        } while (!f78769c.compareAndSet(this, i11, 0));
        return i11;
    }

    public final int o(int n11) {
        int i11;
        int iMin;
        do {
            i11 = this._availableForWrite$internal;
            iMin = Math.min(n11, i11);
            if (iMin == 0) {
                return 0;
            }
        } while (!f78769c.compareAndSet(this, i11, i11 - iMin));
        return Math.min(n11, i11);
    }

    public String toString() {
        return "RingBufferCapacity[read: " + this._availableForRead$internal + ", write: " + this._availableForWrite$internal + ", flush: " + this._pendingToFlush + ", capacity: " + this.totalCapacity + ']';
    }
}
