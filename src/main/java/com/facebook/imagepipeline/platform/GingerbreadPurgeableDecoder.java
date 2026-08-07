package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import pk.d;
import pk.k;
import pk.p;
import sk.i;
import tk.a;
import yk.b;
import yk.c;

/* JADX INFO: loaded from: classes3.dex */
@d
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f21730d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f21731c = c.i();

    @d
    public GingerbreadPurgeableDecoder() {
    }

    private static MemoryFile h(a<PooledByteBuffer> aVar, int i11, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        vk.a aVar2;
        i iVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i11);
        memoryFile.allowPurging(false);
        try {
            i iVar2 = new i(aVar.H());
            try {
                aVar2 = new vk.a(iVar2, i11);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    pk.a.a(aVar2, outputStream2);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i11, bArr.length);
                    }
                    a.C(aVar);
                    pk.b.b(iVar2);
                    pk.b.b(aVar2);
                    pk.b.a(outputStream2, true);
                    return memoryFile;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = outputStream2;
                    iVar = iVar2;
                    a.C(aVar);
                    pk.b.b(iVar);
                    pk.b.b(aVar2);
                    pk.b.a(outputStream, true);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
                aVar2 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
            aVar2 = null;
        }
    }

    private Bitmap i(a<PooledByteBuffer> aVar, int i11, byte[] bArr, BitmapFactory.Options options) throws Throwable {
        MemoryFile memoryFile = null;
        try {
            try {
                MemoryFile memoryFileH = h(aVar, i11, bArr);
                try {
                    FileDescriptor fileDescriptorK = k(memoryFileH);
                    b bVar = this.f21731c;
                    if (bVar == null) {
                        throw new IllegalStateException("WebpBitmapFactory is null");
                    }
                    Bitmap bitmap = (Bitmap) k.h(bVar.b(fileDescriptorK, null, options), "BitmapFactory returned null");
                    if (memoryFileH != null) {
                        memoryFileH.close();
                    }
                    return bitmap;
                } catch (IOException e11) {
                    e = e11;
                    memoryFile = memoryFileH;
                    throw p.a(e);
                } catch (Throwable th2) {
                    th = th2;
                    memoryFile = memoryFileH;
                    if (memoryFile != null) {
                        memoryFile.close();
                    }
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private synchronized Method j() {
        if (f21730d == null) {
            try {
                f21730d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
            } catch (Exception e11) {
                throw p.a(e11);
            }
        }
        return f21730d;
    }

    private FileDescriptor k(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) k.g(j().invoke(memoryFile, null));
        } catch (Exception e11) {
            throw p.a(e11);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(a<PooledByteBuffer> aVar, BitmapFactory.Options options) {
        return i(aVar, aVar.H().size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(a<PooledByteBuffer> aVar, int i11, BitmapFactory.Options options) {
        return i(aVar, i11, DalvikPurgeableDecoder.e(aVar, i11) ? null : DalvikPurgeableDecoder.f21719b, options);
    }
}
