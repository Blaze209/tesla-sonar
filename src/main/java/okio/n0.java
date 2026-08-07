package okio;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.atomic.AtomicReference;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lokio/n0;", "", "<init>", "()V", "Lokio/m0;", "c", "()Lokio/m0;", "segment", "Ljn0/h0;", "b", "(Lokio/m0;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "()Ljava/util/concurrent/atomic/AtomicReference;", "", "I", "getMAX_SIZE", "()I", "MAX_SIZE", "Lokio/m0;", "LOCK", DateTokenConverter.CONVERTER_KEY, "HASH_BUCKET_COUNT", "", "e", "[Ljava/util/concurrent/atomic/AtomicReference;", "hashBuckets", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f97981a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int MAX_SIZE = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final m0 LOCK = new m0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final int HASH_BUCKET_COUNT;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final AtomicReference<m0>[] hashBuckets;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        HASH_BUCKET_COUNT = iHighestOneBit;
        AtomicReference<m0>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i11 = 0; i11 < iHighestOneBit; i11++) {
            atomicReferenceArr[i11] = new AtomicReference<>();
        }
        hashBuckets = atomicReferenceArr;
    }

    private n0() {
    }

    private final AtomicReference<m0> a() {
        return hashBuckets[(int) (Thread.currentThread().getId() & (((long) HASH_BUCKET_COUNT) - 1))];
    }

    public static final void b(m0 segment) {
        AtomicReference<m0> atomicReferenceA;
        m0 m0Var;
        m0 andSet;
        p013kotlin.jvm.internal.s.k(segment, "segment");
        if (segment.next != null || segment.prev != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.shared || (andSet = (atomicReferenceA = f97981a.a()).getAndSet((m0Var = LOCK))) == m0Var) {
            return;
        }
        int i11 = andSet != null ? andSet.limit : 0;
        if (i11 >= MAX_SIZE) {
            atomicReferenceA.set(andSet);
            return;
        }
        segment.next = andSet;
        segment.pos = 0;
        segment.limit = i11 + PKIFailureInfo.certRevoked;
        atomicReferenceA.set(segment);
    }

    public static final m0 c() {
        AtomicReference<m0> atomicReferenceA = f97981a.a();
        m0 m0Var = LOCK;
        m0 andSet = atomicReferenceA.getAndSet(m0Var);
        if (andSet == m0Var) {
            return new m0();
        }
        if (andSet == null) {
            atomicReferenceA.set(null);
            return new m0();
        }
        atomicReferenceA.set(andSet.next);
        andSet.next = null;
        andSet.limit = 0;
        return andSet;
    }
}
