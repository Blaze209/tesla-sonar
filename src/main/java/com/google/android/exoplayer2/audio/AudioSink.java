package com.google.android.exoplayer2.audio;

import android.media.AudioDeviceInfo;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.u1;
import cr.q1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface AudioSink {

    public static final class InitializationException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f39423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u0 f39424c;

        public InitializationException(int i11, int i12, int i13, int i14, u0 u0Var, boolean z11, Exception exc) {
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
            sb2.append(")");
            sb2.append(" ");
            sb2.append(u0Var);
            sb2.append(z11 ? " (recoverable)" : "");
            super(sb2.toString(), exc);
            this.f39422a = i11;
            this.f39423b = z11;
            this.f39424c = u0Var;
        }
    }

    public static final class UnexpectedDiscontinuityException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f39425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f39426b;

        public UnexpectedDiscontinuityException(long j11, long j12) {
            super("Unexpected audio track timestamp discontinuity: expected " + j12 + ", got " + j11);
            this.f39425a = j11;
            this.f39426b = j12;
        }
    }

    public static final class WriteException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f39428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u0 f39429c;

        public WriteException(int i11, u0 u0Var, boolean z11) {
            super("AudioTrack write failed: " + i11);
            this.f39428b = z11;
            this.f39427a = i11;
            this.f39429c = u0Var;
        }
    }

    public interface a {
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

        void onSkipSilenceEnabledChanged(boolean z11);
    }

    boolean a();

    boolean b(u0 u0Var);

    void c(com.google.android.exoplayer2.audio.a aVar);

    void d();

    u1 e();

    void f();

    void flush();

    void h();

    void i(a aVar);

    void j(u1 u1Var);

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

    int v(u0 u0Var);

    void w(dr.p pVar);

    void x(u0 u0Var, int i11, int[] iArr);

    public static final class ConfigurationException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u0 f39421a;

        public ConfigurationException(Throwable th2, u0 u0Var) {
            super(th2);
            this.f39421a = u0Var;
        }

        public ConfigurationException(String str, u0 u0Var) {
            super(str);
            this.f39421a = u0Var;
        }
    }

    default void g(q1 q1Var) {
    }
}
