package okio;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010Jw\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b!\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010 R'\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lokio/n;", "", "", "isRegularFile", "isDirectory", "Lokio/i0;", "symlinkTarget", "", "size", "createdAtMillis", "lastModifiedAtMillis", "lastAccessedAtMillis", "", "Lco0/d;", "extras", "<init>", "(ZZLokio/i0;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V", "a", "(ZZLokio/i0;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)Lokio/n;", "", "toString", "()Ljava/lang/String;", "Z", "()Z", "b", "f", "c", "Lokio/i0;", "e", "()Lokio/i0;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", "()Ljava/lang/Long;", "getCreatedAtMillis", "g", "getLastAccessedAtMillis", "h", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isRegularFile;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isDirectory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i0 symlinkTarget;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Long size;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Long createdAtMillis;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Long lastModifiedAtMillis;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Long lastAccessedAtMillis;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map<co0.d<?>, Object> extras;

    public n(boolean z11, boolean z12, i0 i0Var, Long l11, Long l12, Long l13, Long l14, Map<co0.d<?>, ? extends Object> extras) {
        p013kotlin.jvm.internal.s.k(extras, "extras");
        this.isRegularFile = z11;
        this.isDirectory = z12;
        this.symlinkTarget = i0Var;
        this.size = l11;
        this.createdAtMillis = l12;
        this.lastModifiedAtMillis = l13;
        this.lastAccessedAtMillis = l14;
        this.extras = p013kotlin.collections.v0.A(extras);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n b(n nVar, boolean z11, boolean z12, i0 i0Var, Long l11, Long l12, Long l13, Long l14, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = nVar.isRegularFile;
        }
        if ((i11 & 2) != 0) {
            z12 = nVar.isDirectory;
        }
        if ((i11 & 4) != 0) {
            i0Var = nVar.symlinkTarget;
        }
        if ((i11 & 8) != 0) {
            l11 = nVar.size;
        }
        if ((i11 & 16) != 0) {
            l12 = nVar.createdAtMillis;
        }
        if ((i11 & 32) != 0) {
            l13 = nVar.lastModifiedAtMillis;
        }
        if ((i11 & 64) != 0) {
            l14 = nVar.lastAccessedAtMillis;
        }
        if ((i11 & 128) != 0) {
            map = nVar.extras;
        }
        Long l15 = l14;
        Map map2 = map;
        Long l16 = l12;
        Long l17 = l13;
        return nVar.a(z11, z12, i0Var, l11, l16, l17, l15, map2);
    }

    public final n a(boolean isRegularFile, boolean isDirectory, i0 symlinkTarget, Long size, Long createdAtMillis, Long lastModifiedAtMillis, Long lastAccessedAtMillis, Map<co0.d<?>, ? extends Object> extras) {
        p013kotlin.jvm.internal.s.k(extras, "extras");
        return new n(isRegularFile, isDirectory, symlinkTarget, size, createdAtMillis, lastModifiedAtMillis, lastAccessedAtMillis, extras);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final i0 getSymlinkTarget() {
        return this.symlinkTarget;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsDirectory() {
        return this.isDirectory;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.isRegularFile) {
            arrayList.add("isRegularFile");
        }
        if (this.isDirectory) {
            arrayList.add("isDirectory");
        }
        if (this.size != null) {
            arrayList.add("byteCount=" + this.size);
        }
        if (this.createdAtMillis != null) {
            arrayList.add("createdAt=" + this.createdAtMillis);
        }
        if (this.lastModifiedAtMillis != null) {
            arrayList.add("lastModifiedAt=" + this.lastModifiedAtMillis);
        }
        if (this.lastAccessedAtMillis != null) {
            arrayList.add("lastAccessedAt=" + this.lastAccessedAtMillis);
        }
        if (!this.extras.isEmpty()) {
            arrayList.add("extras=" + this.extras);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ n(boolean z11, boolean z12, i0 i0Var, Long l11, Long l12, Long l13, Long l14, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? null : i0Var, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? null : l12, (i11 & 32) != 0 ? null : l13, (i11 & 64) != 0 ? null : l14, (i11 & 128) != 0 ? p013kotlin.collections.v0.i() : map);
    }
}
