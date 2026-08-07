package p013kotlin.reflect.jvm.internal.impl.name;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p013kotlin.collections.n;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class FqNameUnsafe {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Name f88175e = Name.special("<root>");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f88176f = Pattern.compile("\\.");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final l<String, Name> f88177g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient FqName f88179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient FqNameUnsafe f88180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Name f88181d;

    static class a implements l<String, Name> {
        a() {
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Name invoke(String str) {
            return Name.guessByFirstCharacter(str);
        }
    }

    FqNameUnsafe(String str, FqName fqName) {
        if (str == null) {
            a(0);
        }
        if (fqName == null) {
            a(1);
        }
        this.f88178a = str;
        this.f88179b = fqName;
    }

    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                i12 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        if (i11 != 1) {
            switch (i11) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "other";
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i11) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = "toString";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    private void b() {
        int iLastIndexOf = this.f88178a.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f88181d = Name.guessByFirstCharacter(this.f88178a.substring(iLastIndexOf + 1));
            this.f88180c = new FqNameUnsafe(this.f88178a.substring(0, iLastIndexOf));
        } else {
            this.f88181d = Name.guessByFirstCharacter(this.f88178a);
            this.f88180c = FqName.ROOT.toUnsafe();
        }
    }

    public static FqNameUnsafe topLevel(Name name) {
        if (name == null) {
            a(17);
        }
        return new FqNameUnsafe(name.asString(), FqName.ROOT.toUnsafe(), name);
    }

    public String asString() {
        String str = this.f88178a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    public FqNameUnsafe child(Name name) {
        String strAsString;
        if (name == null) {
            a(9);
        }
        if (isRoot()) {
            strAsString = name.asString();
        } else {
            strAsString = this.f88178a + "." + name.asString();
        }
        return new FqNameUnsafe(strAsString, this, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqNameUnsafe) && this.f88178a.equals(((FqNameUnsafe) obj).f88178a);
    }

    public int hashCode() {
        return this.f88178a.hashCode();
    }

    public boolean isRoot() {
        return this.f88178a.isEmpty();
    }

    public boolean isSafe() {
        return this.f88179b != null || asString().indexOf(60) < 0;
    }

    public FqNameUnsafe parent() {
        FqNameUnsafe fqNameUnsafe = this.f88180c;
        if (fqNameUnsafe != null) {
            if (fqNameUnsafe == null) {
                a(7);
            }
            return fqNameUnsafe;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        b();
        FqNameUnsafe fqNameUnsafe2 = this.f88180c;
        if (fqNameUnsafe2 == null) {
            a(8);
        }
        return fqNameUnsafe2;
    }

    public List<Name> pathSegments() {
        List<Name> listY0 = isRoot() ? Collections.EMPTY_LIST : n.Y0(f88176f.split(this.f88178a), f88177g);
        if (listY0 == null) {
            a(14);
        }
        return listY0;
    }

    public Name shortName() {
        Name name = this.f88181d;
        if (name != null) {
            if (name == null) {
                a(10);
            }
            return name;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        b();
        Name name2 = this.f88181d;
        if (name2 == null) {
            a(11);
        }
        return name2;
    }

    public Name shortNameOrSpecial() {
        if (isRoot()) {
            Name name = f88175e;
            if (name == null) {
                a(12);
            }
            return name;
        }
        Name nameShortName = shortName();
        if (nameShortName == null) {
            a(13);
        }
        return nameShortName;
    }

    public boolean startsWith(Name name) {
        if (name == null) {
            a(15);
        }
        if (isRoot()) {
            return false;
        }
        int iIndexOf = this.f88178a.indexOf(46);
        if (iIndexOf == -1) {
            iIndexOf = this.f88178a.length();
        }
        String strAsString = name.asString();
        return iIndexOf == strAsString.length() && this.f88178a.regionMatches(0, strAsString, 0, iIndexOf);
    }

    public FqName toSafe() {
        FqName fqName = this.f88179b;
        if (fqName != null) {
            if (fqName == null) {
                a(5);
            }
            return fqName;
        }
        FqName fqName2 = new FqName(this);
        this.f88179b = fqName2;
        return fqName2;
    }

    public String toString() {
        String strAsString = isRoot() ? f88175e.asString() : this.f88178a;
        if (strAsString == null) {
            a(18);
        }
        return strAsString;
    }

    public FqNameUnsafe(String str) {
        if (str == null) {
            a(2);
        }
        this.f88178a = str;
    }

    private FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name) {
        if (str == null) {
            a(3);
        }
        this.f88178a = str;
        this.f88180c = fqNameUnsafe;
        this.f88181d = name;
    }
}
