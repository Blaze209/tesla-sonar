package androidx.camera.video.internal.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import c0.y0;
import c1.n;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import u5.h;

/* JADX INFO: loaded from: classes.dex */
public class d implements AudioStream {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f3619m = TimeUnit.MILLISECONDS.toNanos(500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private AudioRecord f3620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c1.a f3621b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f3626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioStream.a f3627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Executor f3628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f3629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AudioManager.AudioRecordingCallback f3630k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f3622c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f3623d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference<Boolean> f3624e = new AtomicReference<>(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f3631l = false;

    class a extends AudioManager.AudioRecordingCallback {
        a() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
                if (d1.b.a(audioRecordingConfiguration) == d.this.f3620a.getAudioSessionId()) {
                    d.this.l(d1.d.b(audioRecordingConfiguration));
                    return;
                }
            }
        }
    }

    public d(@NonNull c1.a aVar, Context context) throws AudioStream.AudioStreamException {
        if (!k(aVar.f(), aVar.e(), aVar.b())) {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(aVar.f()), Integer.valueOf(aVar.e()), Integer.valueOf(aVar.b())));
        }
        this.f3621b = aVar;
        this.f3626g = aVar.d();
        int i11 = i(aVar.f(), aVar.e(), aVar.b());
        h.i(i11 > 0);
        int i12 = i11 * 2;
        this.f3625f = i12;
        AudioRecord audioRecordG = g(i12, aVar, context);
        this.f3620a = audioRecordG;
        d(audioRecordG);
    }

    private static void d(@NonNull AudioRecord audioRecord) throws AudioStream.AudioStreamException {
        if (audioRecord.getState() == 1) {
            return;
        }
        audioRecord.release();
        throw new AudioStream.AudioStreamException("Unable to initialize AudioRecord");
    }

    private void e() {
        h.j(!this.f3622c.get(), "AudioStream has been released.");
    }

    private void f() {
        h.j(this.f3623d.get(), "AudioStream has not been started.");
    }

    @NonNull
    private static AudioRecord g(int i11, @NonNull c1.a aVar, Context context) {
        int i12 = Build.VERSION.SDK_INT;
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(aVar.f()).setChannelMask(n.b(aVar.e())).setEncoding(aVar.b()).build();
        AudioRecord.Builder builderB = d1.a.b();
        if (i12 >= 31 && context != null) {
            d1.e.a(builderB, context);
        }
        d1.a.d(builderB, aVar.c());
        d1.a.c(builderB, audioFormatBuild);
        d1.a.e(builderB, i11);
        return d1.a.a(builderB);
    }

    private long h() {
        long jC;
        if (this.f3631l) {
            jC = -1;
        } else {
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            if (d1.b.b(this.f3620a, audioTimestamp, 0) == 0) {
                jC = n.c(this.f3621b.f(), this.f3629j, audioTimestamp);
                if (Math.abs(jC - System.nanoTime()) > f3619m) {
                    this.f3631l = true;
                }
            } else {
                y0.l("AudioStreamImpl", "Unable to get audio timestamp");
            }
            jC = -1;
        }
        return jC == -1 ? System.nanoTime() : jC;
    }

    private static int i(int i11, int i12, int i13) {
        return AudioRecord.getMinBufferSize(i11, n.a(i12), i13);
    }

    private static boolean j() {
        return androidx.camera.video.internal.compat.quirk.a.b(AudioTimestampFramePositionIncorrectQuirk.class) != null;
    }

    public static boolean k(int i11, int i12, int i13) {
        return i11 > 0 && i12 > 0 && i(i11, i12, i13) > 0;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void a(AudioStream.a aVar, Executor executor) {
        boolean z11 = true;
        h.j(!this.f3623d.get(), "AudioStream can not be started when setCallback.");
        e();
        if (aVar != null && executor == null) {
            z11 = false;
        }
        h.b(z11, "executor can't be null with non-null callback.");
        this.f3627h = aVar;
        this.f3628i = executor;
        if (Build.VERSION.SDK_INT >= 29) {
            AudioManager.AudioRecordingCallback audioRecordingCallback = this.f3630k;
            if (audioRecordingCallback != null) {
                d1.d.d(this.f3620a, audioRecordingCallback);
            }
            if (aVar == null) {
                return;
            }
            if (this.f3630k == null) {
                this.f3630k = new a();
            }
            d1.d.c(this.f3620a, executor, this.f3630k);
        }
    }

    void l(final boolean z11) {
        Executor executor = this.f3628i;
        final AudioStream.a aVar = this.f3627h;
        if (executor == null || aVar == null || Objects.equals(this.f3624e.getAndSet(Boolean.valueOf(z11)), Boolean.valueOf(z11))) {
            return;
        }
        executor.execute(new Runnable() { // from class: c1.m
            @Override // java.lang.Runnable
            public final void run() {
                aVar.a(z11);
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    public AudioStream.b read(@NonNull ByteBuffer byteBuffer) {
        long jH;
        e();
        f();
        int i11 = this.f3620a.read(byteBuffer, this.f3625f);
        if (i11 > 0) {
            byteBuffer.limit(i11);
            jH = h();
            this.f3629j += n.g(i11, this.f3626g);
        } else {
            jH = 0;
        }
        return AudioStream.b.c(i11, jH);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        AudioManager.AudioRecordingCallback audioRecordingCallback;
        if (this.f3622c.getAndSet(true)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (audioRecordingCallback = this.f3630k) != null) {
            d1.d.d(this.f3620a, audioRecordingCallback);
        }
        this.f3620a.release();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws AudioStream.AudioStreamException {
        e();
        if (this.f3623d.getAndSet(true)) {
            return;
        }
        if (j()) {
            d(this.f3620a);
        }
        this.f3620a.startRecording();
        boolean z11 = false;
        if (this.f3620a.getRecordingState() != 3) {
            this.f3623d.set(false);
            throw new AudioStream.AudioStreamException("Unable to start AudioRecord with state: " + this.f3620a.getRecordingState());
        }
        this.f3629j = 0L;
        this.f3631l = false;
        this.f3624e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration audioRecordingConfigurationA = d1.d.a(this.f3620a);
            z11 = audioRecordingConfigurationA != null && d1.d.b(audioRecordingConfigurationA);
        }
        l(z11);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @SuppressLint({"MissingPermission"})
    public void stop() {
        e();
        if (this.f3623d.getAndSet(false)) {
            this.f3620a.stop();
            if (this.f3620a.getRecordingState() != 1) {
                y0.l("AudioStreamImpl", "Failed to stop AudioRecord with state: " + this.f3620a.getRecordingState());
            }
            if (j()) {
                this.f3620a.release();
                this.f3620a = g(this.f3625f, this.f3621b, null);
            }
        }
    }
}
