package nj;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import dj.j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import xj.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f95055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj.b f95056b;

    private static final class a implements fj.c<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AnimatedImageDrawable f95057a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f95057a = animatedImageDrawable;
        }

        @Override // fj.c
        @NonNull
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // fj.c
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f95057a;
        }

        @Override // fj.c
        public int getSize() {
            return this.f95057a.getIntrinsicWidth() * this.f95057a.getIntrinsicHeight() * l.j(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // fj.c
        public void recycle() {
            this.f95057a.stop();
            this.f95057a.clearAnimationCallbacks();
        }
    }

    private static final class b implements j<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f95058a;

        b(c cVar) {
            this.f95058a = cVar;
        }

        @Override // dj.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public fj.c<Drawable> a(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull dj.h hVar) {
            return this.f95058a.b(ImageDecoder.createSource(byteBuffer), i11, i12, hVar);
        }

        @Override // dj.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(@NonNull ByteBuffer byteBuffer, @NonNull dj.h hVar) {
            return this.f95058a.d(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: nj.c$c, reason: collision with other inner class name */
    private static final class C2025c implements j<InputStream, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f95059a;

        C2025c(c cVar) {
            this.f95059a = cVar;
        }

        @Override // dj.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public fj.c<Drawable> a(@NonNull InputStream inputStream, int i11, int i12, @NonNull dj.h hVar) {
            return this.f95059a.b(ImageDecoder.createSource(xj.a.b(inputStream)), i11, i12, hVar);
        }

        @Override // dj.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(@NonNull InputStream inputStream, @NonNull dj.h hVar) {
            return this.f95059a.c(inputStream);
        }
    }

    private c(List<ImageHeaderParser> list, gj.b bVar) {
        this.f95055a = list;
        this.f95056b = bVar;
    }

    public static j<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, gj.b bVar) {
        return new b(new c(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    public static j<InputStream, Drawable> f(List<ImageHeaderParser> list, gj.b bVar) {
        return new C2025c(new c(list, bVar));
    }

    fj.c<Drawable> b(@NonNull ImageDecoder.Source source, int i11, int i12, @NonNull dj.h hVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new lj.a(i11, i12, hVar));
        if (nj.a.a(drawableDecodeDrawable)) {
            return new a(nj.b.a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.a.f(this.f95055a, inputStream, this.f95056b));
    }

    boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.a.g(this.f95055a, byteBuffer));
    }
}
