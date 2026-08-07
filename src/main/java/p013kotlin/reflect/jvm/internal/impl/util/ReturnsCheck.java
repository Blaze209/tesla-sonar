package p013kotlin.reflect.jvm.internal.impl.util;

import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ReturnsCheck implements Check {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f89072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<KotlinBuiltIns, KotlinType> f89073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f89074c;

    public static final class ReturnsBoolean extends ReturnsCheck {
        public static final ReturnsBoolean INSTANCE = new ReturnsBoolean();

        private ReturnsBoolean() {
            super("Boolean", f.f89087a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KotlinType a(KotlinBuiltIns kotlinBuiltIns) {
            s.k(kotlinBuiltIns, "<this>");
            SimpleType booleanType = kotlinBuiltIns.getBooleanType();
            s.j(booleanType, "getBooleanType(...)");
            return booleanType;
        }
    }

    public static final class ReturnsInt extends ReturnsCheck {
        public static final ReturnsInt INSTANCE = new ReturnsInt();

        private ReturnsInt() {
            super("Int", g.f89088a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KotlinType a(KotlinBuiltIns kotlinBuiltIns) {
            s.k(kotlinBuiltIns, "<this>");
            SimpleType intType = kotlinBuiltIns.getIntType();
            s.j(intType, "getIntType(...)");
            return intType;
        }
    }

    public static final class ReturnsUnit extends ReturnsCheck {
        public static final ReturnsUnit INSTANCE = new ReturnsUnit();

        private ReturnsUnit() {
            super("Unit", h.f89089a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KotlinType a(KotlinBuiltIns kotlinBuiltIns) {
            s.k(kotlinBuiltIns, "<this>");
            SimpleType unitType = kotlinBuiltIns.getUnitType();
            s.j(unitType, "getUnitType(...)");
            return unitType;
        }
    }

    public /* synthetic */ ReturnsCheck(String str, l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, lVar);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.Check
    public boolean check(FunctionDescriptor functionDescriptor) {
        s.k(functionDescriptor, "functionDescriptor");
        return s.f(functionDescriptor.getReturnType(), this.f89073b.invoke(DescriptorUtilsKt.getBuiltIns(functionDescriptor)));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.Check
    public String getDescription() {
        return this.f89074c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.Check
    public String invoke(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ReturnsCheck(String str, l<? super KotlinBuiltIns, ? extends KotlinType> lVar) {
        this.f89072a = str;
        this.f89073b = lVar;
        this.f89074c = "must return " + str;
    }
}
