package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public class p0 implements z0<tk.a<um.e>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f21914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f21915b;

    class a extends i1<tk.a<um.e>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c1 f21916f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a1 f21917g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.request.a f21918h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n nVar, c1 c1Var, a1 a1Var, String str, c1 c1Var2, a1 a1Var2, com.facebook.imagepipeline.request.a aVar) {
            super(nVar, c1Var, a1Var, str);
            this.f21916f = c1Var2;
            this.f21917g = a1Var2;
            this.f21918h = aVar;
        }

        @Override // com.facebook.imagepipeline.producers.i1, nk.h
        protected void e(Exception exc) {
            super.e(exc);
            this.f21916f.a(this.f21917g, "VideoThumbnailProducer", false);
            this.f21917g.I(ImagesContract.LOCAL, MediaStreamTrack.VIDEO_TRACK_KIND);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // nk.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(tk.a<um.e> aVar) {
            tk.a.C(aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.i1
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<String, String> i(tk.a<um.e> aVar) {
            return pk.g.of("createdThumbnail", String.valueOf(aVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // nk.h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public tk.a<um.e> c() throws Throwable {
            String strI;
            try {
                strI = p0.this.i(this.f21918h);
            } catch (IllegalArgumentException unused) {
                strI = null;
            }
            Bitmap bitmapCreateVideoThumbnail = strI != null ? ThumbnailUtils.createVideoThumbnail(strI, p0.g(this.f21918h)) : null;
            if (bitmapCreateVideoThumbnail == null) {
                bitmapCreateVideoThumbnail = p0.h(p0.this.f21915b, this.f21918h.v());
            }
            if (bitmapCreateVideoThumbnail == null) {
                return null;
            }
            um.f fVarS = um.f.S(bitmapCreateVideoThumbnail, mm.f.b(), um.o.f116468d, 0);
            this.f21917g.o("image_format", "thumbnail");
            fVarS.C(this.f21917g.getExtras());
            return tk.a.c0(fVarS);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.i1, nk.h
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void f(tk.a<um.e> aVar) {
            super.f(aVar);
            this.f21916f.a(this.f21917g, "VideoThumbnailProducer", aVar != null);
            this.f21917g.I(ImagesContract.LOCAL, MediaStreamTrack.VIDEO_TRACK_KIND);
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1 f21920a;

        b(i1 i1Var) {
            this.f21920a = i1Var;
        }

        @Override // com.facebook.imagepipeline.producers.b1
        public void b() {
            this.f21920a.a();
        }
    }

    public p0(Executor executor, ContentResolver contentResolver) {
        this.f21914a = executor;
        this.f21915b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(com.facebook.imagepipeline.request.a aVar) {
        return (aVar.n() > 96 || aVar.m() > 96) ? 1 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap h(ContentResolver contentResolver, Uri uri) throws Throwable {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            pk.k.g(parcelFileDescriptorOpenFileDescriptor);
            mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
                return frameAtTime;
            } catch (FileNotFoundException unused2) {
                if (mediaMetadataRetriever != null) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                if (mediaMetadataRetriever2 != null) {
                    try {
                        mediaMetadataRetriever2.release();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            mediaMetadataRetriever = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String i(com.facebook.imagepipeline.request.a aVar) {
        return xk.e.e(this.f21915b, aVar.v());
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<tk.a<um.e>> nVar, a1 a1Var) {
        c1 c1VarP = a1Var.p();
        com.facebook.imagepipeline.request.a aVarB = a1Var.B();
        a1Var.I(ImagesContract.LOCAL, MediaStreamTrack.VIDEO_TRACK_KIND);
        a aVar = new a(nVar, c1VarP, a1Var, "VideoThumbnailProducer", c1VarP, a1Var, aVarB);
        a1Var.H(new b(aVar));
        this.f21914a.execute(aVar);
    }
}
