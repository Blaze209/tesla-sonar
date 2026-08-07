package androidx.room;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.locks.ReentrantLock;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0017\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/room/r;", "", "", "size", "<init>", "(I)V", "", "Landroidx/room/r$a;", "b", "()[Landroidx/room/r$a;", "", "tableIds", "", "c", "([I)Z", DateTokenConverter.CONVERTER_KEY, "Ljn0/h0;", "e", "()V", "a", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "[J", "tableObserversCount", "", "[Z", "tableObservedState", "Z", "needsSync", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock lock = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long[] tableObserversCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean[] tableObservedState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean needsSync;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/r$a;", "", "<init>", "(Ljava/lang/String;I)V", "NO_OP", "ADD", "REMOVE", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        NO_OP,
        ADD,
        REMOVE;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    public r(int i11) {
        this.tableObserversCount = new long[i11];
        this.tableObservedState = new boolean[i11];
    }

    public final void a() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.needsSync = true;
            jn0.h0 h0Var = jn0.h0.f84049a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final a[] b() {
        a aVar;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.needsSync) {
                return null;
            }
            this.needsSync = false;
            int length = this.tableObserversCount.length;
            a[] aVarArr = new a[length];
            int i11 = 0;
            boolean z11 = false;
            while (i11 < length) {
                boolean z12 = true;
                boolean z13 = this.tableObserversCount[i11] > 0;
                boolean[] zArr = this.tableObservedState;
                if (z13 != zArr[i11]) {
                    zArr[i11] = z13;
                    aVar = z13 ? a.ADD : a.REMOVE;
                } else {
                    z12 = z11;
                    aVar = a.NO_OP;
                }
                aVarArr[i11] = aVar;
                i11++;
                z11 = z12;
            }
            return z11 ? aVarArr : null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean c(int[] tableIds) {
        p013kotlin.jvm.internal.s.k(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean z11 = false;
            for (int i11 : tableIds) {
                long[] jArr = this.tableObserversCount;
                long j11 = jArr[i11];
                jArr[i11] = 1 + j11;
                if (j11 == 0) {
                    z11 = true;
                    this.needsSync = true;
                }
            }
            reentrantLock.unlock();
            return z11;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean d(int[] tableIds) {
        p013kotlin.jvm.internal.s.k(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean z11 = false;
            for (int i11 : tableIds) {
                long[] jArr = this.tableObserversCount;
                long j11 = jArr[i11];
                jArr[i11] = j11 - 1;
                if (j11 == 1) {
                    z11 = true;
                    this.needsSync = true;
                }
            }
            reentrantLock.unlock();
            return z11;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void e() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            p013kotlin.collections.n.E(this.tableObservedState, false, 0, 0, 6, null);
            this.needsSync = true;
            jn0.h0 h0Var = jn0.h0.f84049a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
