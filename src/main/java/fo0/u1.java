package fo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import java.util.Collection;
import java.util.List;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010$\u001a\f\u0012\b\u0012\u00060!R\u00020\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0006\u0012\u0002\b\u00030\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lfo0/u1;", "Lfo0/c1;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "E", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "A", "", "index", "B", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Class;", "a", "()Ljava/lang/Class;", "Lkotlin/Lazy;", "Lfo0/u1$a;", "e", "Lkotlin/Lazy;", "data", "D", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "z", "()Ljava/util/Collection;", "constructorDescriptors", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u1 extends c1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Class<?> jClass;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy<a> data;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\n\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR!\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R/\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR%\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lfo0/u1$a;", "Lfo0/c1$b;", "Lfo0/c1;", "<init>", "(Lfo0/u1;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/ReflectKotlinClass;", DateTokenConverter.CONVERTER_KEY, "Lfo0/z2$a;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "e", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Ljava/lang/Class;", "f", "Lkotlin/Lazy;", "k", "()Ljava/lang/Class;", "multifileFacade", "Ljn0/w;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "g", "j", "()Ljn0/w;", OrcaKeys.METADATA, "", "Lfo0/a0;", "h", "getMembers", "()Ljava/util/Collection;", "members", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class a extends c1.b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final /* synthetic */ co0.m<Object>[] f66252j = {p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(a.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final z2.a kotlinClass;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z2.a scope;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Lazy multifileFacade;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Lazy metadata;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final z2.a members;

        public a() {
            super();
            this.kotlinClass = z2.c(new p1(u1.this));
            this.scope = z2.c(new q1(this));
            jn0.p pVar = jn0.p.PUBLICATION;
            this.multifileFacade = jn0.m.a(pVar, new r1(this, u1.this));
            this.metadata = jn0.m.a(pVar, new s1(this));
            this.members = z2.c(new t1(u1.this, this));
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final ReflectKotlinClass i() {
            return (ReflectKotlinClass) this.kotlinClass.b(this, f66252j[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReflectKotlinClass m(u1 u1Var) {
            return ReflectKotlinClass.Factory.create(u1Var.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection n(u1 u1Var, a aVar) {
            return u1Var.C(aVar.l(), c1.d.DECLARED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.w o(a aVar) {
            KotlinClassHeader classHeader;
            ReflectKotlinClass reflectKotlinClassI = aVar.i();
            if (reflectKotlinClassI != null && (classHeader = reflectKotlinClassI.getClassHeader()) != null) {
                String[] data = classHeader.getData();
                String[] strings = classHeader.getStrings();
                if (data != null && strings != null) {
                    Pair<JvmNameResolver, ProtoBuf.Package> packageDataFrom = JvmProtoBufUtil.readPackageDataFrom(data, strings);
                    return new jn0.w(packageDataFrom.a(), packageDataFrom.b(), classHeader.getMetadataVersion());
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Class p(a aVar, u1 u1Var) {
            KotlinClassHeader classHeader;
            ReflectKotlinClass reflectKotlinClassI = aVar.i();
            String multifileClassName = (reflectKotlinClassI == null || (classHeader = reflectKotlinClassI.getClassHeader()) == null) ? null : classHeader.getMultifileClassName();
            if (multifileClassName == null || multifileClassName.length() <= 0) {
                return null;
            }
            return u1Var.a().getClassLoader().loadClass(p013kotlin.text.t.U(multifileClassName, '/', CoreConstants.DOT, false, 4, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MemberScope q(a aVar) {
            ReflectKotlinClass reflectKotlinClassI = aVar.i();
            return reflectKotlinClassI != null ? aVar.b().getPackagePartScopeCache().getPackagePartScope(reflectKotlinClassI) : MemberScope.Empty.INSTANCE;
        }

        public final jn0.w<JvmNameResolver, ProtoBuf.Package, JvmMetadataVersion> j() {
            return (jn0.w) this.metadata.getValue();
        }

        public final Class<?> k() {
            return (Class) this.multifileFacade.getValue();
        }

        public final MemberScope l() {
            T tB = this.scope.b(this, f66252j[1]);
            p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
            return (MemberScope) tB;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class b extends p013kotlin.jvm.internal.o implements wn0.p<MemberDeserializer, ProtoBuf.Property, PropertyDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f66259a = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PropertyDescriptor invoke(MemberDeserializer p11, ProtoBuf.Property p12) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            p013kotlin.jvm.internal.s.k(p12, "p1");
            return p11.loadProperty(p12);
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "loadProperty";
        }

        @Override // p013kotlin.jvm.internal.f
        public final co0.g getOwner() {
            return p013kotlin.jvm.internal.o0.b(MemberDeserializer.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }
    }

    public u1(Class<?> jClass) {
        p013kotlin.jvm.internal.s.k(jClass, "jClass");
        this.jClass = jClass;
        this.data = jn0.m.a(jn0.p.PUBLICATION, new o1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a L(u1 u1Var) {
        return u1Var.new a();
    }

    private final MemberScope M() {
        return this.data.getValue().l();
    }

    @Override // fo0.c1
    public Collection<FunctionDescriptor> A(Name name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        return M().getContributedFunctions(name, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // fo0.c1
    public PropertyDescriptor B(int index) {
        jn0.w<JvmNameResolver, ProtoBuf.Package, JvmMetadataVersion> wVarJ = this.data.getValue().j();
        if (wVarJ != null) {
            JvmNameResolver jvmNameResolverA = wVarJ.a();
            ProtoBuf.Package packageB = wVarJ.b();
            JvmMetadataVersion jvmMetadataVersionC = wVarJ.c();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> packageLocalVariable = JvmProtoBuf.packageLocalVariable;
            p013kotlin.jvm.internal.s.j(packageLocalVariable, "packageLocalVariable");
            ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.getExtensionOrNull(packageB, packageLocalVariable, index);
            if (property != null) {
                Class<?> clsA = a();
                ProtoBuf.TypeTable typeTable = packageB.getTypeTable();
                p013kotlin.jvm.internal.s.j(typeTable, "getTypeTable(...)");
                return (PropertyDescriptor) i3.h(clsA, property, jvmNameResolverA, new TypeTable(typeTable), jvmMetadataVersionC, b.f66259a);
            }
        }
        return null;
    }

    @Override // fo0.c1
    protected Class<?> D() {
        Class<?> clsK = this.data.getValue().k();
        return clsK == null ? a() : clsK;
    }

    @Override // fo0.c1
    public Collection<PropertyDescriptor> E(Name name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        return M().getContributedVariables(name, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // p013kotlin.jvm.internal.h
    public Class<?> a() {
        return this.jClass;
    }

    public boolean equals(Object other) {
        return (other instanceof u1) && p013kotlin.jvm.internal.s.f(a(), ((u1) other).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "file class " + ReflectClassUtilKt.getClassId(a()).asSingleFqName();
    }

    @Override // fo0.c1
    public Collection<ConstructorDescriptor> z() {
        return p013kotlin.collections.v.m();
    }
}
