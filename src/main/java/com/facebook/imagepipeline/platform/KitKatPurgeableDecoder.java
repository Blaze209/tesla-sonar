package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.memory.c;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import pk.d;
import pk.k;
import tk.a;

/* JADX INFO: loaded from: classes3.dex */
@d
@TargetApi(19)
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f21732c;

    @d
    public KitKatPurgeableDecoder(c cVar) {
        this.f21732c = cVar;
    }

    private static void h(byte[] bArr, int i11) {
        bArr[i11] = -1;
        bArr[i11 + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(a<PooledByteBuffer> aVar, BitmapFactory.Options options) {
        PooledByteBuffer pooledByteBufferH = aVar.H();
        int size = pooledByteBufferH.size();
        a<byte[]> aVarA = this.f21732c.a(size);
        try {
            byte[] bArrH = aVarA.H();
            pooledByteBufferH.M(0, bArrH, 0, size);
            return (Bitmap) k.h(BitmapFactory.decodeByteArray(bArrH, 0, size, options), "BitmapFactory returned null");
        } finally {
            a.C(aVarA);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(a<PooledByteBuffer> aVar, int i11, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.e(aVar, i11) ? null : DalvikPurgeableDecoder.f21719b;
        PooledByteBuffer pooledByteBufferH = aVar.H();
        k.b(Boolean.valueOf(i11 <= pooledByteBufferH.size()));
        int i12 = i11 + 2;
        a<byte[]> aVarA = this.f21732c.a(i12);
        try {
            byte[] bArrH = aVarA.H();
            pooledByteBufferH.M(0, bArrH, 0, i11);
            if (bArr != null) {
                h(bArrH, i11);
                i11 = i12;
            }
            return (Bitmap) k.h(BitmapFactory.decodeByteArray(bArrH, 0, i11, options), "BitmapFactory returned null");
        } finally {
            a.C(aVarA);
        }
    }
}
