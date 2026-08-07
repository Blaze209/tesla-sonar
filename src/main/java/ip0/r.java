package ip0;

import java.util.GregorianCalendar;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\r\u001a\u00020\u00008\u0000X\u0080D¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u001a\u0010\u0012\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011*\f\b\u0000\u0010\u0014\"\u00020\u00132\u00020\u0013¨\u0006\u0015"}, d2 = {"", "year", "month", "day", "hour", "minute", "second", "", "a", "(IIIIII)J", "I", "b", "()I", "DEFAULT_COMPRESSION", "", "[B", "c", "()[B", "EMPTY_BYTE_ARRAY", "Ljava/util/zip/CRC32;", "CRC32", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f81755a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f81756b = new byte[0];

    public static final long a(int i11, int i12, int i13, int i14, int i15, int i16) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i11, i12 - 1, i13, i14, i15, i16);
        return gregorianCalendar.getTime().getTime();
    }

    public static final int b() {
        return f81755a;
    }

    public static final byte[] c() {
        return f81756b;
    }
}
