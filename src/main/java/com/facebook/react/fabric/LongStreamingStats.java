package com.facebook.react.fabric;

import java.util.PriorityQueue;
import java.util.Queue;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR$\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/fabric/LongStreamingStats;", "", "<init>", "()V", "", "n", "Ljn0/h0;", "add", "(J)V", "Ljava/util/Queue;", "minHeap", "Ljava/util/Queue;", "maxHeap", "", "value", "average", "D", "getAverage", "()D", "", "len", "I", "max", "J", "getMax", "()J", "getMedian", "median", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LongStreamingStats {
    private double average;
    private int len;
    private long max;
    private final Queue<Long> minHeap = new PriorityQueue(11);
    private final Queue<Long> maxHeap = new PriorityQueue(11, mn0.a.g());

    public final void add(long n11) {
        if (n11 != 0) {
            if (this.minHeap.size() == this.maxHeap.size()) {
                this.maxHeap.offer(Long.valueOf(n11));
                this.minHeap.offer(this.maxHeap.poll());
            } else {
                this.minHeap.offer(Long.valueOf(n11));
                this.maxHeap.offer(this.minHeap.poll());
            }
        }
        int i11 = this.len;
        int i12 = i11 + 1;
        this.len = i12;
        if (i12 == 1) {
            this.average = n11;
        } else {
            this.average = (this.average / ((double) (i12 / i11))) + (n11 / ((long) i12));
        }
        long j11 = this.max;
        if (n11 <= j11) {
            n11 = j11;
        }
        this.max = n11;
    }

    public final double getAverage() {
        return this.average;
    }

    public final long getMax() {
        return this.max;
    }

    public final double getMedian() {
        long jLongValue;
        Long lValueOf;
        if (this.minHeap.size() == 0 && this.maxHeap.size() == 0) {
            return 0.0d;
        }
        if (this.minHeap.size() > this.maxHeap.size()) {
            lValueOf = this.minHeap.peek();
        } else {
            Long lPeek = this.minHeap.peek();
            if (lPeek != null) {
                jLongValue = lPeek.longValue();
            } else {
                Long lPeek2 = this.maxHeap.peek();
                s.h(lPeek2);
                jLongValue = lPeek2.longValue();
            }
            lValueOf = Long.valueOf(jLongValue / ((long) 2));
        }
        return lValueOf.longValue();
    }
}
