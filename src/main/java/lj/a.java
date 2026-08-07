package lj;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.load.resource.bitmap.v;
import dj.g;
import dj.h;
import dj.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f90039a = v.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f90040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f90041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dj.b f90042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m f90043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f90044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f90045g;

    /* JADX INFO: renamed from: lj.a$a, reason: collision with other inner class name */
    class C1905a implements ImageDecoder$OnPartialImageListener {
        C1905a() {
        }

        public boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(int i11, int i12, @NonNull h hVar) {
        this.f90040b = i11;
        this.f90041c = i12;
        this.f90042d = (dj.b) hVar.c(q.f20820f);
        this.f90043e = (m) hVar.c(m.f20818h);
        g<Boolean> gVar = q.f20824j;
        this.f90044f = hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue();
        this.f90045g = (i) hVar.c(q.f20821g);
    }

    public void onHeaderDecoded(@NonNull ImageDecoder imageDecoder, @NonNull ImageDecoder.ImageInfo imageInfo, @NonNull ImageDecoder.Source source) {
        if (this.f90039a.f(this.f90040b, this.f90041c, this.f90044f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f90042d == dj.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C1905a());
        Size size = imageInfo.getSize();
        int width = this.f90040b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f90041c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f90043e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        i iVar = this.f90045g;
        if (iVar != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((iVar == i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i11 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
