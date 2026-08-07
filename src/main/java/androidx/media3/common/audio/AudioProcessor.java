package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import p7.u;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f9024a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f9025a;

        public UnhandledAudioFormatException(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public UnhandledAudioFormatException(String str, a aVar) {
            super(str + " " + aVar);
            this.f9025a = aVar;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f9026e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f9030d;

        public a(u uVar) {
            this(uVar.H, uVar.G, uVar.I);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9027a == aVar.f9027a && this.f9028b == aVar.f9028b && this.f9029c == aVar.f9029c;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f9027a), Integer.valueOf(this.f9028b), Integer.valueOf(this.f9029c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f9027a + ", channelCount=" + this.f9028b + ", encoding=" + this.f9029c + ']';
        }

        public a(int i11, int i12, int i13) {
            this.f9027a = i11;
            this.f9028b = i12;
            this.f9029c = i13;
            this.f9030d = q0.R0(i13) ? q0.t0(i13, i12) : -1;
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
