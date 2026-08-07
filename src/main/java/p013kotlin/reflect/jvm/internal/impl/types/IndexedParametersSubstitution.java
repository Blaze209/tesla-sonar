package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* JADX INFO: loaded from: classes9.dex */
public final class IndexedParametersSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeParameterDescriptor[] f88883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeProjection[] f88884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f88885c;

    public /* synthetic */ IndexedParametersSubstitution(TypeParameterDescriptor[] typeParameterDescriptorArr, TypeProjection[] typeProjectionArr, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeParameterDescriptorArr, typeProjectionArr, (i11 & 4) != 0 ? false : z11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.f88885c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: get */
    public TypeProjection mo503get(KotlinType key) {
        s.k(key, "key");
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = key.getConstructor().mo500getDeclarationDescriptor();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorMo500getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo500getDeclarationDescriptor : null;
        if (typeParameterDescriptor == null) {
            return null;
        }
        int index = typeParameterDescriptor.getIndex();
        TypeParameterDescriptor[] typeParameterDescriptorArr = this.f88883a;
        if (index >= typeParameterDescriptorArr.length || !s.f(typeParameterDescriptorArr[index].getTypeConstructor(), typeParameterDescriptor.getTypeConstructor())) {
            return null;
        }
        return this.f88884b[index];
    }

    public final TypeProjection[] getArguments() {
        return this.f88884b;
    }

    public final TypeParameterDescriptor[] getParameters() {
        return this.f88883a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return this.f88884b.length == 0;
    }

    public IndexedParametersSubstitution(TypeParameterDescriptor[] parameters, TypeProjection[] arguments, boolean z11) {
        s.k(parameters, "parameters");
        s.k(arguments, "arguments");
        this.f88883a = parameters;
        this.f88884b = arguments;
        this.f88885c = z11;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndexedParametersSubstitution(List<? extends TypeParameterDescriptor> parameters, List<? extends TypeProjection> argumentsList) {
        this((TypeParameterDescriptor[]) parameters.toArray(new TypeParameterDescriptor[0]), (TypeProjection[]) argumentsList.toArray(new TypeProjection[0]), false, 4, null);
        s.k(parameters, "parameters");
        s.k(argumentsList, "argumentsList");
    }
}
