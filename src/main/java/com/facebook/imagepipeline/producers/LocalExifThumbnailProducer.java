package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import com.facebook.common.memory.PooledByteBuffer;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class LocalExifThumbnailProducer implements q1<um.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f21734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sk.h f21735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f21736c;

    @com.facebook.soloader.g
    private class Api24Utils {
        ExifInterface a(FileDescriptor fileDescriptor) {
            return new ExifInterface(fileDescriptor);
        }

        private Api24Utils() {
        }
    }

    class a extends i1<um.k> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.request.a f21738f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n nVar, c1 c1Var, a1 a1Var, String str, com.facebook.imagepipeline.request.a aVar) {
            super(nVar, c1Var, a1Var, str);
            this.f21738f = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // nk.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(um.k kVar) {
            um.k.o(kVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.i1
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<String, String> i(um.k kVar) {
            return pk.g.of("createdThumbnail", Boolean.toString(kVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // nk.h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public um.k c() {
            ExifInterface exifInterfaceG = LocalExifThumbnailProducer.this.g(this.f21738f.v());
            if (exifInterfaceG == null || !exifInterfaceG.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.e(LocalExifThumbnailProducer.this.f21735b.c((byte[]) pk.k.g(exifInterfaceG.getThumbnail())), exifInterfaceG);
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1 f21740a;

        b(i1 i1Var) {
            this.f21740a = i1Var;
        }

        @Override // com.facebook.imagepipeline.producers.b1
        public void b() {
            this.f21740a.a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, sk.h hVar, ContentResolver contentResolver) {
        this.f21734a = executor;
        this.f21735b = hVar;
        this.f21736c = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public um.k e(PooledByteBuffer pooledByteBuffer, ExifInterface exifInterface) {
        Pair<Integer, Integer> pairD = fn.c.d(new sk.i(pooledByteBuffer));
        int iH = h(exifInterface);
        int iIntValue = pairD != null ? ((Integer) pairD.first).intValue() : -1;
        int iIntValue2 = pairD != null ? ((Integer) pairD.second).intValue() : -1;
        tk.a aVarC0 = tk.a.c0(pooledByteBuffer);
        try {
            um.k kVar = new um.k((tk.a<PooledByteBuffer>) aVarC0);
            tk.a.C(aVarC0);
            kVar.K0(gm.b.JPEG);
            kVar.O0(iH);
            kVar.U0(iIntValue);
            kVar.J0(iIntValue2);
            return kVar;
        } catch (Throwable th2) {
            tk.a.C(aVarC0);
            throw th2;
        }
    }

    private int h(ExifInterface exifInterface) {
        return fn.f.a(Integer.parseInt((String) pk.k.g(exifInterface.getAttribute("Orientation"))));
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<um.k> nVar, a1 a1Var) {
        c1 c1VarP = a1Var.p();
        com.facebook.imagepipeline.request.a aVarB = a1Var.B();
        a1Var.I(ImagesContract.LOCAL, "exif");
        a aVar = new a(nVar, c1VarP, a1Var, "LocalExifThumbnailProducer", aVarB);
        a1Var.H(new b(aVar));
        this.f21734a.execute(aVar);
    }

    @Override // com.facebook.imagepipeline.producers.q1
    public boolean b(om.f fVar) {
        return r1.b(512, 512, fVar);
    }

    boolean f(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    ExifInterface g(Uri uri) {
        String strE = xk.e.e(this.f21736c, uri);
        if (strE == null) {
            return null;
        }
        try {
            if (f(strE)) {
                return new ExifInterface(strE);
            }
            AssetFileDescriptor assetFileDescriptorA = xk.e.a(this.f21736c, uri);
            if (assetFileDescriptorA != null) {
                ExifInterface exifInterfaceA = new Api24Utils().a(assetFileDescriptorA.getFileDescriptor());
                assetFileDescriptorA.close();
                return exifInterfaceA;
            }
            return null;
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            qk.a.i(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
    }
}
