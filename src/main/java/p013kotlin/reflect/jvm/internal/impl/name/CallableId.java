package p013kotlin.reflect.jvm.internal.impl.name;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public final class CallableId {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Name f88163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final FqName f88164g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FqName f88165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FqName f88166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Name f88167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ClassId f88168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FqName f88169e;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Name name = SpecialNames.LOCAL;
        f88163f = name;
        FqName fqName = FqName.topLevel(name);
        s.j(fqName, "topLevel(...)");
        f88164g = fqName;
    }

    private CallableId(FqName fqName, FqName fqName2, Name name, ClassId classId, FqName fqName3) {
        this.f88165a = fqName;
        this.f88166b = fqName2;
        this.f88167c = name;
        this.f88168d = classId;
        this.f88169e = fqName3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallableId)) {
            return false;
        }
        CallableId callableId = (CallableId) obj;
        return s.f(this.f88165a, callableId.f88165a) && s.f(this.f88166b, callableId.f88166b) && s.f(this.f88167c, callableId.f88167c);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f88165a.hashCode()) * 31;
        FqName fqName = this.f88166b;
        return ((iHashCode + (fqName != null ? fqName.hashCode() : 0)) * 31) + this.f88167c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String strAsString = this.f88165a.asString();
        s.j(strAsString, "asString(...)");
        sb2.append(t.U(strAsString, CoreConstants.DOT, '/', false, 4, null));
        sb2.append("/");
        FqName fqName = this.f88166b;
        if (fqName != null) {
            sb2.append(fqName);
            sb2.append(".");
        }
        sb2.append(this.f88167c);
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallableId(FqName packageName, Name callableName) {
        this(packageName, null, callableName, null, null);
        s.k(packageName, "packageName");
        s.k(callableName, "callableName");
    }
}
