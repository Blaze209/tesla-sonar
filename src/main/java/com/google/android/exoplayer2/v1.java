package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.v1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface v1 {

    public static final class b implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f41114b = new a().e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f41115c = ts.p0.t0(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final g.a<b> f41116d = new g.a() { // from class: br.g0
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return v1.b.d(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ts.o f41117a;

        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final int[] f41118b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ts.o.b f41119a = new ts.o.b();

            public a a(int i11) {
                this.f41119a.a(i11);
                return this;
            }

            public a b(b bVar) {
                this.f41119a.b(bVar.f41117a);
                return this;
            }

            public a c(int... iArr) {
                this.f41119a.c(iArr);
                return this;
            }

            public a d(int i11, boolean z11) {
                this.f41119a.d(i11, z11);
                return this;
            }

            public b e() {
                return new b(this.f41119a.e());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b d(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f41115c);
            if (integerArrayList == null) {
                return f41114b;
            }
            a aVar = new a();
            for (int i11 = 0; i11 < integerArrayList.size(); i11++) {
                aVar.a(integerArrayList.get(i11).intValue());
            }
            return aVar.e();
        }

        public boolean c(int i11) {
            return this.f41117a.a(i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f41117a.equals(((b) obj).f41117a);
            }
            return false;
        }

        public int hashCode() {
            return this.f41117a.hashCode();
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i11 = 0; i11 < this.f41117a.d(); i11++) {
                arrayList.add(Integer.valueOf(this.f41117a.c(i11)));
            }
            bundle.putIntegerArrayList(f41115c, arrayList);
            return bundle;
        }

        private b(ts.o oVar) {
            this.f41117a = oVar;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ts.o f41120a;

        public c(ts.o oVar) {
            this.f41120a = oVar;
        }

        public boolean a(int... iArr) {
            return this.f41120a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f41120a.equals(((c) obj).f41120a);
            }
            return false;
        }

        public int hashCode() {
            return this.f41120a.hashCode();
        }
    }

    public interface d {
        default void onAudioAttributesChanged(com.google.android.exoplayer2.audio.a aVar) {
        }

        default void onAudioSessionIdChanged(int i11) {
        }

        default void onAvailableCommandsChanged(b bVar) {
        }

        @Deprecated
        default void onCues(List<gs.b> list) {
        }

        default void onDeviceInfoChanged(j jVar) {
        }

        default void onDeviceVolumeChanged(int i11, boolean z11) {
        }

        default void onEvents(v1 v1Var, c cVar) {
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

        default void onMediaItemTransition(x0 x0Var, int i11) {
        }

        default void onMediaMetadataChanged(y0 y0Var) {
        }

        default void onPlayWhenReadyChanged(boolean z11, int i11) {
        }

        default void onPlaybackParametersChanged(u1 u1Var) {
        }

        default void onPlaybackStateChanged(int i11) {
        }

        default void onPlaybackSuppressionReasonChanged(int i11) {
        }

        default void onPlayerError(PlaybackException playbackException) {
        }

        default void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z11, int i11) {
        }

        default void onPlaylistMetadataChanged(y0 y0Var) {
        }

        @Deprecated
        default void onPositionDiscontinuity(int i11) {
        }

        default void onRenderedFirstFrame() {
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

        default void onSurfaceSizeChanged(int i11, int i12) {
        }

        default void onTimelineChanged(f2 f2Var, int i11) {
        }

        default void onTracksChanged(g2 g2Var) {
        }

        default void onVolumeChanged(float f11) {
        }

        default void onCues(gs.f fVar) {
        }

        default void onPositionDiscontinuity(e eVar, e eVar2, int i11) {
        }

        default void onMetadata(ur.a aVar) {
        }

        default void onTrackSelectionParametersChanged(qs.y yVar) {
        }

        default void onVideoSizeChanged(us.z zVar) {
        }
    }

    public static final class e implements g {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f41121k = ts.p0.t0(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f41122l = ts.p0.t0(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f41123m = ts.p0.t0(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f41124n = ts.p0.t0(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f41125o = ts.p0.t0(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f41126p = ts.p0.t0(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f41127q = ts.p0.t0(6);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final g.a<e> f41128r = new g.a() { // from class: br.h0
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return v1.e.b(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f41129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public final int f41130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f41131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final x0 f41132d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f41133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f41134f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f41135g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f41136h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f41137i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f41138j;

        public e(Object obj, int i11, x0 x0Var, Object obj2, int i12, long j11, long j12, int i13, int i14) {
            this.f41129a = obj;
            this.f41130b = i11;
            this.f41131c = i11;
            this.f41132d = x0Var;
            this.f41133e = obj2;
            this.f41134f = i12;
            this.f41135g = j11;
            this.f41136h = j12;
            this.f41137i = i13;
            this.f41138j = i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e b(Bundle bundle) {
            int i11 = bundle.getInt(f41121k, 0);
            Bundle bundle2 = bundle.getBundle(f41122l);
            return new e(null, i11, bundle2 == null ? null : (x0) x0.f41165p.a(bundle2), null, bundle.getInt(f41123m, 0), bundle.getLong(f41124n, 0L), bundle.getLong(f41125o, 0L), bundle.getInt(f41126p, -1), bundle.getInt(f41127q, -1));
        }

        public Bundle c(boolean z11, boolean z12) {
            Bundle bundle = new Bundle();
            bundle.putInt(f41121k, z12 ? this.f41131c : 0);
            x0 x0Var = this.f41132d;
            if (x0Var != null && z11) {
                bundle.putBundle(f41122l, x0Var.toBundle());
            }
            bundle.putInt(f41123m, z12 ? this.f41134f : 0);
            bundle.putLong(f41124n, z11 ? this.f41135g : 0L);
            bundle.putLong(f41125o, z11 ? this.f41136h : 0L);
            bundle.putInt(f41126p, z11 ? this.f41137i : -1);
            bundle.putInt(f41127q, z11 ? this.f41138j : -1);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f41131c == eVar.f41131c && this.f41134f == eVar.f41134f && this.f41135g == eVar.f41135g && this.f41136h == eVar.f41136h && this.f41137i == eVar.f41137i && this.f41138j == eVar.f41138j && ou.l.a(this.f41129a, eVar.f41129a) && ou.l.a(this.f41133e, eVar.f41133e) && ou.l.a(this.f41132d, eVar.f41132d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ou.l.b(this.f41129a, Integer.valueOf(this.f41131c), this.f41132d, this.f41133e, Integer.valueOf(this.f41134f), Long.valueOf(this.f41135g), Long.valueOf(this.f41136h), Integer.valueOf(this.f41137i), Integer.valueOf(this.f41138j));
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            return c(true, true);
        }
    }

    long A();

    long B();

    void C();

    long D();

    void E();

    boolean E0();

    void F();

    Looper F0();

    void G(boolean z11);

    void G0(d dVar);

    gs.f H();

    void H0(qs.y yVar);

    int I();

    void I0(d dVar);

    f2 J();

    void K();

    void L(TextureView textureView);

    void M(int i11, long j11);

    b N();

    us.z O();

    boolean P();

    long Q();

    int R();

    void S(SurfaceView surfaceView);

    boolean T();

    void U();

    y0 V();

    long W();

    PlaybackException a();

    void b();

    boolean c0(int i11);

    void d();

    u1 e();

    void f();

    int g();

    long getDuration();

    int h();

    void i(int i11);

    boolean isPlaying();

    void j(u1 u1Var);

    boolean m();

    long n();

    boolean n0();

    void o(SurfaceView surfaceView);

    g2 p();

    boolean q();

    int r();

    void release();

    qs.y s();

    void seekTo(long j11);

    boolean t();

    boolean t0();

    void u(boolean z11);

    long v();

    long w();

    int x();

    void y(TextureView textureView);

    int z();
}
