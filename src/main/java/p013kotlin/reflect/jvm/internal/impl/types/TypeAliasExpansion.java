package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* JADX INFO: loaded from: classes9.dex */
public final class TypeAliasExpansion {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeAliasExpansion f88909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeAliasDescriptor f88910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<TypeProjection> f88911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<TypeParameterDescriptor, TypeProjection> f88912d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TypeAliasExpansion create(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> arguments) {
            s.k(typeAliasDescriptor, "typeAliasDescriptor");
            s.k(arguments, "arguments");
            List<TypeParameterDescriptor> parameters = typeAliasDescriptor.getTypeConstructor().getParameters();
            s.j(parameters, "getParameters(...)");
            List<TypeParameterDescriptor> list = parameters;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).getOriginal());
            }
            return new TypeAliasExpansion(typeAliasExpansion, typeAliasDescriptor, arguments, v0.y(v.v1(arrayList, arguments)), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeAliasExpansion, typeAliasDescriptor, list, map);
    }

    public final List<TypeProjection> getArguments() {
        return this.f88911c;
    }

    public final TypeAliasDescriptor getDescriptor() {
        return this.f88910b;
    }

    public final TypeProjection getReplacement(TypeConstructor constructor) {
        s.k(constructor, "constructor");
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = constructor.mo500getDeclarationDescriptor();
        if (classifierDescriptorMo500getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return this.f88912d.get(classifierDescriptorMo500getDeclarationDescriptor);
        }
        return null;
    }

    public final boolean isRecursion(TypeAliasDescriptor descriptor) {
        s.k(descriptor, "descriptor");
        if (s.f(this.f88910b, descriptor)) {
            return true;
        }
        TypeAliasExpansion typeAliasExpansion = this.f88909a;
        return typeAliasExpansion != null ? typeAliasExpansion.isRecursion(descriptor) : false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> list, Map<TypeParameterDescriptor, ? extends TypeProjection> map) {
        this.f88909a = typeAliasExpansion;
        this.f88910b = typeAliasDescriptor;
        this.f88911c = list;
        this.f88912d = map;
    }
}
