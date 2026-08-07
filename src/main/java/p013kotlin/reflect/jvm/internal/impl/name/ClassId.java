package p013kotlin.reflect.jvm.internal.impl.name;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public final class ClassId {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FqName f88170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FqName f88171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f88172c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ClassId fromString$default(Companion companion, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            return companion.fromString(str, z11);
        }

        public final ClassId fromString(String string, boolean z11) {
            String strV;
            String str;
            s.k(string, "string");
            int iU0 = t.u0(string, '`', 0, false, 6, null);
            if (iU0 == -1) {
                iU0 = string.length();
            }
            int iC0 = t.C0(string, "/", iU0, false, 4, null);
            if (iC0 == -1) {
                strV = t.V(string, "`", "", false, 4, null);
                str = "";
            } else {
                String strSubstring = string.substring(0, iC0);
                s.j(strSubstring, "substring(...)");
                String strU = t.U(strSubstring, '/', CoreConstants.DOT, false, 4, null);
                String strSubstring2 = string.substring(iC0 + 1);
                s.j(strSubstring2, "substring(...)");
                strV = t.V(strSubstring2, "`", "", false, 4, null);
                str = strU;
            }
            return new ClassId(new FqName(str), new FqName(strV), z11);
        }

        public final ClassId topLevel(FqName topLevelFqName) {
            s.k(topLevelFqName, "topLevelFqName");
            FqName fqNameParent = topLevelFqName.parent();
            s.j(fqNameParent, "parent(...)");
            Name nameShortName = topLevelFqName.shortName();
            s.j(nameShortName, "shortName(...)");
            return new ClassId(fqNameParent, nameShortName);
        }

        private Companion() {
        }
    }

    public ClassId(FqName packageFqName, FqName relativeClassName, boolean z11) {
        s.k(packageFqName, "packageFqName");
        s.k(relativeClassName, "relativeClassName");
        this.f88170a = packageFqName;
        this.f88171b = relativeClassName;
        this.f88172c = z11;
        relativeClassName.isRoot();
    }

    private static final String a(FqName fqName) {
        String strAsString = fqName.asString();
        s.j(strAsString, "asString(...)");
        if (!t.g0(strAsString, '/', false, 2, null)) {
            return strAsString;
        }
        return '`' + strAsString + '`';
    }

    public static final ClassId topLevel(FqName fqName) {
        return Companion.topLevel(fqName);
    }

    public final FqName asSingleFqName() {
        if (this.f88170a.isRoot()) {
            return this.f88171b;
        }
        return new FqName(this.f88170a.asString() + CoreConstants.DOT + this.f88171b.asString());
    }

    public final String asString() {
        if (this.f88170a.isRoot()) {
            return a(this.f88171b);
        }
        StringBuilder sb2 = new StringBuilder();
        String strAsString = this.f88170a.asString();
        s.j(strAsString, "asString(...)");
        sb2.append(t.U(strAsString, CoreConstants.DOT, '/', false, 4, null));
        sb2.append("/");
        sb2.append(a(this.f88171b));
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    public final ClassId createNestedClassId(Name name) {
        s.k(name, "name");
        FqName fqName = this.f88170a;
        FqName fqNameChild = this.f88171b.child(name);
        s.j(fqNameChild, "child(...)");
        return new ClassId(fqName, fqNameChild, this.f88172c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassId)) {
            return false;
        }
        ClassId classId = (ClassId) obj;
        return s.f(this.f88170a, classId.f88170a) && s.f(this.f88171b, classId.f88171b) && this.f88172c == classId.f88172c;
    }

    public final ClassId getOuterClassId() {
        FqName fqNameParent = this.f88171b.parent();
        s.j(fqNameParent, "parent(...)");
        if (fqNameParent.isRoot()) {
            return null;
        }
        return new ClassId(this.f88170a, fqNameParent, this.f88172c);
    }

    public final FqName getPackageFqName() {
        return this.f88170a;
    }

    public final FqName getRelativeClassName() {
        return this.f88171b;
    }

    public final Name getShortClassName() {
        Name nameShortName = this.f88171b.shortName();
        s.j(nameShortName, "shortName(...)");
        return nameShortName;
    }

    public int hashCode() {
        return (((this.f88170a.hashCode() * 31) + this.f88171b.hashCode()) * 31) + Boolean.hashCode(this.f88172c);
    }

    public final boolean isLocal() {
        return this.f88172c;
    }

    public final boolean isNestedClass() {
        return !this.f88171b.parent().isRoot();
    }

    public String toString() {
        if (!this.f88170a.isRoot()) {
            return asString();
        }
        return '/' + asString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ClassId(FqName packageFqName, Name topLevelName) {
        s.k(packageFqName, "packageFqName");
        s.k(topLevelName, "topLevelName");
        FqName fqName = FqName.topLevel(topLevelName);
        s.j(fqName, "topLevel(...)");
        this(packageFqName, fqName, false);
    }
}
