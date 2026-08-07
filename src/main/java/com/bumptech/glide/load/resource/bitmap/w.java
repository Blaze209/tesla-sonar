package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
interface w {

    public static final class a implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f20846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f20847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final gj.b f20848c;

        a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, gj.b bVar) {
            this.f20846a = byteBuffer;
            this.f20847b = list;
            this.f20848c = bVar;
        }

        private InputStream e() {
            return xj.a.g(xj.a.d(this.f20846a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.w
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.w
        public int b() {
            return com.bumptech.glide.load.a.c(this.f20847b, xj.a.d(this.f20846a), this.f20848c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.w
        public Bitmap c(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.w
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.g(this.f20847b, xj.a.d(this.f20846a));
        }
    }

    public static final class b implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f20849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final gj.b f20850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<ImageHeaderParser> f20851c;

        b(InputStream inputStream, List<ImageHeaderParser> list, gj.b bVar) {
            this.f20850b = (gj.b) xj.k.d(bVar);
            this.f20851c = (List) xj.k.d(list);
            this.f20849a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.w
        public void a() {
            this.f20849a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.w
        public int b() {
            return com.bumptech.glide.load.a.b(this.f20851c, this.f20849a.a(), this.f20850b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.w
        public Bitmap c(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f20849a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.w
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.f(this.f20851c, this.f20849a.a(), this.f20850b);
        }
    }

    public static final class c implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final gj.b f20852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f20853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f20854c;

        c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, gj.b bVar) {
            this.f20852a = (gj.b) xj.k.d(bVar);
            this.f20853b = (List) xj.k.d(list);
            this.f20854c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.w
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.w
        public int b() {
            return com.bumptech.glide.load.a.a(this.f20853b, this.f20854c, this.f20852a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.w
        public Bitmap c(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f20854c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.w
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.e(this.f20853b, this.f20854c, this.f20852a);
        }
    }

    void a();

    int b();

    Bitmap c(BitmapFactory.Options options);

    ImageHeaderParser.ImageType d();
}
