package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import pk.k;
import xm.a0;
import xm.z;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(21)
public class b extends BasePool<Bitmap> implements xm.d {
    public b(sk.d dVar, z zVar, a0 a0Var, boolean z11) {
        super(dVar, zVar, a0Var, z11);
        t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Bitmap h(int i11) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i11) / 2.0d), Bitmap.Config.RGB_565);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void l(Bitmap bitmap) {
        k.g(bitmap);
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public int p(Bitmap bitmap) {
        k.g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Bitmap r(a<Bitmap> aVar) {
        Bitmap bitmap = (Bitmap) super.r(aVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public boolean v(Bitmap bitmap) {
        k.g(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int o(int i11) {
        return i11;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int q(int i11) {
        return i11;
    }
}
