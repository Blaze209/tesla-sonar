package jn0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017¨\u0006\u001f"}, d2 = {"Ljn0/k;", "", "", "major", "minor", "patch", "<init>", "(III)V", "(II)V", "b", "(III)I", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "(Ljn0/k;)I", "I", "getMajor", "getMinor", "c", "getPatch", DateTokenConverter.CONVERTER_KEY, "version", "e", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements Comparable<k> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f84054f = l.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int major;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int patch;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int version;

    public k(int i11, int i12, int i13) {
        this.major = i11;
        this.minor = i12;
        this.patch = i13;
        this.version = b(i11, i12, i13);
    }

    private final int b(int major, int minor, int patch) {
        if (major >= 0 && major < 256 && minor >= 0 && minor < 256 && patch >= 0 && patch < 256) {
            return (major << 16) + (minor << 8) + patch;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + major + CoreConstants.DOT + minor + CoreConstants.DOT + patch).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(k other) {
        p013kotlin.jvm.internal.s.k(other, "other");
        return this.version - other.version;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        k kVar = other instanceof k ? (k) other : null;
        return kVar != null && this.version == kVar.version;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getVersion() {
        return this.version;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append(CoreConstants.DOT);
        sb2.append(this.minor);
        sb2.append(CoreConstants.DOT);
        sb2.append(this.patch);
        return sb2.toString();
    }

    public k(int i11, int i12) {
        this(i11, i12, 0);
    }
}
