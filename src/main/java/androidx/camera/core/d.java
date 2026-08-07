package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.s1;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class d implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageReader f3030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f3031b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3032c = true;

    d(ImageReader imageReader) {
        this.f3030a = imageReader;
    }

    public static /* synthetic */ void e(final d dVar, Executor executor, final s1.a aVar, ImageReader imageReader) {
        synchronized (dVar.f3031b) {
            try {
                if (!dVar.f3032c) {
                    executor.execute(new Runnable() { // from class: androidx.camera.core.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.h(this.f3028a, aVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void h(d dVar, s1.a aVar) {
        dVar.getClass();
        aVar.a(dVar);
    }

    private boolean i(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    @Override // androidx.camera.core.impl.s1
    public int a() {
        int imageFormat;
        synchronized (this.f3031b) {
            imageFormat = this.f3030a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.s1
    public int b() {
        int maxImages;
        synchronized (this.f3031b) {
            maxImages = this.f3030a.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.s1
    public n c() {
        Image imageAcquireNextImage;
        synchronized (this.f3031b) {
            try {
                imageAcquireNextImage = this.f3030a.acquireNextImage();
            } catch (RuntimeException e11) {
                if (!i(e11)) {
                    throw e11;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new a(imageAcquireNextImage);
        }
    }

    @Override // androidx.camera.core.impl.s1
    public void close() {
        synchronized (this.f3031b) {
            this.f3030a.close();
        }
    }

    @Override // androidx.camera.core.impl.s1
    public n d() {
        Image imageAcquireLatestImage;
        synchronized (this.f3031b) {
            try {
                imageAcquireLatestImage = this.f3030a.acquireLatestImage();
            } catch (RuntimeException e11) {
                if (!i(e11)) {
                    throw e11;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new a(imageAcquireLatestImage);
        }
    }

    @Override // androidx.camera.core.impl.s1
    public void f() {
        synchronized (this.f3031b) {
            this.f3032c = true;
            this.f3030a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.s1
    public void g(@NonNull final s1.a aVar, @NonNull final Executor executor) {
        synchronized (this.f3031b) {
            this.f3032c = false;
            this.f3030a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    d.e(this.f3025a, executor, aVar, imageReader);
                }
            }, h0.m.a());
        }
    }

    @Override // androidx.camera.core.impl.s1
    public int getHeight() {
        int height;
        synchronized (this.f3031b) {
            height = this.f3030a.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.s1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f3031b) {
            surface = this.f3030a.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.s1
    public int getWidth() {
        int width;
        synchronized (this.f3031b) {
            width = this.f3030a.getWidth();
        }
        return width;
    }
}
