package p013kotlin.reflect.jvm.internal.impl.types.checker;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.m;
import jn0.p;
import p013kotlin.Lazy;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
public final class NewCapturedTypeConstructor implements CapturedTypeConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeProjection f88960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a<? extends List<? extends UnwrappedType>> f88961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NewCapturedTypeConstructor f88962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TypeParameterDescriptor f88963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f88964e;

    public NewCapturedTypeConstructor(TypeProjection projection, a<? extends List<? extends UnwrappedType>> aVar, NewCapturedTypeConstructor newCapturedTypeConstructor, TypeParameterDescriptor typeParameterDescriptor) {
        s.k(projection, "projection");
        this.f88960a = projection;
        this.f88961b = aVar;
        this.f88962c = newCapturedTypeConstructor;
        this.f88963d = typeParameterDescriptor;
        this.f88964e = m.a(p.PUBLICATION, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        a<? extends List<? extends UnwrappedType>> aVar = newCapturedTypeConstructor.f88961b;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    private final List<UnwrappedType> g() {
        return (List) this.f88964e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List h(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(NewCapturedTypeConstructor newCapturedTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        List<UnwrappedType> supertypes = newCapturedTypeConstructor.getSupertypes();
        ArrayList arrayList = new ArrayList(v.y(supertypes, 10));
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((UnwrappedType) it.next()).refine(kotlinTypeRefiner));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!s.f(NewCapturedTypeConstructor.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        s.i(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.f88962c;
        if (newCapturedTypeConstructor2 == null) {
            newCapturedTypeConstructor2 = this;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.f88962c;
        if (newCapturedTypeConstructor3 != null) {
            obj = newCapturedTypeConstructor3;
        }
        return newCapturedTypeConstructor2 == obj;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        KotlinType type = getProjection().getType();
        s.j(type, "getType(...)");
        return TypeUtilsKt.getBuiltIns(type);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo500getDeclarationDescriptor() {
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return v.m();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    public TypeProjection getProjection() {
        return this.f88960a;
    }

    public int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f88962c;
        return newCapturedTypeConstructor != null ? newCapturedTypeConstructor.hashCode() : super.hashCode();
    }

    public final void initializeSupertypes(List<? extends UnwrappedType> supertypes) {
        s.k(supertypes, "supertypes");
        this.f88961b = new c(supertypes);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    public String toString() {
        return "CapturedType(" + getProjection() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<UnwrappedType> getSupertypes() {
        List<UnwrappedType> listG = g();
        return listG == null ? v.m() : listG;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public NewCapturedTypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionRefine = getProjection().refine(kotlinTypeRefiner);
        s.j(typeProjectionRefine, "refine(...)");
        d dVar = this.f88961b != null ? new d(this, kotlinTypeRefiner) : null;
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f88962c;
        if (newCapturedTypeConstructor == null) {
            newCapturedTypeConstructor = this;
        }
        return new NewCapturedTypeConstructor(typeProjectionRefine, dVar, newCapturedTypeConstructor, this.f88963d);
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, a aVar, NewCapturedTypeConstructor newCapturedTypeConstructor, TypeParameterDescriptor typeParameterDescriptor, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i11 & 2) != 0 ? null : aVar, (i11 & 4) != 0 ? null : newCapturedTypeConstructor, (i11 & 8) != 0 ? null : typeParameterDescriptor);
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, List list, NewCapturedTypeConstructor newCapturedTypeConstructor, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, list, (i11 & 4) != 0 ? null : newCapturedTypeConstructor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor(TypeProjection projection, List<? extends UnwrappedType> supertypes, NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this(projection, new b(supertypes), newCapturedTypeConstructor, null, 8, null);
        s.k(projection, "projection");
        s.k(supertypes, "supertypes");
    }
}
