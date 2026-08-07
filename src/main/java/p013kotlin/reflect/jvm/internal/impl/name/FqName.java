package p013kotlin.reflect.jvm.internal.impl.name;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class FqName {
    public static final FqName ROOT = new FqName("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FqNameUnsafe f88173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient FqName f88174b;

    public FqName(String str) {
        if (str == null) {
            a(1);
        }
        this.f88173a = new FqNameUnsafe(str, this);
    }

    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i12 = 2;
                break;
            case 8:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "other";
                break;
            case 14:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i11) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static FqName topLevel(Name name) {
        if (name == null) {
            a(14);
        }
        return new FqName(FqNameUnsafe.topLevel(name));
    }

    public String asString() {
        String strAsString = this.f88173a.asString();
        if (strAsString == null) {
            a(4);
        }
        return strAsString;
    }

    public FqName child(Name name) {
        if (name == null) {
            a(8);
        }
        return new FqName(this.f88173a.child(name), this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqName) && this.f88173a.equals(((FqName) obj).f88173a);
    }

    public int hashCode() {
        return this.f88173a.hashCode();
    }

    public boolean isRoot() {
        return this.f88173a.isRoot();
    }

    public FqName parent() {
        FqName fqName = this.f88174b;
        if (fqName != null) {
            if (fqName == null) {
                a(6);
            }
            return fqName;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        FqName fqName2 = new FqName(this.f88173a.parent());
        this.f88174b = fqName2;
        return fqName2;
    }

    public List<Name> pathSegments() {
        List<Name> listPathSegments = this.f88173a.pathSegments();
        if (listPathSegments == null) {
            a(11);
        }
        return listPathSegments;
    }

    public Name shortName() {
        Name nameShortName = this.f88173a.shortName();
        if (nameShortName == null) {
            a(9);
        }
        return nameShortName;
    }

    public Name shortNameOrSpecial() {
        Name nameShortNameOrSpecial = this.f88173a.shortNameOrSpecial();
        if (nameShortNameOrSpecial == null) {
            a(10);
        }
        return nameShortNameOrSpecial;
    }

    public boolean startsWith(Name name) {
        if (name == null) {
            a(12);
        }
        return this.f88173a.startsWith(name);
    }

    public String toString() {
        return this.f88173a.toString();
    }

    public FqNameUnsafe toUnsafe() {
        FqNameUnsafe fqNameUnsafe = this.f88173a;
        if (fqNameUnsafe == null) {
            a(5);
        }
        return fqNameUnsafe;
    }

    public FqName(FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe == null) {
            a(2);
        }
        this.f88173a = fqNameUnsafe;
    }

    private FqName(FqNameUnsafe fqNameUnsafe, FqName fqName) {
        if (fqNameUnsafe == null) {
            a(3);
        }
        this.f88173a = fqNameUnsafe;
        this.f88174b = fqName;
    }
}
