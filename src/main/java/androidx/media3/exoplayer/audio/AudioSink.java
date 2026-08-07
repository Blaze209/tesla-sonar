package androidx.media3.exoplayer.audio;

import a8.o2;
import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import p7.i0;
import p7.u;

/* JADX INFO: loaded from: classes.dex */
public interface AudioSink {

    public static final class UnexpectedDiscontinuityException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9343b;

        public UnexpectedDiscontinuityException(long j11, long j12) {
            super("Unexpected audio track timestamp discontinuity: expected " + j12 + ", got " + j11);
            this.f9342a = j11;
            this.f9343b = j12;
        }
    }

    public static final class WriteException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u f9346c;

        public WriteException(int i11, u uVar, boolean z11) {
            super("AudioTrack write failed: " + i11);
            this.f9345b = z11;
            this.f9344a = i11;
            this.f9346c = uVar;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f9350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f9351e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f9352f;

        public a(int i11, int i12, int i13, boolean z11, boolean z12, int i14) {
            this.f9347a = i11;
            this.f9348b = i12;
            this.f9349c = i13;
            this.f9350d = z11;
            this.f9351e = z12;
            this.f9352f = i14;
        }
    }

    public interface b {
        default void a(Exception exc) {
        }

        default void b(long j11) {
        }

        void c(int i11, long j11, long j12);

        default void d() {
        }

        default void e() {
        }

        void f();

        default void g() {
        }

        default void h() {
        }

        default void o(a aVar) {
        }

        default void onAudioSessionIdChanged(int i11) {
        }

        void onSkipSilenceEnabledChanged(boolean z11);

        default void p(a aVar) {
        }
    }

    int B(u uVar);

    void C(p7.e eVar);

    default void D(int i11, int i12) {
    }

    void F(u uVar, int i11, int[] iArr);

    boolean a();

    boolean b(u uVar);

    void d();

    i0 e();

    void f();

    void flush();

    void j(i0 i0Var);

    void k(float f11);

    void l();

    void m();

    boolean n();

    void o(int i11);

    boolean p(ByteBuffer byteBuffer, long j11, int i11);

    void q();

    long r(boolean z11);

    default void release() {
    }

    void reset();

    default void s(long j11) {
    }

    default void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
    }

    void t();

    void u(boolean z11);

    long v();

    void w(b bVar);

    default void x(int i11) {
    }

    default d y(u uVar) {
        return d.f9468d;
    }

    void z(p7.d dVar);

    public static final class ConfigurationException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f9338a;

        public ConfigurationException(Throwable th2, u uVar) {
            super(th2);
            this.f9338a = uVar;
        }

        public ConfigurationException(String str, u uVar) {
            super(str);
            this.f9338a = uVar;
        }
    }

    public static final class InitializationException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u f9341c;

        public InitializationException(String str, int i11, u uVar, boolean z11, Throwable th2) {
            super(str, th2);
            this.f9339a = i11;
            this.f9340b = z11;
            this.f9341c = uVar;
        }

        public InitializationException(int i11, int i12, int i13, int i14, int i15, u uVar, boolean z11, Exception exc) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AudioTrack init failed ");
            sb2.append(i11);
            sb2.append(" ");
            sb2.append("Config(");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(i13);
            sb2.append(", ");
            sb2.append(i14);
            sb2.append(", ");
            sb2.append(i15);
            sb2.append(")");
            sb2.append(" ");
            sb2.append(uVar);
            sb2.append(z11 ? " (recoverable)" : "");
            this(sb2.toString(), i11, uVar, z11, exc);
        }
    }

    default void A(s7.j jVar) {
    }

    default void E(o2 o2Var) {
    }
}
