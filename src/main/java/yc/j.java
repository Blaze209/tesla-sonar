package yc;

import android.os.SystemClock;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lyc/j;", "", "<init>", "()V", "", "a", "()Z", "Lyc/t;", "logger", "b", "(Lyc/t;)Z", "Ljava/io/File;", "Ljava/io/File;", "fileDescriptorList", "", "c", "I", "decodesSinceLastFileDescriptorCheck", "", DateTokenConverter.CONVERTER_KEY, "J", "lastFileDescriptorCheckTimestamp", "e", "Z", "hasAvailableFileDescriptors", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f125349a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final File fileDescriptorList = new File("/proc/self/fd");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static int decodesSinceLastFileDescriptorCheck = 30;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static long lastFileDescriptorCheckTimestamp = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static boolean hasAvailableFileDescriptors = true;

    private j() {
    }

    private final boolean a() {
        int i11 = decodesSinceLastFileDescriptorCheck;
        decodesSinceLastFileDescriptorCheck = i11 + 1;
        return i11 >= 30 || SystemClock.uptimeMillis() > lastFileDescriptorCheckTimestamp + ((long) 30000);
    }

    public final synchronized boolean b(t logger) {
        try {
            if (a()) {
                decodesSinceLastFileDescriptorCheck = 0;
                lastFileDescriptorCheckTimestamp = SystemClock.uptimeMillis();
                String[] list = fileDescriptorList.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                boolean z11 = length < 800;
                hasAvailableFileDescriptors = z11;
                if (!z11 && logger != null) {
                    t.a aVar = t.a.Warn;
                    if (logger.b().compareTo(aVar) <= 0) {
                        logger.a("FileDescriptorCounter", aVar, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return hasAvailableFileDescriptors;
    }
}
