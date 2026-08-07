package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import b8.t;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.u1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.collect.d1;
import com.google.common.collect.x;
import cr.q1;
import dr.s;
import dr.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ts.p0;
import ts.u;
import ts.y;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static boolean f39430h0 = false;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Object f39431i0 = new Object();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static ExecutorService f39432j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static int f39433k0;
    private i A;
    private i B;
    private u1 C;
    private boolean D;
    private ByteBuffer E;
    private int F;
    private long G;
    private long H;
    private long I;
    private long J;
    private int K;
    private boolean L;
    private boolean M;
    private long N;
    private float O;
    private ByteBuffer P;
    private int Q;
    private ByteBuffer R;
    private byte[] S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private dr.p Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f39434a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private d f39435a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dr.e f39436b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f39437b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f39438c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private long f39439c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.audio.i f39440d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private long f39441d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q f39442e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f39443e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x<AudioProcessor> f39444f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f39445f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x<AudioProcessor> f39446g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private Looper f39447g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ts.g f39448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.exoplayer2.audio.g f39449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayDeque<i> f39450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f39451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f39452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l f39453m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j<AudioSink.InitializationException> f39454n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final j<AudioSink.WriteException> f39455o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final e f39456p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.exoplayer2.k.a f39457q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private q1 f39458r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AudioSink.a f39459s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private g f39460t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private g f39461u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.google.android.exoplayer2.audio.d f39462v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AudioTrack f39463w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.google.android.exoplayer2.audio.b f39464x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.google.android.exoplayer2.audio.c f39465y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.google.android.exoplayer2.audio.a f39466z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    private static final class b {
        public static void a(AudioTrack audioTrack, d dVar) {
            audioTrack.setPreferredDevice(dVar == null ? null : dVar.f39467a);
        }
    }

    private static final class c {
        public static void a(AudioTrack audioTrack, q1 q1Var) {
            LogSessionId logSessionIdA = q1Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioDeviceInfo f39467a;

        public d(AudioDeviceInfo audioDeviceInfo) {
            this.f39467a = audioDeviceInfo;
        }
    }

    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f39468a = new com.google.android.exoplayer2.audio.j.a().g();

        int a(int i11, int i12, int i13, int i14, int i15, int i16, double d11);
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f39469a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private dr.e f39471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f39472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f39473e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        com.google.android.exoplayer2.k.a f39476h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.android.exoplayer2.audio.b f39470b = com.google.android.exoplayer2.audio.b.f39521c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f39474f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        e f39475g = e.f39468a;

        public f(Context context) {
            this.f39469a = context;
        }

        public DefaultAudioSink g() {
            if (this.f39471c == null) {
                this.f39471c = new h(new AudioProcessor[0]);
            }
            return new DefaultAudioSink(this);
        }

        public f h(boolean z11) {
            this.f39473e = z11;
            return this;
        }

        public f i(boolean z11) {
            this.f39472d = z11;
            return this;
        }

        public f j(int i11) {
            this.f39474f = i11;
            return this;
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u0 f39477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f39479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f39480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f39481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f39482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f39483g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f39484h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final com.google.android.exoplayer2.audio.d f39485i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f39486j;

        public g(u0 u0Var, int i11, int i12, int i13, int i14, int i15, int i16, int i17, com.google.android.exoplayer2.audio.d dVar, boolean z11) {
            this.f39477a = u0Var;
            this.f39478b = i11;
            this.f39479c = i12;
            this.f39480d = i13;
            this.f39481e = i14;
            this.f39482f = i15;
            this.f39483g = i16;
            this.f39484h = i17;
            this.f39485i = dVar;
            this.f39486j = z11;
        }

        private AudioTrack d(boolean z11, com.google.android.exoplayer2.audio.a aVar, int i11) {
            int i12 = p0.f115040a;
            if (i12 >= 29) {
                return f(z11, aVar, i11);
            }
            return i12 >= 21 ? e(z11, aVar, i11) : g(aVar, i11);
        }

        private AudioTrack e(boolean z11, com.google.android.exoplayer2.audio.a aVar, int i11) {
            return new AudioTrack(i(aVar, z11), DefaultAudioSink.N(this.f39481e, this.f39482f, this.f39483g), this.f39484h, 1, i11);
        }

        private AudioTrack f(boolean z11, com.google.android.exoplayer2.audio.a aVar, int i11) {
            return new AudioTrack.Builder().setAudioAttributes(i(aVar, z11)).setAudioFormat(DefaultAudioSink.N(this.f39481e, this.f39482f, this.f39483g)).setTransferMode(1).setBufferSizeInBytes(this.f39484h).setSessionId(i11).setOffloadedPlayback(this.f39479c == 1).build();
        }

        private AudioTrack g(com.google.android.exoplayer2.audio.a aVar, int i11) {
            int iE0 = p0.e0(aVar.f39511c);
            return i11 == 0 ? new AudioTrack(iE0, this.f39481e, this.f39482f, this.f39483g, this.f39484h, 1) : new AudioTrack(iE0, this.f39481e, this.f39482f, this.f39483g, this.f39484h, 1, i11);
        }

        private static AudioAttributes i(com.google.android.exoplayer2.audio.a aVar, boolean z11) {
            return z11 ? j() : aVar.b().f39515a;
        }

        private static AudioAttributes j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z11, com.google.android.exoplayer2.audio.a aVar, int i11) throws AudioSink.InitializationException {
            try {
                AudioTrack audioTrackD = d(z11, aVar, i11);
                int state = audioTrackD.getState();
                if (state == 1) {
                    return audioTrackD;
                }
                try {
                    audioTrackD.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f39481e, this.f39482f, this.f39484h, this.f39477a, l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e11) {
                throw new AudioSink.InitializationException(0, this.f39481e, this.f39482f, this.f39484h, this.f39477a, l(), e11);
            }
        }

        public boolean b(g gVar) {
            return gVar.f39479c == this.f39479c && gVar.f39483g == this.f39483g && gVar.f39481e == this.f39481e && gVar.f39482f == this.f39482f && gVar.f39480d == this.f39480d && gVar.f39486j == this.f39486j;
        }

        public g c(int i11) {
            return new g(this.f39477a, this.f39478b, this.f39479c, this.f39480d, this.f39481e, this.f39482f, this.f39483g, i11, this.f39485i, this.f39486j);
        }

        public long h(long j11) {
            return p0.L0(j11, this.f39481e);
        }

        public long k(long j11) {
            return p0.L0(j11, this.f39477a.f40726z);
        }

        public boolean l() {
            return this.f39479c == 1;
        }
    }

    public static class h implements dr.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioProcessor[] f39487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.exoplayer2.audio.l f39488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n f39489c;

        public h(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new com.google.android.exoplayer2.audio.l(), new n());
        }

        @Override // dr.e
        public AudioProcessor[] a() {
            return this.f39487a;
        }

        @Override // dr.e
        public long b() {
            return this.f39488b.o();
        }

        @Override // dr.e
        public long c(long j11) {
            return this.f39489c.f(j11);
        }

        @Override // dr.e
        public boolean d(boolean z11) {
            this.f39488b.u(z11);
            return z11;
        }

        @Override // dr.e
        public u1 e(u1 u1Var) {
            this.f39489c.h(u1Var.f40757a);
            this.f39489c.g(u1Var.f40758b);
            return u1Var;
        }

        public h(AudioProcessor[] audioProcessorArr, com.google.android.exoplayer2.audio.l lVar, n nVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f39487a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f39488b = lVar;
            this.f39489c = nVar;
            audioProcessorArr2[audioProcessorArr.length] = lVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = nVar;
        }
    }

    private static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u1 f39490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f39491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f39492c;

        private i(u1 u1Var, long j11, long j12) {
            this.f39490a = u1Var;
            this.f39491b = j11;
            this.f39492c = j12;
        }
    }

    private static final class j<T extends Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f39493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private T f39494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f39495c;

        public j(long j11) {
            this.f39493a = j11;
        }

        public void a() {
            this.f39494b = null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void b(T t11) throws T {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f39494b == null) {
                this.f39494b = t11;
                this.f39495c = this.f39493a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f39495c) {
                T t12 = this.f39494b;
                if (t12 != t11) {
                    t12.addSuppressed(t11);
                }
                T t13 = this.f39494b;
                a();
                throw t13;
            }
        }
    }

    private final class k implements com.google.android.exoplayer2.audio.g.a {
        private k() {
        }

        @Override // com.google.android.exoplayer2.audio.g.a
        public void a(long j11, long j12, long j13, long j14) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j11 + ", " + j12 + ", " + j13 + ", " + j14 + ", " + DefaultAudioSink.this.R() + ", " + DefaultAudioSink.this.S();
            if (DefaultAudioSink.f39430h0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            u.i("DefaultAudioSink", str);
        }

        @Override // com.google.android.exoplayer2.audio.g.a
        public void b(long j11) {
            if (DefaultAudioSink.this.f39459s != null) {
                DefaultAudioSink.this.f39459s.b(j11);
            }
        }

        @Override // com.google.android.exoplayer2.audio.g.a
        public void c(long j11, long j12, long j13, long j14) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j11 + ", " + j12 + ", " + j13 + ", " + j14 + ", " + DefaultAudioSink.this.R() + ", " + DefaultAudioSink.this.S();
            if (DefaultAudioSink.f39430h0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            u.i("DefaultAudioSink", str);
        }

        @Override // com.google.android.exoplayer2.audio.g.a
        public void d(int i11, long j11) {
            if (DefaultAudioSink.this.f39459s != null) {
                DefaultAudioSink.this.f39459s.c(i11, j11, SystemClock.elapsedRealtime() - DefaultAudioSink.this.f39441d0);
            }
        }

        @Override // com.google.android.exoplayer2.audio.g.a
        public void e(long j11) {
            u.i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j11);
        }
    }

    private final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f39497a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f39498b;

        class a extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ DefaultAudioSink f39500a;

            a(DefaultAudioSink defaultAudioSink) {
                this.f39500a = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i11) {
                if (audioTrack.equals(DefaultAudioSink.this.f39463w) && DefaultAudioSink.this.f39459s != null && DefaultAudioSink.this.W) {
                    DefaultAudioSink.this.f39459s.g();
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f39463w) && DefaultAudioSink.this.f39459s != null && DefaultAudioSink.this.W) {
                    DefaultAudioSink.this.f39459s.g();
                }
            }
        }

        public l() {
            this.f39498b = new a(DefaultAudioSink.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f39497a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new t(handler), this.f39498b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f39498b);
            this.f39497a.removeCallbacksAndMessages(null);
        }
    }

    private void G(long j11) {
        u1 u1VarE;
        if (m0()) {
            u1VarE = u1.f40753d;
        } else {
            u1VarE = k0() ? this.f39436b.e(this.C) : u1.f40753d;
            this.C = u1VarE;
        }
        u1 u1Var = u1VarE;
        this.D = k0() ? this.f39436b.d(this.D) : false;
        this.f39450j.add(new i(u1Var, Math.max(0L, j11), this.f39461u.h(S())));
        j0();
        AudioSink.a aVar = this.f39459s;
        if (aVar != null) {
            aVar.onSkipSilenceEnabledChanged(this.D);
        }
    }

    private long H(long j11) {
        while (!this.f39450j.isEmpty() && j11 >= this.f39450j.getFirst().f39492c) {
            this.B = this.f39450j.remove();
        }
        i iVar = this.B;
        long j12 = j11 - iVar.f39492c;
        if (iVar.f39490a.equals(u1.f40753d)) {
            return this.B.f39491b + j12;
        }
        if (this.f39450j.isEmpty()) {
            return this.B.f39491b + this.f39436b.c(j12);
        }
        i first = this.f39450j.getFirst();
        return first.f39491b - p0.Y(first.f39492c - j11, this.B.f39490a.f40757a);
    }

    private long I(long j11) {
        return j11 + this.f39461u.h(this.f39436b.b());
    }

    private AudioTrack J(g gVar) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackA = gVar.a(this.f39437b0, this.f39466z, this.Y);
            com.google.android.exoplayer2.k.a aVar = this.f39457q;
            if (aVar == null) {
                return audioTrackA;
            }
            aVar.B(W(audioTrackA));
            return audioTrackA;
        } catch (AudioSink.InitializationException e11) {
            AudioSink.a aVar2 = this.f39459s;
            if (aVar2 != null) {
                aVar2.a(e11);
            }
            throw e11;
        }
    }

    private AudioTrack K() throws AudioSink.InitializationException {
        try {
            return J((g) ts.a.e(this.f39461u));
        } catch (AudioSink.InitializationException e11) {
            g gVar = this.f39461u;
            if (gVar.f39484h > 1000000) {
                g gVarC = gVar.c(1000000);
                try {
                    AudioTrack audioTrackJ = J(gVarC);
                    this.f39461u = gVarC;
                    return audioTrackJ;
                } catch (AudioSink.InitializationException e12) {
                    e11.addSuppressed(e12);
                    X();
                    throw e11;
                }
            }
            X();
            throw e11;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    private boolean L() throws AudioSink.WriteException, T {
        ByteBuffer byteBuffer;
        if (this.f39462v.f()) {
            this.f39462v.h();
            a0(Long.MIN_VALUE);
            return this.f39462v.e() && ((byteBuffer = this.R) == null || !byteBuffer.hasRemaining());
        }
        ByteBuffer byteBuffer2 = this.R;
        if (byteBuffer2 == null) {
            return true;
        }
        o0(byteBuffer2, Long.MIN_VALUE);
        return this.R == null;
    }

    private com.google.android.exoplayer2.audio.b M() {
        if (this.f39465y == null && this.f39434a != null) {
            this.f39447g0 = Looper.myLooper();
            com.google.android.exoplayer2.audio.c cVar = new com.google.android.exoplayer2.audio.c(this.f39434a, new com.google.android.exoplayer2.audio.c.f() { // from class: dr.q
                @Override // com.google.android.exoplayer2.audio.c.f
                public final void a(com.google.android.exoplayer2.audio.b bVar) {
                    this.f60894a.Y(bVar);
                }
            });
            this.f39465y = cVar;
            this.f39464x = cVar.d();
        }
        return this.f39464x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat N(int i11, int i12, int i13) {
        return new AudioFormat.Builder().setSampleRate(i11).setChannelMask(i12).setEncoding(i13).build();
    }

    private static int O(int i11, int i12, int i13) {
        int minBufferSize = AudioTrack.getMinBufferSize(i11, i12, i13);
        ts.a.g(minBufferSize != -2);
        return minBufferSize;
    }

    private static int P(int i11, ByteBuffer byteBuffer) {
        switch (i11) {
            case 5:
            case 6:
            case 18:
                return dr.b.e(byteBuffer);
            case 7:
            case 8:
                return s.e(byteBuffer);
            case 9:
                int iM = dr.t.m(p0.H(byteBuffer, byteBuffer.position()));
                if (iM != -1) {
                    return iM;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            case 19:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i11);
            case 14:
                int iB = dr.b.b(byteBuffer);
                if (iB == -1) {
                    return 0;
                }
                return dr.b.i(byteBuffer, iB) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return dr.c.c(byteBuffer);
            case 20:
                return v.g(byteBuffer);
        }
    }

    @SuppressLint({"InlinedApi"})
    private int Q(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i11 = p0.f115040a;
        if (i11 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i11 == 30 && p0.f115043d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long R() {
        g gVar = this.f39461u;
        return gVar.f39479c == 0 ? this.G / ((long) gVar.f39478b) : this.H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long S() {
        g gVar = this.f39461u;
        return gVar.f39479c == 0 ? this.I / ((long) gVar.f39480d) : this.J;
    }

    private boolean T() throws AudioSink.InitializationException {
        q1 q1Var;
        if (!this.f39448h.d()) {
            return false;
        }
        AudioTrack audioTrackK = K();
        this.f39463w = audioTrackK;
        if (W(audioTrackK)) {
            b0(this.f39463w);
            if (this.f39452l != 3) {
                AudioTrack audioTrack = this.f39463w;
                u0 u0Var = this.f39461u.f39477a;
                audioTrack.setOffloadDelayPadding(u0Var.B, u0Var.C);
            }
        }
        int i11 = p0.f115040a;
        if (i11 >= 31 && (q1Var = this.f39458r) != null) {
            c.a(this.f39463w, q1Var);
        }
        this.Y = this.f39463w.getAudioSessionId();
        com.google.android.exoplayer2.audio.g gVar = this.f39449i;
        AudioTrack audioTrack2 = this.f39463w;
        g gVar2 = this.f39461u;
        gVar.r(audioTrack2, gVar2.f39479c == 2, gVar2.f39483g, gVar2.f39480d, gVar2.f39484h);
        g0();
        int i12 = this.Z.f60892a;
        if (i12 != 0) {
            this.f39463w.attachAuxEffect(i12);
            this.f39463w.setAuxEffectSendLevel(this.Z.f60893b);
        }
        d dVar = this.f39435a0;
        if (dVar != null && i11 >= 23) {
            b.a(this.f39463w, dVar);
        }
        this.M = true;
        return true;
    }

    private static boolean U(int i11) {
        return (p0.f115040a >= 24 && i11 == -6) || i11 == -32;
    }

    private boolean V() {
        return this.f39463w != null;
    }

    private static boolean W(AudioTrack audioTrack) {
        return p0.f115040a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private void X() {
        if (this.f39461u.l()) {
            this.f39443e0 = true;
        }
    }

    private void Z() {
        if (this.V) {
            return;
        }
        this.V = true;
        this.f39449i.f(S());
        this.f39463w.stop();
        this.F = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    private void a0(long j11) throws AudioSink.WriteException, T {
        ByteBuffer byteBufferD;
        if (!this.f39462v.f()) {
            ByteBuffer byteBuffer = this.P;
            if (byteBuffer == null) {
                byteBuffer = AudioProcessor.f39415a;
            }
            o0(byteBuffer, j11);
            return;
        }
        while (!this.f39462v.e()) {
            do {
                byteBufferD = this.f39462v.d();
                if (byteBufferD.hasRemaining()) {
                    o0(byteBufferD, j11);
                } else {
                    ByteBuffer byteBuffer2 = this.P;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f39462v.i(this.P);
                    }
                }
            } while (!byteBufferD.hasRemaining());
            return;
        }
    }

    private void b0(AudioTrack audioTrack) {
        if (this.f39453m == null) {
            this.f39453m = new l();
        }
        this.f39453m.a(audioTrack);
    }

    private static void c0(final AudioTrack audioTrack, final ts.g gVar) {
        gVar.c();
        synchronized (f39431i0) {
            try {
                if (f39432j0 == null) {
                    f39432j0 = p0.E0("ExoPlayer:AudioTrackReleaseThread");
                }
                f39433k0++;
                f39432j0.execute(new Runnable() { // from class: dr.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultAudioSink.y(audioTrack, gVar);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void d0() {
        this.G = 0L;
        this.H = 0L;
        this.I = 0L;
        this.J = 0L;
        this.f39445f0 = false;
        this.K = 0;
        this.B = new i(this.C, 0L, 0L);
        this.N = 0L;
        this.A = null;
        this.f39450j.clear();
        this.P = null;
        this.Q = 0;
        this.R = null;
        this.V = false;
        this.U = false;
        this.E = null;
        this.F = 0;
        this.f39442e.m();
        j0();
    }

    private void e0(u1 u1Var) {
        i iVar = new i(u1Var, -9223372036854775807L, -9223372036854775807L);
        if (V()) {
            this.A = iVar;
        } else {
            this.B = iVar;
        }
    }

    private void f0() {
        if (V()) {
            try {
                this.f39463w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.C.f40757a).setPitch(this.C.f40758b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e11) {
                u.j("DefaultAudioSink", "Failed to set playback params", e11);
            }
            u1 u1Var = new u1(this.f39463w.getPlaybackParams().getSpeed(), this.f39463w.getPlaybackParams().getPitch());
            this.C = u1Var;
            this.f39449i.s(u1Var.f40757a);
        }
    }

    private void g0() {
        if (V()) {
            if (p0.f115040a >= 21) {
                h0(this.f39463w, this.O);
            } else {
                i0(this.f39463w, this.O);
            }
        }
    }

    private static void h0(AudioTrack audioTrack, float f11) {
        audioTrack.setVolume(f11);
    }

    private static void i0(AudioTrack audioTrack, float f11) {
        audioTrack.setStereoVolume(f11, f11);
    }

    private void j0() {
        com.google.android.exoplayer2.audio.d dVar = this.f39461u.f39485i;
        this.f39462v = dVar;
        dVar.b();
    }

    private boolean k0() {
        if (this.f39437b0) {
            return false;
        }
        g gVar = this.f39461u;
        return gVar.f39479c == 0 && !l0(gVar.f39477a.A);
    }

    private boolean l0(int i11) {
        return this.f39438c && p0.v0(i11);
    }

    private boolean m0() {
        g gVar = this.f39461u;
        return gVar != null && gVar.f39486j && p0.f115040a >= 23;
    }

    private boolean n0(u0 u0Var, com.google.android.exoplayer2.audio.a aVar) {
        int iD;
        int iF;
        int iQ;
        if (p0.f115040a < 29 || this.f39452l == 0 || (iD = y.d((String) ts.a.e(u0Var.f40712l), u0Var.f40709i)) == 0 || (iF = p0.F(u0Var.f40725y)) == 0 || (iQ = Q(N(u0Var.f40726z, iF, iD), aVar.b().f39515a)) == 0) {
            return false;
        }
        if (iQ == 1) {
            return ((u0Var.B != 0 || u0Var.C != 0) && (this.f39452l == 1)) ? false : true;
        }
        if (iQ == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    private void o0(ByteBuffer byteBuffer, long j11) throws AudioSink.WriteException, T {
        DefaultAudioSink defaultAudioSink;
        ByteBuffer byteBuffer2;
        int iP0;
        AudioSink.a aVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.R;
            if (byteBuffer3 != null) {
                ts.a.a(byteBuffer3 == byteBuffer);
            } else {
                this.R = byteBuffer;
                if (p0.f115040a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.S;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.S = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.S, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.T = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (p0.f115040a < 21) {
                int iB = this.f39449i.b(this.I);
                if (iB > 0) {
                    iP0 = this.f39463w.write(this.S, this.T, Math.min(iRemaining2, iB));
                    if (iP0 > 0) {
                        this.T += iP0;
                        byteBuffer.position(byteBuffer.position() + iP0);
                    }
                } else {
                    iP0 = 0;
                }
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
            } else if (this.f39437b0) {
                ts.a.g(j11 != -9223372036854775807L);
                if (j11 == Long.MIN_VALUE) {
                    j11 = this.f39439c0;
                } else {
                    this.f39439c0 = j11;
                }
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iP0 = defaultAudioSink.q0(this.f39463w, byteBuffer2, iRemaining2, j11);
            } else {
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iP0 = p0(defaultAudioSink.f39463w, byteBuffer2, iRemaining2);
            }
            defaultAudioSink.f39441d0 = SystemClock.elapsedRealtime();
            if (iP0 < 0) {
                AudioSink.WriteException writeException = new AudioSink.WriteException(iP0, defaultAudioSink.f39461u.f39477a, U(iP0) && defaultAudioSink.J > 0);
                AudioSink.a aVar2 = defaultAudioSink.f39459s;
                if (aVar2 != null) {
                    aVar2.a(writeException);
                }
                if (writeException.f39428b) {
                    defaultAudioSink.f39464x = com.google.android.exoplayer2.audio.b.f39521c;
                    throw writeException;
                }
                defaultAudioSink.f39455o.b(writeException);
                return;
            }
            defaultAudioSink.f39455o.a();
            if (W(defaultAudioSink.f39463w)) {
                if (defaultAudioSink.J > 0) {
                    defaultAudioSink.f39445f0 = false;
                }
                if (defaultAudioSink.W && (aVar = defaultAudioSink.f39459s) != null && iP0 < iRemaining2 && !defaultAudioSink.f39445f0) {
                    aVar.e();
                }
            }
            int i11 = defaultAudioSink.f39461u.f39479c;
            if (i11 == 0) {
                defaultAudioSink.I += (long) iP0;
            }
            if (iP0 == iRemaining2) {
                if (i11 != 0) {
                    ts.a.g(byteBuffer2 == defaultAudioSink.P);
                    defaultAudioSink.J += ((long) defaultAudioSink.K) * ((long) defaultAudioSink.Q);
                }
                defaultAudioSink.R = null;
            }
        }
    }

    private static int p0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i11) {
        return audioTrack.write(byteBuffer, i11, 1);
    }

    private int q0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i11, long j11) {
        if (p0.f115040a >= 26) {
            return audioTrack.write(byteBuffer, i11, 1, j11 * 1000);
        }
        if (this.E == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.E = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.E.putInt(1431633921);
        }
        if (this.F == 0) {
            this.E.putInt(4, i11);
            this.E.putLong(8, j11 * 1000);
            this.E.position(0);
            this.F = i11;
        }
        int iRemaining = this.E.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.E, iRemaining, 1);
            if (iWrite < 0) {
                this.F = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iP0 = p0(audioTrack, byteBuffer, i11);
        if (iP0 < 0) {
            this.F = 0;
            return iP0;
        }
        this.F -= iP0;
        return iP0;
    }

    public static /* synthetic */ void y(AudioTrack audioTrack, ts.g gVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            gVar.e();
            synchronized (f39431i0) {
                try {
                    int i11 = f39433k0 - 1;
                    f39433k0 = i11;
                    if (i11 == 0) {
                        f39432j0.shutdown();
                        f39432j0 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            gVar.e();
            synchronized (f39431i0) {
                try {
                    int i12 = f39433k0 - 1;
                    f39433k0 = i12;
                    if (i12 == 0) {
                        f39432j0.shutdown();
                        f39432j0 = null;
                    }
                    throw th3;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public void Y(com.google.android.exoplayer2.audio.b bVar) {
        ts.a.g(this.f39447g0 == Looper.myLooper());
        if (bVar.equals(M())) {
            return;
        }
        this.f39464x = bVar;
        AudioSink.a aVar = this.f39459s;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean a() {
        if (V()) {
            return this.U && !n();
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean b(u0 u0Var) {
        return v(u0Var) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void c(com.google.android.exoplayer2.audio.a aVar) {
        if (this.f39466z.equals(aVar)) {
            return;
        }
        this.f39466z = aVar;
        if (this.f39437b0) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void d() {
        this.W = false;
        if (V() && this.f39449i.o()) {
            this.f39463w.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public u1 e() {
        return this.C;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void f() {
        this.W = true;
        if (V()) {
            this.f39449i.t();
            this.f39463w.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (V()) {
            d0();
            if (this.f39449i.h()) {
                this.f39463w.pause();
            }
            if (W(this.f39463w)) {
                ((l) ts.a.e(this.f39453m)).b(this.f39463w);
            }
            if (p0.f115040a < 21 && !this.X) {
                this.Y = 0;
            }
            g gVar = this.f39460t;
            if (gVar != null) {
                this.f39461u = gVar;
                this.f39460t = null;
            }
            this.f39449i.p();
            c0(this.f39463w, this.f39448h);
            this.f39463w = null;
        }
        this.f39455o.a();
        this.f39454n.a();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void g(q1 q1Var) {
        this.f39458r = q1Var;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void h() {
        if (p0.f115040a < 25) {
            flush();
            return;
        }
        this.f39455o.a();
        this.f39454n.a();
        if (V()) {
            d0();
            if (this.f39449i.h()) {
                this.f39463w.pause();
            }
            this.f39463w.flush();
            this.f39449i.p();
            com.google.android.exoplayer2.audio.g gVar = this.f39449i;
            AudioTrack audioTrack = this.f39463w;
            g gVar2 = this.f39461u;
            gVar.r(audioTrack, gVar2.f39479c == 2, gVar2.f39483g, gVar2.f39480d, gVar2.f39484h);
            this.M = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void i(AudioSink.a aVar) {
        this.f39459s = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void j(u1 u1Var) {
        this.C = new u1(p0.p(u1Var.f40757a, 0.1f, 8.0f), p0.p(u1Var.f40758b, 0.1f, 8.0f));
        if (m0()) {
            f0();
        } else {
            e0(u1Var);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void k(float f11) {
        if (this.O != f11) {
            this.O = f11;
            g0();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void l() {
        if (this.f39437b0) {
            this.f39437b0 = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void m() {
        ts.a.g(p0.f115040a >= 21);
        ts.a.g(this.X);
        if (this.f39437b0) {
            return;
        }
        this.f39437b0 = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean n() {
        return V() && this.f39449i.g(S());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void o(int i11) {
        if (this.Y != i11) {
            this.Y = i11;
            this.X = i11 != 0;
            flush();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean p(ByteBuffer byteBuffer, long j11, int i11) throws AudioSink.WriteException, T, AudioSink.InitializationException {
        ByteBuffer byteBuffer2 = this.P;
        ts.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f39460t != null) {
            if (!L()) {
                return false;
            }
            if (this.f39460t.b(this.f39461u)) {
                this.f39461u = this.f39460t;
                this.f39460t = null;
                if (W(this.f39463w) && this.f39452l != 3) {
                    if (this.f39463w.getPlayState() == 3) {
                        this.f39463w.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f39463w;
                    u0 u0Var = this.f39461u.f39477a;
                    audioTrack.setOffloadDelayPadding(u0Var.B, u0Var.C);
                    this.f39445f0 = true;
                }
            } else {
                Z();
                if (n()) {
                    return false;
                }
                flush();
            }
            G(j11);
        }
        if (!V()) {
            try {
                if (!T()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e11) {
                if (e11.f39423b) {
                    throw e11;
                }
                this.f39454n.b(e11);
                return false;
            }
        }
        this.f39454n.a();
        if (this.M) {
            this.N = Math.max(0L, j11);
            this.L = false;
            this.M = false;
            if (m0()) {
                f0();
            }
            G(j11);
            if (this.W) {
                f();
            }
        }
        if (!this.f39449i.j(S())) {
            return false;
        }
        if (this.P == null) {
            ts.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            g gVar = this.f39461u;
            if (gVar.f39479c != 0 && this.K == 0) {
                int iP = P(gVar.f39483g, byteBuffer);
                this.K = iP;
                if (iP == 0) {
                    return true;
                }
            }
            if (this.A != null) {
                if (!L()) {
                    return false;
                }
                G(j11);
                this.A = null;
            }
            long jK = this.N + this.f39461u.k(R() - this.f39442e.l());
            if (!this.L && Math.abs(jK - j11) > 200000) {
                AudioSink.a aVar = this.f39459s;
                if (aVar != null) {
                    aVar.a(new AudioSink.UnexpectedDiscontinuityException(j11, jK));
                }
                this.L = true;
            }
            if (this.L) {
                if (!L()) {
                    return false;
                }
                long j12 = j11 - jK;
                this.N += j12;
                this.L = false;
                G(j11);
                AudioSink.a aVar2 = this.f39459s;
                if (aVar2 != null && j12 != 0) {
                    aVar2.f();
                }
            }
            if (this.f39461u.f39479c == 0) {
                this.G += (long) byteBuffer.remaining();
            } else {
                this.H += ((long) this.K) * ((long) i11);
            }
            this.P = byteBuffer;
            this.Q = i11;
        }
        a0(j11);
        if (!this.P.hasRemaining()) {
            this.P = null;
            this.Q = 0;
            return true;
        }
        if (!this.f39449i.i(S())) {
            return false;
        }
        u.i("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void q() {
        if (!this.U && V() && L()) {
            Z();
            this.U = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long r(boolean z11) {
        if (!V() || this.M) {
            return Long.MIN_VALUE;
        }
        return I(H(Math.min(this.f39449i.c(z11), this.f39461u.h(S()))));
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void release() {
        com.google.android.exoplayer2.audio.c cVar = this.f39465y;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        flush();
        d1<AudioProcessor> it = this.f39444f.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        d1<AudioProcessor> it2 = this.f39446g.iterator();
        while (it2.hasNext()) {
            it2.next().reset();
        }
        com.google.android.exoplayer2.audio.d dVar = this.f39462v;
        if (dVar != null) {
            dVar.j();
        }
        this.W = false;
        this.f39443e0 = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        d dVar = audioDeviceInfo == null ? null : new d(audioDeviceInfo);
        this.f39435a0 = dVar;
        AudioTrack audioTrack = this.f39463w;
        if (audioTrack != null) {
            b.a(audioTrack, dVar);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void t() {
        this.L = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void u(boolean z11) {
        this.D = z11;
        e0(m0() ? u1.f40753d : this.C);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int v(u0 u0Var) {
        if (!"audio/raw".equals(u0Var.f40712l)) {
            return ((this.f39443e0 || !n0(u0Var, this.f39466z)) && !M().i(u0Var)) ? 0 : 2;
        }
        if (p0.w0(u0Var.A)) {
            int i11 = u0Var.A;
            return (i11 == 2 || (this.f39438c && i11 == 4)) ? 2 : 1;
        }
        u.i("DefaultAudioSink", "Invalid PCM encoding: " + u0Var.A);
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void w(dr.p pVar) {
        if (this.Z.equals(pVar)) {
            return;
        }
        int i11 = pVar.f60892a;
        float f11 = pVar.f60893b;
        AudioTrack audioTrack = this.f39463w;
        if (audioTrack != null) {
            if (this.Z.f60892a != i11) {
                audioTrack.attachAuxEffect(i11);
            }
            if (i11 != 0) {
                this.f39463w.setAuxEffectSendLevel(f11);
            }
        }
        this.Z = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x010d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    /* JADX WARN: Code duplicated, block: B:40:0x011a  */
    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0123  */
    /* JADX WARN: Code duplicated, block: B:46:0x012c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0147  */
    /* JADX WARN: Code duplicated, block: B:52:0x014a  */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    /* JADX WARN: Code duplicated, block: B:56:0x016a  */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x014d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x016a, please report this as an issue */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void x(u0 u0Var, int i11, int[] iArr) throws AudioSink.ConfigurationException {
        int iIntValue;
        int iIntValue2;
        com.google.android.exoplayer2.audio.d dVar;
        int i12;
        boolean z11;
        int i13;
        int iC0;
        int iC1;
        int iD;
        int iF;
        int i14;
        double d11;
        int i15;
        int iA;
        g gVar;
        int[] iArr2;
        if (!"audio/raw".equals(u0Var.f40712l)) {
            com.google.android.exoplayer2.audio.d dVar2 = new com.google.android.exoplayer2.audio.d(x.r());
            int i16 = u0Var.f40726z;
            if (n0(u0Var, this.f39466z)) {
                iC0 = -1;
                iC1 = -1;
                i13 = 1;
                dVar = dVar2;
                iD = y.d((String) ts.a.e(u0Var.f40712l), u0Var.f40709i);
                i12 = i16;
                iF = p0.F(u0Var.f40725y);
                z11 = true;
            } else {
                Pair<Integer, Integer> pairF = M().f(u0Var);
                if (pairF == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + u0Var, u0Var);
                }
                iIntValue = ((Integer) pairF.first).intValue();
                iIntValue2 = ((Integer) pairF.second).intValue();
                dVar = dVar2;
                i12 = i16;
                z11 = this.f39451k;
                i13 = 2;
                iC0 = -1;
                iC1 = -1;
            }
            if (iD != 0) {
                throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i13 + ") for: " + u0Var, u0Var);
            }
            if (iF != 0) {
                throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i13 + ") for: " + u0Var, u0Var);
            }
            if (i11 != 0) {
                iA = i11;
                i15 = i12;
            } else {
                e eVar = this.f39456p;
                int iO = O(i12, iF, iD);
                if (iC1 != -1) {
                    i14 = iC1;
                } else {
                    i14 = 1;
                }
                int i17 = u0Var.f40708h;
                if (z11) {
                    d11 = 8.0d;
                } else {
                    d11 = 1.0d;
                }
                double d12 = d11;
                i15 = i12;
                iA = eVar.a(iO, iD, i13, i14, i15, i17, d12);
            }
            this.f39443e0 = false;
            gVar = new g(u0Var, iC0, i13, iC1, i15, iF, iD, iA, dVar, z11);
            if (V()) {
                this.f39460t = gVar;
            } else {
                this.f39461u = gVar;
            }
        }
        ts.a.a(p0.w0(u0Var.A));
        iC0 = p0.c0(u0Var.A, u0Var.f40725y);
        x.a aVar = new x.a();
        if (l0(u0Var.A)) {
            aVar.j(this.f39446g);
        } else {
            aVar.j(this.f39444f);
            aVar.i(this.f39436b.a());
        }
        com.google.android.exoplayer2.audio.d dVar3 = new com.google.android.exoplayer2.audio.d(aVar.k());
        if (dVar3.equals(this.f39462v)) {
            dVar3 = this.f39462v;
        }
        this.f39442e.n(u0Var.B, u0Var.C);
        if (p0.f115040a < 21 && u0Var.f40725y == 8 && iArr == null) {
            iArr2 = new int[6];
            for (int i18 = 0; i18 < 6; i18++) {
                iArr2[i18] = i18;
            }
        } else {
            iArr2 = iArr;
        }
        this.f39440d.l(iArr2);
        try {
            AudioProcessor.a aVarA = dVar3.a(new AudioProcessor.a(u0Var.f40726z, u0Var.f40725y, u0Var.A));
            iIntValue = aVarA.f39419c;
            int i19 = aVarA.f39417a;
            iIntValue2 = p0.F(aVarA.f39418b);
            iC1 = p0.c0(iIntValue, aVarA.f39418b);
            dVar = dVar3;
            i12 = i19;
            z11 = this.f39451k;
            i13 = 0;
        } catch (AudioProcessor.UnhandledAudioFormatException e11) {
            throw new AudioSink.ConfigurationException(e11, u0Var);
        }
        iD = iIntValue;
        iF = iIntValue2;
        if (iD != 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i13 + ") for: " + u0Var, u0Var);
        }
        if (iF != 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i13 + ") for: " + u0Var, u0Var);
        }
        if (i11 != 0) {
            iA = i11;
            i15 = i12;
        } else {
            e eVar2 = this.f39456p;
            int iO2 = O(i12, iF, iD);
            if (iC1 != -1) {
                i14 = iC1;
            } else {
                i14 = 1;
            }
            int i110 = u0Var.f40708h;
            if (z11) {
                d11 = 8.0d;
            } else {
                d11 = 1.0d;
            }
            double d13 = d11;
            i15 = i12;
            iA = eVar2.a(iO2, iD, i13, i14, i15, i110, d13);
        }
        this.f39443e0 = false;
        gVar = new g(u0Var, iC0, i13, iC1, i15, iF, iD, iA, dVar, z11);
        if (V()) {
            this.f39460t = gVar;
        } else {
            this.f39461u = gVar;
        }
    }

    @RequiresNonNull({"#1.audioProcessorChain"})
    private DefaultAudioSink(f fVar) {
        Context context = fVar.f39469a;
        this.f39434a = context;
        this.f39464x = context != null ? com.google.android.exoplayer2.audio.b.c(context) : fVar.f39470b;
        this.f39436b = fVar.f39471c;
        int i11 = p0.f115040a;
        this.f39438c = i11 >= 21 && fVar.f39472d;
        this.f39451k = i11 >= 23 && fVar.f39473e;
        this.f39452l = i11 >= 29 ? fVar.f39474f : 0;
        this.f39456p = fVar.f39475g;
        ts.g gVar = new ts.g(ts.d.f114979a);
        this.f39448h = gVar;
        gVar.e();
        this.f39449i = new com.google.android.exoplayer2.audio.g(new k());
        com.google.android.exoplayer2.audio.i iVar = new com.google.android.exoplayer2.audio.i();
        this.f39440d = iVar;
        q qVar = new q();
        this.f39442e = qVar;
        this.f39444f = x.u(new p(), iVar, qVar);
        this.f39446g = x.s(new o());
        this.O = 1.0f;
        this.f39466z = com.google.android.exoplayer2.audio.a.f39502g;
        this.Y = 0;
        this.Z = new dr.p(0, BitmapDescriptorFactory.HUE_RED);
        u1 u1Var = u1.f40753d;
        this.B = new i(u1Var, 0L, 0L);
        this.C = u1Var;
        this.D = false;
        this.f39450j = new ArrayDeque<>();
        this.f39454n = new j<>(100L);
        this.f39455o = new j<>(100L);
        this.f39457q = fVar.f39476h;
    }
}
