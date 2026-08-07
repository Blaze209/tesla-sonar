package p7;

import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface j0 {

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f101382b = new a().f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f101383c = s7.q0.N0(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f101384a;

        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final int[] f101385b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final q.b f101386a;

            public a a(int i11) {
                this.f101386a.a(i11);
                return this;
            }

            public a b(b bVar) {
                this.f101386a.b(bVar.f101384a);
                return this;
            }

            public a c(int... iArr) {
                this.f101386a.c(iArr);
                return this;
            }

            public a d() {
                this.f101386a.c(f101385b);
                return this;
            }

            public a e(int i11, boolean z11) {
                this.f101386a.d(i11, z11);
                return this;
            }

            public b f() {
                return new b(this.f101386a.e());
            }

            public a() {
                this.f101386a = new q.b();
            }

            private a(b bVar) {
                q.b bVar2 = new q.b();
                this.f101386a = bVar2;
                bVar2.b(bVar.f101384a);
            }
        }

        public static b e(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f101383c);
            if (integerArrayList == null) {
                return f101382b;
            }
            a aVar = new a();
            for (int i11 = 0; i11 < integerArrayList.size(); i11++) {
                aVar.a(integerArrayList.get(i11).intValue());
            }
            return aVar.f();
        }

        public a b() {
            return new a();
        }

        public boolean c(int i11) {
            return this.f101384a.a(i11);
        }

        public boolean d(int... iArr) {
            return this.f101384a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f101384a.equals(((b) obj).f101384a);
            }
            return false;
        }

        public int f(int i11) {
            return this.f101384a.c(i11);
        }

        public int g() {
            return this.f101384a.d();
        }

        public Bundle h() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i11 = 0; i11 < this.f101384a.d(); i11++) {
                arrayList.add(Integer.valueOf(this.f101384a.c(i11)));
            }
            bundle.putIntegerArrayList(f101383c, arrayList);
            return bundle;
        }

        public int hashCode() {
            return this.f101384a.hashCode();
        }

        private b(q qVar) {
            this.f101384a = qVar;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f101387a;

        public c(q qVar) {
            this.f101387a = qVar;
        }

        public boolean a(int i11) {
            return this.f101387a.a(i11);
        }

        public boolean b(int... iArr) {
            return this.f101387a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f101387a.equals(((c) obj).f101387a);
            }
            return false;
        }

        public int hashCode() {
            return this.f101387a.hashCode();
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final String f101388k = s7.q0.N0(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f101389l = s7.q0.N0(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final String f101390m = s7.q0.N0(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final String f101391n = s7.q0.N0(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final String f101392o = s7.q0.N0(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f101393p = s7.q0.N0(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f101394q = s7.q0.N0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f101395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public final int f101396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f101397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final y f101398d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f101399e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f101400f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f101401g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f101402h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f101403i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f101404j;

        public e(Object obj, int i11, y yVar, Object obj2, int i12, long j11, long j12, int i13, int i14) {
            this.f101395a = obj;
            this.f101396b = i11;
            this.f101397c = i11;
            this.f101398d = yVar;
            this.f101399e = obj2;
            this.f101400f = i12;
            this.f101401g = j11;
            this.f101402h = j12;
            this.f101403i = i13;
            this.f101404j = i14;
        }

        public static e c(Bundle bundle) {
            int i11 = bundle.getInt(f101388k, 0);
            Bundle bundle2 = bundle.getBundle(f101389l);
            return new e(null, i11, bundle2 == null ? null : y.b(bundle2), null, bundle.getInt(f101390m, 0), bundle.getLong(f101391n, 0L), bundle.getLong(f101392o, 0L), bundle.getInt(f101393p, -1), bundle.getInt(f101394q, -1));
        }

        public boolean a(e eVar) {
            return this.f101397c == eVar.f101397c && this.f101400f == eVar.f101400f && this.f101401g == eVar.f101401g && this.f101402h == eVar.f101402h && this.f101403i == eVar.f101403i && this.f101404j == eVar.f101404j && Objects.equals(this.f101398d, eVar.f101398d);
        }

        public e b(boolean z11, boolean z12) {
            if (z11 && z12) {
                return this;
            }
            return new e(this.f101395a, z12 ? this.f101397c : 0, z11 ? this.f101398d : null, this.f101399e, z12 ? this.f101400f : 0, z11 ? this.f101401g : 0L, z11 ? this.f101402h : 0L, z11 ? this.f101403i : -1, z11 ? this.f101404j : -1);
        }

        public Bundle d(int i11) {
            Bundle bundle = new Bundle();
            if (i11 < 3 || this.f101397c != 0) {
                bundle.putInt(f101388k, this.f101397c);
            }
            y yVar = this.f101398d;
            if (yVar != null) {
                bundle.putBundle(f101389l, yVar.e());
            }
            if (i11 < 3 || this.f101400f != 0) {
                bundle.putInt(f101390m, this.f101400f);
            }
            if (i11 < 3 || this.f101401g != 0) {
                bundle.putLong(f101391n, this.f101401g);
            }
            if (i11 < 3 || this.f101402h != 0) {
                bundle.putLong(f101392o, this.f101402h);
            }
            int i12 = this.f101403i;
            if (i12 != -1) {
                bundle.putInt(f101393p, i12);
            }
            int i13 = this.f101404j;
            if (i13 != -1) {
                bundle.putInt(f101394q, i13);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (a(eVar) && Objects.equals(this.f101395a, eVar.f101395a) && Objects.equals(this.f101399e, eVar.f101399e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f101395a, Integer.valueOf(this.f101397c), this.f101398d, this.f101399e, Integer.valueOf(this.f101400f), Long.valueOf(this.f101401g), Long.valueOf(this.f101402h), Integer.valueOf(this.f101403i), Integer.valueOf(this.f101404j));
        }

        public String toString() {
            String str = "mediaItem=" + this.f101397c + ", period=" + this.f101400f + ", pos=" + this.f101401g;
            if (this.f101403i == -1) {
                return str;
            }
            return str + ", contentPos=" + this.f101402h + ", adGroup=" + this.f101403i + ", ad=" + this.f101404j;
        }
    }

    long A();

    void A0(int i11);

    long B();

    void B0(int i11);

    void C();

    void C0(w0 w0Var);

    long D();

    void D0(d dVar);

    void E();

    boolean E0();

    void F();

    Looper F0();

    void G(boolean z11);

    float G0();

    r7.e H();

    p7.d H0();

    int I();

    void I0(int i11, int i12);

    r0 J();

    void J0(int i11, y yVar);

    void K();

    void K0(int i11, List<y> list);

    void L(TextureView textureView);

    long L0();

    void M(int i11, long j11);

    void M0(int i11, int i12, int i13);

    b N();

    void N0(List<y> list);

    e1 O();

    @Deprecated
    void O0(int i11);

    boolean P();

    long Q();

    int R();

    boolean R0();

    void S(SurfaceView surfaceView);

    boolean T();

    void U();

    y U0();

    e0 V();

    long W();

    void X(Surface surface);

    void Y(List<y> list, boolean z11);

    void Z(int i11);

    PlaybackException a();

    void a0(int i11, int i12);

    void b();

    void b0();

    boolean c();

    boolean c0(int i11);

    void d();

    @Deprecated
    void d0(boolean z11);

    i0 e();

    void e0(d dVar);

    void f();

    @Deprecated
    void f0();

    int g();

    int g0();

    long getDuration();

    int h();

    long h0();

    void i(int i11);

    m i0();

    boolean isPlaying();

    void j(i0 i0Var);

    void j0(e0 e0Var);

    void k(float f11);

    void k0(List<y> list, int i11, long j11);

    void l(float f11);

    void l0(int i11);

    boolean m();

    void m0(y yVar, boolean z11);

    long n();

    boolean n0();

    void o(SurfaceView surfaceView);

    void o0(p7.d dVar, boolean z11);

    a1 p();

    e0 p0();

    boolean q();

    void q0(y yVar, long j11);

    int r();

    void r0(int i11, int i12);

    w0 s();

    boolean s0();

    void seekTo(long j11);

    void stop();

    boolean t();

    boolean t0();

    void u(boolean z11);

    void u0(boolean z11, int i11);

    long v();

    void v0();

    long w();

    int w0();

    int x();

    void x0();

    void y(TextureView textureView);

    @Deprecated
    void y0();

    int z();

    void z0(int i11, int i12, List<y> list);

    public interface d {
        default void onRenderedFirstFrame() {
        }

        default void B(r7.e eVar) {
        }

        default void D(m mVar) {
        }

        default void E(p7.d dVar) {
        }

        default void F(PlaybackException playbackException) {
        }

        default void K(w0 w0Var) {
        }

        default void Q(e0 e0Var) {
        }

        default void R(b bVar) {
        }

        default void S(a1 a1Var) {
        }

        default void Z(e0 e0Var) {
        }

        default void b(e1 e1Var) {
        }

        default void d0(PlaybackException playbackException) {
        }

        default void onAudioSessionIdChanged(int i11) {
        }

        @Deprecated
        default void onCues(List<r7.a> list) {
        }

        default void onIsLoadingChanged(boolean z11) {
        }

        default void onIsPlayingChanged(boolean z11) {
        }

        @Deprecated
        default void onLoadingChanged(boolean z11) {
        }

        default void onMaxSeekToPreviousPositionChanged(long j11) {
        }

        default void onPlaybackStateChanged(int i11) {
        }

        default void onPlaybackSuppressionReasonChanged(int i11) {
        }

        @Deprecated
        default void onPositionDiscontinuity(int i11) {
        }

        default void onRepeatModeChanged(int i11) {
        }

        default void onSeekBackIncrementChanged(long j11) {
        }

        default void onSeekForwardIncrementChanged(long j11) {
        }

        default void onShuffleModeEnabledChanged(boolean z11) {
        }

        default void onSkipSilenceEnabledChanged(boolean z11) {
        }

        default void onVolumeChanged(float f11) {
        }

        default void t(f0 f0Var) {
        }

        default void v(i0 i0Var) {
        }

        default void U(y yVar, int i11) {
        }

        default void V(j0 j0Var, c cVar) {
        }

        default void a0(r0 r0Var, int i11) {
        }

        default void onDeviceVolumeChanged(int i11, boolean z11) {
        }

        default void onPlayWhenReadyChanged(boolean z11, int i11) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z11, int i11) {
        }

        default void onSurfaceSizeChanged(int i11, int i12) {
        }

        default void H(e eVar, e eVar2, int i11) {
        }
    }
}
