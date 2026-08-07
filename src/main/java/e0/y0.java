package e0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.g3;
import androidx.camera.core.internal.utils.ImageUtil;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements androidx.camera.core.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f61428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f61429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f61430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final Rect f61431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    androidx.camera.core.n.a[] f61432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final c0.s0 f61433f;

    class a implements androidx.camera.core.n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f61434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f61435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f61436c;

        a(int i11, int i12, ByteBuffer byteBuffer) {
            this.f61434a = i11;
            this.f61435b = i12;
            this.f61436c = byteBuffer;
        }

        @Override // androidx.camera.core.n.a
        @NonNull
        public ByteBuffer l() {
            return this.f61436c;
        }

        @Override // androidx.camera.core.n.a
        public int m() {
            return this.f61434a;
        }

        @Override // androidx.camera.core.n.a
        public int n() {
            return this.f61435b;
        }
    }

    class b implements c0.s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f61437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f61438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f61439c;

        b(long j11, int i11, Matrix matrix) {
            this.f61437a = j11;
            this.f61438b = i11;
            this.f61439c = matrix;
        }

        @Override // c0.s0
        public long a() {
            return this.f61437a;
        }

        @Override // c0.s0
        public void b(@NonNull h0.i.b bVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override // c0.s0
        @NonNull
        public g3 c() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // c0.s0
        public int d() {
            return this.f61438b;
        }

        @Override // c0.s0
        @NonNull
        public Matrix e() {
            return new Matrix(this.f61439c);
        }
    }

    public y0(@NonNull p0.b0<Bitmap> b0Var) {
        this(b0Var.c(), b0Var.b(), b0Var.f(), b0Var.g(), b0Var.a().a());
    }

    private void c() {
        synchronized (this.f61428a) {
            u5.h.j(this.f61432e != null, "The image is closed.");
        }
    }

    private static c0.s0 n(long j11, int i11, @NonNull Matrix matrix) {
        return new b(j11, i11, matrix);
    }

    private static androidx.camera.core.n.a o(@NonNull ByteBuffer byteBuffer, int i11, int i12) {
        return new a(i11, i12, byteBuffer);
    }

    @Override // androidx.camera.core.n
    @NonNull
    public androidx.camera.core.n.a[] N0() {
        androidx.camera.core.n.a[] aVarArr;
        synchronized (this.f61428a) {
            c();
            androidx.camera.core.n.a[] aVarArr2 = this.f61432e;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    @Override // androidx.camera.core.n, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f61428a) {
            c();
            this.f61432e = null;
        }
    }

    @Override // androidx.camera.core.n
    public int getFormat() {
        synchronized (this.f61428a) {
            c();
        }
        return 1;
    }

    @Override // androidx.camera.core.n
    public int getHeight() {
        int i11;
        synchronized (this.f61428a) {
            c();
            i11 = this.f61430c;
        }
        return i11;
    }

    @Override // androidx.camera.core.n
    public Image getImage() {
        synchronized (this.f61428a) {
            c();
        }
        return null;
    }

    @Override // androidx.camera.core.n
    public int getWidth() {
        int i11;
        synchronized (this.f61428a) {
            c();
            i11 = this.f61429b;
        }
        return i11;
    }

    @Override // androidx.camera.core.n
    public void r2(Rect rect) {
        synchronized (this.f61428a) {
            try {
                c();
                if (rect != null) {
                    this.f61431d.set(rect);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.n
    @NonNull
    public c0.s0 z() {
        c0.s0 s0Var;
        synchronized (this.f61428a) {
            c();
            s0Var = this.f61433f;
        }
        return s0Var;
    }

    public y0(@NonNull Bitmap bitmap, @NonNull Rect rect, int i11, @NonNull Matrix matrix, long j11) {
        this(ImageUtil.f(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i11, matrix, j11);
    }

    public y0(@NonNull ByteBuffer byteBuffer, int i11, int i12, int i13, @NonNull Rect rect, int i14, @NonNull Matrix matrix, long j11) {
        this.f61428a = new Object();
        this.f61429b = i12;
        this.f61430c = i13;
        this.f61431d = rect;
        this.f61433f = n(j11, i14, matrix);
        byteBuffer.rewind();
        this.f61432e = new androidx.camera.core.n.a[]{o(byteBuffer, i12 * i11, i11)};
    }
}
