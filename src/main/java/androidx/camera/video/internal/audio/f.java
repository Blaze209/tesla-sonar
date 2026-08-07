package androidx.camera.video.internal.audio;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import c0.y0;
import c1.n;
import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import u5.h;

/* JADX INFO: loaded from: classes.dex */
public class f implements AudioStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AudioStream f3641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f3642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f3643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f3644j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f3646l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f3635a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f3636b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue<a> f3637c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f3638d = i0.c.g(i0.c.a());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f3639e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f3640f = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f3645k = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ByteBuffer f3649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f3650d;

        a(@NonNull ByteBuffer byteBuffer, @NonNull AudioStream.b bVar, int i11, int i12) {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit() - byteBuffer.position();
            if (iLimit == bVar.a()) {
                this.f3647a = i11;
                this.f3648b = i12;
                this.f3649c = byteBuffer;
                this.f3650d = bVar.b();
                return;
            }
            throw new IllegalStateException("Byte buffer size is not match with packet info: " + iLimit + " != " + bVar.a());
        }

        public int a() {
            return this.f3649c.remaining();
        }

        public AudioStream.b b(@NonNull ByteBuffer byteBuffer) {
            int iRemaining;
            long j11 = this.f3650d;
            int iPosition = this.f3649c.position();
            int iPosition2 = byteBuffer.position();
            if (this.f3649c.remaining() > byteBuffer.remaining()) {
                iRemaining = byteBuffer.remaining();
                this.f3650d += n.d(n.g(iRemaining, this.f3647a), this.f3648b);
                ByteBuffer byteBufferDuplicate = this.f3649c.duplicate();
                byteBufferDuplicate.position(iPosition).limit(iPosition + iRemaining);
                byteBuffer.put(byteBufferDuplicate).limit(iPosition2 + iRemaining).position(iPosition2);
            } else {
                iRemaining = this.f3649c.remaining();
                byteBuffer.put(this.f3649c).limit(iPosition2 + iRemaining).position(iPosition2);
            }
            this.f3649c.position(iPosition + iRemaining);
            return AudioStream.b.c(iRemaining, j11);
        }
    }

    public f(@NonNull AudioStream audioStream, @NonNull c1.a aVar) {
        this.f3641g = audioStream;
        int iD = aVar.d();
        this.f3642h = iD;
        int iF = aVar.f();
        this.f3643i = iF;
        h.b(((long) iD) > 0, "mBytesPerFrame must be greater than 0.");
        h.b(((long) iF) > 0, "mSampleRate must be greater than 0.");
        this.f3644j = 500;
        this.f3646l = iD * 1024;
    }

    public static /* synthetic */ void b(f fVar) {
        fVar.f3645k.set(false);
        fVar.f3641g.stop();
        synchronized (fVar.f3639e) {
            fVar.f3640f = null;
            fVar.f3637c.clear();
        }
    }

    public static /* synthetic */ void c(f fVar) {
        fVar.getClass();
        try {
            fVar.f3641g.start();
            fVar.k();
        } catch (AudioStream.AudioStreamException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static /* synthetic */ void d(f fVar) {
        fVar.f3645k.set(false);
        fVar.f3641g.release();
        synchronized (fVar.f3639e) {
            fVar.f3640f = null;
            fVar.f3637c.clear();
        }
    }

    private void h() {
        h.j(!this.f3636b.get(), "AudioStream has been released.");
    }

    private void i() {
        h.j(this.f3635a.get(), "AudioStream has not been started.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f3645k.get()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f3646l);
            a aVar = new a(byteBufferAllocateDirect, this.f3641g.read(byteBufferAllocateDirect), this.f3642h, this.f3643i);
            int i11 = this.f3644j;
            synchronized (this.f3639e) {
                try {
                    this.f3637c.offer(aVar);
                    while (this.f3637c.size() > i11) {
                        this.f3637c.poll();
                        y0.l("BufferedAudioStream", "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f3645k.get()) {
                this.f3638d.execute(new Runnable() { // from class: c1.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18555a.j();
                    }
                });
            }
        }
    }

    private void k() {
        if (this.f3645k.getAndSet(true)) {
            return;
        }
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i11) {
        int i12 = this.f3646l;
        if (i12 == i11) {
            return;
        }
        int i13 = this.f3642h;
        this.f3646l = (i11 / i13) * i13;
        y0.a("BufferedAudioStream", "Update buffer size from " + i12 + " to " + this.f3646l);
    }

    private void m(final int i11) {
        this.f3638d.execute(new Runnable() { // from class: c1.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f18553a.l(i11);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void a(final AudioStream.a aVar, final Executor executor) {
        boolean z11 = true;
        h.j(!this.f3635a.get(), "AudioStream can not be started when setCallback.");
        h();
        if (aVar != null && executor == null) {
            z11 = false;
        }
        h.b(z11, "executor can't be null with non-null callback.");
        this.f3638d.execute(new Runnable() { // from class: c1.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f18549a.f3641g.a(aVar, executor);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    @SuppressLint({"BanThreadSleep"})
    public AudioStream.b read(@NonNull ByteBuffer byteBuffer) {
        boolean z11;
        h();
        i();
        m(byteBuffer.remaining());
        AudioStream.b bVarC = AudioStream.b.c(0, 0L);
        do {
            synchronized (this.f3639e) {
                try {
                    a aVarPoll = this.f3640f;
                    this.f3640f = null;
                    if (aVarPoll == null) {
                        aVarPoll = this.f3637c.poll();
                    }
                    if (aVarPoll != null) {
                        bVarC = aVarPoll.b(byteBuffer);
                        if (aVarPoll.a() > 0) {
                            this.f3640f = aVarPoll;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            z11 = bVarC.a() <= 0 && this.f3635a.get() && !this.f3636b.get();
            if (z11) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e11) {
                    y0.m("BufferedAudioStream", "Interruption while waiting for audio data", e11);
                    return bVarC;
                }
            }
        } while (z11);
        return bVarC;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        if (this.f3636b.getAndSet(true)) {
            return;
        }
        this.f3638d.execute(new Runnable() { // from class: c1.u
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.f.d(this.f18556a);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws AudioStream.AudioStreamException {
        h();
        if (this.f3635a.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: c1.r
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.f.c(this.f18552a);
            }
        }, null);
        this.f3638d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e11) {
            this.f3635a.set(false);
            throw new AudioStream.AudioStreamException(e11);
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() {
        h();
        if (this.f3635a.getAndSet(false)) {
            this.f3638d.execute(new Runnable() { // from class: c1.p
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.video.internal.audio.f.b(this.f18548a);
                }
            });
        }
    }
}
