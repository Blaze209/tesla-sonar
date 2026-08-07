package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.a0;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    class C0415a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f20511a;

        C0415a(InputStream inputStream) {
            this.f20511a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.f20511a);
            } finally {
                this.f20511a.reset();
            }
        }
    }

    class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f20512a;

        b(ByteBuffer byteBuffer) {
            this.f20512a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.c(this.f20512a);
            } finally {
                xj.a.d(this.f20512a);
            }
        }
    }

    class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f20513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ gj.b f20514b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, gj.b bVar) {
            this.f20513a = parcelFileDescriptorRewinder;
            this.f20514b = bVar;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            a0 a0Var = null;
            try {
                a0 a0Var2 = new a0(new FileInputStream(this.f20513a.a().getFileDescriptor()), this.f20514b);
                try {
                    ImageHeaderParser.ImageType imageTypeB = imageHeaderParser.b(a0Var2);
                    a0Var2.release();
                    this.f20513a.a();
                    return imageTypeB;
                } catch (Throwable th2) {
                    th = th2;
                    a0Var = a0Var2;
                    if (a0Var != null) {
                        a0Var.release();
                    }
                    this.f20513a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f20515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ gj.b f20516b;

        d(ByteBuffer byteBuffer, gj.b bVar) {
            this.f20515a = byteBuffer;
            this.f20516b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.f20515a, this.f20516b);
            } finally {
                xj.a.d(this.f20515a);
            }
        }
    }

    class e implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f20517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ gj.b f20518b;

        e(InputStream inputStream, gj.b bVar) {
            this.f20517a = inputStream;
            this.f20518b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f20517a, this.f20518b);
            } finally {
                this.f20517a.reset();
            }
        }
    }

    class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f20519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ gj.b f20520b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, gj.b bVar) {
            this.f20519a = parcelFileDescriptorRewinder;
            this.f20520b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            a0 a0Var = null;
            try {
                a0 a0Var2 = new a0(new FileInputStream(this.f20519a.a().getFileDescriptor()), this.f20520b);
                try {
                    int iD = imageHeaderParser.d(a0Var2, this.f20520b);
                    a0Var2.release();
                    this.f20519a.a();
                    return iD;
                } catch (Throwable th2) {
                    th = th2;
                    a0Var = a0Var2;
                    if (a0Var != null) {
                        a0Var.release();
                    }
                    this.f20519a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    private interface g {
        int a(ImageHeaderParser imageHeaderParser);
    }

    private interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull gj.b bVar) {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(@NonNull List<ImageHeaderParser> list, InputStream inputStream, @NonNull gj.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new a0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(@NonNull List<ImageHeaderParser> list, ByteBuffer byteBuffer, @NonNull gj.b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(@NonNull List<ImageHeaderParser> list, g gVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iA = gVar.a(list.get(i11));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    @NonNull
    public static ImageHeaderParser.ImageType e(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull gj.b bVar) {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    @NonNull
    public static ImageHeaderParser.ImageType f(@NonNull List<ImageHeaderParser> list, InputStream inputStream, @NonNull gj.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new a0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C0415a(inputStream));
    }

    @NonNull
    public static ImageHeaderParser.ImageType g(@NonNull List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    @NonNull
    private static ImageHeaderParser.ImageType h(@NonNull List<ImageHeaderParser> list, h hVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ImageHeaderParser.ImageType imageTypeA = hVar.a(list.get(i11));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
