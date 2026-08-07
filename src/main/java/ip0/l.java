package ip0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.List;
import okio.i0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0010!\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b%\u0010(R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b)\u0010.R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010.R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b2\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=R\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b!\u0010ER\u0016\u0010G\u001a\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u00105R\u0016\u0010H\u001a\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u00105R\u0016\u0010I\u001a\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u00105¨\u0006J"}, d2 = {"Lip0/l;", "", "Lokio/i0;", "canonicalPath", "", "isDirectory", "", "comment", "", "crc", "compressedSize", "size", "", "compressionMethod", "offset", "dosLastModifiedAtDate", "dosLastModifiedAtTime", "ntfsLastModifiedAtFiletime", "ntfsLastAccessedAtFiletime", "ntfsCreatedAtFiletime", "extendedLastModifiedAtSeconds", "extendedLastAccessedAtSeconds", "extendedCreatedAtSeconds", "<init>", "(Lokio/i0;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lip0/l;", "Lokio/i0;", "b", "()Lokio/i0;", "Z", "k", "()Z", "c", "Ljava/lang/String;", "getComment", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "J", "getCrc", "()J", "e", "f", "j", "g", "I", "()I", "h", IntegerTokenConverter.CONVERTER_KEY, "getDosLastModifiedAtDate", "getDosLastModifiedAtTime", "Ljava/lang/Long;", "getNtfsLastModifiedAtFiletime", "()Ljava/lang/Long;", "l", "getNtfsLastAccessedAtFiletime", "m", "getNtfsCreatedAtFiletime", "n", "Ljava/lang/Integer;", "getExtendedLastModifiedAtSeconds", "()Ljava/lang/Integer;", "o", "getExtendedLastAccessedAtSeconds", "p", "getExtendedCreatedAtSeconds", "", "q", "Ljava/util/List;", "()Ljava/util/List;", "children", "lastAccessedAtMillis", "lastModifiedAtMillis", "createdAtMillis", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i0 canonicalPath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isDirectory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String comment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long crc;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long compressedSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int compressionMethod;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long offset;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int dosLastModifiedAtDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int dosLastModifiedAtTime;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Long ntfsLastModifiedAtFiletime;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Long ntfsLastAccessedAtFiletime;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Long ntfsCreatedAtFiletime;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Integer extendedLastModifiedAtSeconds;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Integer extendedLastAccessedAtSeconds;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Integer extendedCreatedAtSeconds;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final List<i0> children;

    public l(i0 canonicalPath, boolean z11, String comment, long j11, long j12, long j13, int i11, long j14, int i12, int i13, Long l11, Long l12, Long l13, Integer num, Integer num2, Integer num3) {
        s.k(canonicalPath, "canonicalPath");
        s.k(comment, "comment");
        this.canonicalPath = canonicalPath;
        this.isDirectory = z11;
        this.comment = comment;
        this.crc = j11;
        this.compressedSize = j12;
        this.size = j13;
        this.compressionMethod = i11;
        this.offset = j14;
        this.dosLastModifiedAtDate = i12;
        this.dosLastModifiedAtTime = i13;
        this.ntfsLastModifiedAtFiletime = l11;
        this.ntfsLastAccessedAtFiletime = l12;
        this.ntfsCreatedAtFiletime = l13;
        this.extendedLastModifiedAtSeconds = num;
        this.extendedLastAccessedAtSeconds = num2;
        this.extendedCreatedAtSeconds = num3;
        this.children = new ArrayList();
    }

    public final l a(Integer extendedLastModifiedAtSeconds, Integer extendedLastAccessedAtSeconds, Integer extendedCreatedAtSeconds) {
        return new l(this.canonicalPath, this.isDirectory, this.comment, this.crc, this.compressedSize, this.size, this.compressionMethod, this.offset, this.dosLastModifiedAtDate, this.dosLastModifiedAtTime, this.ntfsLastModifiedAtFiletime, this.ntfsLastAccessedAtFiletime, this.ntfsCreatedAtFiletime, extendedLastModifiedAtSeconds, extendedLastAccessedAtSeconds, extendedCreatedAtSeconds);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final i0 getCanonicalPath() {
        return this.canonicalPath;
    }

    public final List<i0> c() {
        return this.children;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getCompressedSize() {
        return this.compressedSize;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getCompressionMethod() {
        return this.compressionMethod;
    }

    public final Long f() {
        Long l11 = this.ntfsCreatedAtFiletime;
        if (l11 != null) {
            return Long.valueOf(q.g(l11.longValue()));
        }
        Integer num = this.extendedCreatedAtSeconds;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long g() {
        Long l11 = this.ntfsLastAccessedAtFiletime;
        if (l11 != null) {
            return Long.valueOf(q.g(l11.longValue()));
        }
        Integer num = this.extendedLastAccessedAtSeconds;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long h() {
        Long l11 = this.ntfsLastModifiedAtFiletime;
        if (l11 != null) {
            return Long.valueOf(q.g(l11.longValue()));
        }
        Integer num = this.extendedLastModifiedAtSeconds;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        int i11 = this.dosLastModifiedAtTime;
        if (i11 != -1) {
            return q.f(this.dosLastModifiedAtDate, i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsDirectory() {
        return this.isDirectory;
    }

    public /* synthetic */ l(i0 i0Var, boolean z11, String str, long j11, long j12, long j13, int i11, long j14, int i12, int i13, Long l11, Long l12, Long l13, Integer num, Integer num2, Integer num3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, (i14 & 2) != 0 ? false : z11, (i14 & 4) != 0 ? "" : str, (i14 & 8) != 0 ? -1L : j11, (i14 & 16) != 0 ? -1L : j12, (i14 & 32) != 0 ? -1L : j13, (i14 & 64) != 0 ? -1 : i11, (i14 & 128) == 0 ? j14 : -1L, (i14 & 256) != 0 ? -1 : i12, (i14 & 512) == 0 ? i13 : -1, (i14 & 1024) != 0 ? null : l11, (i14 & 2048) != 0 ? null : l12, (i14 & 4096) != 0 ? null : l13, (i14 & PKIFailureInfo.certRevoked) != 0 ? null : num, (i14 & 16384) != 0 ? null : num2, (i14 & 32768) != 0 ? null : num3);
    }
}
