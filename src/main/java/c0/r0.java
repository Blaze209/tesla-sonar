package c0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.location.Location;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.p3;
import androidx.camera.core.impl.x2;
import androidx.camera.core.impl.z2;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import java.io.File;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends a2 {
    public static final c C = new c();
    static final n0.b D = new n0.b();
    private x2.c A;
    private final e0.c0 B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final androidx.camera.core.impl.s1.a f18387q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f18388r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AtomicReference<Integer> f18389s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f18390t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f18391u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Rational f18392v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    private k0.h f18393w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    x2.b f18394x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private e0.d0 f18395y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private e0.a1 f18396z;

    class a implements e0.c0 {
        a() {
        }

        @Override // e0.c0
        public void a() {
            r0.this.A0();
        }

        @Override // e0.c0
        public void b() {
            r0.this.M0();
        }

        @Override // e0.c0
        @NonNull
        public com.google.common.util.concurrent.s<Void> c(@NonNull List<androidx.camera.core.impl.v0> list) {
            return r0.this.H0(list);
        }
    }

    public static final class b implements o3.b<r0, androidx.camera.core.impl.p1, b>, androidx.camera.core.impl.r1.a<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.camera.core.impl.d2 f18398a;

        public b() {
            this(androidx.camera.core.impl.d2.c0());
        }

        @NonNull
        public static b f(@NonNull androidx.camera.core.impl.x0 x0Var) {
            return new b(androidx.camera.core.impl.d2.d0(x0Var));
        }

        @Override // c0.d0
        @NonNull
        public androidx.camera.core.impl.c2 b() {
            return this.f18398a;
        }

        @NonNull
        public r0 e() {
            Integer num = (Integer) b().d(androidx.camera.core.impl.p1.O, null);
            if (num != null) {
                b().K(androidx.camera.core.impl.q1.f3281h, num);
            } else if (r0.w0(b())) {
                b().K(androidx.camera.core.impl.q1.f3281h, 32);
            } else if (r0.x0(b())) {
                b().K(androidx.camera.core.impl.q1.f3281h, 32);
                b().K(androidx.camera.core.impl.q1.f3282i, 256);
            } else if (r0.y0(b())) {
                b().K(androidx.camera.core.impl.q1.f3281h, 4101);
                b().K(androidx.camera.core.impl.q1.f3283j, b0.f18254c);
            } else {
                b().K(androidx.camera.core.impl.q1.f3281h, 256);
            }
            androidx.camera.core.impl.p1 p1VarD = d();
            androidx.camera.core.impl.r1.N(p1VarD);
            r0 r0Var = new r0(p1VarD);
            Size size = (Size) b().d(androidx.camera.core.impl.r1.f3290o, null);
            if (size != null) {
                r0Var.C0(new Rational(size.getWidth(), size.getHeight()));
            }
            u5.h.h((Executor) b().d(k0.f.G, i0.c.d()), "The IO executor can't be null");
            androidx.camera.core.impl.c2 c2VarB = b();
            androidx.camera.core.impl.x0.a<Integer> aVar = androidx.camera.core.impl.p1.M;
            if (c2VarB.e(aVar)) {
                Integer num2 = (Integer) b().a(aVar);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
                if (num2.intValue() == 3 && b().d(androidx.camera.core.impl.p1.V, null) == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
            return r0Var;
        }

        @Override // androidx.camera.core.impl.o3.b
        @NonNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public androidx.camera.core.impl.p1 d() {
            return new androidx.camera.core.impl.p1(i2.b0(this.f18398a));
        }

        @NonNull
        public b h(int i11) {
            b().K(androidx.camera.core.impl.p1.L, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        public b i(@NonNull p3.b bVar) {
            b().K(o3.C, bVar);
            return this;
        }

        @NonNull
        public b j(@NonNull b0 b0Var) {
            b().K(androidx.camera.core.impl.q1.f3283j, b0Var);
            return this;
        }

        @NonNull
        public b k(boolean z11) {
            b().K(o3.B, Boolean.valueOf(z11));
            return this;
        }

        @NonNull
        public b l(int i11) {
            b().K(androidx.camera.core.impl.p1.P, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        public b m(@NonNull s0.c cVar) {
            b().K(androidx.camera.core.impl.r1.f3294s, cVar);
            return this;
        }

        @NonNull
        public b n(@NonNull List<Pair<Integer, Size[]>> list) {
            b().K(androidx.camera.core.impl.r1.f3293r, list);
            return this;
        }

        @NonNull
        public b o(int i11) {
            b().K(o3.f3270y, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        @Deprecated
        public b p(int i11) {
            if (i11 == -1) {
                i11 = 0;
            }
            b().K(androidx.camera.core.impl.r1.f3286k, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        public b q(@NonNull Class<r0> cls) {
            b().K(k0.k.I, cls);
            if (b().d(k0.k.H, null) == null) {
                r(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @NonNull
        public b r(@NonNull String str) {
            b().K(k0.k.H, str);
            return this;
        }

        @Override // androidx.camera.core.impl.r1.a
        @NonNull
        @Deprecated
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b c(@NonNull Size size) {
            b().K(androidx.camera.core.impl.r1.f3290o, size);
            return this;
        }

        @Override // androidx.camera.core.impl.r1.a
        @NonNull
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b a(int i11) {
            b().K(androidx.camera.core.impl.r1.f3287l, Integer.valueOf(i11));
            return this;
        }

        private b(androidx.camera.core.impl.d2 d2Var) {
            this.f18398a = d2Var;
            Class cls = (Class) d2Var.d(k0.k.I, null);
            if (cls == null || cls.equals(r0.class)) {
                i(p3.b.IMAGE_CAPTURE);
                q(r0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final s0.c f18399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final androidx.camera.core.impl.p1 f18400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b0 f18401c;

        static {
            s0.c cVarA = new s0.c.a().d(s0.a.f109283c).f(s0.d.f109295c).a();
            f18399a = cVarA;
            b0 b0Var = b0.f18255d;
            f18401c = b0Var;
            f18400b = new b().o(4).p(0).m(cVarA).l(0).j(b0Var).d();
        }

        @NonNull
        public androidx.camera.core.impl.p1 a() {
            return f18400b;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f18403b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f18404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Location f18405d;

        public Location a() {
            return this.f18405d;
        }

        public boolean b() {
            return this.f18402a;
        }

        public boolean c() {
            return this.f18404c;
        }

        public void d(Location location) {
            this.f18405d = location;
        }

        public void e(boolean z11) {
            this.f18402a = z11;
            this.f18403b = true;
        }

        @NonNull
        public String toString() {
            return "Metadata{mIsReversedHorizontal=" + this.f18402a + ", mIsReversedVertical=" + this.f18404c + ", mLocation=" + this.f18405d + "}";
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f18406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ContentResolver f18407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f18408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ContentValues f18409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final OutputStream f18410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        private final d f18411f;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private File f18412a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private ContentResolver f18413b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Uri f18414c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private ContentValues f18415d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private OutputStream f18416e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private d f18417f;

            public a(@NonNull File file) {
                this.f18412a = file;
            }

            @NonNull
            public g a() {
                return new g(this.f18412a, this.f18413b, this.f18414c, this.f18415d, this.f18416e, this.f18417f);
            }

            @NonNull
            public a b(@NonNull d dVar) {
                this.f18417f = dVar;
                return this;
            }
        }

        g(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, d dVar) {
            this.f18406a = file;
            this.f18407b = contentResolver;
            this.f18408c = uri;
            this.f18409d = contentValues;
            this.f18410e = outputStream;
            this.f18411f = dVar == null ? new d() : dVar;
        }

        public ContentResolver a() {
            return this.f18407b;
        }

        public ContentValues b() {
            return this.f18409d;
        }

        public File c() {
            return this.f18406a;
        }

        @NonNull
        public d d() {
            return this.f18411f;
        }

        public OutputStream e() {
            return this.f18410e;
        }

        public Uri f() {
            return this.f18408c;
        }

        @NonNull
        public String toString() {
            return "OutputFileOptions{mFile=" + this.f18406a + ", mContentResolver=" + this.f18407b + ", mSaveCollection=" + this.f18408c + ", mContentValues=" + this.f18409d + ", mOutputStream=" + this.f18410e + ", mMetadata=" + this.f18411f + "}";
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f18418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18419b;

        public h(Uri uri, int i11) {
            this.f18418a = uri;
            this.f18419b = i11;
        }

        public Uri a() {
            return this.f18418a;
        }
    }

    public interface i {
        void a(long j11, @NonNull j jVar);

        void clear();
    }

    public interface j {
        void a();
    }

    r0(@NonNull androidx.camera.core.impl.p1 p1Var) {
        super(p1Var);
        this.f18387q = new androidx.camera.core.impl.s1.a() { // from class: c0.o0
            @Override // androidx.camera.core.impl.s1.a
            public final void a(androidx.camera.core.impl.s1 s1Var) {
                r0.c0(s1Var);
            }
        };
        this.f18389s = new AtomicReference<>(null);
        this.f18391u = -1;
        this.f18392v = null;
        this.B = new a();
        androidx.camera.core.impl.p1 p1Var2 = (androidx.camera.core.impl.p1) k();
        if (p1Var2.e(androidx.camera.core.impl.p1.L)) {
            this.f18388r = p1Var2.a0();
        } else {
            this.f18388r = 1;
        }
        this.f18390t = p1Var2.c0(0);
        this.f18393w = k0.h.g(p1Var2.g0());
    }

    private void B0(@NonNull Executor executor, e eVar, f fVar) {
        ImageCaptureException imageCaptureException = new ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", null);
        if (eVar != null) {
            eVar.onError(imageCaptureException);
        } else {
            if (fVar == null) {
                throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
            }
            fVar.c(imageCaptureException);
        }
    }

    private void E0() {
        F0(this.f18393w);
    }

    private void F0(i iVar) {
        i().f(iVar);
    }

    private void K0(@NonNull Executor executor, e eVar, f fVar, g gVar, g gVar2) {
        h0.r.b();
        if (q0() == 3 && this.f18393w.getScreenFlash() == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        Log.d("ImageCapture", "takePictureInternal");
        androidx.camera.core.impl.j0 j0VarH = h();
        if (j0VarH == null) {
            B0(executor, eVar, fVar);
            return;
        }
        boolean z11 = k().W() != 0;
        if (z11 && gVar2 == null) {
            throw new IllegalArgumentException("Simultaneous capture RAW and JPEG needs two output file options");
        }
        if (!z11 && gVar2 != null) {
            throw new IllegalArgumentException("Non simultaneous capture cannot have two output file options");
        }
        e0.a1 a1Var = this.f18396z;
        Objects.requireNonNull(a1Var);
        a1Var.l(e0.k1.v(executor, eVar, fVar, gVar, gVar2, t0(), w(), r(j0VarH), r0(), p0(), z11, this.f18394x.s()));
    }

    private void L0() {
        synchronized (this.f18389s) {
            try {
                if (this.f18389s.get() != null) {
                    return;
                }
                i().m(q0());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void b0(r0 r0Var, x2 x2Var, x2.g gVar) {
        if (r0Var.h() == null) {
            return;
        }
        r0Var.f18396z.d();
        r0Var.l0(true);
        x2.b bVarM0 = r0Var.m0(r0Var.j(), (androidx.camera.core.impl.p1) r0Var.k(), (c3) u5.h.g(r0Var.f()));
        r0Var.f18394x = bVarM0;
        r0Var.Y(h0.a(new Object[]{bVarM0.p()}));
        r0Var.H();
        r0Var.f18396z.i();
    }

    public static /* synthetic */ void c0(androidx.camera.core.impl.s1 s1Var) {
        try {
            androidx.camera.core.n nVarD = s1Var.d();
            try {
                Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + nVarD);
                if (nVarD != null) {
                    nVarD.close();
                }
            } catch (Throwable th2) {
                if (nVarD != null) {
                    try {
                        nVarD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IllegalStateException e11) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e11);
        }
    }

    public static /* synthetic */ Void e0(List list) {
        return null;
    }

    private void g0() {
        this.f18393w.f();
        e0.a1 a1Var = this.f18396z;
        if (a1Var != null) {
            a1Var.j();
        }
    }

    private void k0() {
        l0(false);
    }

    private void l0(boolean z11) {
        e0.a1 a1Var;
        Log.d("ImageCapture", "clearPipeline");
        h0.r.b();
        x2.c cVar = this.A;
        if (cVar != null) {
            cVar.b();
            this.A = null;
        }
        e0.d0 d0Var = this.f18395y;
        if (d0Var != null) {
            d0Var.a();
            this.f18395y = null;
        }
        if (z11 || (a1Var = this.f18396z) == null) {
            return;
        }
        a1Var.j();
        this.f18396z = null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ed A[PHI: r5
      0x00ed: PHI (r5v2 int) = (r5v1 int), (r5v1 int), (r5v5 int), (r5v5 int) binds: [B:6:0x004d, B:8:0x0053, B:16:0x0089, B:18:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    private x2.b m0(@NonNull String str, @NonNull androidx.camera.core.impl.p1 p1Var, @NonNull c3 c3Var) {
        int i11;
        Size size;
        z2 z2VarS0;
        Size size2;
        h0.r.b();
        Log.d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, c3Var));
        Size sizeE = c3Var.e();
        androidx.camera.core.impl.j0 j0VarH = h();
        Objects.requireNonNull(j0VarH);
        boolean z11 = !j0VarH.q();
        if (this.f18395y != null) {
            u5.h.i(z11);
            this.f18395y.a();
        }
        int i12 = 35;
        CameraCharacteristics cameraCharacteristics = null;
        if (!((Boolean) k().d(androidx.camera.core.impl.p1.X, Boolean.FALSE)).booleanValue() || (z2VarS0 = s0()) == null) {
            i11 = i12;
            size = null;
        } else {
            s0.c cVar = (s0.c) k().d(androidx.camera.core.impl.p1.W, null);
            Map<Integer, List<Size>> mapF = z2VarS0.f(sizeE);
            List<Size> list = mapF.get(35);
            if (list == null || list.isEmpty()) {
                i12 = 256;
                list = mapF.get(256);
            }
            List<Size> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                i11 = i12;
                size = null;
            } else {
                if (cVar != null) {
                    Collections.sort(list2, new h0.e(true));
                    androidx.camera.core.impl.j0 j0VarH2 = h();
                    Rect rectL = j0VarH2.l().l();
                    androidx.camera.core.impl.i0 i0VarE = j0VarH2.e();
                    List<Size> listP = k0.i.p(cVar, list2, null, u0(), new Rational(rectL.width(), rectL.height()), i0VarE.m(), i0VarE.f());
                    if (listP.isEmpty()) {
                        throw new IllegalArgumentException("The postview ResolutionSelector cannot select a valid size for the postview.");
                    }
                    size2 = listP.get(0);
                } else {
                    size2 = (Size) Collections.max(list2, new h0.e());
                }
                size = size2;
                i11 = i12;
            }
        }
        if (h() != null) {
            try {
                Object objP = h().e().p();
                if (objP instanceof CameraCharacteristics) {
                    cameraCharacteristics = (CameraCharacteristics) objP;
                }
            } catch (Exception e11) {
                Log.e("ImageCapture", "getCameraCharacteristics failed", e11);
            }
        }
        this.f18395y = new e0.d0(p1Var, sizeE, cameraCharacteristics, m(), z11, size, i11);
        if (this.f18396z == null) {
            this.f18396z = k().n().a(this.B);
        }
        this.f18396z.k(this.f18395y);
        x2.b bVarF = this.f18395y.f(c3Var.e());
        if (p0() == 2 && !c3Var.f()) {
            i().a(bVarF);
        }
        if (c3Var.d() != null) {
            bVarF.g(c3Var.d());
        }
        x2.c cVar2 = this.A;
        if (cVar2 != null) {
            cVar2.b();
        }
        x2.c cVar3 = new x2.c(new x2.d() { // from class: c0.p0
            @Override // androidx.camera.core.impl.x2.d
            public final void a(x2 x2Var, x2.g gVar) {
                r0.b0(this.f18382a, x2Var, gVar);
            }
        });
        this.A = cVar3;
        bVarF.u(cVar3);
        return bVarF;
    }

    private int o0() {
        androidx.camera.core.impl.j0 j0VarH = h();
        if (j0VarH != null) {
            return j0VarH.c().f();
        }
        return -1;
    }

    private int r0() {
        androidx.camera.core.impl.p1 p1Var = (androidx.camera.core.impl.p1) k();
        if (p1Var.e(androidx.camera.core.impl.p1.U)) {
            return p1Var.f0();
        }
        int i11 = this.f18388r;
        if (i11 == 0) {
            return 100;
        }
        if (i11 == 1 || i11 == 2) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f18388r + " is invalid");
    }

    private z2 s0() {
        return h().m().I(null);
    }

    @NonNull
    private Rect t0() {
        Rect rectB = B();
        Size sizeG = g();
        Objects.requireNonNull(sizeG);
        if (rectB != null) {
            return rectB;
        }
        if (!ImageUtil.i(this.f18392v)) {
            return new Rect(0, 0, sizeG.getWidth(), sizeG.getHeight());
        }
        androidx.camera.core.impl.j0 j0VarH = h();
        Objects.requireNonNull(j0VarH);
        int iR = r(j0VarH);
        Rational rational = new Rational(this.f18392v.getDenominator(), this.f18392v.getNumerator());
        if (!h0.s.i(iR)) {
            rational = this.f18392v;
        }
        Rect rectA = ImageUtil.a(sizeG, rational);
        Objects.requireNonNull(rectA);
        return rectA;
    }

    private static boolean v0(List<Pair<Integer, Size[]>> list, int i11) {
        if (list == null) {
            return false;
        }
        Iterator<Pair<Integer, Size[]>> it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next().first).equals(Integer.valueOf(i11))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean w0(@NonNull androidx.camera.core.impl.c2 c2Var) {
        return Objects.equals(c2Var.d(androidx.camera.core.impl.p1.P, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean x0(@NonNull androidx.camera.core.impl.c2 c2Var) {
        return Objects.equals(c2Var.d(androidx.camera.core.impl.p1.P, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean y0(@NonNull androidx.camera.core.impl.c2 c2Var) {
        return Objects.equals(c2Var.d(androidx.camera.core.impl.p1.P, null), 1);
    }

    private boolean z0() {
        return (h() == null || h().m().I(null) == null) ? false : true;
    }

    @Override // c0.a2
    @NonNull
    public o3.b<?, ?, ?> A(@NonNull androidx.camera.core.impl.x0 x0Var) {
        return b.f(x0Var);
    }

    void A0() {
        synchronized (this.f18389s) {
            try {
                if (this.f18389s.get() != null) {
                    return;
                }
                this.f18389s.set(Integer.valueOf(q0()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void C0(@NonNull Rational rational) {
        this.f18392v = rational;
    }

    public void D0(int i11) {
        y0.a("ImageCapture", "setFlashMode: flashMode = " + i11);
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                throw new IllegalArgumentException("Invalid flash mode: " + i11);
            }
            if (this.f18393w.getScreenFlash() == null) {
                throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            }
            if (h() != null && o0() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        synchronized (this.f18389s) {
            this.f18391u = i11;
            L0();
        }
    }

    public void G0(int i11) {
        int iU0 = u0();
        if (!V(i11) || this.f18392v == null) {
            return;
        }
        this.f18392v = ImageUtil.g(Math.abs(h0.c.b(i11) - h0.c.b(iU0)), this.f18392v);
    }

    com.google.common.util.concurrent.s<Void> H0(@NonNull List<androidx.camera.core.impl.v0> list) {
        h0.r.b();
        return j0.n.x(i().d(list, this.f18388r, this.f18390t), new r.a() { // from class: c0.q0
            @Override // r.a
            public final Object apply(Object obj) {
                return r0.e0((List) obj);
            }
        }, i0.c.b());
    }

    public void I0(@NonNull final g gVar, @NonNull final Executor executor, @NonNull final f fVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            i0.c.e().execute(new Runnable() { // from class: c0.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18370a.I0(gVar, executor, fVar);
                }
            });
        } else {
            K0(executor, null, fVar, gVar, null);
        }
    }

    public void J0(@NonNull final Executor executor, @NonNull final e eVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            i0.c.e().execute(new Runnable() { // from class: c0.m0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18366a.J0(executor, eVar);
                }
            });
        } else {
            K0(executor, eVar, null, null, null);
        }
    }

    @Override // c0.a2
    public void K() {
        u5.h.h(h(), "Attached camera cannot be null");
        if (q0() == 3 && o0() != 0) {
            throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // c0.a2
    public void L() {
        y0.a("ImageCapture", "onCameraControlReady");
        L0();
        E0();
    }

    @Override // c0.a2
    @NonNull
    protected o3<?> M(@NonNull androidx.camera.core.impl.i0 i0Var, @NonNull o3.b<?, ?, ?> bVar) {
        if (i0Var.r().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            androidx.camera.core.impl.c2 c2VarB = bVar.b();
            androidx.camera.core.impl.x0.a<Boolean> aVar = androidx.camera.core.impl.p1.S;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(c2VarB.d(aVar, bool2))) {
                y0.l("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                y0.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                bVar.b().K(aVar, bool2);
            }
        }
        boolean zN0 = n0(bVar.b());
        Integer num = (Integer) bVar.b().d(androidx.camera.core.impl.p1.O, null);
        if (num != null) {
            u5.h.b(!z0() || num.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            bVar.b().K(androidx.camera.core.impl.q1.f3281h, Integer.valueOf(zN0 ? 35 : num.intValue()));
        } else if (w0(bVar.b())) {
            bVar.b().K(androidx.camera.core.impl.q1.f3281h, 32);
        } else if (x0(bVar.b())) {
            bVar.b().K(androidx.camera.core.impl.q1.f3281h, 32);
            bVar.b().K(androidx.camera.core.impl.q1.f3282i, 256);
        } else if (y0(bVar.b())) {
            bVar.b().K(androidx.camera.core.impl.q1.f3281h, 4101);
            bVar.b().K(androidx.camera.core.impl.q1.f3283j, b0.f18254c);
        } else if (zN0) {
            bVar.b().K(androidx.camera.core.impl.q1.f3281h, 35);
        } else {
            List list = (List) bVar.b().d(androidx.camera.core.impl.r1.f3293r, null);
            if (list == null || v0(list, 256)) {
                bVar.b().K(androidx.camera.core.impl.q1.f3281h, 256);
            } else if (v0(list, 35)) {
                bVar.b().K(androidx.camera.core.impl.q1.f3281h, 35);
            }
        }
        return bVar.d();
    }

    void M0() {
        synchronized (this.f18389s) {
            try {
                Integer andSet = this.f18389s.getAndSet(null);
                if (andSet == null) {
                    return;
                }
                if (andSet.intValue() != q0()) {
                    L0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c0.a2
    public void O() {
        g0();
    }

    @Override // c0.a2
    @NonNull
    protected c3 P(@NonNull androidx.camera.core.impl.x0 x0Var) {
        this.f18394x.g(x0Var);
        Y(h0.a(new Object[]{this.f18394x.p()}));
        return f().g().d(x0Var).a();
    }

    @Override // c0.a2
    @NonNull
    protected c3 Q(@NonNull c3 c3Var, c3 c3Var2) {
        x2.b bVarM0 = m0(j(), (androidx.camera.core.impl.p1) k(), c3Var);
        this.f18394x = bVarM0;
        Y(h0.a(new Object[]{bVarM0.p()}));
        F();
        return c3Var;
    }

    @Override // c0.a2
    public void R() {
        g0();
        k0();
        F0(null);
    }

    @Override // c0.a2
    public o3<?> l(boolean z11, @NonNull p3 p3Var) {
        c cVar = C;
        androidx.camera.core.impl.x0 x0VarA = p3Var.a(cVar.a().U(), p0());
        if (z11) {
            x0VarA = androidx.camera.core.impl.x0.V(x0VarA, cVar.a());
        }
        if (x0VarA == null) {
            return null;
        }
        return A(x0VarA).d();
    }

    boolean n0(@NonNull androidx.camera.core.impl.c2 c2Var) {
        boolean z11;
        Boolean bool = Boolean.TRUE;
        androidx.camera.core.impl.x0.a<Boolean> aVar = androidx.camera.core.impl.p1.S;
        Boolean bool2 = Boolean.FALSE;
        boolean z12 = false;
        if (bool.equals(c2Var.d(aVar, bool2))) {
            if (z0()) {
                y0.l("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z11 = false;
            } else {
                z11 = true;
            }
            Integer num = (Integer) c2Var.d(androidx.camera.core.impl.p1.O, null);
            if (num == null || num.intValue() == 256) {
                z12 = z11;
            } else {
                y0.l("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z12) {
                y0.l("ImageCapture", "Unable to support software JPEG. Disabling.");
                c2Var.K(aVar, bool2);
            }
        }
        return z12;
    }

    public int p0() {
        return this.f18388r;
    }

    public int q0() {
        int iB0;
        synchronized (this.f18389s) {
            iB0 = this.f18391u;
            if (iB0 == -1) {
                iB0 = ((androidx.camera.core.impl.p1) k()).b0(2);
            }
        }
        return iB0;
    }

    @NonNull
    public String toString() {
        return "ImageCapture:" + p();
    }

    public int u0() {
        return z();
    }

    @Override // c0.a2
    @NonNull
    public Set<Integer> y() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public static abstract class e {
        public void onCaptureStarted() {
        }

        public void onCaptureProcessProgressed(int i11) {
        }

        public void onCaptureSuccess(@NonNull androidx.camera.core.n nVar) {
        }

        public void onError(@NonNull ImageCaptureException imageCaptureException) {
        }

        public void onPostviewBitmapAvailable(@NonNull Bitmap bitmap) {
        }
    }

    public interface f {
        void c(@NonNull ImageCaptureException imageCaptureException);

        void d(@NonNull h hVar);

        default void a() {
        }

        default void b(@NonNull Bitmap bitmap) {
        }

        default void onCaptureProcessProgressed(int i11) {
        }
    }
}
