package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import xm.a0;
import xm.z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0017\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/facebook/imagepipeline/memory/d;", "Lcom/facebook/imagepipeline/memory/BasePool;", "", "Lsk/a;", "Lsk/d;", "memoryTrimmableRegistry", "Lxm/z;", "poolParams", "Lxm/a0;", "poolStatsTracker", "<init>", "(Lsk/d;Lxm/z;Lxm/a0;)V", "", "bucketedSize", "B", "(I)[B", "value", "Ljn0/h0;", "C", "([B)V", "q", "(I)I", "requestSize", "o", "D", "([B)I", "", "k", "[I", "bucketSizes", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class d extends BasePool<byte[]> implements sk.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int[] bucketSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(sk.d memoryTrimmableRegistry, z poolParams, a0 poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        s.k(memoryTrimmableRegistry, "memoryTrimmableRegistry");
        s.k(poolParams, "poolParams");
        s.k(poolStatsTracker, "poolStatsTracker");
        SparseIntArray sparseIntArray = poolParams.f123790c;
        if (sparseIntArray != null) {
            this.bucketSizes = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.bucketSizes[i11] = sparseIntArray.keyAt(i11);
            }
        } else {
            this.bucketSizes = new int[0];
        }
        t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public byte[] h(int bucketedSize) {
        return new byte[bucketedSize];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void l(byte[] value) {
        s.k(value, "value");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public int p(byte[] value) {
        s.k(value, "value");
        return value.length;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int o(int requestSize) {
        if (requestSize <= 0) {
            throw new BasePool.InvalidSizeException(Integer.valueOf(requestSize));
        }
        for (int i11 : this.bucketSizes) {
            if (i11 >= requestSize) {
                return i11;
            }
        }
        return requestSize;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int q(int bucketedSize) {
        return bucketedSize;
    }
}
