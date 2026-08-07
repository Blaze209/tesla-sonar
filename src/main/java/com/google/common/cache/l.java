package com.google.common.cache;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
final class l extends q implements Serializable, j {
    @Override // com.google.common.cache.j
    public void a() {
        add(1L);
    }

    @Override // com.google.common.cache.j
    public void add(long j11) {
        int length;
        q.b bVar;
        q.b[] bVarArr = this.f43498a;
        if (bVarArr == null) {
            long j12 = this.f43499b;
            if (c(j12, j12 + j11)) {
                return;
            }
        }
        int[] iArr = q.f43492d.get();
        boolean zA = true;
        if (iArr != null && bVarArr != null && (length = bVarArr.length) >= 1 && (bVar = bVarArr[(length - 1) & iArr[0]]) != null) {
            long j13 = bVar.f43503a;
            zA = bVar.a(j13, j13 + j11);
            if (zA) {
                return;
            }
        }
        g(j11, iArr, zA);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return h();
    }

    @Override // com.google.common.cache.q
    final long e(long j11, long j12) {
        return j11 + j12;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return h();
    }

    public long h() {
        long j11 = this.f43499b;
        q.b[] bVarArr = this.f43498a;
        if (bVarArr != null) {
            for (q.b bVar : bVarArr) {
                if (bVar != null) {
                    j11 += bVar.f43503a;
                }
            }
        }
        return j11;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) h();
    }

    @Override // java.lang.Number
    public long longValue() {
        return h();
    }

    public String toString() {
        return Long.toString(h());
    }
}
