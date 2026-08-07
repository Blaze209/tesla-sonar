package com.facebook.imagepipeline.nativecode;

import android.graphics.ColorSpace;
import cn.e;
import java.io.InputStream;
import java.io.OutputStream;
import om.f;
import om.g;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
@pk.d
public class NativeJpegTranscoder implements cn.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21723c;

    public NativeJpegTranscoder(boolean z11, int i11, boolean z12, boolean z13) {
        this.f21721a = z11;
        this.f21722b = i11;
        this.f21723c = z12;
        if (z13) {
            d.a();
        }
    }

    public static void e(InputStream inputStream, OutputStream outputStream, int i11, int i12, int i13) {
        d.a();
        k.b(Boolean.valueOf(i12 >= 1));
        k.b(Boolean.valueOf(i12 <= 16));
        k.b(Boolean.valueOf(i13 >= 0));
        k.b(Boolean.valueOf(i13 <= 100));
        k.b(Boolean.valueOf(e.j(i11)));
        k.c((i12 == 8 && i11 == 0) ? false : true, "no transformation requested");
        nativeTranscodeJpeg((InputStream) k.g(inputStream), (OutputStream) k.g(outputStream), i11, i12, i13);
    }

    public static void f(InputStream inputStream, OutputStream outputStream, int i11, int i12, int i13) {
        d.a();
        k.b(Boolean.valueOf(i12 >= 1));
        k.b(Boolean.valueOf(i12 <= 16));
        k.b(Boolean.valueOf(i13 >= 0));
        k.b(Boolean.valueOf(i13 <= 100));
        k.b(Boolean.valueOf(e.i(i11)));
        k.c((i12 == 8 && i11 == 1) ? false : true, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) k.g(inputStream), (OutputStream) k.g(outputStream), i11, i12, i13);
    }

    @pk.d
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i11, int i12, int i13);

    @pk.d
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i11, int i12, int i13);

    @Override // cn.c
    /* JADX INFO: renamed from: a */
    public String getIdentifier() {
        return "NativeJpegTranscoder";
    }

    @Override // cn.c
    public boolean b(gm.c cVar) {
        return cVar == gm.b.JPEG;
    }

    @Override // cn.c
    public cn.b c(um.k kVar, OutputStream outputStream, g gVar, f fVar, gm.c cVar, Integer num, ColorSpace colorSpace) {
        if (num == null) {
            num = 85;
        }
        if (gVar == null) {
            gVar = g.d();
        }
        int iB = cn.a.b(gVar, fVar, kVar, this.f21722b);
        try {
            int iF = e.f(gVar, fVar, kVar, this.f21721a);
            int iA = e.a(iB);
            if (this.f21723c) {
                iF = iA;
            }
            InputStream inputStreamJ = kVar.J();
            if (e.INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(kVar.L0()))) {
                f((InputStream) k.h(inputStreamJ, "Cannot transcode from null input stream!"), outputStream, e.d(gVar, kVar), iF, num.intValue());
            } else {
                e((InputStream) k.h(inputStreamJ, "Cannot transcode from null input stream!"), outputStream, e.e(gVar, kVar), iF, num.intValue());
            }
            pk.b.b(inputStreamJ);
            return new cn.b(iB != 1 ? 0 : 1);
        } catch (Throwable th2) {
            pk.b.b(null);
            throw th2;
        }
    }

    @Override // cn.c
    public boolean d(um.k kVar, g gVar, f fVar) {
        if (gVar == null) {
            gVar = g.d();
        }
        return e.f(gVar, fVar, kVar, this.f21721a) < 8;
    }
}
