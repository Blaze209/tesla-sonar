package p013kotlin.reflect.jvm.internal.impl.builtins.functions;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes9.dex */
public abstract class FunctionTypeKind {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FqName f86606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f86607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f86608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ClassId f86609d;

    public static final class Function extends FunctionTypeKind {
        public static final Function INSTANCE = new Function();

        private Function() {
            super(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, "Function", false, null);
        }
    }

    public static final class KFunction extends FunctionTypeKind {
        public static final KFunction INSTANCE = new KFunction();

        private KFunction() {
            super(StandardNames.KOTLIN_REFLECT_FQ_NAME, "KFunction", true, null);
        }
    }

    public static final class KSuspendFunction extends FunctionTypeKind {
        public static final KSuspendFunction INSTANCE = new KSuspendFunction();

        private KSuspendFunction() {
            super(StandardNames.KOTLIN_REFLECT_FQ_NAME, "KSuspendFunction", true, null);
        }
    }

    public static final class SuspendFunction extends FunctionTypeKind {
        public static final SuspendFunction INSTANCE = new SuspendFunction();

        private SuspendFunction() {
            super(StandardNames.COROUTINES_PACKAGE_FQ_NAME, "SuspendFunction", false, null);
        }
    }

    public FunctionTypeKind(FqName packageFqName, String classNamePrefix, boolean z11, ClassId classId) {
        s.k(packageFqName, "packageFqName");
        s.k(classNamePrefix, "classNamePrefix");
        this.f86606a = packageFqName;
        this.f86607b = classNamePrefix;
        this.f86608c = z11;
        this.f86609d = classId;
    }

    public final String getClassNamePrefix() {
        return this.f86607b;
    }

    public final FqName getPackageFqName() {
        return this.f86606a;
    }

    public final Name numberedClassName(int i11) {
        Name nameIdentifier = Name.identifier(this.f86607b + i11);
        s.j(nameIdentifier, "identifier(...)");
        return nameIdentifier;
    }

    public String toString() {
        return this.f86606a + CoreConstants.DOT + this.f86607b + 'N';
    }
}
