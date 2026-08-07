package pj;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import xj.l;

/* JADX INFO: loaded from: classes3.dex */
public class a implements dj.j<ByteBuffer, c> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C2188a f103074f = new C2188a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f103075g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f103076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ImageHeaderParser> f103077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f103078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2188a f103079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pj.b f103080e;

    /* JADX INFO: renamed from: pj.a$a, reason: collision with other inner class name */
    static class C2188a {
        C2188a() {
        }

        bj.a a(bj.a.InterfaceC0349a interfaceC0349a, bj.c cVar, ByteBuffer byteBuffer, int i11) {
            return new bj.e(interfaceC0349a, cVar, byteBuffer, i11);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue<bj.d> f103081a = l.g(0);

        b() {
        }

        synchronized bj.d a(ByteBuffer byteBuffer) {
            bj.d dVarPoll;
            try {
                dVarPoll = this.f103081a.poll();
                if (dVarPoll == null) {
                    dVarPoll = new bj.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return dVarPoll.p(byteBuffer);
        }

        synchronized void b(bj.d dVar) {
            dVar.a();
            this.f103081a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, gj.d dVar, gj.b bVar) {
        this(context, list, dVar, bVar, f103075g, f103074f);
    }

    private e c(ByteBuffer byteBuffer, int i11, int i12, bj.d dVar, dj.h hVar) {
        StringBuilder sb2;
        long jB = xj.g.b();
        try {
            bj.c cVarC = dVar.c();
            if (cVarC.b() > 0 && cVarC.c() == 0) {
                Bitmap.Config config = hVar.c(i.f103121a) == dj.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                bj.a aVarA = this.f103079d.a(this.f103080e, cVarC, byteBuffer, e(cVarC, i11, i12));
                aVarA.c(config);
                aVarA.f();
                Bitmap nextFrame = aVarA.getNextFrame();
                if (nextFrame == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb2 = new StringBuilder();
                    }
                    return null;
                }
                e eVar = new e(new c(this.f103076a, aVarA, lj.c.c(), i11, i12, nextFrame));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + xj.g.a(jB));
                }
                return eVar;
            }
            if (!Log.isLoggable("BufferGifDecoder", 2)) {
                return null;
            }
            sb2 = new StringBuilder();
            sb2.append("Decoded GIF from stream in ");
            sb2.append(xj.g.a(jB));
            Log.v("BufferGifDecoder", sb2.toString());
            return null;
        } catch (Throwable th2) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + xj.g.a(jB));
            }
            throw th2;
        }
    }

    private static int e(bj.c cVar, int i11, int i12) {
        int iMin = Math.min(cVar.a() / i12, cVar.d() / i11);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i11 + "x" + i12 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return iMax;
    }

    @Override // dj.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e a(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull dj.h hVar) {
        bj.d dVarA = this.f103078c.a(byteBuffer);
        try {
            return c(byteBuffer, i11, i12, dVarA, hVar);
        } finally {
            this.f103078c.b(dVarA);
        }
    }

    @Override // dj.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull ByteBuffer byteBuffer, @NonNull dj.h hVar) {
        return !((Boolean) hVar.c(i.f103122b)).booleanValue() && com.bumptech.glide.load.a.g(this.f103077b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    a(Context context, List<ImageHeaderParser> list, gj.d dVar, gj.b bVar, b bVar2, C2188a c2188a) {
        this.f103076a = context.getApplicationContext();
        this.f103077b = list;
        this.f103079d = c2188a;
        this.f103080e = new pj.b(dVar, bVar);
        this.f103078c = bVar2;
    }
}
