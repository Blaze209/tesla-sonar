package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.g3;
import c0.s0;
import c0.x0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Image f3021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0068a[] f3022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s0 f3023c;

    /* JADX INFO: renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    private static final class C0068a implements n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Image.Plane f3024a;

        C0068a(Image.Plane plane) {
            this.f3024a = plane;
        }

        @Override // androidx.camera.core.n.a
        @NonNull
        public ByteBuffer l() {
            return this.f3024a.getBuffer();
        }

        @Override // androidx.camera.core.n.a
        public int m() {
            return this.f3024a.getRowStride();
        }

        @Override // androidx.camera.core.n.a
        public int n() {
            return this.f3024a.getPixelStride();
        }
    }

    a(@NonNull Image image) {
        this.f3021a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f3022b = new C0068a[planes.length];
            for (int i11 = 0; i11 < planes.length; i11++) {
                this.f3022b[i11] = new C0068a(planes[i11]);
            }
        } else {
            this.f3022b = new C0068a[0];
        }
        this.f3023c = x0.f(g3.b(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.n
    @NonNull
    public n.a[] N0() {
        return this.f3022b;
    }

    @Override // androidx.camera.core.n, java.lang.AutoCloseable
    public void close() {
        this.f3021a.close();
    }

    @Override // androidx.camera.core.n
    public int getFormat() {
        return this.f3021a.getFormat();
    }

    @Override // androidx.camera.core.n
    public int getHeight() {
        return this.f3021a.getHeight();
    }

    @Override // androidx.camera.core.n
    public Image getImage() {
        return this.f3021a;
    }

    @Override // androidx.camera.core.n
    public int getWidth() {
        return this.f3021a.getWidth();
    }

    @Override // androidx.camera.core.n
    public void r2(Rect rect) {
        this.f3021a.setCropRect(rect);
    }

    @Override // androidx.camera.core.n
    @NonNull
    public s0 z() {
        return this.f3023c;
    }
}
