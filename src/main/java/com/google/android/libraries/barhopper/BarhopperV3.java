package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer;
import hy.a;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class BarhopperV3 implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f41404b = "BarhopperV3";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f41405a;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j11);

    private native long createNative();

    private native long createNativeWithClientOptions(byte[] bArr);

    private native byte[] recognizeBitmapNative(long j11, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j11, int i11, int i12, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j11, int i11, int i12, byte[] bArr, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedBufferNative(long j11, int i11, int i12, int i13, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedNative(long j11, int i11, int i12, int i13, byte[] bArr, RecognitionOptions recognitionOptions);

    private static a t(byte[] bArr) {
        bArr.getClass();
        try {
            return a.b(bArr, zzds.zza());
        } catch (zzer e11) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e11);
        }
    }

    public void c(@NonNull nu.a aVar) {
        if (this.f41405a != 0) {
            Log.w(f41404b, "Native pointer already exists.");
            return;
        }
        long jCreateNativeWithClientOptions = createNativeWithClientOptions(aVar.zzD());
        this.f41405a = jCreateNativeWithClientOptions;
        if (jCreateNativeWithClientOptions == 0) {
            throw new IllegalArgumentException("Failed to create native pointer with client options.");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j11 = this.f41405a;
        if (j11 != 0) {
            closeNative(j11);
            this.f41405a = 0L;
        }
    }

    @NonNull
    public a n(int i11, int i12, @NonNull ByteBuffer byteBuffer, @NonNull RecognitionOptions recognitionOptions) {
        long j11 = this.f41405a;
        if (j11 != 0) {
            return t(recognizeBufferNative(j11, i11, i12, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    @NonNull
    public a o(int i11, int i12, @NonNull byte[] bArr, @NonNull RecognitionOptions recognitionOptions) {
        long j11 = this.f41405a;
        if (j11 != 0) {
            return t(recognizeNative(j11, i11, i12, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    @NonNull
    public a p(@NonNull Bitmap bitmap, @NonNull RecognitionOptions recognitionOptions) {
        if (this.f41405a == 0) {
            throw new IllegalStateException("Native pointer does not exist.");
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            Log.d(f41404b, "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
            bitmap = bitmap.copy(config2, bitmap.isMutable());
        }
        return t(recognizeBitmapNative(this.f41405a, bitmap, recognitionOptions));
    }
}
