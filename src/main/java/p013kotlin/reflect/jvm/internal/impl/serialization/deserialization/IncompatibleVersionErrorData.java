package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes9.dex */
public final class IncompatibleVersionErrorData<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f88634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f88635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T f88636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final T f88637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f88638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ClassId f88639f;

    public IncompatibleVersionErrorData(T t11, T t12, T t13, T t14, String filePath, ClassId classId) {
        s.k(filePath, "filePath");
        s.k(classId, "classId");
        this.f88634a = t11;
        this.f88635b = t12;
        this.f88636c = t13;
        this.f88637d = t14;
        this.f88638e = filePath;
        this.f88639f = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return s.f(this.f88634a, incompatibleVersionErrorData.f88634a) && s.f(this.f88635b, incompatibleVersionErrorData.f88635b) && s.f(this.f88636c, incompatibleVersionErrorData.f88636c) && s.f(this.f88637d, incompatibleVersionErrorData.f88637d) && s.f(this.f88638e, incompatibleVersionErrorData.f88638e) && s.f(this.f88639f, incompatibleVersionErrorData.f88639f);
    }

    public int hashCode() {
        T t11 = this.f88634a;
        int iHashCode = (t11 == null ? 0 : t11.hashCode()) * 31;
        T t12 = this.f88635b;
        int iHashCode2 = (iHashCode + (t12 == null ? 0 : t12.hashCode())) * 31;
        T t13 = this.f88636c;
        int iHashCode3 = (iHashCode2 + (t13 == null ? 0 : t13.hashCode())) * 31;
        T t14 = this.f88637d;
        return ((((iHashCode3 + (t14 != null ? t14.hashCode() : 0)) * 31) + this.f88638e.hashCode()) * 31) + this.f88639f.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f88634a + ", compilerVersion=" + this.f88635b + ", languageVersion=" + this.f88636c + ", expectedVersion=" + this.f88637d + ", filePath=" + this.f88638e + ", classId=" + this.f88639f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
