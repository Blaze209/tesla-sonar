package p013kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes9.dex */
public final class ErrorType extends SimpleType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeConstructor f88992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MemberScope f88993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ErrorTypeKind f88994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<TypeProjection> f88995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f88996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f88997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f88998h;

    public /* synthetic */ ErrorType(TypeConstructor typeConstructor, MemberScope memberScope, ErrorTypeKind errorTypeKind, List list, boolean z11, String[] strArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeConstructor, memberScope, errorTypeKind, (i11 & 8) != 0 ? v.m() : list, (i11 & 16) != 0 ? false : z11, strArr);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return this.f88995e;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor getConstructor() {
        return this.f88992b;
    }

    public final String getDebugMessage() {
        return this.f88998h;
    }

    public final ErrorTypeKind getKind() {
        return this.f88994d;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return this.f88993c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.f88996f;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType, p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public ErrorType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public final ErrorType replaceArguments(List<? extends TypeProjection> newArguments) {
        s.k(newArguments, "newArguments");
        TypeConstructor constructor = getConstructor();
        MemberScope memberScope = getMemberScope();
        ErrorTypeKind errorTypeKind = this.f88994d;
        boolean zIsMarkedNullable = isMarkedNullable();
        String[] strArr = this.f88997g;
        return new ErrorType(constructor, memberScope, errorTypeKind, newArguments, zIsMarkedNullable, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        s.k(newAttributes, "newAttributes");
        return this;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType makeNullableAsSpecified(boolean z11) {
        TypeConstructor constructor = getConstructor();
        MemberScope memberScope = getMemberScope();
        ErrorTypeKind errorTypeKind = this.f88994d;
        List<TypeProjection> arguments = getArguments();
        String[] strArr = this.f88997g;
        return new ErrorType(constructor, memberScope, errorTypeKind, arguments, z11, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorType(TypeConstructor constructor, MemberScope memberScope, ErrorTypeKind kind, List<? extends TypeProjection> arguments, boolean z11, String... formatParams) {
        s.k(constructor, "constructor");
        s.k(memberScope, "memberScope");
        s.k(kind, "kind");
        s.k(arguments, "arguments");
        s.k(formatParams, "formatParams");
        this.f88992b = constructor;
        this.f88993c = memberScope;
        this.f88994d = kind;
        this.f88995e = arguments;
        this.f88996f = z11;
        this.f88997g = formatParams;
        t0 t0Var = t0.f86535a;
        String debugMessage = kind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        s.j(str, "format(...)");
        this.f88998h = str;
    }
}
