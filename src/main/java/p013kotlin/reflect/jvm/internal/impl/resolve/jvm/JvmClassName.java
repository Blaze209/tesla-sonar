package p013kotlin.reflect.jvm.internal.impl.resolve.jvm;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public class JvmClassName {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FqName f88493b;

    private JvmClassName(String str) {
        if (str == null) {
            a(7);
        }
        this.f88492a = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        if (i11 != 3 && i11 != 5) {
            switch (i11) {
                case 8:
                case 9:
                case 10:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i11 != 3 && i11 != 5) {
            switch (i11) {
                case 8:
                case 9:
                case 10:
                    i12 = 2;
                    break;
                default:
                    i12 = 3;
                    break;
            }
        } else {
            i12 = 2;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case 2:
                objArr[0] = "classId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            case 7:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i11 == 3) {
            objArr[1] = "internalNameByClassId";
        } else if (i11 != 5) {
            switch (i11) {
                case 8:
                    objArr[1] = "getFqNameForClassNameWithoutDollars";
                    break;
                case 9:
                    objArr[1] = "getPackageFqName";
                    break;
                case 10:
                    objArr[1] = "getInternalName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    break;
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i11) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
                objArr[2] = "internalNameByClassId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                break;
            case 4:
            case 6:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 != 3 && i11 != 5) {
            switch (i11) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static JvmClassName byClassId(ClassId classId) {
        if (classId == null) {
            a(1);
        }
        return new JvmClassName(internalNameByClassId(classId));
    }

    public static JvmClassName byFqNameWithoutInnerClasses(FqName fqName) {
        if (fqName == null) {
            a(4);
        }
        JvmClassName jvmClassName = new JvmClassName(fqName.asString().replace(CoreConstants.DOT, '/'));
        jvmClassName.f88493b = fqName;
        return jvmClassName;
    }

    public static JvmClassName byInternalName(String str) {
        if (str == null) {
            a(0);
        }
        return new JvmClassName(str);
    }

    public static String internalNameByClassId(ClassId classId) {
        if (classId == null) {
            a(2);
        }
        FqName packageFqName = classId.getPackageFqName();
        String strReplace = classId.getRelativeClassName().asString().replace(CoreConstants.DOT, CoreConstants.DOLLAR);
        if (!packageFqName.isRoot()) {
            strReplace = packageFqName.asString().replace(CoreConstants.DOT, '/') + "/" + strReplace;
        }
        if (strReplace == null) {
            a(3);
        }
        return strReplace;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f88492a.equals(((JvmClassName) obj).f88492a);
    }

    public FqName getFqNameForTopLevelClassMaybeWithDollars() {
        return new FqName(this.f88492a.replace('/', CoreConstants.DOT));
    }

    public String getInternalName() {
        String str = this.f88492a;
        if (str == null) {
            a(10);
        }
        return str;
    }

    public FqName getPackageFqName() {
        int iLastIndexOf = this.f88492a.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new FqName(this.f88492a.substring(0, iLastIndexOf).replace('/', CoreConstants.DOT));
        }
        FqName fqName = FqName.ROOT;
        if (fqName == null) {
            a(9);
        }
        return fqName;
    }

    public int hashCode() {
        return this.f88492a.hashCode();
    }

    public String toString() {
        return this.f88492a;
    }
}
