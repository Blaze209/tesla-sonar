package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import pk.k;
import xm.a0;
import xm.q;
import xm.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends BasePool<q> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f21716k;

    e(sk.d dVar, z zVar, a0 a0Var) {
        super(dVar, zVar, a0Var);
        SparseIntArray sparseIntArray = (SparseIntArray) k.g(zVar.f123790c);
        this.f21716k = new int[sparseIntArray.size()];
        int i11 = 0;
        while (true) {
            int[] iArr = this.f21716k;
            if (i11 >= iArr.length) {
                t();
                return;
            } else {
                iArr[i11] = sparseIntArray.keyAt(i11);
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public abstract q h(int i11);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void l(q qVar) {
        k.g(qVar);
        qVar.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public int p(q qVar) {
        k.g(qVar);
        return qVar.getSize();
    }

    int E() {
        return this.f21716k[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public boolean v(q qVar) {
        k.g(qVar);
        return !qVar.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int o(int i11) {
        if (i11 <= 0) {
            throw new BasePool.InvalidSizeException(Integer.valueOf(i11));
        }
        for (int i12 : this.f21716k) {
            if (i12 >= i11) {
                return i12;
            }
        }
        return i11;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int q(int i11) {
        return i11;
    }
}
