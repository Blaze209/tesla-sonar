package z0;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.g2;
import androidx.camera.core.impl.h3;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.core.util.Consumer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements c2 {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final Set<l> f126249n0 = Collections.unmodifiableSet(EnumSet.of(l.PENDING_RECORDING, l.PENDING_PAUSED));

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final Set<l> f126250o0 = Collections.unmodifiableSet(EnumSet.of(l.CONFIGURING, l.IDLING, l.RESETTING, l.STOPPING, l.ERROR));

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a0 f126251p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final e2 f126252q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final s f126253r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Exception f126254s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    static final g1.n f126255t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final b1.f.a f126256u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Executor f126257v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    static int f126258w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    static long f126259x0;
    c0.z1 A;
    h3 B;
    Surface C;
    Surface D;
    MediaMuxer E;
    final androidx.camera.core.impl.e2<s> F;
    androidx.camera.video.internal.audio.b G;
    g1.k H;
    g1.i1 I;
    g1.k J;
    g1.i1 K;
    h L;

    @NonNull
    Uri M;
    long N;
    long O;
    long P;
    int Q;
    Range<Integer> R;
    long S;
    long T;
    long U;
    long V;
    long W;
    int X;
    Throwable Y;
    g1.h Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.e2<i1> f126260a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NonNull
    final o0.b<g1.h> f126261a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.camera.core.impl.e2<Boolean> f126262b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    Throwable f126263b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f126264c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    boolean f126265c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f126266d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    c2.a f126267d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Executor f126268e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    ScheduledFuture<?> f126269e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g1.n f126270f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f126271f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g1.n f126272g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NonNull
    b2 f126273g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b1.f.a f126274h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    b2 f126275h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f126276i = new Object();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    double f126277i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f126278j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f126279j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f126280k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private k f126281k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f126282l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private b1.f f126283l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l f126284m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private long f126285m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f126286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f126287o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    j f126288p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    j f126289q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f126290r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    j f126291s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f126292t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c0.z1.h f126293u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c0.z1.h f126294v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private b1.i f126295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final List<com.google.common.util.concurrent.s<Void>> f126296x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Integer f126297y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    Integer f126298z;

    class a implements j0.c<g1.k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b2 f126299a;

        a(b2 b2Var) {
            this.f126299a = b2Var;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(g1.k kVar) {
            g1.k kVar2;
            c0.y0.a("Recorder", "VideoEncoder can be released: " + kVar);
            if (kVar == null) {
                return;
            }
            ScheduledFuture<?> scheduledFuture = t0.this.f126269e0;
            if (scheduledFuture != null && scheduledFuture.cancel(false) && (kVar2 = t0.this.H) != null && kVar2 == kVar) {
                t0.T(kVar2);
            }
            t0 t0Var = t0.this;
            t0Var.f126275h0 = this.f126299a;
            t0Var.r0(null);
            t0 t0Var2 = t0.this;
            t0Var2.h0(4, null, t0Var2.Q());
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            c0.y0.a("Recorder", "Error in ReadyToReleaseFuture: " + th2);
        }
    }

    class b implements j0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.camera.video.internal.audio.b f126301a;

        b(androidx.camera.video.internal.audio.b bVar) {
            this.f126301a = bVar;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
            c0.y0.a("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.f126301a.hashCode())));
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            c0.y0.a("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.f126301a.hashCode())));
        }
    }

    class d implements androidx.camera.video.internal.audio.b.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Consumer f126306a;

        d(Consumer consumer) {
            this.f126306a = consumer;
        }

        @Override // androidx.camera.video.internal.audio.b.c
        public void a(boolean z11) {
            t0 t0Var = t0.this;
            if (t0Var.f126265c0 != z11) {
                t0Var.f126265c0 = z11;
                t0Var.G0();
            } else {
                c0.y0.l("Recorder", "Audio source silenced transitions to the same state " + z11);
            }
        }

        @Override // androidx.camera.video.internal.audio.b.c
        public void b(double d11) {
            t0.this.f126277i0 = d11;
        }

        @Override // androidx.camera.video.internal.audio.b.c
        public void onError(@NonNull Throwable th2) {
            c0.y0.d("Recorder", "Error occurred after audio source started.", th2);
            if (th2 instanceof AudioSourceAccessException) {
                this.f126306a.accept(th2);
            }
        }
    }

    class f implements j0.c<List<Void>> {
        f() {
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Void> list) {
            c0.y0.a("Recorder", "Encodings end successfully.");
            t0 t0Var = t0.this;
            t0Var.F(t0Var.X, t0Var.Y);
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            u5.h.j(t0.this.f126291s != null, "In-progress recording shouldn't be null");
            if (t0.this.f126291s.t0()) {
                return;
            }
            c0.y0.a("Recorder", "Encodings end with error: " + th2);
            t0 t0Var = t0.this;
            t0Var.F(t0Var.E == null ? 8 : 6, th2);
        }
    }

    class g implements g2.a<Boolean> {
        g() {
        }

        @Override // androidx.camera.core.impl.g2.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            t0.this.f126262b.k(bool);
        }

        @Override // androidx.camera.core.impl.g2.a
        public void onError(@NonNull Throwable th2) {
            t0.this.f126262b.j(th2);
        }
    }

    enum h {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s.a f126314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f126315b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Executor f126316c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private g1.n f126317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private g1.n f126318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private b1.f.a f126319f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f126320g;

        public i() {
            g1.n nVar = t0.f126255t0;
            this.f126317d = nVar;
            this.f126318e = nVar;
            this.f126319f = t0.f126256u0;
            this.f126320g = -1L;
            this.f126314a = s.a();
        }

        @NonNull
        public t0 c() {
            return new t0(this.f126316c, this.f126314a.a(), this.f126315b, this.f126317d, this.f126318e, this.f126319f, this.f126320g);
        }

        @NonNull
        public i d(@NonNull Executor executor) {
            u5.h.h(executor, "The specified executor can't be null.");
            this.f126316c = executor;
            return this;
        }

        @NonNull
        public i e(@NonNull final a0 a0Var) {
            u5.h.h(a0Var, "The specified quality selector can't be null.");
            this.f126314a.b(new Consumer() { // from class: z0.v0
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((e2.a) obj).e(a0Var);
                }
            });
            return this;
        }

        @NonNull
        public i f(final int i11) {
            if (i11 > 0) {
                this.f126314a.b(new Consumer() { // from class: z0.u0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        int i12 = i11;
                        ((e2.a) obj).c(new Range<>(Integer.valueOf(i12), Integer.valueOf(i12)));
                    }
                });
                return this;
            }
            throw new IllegalArgumentException("The requested target bitrate " + i11 + " is not supported. Target bitrate must be greater than 0.");
        }
    }

    static abstract class j implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h0.d f126321a = h0.d.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f126322b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicReference<d> f126323c = new AtomicReference<>(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicReference<c> f126324d = new AtomicReference<>(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AtomicReference<Consumer<Uri>> f126325e = new AtomicReference<>(new Consumer() { // from class: z0.a1
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                t0.j.n((Uri) obj);
            }
        });

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AtomicBoolean f126326f = new AtomicBoolean(false);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        private final androidx.camera.core.impl.e2<Boolean> f126327g = androidx.camera.core.impl.e2.l(Boolean.FALSE);

        class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f126328a;

            a(Context context) {
                this.f126328a = context;
            }

            @Override // z0.t0.j.c
            @NonNull
            public androidx.camera.video.internal.audio.b a(@NonNull c1.a aVar, @NonNull Executor executor) {
                return new androidx.camera.video.internal.audio.b(aVar, executor, this.f126328a);
            }
        }

        class b implements c {
            b() {
            }

            @Override // z0.t0.j.c
            @NonNull
            public androidx.camera.video.internal.audio.b a(@NonNull c1.a aVar, @NonNull Executor executor) {
                return new androidx.camera.video.internal.audio.b(aVar, executor, null);
            }
        }

        private interface c {
            @NonNull
            androidx.camera.video.internal.audio.b a(@NonNull c1.a aVar, @NonNull Executor executor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        interface d {
            @NonNull
            MediaMuxer a(int i11, @NonNull Consumer<Uri> consumer);
        }

        j() {
        }

        public static /* synthetic */ MediaMuxer B(u uVar, ParcelFileDescriptor parcelFileDescriptor, int i11, Consumer consumer) throws Throwable {
            MediaMuxer mediaMuxerA;
            MediaMuxer mediaMuxerA2;
            Uri uriFromFile = Uri.EMPTY;
            if (uVar instanceof r) {
                File fileD = ((r) uVar).d();
                if (!h1.d.a(fileD)) {
                    c0.y0.l("Recorder", "Failed to create folder for " + fileD.getAbsolutePath());
                }
                mediaMuxerA2 = new MediaMuxer(fileD.getAbsolutePath(), i11);
                uriFromFile = Uri.fromFile(fileD);
            } else if (uVar instanceof q) {
                if (Build.VERSION.SDK_INT < 26) {
                    throw new IOException("MediaMuxer doesn't accept FileDescriptor as output destination.");
                }
                mediaMuxerA2 = d1.c.a(parcelFileDescriptor.getFileDescriptor(), i11);
            } else {
                if (!(uVar instanceof t)) {
                    throw new AssertionError("Invalid output options type: " + uVar.getClass().getSimpleName());
                }
                t tVar = (t) uVar;
                ContentValues contentValues = new ContentValues(tVar.f());
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 29) {
                    contentValues.put("is_pending", (Integer) 1);
                }
                try {
                    Uri uriInsert = tVar.e().insert(tVar.d(), contentValues);
                    if (uriInsert == null) {
                        throw new IOException("Unable to create MediaStore entry.");
                    }
                    if (i12 < 26) {
                        String strB = h1.d.b(tVar.e(), uriInsert, "_data");
                        if (strB == null) {
                            throw new IOException("Unable to get path from uri " + uriInsert);
                        }
                        if (!h1.d.a(new File(strB))) {
                            c0.y0.l("Recorder", "Failed to create folder for " + strB);
                        }
                        mediaMuxerA = new MediaMuxer(strB, i11);
                    } else {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = tVar.e().openFileDescriptor(uriInsert, "rw");
                        mediaMuxerA = d1.c.a(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), i11);
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    uriFromFile = uriInsert;
                    mediaMuxerA2 = mediaMuxerA;
                } catch (RuntimeException e11) {
                    throw new IOException("Unable to create MediaStore entry by " + e11, e11);
                }
            }
            consumer.accept(uriFromFile);
            return mediaMuxerA2;
        }

        public static /* synthetic */ void C(ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e11) {
                c0.y0.d("Recorder", "Failed to close dup'd ParcelFileDescriptor", e11);
            }
        }

        private void I(Consumer<Uri> consumer, @NonNull Uri uri) {
            if (consumer != null) {
                this.f126321a.a();
                consumer.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        @NonNull
        static j J(@NonNull w wVar, long j11) {
            z0.k kVar = new z0.k(wVar.getOutputOptions(), wVar.getListenerExecutor(), wVar.c(), wVar.getIsAudioEnabled(), wVar.getIsPersistent(), j11);
            kVar.u0(wVar.getIsAudioInitialMuted());
            return kVar;
        }

        public static /* synthetic */ void c(String str, Uri uri) {
            if (uri == null) {
                c0.y0.c("Recorder", String.format("File scanning operation failed [path: %s]", str));
            } else {
                c0.y0.a("Recorder", String.format("File scan completed successfully [path: %s, URI: %s]", str, uri));
            }
        }

        public static /* synthetic */ void n(Uri uri) {
        }

        public static /* synthetic */ void o(t tVar, Context context, Uri uri) throws Throwable {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            String strB = h1.d.b(tVar.e(), uri, "_data");
            if (strB != null) {
                MediaScannerConnection.scanFile(context, new String[]{strB}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: z0.c1
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str, Uri uri2) {
                        t0.j.c(str, uri2);
                    }
                });
                return;
            }
            c0.y0.a("Recorder", "Skipping media scanner scan. Unable to retrieve file path from URI: " + uri);
        }

        public static /* synthetic */ void p(t tVar, Uri uri) {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_pending", (Integer) 0);
            tVar.e().update(uri, contentValues, null, null);
        }

        private void z0(@NonNull d2 d2Var) {
            if ((d2Var instanceof d2.d) || (d2Var instanceof d2.c)) {
                this.f126327g.k(Boolean.TRUE);
            } else if ((d2Var instanceof d2.b) || (d2Var instanceof d2.a)) {
                this.f126327g.k(Boolean.FALSE);
            }
        }

        void D0(@NonNull final d2 d2Var) {
            if (!Objects.equals(d2Var.c(), c0())) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + d2Var.c() + ", Expected: " + c0() + "]");
            }
            String str = "Sending VideoRecordEvent " + d2Var.getClass().getSimpleName();
            if (d2Var instanceof d2.a) {
                d2.a aVar = (d2.a) d2Var;
                if (aVar.m()) {
                    str = str + String.format(" [error: %s]", d2.a.i(aVar.k()));
                }
            }
            c0.y0.a("Recorder", str);
            z0(d2Var);
            if (T() == null || b0() == null) {
                return;
            }
            try {
                T().execute(new Runnable() { // from class: z0.b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f126072a.b0().accept(d2Var);
                    }
                });
            } catch (RejectedExecutionException e11) {
                c0.y0.d("Recorder", "The callback executor is invalid.", e11);
            }
        }

        void H(@NonNull Uri uri) {
            if (this.f126322b.get()) {
                I(this.f126325e.getAndSet(null), uri);
            }
        }

        abstract Executor T();

        abstract Consumer<d2> b0();

        @NonNull
        abstract u c0();

        @Override // java.lang.AutoCloseable
        public void close() {
            H(Uri.EMPTY);
        }

        abstract long e0();

        protected void finalize() throws Throwable {
            try {
                this.f126321a.d();
                Consumer<Uri> andSet = this.f126325e.getAndSet(null);
                if (andSet != null) {
                    I(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        @NonNull
        b3<Boolean> k0() {
            return this.f126327g;
        }

        abstract boolean n0();

        void r0(@NonNull final Context context) {
            if (this.f126322b.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            final u uVarC0 = c0();
            boolean z11 = uVarC0 instanceof q;
            Consumer<Uri> consumer = null;
            final ParcelFileDescriptor parcelFileDescriptorDup = z11 ? ((q) uVarC0).d().dup() : null;
            this.f126321a.c("finalizeRecording");
            this.f126323c.set(new d() { // from class: z0.w0
                @Override // z0.t0.j.d
                public final MediaMuxer a(int i11, Consumer consumer2) {
                    return t0.j.B(uVarC0, parcelFileDescriptorDup, i11, consumer2);
                }
            });
            if (n0()) {
                if (Build.VERSION.SDK_INT >= 31) {
                    this.f126324d.set(new a(context));
                } else {
                    this.f126324d.set(new b());
                }
            }
            if (uVarC0 instanceof t) {
                final t tVar = (t) uVarC0;
                consumer = Build.VERSION.SDK_INT >= 29 ? new Consumer() { // from class: z0.x0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        t0.j.p(tVar, (Uri) obj);
                    }
                } : new Consumer() { // from class: z0.y0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) throws Throwable {
                        t0.j.o(tVar, context, (Uri) obj);
                    }
                };
            } else if (z11) {
                consumer = new Consumer() { // from class: z0.z0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        t0.j.C(parcelFileDescriptorDup, (Uri) obj);
                    }
                };
            }
            if (consumer != null) {
                this.f126325e.set(consumer);
            }
        }

        boolean s0() {
            return this.f126326f.get();
        }

        abstract boolean t0();

        void u0(boolean z11) {
            this.f126326f.set(z11);
        }

        @NonNull
        androidx.camera.video.internal.audio.b w0(@NonNull c1.a aVar, @NonNull Executor executor) {
            if (!n0()) {
                throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
            }
            c andSet = this.f126324d.getAndSet(null);
            if (andSet != null) {
                return andSet.a(aVar, executor);
            }
            throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
        }

        @NonNull
        MediaMuxer y0(int i11, @NonNull Consumer<Uri> consumer) throws IOException {
            if (!this.f126322b.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            d andSet = this.f126323c.getAndSet(null);
            if (andSet == null) {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            try {
                return andSet.a(i11, consumer);
            } catch (RuntimeException e11) {
                throw new IOException("Failed to create MediaMuxer by " + e11, e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0.z1 f126331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h3 f126332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f126333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f126334d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f126335e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ScheduledFuture<?> f126336f = null;

        class a implements j0.c<g1.k> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b2 f126338a;

            a(b2 b2Var) {
                this.f126338a = b2Var;
            }

            public static /* synthetic */ void a(a aVar) {
                if (k.this.f126334d) {
                    return;
                }
                c0.y0.a("Recorder", "Retry setupVideo #" + k.this.f126335e);
                k kVar = k.this;
                kVar.k(kVar.f126331a, k.this.f126332b);
            }

            @Override // j0.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(g1.k kVar) {
                c0.y0.a("Recorder", "VideoEncoder is created. " + kVar);
                if (kVar == null) {
                    return;
                }
                u5.h.i(t0.this.f126273g0 == this.f126338a);
                u5.h.i(t0.this.H == null);
                t0.this.b0(this.f126338a);
                t0.this.U();
            }

            @Override // j0.c
            public void onFailure(@NonNull Throwable th2) {
                c0.y0.m("Recorder", "VideoEncoder Setup error: " + th2, th2);
                if (k.this.f126335e >= k.this.f126333c) {
                    t0.this.V(th2);
                    return;
                }
                k.e(k.this);
                k.this.f126336f = t0.o0(new Runnable() { // from class: z0.e1
                    @Override // java.lang.Runnable
                    public final void run() {
                        t0.k.a.a(this.f126116a);
                    }
                }, t0.this.f126268e, t0.f126259x0, TimeUnit.MILLISECONDS);
            }
        }

        k(@NonNull c0.z1 z1Var, h3 h3Var, int i11) {
            this.f126331a = z1Var;
            this.f126332b = h3Var;
            this.f126333c = i11;
        }

        public static /* synthetic */ void a(k kVar, c0.z1 z1Var, h3 h3Var) {
            kVar.getClass();
            if (!z1Var.t() && (!t0.this.f126273g0.n(z1Var) || t0.this.Q())) {
                g1.n nVar = t0.this.f126270f;
                t0 t0Var = t0.this;
                b2 b2Var = new b2(nVar, t0Var.f126268e, t0Var.f126266d);
                t0 t0Var2 = t0.this;
                com.google.common.util.concurrent.s<g1.k> sVarI = b2Var.i(z1Var, h3Var, (s) t0Var2.J(t0Var2.F), t0.this.f126295w);
                t0.this.f126273g0 = b2Var;
                j0.n.j(sVarI, kVar.new a(b2Var), t0.this.f126268e);
                return;
            }
            c0.y0.l("Recorder", "Ignore the SurfaceRequest " + z1Var + " isServiced: " + z1Var.t() + " VideoEncoderSession: " + t0.this.f126273g0 + " has been configured with a persistent in-progress recording.");
        }

        static /* synthetic */ int e(k kVar) {
            int i11 = kVar.f126335e;
            kVar.f126335e = i11 + 1;
            return i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(@NonNull final c0.z1 z1Var, @NonNull final h3 h3Var) {
            t0.this.n0().b(new Runnable() { // from class: z0.d1
                @Override // java.lang.Runnable
                public final void run() {
                    t0.k.a(this.f126104a, z1Var, h3Var);
                }
            }, t0.this.f126268e);
        }

        void j() {
            if (this.f126334d) {
                return;
            }
            this.f126334d = true;
            ScheduledFuture<?> scheduledFuture = this.f126336f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f126336f = null;
            }
        }

        void l() {
            k(this.f126331a, this.f126332b);
        }
    }

    enum l {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        x xVar = x.f126359c;
        a0 a0VarE = a0.e(Arrays.asList(xVar, x.f126358b, x.f126357a), p.a(xVar));
        f126251p0 = a0VarE;
        e2 e2VarA = e2.a().e(a0VarE).b(-1).a();
        f126252q0 = e2VarA;
        f126253r0 = s.a().e(-1).f(e2VarA).a();
        f126254s0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        f126255t0 = new g1.n() { // from class: z0.m0
            @Override // g1.n
            public final g1.k a(Executor executor, g1.m mVar) {
                return new g1.g0(executor, mVar);
            }
        };
        f126256u0 = new b1.f.a() { // from class: z0.n0
            @Override // b1.f.a
            public final b1.f a(u uVar) {
                return new b1.g(uVar);
            }
        };
        f126257v0 = i0.c.g(i0.c.d());
        f126258w0 = 3;
        f126259x0 = 1000L;
    }

    t0(Executor executor, @NonNull s sVar, int i11, @NonNull g1.n nVar, @NonNull g1.n nVar2, @NonNull b1.f.a aVar, long j11) {
        this.f126278j = androidx.camera.video.internal.compat.quirk.a.b(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.f126284m = l.CONFIGURING;
        this.f126286n = null;
        this.f126287o = 0;
        this.f126288p = null;
        this.f126289q = null;
        this.f126290r = 0L;
        this.f126291s = null;
        this.f126292t = false;
        this.f126293u = null;
        this.f126294v = null;
        this.f126295w = null;
        this.f126296x = new ArrayList();
        this.f126297y = null;
        this.f126298z = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = h.INITIALIZING;
        this.M = Uri.EMPTY;
        this.N = 0L;
        this.O = 0L;
        this.P = Long.MAX_VALUE;
        this.Q = 0;
        this.R = null;
        this.S = Long.MAX_VALUE;
        this.T = Long.MAX_VALUE;
        this.U = Long.MAX_VALUE;
        this.V = 0L;
        this.W = 0L;
        this.X = 1;
        this.Y = null;
        this.Z = null;
        this.f126261a0 = new o0.a(60);
        this.f126263b0 = null;
        this.f126265c0 = false;
        this.f126267d0 = c2.a.INACTIVE;
        this.f126269e0 = null;
        this.f126271f0 = false;
        this.f126275h0 = null;
        this.f126277i0 = 0.0d;
        this.f126279j0 = false;
        this.f126281k0 = null;
        this.f126283l0 = null;
        this.f126285m0 = Long.MAX_VALUE;
        this.f126264c = executor;
        executor = executor == null ? i0.c.d() : executor;
        this.f126266d = executor;
        Executor executorG = i0.c.g(executor);
        this.f126268e = executorG;
        this.F = androidx.camera.core.impl.e2.l(D(sVar));
        this.f126280k = i11;
        this.f126260a = androidx.camera.core.impl.e2.l(i1.d(this.f126287o, N(this.f126284m)));
        this.f126262b = androidx.camera.core.impl.e2.l(Boolean.FALSE);
        this.f126270f = nVar;
        this.f126272g = nVar2;
        this.f126274h = aVar;
        this.f126273g0 = new b2(nVar, executorG, executor);
        j11 = j11 == -1 ? 52428800L : j11;
        this.f126282l = j11;
        c0.y0.a("Recorder", "mRequiredFreeStorageBytes = " + h1.e.a(j11));
    }

    private void C() {
        while (!this.f126261a0.isEmpty()) {
            this.f126261a0.a();
        }
    }

    private static int C0(b1.i iVar, int i11) {
        if (iVar != null) {
            int iB = iVar.b();
            if (iB == 1) {
                return Build.VERSION.SDK_INT < 26 ? 0 : 2;
            }
            if (iB == 2) {
                return 0;
            }
            if (iB == 9) {
                return 1;
            }
        }
        return i11;
    }

    @NonNull
    private s D(@NonNull s sVar) {
        s.a aVarI = sVar.i();
        if (sVar.d().b() == -1) {
            aVarI.b(new Consumer() { // from class: z0.b0
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((e2.a) obj).b(t0.f126252q0.b());
                }
            });
        }
        return aVarI.a();
    }

    private void D0() {
        b2 b2Var = this.f126275h0;
        if (b2Var == null) {
            n0();
            return;
        }
        u5.h.i(b2Var.m() == this.H);
        c0.y0.a("Recorder", "Releasing video encoder: " + this.H);
        this.f126275h0.r();
        this.f126275h0 = null;
        this.H = null;
        this.I = null;
        r0(null);
    }

    private void E(@NonNull c0.z1 z1Var, @NonNull h3 h3Var, boolean z11) {
        if (z1Var.t()) {
            c0.y0.l("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        z1Var.v(this.f126268e, new c0.z1.i() { // from class: z0.o0
            @Override // c0.z1.i
            public final void a(c0.z1.h hVar) {
                this.f126199a.f126294v = hVar;
            }
        });
        Size sizeP = z1Var.p();
        c0.b0 b0VarN = z1Var.n();
        j1 j1VarK = K(z1Var.l().c());
        x xVarC = j1VarK.c(sizeP, b0VarN);
        c0.y0.a("Recorder", "Using supported quality of " + xVarC + " for surface size " + sizeP);
        if (xVarC != x.f126363g) {
            b1.i iVarE = j1VarK.e(xVarC, b0VarN);
            this.f126295w = iVarE;
            if (iVarE == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        k kVar = this.f126281k0;
        if (kVar != null) {
            kVar.j();
        }
        k kVar2 = new k(z1Var, h3Var, z11 ? f126258w0 : 0);
        this.f126281k0 = kVar2;
        kVar2.l();
    }

    private void F0(@NonNull final j jVar, boolean z11) {
        if (!this.f126296x.isEmpty()) {
            com.google.common.util.concurrent.s sVarK = j0.n.k(this.f126296x);
            if (!sVarK.isDone()) {
                sVarK.cancel(true);
            }
            this.f126296x.clear();
        }
        this.f126296x.add(androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: z0.r0
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return t0.u(this.f126215a, jVar, aVar);
            }
        }));
        if (O() && !z11) {
            this.f126296x.add(androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: z0.s0
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return t0.m(this.f126244a, jVar, aVar);
                }
            }));
        }
        j0.n.j(j0.n.k(this.f126296x), new f(), i0.c.b());
    }

    private void G(@NonNull j jVar, int i11, Throwable th2) {
        Uri uri = Uri.EMPTY;
        jVar.H(uri);
        jVar.D0(d2.b(jVar.c0(), h1.d(0L, 0L, z0.b.d(1, this.f126263b0, 0.0d)), v.b(uri), i11, th2));
    }

    @NonNull
    private List<g1.h> H(long j11) {
        ArrayList arrayList = new ArrayList();
        while (!this.f126261a0.isEmpty()) {
            g1.h hVarA = this.f126261a0.a();
            if (hVarA.x0() >= j11) {
                arrayList.add(hVarA);
            }
        }
        return arrayList;
    }

    private void H0(@NonNull l lVar) {
        if (!f126249n0.contains(this.f126284m)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f126284m);
        }
        if (!f126250o0.contains(lVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + lVar);
        }
        if (this.f126286n != lVar) {
            this.f126286n = lVar;
            this.f126260a.k(i1.e(this.f126287o, N(lVar), this.f126293u));
        }
    }

    @NonNull
    public static j1 K(@NonNull c0.n nVar) {
        return L(nVar, 0);
    }

    @NonNull
    public static j1 L(@NonNull c0.n nVar, int i11) {
        return new f1(i11, (androidx.camera.core.impl.i0) nVar, g1.q1.f66990d);
    }

    private int M(@NonNull h hVar) {
        int iOrdinal = hVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            return 1;
        }
        if (iOrdinal == 3) {
            j jVar = this.f126291s;
            if (jVar == null || !jVar.s0()) {
                return this.f126265c0 ? 2 : 0;
            }
            return 5;
        }
        if (iOrdinal == 4) {
            return 3;
        }
        if (iOrdinal == 5) {
            return 4;
        }
        throw new AssertionError("Invalid internal audio state: " + hVar);
    }

    @NonNull
    private i1.a N(@NonNull l lVar) {
        return (lVar == l.RECORDING || (lVar == l.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) androidx.camera.video.internal.compat.quirk.a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? i1.a.ACTIVE : i1.a.INACTIVE;
    }

    private static boolean R(@NonNull g1 g1Var, j jVar) {
        return jVar != null && g1Var.p() == jVar.e0();
    }

    @NonNull
    private j S(@NonNull l lVar) {
        boolean z11;
        if (lVar == l.PENDING_PAUSED) {
            z11 = true;
        } else {
            if (lVar != l.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z11 = false;
        }
        if (this.f126288p != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        j jVar = this.f126289q;
        if (jVar == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.f126288p = jVar;
        jVar.k0().c(i0.c.b(), new g());
        this.f126289q = null;
        if (z11) {
            s0(l.PAUSED);
            return jVar;
        }
        s0(l.RECORDING);
        return jVar;
    }

    static void T(@NonNull g1.k kVar) {
        if (kVar instanceof g1.g0) {
            ((g1.g0) kVar).W();
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:42:0x009f A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:46:0x00b4, B:11:0x0025, B:13:0x0029, B:15:0x002f, B:21:0x003a, B:23:0x0045, B:26:0x0052, B:27:0x006a, B:30:0x006e, B:32:0x0074, B:33:0x0084, B:35:0x0088, B:37:0x008e, B:41:0x0096, B:42:0x009f, B:44:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [z0.t0$j] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r8v0, types: [z0.t0] */
    private void X(@NonNull j jVar) {
        j jVarS;
        boolean z11;
        Object obj;
        Exception exc;
        int i11;
        int i12;
        int i13;
        c0.z1 z1Var;
        ?? r11;
        synchronized (this.f126276i) {
            try {
                j jVar2 = this.f126288p;
                if (jVar2 != jVar) {
                    throw new AssertionError("Active recording did not match finalized recording on finalize.");
                }
                jVar2.k0().f();
                jVarS = null;
                exc = null;
                jVarS = null;
                jVarS = null;
                jVarS = null;
                this.f126288p = null;
                int i14 = 1;
                switch (this.f126284m.ordinal()) {
                    case 1:
                        z11 = false;
                        if (this.f126267d0 == c2.a.INACTIVE) {
                            j jVar3 = this.f126289q;
                            this.f126289q = null;
                            s0(l.CONFIGURING);
                            exc = f126254s0;
                            i12 = 0;
                            i13 = 4;
                            i11 = 0;
                            r11 = jVar3;
                        } else {
                            if (this.f126278j) {
                                this.D = null;
                                z1Var = this.A;
                                if (z1Var != null || z1Var.t()) {
                                    i14 = 0;
                                }
                                H0(l.CONFIGURING);
                                i11 = i14;
                                i12 = 0;
                                i13 = i12;
                            } else if (this.H != null) {
                                exc = null;
                                i11 = 0;
                                i12 = 0;
                                i13 = 0;
                                jVarS = S(this.f126284m);
                            } else {
                                obj = null;
                                exc = null;
                                i11 = 0;
                                i12 = i11;
                                i13 = i12;
                                r11 = obj;
                            }
                            r11 = exc;
                        }
                        break;
                    case 2:
                        z11 = true;
                        if (this.f126267d0 == c2.a.INACTIVE) {
                            j jVar4 = this.f126289q;
                            this.f126289q = null;
                            s0(l.CONFIGURING);
                            exc = f126254s0;
                            i12 = 0;
                            i13 = 4;
                            i11 = 0;
                            r11 = jVar4;
                        } else {
                            if (this.f126278j) {
                                this.D = null;
                                z1Var = this.A;
                                if (z1Var != null) {
                                    i14 = 0;
                                } else {
                                    i14 = 0;
                                }
                                H0(l.CONFIGURING);
                                i11 = i14;
                                i12 = 0;
                                i13 = i12;
                            } else if (this.H != null) {
                                exc = null;
                                i11 = 0;
                                i12 = 0;
                                i13 = 0;
                                jVarS = S(this.f126284m);
                            } else {
                                obj = null;
                                exc = null;
                                i11 = 0;
                                i12 = i11;
                                i13 = i12;
                                r11 = obj;
                            }
                            r11 = exc;
                        }
                        break;
                    case 3:
                        throw new AssertionError("Unexpected state on finalize of recording: " + this.f126284m);
                    case 4:
                    case 5:
                    case 6:
                        if (!this.f126278j) {
                            s0(l.IDLING);
                            obj = null;
                            exc = null;
                            z11 = false;
                            i11 = 0;
                            i12 = i11;
                            i13 = i12;
                            r11 = obj;
                        } else {
                            this.D = null;
                            c0.z1 z1Var2 = this.A;
                            if (z1Var2 == null || z1Var2.t()) {
                                i14 = 0;
                            }
                            s0(l.CONFIGURING);
                            i11 = i14;
                            z11 = false;
                            i12 = 0;
                            i13 = i12;
                            r11 = exc;
                        }
                        break;
                    case 7:
                        exc = null;
                        i12 = 1;
                        z11 = false;
                        i11 = 0;
                        i13 = 0;
                        r11 = exc;
                        break;
                    default:
                        obj = null;
                        exc = null;
                        z11 = false;
                        i11 = 0;
                        i12 = i11;
                        i13 = i12;
                        r11 = obj;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 != 0) {
            E(this.A, this.B, false);
            return;
        }
        if (i12 != 0) {
            i0();
            return;
        }
        if (jVarS != null) {
            if (this.f126278j) {
                throw new AssertionError("Attempt to start a pending recording while the Recorder is waiting for a new surface request.");
            }
            z0(jVarS, z11);
        } else if (r11 != 0) {
            G(r11, i13, exc);
        }
    }

    private void Y() {
        boolean z11;
        c0.z1 z1Var;
        synchronized (this.f126276i) {
            try {
                switch (this.f126284m.ordinal()) {
                    case 1:
                    case 2:
                        H0(l.CONFIGURING);
                        z11 = true;
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (Q()) {
                            z11 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        s0(l.CONFIGURING);
                        z11 = true;
                        break;
                    default:
                        z11 = true;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f126271f0 = false;
        if (!z11 || (z1Var = this.A) == null || z1Var.t()) {
            return;
        }
        E(this.A, this.B, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(@NonNull c0.z1 z1Var, @NonNull h3 h3Var) {
        c0.z1 z1Var2 = this.A;
        if (z1Var2 != null && !z1Var2.t()) {
            this.A.x();
        }
        this.A = z1Var;
        this.B = h3Var;
        E(z1Var, h3Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(@NonNull j jVar) {
        if (this.f126291s != jVar || this.f126292t) {
            return;
        }
        if (O()) {
            this.J.d();
        }
        this.H.d();
        j jVar2 = this.f126291s;
        jVar2.D0(d2.e(jVar2.c0(), I()));
    }

    @NonNull
    private w f0(@NonNull Context context, @NonNull u uVar) {
        u5.h.h(uVar, "The OutputOptions cannot be null.");
        return new w(context, this, uVar);
    }

    private void g0() {
        androidx.camera.video.internal.audio.b bVar = this.G;
        if (bVar == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.G = null;
        c0.y0.a("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(bVar.hashCode())));
        j0.n.j(bVar.w(), new b(bVar), i0.c.b());
    }

    private void i0() {
        if (this.J != null) {
            c0.y0.a("Recorder", "Releasing audio encoder.");
            this.J.release();
            this.J = null;
            this.K = null;
        }
        if (this.G != null) {
            g0();
        }
        p0(h.INITIALIZING);
        j0();
    }

    private void j0() {
        if (this.H != null) {
            c0.y0.a("Recorder", "Releasing video encoder.");
            D0();
        }
        Y();
    }

    private void k0() {
        if (f126249n0.contains(this.f126284m)) {
            s0(this.f126286n);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.f126284m);
    }

    public static /* synthetic */ Object m(final t0 t0Var, j jVar, final androidx.concurrent.futures.c.a aVar) {
        t0Var.getClass();
        Consumer consumer = new Consumer() { // from class: z0.f0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                t0.r(this.f126128a, aVar, (Throwable) obj);
            }
        };
        t0Var.G.A(t0Var.f126268e, t0Var.new d(consumer));
        t0Var.J.c(t0Var.new e(aVar, consumer, jVar), t0Var.f126268e);
        return "audioEncodingFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(@NonNull j jVar) {
        if (this.f126291s != jVar || this.f126292t) {
            return;
        }
        if (O()) {
            this.J.start();
        }
        g1.k kVar = this.H;
        if (kVar == null) {
            this.f126279j0 = true;
            return;
        }
        kVar.start();
        j jVar2 = this.f126291s;
        jVar2.D0(d2.f(jVar2.c0(), I()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public com.google.common.util.concurrent.s<Void> n0() {
        c0.y0.a("Recorder", "Try to safely release video encoder: " + this.H);
        return this.f126273g0.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static ScheduledFuture<?> o0(@NonNull final Runnable runnable, @NonNull final Executor executor, long j11, TimeUnit timeUnit) {
        return i0.c.e().schedule(new Runnable() { // from class: z0.g0
            @Override // java.lang.Runnable
            public final void run() {
                executor.execute(runnable);
            }
        }, j11, timeUnit);
    }

    public static /* synthetic */ void p(g1.k kVar) {
        c0.y0.a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (androidx.camera.video.internal.compat.quirk.a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
            T(kVar);
        }
    }

    public static /* synthetic */ void q(t0 t0Var) {
        c0.z1 z1Var = t0Var.A;
        if (z1Var == null) {
            throw new AssertionError("surface request is required to retry initialization.");
        }
        t0Var.E(z1Var, t0Var.B, false);
    }

    public static /* synthetic */ void r(t0 t0Var, androidx.concurrent.futures.c.a aVar, Throwable th2) {
        if (t0Var.f126263b0 == null) {
            if (th2 instanceof EncodeException) {
                t0Var.p0(h.ERROR_ENCODER);
            } else {
                t0Var.p0(h.ERROR_SOURCE);
            }
            t0Var.f126263b0 = th2;
            t0Var.G0();
            aVar.c(null);
        }
    }

    private void t0(int i11) {
        if (this.f126287o == i11) {
            return;
        }
        c0.y0.a("Recorder", "Transitioning streamId: " + this.f126287o + " --> " + i11);
        this.f126287o = i11;
        this.f126260a.k(i1.e(i11, N(this.f126284m), this.f126293u));
    }

    public static /* synthetic */ Object u(t0 t0Var, j jVar, androidx.concurrent.futures.c.a aVar) {
        t0Var.H.c(t0Var.new c(aVar, jVar), t0Var.f126268e);
        return "videoEncodingFuture";
    }

    private void v0(@NonNull j jVar) {
        s sVar = (s) J(this.F);
        f1.e eVarC = f1.b.c(sVar, this.f126295w);
        h3 h3Var = h3.UPTIME;
        c1.a aVarD = f1.b.d(eVarC, sVar.b());
        if (this.G != null) {
            g0();
        }
        androidx.camera.video.internal.audio.b bVarW0 = w0(jVar, aVarD);
        this.G = bVarW0;
        c0.y0.a("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(bVarW0.hashCode())));
        g1.k kVarA = this.f126272g.a(this.f126266d, f1.b.b(eVarC, h3Var, aVarD, sVar.b()));
        this.J = kVarA;
        g1.k.b bVarB = kVarA.b();
        if (!(bVarB instanceof g1.k.a)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        this.G.B((g1.k.a) bVarB);
    }

    @NonNull
    private androidx.camera.video.internal.audio.b w0(@NonNull j jVar, @NonNull c1.a aVar) {
        return jVar.w0(aVar, f126257v0);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    @SuppressLint({"MissingPermission"})
    private void y0(@NonNull j jVar) {
        h hVar;
        if (this.f126291s != null) {
            throw new AssertionError("Attempted to start a new recording while another was in progress.");
        }
        this.f126291s = jVar;
        b1.f fVarA = this.f126274h.a(jVar.c0());
        this.f126283l0 = fVarA;
        long jA = fVarA.a();
        c0.y0.a("Recorder", "availableBytes = " + h1.e.a(jA));
        long j11 = this.f126282l;
        if (jA < j11) {
            F(3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(jA), Long.valueOf(this.f126282l))));
            return;
        }
        this.f126285m0 = jA - j11;
        if (jVar.c0().b() > 0) {
            this.V = Math.round(jVar.c0().b() * 0.95d);
            c0.y0.a("Recorder", "File size limit in bytes: " + this.V);
        } else {
            this.V = 0L;
        }
        if (jVar.c0().a() > 0) {
            this.W = TimeUnit.MILLISECONDS.toNanos(jVar.c0().a());
            c0.y0.a("Recorder", "Duration limit in nanoseconds: " + this.W);
        } else {
            this.W = 0L;
        }
        int iOrdinal = this.L.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                p0(jVar.n0() ? h.ENABLED : h.DISABLED);
            } else if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.L);
            }
        } else if (jVar.n0()) {
            if (!P()) {
                throw new AssertionError("The Recorder doesn't support recording with audio");
            }
            try {
                if (!this.f126291s.t0() || this.J == null) {
                    v0(jVar);
                }
                p0(h.ENABLED);
            } catch (AudioSourceAccessException e11) {
                e = e11;
                c0.y0.d("Recorder", "Unable to create audio resource with error: ", e);
                if (e instanceof InvalidConfigException) {
                    hVar = h.ERROR_ENCODER;
                } else {
                    hVar = h.ERROR_SOURCE;
                }
                p0(hVar);
                this.f126263b0 = e;
            } catch (InvalidConfigException e12) {
                e = e12;
                c0.y0.d("Recorder", "Unable to create audio resource with error: ", e);
                if (e instanceof InvalidConfigException) {
                    hVar = h.ERROR_ENCODER;
                } else {
                    hVar = h.ERROR_SOURCE;
                }
                p0(hVar);
                this.f126263b0 = e;
            }
        }
        F0(jVar, false);
        if (O()) {
            this.G.D(jVar.s0());
            this.J.start();
        }
        this.H.start();
        j jVar2 = this.f126291s;
        jVar2.D0(d2.g(jVar2.c0(), I()));
    }

    private void z0(@NonNull j jVar, boolean z11) {
        y0(jVar);
        if (z11) {
            d0(jVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    void A0(@NonNull g1 g1Var, int i11, Throwable th2) {
        Throwable th3;
        final int i12;
        final Throwable th4;
        synchronized (this.f126276i) {
            try {
                try {
                    if (!R(g1Var, this.f126289q)) {
                        try {
                            if (!R(g1Var, this.f126288p)) {
                                c0.y0.a("Recorder", "stop() called on a recording that is no longer active: " + g1Var.o());
                                return;
                            }
                        } catch (Throwable th5) {
                            th3 = th5;
                            throw th3;
                        }
                    }
                    j jVar = null;
                    switch (this.f126284m) {
                        case CONFIGURING:
                        case IDLING:
                            throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                        case PENDING_RECORDING:
                        case PENDING_PAUSED:
                            i12 = i11;
                            th4 = th2;
                            u5.h.i(R(g1Var, this.f126289q));
                            j jVar2 = this.f126289q;
                            this.f126289q = null;
                            k0();
                            jVar = jVar2;
                            if (jVar != null) {
                                if (i12 == 10) {
                                    c0.y0.c("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                                }
                                G(jVar, 8, new RuntimeException("Recording was stopped before any data could be produced.", th4));
                                return;
                            }
                            return;
                        case RECORDING:
                        case PAUSED:
                            s0(l.STOPPING);
                            final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                            final j jVar3 = this.f126288p;
                            i12 = i11;
                            th4 = th2;
                            this.f126268e.execute(new Runnable() { // from class: z0.q0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f126207a.B0(jVar3, micros, i12, th4);
                                }
                            });
                            if (jVar != null) {
                                if (i12 == 10) {
                                    c0.y0.c("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                                }
                                G(jVar, 8, new RuntimeException("Recording was stopped before any data could be produced.", th4));
                                return;
                            }
                            return;
                        case STOPPING:
                        case RESETTING:
                            u5.h.i(R(g1Var, this.f126288p));
                        default:
                            i12 = i11;
                            th4 = th2;
                            if (jVar != null) {
                                if (i12 == 10) {
                                    c0.y0.c("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                                }
                                G(jVar, 8, new RuntimeException("Recording was stopped before any data could be produced.", th4));
                                return;
                            }
                            return;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    th3 = th;
                    throw th3;
                }
            } catch (Throwable th7) {
                th = th7;
                th3 = th;
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B0(@NonNull j jVar, long j11, int i11, Throwable th2) {
        if (this.f126291s != jVar || this.f126292t) {
            return;
        }
        this.f126292t = true;
        this.X = i11;
        this.Y = th2;
        if (O()) {
            C();
            this.J.a(j11);
        }
        g1.h hVar = this.Z;
        if (hVar != null) {
            hVar.close();
            this.Z = null;
        }
        if (this.f126267d0 != c2.a.ACTIVE_NON_STREAMING) {
            final g1.k kVar = this.H;
            this.f126269e0 = o0(new Runnable() { // from class: z0.d0
                @Override // java.lang.Runnable
                public final void run() {
                    t0.p(kVar);
                }
            }, this.f126268e, 1000L, TimeUnit.MILLISECONDS);
        } else {
            T(this.H);
        }
        this.H.a(j11);
    }

    void E0() {
        boolean z11;
        j jVarS;
        int i11;
        Throwable th2;
        synchronized (this.f126276i) {
            try {
                int iOrdinal = this.f126284m.ordinal();
                boolean z12 = true;
                z11 = false;
                i11 = 0;
                jVarS = null;
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                    }
                    th2 = jVarS;
                } else {
                    z12 = false;
                }
                if (this.f126288p == null && !this.f126271f0) {
                    if (this.f126267d0 == c2.a.INACTIVE) {
                        jVarS = this.f126289q;
                        this.f126289q = null;
                        k0();
                        i11 = 4;
                        z11 = z12;
                        th2 = f126254s0;
                    } else if (this.H != null) {
                        i11 = 0;
                        z11 = z12;
                        th2 = null;
                        jVarS = S(this.f126284m);
                        jVarS = null;
                    }
                }
                z11 = z12;
                th2 = jVarS;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (jVarS != null) {
            z0(jVarS, z11);
        } else if (jVarS != null) {
            G(jVarS, i11, th2);
        }
    }

    void F(int i11, Throwable th2) {
        if (this.f126291s == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        MediaMuxer mediaMuxer = this.E;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.E.release();
            } catch (IllegalStateException e11) {
                c0.y0.d("Recorder", "MediaMuxer failed to stop or release with error: " + e11.getMessage(), e11);
                if (i11 == 0) {
                    i11 = ((b1.f) u5.h.g(this.f126283l0)).a() < this.f126282l ? 3 : 1;
                }
            }
            this.E = null;
        } else if (i11 == 0) {
            i11 = 8;
        }
        this.f126291s.H(this.M);
        u uVarC0 = this.f126291s.c0();
        h1 h1VarI = I();
        v vVarB = v.b(this.M);
        this.f126291s.D0(i11 == 0 ? d2.a(uVarC0, h1VarI, vVarB) : d2.b(uVarC0, h1VarI, vVarB, i11, th2));
        j jVar = this.f126291s;
        this.f126291s = null;
        this.f126292t = false;
        this.f126297y = null;
        this.f126298z = null;
        this.f126296x.clear();
        this.M = Uri.EMPTY;
        this.N = 0L;
        this.O = 0L;
        this.P = Long.MAX_VALUE;
        this.S = Long.MAX_VALUE;
        this.T = Long.MAX_VALUE;
        this.U = Long.MAX_VALUE;
        this.X = 1;
        this.Y = null;
        this.f126263b0 = null;
        this.f126277i0 = 0.0d;
        this.f126283l0 = null;
        this.f126285m0 = Long.MAX_VALUE;
        C();
        q0(null);
        int iOrdinal = this.L.ordinal();
        if (iOrdinal == 1) {
            throw new AssertionError("Incorrectly finalize recording when audio state is IDLING");
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            p0(h.IDLING);
            this.G.F();
        } else if (iOrdinal == 4 || iOrdinal == 5) {
            p0(h.INITIALIZING);
        }
        X(jVar);
    }

    void G0() {
        j jVar = this.f126291s;
        if (jVar != null) {
            jVar.D0(d2.h(jVar.c0(), I()));
        }
    }

    @NonNull
    h1 I() {
        return h1.d(this.O, this.N, z0.b.d(M(this.L), this.f126263b0, this.f126277i0));
    }

    void I0(@NonNull g1.h hVar, @NonNull j jVar) throws Throwable {
        long size = this.N + hVar.size();
        long j11 = this.V;
        if (j11 != 0 && size > j11) {
            c0.y0.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.V)));
            W(jVar, 2, null);
            return;
        }
        long jX0 = hVar.x0();
        long j12 = this.S;
        if (j12 == Long.MAX_VALUE) {
            this.S = jX0;
            c0.y0.a("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(jX0), b1.d.c(this.S)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jX0 - Math.min(this.P, j12));
            u5.h.j(this.U != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = nanos + timeUnit.toNanos(jX0 - this.U);
            long j13 = this.W;
            if (j13 != 0 && nanos2 > j13) {
                c0.y0.a("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.W)));
                W(jVar, 9, null);
                return;
            }
        }
        try {
            this.E.writeSampleData(this.f126297y.intValue(), hVar.g(), hVar.f0());
            this.N = size;
            this.U = jX0;
        } catch (IllegalStateException e11) {
            W(jVar, ((b1.f) u5.h.g(this.f126283l0)).a() < this.f126282l ? 3 : 1, e11);
        }
    }

    <T> T J(@NonNull b3<T> b3Var) {
        try {
            return b3Var.b().get();
        } catch (InterruptedException | ExecutionException e11) {
            throw new IllegalStateException(e11);
        }
    }

    void J0(@NonNull g1.h hVar, @NonNull j jVar) throws Throwable {
        if (this.f126298z == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = this.N + hVar.size();
        long j11 = this.V;
        long nanos = 0;
        if (j11 != 0 && size > j11) {
            c0.y0.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.V)));
            W(jVar, 2, null);
            return;
        }
        long jX0 = hVar.x0();
        long j12 = this.P;
        if (j12 == Long.MAX_VALUE) {
            this.P = jX0;
            c0.y0.a("Recorder", String.format("First video time: %d (%s)", Long.valueOf(jX0), b1.d.c(this.P)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            nanos = timeUnit.toNanos(jX0 - Math.min(j12, this.S));
            u5.h.j(this.T != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = timeUnit.toNanos(jX0 - this.T) + nanos;
            long j13 = this.W;
            if (j13 != 0 && nanos2 > j13) {
                c0.y0.a("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.W)));
                W(jVar, 9, null);
                return;
            }
        }
        try {
            this.E.writeSampleData(this.f126298z.intValue(), hVar.g(), hVar.f0());
            this.N = size;
            this.O = nanos;
            this.T = jX0;
            G0();
            if (size > this.f126285m0) {
                long jA = ((b1.f) u5.h.g(this.f126283l0)).a();
                c0.y0.a("Recorder", "availableBytes = " + h1.e.a(jA));
                long j14 = this.f126282l;
                if (jA < j14) {
                    W(jVar, 3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(jA), Long.valueOf(this.f126282l))));
                } else {
                    this.f126285m0 = jA - j14;
                }
            }
        } catch (IllegalStateException e11) {
            W(jVar, ((b1.f) u5.h.g(this.f126283l0)).a() < this.f126282l ? 3 : 1, e11);
        }
    }

    boolean O() {
        return this.L == h.ENABLED;
    }

    boolean P() {
        return ((s) J(this.F)).b().c() != 0;
    }

    boolean Q() {
        j jVar = this.f126291s;
        return jVar != null && jVar.t0();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:5:0x000c, B:32:0x0089, B:7:0x0011, B:10:0x001d, B:13:0x0023, B:14:0x002a, B:17:0x002e, B:18:0x003c, B:19:0x0054, B:22:0x0058, B:26:0x0061, B:28:0x0067, B:29:0x0073, B:30:0x007f), top: B:48:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0067 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:5:0x000c, B:32:0x0089, B:7:0x0011, B:10:0x001d, B:13:0x0023, B:14:0x002a, B:17:0x002e, B:18:0x003c, B:19:0x0054, B:22:0x0058, B:26:0x0061, B:28:0x0067, B:29:0x0073, B:30:0x007f), top: B:48:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:5:0x000c, B:32:0x0089, B:7:0x0011, B:10:0x001d, B:13:0x0023, B:14:0x002a, B:17:0x002e, B:18:0x003c, B:19:0x0054, B:22:0x0058, B:26:0x0061, B:28:0x0067, B:29:0x0073, B:30:0x007f), top: B:48:0x0003 }] */
    void U() {
        j jVarS;
        boolean z11;
        Exception exc;
        int i11;
        int i12;
        j jVar;
        synchronized (this.f126276i) {
            try {
                jVarS = null;
                switch (this.f126284m) {
                    case CONFIGURING:
                        s0(l.IDLING);
                        jVar = null;
                        exc = null;
                        z11 = false;
                        i11 = 0;
                        i12 = i11;
                        break;
                    case PENDING_RECORDING:
                        z11 = false;
                        if (this.f126288p != null) {
                            jVar = null;
                            exc = null;
                            i11 = 0;
                            i12 = i11;
                        } else if (this.f126267d0 == c2.a.INACTIVE) {
                            jVar = this.f126289q;
                            this.f126289q = null;
                            k0();
                            exc = f126254s0;
                            i11 = 4;
                            i12 = 0;
                        } else {
                            exc = null;
                            i11 = 0;
                            i12 = 0;
                            jVarS = S(this.f126284m);
                            jVar = null;
                        }
                        break;
                    case PENDING_PAUSED:
                        z11 = true;
                        if (this.f126288p != null) {
                            jVar = null;
                            exc = null;
                            i11 = 0;
                            i12 = i11;
                        } else if (this.f126267d0 == c2.a.INACTIVE) {
                            jVar = this.f126289q;
                            this.f126289q = null;
                            k0();
                            exc = f126254s0;
                            i11 = 4;
                            i12 = 0;
                        } else {
                            exc = null;
                            i11 = 0;
                            i12 = 0;
                            jVarS = S(this.f126284m);
                            jVar = null;
                        }
                        break;
                    case IDLING:
                    case RESETTING:
                        throw new AssertionError("Incorrectly invoke onConfigured() in state " + this.f126284m);
                    case RECORDING:
                        z11 = false;
                        u5.h.j(Q(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                        i12 = 1;
                        jVar = null;
                        exc = null;
                        i11 = 0;
                        break;
                    case PAUSED:
                        z11 = true;
                        u5.h.j(Q(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                        i12 = 1;
                        jVar = null;
                        exc = null;
                        i11 = 0;
                        break;
                    case STOPPING:
                        if (!this.f126278j) {
                            throw new AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                        }
                        jVar = null;
                        exc = null;
                        z11 = false;
                        i11 = 0;
                        i12 = i11;
                        break;
                        break;
                    case ERROR:
                        c0.y0.c("Recorder", "onConfigured() was invoked when the Recorder had encountered error");
                        jVar = null;
                        exc = null;
                        z11 = false;
                        i11 = 0;
                        i12 = i11;
                        break;
                    default:
                        jVar = null;
                        exc = null;
                        z11 = false;
                        i11 = 0;
                        i12 = i11;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i12 == 0) {
            if (jVarS != null) {
                z0(jVarS, z11);
                return;
            } else {
                if (jVar != null) {
                    G(jVar, i11, exc);
                    return;
                }
                return;
            }
        }
        F0(this.f126291s, true);
        this.H.start();
        if (this.f126279j0) {
            j jVar2 = this.f126291s;
            jVar2.D0(d2.f(jVar2.c0(), I()));
            this.f126279j0 = false;
        }
        if (z11) {
            this.H.d();
        }
    }

    void V(Throwable th2) {
        j jVar;
        synchronized (this.f126276i) {
            try {
                jVar = null;
                switch (this.f126284m) {
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        j jVar2 = this.f126289q;
                        this.f126289q = null;
                        jVar = jVar2;
                    case CONFIGURING:
                        t0(-1);
                        s0(l.ERROR);
                        break;
                    case IDLING:
                    case RECORDING:
                    case PAUSED:
                    case STOPPING:
                    case RESETTING:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.f126284m + ": " + th2);
                    default:
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (jVar != null) {
            G(jVar, 7, th2);
        }
    }

    void W(@NonNull j jVar, int i11, Throwable th2) throws Throwable {
        Throwable th3;
        if (jVar != this.f126291s) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.f126276i) {
            try {
                try {
                    boolean z11 = false;
                    switch (this.f126284m) {
                        case CONFIGURING:
                        case IDLING:
                        case ERROR:
                            throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f126284m);
                        case RECORDING:
                        case PAUSED:
                            try {
                                s0(l.STOPPING);
                                z11 = true;
                                break;
                            } catch (Throwable th4) {
                                th3 = th4;
                                throw th3;
                            }
                        case PENDING_RECORDING:
                        case PENDING_PAUSED:
                        case STOPPING:
                        case RESETTING:
                            if (jVar != this.f126288p) {
                                throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                            }
                        default:
                            if (z11) {
                                B0(jVar, -1L, i11, th2);
                                return;
                            }
                            return;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th3 = th;
                    throw th3;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(@NonNull c2.a aVar) throws Throwable {
        ScheduledFuture<?> scheduledFuture;
        g1.k kVar;
        c2.a aVar2 = this.f126267d0;
        this.f126267d0 = aVar;
        if (aVar2 == aVar) {
            c0.y0.a("Recorder", "Video source transitions to the same state: " + aVar);
            return;
        }
        c0.y0.a("Recorder", "Video source has transitioned to state: " + aVar);
        if (aVar != c2.a.INACTIVE) {
            if (aVar != c2.a.ACTIVE_NON_STREAMING || (scheduledFuture = this.f126269e0) == null || !scheduledFuture.cancel(false) || (kVar = this.H) == null) {
                return;
            }
            T(kVar);
            return;
        }
        if (this.D == null) {
            k kVar2 = this.f126281k0;
            if (kVar2 != null) {
                kVar2.j();
                this.f126281k0 = null;
            }
            h0(4, null, false);
            return;
        }
        this.f126271f0 = true;
        j jVar = this.f126291s;
        if (jVar == null || jVar.t0()) {
            return;
        }
        W(this.f126291s, 4, null);
    }

    @Override // z0.c2
    public void a(@NonNull c0.z1 z1Var) {
        b(z1Var, h3.UPTIME);
    }

    @Override // z0.c2
    public void b(@NonNull final c0.z1 z1Var, @NonNull final h3 h3Var) {
        synchronized (this.f126276i) {
            try {
                c0.y0.a("Recorder", "Surface is requested in state: " + this.f126284m + ", Current surface: " + this.f126287o);
                if (this.f126284m == l.ERROR) {
                    s0(l.CONFIGURING);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f126268e.execute(new Runnable() { // from class: z0.i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f126152a.a0(z1Var, h3Var);
            }
        });
    }

    void b0(@NonNull b2 b2Var) {
        g1.k kVarM = b2Var.m();
        this.H = kVarM;
        this.R = ((g1.o1) kVarM.getEncoderInfo()).c();
        this.Q = this.H.g();
        Surface surfaceK = b2Var.k();
        this.D = surfaceK;
        r0(surfaceK);
        b2Var.p(this.f126268e, new g1.k.c.a() { // from class: z0.h0
            @Override // g1.k.c.a
            public final void a(Surface surface) {
                this.f126149a.r0(surface);
            }
        });
        j0.n.j(b2Var.l(), new a(b2Var), this.f126268e);
    }

    @Override // z0.c2
    @NonNull
    public g2<s> c() {
        return this.F;
    }

    void c0(@NonNull g1 g1Var) {
        synchronized (this.f126276i) {
            try {
                if (!R(g1Var, this.f126289q) && !R(g1Var, this.f126288p)) {
                    c0.y0.a("Recorder", "pause() called on a recording that is no longer active: " + g1Var.o());
                    return;
                }
                int iOrdinal = this.f126284m.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        s0(l.PENDING_PAUSED);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            s0(l.PAUSED);
                            final j jVar = this.f126288p;
                            this.f126268e.execute(new Runnable() { // from class: z0.p0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f126202a.d0(jVar);
                                }
                            });
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Called pause() from invalid state: " + this.f126284m);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z0.c2
    @NonNull
    public j1 d(@NonNull c0.n nVar) {
        return L(nVar, this.f126280k);
    }

    @Override // z0.c2
    @NonNull
    public g2<i1> e() {
        return this.f126260a;
    }

    @NonNull
    public w e0(@NonNull Context context, @NonNull r rVar) {
        return f0(context, rVar);
    }

    @Override // z0.c2
    public void f(@NonNull final c2.a aVar) {
        this.f126268e.execute(new Runnable() { // from class: z0.e0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f126114a.Z(aVar);
            }
        });
    }

    @Override // z0.c2
    @NonNull
    public g2<Boolean> g() {
        return this.f126262b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    void h0(int i11, Throwable th2, boolean z11) {
        boolean z12;
        boolean z13;
        synchronized (this.f126276i) {
            try {
                z12 = true;
                z13 = false;
                switch (this.f126284m) {
                    case CONFIGURING:
                    case IDLING:
                    case ERROR:
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        H0(l.RESETTING);
                        break;
                    case RECORDING:
                    case PAUSED:
                        u5.h.j(this.f126291s != null, "In-progress recording shouldn't be null when in state " + this.f126284m);
                        if (this.f126288p != this.f126291s) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!Q()) {
                            s0(l.RESETTING);
                            z13 = true;
                            z12 = false;
                        }
                        break;
                        break;
                    case STOPPING:
                        s0(l.RESETTING);
                        z12 = false;
                        break;
                    case RESETTING:
                    default:
                        z12 = false;
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z12) {
            if (z13) {
                B0(this.f126291s, -1L, i11, th2);
            }
        } else if (z11) {
            j0();
        } else {
            i0();
        }
    }

    void l0(@NonNull g1 g1Var) {
        synchronized (this.f126276i) {
            try {
                if (!R(g1Var, this.f126289q) && !R(g1Var, this.f126288p)) {
                    c0.y0.a("Recorder", "resume() called on a recording that is no longer active: " + g1Var.o());
                    return;
                }
                int iOrdinal = this.f126284m.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 5) {
                        s0(l.RECORDING);
                        final j jVar = this.f126288p;
                        this.f126268e.execute(new Runnable() { // from class: z0.c0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f126098a.m0(jVar);
                            }
                        });
                    } else if (iOrdinal == 2) {
                        s0(l.PENDING_RECORDING);
                    } else if (iOrdinal != 3) {
                    }
                    return;
                }
                throw new IllegalStateException("Called resume() from invalid state: " + this.f126284m);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void p0(@NonNull h hVar) {
        c0.y0.a("Recorder", "Transitioning audio state: " + this.L + " --> " + hVar);
        this.L = hVar;
    }

    void q0(c0.z1.h hVar) {
        c0.y0.a("Recorder", "Update stream transformation info: " + hVar);
        this.f126293u = hVar;
        synchronized (this.f126276i) {
            this.f126260a.k(i1.e(this.f126287o, N(this.f126284m), hVar));
        }
    }

    void r0(Surface surface) {
        int iHashCode;
        if (this.C == surface) {
            return;
        }
        this.C = surface;
        synchronized (this.f126276i) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                iHashCode = 0;
            }
            t0(iHashCode);
        }
    }

    void s0(@NonNull l lVar) {
        if (this.f126284m == lVar) {
            throw new AssertionError("Attempted to transition to state " + lVar + ", but Recorder is already in state " + lVar);
        }
        c0.y0.a("Recorder", "Transitioning Recorder internal state: " + this.f126284m + " --> " + lVar);
        Set<l> set = f126249n0;
        i1.a aVarN = null;
        if (set.contains(lVar)) {
            if (!set.contains(this.f126284m)) {
                if (!f126250o0.contains(this.f126284m)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f126284m);
                }
                l lVar2 = this.f126284m;
                this.f126286n = lVar2;
                aVarN = N(lVar2);
            }
        } else if (this.f126286n != null) {
            this.f126286n = null;
        }
        this.f126284m = lVar;
        if (aVarN == null) {
            aVarN = N(lVar);
        }
        this.f126260a.k(i1.e(this.f126287o, aVarN, this.f126293u));
    }

    void u0(@NonNull j jVar) {
        if (this.E != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        if (O() && this.f126261a0.isEmpty()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        g1.h hVar = this.Z;
        if (hVar == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.Z = null;
            List<g1.h> listH = H(hVar.x0());
            long size = hVar.size();
            Iterator<g1.h> it = listH.iterator();
            while (it.hasNext()) {
                size += it.next().size();
            }
            long j11 = this.V;
            if (j11 != 0 && size > j11) {
                c0.y0.a("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.V)));
                W(jVar, 2, null);
                hVar.close();
                return;
            }
            int i11 = 3;
            try {
                s sVar = (s) J(this.F);
                MediaMuxer mediaMuxerY0 = jVar.y0(sVar.c() == -1 ? C0(this.f126295w, s.g(f126253r0.c())) : s.g(sVar.c()), new Consumer() { // from class: z0.j0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        this.f126161a.M = (Uri) obj;
                    }
                });
                c0.z1.h hVar2 = this.f126294v;
                if (hVar2 != null) {
                    q0(hVar2);
                    mediaMuxerY0.setOrientationHint(hVar2.b());
                }
                Location locationC = jVar.c0().c();
                if (locationC != null) {
                    try {
                        Pair<Double, Double> pairA = i1.a.a(locationC.getLatitude(), locationC.getLongitude());
                        mediaMuxerY0.setLocation((float) ((Double) pairA.first).doubleValue(), (float) ((Double) pairA.second).doubleValue());
                    } catch (IllegalArgumentException e11) {
                        mediaMuxerY0.release();
                        W(jVar, 5, e11);
                        hVar.close();
                        return;
                    }
                }
                this.f126298z = Integer.valueOf(mediaMuxerY0.addTrack(this.I.a()));
                if (O()) {
                    this.f126297y = Integer.valueOf(mediaMuxerY0.addTrack(this.K.a()));
                }
                try {
                    mediaMuxerY0.start();
                    this.E = mediaMuxerY0;
                    J0(hVar, jVar);
                    Iterator<g1.h> it2 = listH.iterator();
                    while (it2.hasNext()) {
                        I0(it2.next(), jVar);
                    }
                    hVar.close();
                } catch (IllegalStateException e12) {
                    if (((b1.f) u5.h.g(this.f126283l0)).a() >= this.f126282l) {
                        i11 = 1;
                    }
                    W(jVar, i11, e12);
                    hVar.close();
                }
            } catch (IOException e13) {
                if (!h1.e.e(e13)) {
                    i11 = 5;
                }
                W(jVar, i11, e13);
                hVar.close();
            }
        } catch (Throwable th2) {
            if (hVar != null) {
                try {
                    hVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @NonNull
    g1 x0(@NonNull w wVar) {
        long j11;
        j jVar;
        int i11;
        j jVar2;
        u5.h.h(wVar, "The given PendingRecording cannot be null.");
        synchronized (this.f126276i) {
            try {
                j11 = this.f126290r + 1;
                this.f126290r = j11;
                jVar = null;
                i11 = 0;
                switch (this.f126284m) {
                    case CONFIGURING:
                    case IDLING:
                    case STOPPING:
                    case RESETTING:
                    case ERROR:
                        l lVar = this.f126284m;
                        l lVar2 = l.IDLING;
                        if (lVar == lVar2) {
                            u5.h.j(this.f126288p == null && this.f126289q == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            j jVarJ = j.J(wVar, j11);
                            jVarJ.r0(wVar.getApplicationContext());
                            this.f126289q = jVarJ;
                            l lVar3 = this.f126284m;
                            if (lVar3 == lVar2) {
                                s0(l.PENDING_RECORDING);
                                this.f126268e.execute(new Runnable() { // from class: z0.k0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f126169a.E0();
                                    }
                                });
                            } else if (lVar3 == l.ERROR) {
                                s0(l.PENDING_RECORDING);
                                this.f126268e.execute(new Runnable() { // from class: z0.l0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        t0.q(this.f126175a);
                                    }
                                });
                            } else {
                                s0(l.PENDING_RECORDING);
                            }
                            e = null;
                        } catch (IOException e11) {
                            e = e11;
                            i11 = 5;
                        }
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        jVar2 = (j) u5.h.g(this.f126289q);
                        jVar = jVar2;
                        e = null;
                        break;
                    case RECORDING:
                    case PAUSED:
                        jVar2 = this.f126288p;
                        jVar = jVar2;
                        e = null;
                        break;
                    default:
                        e = null;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (jVar != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i11 == 0) {
            return g1.n(wVar, j11);
        }
        c0.y0.c("Recorder", "Recording was started when the Recorder had encountered error " + e);
        G(j.J(wVar, j11), i11, e);
        return g1.c(wVar, j11);
    }

    class c implements g1.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a f126303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f126304c;

        c(androidx.concurrent.futures.c.a aVar, j jVar) {
            this.f126303b = aVar;
            this.f126304c = jVar;
        }

        @Override // g1.l
        public void a(@NonNull g1.i1 i1Var) {
            t0.this.I = i1Var;
        }

        @Override // g1.l
        public void d(@NonNull EncodeException encodeException) {
            this.f126303b.f(encodeException);
        }

        @Override // g1.l
        public void e() {
            this.f126303b.c(null);
        }

        @Override // g1.l
        public void f(@NonNull g1.h hVar) {
            boolean z11;
            t0 t0Var = t0.this;
            if (t0Var.E != null) {
                try {
                    t0Var.J0(hVar, this.f126304c);
                    if (hVar != null) {
                        hVar.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (hVar != null) {
                        try {
                            hVar.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            if (t0Var.f126292t) {
                c0.y0.a("Recorder", "Drop video data since recording is stopping.");
                hVar.close();
                return;
            }
            g1.h hVar2 = t0Var.Z;
            if (hVar2 != null) {
                hVar2.close();
                t0.this.Z = null;
                z11 = true;
            } else {
                z11 = false;
            }
            if (!hVar.j0()) {
                if (z11) {
                    c0.y0.a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                }
                c0.y0.a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                t0.this.H.f();
                hVar.close();
                return;
            }
            t0 t0Var2 = t0.this;
            t0Var2.Z = hVar;
            if (!t0Var2.O() || !t0.this.f126261a0.isEmpty()) {
                c0.y0.a("Recorder", "Received video keyframe. Starting muxer...");
                t0.this.u0(this.f126304c);
            } else if (z11) {
                c0.y0.a("Recorder", "Replaced cached video keyframe with newer keyframe.");
            } else {
                c0.y0.a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
            }
        }

        @Override // g1.l
        public void c() {
        }
    }

    class e implements g1.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a f126308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Consumer f126309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f126310d;

        e(androidx.concurrent.futures.c.a aVar, Consumer consumer, j jVar) {
            this.f126308b = aVar;
            this.f126309c = consumer;
            this.f126310d = jVar;
        }

        @Override // g1.l
        public void a(@NonNull g1.i1 i1Var) {
            t0.this.K = i1Var;
        }

        @Override // g1.l
        public void d(@NonNull EncodeException encodeException) {
            if (t0.this.f126263b0 == null) {
                this.f126309c.accept(encodeException);
            }
        }

        @Override // g1.l
        public void e() {
            this.f126308b.c(null);
        }

        @Override // g1.l
        public void f(@NonNull g1.h hVar) {
            t0 t0Var = t0.this;
            if (t0Var.L == h.DISABLED) {
                hVar.close();
                throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
            }
            if (t0Var.E == null) {
                if (t0Var.f126292t) {
                    c0.y0.a("Recorder", "Drop audio data since recording is stopping.");
                } else {
                    t0Var.f126261a0.b(new g1.g(hVar));
                    if (t0.this.Z != null) {
                        c0.y0.a("Recorder", "Received audio data. Starting muxer...");
                        t0.this.u0(this.f126310d);
                    } else {
                        c0.y0.a("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                    }
                }
                hVar.close();
                return;
            }
            try {
                t0Var.I0(hVar, this.f126310d);
                if (hVar != null) {
                    hVar.close();
                }
            } catch (Throwable th2) {
                if (hVar != null) {
                    try {
                        hVar.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        @Override // g1.l
        public void c() {
        }
    }
}
