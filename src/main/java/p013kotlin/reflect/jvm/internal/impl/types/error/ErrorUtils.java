package p013kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class ErrorUtils {
    public static final ErrorUtils INSTANCE = new ErrorUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ModuleDescriptor f89002a = ErrorModuleDescriptor.INSTANCE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ErrorClassDescriptor f89003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final KotlinType f89004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final KotlinType f89005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final PropertyDescriptor f89006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set<PropertyDescriptor> f89007f;

    static {
        String str = String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        s.j(str, "format(...)");
        Name nameSpecial = Name.special(str);
        s.j(nameSpecial, "special(...)");
        f89003b = new ErrorClassDescriptor(nameSpecial);
        f89004c = createErrorType(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);
        f89005d = createErrorType(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);
        ErrorPropertyDescriptor errorPropertyDescriptor = new ErrorPropertyDescriptor();
        f89006e = errorPropertyDescriptor;
        f89007f = d1.c(errorPropertyDescriptor);
    }

    private ErrorUtils() {
    }

    private final boolean a(DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor instanceof ErrorClassDescriptor;
    }

    public static final ErrorScope createErrorScope(ErrorScopeKind kind, String... formatParams) {
        s.k(kind, "kind");
        s.k(formatParams, "formatParams");
        return createErrorScope(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final ErrorType createErrorType(ErrorTypeKind kind, String... formatParams) {
        s.k(kind, "kind");
        s.k(formatParams, "formatParams");
        return INSTANCE.createErrorTypeWithArguments(kind, v.m(), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean isError(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            return false;
        }
        ErrorUtils errorUtils = INSTANCE;
        return errorUtils.a(declarationDescriptor) || errorUtils.a(declarationDescriptor.getContainingDeclaration()) || declarationDescriptor == f89002a;
    }

    public static final boolean isUninferredTypeVariable(KotlinType kotlinType) {
        if (kotlinType == null) {
            return false;
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        return (constructor instanceof ErrorTypeConstructor) && ((ErrorTypeConstructor) constructor).getKind() == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE;
    }

    public final ErrorTypeConstructor createErrorTypeConstructor(ErrorTypeKind kind, String... formatParams) {
        s.k(kind, "kind");
        s.k(formatParams, "formatParams");
        return new ErrorTypeConstructor(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final ErrorType createErrorTypeWithArguments(ErrorTypeKind kind, List<? extends TypeProjection> arguments, String... formatParams) {
        s.k(kind, "kind");
        s.k(arguments, "arguments");
        s.k(formatParams, "formatParams");
        return createErrorTypeWithArguments(kind, arguments, createErrorTypeConstructor(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final ErrorClassDescriptor getErrorClass() {
        return f89003b;
    }

    public final ModuleDescriptor getErrorModule() {
        return f89002a;
    }

    public final Set<PropertyDescriptor> getErrorPropertyGroup() {
        return f89007f;
    }

    public final KotlinType getErrorPropertyType() {
        return f89005d;
    }

    public final KotlinType getErrorTypeForLoopInSupertypes() {
        return f89004c;
    }

    public final String unresolvedTypeAsItIs(KotlinType type) {
        s.k(type, "type");
        TypeUtilsKt.isUnresolvedType(type);
        TypeConstructor constructor = type.getConstructor();
        s.i(constructor, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
        return ((ErrorTypeConstructor) constructor).getParam(0);
    }

    public static final ErrorScope createErrorScope(ErrorScopeKind kind, boolean z11, String... formatParams) {
        s.k(kind, "kind");
        s.k(formatParams, "formatParams");
        return z11 ? new ThrowingScope(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)) : new ErrorScope(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final ErrorType createErrorType(ErrorTypeKind kind, TypeConstructor typeConstructor, String... formatParams) {
        s.k(kind, "kind");
        s.k(typeConstructor, "typeConstructor");
        s.k(formatParams, "formatParams");
        return createErrorTypeWithArguments(kind, v.m(), typeConstructor, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final ErrorType createErrorTypeWithArguments(ErrorTypeKind kind, List<? extends TypeProjection> arguments, TypeConstructor typeConstructor, String... formatParams) {
        s.k(kind, "kind");
        s.k(arguments, "arguments");
        s.k(typeConstructor, "typeConstructor");
        s.k(formatParams, "formatParams");
        return new ErrorType(typeConstructor, createErrorScope(ErrorScopeKind.ERROR_TYPE_SCOPE, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }
}
