package u6;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.io.IOException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lu6/e0;", "", "", "mappedAddress", "<init>", "(J)V", "", "b", "()I", "c", "a", "J", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final NativeSharedCounter f115447c = new NativeSharedCounter();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long mappedAddress;

    /* JADX INFO: renamed from: u6.e0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\u001d\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lu6/e0$a;", "", "<init>", "()V", "Landroid/os/ParcelFileDescriptor;", "pfd", "Lu6/e0;", "b", "(Landroid/os/ParcelFileDescriptor;)Lu6/e0;", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "a", "(Lwn0/a;)Lu6/e0;", "Landroidx/datastore/core/NativeSharedCounter;", "nativeSharedCounter", "Landroidx/datastore/core/NativeSharedCounter;", "c", "()Landroidx/datastore/core/NativeSharedCounter;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final e0 b(ParcelFileDescriptor pfd) throws IOException {
            int fd2 = pfd.getFd();
            if (c().nativeTruncateFile(fd2) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long jNativeCreateSharedCounter = c().nativeCreateSharedCounter(fd2);
            if (jNativeCreateSharedCounter >= 0) {
                return new e0(jNativeCreateSharedCounter, null);
            }
            throw new IOException("Failed to mmap counter file");
        }

        public final e0 a(wn0.a<? extends File> produceFile) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            p013kotlin.jvm.internal.s.k(produceFile, "produceFile");
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open(produceFile.invoke(), 939524096);
                try {
                    e0 e0VarB = b(parcelFileDescriptorOpen);
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    return e0VarB;
                } catch (Throwable th2) {
                    th = th2;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                parcelFileDescriptorOpen = null;
            }
        }

        public final NativeSharedCounter c() {
            return e0.f115447c;
        }

        public final void d() {
            System.loadLibrary("datastore_shared_counter");
        }

        private Companion() {
        }
    }

    public /* synthetic */ e0(long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11);
    }

    public final int b() {
        return f115447c.nativeGetCounterValue(this.mappedAddress);
    }

    public final int c() {
        return f115447c.nativeIncrementAndGetCounterValue(this.mappedAddress);
    }

    private e0(long j11) {
        this.mappedAddress = j11;
    }
}
