package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface AudioProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f39415a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public UnhandledAudioFormatException(String str, a aVar) {
            super(str + " " + aVar);
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f39416e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f39419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f39420d;

        public a(int i11, int i12, int i13) {
            this.f39417a = i11;
            this.f39418b = i12;
            this.f39419c = i13;
            this.f39420d = p0.w0(i13) ? p0.c0(i13, i12) : -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f39417a == aVar.f39417a && this.f39418b == aVar.f39418b && this.f39419c == aVar.f39419c;
        }

        public int hashCode() {
            return ou.l.b(Integer.valueOf(this.f39417a), Integer.valueOf(this.f39418b), Integer.valueOf(this.f39419c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f39417a + ", channelCount=" + this.f39418b + ", encoding=" + this.f39419c + ']';
        }
    }

    boolean a();

    void b(ByteBuffer byteBuffer);

    void c();

    ByteBuffer d();

    a e(a aVar);

    void flush();

    boolean isActive();

    void reset();
}
