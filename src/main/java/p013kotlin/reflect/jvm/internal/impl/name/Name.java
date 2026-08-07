package p013kotlin.reflect.jvm.internal.impl.name;

/* JADX INFO: loaded from: classes9.dex */
public final class Name implements Comparable<Name> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f88183b;

    private Name(String str, boolean z11) {
        if (str == null) {
            a(0);
        }
        this.f88182a = str;
        this.f88183b = z11;
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? 2 : 3];
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i11 == 1) {
            objArr[1] = "asString";
        } else if (i11 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i11 == 3 || i11 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static Name guessByFirstCharacter(String str) {
        if (str == null) {
            a(9);
        }
        return str.startsWith("<") ? special(str) : identifier(str);
    }

    public static Name identifier(String str) {
        if (str == null) {
            a(5);
        }
        return new Name(str, false);
    }

    public static boolean isValidIdentifier(String str) {
        if (str == null) {
            a(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static Name special(String str) {
        if (str == null) {
            a(8);
        }
        if (str.startsWith("<")) {
            return new Name(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    public String asString() {
        String str = this.f88182a;
        if (str == null) {
            a(1);
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        return this.f88183b == name.f88183b && this.f88182a.equals(name.f88182a);
    }

    public String getIdentifier() {
        if (this.f88183b) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strAsString = asString();
        if (strAsString == null) {
            a(2);
        }
        return strAsString;
    }

    public int hashCode() {
        return (this.f88182a.hashCode() * 31) + (this.f88183b ? 1 : 0);
    }

    public boolean isSpecial() {
        return this.f88183b;
    }

    public String toString() {
        return this.f88182a;
    }

    @Override // java.lang.Comparable
    public int compareTo(Name name) {
        return this.f88182a.compareTo(name.f88182a);
    }
}
