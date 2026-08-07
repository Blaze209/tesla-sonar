package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import jn0.h0;
import jn0.m;
import jn0.p;
import p013kotlin.Lazy;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractTypeConstructor extends ClassifierBasedTypeConstructor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotNullLazyValue<b> f88854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f88855c;

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements TypeConstructor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final KotlinTypeRefiner f88856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lazy f88857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractTypeConstructor f88858c;

        public a(AbstractTypeConstructor abstractTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
            s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f88858c = abstractTypeConstructor;
            this.f88856a = kotlinTypeRefiner;
            this.f88857b = m.a(p.PUBLICATION, new j(this, abstractTypeConstructor));
        }

        private final List<KotlinType> b() {
            return (List) this.f88857b.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List d(a aVar, AbstractTypeConstructor abstractTypeConstructor) {
            return KotlinTypeRefinerKt.refineTypes(aVar.f88856a, abstractTypeConstructor.getSupertypes());
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<KotlinType> getSupertypes() {
            return b();
        }

        public boolean equals(Object obj) {
            return this.f88858c.equals(obj);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns builtIns = this.f88858c.getBuiltIns();
            s.j(builtIns, "getBuiltIns(...)");
            return builtIns;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: getDeclarationDescriptor */
        public ClassifierDescriptor mo500getDeclarationDescriptor() {
            return this.f88858c.mo500getDeclarationDescriptor();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<TypeParameterDescriptor> getParameters() {
            List<TypeParameterDescriptor> parameters = this.f88858c.getParameters();
            s.j(parameters, "getParameters(...)");
            return parameters;
        }

        public int hashCode() {
            return this.f88858c.hashCode();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return this.f88858c.isDenotable();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
            s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.f88858c.refine(kotlinTypeRefiner);
        }

        public String toString() {
            return this.f88858c.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Collection<KotlinType> f88859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<? extends KotlinType> f88860b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Collection<? extends KotlinType> allSupertypes) {
            s.k(allSupertypes, "allSupertypes");
            this.f88859a = allSupertypes;
            this.f88860b = v.e(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes());
        }

        public final Collection<KotlinType> a() {
            return this.f88859a;
        }

        public final List<KotlinType> b() {
            return this.f88860b;
        }

        public final void c(List<? extends KotlinType> list) {
            s.k(list, "<set-?>");
            this.f88860b = list;
        }
    }

    public AbstractTypeConstructor(StorageManager storageManager) {
        s.k(storageManager, "storageManager");
        this.f88854b = storageManager.createLazyValueWithPostCompute(new c(this), d.f88981a, new e(this));
    }

    private final Collection<KotlinType> k(TypeConstructor typeConstructor, boolean z11) {
        List listP0;
        AbstractTypeConstructor abstractTypeConstructor = typeConstructor instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) typeConstructor : null;
        if (abstractTypeConstructor != null && (listP0 = v.P0(((b) abstractTypeConstructor.f88854b.invoke()).a(), abstractTypeConstructor.n(z11))) != null) {
            return listP0;
        }
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        s.j(supertypes, "getSupertypes(...)");
        return supertypes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b t(AbstractTypeConstructor abstractTypeConstructor) {
        return new b(abstractTypeConstructor.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b u(boolean z11) {
        return new b(v.e(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 v(AbstractTypeConstructor abstractTypeConstructor, b supertypes) {
        s.k(supertypes, "supertypes");
        List listFindLoopsInSupertypesAndDisconnect = abstractTypeConstructor.p().findLoopsInSupertypesAndDisconnect(abstractTypeConstructor, supertypes.a(), new f(abstractTypeConstructor), new g(abstractTypeConstructor));
        if (listFindLoopsInSupertypesAndDisconnect.isEmpty()) {
            KotlinType kotlinTypeM = abstractTypeConstructor.m();
            List listE = kotlinTypeM != null ? v.e(kotlinTypeM) : null;
            if (listE == null) {
                listE = v.m();
            }
            listFindLoopsInSupertypesAndDisconnect = listE;
        }
        if (abstractTypeConstructor.o()) {
            abstractTypeConstructor.p().findLoopsInSupertypesAndDisconnect(abstractTypeConstructor, listFindLoopsInSupertypesAndDisconnect, new h(abstractTypeConstructor), new i(abstractTypeConstructor));
        }
        List<KotlinType> listM1 = listFindLoopsInSupertypesAndDisconnect instanceof List ? (List) listFindLoopsInSupertypesAndDisconnect : null;
        if (listM1 == null) {
            listM1 = v.m1(listFindLoopsInSupertypesAndDisconnect);
        }
        supertypes.c(abstractTypeConstructor.q(listM1));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable w(AbstractTypeConstructor abstractTypeConstructor, TypeConstructor it) {
        s.k(it, "it");
        return abstractTypeConstructor.k(it, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 x(AbstractTypeConstructor abstractTypeConstructor, KotlinType it) {
        s.k(it, "it");
        abstractTypeConstructor.s(it);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable y(AbstractTypeConstructor abstractTypeConstructor, TypeConstructor it) {
        s.k(it, "it");
        return abstractTypeConstructor.k(it, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 z(AbstractTypeConstructor abstractTypeConstructor, KotlinType it) {
        s.k(it, "it");
        abstractTypeConstructor.r(it);
        return h0.f84049a;
    }

    protected abstract Collection<KotlinType> l();

    protected KotlinType m() {
        return null;
    }

    protected Collection<KotlinType> n(boolean z11) {
        return v.m();
    }

    protected boolean o() {
        return this.f88855c;
    }

    protected abstract SupertypeLoopChecker p();

    protected List<KotlinType> q(List<KotlinType> supertypes) {
        s.k(supertypes, "supertypes");
        return supertypes;
    }

    protected void r(KotlinType type) {
        s.k(type, "type");
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this, kotlinTypeRefiner);
    }

    protected void s(KotlinType type) {
        s.k(type, "type");
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<KotlinType> getSupertypes() {
        return ((b) this.f88854b.invoke()).b();
    }
}
