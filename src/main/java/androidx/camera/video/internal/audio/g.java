package androidx.camera.video.internal.audio;

import androidx.annotation.NonNull;
import c0.y0;
import c1.n;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import u5.h;

/* JADX INFO: loaded from: classes.dex */
public class g implements AudioStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f3651a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f3652b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f3655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f3656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AudioStream.a f3657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Executor f3658h;

    public g(@NonNull c1.a aVar) {
        this.f3653c = aVar.d();
        this.f3654d = aVar.f();
    }

    private static void c(long j11) {
        long jF = j11 - f();
        if (jF > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(jF));
            } catch (InterruptedException e11) {
                y0.m("SilentAudioStream", "Ignore interruption", e11);
            }
        }
    }

    private void d() {
        h.j(!this.f3652b.get(), "AudioStream has been released.");
    }

    private void e() {
        h.j(this.f3651a.get(), "AudioStream has not been started.");
    }

    private static long f() {
        return System.nanoTime();
    }

    private void g() {
        final AudioStream.a aVar = this.f3657g;
        Executor executor = this.f3658h;
        if (aVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: c1.v
            @Override // java.lang.Runnable
            public final void run() {
                aVar.a(true);
            }
        });
    }

    private void h(@NonNull ByteBuffer byteBuffer, int i11) {
        h.i(i11 <= byteBuffer.remaining());
        byte[] bArr = this.f3655e;
        if (bArr == null || bArr.length < i11) {
            this.f3655e = new byte[i11];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.f3655e, 0, i11).limit(i11 + iPosition).position(iPosition);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void a(AudioStream.a aVar, Executor executor) {
        boolean z11 = true;
        h.j(!this.f3651a.get(), "AudioStream can not be started when setCallback.");
        d();
        if (aVar != null && executor == null) {
            z11 = false;
        }
        h.b(z11, "executor can't be null with non-null callback.");
        this.f3657g = aVar;
        this.f3658h = executor;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    public AudioStream.b read(@NonNull ByteBuffer byteBuffer) {
        d();
        e();
        long jG = n.g(byteBuffer.remaining(), this.f3653c);
        int iE = (int) n.e(jG, this.f3653c);
        if (iE <= 0) {
            return AudioStream.b.c(0, this.f3656f);
        }
        long jD = this.f3656f + n.d(jG, this.f3654d);
        c(jD);
        h(byteBuffer, iE);
        AudioStream.b bVarC = AudioStream.b.c(iE, this.f3656f);
        this.f3656f = jD;
        return bVarC;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        this.f3652b.getAndSet(true);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() {
        d();
        if (this.f3651a.getAndSet(true)) {
            return;
        }
        this.f3656f = f();
        g();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() {
        d();
        this.f3651a.set(false);
    }
}
