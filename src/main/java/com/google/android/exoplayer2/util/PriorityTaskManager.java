package com.google.android.exoplayer2.util;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class PriorityTaskManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f41085a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f41086b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41087c = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
    }

    public void a(int i11) {
        synchronized (this.f41085a) {
            this.f41086b.add(Integer.valueOf(i11));
            this.f41087c = Math.max(this.f41087c, i11);
        }
    }

    public void b(int i11) {
        synchronized (this.f41085a) {
            this.f41086b.remove(Integer.valueOf(i11));
            this.f41087c = this.f41086b.isEmpty() ? Integer.MIN_VALUE : ((Integer) p0.j(this.f41086b.peek())).intValue();
            this.f41085a.notifyAll();
        }
    }
}
