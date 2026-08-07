package d00;

import com.paramsen.noise.NoiseNativeBridge;
import java.io.Closeable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ld00/a;", "Ljava/io/Closeable;", "", "configPointer", "", "isReal", "<init>", "(JZ)V", "", "src", "dst", "c", "([F[F)[F", "Ljn0/h0;", "close", "()V", "a", "J", "b", "Z", "noise_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long configPointer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isReal;

    /* JADX INFO: renamed from: d00.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld00/a$a;", "", "<init>", "()V", "", "inputLength", "Ld00/a;", "a", "(I)Ld00/a;", "noise_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(int inputLength) {
            return new a(NoiseNativeBridge.f46179a.realConfig(inputLength), true, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ a(long j11, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, z11);
    }

    public final float[] c(float[] src, float[] dst) {
        s.k(src, "src");
        s.k(dst, "dst");
        if (this.isReal) {
            if (dst.length != src.length + 2) {
                throw new IllegalArgumentException("Cannot compute FFT, dst length must equal src length + 2");
            }
            NoiseNativeBridge.f46179a.real(src, dst, this.configPointer);
            return dst;
        }
        if (src.length != dst.length) {
            throw new IllegalArgumentException("Cannot compute FFT, dst length must equal src length");
        }
        NoiseNativeBridge.f46179a.imaginary(src, dst, this.configPointer);
        return dst;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.isReal) {
            NoiseNativeBridge.f46179a.realConfigDispose(this.configPointer);
        } else {
            NoiseNativeBridge.f46179a.imaginaryConfigDispose(this.configPointer);
        }
    }

    private a(long j11, boolean z11) {
        this.configPointer = j11;
        this.isReal = z11;
    }
}
