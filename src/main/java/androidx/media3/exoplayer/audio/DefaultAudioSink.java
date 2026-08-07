package androidx.media3.exoplayer.audio;

import a8.o2;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import b8.o;
import b8.v;
import b8.w;
import b8.x;
import b8.y;
import com.adyen.checkout.components.core.Address;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.collect.d1;
import expo.modules.kotlin.activityresult.DataPersistorKt;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p7.g0;
import p7.i0;
import p7.u;
import s7.q0;
import s7.t;
import w8.f0;
import w8.h0;
import w8.s;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static boolean f9353q0 = false;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Object f9354r0 = new Object();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static ScheduledExecutorService f9355s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static int f9356t0;
    private androidx.media3.exoplayer.audio.a A;
    private androidx.media3.exoplayer.audio.b B;
    private k C;
    private p7.d D;
    private j E;
    private j F;
    private i0 G;
    private boolean H;
    private ByteBuffer I;
    private int J;
    private long K;
    private long L;
    private long M;
    private long N;
    private int O;
    private boolean P;
    private boolean Q;
    private long R;
    private float S;
    private ByteBuffer T;
    private int U;
    private ByteBuffer V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9357a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f9358a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q7.g f9359b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f9360b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9361c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f9362c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f9363d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private p7.e f9364d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f9365e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.c f9366e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.common.audio.e f9367f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f9368f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x f9369g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private long f9370g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.common.collect.x<AudioProcessor> f9371h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private long f9372h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media3.exoplayer.audio.g f9373i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f9374i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayDeque<j> f9375j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f9376j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f9377k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private Looper f9378k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f9379l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private long f9380l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private n f9381m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private long f9382m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l<AudioSink.InitializationException> f9383n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private Handler f9384n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final l<AudioSink.WriteException> f9385o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private Context f9386o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final e f9387p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f9388p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final d f9389q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ExoPlayer.a f9390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final f f9391s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f9392t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private o2 f9393u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AudioSink.b f9394v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private h f9395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private h f9396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private androidx.media3.common.audio.a f9397y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private AudioTrack f9398z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    private static final class b {
        public static long a(AudioTrack audioTrack, h hVar) {
            return hVar.f9414c == 0 ? hVar.d(audioTrack.getBufferSizeInFrames()) : q0.v1(audioTrack.getBufferSizeInFrames(), 1000000L, DefaultAudioSink.a0(hVar.f9418g), RoundingMode.DOWN);
        }

        public static void b(AudioTrack audioTrack, androidx.media3.exoplayer.audio.c cVar) {
            audioTrack.setPreferredDevice(cVar == null ? null : cVar.f9467a);
        }
    }

    private static final class c {
        public static void a(AudioTrack audioTrack, o2 o2Var) {
            LogSessionId logSessionIdA = o2Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    public interface d {
        androidx.media3.exoplayer.audio.d a(u uVar, p7.d dVar);
    }

    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f9399a = new androidx.media3.exoplayer.audio.j.a().h();

        int a(int i11, int i12, int i13, int i14, int i15, int i16, double d11);
    }

    public interface f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f9400a = new androidx.media3.exoplayer.audio.k();

        AudioTrack a(AudioSink.a aVar, p7.d dVar, int i11, Context context);

        default int b(int i11) {
            return q0.Q(i11);
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f9401a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private q7.g f9403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f9404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f9405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f9406f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private d f9409i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ExoPlayer.a f9411k;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f9410j = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.media3.exoplayer.audio.a f9402b = androidx.media3.exoplayer.audio.a.f9443c;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private e f9407g = e.f9399a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private f f9408h = f.f9400a;

        public g(Context context) {
            this.f9401a = context;
        }

        public DefaultAudioSink k() {
            s7.a.h(!this.f9406f);
            this.f9406f = true;
            if (this.f9403c == null) {
                this.f9403c = new i(new AudioProcessor[0]);
            }
            if (this.f9409i == null) {
                this.f9409i = new androidx.media3.exoplayer.audio.h(this.f9401a);
            }
            return new DefaultAudioSink(this);
        }

        public g l(boolean z11) {
            this.f9405e = z11;
            return this;
        }

        public g m(boolean z11) {
            this.f9404d = z11;
            return this;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f9412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f9415d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f9416e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f9417f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f9418g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f9419h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final androidx.media3.common.audio.a f9420i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f9421j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f9422k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f9423l;

        public h(u uVar, int i11, int i12, int i13, int i14, int i15, int i16, int i17, androidx.media3.common.audio.a aVar, boolean z11, boolean z12, boolean z13) {
            this.f9412a = uVar;
            this.f9413b = i11;
            this.f9414c = i12;
            this.f9415d = i13;
            this.f9416e = i14;
            this.f9417f = i15;
            this.f9418g = i16;
            this.f9419h = i17;
            this.f9420i = aVar;
            this.f9421j = z11;
            this.f9422k = z12;
            this.f9423l = z13;
        }

        public AudioSink.a a() {
            return new AudioSink.a(this.f9418g, this.f9416e, this.f9417f, this.f9423l, this.f9414c == 1, this.f9419h);
        }

        public boolean b(h hVar) {
            return hVar.f9414c == this.f9414c && hVar.f9418g == this.f9418g && hVar.f9416e == this.f9416e && hVar.f9417f == this.f9417f && hVar.f9415d == this.f9415d && hVar.f9421j == this.f9421j && hVar.f9422k == this.f9422k;
        }

        public h c(int i11) {
            return new h(this.f9412a, this.f9413b, this.f9414c, this.f9415d, this.f9416e, this.f9417f, this.f9418g, i11, this.f9420i, this.f9421j, this.f9422k, this.f9423l);
        }

        public long d(long j11) {
            return q0.r1(j11, this.f9416e);
        }

        public long e(long j11) {
            return q0.r1(j11, this.f9412a.H);
        }

        public boolean f() {
            return this.f9414c == 1;
        }
    }

    public static class i implements q7.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioProcessor[] f9424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w f9425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media3.common.audio.d f9426c;

        public i(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new w(), new androidx.media3.common.audio.d());
        }

        @Override // q7.g
        public AudioProcessor[] a() {
            return this.f9424a;
        }

        @Override // q7.g
        public long b() {
            return this.f9425b.t();
        }

        @Override // q7.g
        public long c(long j11) {
            return this.f9426c.isActive() ? this.f9426c.g(j11) : j11;
        }

        @Override // q7.g
        public boolean d(boolean z11) {
            this.f9425b.C(z11);
            return z11;
        }

        @Override // q7.g
        public i0 e(i0 i0Var) {
            this.f9426c.i(i0Var.f101379a);
            this.f9426c.h(i0Var.f101380b);
            return i0Var;
        }

        public i(AudioProcessor[] audioProcessorArr, w wVar, androidx.media3.common.audio.d dVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f9424a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f9425b = wVar;
            this.f9426c = dVar;
            audioProcessorArr2[audioProcessorArr.length] = wVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = dVar;
        }
    }

    private static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i0 f9427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f9429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f9430d;

        private j(i0 i0Var, long j11, long j12) {
            this.f9427a = i0Var;
            this.f9428b = j11;
            this.f9429c = j12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f9431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media3.exoplayer.audio.b f9432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AudioRouting.OnRoutingChangedListener f9433c = new AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.i
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f9521a.b(audioRouting);
            }
        };

        public k(AudioTrack audioTrack, androidx.media3.exoplayer.audio.b bVar) {
            this.f9431a = audioTrack;
            this.f9432b = bVar;
            audioTrack.addOnRoutingChangedListener(this.f9433c, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            if (this.f9433c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            this.f9432b.j(routedDevice);
        }

        public void c() {
            this.f9431a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) s7.a.f(this.f9433c));
            this.f9433c = null;
        }
    }

    private static final class l<T extends Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private T f9434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f9435b = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f9436c = -9223372036854775807L;

        public void a() {
            this.f9434a = null;
            this.f9435b = -9223372036854775807L;
            this.f9436c = -9223372036854775807L;
        }

        public boolean b() {
            if (this.f9434a == null) {
                return false;
            }
            return DefaultAudioSink.e0() || SystemClock.elapsedRealtime() < this.f9436c;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void c(T t11) throws T {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f9434a == null) {
                this.f9434a = t11;
            }
            if (this.f9435b == -9223372036854775807L && !DefaultAudioSink.e0()) {
                this.f9435b = 200 + jElapsedRealtime;
            }
            long j11 = this.f9435b;
            if (j11 == -9223372036854775807L || jElapsedRealtime < j11) {
                this.f9436c = jElapsedRealtime + 50;
                return;
            }
            T t12 = this.f9434a;
            if (t12 != t11) {
                t12.addSuppressed(t11);
            }
            T t13 = this.f9434a;
            a();
            throw t13;
        }
    }

    private final class m implements androidx.media3.exoplayer.audio.g.a {
        private m() {
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void a(long j11, long j12, long j13, long j14) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j11 + ", " + j12 + ", " + j13 + ", " + j14 + ", " + DefaultAudioSink.this.b0() + ", " + DefaultAudioSink.this.c0();
            if (DefaultAudioSink.f9353q0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            t.i("DefaultAudioSink", str);
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void b(long j11) {
            if (DefaultAudioSink.this.f9394v != null) {
                DefaultAudioSink.this.f9394v.b(j11);
            }
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void c(long j11, long j12, long j13, long j14) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j11 + ", " + j12 + ", " + j13 + ", " + j14 + ", " + DefaultAudioSink.this.b0() + ", " + DefaultAudioSink.this.c0();
            if (DefaultAudioSink.f9353q0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            t.i("DefaultAudioSink", str);
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void d(int i11, long j11) {
            if (DefaultAudioSink.this.f9394v != null) {
                DefaultAudioSink.this.f9394v.c(i11, j11, SystemClock.elapsedRealtime() - DefaultAudioSink.this.f9372h0);
            }
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void e(long j11) {
            t.i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j11);
        }
    }

    private final class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f9438a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f9439b;

        class a extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ DefaultAudioSink f9441a;

            a(DefaultAudioSink defaultAudioSink) {
                this.f9441a = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i11) {
                if (audioTrack.equals(DefaultAudioSink.this.f9398z) && DefaultAudioSink.this.f9394v != null && DefaultAudioSink.this.Z) {
                    DefaultAudioSink.this.f9394v.g();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f9398z)) {
                    DefaultAudioSink.this.Y = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f9398z) && DefaultAudioSink.this.f9394v != null && DefaultAudioSink.this.Z) {
                    DefaultAudioSink.this.f9394v.g();
                }
            }
        }

        public n() {
            this.f9439b = new a(DefaultAudioSink.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f9438a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new b8.t(handler), this.f9439b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f9439b);
            this.f9438a.removeCallbacksAndMessages(null);
        }
    }

    private boolean A0() {
        h hVar = this.f9396x;
        return hVar != null && hVar.f9421j;
    }

    private static int B0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i11) {
        return audioTrack.write(byteBuffer, i11, 1);
    }

    private int C0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i11, long j11) {
        if (Build.VERSION.SDK_INT >= 26) {
            return audioTrack.write(byteBuffer, i11, 1, j11 * 1000);
        }
        if (this.I == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.I = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.I.putInt(1431633921);
        }
        if (this.J == 0) {
            this.I.putInt(4, i11);
            this.I.putLong(8, j11 * 1000);
            this.I.position(0);
            this.J = i11;
        }
        int iRemaining = this.I.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.I, iRemaining, 1);
            if (iWrite < 0) {
                this.J = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iB0 = B0(audioTrack, byteBuffer, i11);
        if (iB0 < 0) {
            this.J = 0;
            return iB0;
        }
        this.J -= iB0;
        return iB0;
    }

    private void O(long j11) {
        i0 i0VarE;
        if (A0()) {
            i0VarE = i0.f101376d;
        } else {
            i0VarE = y0() ? this.f9359b.e(this.G) : i0.f101376d;
            this.G = i0VarE;
        }
        i0 i0Var = i0VarE;
        this.H = y0() ? this.f9359b.d(this.H) : false;
        this.f9375j.add(new j(i0Var, Math.max(0L, j11), this.f9396x.d(c0())));
        x0();
        AudioSink.b bVar = this.f9394v;
        if (bVar != null) {
            bVar.onSkipSilenceEnabledChanged(this.H);
        }
    }

    private long P(long j11) {
        while (!this.f9375j.isEmpty() && j11 >= this.f9375j.getFirst().f9429c) {
            this.F = this.f9375j.remove();
        }
        j jVar = this.F;
        long j12 = j11 - jVar.f9429c;
        long jO0 = q0.o0(j12, jVar.f9427a.f101379a);
        if (!this.f9375j.isEmpty()) {
            j jVar2 = this.F;
            return jVar2.f9428b + jO0 + jVar2.f9430d;
        }
        long jC = this.f9359b.c(j12);
        j jVar3 = this.F;
        long j13 = jVar3.f9428b + jC;
        jVar3.f9430d = jC - jO0;
        return j13;
    }

    private long Q(long j11) {
        long jB = this.f9359b.b();
        long jD = j11 + this.f9396x.d(jB);
        long j12 = this.f9380l0;
        if (jB > j12) {
            long jD2 = this.f9396x.d(jB - j12);
            this.f9380l0 = jB;
            d0(jD2);
        }
        return jD;
    }

    private AudioTrack R(AudioSink.a aVar, p7.d dVar, int i11, u uVar, Context context) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackA = this.f9391s.a(aVar, dVar, i11, context);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new AudioSink.InitializationException(state, aVar.f9348b, aVar.f9349c, aVar.f9347a, aVar.f9352f, uVar, aVar.f9351e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e11) {
            throw new AudioSink.InitializationException(0, aVar.f9348b, aVar.f9349c, aVar.f9347a, aVar.f9352f, uVar, aVar.f9351e, e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:38:? A[SYNTHETIC] */
    private AudioTrack S(h hVar) throws AudioSink.InitializationException {
        DefaultAudioSink defaultAudioSink;
        AudioSink.InitializationException initializationException;
        AudioSink.b bVar;
        Context context;
        int i11;
        try {
            int i12 = this.f9360b0;
            int i13 = this.f9392t;
            if (i13 != -1) {
                try {
                    Context context2 = this.f9357a;
                    if (context2 == null || Build.VERSION.SDK_INT < 34) {
                        i11 = i12;
                        context = null;
                    } else {
                        if (this.f9386o0 == null) {
                            this.f9386o0 = context2.createDeviceContext(i13);
                        }
                        context = this.f9386o0;
                        i11 = 0;
                    }
                } catch (AudioSink.InitializationException e11) {
                    initializationException = e11;
                    defaultAudioSink = this;
                    bVar = defaultAudioSink.f9394v;
                    if (bVar != null) {
                        throw initializationException;
                    }
                    bVar.a(initializationException);
                    throw initializationException;
                }
            } else {
                i11 = i12;
                context = null;
            }
            defaultAudioSink = this;
            try {
                AudioTrack audioTrackR = defaultAudioSink.R(hVar.a(), this.D, i11, hVar.f9412a, context);
                ExoPlayer.a aVar = defaultAudioSink.f9390r;
                if (aVar == null) {
                    return audioTrackR;
                }
                aVar.C(i0(audioTrackR));
                return audioTrackR;
            } catch (AudioSink.InitializationException e12) {
                e = e12;
                initializationException = e;
                bVar = defaultAudioSink.f9394v;
                if (bVar != null) {
                    throw initializationException;
                }
                bVar.a(initializationException);
                throw initializationException;
            }
        } catch (AudioSink.InitializationException e13) {
            e = e13;
            defaultAudioSink = this;
        }
    }

    private AudioTrack T() throws AudioSink.InitializationException {
        try {
            return S((h) s7.a.f(this.f9396x));
        } catch (AudioSink.InitializationException e11) {
            h hVar = this.f9396x;
            if (hVar.f9419h > 1000000) {
                h hVarC = hVar.c(1000000);
                try {
                    AudioTrack audioTrackS = S(hVarC);
                    this.f9396x = hVarC;
                    return audioTrackS;
                } catch (AudioSink.InitializationException e12) {
                    e11.addSuppressed(e12);
                    j0();
                    throw e11;
                }
            }
            j0();
            throw e11;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    private void U(long j11) throws T, AudioSink.WriteException {
        DefaultAudioSink defaultAudioSink;
        int iB0;
        AudioSink.b bVar;
        if (this.V == null || this.f9385o.b()) {
            return;
        }
        int iRemaining = this.V.remaining();
        boolean z11 = false;
        if (this.f9368f0) {
            s7.a.h(j11 != -9223372036854775807L);
            if (j11 == Long.MIN_VALUE) {
                j11 = this.f9370g0;
            } else {
                this.f9370g0 = j11;
            }
            defaultAudioSink = this;
            iB0 = defaultAudioSink.C0(this.f9398z, this.V, iRemaining, j11);
        } else {
            defaultAudioSink = this;
            iB0 = B0(defaultAudioSink.f9398z, defaultAudioSink.V, iRemaining);
        }
        defaultAudioSink.f9372h0 = SystemClock.elapsedRealtime();
        if (iB0 < 0) {
            if (g0(iB0)) {
                if (c0() > 0) {
                    z11 = true;
                } else if (i0(defaultAudioSink.f9398z)) {
                    j0();
                    z11 = true;
                }
            }
            AudioSink.WriteException writeException = new AudioSink.WriteException(iB0, defaultAudioSink.f9396x.f9412a, z11);
            AudioSink.b bVar2 = defaultAudioSink.f9394v;
            if (bVar2 != null) {
                bVar2.a(writeException);
            }
            if (!writeException.f9345b || defaultAudioSink.f9357a == null) {
                defaultAudioSink.f9385o.c(writeException);
                return;
            }
            androidx.media3.exoplayer.audio.a aVar = androidx.media3.exoplayer.audio.a.f9443c;
            defaultAudioSink.A = aVar;
            defaultAudioSink.B.g(aVar);
            throw writeException;
        }
        defaultAudioSink.f9385o.a();
        if (i0(defaultAudioSink.f9398z)) {
            if (defaultAudioSink.N > 0) {
                defaultAudioSink.f9376j0 = false;
            }
            if (defaultAudioSink.Z && (bVar = defaultAudioSink.f9394v) != null && iB0 < iRemaining && !defaultAudioSink.f9376j0) {
                bVar.e();
            }
        }
        int i11 = defaultAudioSink.f9396x.f9414c;
        if (i11 == 0) {
            defaultAudioSink.M += (long) iB0;
        }
        if (iB0 == iRemaining) {
            if (i11 != 0) {
                s7.a.h(defaultAudioSink.V == defaultAudioSink.T);
                defaultAudioSink.N += ((long) defaultAudioSink.O) * ((long) defaultAudioSink.U);
            }
            defaultAudioSink.V = null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    private boolean V() throws T, AudioSink.WriteException {
        ByteBuffer byteBuffer;
        if (!this.f9397y.f()) {
            U(Long.MIN_VALUE);
            return this.V == null;
        }
        this.f9397y.h();
        p0(Long.MIN_VALUE);
        return this.f9397y.e() && ((byteBuffer = this.V) == null || !byteBuffer.hasRemaining());
    }

    private static int W(int i11, int i12, int i13) {
        int minBufferSize = AudioTrack.getMinBufferSize(i11, i12, i13);
        s7.a.h(minBufferSize != -2);
        return minBufferSize;
    }

    private static int X(Context context) {
        int deviceId = context.getDeviceId();
        if (deviceId == 0 || deviceId == -1) {
            return -1;
        }
        return deviceId;
    }

    private static int Y(int i11, ByteBuffer byteBuffer) {
        if (i11 == 20) {
            return h0.h(byteBuffer);
        }
        if (i11 != 30) {
            switch (i11) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iM = f0.m(q0.U(byteBuffer, byteBuffer.position()));
                    if (iM != -1) {
                        return iM;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i11) {
                        case 14:
                            int iB = w8.b.b(byteBuffer);
                            if (iB == -1) {
                                return 0;
                            }
                            return w8.b.i(byteBuffer, iB) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return w8.c.f(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i11);
                    }
                    break;
            }
            return w8.b.e(byteBuffer);
        }
        return w8.o.f(byteBuffer);
    }

    private static String Z(Looper looper) {
        return looper == null ? Address.ADDRESS_NULL_PLACEHOLDER : looper.getThread().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a0(int i11) {
        int iB = s.b(i11);
        s7.a.h(iB != -2147483647);
        return iB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long b0() {
        h hVar = this.f9396x;
        return hVar.f9414c == 0 ? this.K / ((long) hVar.f9413b) : this.L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long c0() {
        h hVar = this.f9396x;
        return hVar.f9414c == 0 ? q0.o(this.M, hVar.f9415d) : this.N;
    }

    private void d0(long j11) {
        this.f9382m0 += j11;
        if (this.f9384n0 == null) {
            this.f9384n0 = new Handler(Looper.myLooper());
        }
        this.f9384n0.removeCallbacksAndMessages(null);
        this.f9384n0.postDelayed(new Runnable() { // from class: b8.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f16830a.l0();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e0() {
        boolean z11;
        synchronized (f9354r0) {
            z11 = f9356t0 > 0;
        }
        return z11;
    }

    private boolean f0() throws AudioSink.InitializationException {
        o2 o2Var;
        if (this.f9383n.b()) {
            return false;
        }
        AudioTrack audioTrackT = T();
        this.f9398z = audioTrackT;
        if (i0(audioTrackT)) {
            q0(this.f9398z);
            h hVar = this.f9396x;
            if (hVar.f9422k) {
                AudioTrack audioTrack = this.f9398z;
                u uVar = hVar.f9412a;
                audioTrack.setOffloadDelayPadding(uVar.J, uVar.K);
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (o2Var = this.f9393u) != null) {
            c.a(this.f9398z, o2Var);
        }
        androidx.media3.exoplayer.audio.g gVar = this.f9373i;
        AudioTrack audioTrack2 = this.f9398z;
        h hVar2 = this.f9396x;
        gVar.u(audioTrack2, hVar2.f9414c == 2, hVar2.f9418g, hVar2.f9415d, hVar2.f9419h, this.f9388p0);
        w0();
        int i11 = this.f9364d0.f101254a;
        if (i11 != 0) {
            this.f9398z.attachAuxEffect(i11);
            this.f9398z.setAuxEffectSendLevel(this.f9364d0.f101255b);
        }
        androidx.media3.exoplayer.audio.c cVar = this.f9366e0;
        if (cVar != null) {
            b.b(this.f9398z, cVar);
            androidx.media3.exoplayer.audio.b bVar = this.B;
            if (bVar != null) {
                bVar.j(this.f9366e0.f9467a);
            }
        }
        androidx.media3.exoplayer.audio.b bVar2 = this.B;
        if (bVar2 != null) {
            this.C = new k(this.f9398z, bVar2);
        }
        this.Q = true;
        int audioSessionId = this.f9398z.getAudioSessionId();
        boolean z11 = audioSessionId != this.f9360b0;
        this.f9360b0 = audioSessionId;
        AudioSink.b bVar3 = this.f9394v;
        if (bVar3 != null) {
            bVar3.o(this.f9396x.a());
            if (z11) {
                this.f9362c0 = true;
                this.f9394v.onAudioSessionIdChanged(this.f9360b0);
            }
        }
        return true;
    }

    private static boolean g0(int i11) {
        return i11 == -6 || i11 == -32;
    }

    public static /* synthetic */ void h(AudioTrack audioTrack, final AudioSink.b bVar, Handler handler, final AudioSink.a aVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (bVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: b8.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.p(aVar);
                    }
                });
            }
            synchronized (f9354r0) {
                try {
                    int i11 = f9356t0 - 1;
                    f9356t0 = i11;
                    if (i11 == 0) {
                        f9355s0.shutdown();
                        f9355s0 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            if (bVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: b8.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.p(aVar);
                    }
                });
            }
            synchronized (f9354r0) {
                try {
                    int i12 = f9356t0 - 1;
                    f9356t0 = i12;
                    if (i12 == 0) {
                        f9355s0.shutdown();
                        f9355s0 = null;
                    }
                    throw th3;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    private boolean h0() {
        return this.f9398z != null;
    }

    private static boolean i0(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private void j0() {
        if (this.f9396x.f()) {
            this.f9374i0 = true;
        }
    }

    private ByteBuffer k0(ByteBuffer byteBuffer) {
        if (this.f9396x.f9414c == 0) {
            int iH = (int) q0.H(q0.b1(20L), this.f9396x.f9416e);
            long jC0 = c0();
            if (jC0 < iH) {
                h hVar = this.f9396x;
                return v.a(byteBuffer, hVar.f9418g, hVar.f9415d, (int) jC0, iH);
            }
        }
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        if (this.f9382m0 >= DataPersistorKt.EXPIRATION_TIME) {
            this.f9394v.h();
            this.f9382m0 = 0L;
        }
    }

    @EnsuresNonNull({"audioCapabilities"})
    private void m0() {
        Context context;
        Looper looperMyLooper = Looper.myLooper();
        s7.a.i(this.B == null || this.f9378k0 == looperMyLooper, "DefaultAudioSink accessed on multiple threads: " + Z(this.f9378k0) + " and " + Z(looperMyLooper));
        if (this.B == null && (context = this.f9357a) != null) {
            this.f9378k0 = looperMyLooper;
            androidx.media3.exoplayer.audio.b bVar = new androidx.media3.exoplayer.audio.b(context, new androidx.media3.exoplayer.audio.b.f() { // from class: b8.q
                @Override // androidx.media3.exoplayer.audio.b.f
                public final void a(androidx.media3.exoplayer.audio.a aVar) {
                    this.f16829a.n0(aVar);
                }
            }, this.D, this.f9366e0);
            this.B = bVar;
            this.A = bVar.h();
        }
        s7.a.f(this.A);
    }

    private void o0() {
        if (this.X) {
            return;
        }
        this.X = true;
        this.f9373i.h(c0());
        if (i0(this.f9398z)) {
            this.Y = false;
        }
        this.f9398z.stop();
        this.J = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    private void p0(long j11) throws T, AudioSink.WriteException {
        U(j11);
        if (this.V != null) {
            return;
        }
        if (!this.f9397y.f()) {
            ByteBuffer byteBuffer = this.T;
            if (byteBuffer != null) {
                v0(byteBuffer);
                U(j11);
                return;
            }
            return;
        }
        while (!this.f9397y.e()) {
            do {
                ByteBuffer byteBufferD = this.f9397y.d();
                if (byteBufferD.hasRemaining()) {
                    v0(byteBufferD);
                    U(j11);
                } else {
                    ByteBuffer byteBuffer2 = this.T;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f9397y.i(this.T);
                    }
                }
            } while (this.V == null);
            return;
        }
    }

    private void q0(AudioTrack audioTrack) {
        if (this.f9381m == null) {
            this.f9381m = new n();
        }
        this.f9381m.a(audioTrack);
    }

    private static void r0(final AudioTrack audioTrack, final AudioSink.b bVar, final AudioSink.a aVar) {
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (f9354r0) {
            try {
                if (f9355s0 == null) {
                    f9355s0 = q0.d1("ExoPlayer:AudioTrackReleaseThread");
                }
                f9356t0++;
                f9355s0.schedule(new Runnable() { // from class: b8.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultAudioSink.h(audioTrack, bVar, handler, aVar);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void s0() {
        this.K = 0L;
        this.L = 0L;
        this.M = 0L;
        this.N = 0L;
        this.f9376j0 = false;
        this.O = 0;
        this.F = new j(this.G, 0L, 0L);
        this.R = 0L;
        this.E = null;
        this.f9375j.clear();
        this.T = null;
        this.U = 0;
        this.V = null;
        this.X = false;
        this.W = false;
        this.Y = false;
        this.I = null;
        this.J = 0;
        this.f9365e.m();
        x0();
    }

    private void t0(i0 i0Var) {
        j jVar = new j(i0Var, -9223372036854775807L, -9223372036854775807L);
        if (h0()) {
            this.E = jVar;
        } else {
            this.F = jVar;
        }
    }

    private void u0() {
        if (h0()) {
            try {
                this.f9398z.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.G.f101379a).setPitch(this.G.f101380b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e11) {
                t.j("DefaultAudioSink", "Failed to set playback params", e11);
            }
            i0 i0Var = new i0(this.f9398z.getPlaybackParams().getSpeed(), this.f9398z.getPlaybackParams().getPitch());
            this.G = i0Var;
            this.f9373i.v(i0Var.f101379a);
        }
    }

    private void v0(ByteBuffer byteBuffer) {
        s7.a.h(this.V == null);
        if (byteBuffer.hasRemaining()) {
            this.V = k0(byteBuffer);
        }
    }

    private void w0() {
        if (h0()) {
            this.f9398z.setVolume(this.S);
        }
    }

    private void x0() {
        androidx.media3.common.audio.a aVar = this.f9396x.f9420i;
        this.f9397y = aVar;
        aVar.b();
    }

    private boolean y0() {
        if (this.f9368f0) {
            return false;
        }
        h hVar = this.f9396x;
        return hVar.f9414c == 0 && !z0(hVar.f9412a.I);
    }

    private boolean z0(int i11) {
        return this.f9361c && q0.Q0(i11);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void A(s7.j jVar) {
        this.f9373i.w(jVar);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int B(u uVar) {
        m0();
        if (!"audio/raw".equals(uVar.f101544o)) {
            return this.A.j(uVar, this.D) ? 2 : 0;
        }
        if (q0.R0(uVar.I)) {
            int i11 = uVar.I;
            return (i11 == 2 || (this.f9361c && i11 == 4)) ? 2 : 1;
        }
        t.i("DefaultAudioSink", "Invalid PCM encoding: " + uVar.I);
        return 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void C(p7.e eVar) {
        if (this.f9364d0.equals(eVar)) {
            return;
        }
        int i11 = eVar.f101254a;
        float f11 = eVar.f101255b;
        AudioTrack audioTrack = this.f9398z;
        if (audioTrack != null) {
            if (this.f9364d0.f101254a != i11) {
                audioTrack.attachAuxEffect(i11);
            }
            if (i11 != 0) {
                this.f9398z.setAuxEffectSendLevel(f11);
            }
        }
        this.f9364d0 = eVar;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void D(int i11, int i12) {
        h hVar;
        AudioTrack audioTrack = this.f9398z;
        if (audioTrack == null || !i0(audioTrack) || (hVar = this.f9396x) == null || !hVar.f9422k) {
            return;
        }
        this.f9398z.setOffloadDelayPadding(i11, i12);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void E(o2 o2Var) {
        this.f9393u = o2Var;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void F(u uVar, int i11, int[] iArr) throws AudioSink.ConfigurationException {
        androidx.media3.common.audio.a aVar;
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        boolean z12;
        int i16;
        int i17;
        int iA;
        m0();
        int i18 = -1;
        if ("audio/raw".equals(uVar.f101544o)) {
            s7.a.a(q0.R0(uVar.I));
            int iT0 = q0.t0(uVar.I, uVar.G);
            com.google.common.collect.x.a aVar2 = new com.google.common.collect.x.a();
            aVar2.j(this.f9371h);
            if (z0(uVar.I)) {
                aVar2.a(this.f9369g);
            } else {
                aVar2.a(this.f9367f);
                aVar2.i(this.f9359b.a());
            }
            androidx.media3.common.audio.a aVar3 = new androidx.media3.common.audio.a(aVar2.k());
            if (aVar3.equals(this.f9397y)) {
                aVar3 = this.f9397y;
            }
            this.f9365e.n(uVar.J, uVar.K);
            this.f9363d.l(iArr);
            try {
                AudioProcessor.a aVarA = aVar3.a(new AudioProcessor.a(uVar));
                int i19 = aVarA.f9029c;
                i12 = aVarA.f9027a;
                int iB = this.f9391s.b(aVarA.f9028b);
                int iT1 = q0.t0(i19, aVarA.f9028b);
                i13 = 0;
                i14 = i19;
                i15 = iB;
                z12 = this.f9377k;
                aVar = aVar3;
                i16 = iT1;
                i18 = iT0;
                z11 = false;
            } catch (AudioProcessor.UnhandledAudioFormatException e11) {
                throw new AudioSink.ConfigurationException(e11, uVar);
            }
        } else {
            aVar = new androidx.media3.common.audio.a(com.google.common.collect.x.r());
            i12 = uVar.H;
            androidx.media3.exoplayer.audio.d dVarY = this.f9379l != 0 ? y(uVar) : androidx.media3.exoplayer.audio.d.f9468d;
            if (this.f9379l == 0 || !dVarY.f9469a) {
                Pair<Integer, Integer> pairH = this.A.h(uVar, this.D);
                if (pairH == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + uVar, uVar);
                }
                int iIntValue = ((Integer) pairH.first).intValue();
                int iIntValue2 = ((Integer) pairH.second).intValue();
                i13 = 2;
                z11 = false;
                i14 = iIntValue;
                i15 = iIntValue2;
                z12 = this.f9377k;
            } else {
                int iF = g0.f((String) s7.a.f(uVar.f101544o), uVar.f101540k);
                int iB2 = this.f9391s.b(uVar.G);
                z11 = dVarY.f9470b;
                i14 = iF;
                i15 = iB2;
                z12 = true;
                i13 = 1;
            }
            i16 = i18;
        }
        if (i14 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i13 + ") for: " + uVar, uVar);
        }
        if (i15 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i13 + ") for: " + uVar, uVar);
        }
        int i21 = uVar.f101539j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(uVar.f101544o) && i21 == -1) {
            i21 = 768000;
        }
        int i22 = i21;
        if (i11 != 0) {
            iA = i11;
            i17 = i12;
        } else {
            i17 = i12;
            iA = this.f9387p.a(W(i12, i15, i14), i14, i13, i16 != -1 ? i16 : 1, i17, i22, z12 ? 8.0d : 1.0d);
        }
        this.f9374i0 = false;
        int i23 = i13;
        h hVar = new h(uVar, i18, i23, i16, i17, i15, i14, iA, aVar, z12, z11, this.f9368f0);
        if (h0()) {
            this.f9395w = hVar;
        } else {
            this.f9396x = hVar;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean a() {
        if (h0()) {
            return this.W && !n();
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean b(u uVar) {
        return B(uVar) != 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void d() {
        this.Z = false;
        if (h0()) {
            this.f9373i.r();
            if (!this.X || i0(this.f9398z)) {
                this.f9398z.pause();
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public i0 e() {
        return this.G;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void f() {
        this.Z = true;
        if (h0()) {
            this.f9373i.x();
            if (!this.X || i0(this.f9398z)) {
                this.f9398z.play();
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() {
        if (h0()) {
            s0();
            if (this.f9373i.k()) {
                this.f9398z.pause();
            }
            if (i0(this.f9398z)) {
                ((n) s7.a.f(this.f9381m)).b(this.f9398z);
            }
            AudioSink.a aVarA = this.f9396x.a();
            h hVar = this.f9395w;
            if (hVar != null) {
                this.f9396x = hVar;
                this.f9395w = null;
            }
            this.f9373i.s();
            k kVar = this.C;
            if (kVar != null) {
                kVar.c();
                this.C = null;
            }
            r0(this.f9398z, this.f9394v, aVarA);
            this.f9398z = null;
        }
        this.f9385o.a();
        this.f9383n.a();
        this.f9380l0 = 0L;
        this.f9382m0 = 0L;
        Handler handler = this.f9384n0;
        if (handler != null) {
            ((Handler) s7.a.f(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void j(i0 i0Var) {
        this.G = new i0(q0.q(i0Var.f101379a, 0.1f, 8.0f), q0.q(i0Var.f101380b, 0.1f, 8.0f));
        if (A0()) {
            u0();
        } else {
            t0(i0Var);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void k(float f11) {
        if (this.S != f11) {
            this.S = f11;
            w0();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void l() {
        if (this.f9368f0) {
            this.f9368f0 = false;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void m() {
        s7.a.h(this.f9358a0);
        if (this.f9368f0) {
            return;
        }
        this.f9368f0 = true;
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean n() {
        if (h0()) {
            return !(Build.VERSION.SDK_INT >= 29 && this.f9398z.isOffloadedPlayback() && this.Y) && this.f9373i.j(c0());
        }
        return false;
    }

    public void n0(androidx.media3.exoplayer.audio.a aVar) {
        Looper looperMyLooper = Looper.myLooper();
        s7.a.i(this.f9378k0 == looperMyLooper, "Current looper (" + Z(looperMyLooper) + ") is not the playback looper (" + Z(this.f9378k0) + ")");
        androidx.media3.exoplayer.audio.a aVar2 = this.A;
        if (aVar2 == null || aVar.equals(aVar2)) {
            return;
        }
        this.A = aVar;
        AudioSink.b bVar = this.f9394v;
        if (bVar != null) {
            bVar.d();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void o(int i11) {
        if (this.f9362c0) {
            if (this.f9360b0 != i11) {
                return;
            } else {
                this.f9362c0 = false;
            }
        }
        if (this.f9360b0 != i11) {
            this.f9360b0 = i11;
            this.f9358a0 = i11 != 0;
            flush();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean p(ByteBuffer byteBuffer, long j11, int i11) throws T, AudioSink.WriteException, AudioSink.InitializationException {
        ByteBuffer byteBuffer2 = this.T;
        s7.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f9395w != null) {
            if (!V()) {
                return false;
            }
            if (this.f9395w.b(this.f9396x)) {
                this.f9396x = this.f9395w;
                this.f9395w = null;
                AudioTrack audioTrack = this.f9398z;
                if (audioTrack != null && i0(audioTrack) && this.f9396x.f9422k) {
                    if (this.f9398z.getPlayState() == 3) {
                        this.f9398z.setOffloadEndOfStream();
                        this.f9373i.a();
                    }
                    AudioTrack audioTrack2 = this.f9398z;
                    u uVar = this.f9396x.f9412a;
                    audioTrack2.setOffloadDelayPadding(uVar.J, uVar.K);
                    this.f9376j0 = true;
                }
            } else {
                o0();
                if (n()) {
                    return false;
                }
                flush();
            }
            O(j11);
        }
        if (!h0()) {
            try {
                if (!f0()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e11) {
                if (e11.f9340b) {
                    throw e11;
                }
                this.f9383n.c(e11);
                return false;
            }
        }
        this.f9383n.a();
        if (this.Q) {
            this.R = Math.max(0L, j11);
            this.P = false;
            this.Q = false;
            if (A0()) {
                u0();
            }
            O(j11);
            if (this.Z) {
                f();
            }
        }
        if (!this.f9373i.m(c0())) {
            return false;
        }
        if (this.T == null) {
            s7.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            h hVar = this.f9396x;
            if (hVar.f9414c != 0 && this.O == 0) {
                int iY = Y(hVar.f9418g, byteBuffer);
                this.O = iY;
                if (iY == 0) {
                    return true;
                }
            }
            if (this.E != null) {
                if (!V()) {
                    return false;
                }
                O(j11);
                this.E = null;
            }
            long jE = this.R + this.f9396x.e(b0() - this.f9365e.l());
            if (!this.P && Math.abs(jE - j11) > 200000) {
                AudioSink.b bVar = this.f9394v;
                if (bVar != null) {
                    bVar.a(new AudioSink.UnexpectedDiscontinuityException(j11, jE));
                }
                this.P = true;
            }
            if (this.P) {
                if (!V()) {
                    return false;
                }
                long j12 = j11 - jE;
                this.R += j12;
                this.P = false;
                O(j11);
                AudioSink.b bVar2 = this.f9394v;
                if (bVar2 != null && j12 != 0) {
                    bVar2.f();
                }
            }
            if (this.f9396x.f9414c == 0) {
                this.K += (long) byteBuffer.remaining();
            } else {
                this.L += ((long) this.O) * ((long) i11);
            }
            this.T = byteBuffer;
            this.U = i11;
        }
        p0(j11);
        if (!this.T.hasRemaining()) {
            this.T = null;
            this.U = 0;
            return true;
        }
        if (!this.f9373i.l(c0())) {
            return false;
        }
        t.i("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void q() {
        if (!this.W && h0() && V()) {
            o0();
            this.W = true;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long r(boolean z11) {
        if (!h0() || this.Q) {
            return Long.MIN_VALUE;
        }
        return Q(P(Math.min(this.f9373i.c(), this.f9396x.d(c0()))));
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        androidx.media3.exoplayer.audio.b bVar = this.B;
        if (bVar != null) {
            bVar.k();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void reset() {
        flush();
        d1<AudioProcessor> it = this.f9371h.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        this.f9367f.reset();
        this.f9369g.reset();
        androidx.media3.common.audio.a aVar = this.f9397y;
        if (aVar != null) {
            aVar.j();
        }
        this.Z = false;
        this.f9374i0 = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.f9366e0 = audioDeviceInfo == null ? null : new androidx.media3.exoplayer.audio.c(audioDeviceInfo);
        androidx.media3.exoplayer.audio.b bVar = this.B;
        if (bVar != null) {
            bVar.j(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f9398z;
        if (audioTrack != null) {
            b.b(audioTrack, this.f9366e0);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void t() {
        this.P = true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void u(boolean z11) {
        this.H = z11;
        t0(A0() ? i0.f101376d : this.G);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long v() {
        if (h0()) {
            return b.a(this.f9398z, this.f9396x);
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void w(AudioSink.b bVar) {
        this.f9394v = bVar;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void x(int i11) {
        s7.a.h(Build.VERSION.SDK_INT >= 29);
        this.f9379l = i11;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.exoplayer.audio.d y(u uVar) {
        return this.f9374i0 ? androidx.media3.exoplayer.audio.d.f9468d : this.f9389q.a(uVar, this.D);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void z(p7.d dVar) {
        if (this.D.equals(dVar)) {
            return;
        }
        this.D = dVar;
        if (this.f9368f0) {
            return;
        }
        androidx.media3.exoplayer.audio.b bVar = this.B;
        if (bVar != null) {
            bVar.i(dVar);
        }
        flush();
    }

    @RequiresNonNull({"#1.audioProcessorChain"})
    private DefaultAudioSink(g gVar) {
        Context applicationContext = gVar.f9401a == null ? null : gVar.f9401a.getApplicationContext();
        this.f9357a = applicationContext;
        this.D = p7.d.f101231h;
        this.A = applicationContext != null ? null : gVar.f9402b;
        this.f9359b = gVar.f9403c;
        this.f9361c = gVar.f9404d;
        int i11 = Build.VERSION.SDK_INT;
        this.f9377k = gVar.f9405e;
        this.f9379l = 0;
        this.f9387p = gVar.f9407g;
        this.f9389q = (d) s7.a.f(gVar.f9409i);
        this.f9373i = new androidx.media3.exoplayer.audio.g(new m());
        o oVar = new o();
        this.f9363d = oVar;
        y yVar = new y();
        this.f9365e = yVar;
        this.f9367f = new androidx.media3.common.audio.e();
        this.f9369g = new x();
        this.f9371h = com.google.common.collect.x.t(yVar, oVar);
        this.S = 1.0f;
        this.f9360b0 = 0;
        this.f9364d0 = new p7.e(0, BitmapDescriptorFactory.HUE_RED);
        i0 i0Var = i0.f101376d;
        this.F = new j(i0Var, 0L, 0L);
        this.G = i0Var;
        this.H = false;
        this.f9375j = new ArrayDeque<>();
        this.f9383n = new l<>();
        this.f9385o = new l<>();
        this.f9390r = gVar.f9411k;
        this.f9391s = gVar.f9408h;
        this.f9392t = (i11 < 34 || gVar.f9401a == null) ? -1 : X(gVar.f9401a);
        this.f9388p0 = gVar.f9410j;
    }
}
