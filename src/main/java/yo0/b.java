package yo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;
import ro0.q;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012*\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u0012.\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u0002\u0012&\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u00122\u0010\u0010\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000e0\bj\u0006\u0012\u0002\b\u0003`\u000f0\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\"\b\b\u0000\u0010\u0016*\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\b\b\u0000\u0010\u0016*\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0016*\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'R$\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010(R8\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010(R<\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R4\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(R@\u0010\u0010\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000e0\bj\u0006\u0012\u0002\b\u0003`\u000f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u001a\u0010\u0012\u001a\u00020\u00118\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lyo0/b;", "Lyo0/c;", "", "Lco0/d;", "Lyo0/a;", "class2ContextualFactory", "Lro0/d;", "polyBase2Serializers", "Lkotlin/Function1;", "Lro0/q;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2DefaultSerializerProvider", "", "polyBase2NamedSerializers", "Lro0/c;", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "", "hasInterfaceContextualSerializers", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Z)V", "", "T", "baseClass", "value", "e", "(Lco0/d;Ljava/lang/Object;)Lro0/q;", "serializedClassName", DateTokenConverter.CONVERTER_KEY, "(Lco0/d;Ljava/lang/String;)Lro0/c;", "kClass", "", "typeArgumentsSerializers", "b", "(Lco0/d;Ljava/util/List;)Lro0/d;", "Lyo0/f;", "collector", "Ljn0/h0;", "a", "(Lyo0/f;)V", "Ljava/util/Map;", "c", "f", "Z", "getHasInterfaceContextualSerializers$kotlinx_serialization_core", "()Z", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<co0.d<?>, a> class2ContextualFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Map<co0.d<?>, Map<co0.d<?>, ro0.d<?>>> polyBase2Serializers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<co0.d<?>, l<?, q<?>>> polyBase2DefaultSerializerProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<co0.d<?>, Map<String, ro0.d<?>>> polyBase2NamedSerializers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<co0.d<?>, l<String, ro0.c<?>>> polyBase2DefaultDeserializerProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean hasInterfaceContextualSerializers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Map<co0.d<?>, ? extends a> class2ContextualFactory, Map<co0.d<?>, ? extends Map<co0.d<?>, ? extends ro0.d<?>>> polyBase2Serializers, Map<co0.d<?>, ? extends l<?, ? extends q<?>>> polyBase2DefaultSerializerProvider, Map<co0.d<?>, ? extends Map<String, ? extends ro0.d<?>>> polyBase2NamedSerializers, Map<co0.d<?>, ? extends l<? super String, ? extends ro0.c<?>>> polyBase2DefaultDeserializerProvider, boolean z11) {
        super(null);
        s.k(class2ContextualFactory, "class2ContextualFactory");
        s.k(polyBase2Serializers, "polyBase2Serializers");
        s.k(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        s.k(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        s.k(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.class2ContextualFactory = class2ContextualFactory;
        this.polyBase2Serializers = polyBase2Serializers;
        this.polyBase2DefaultSerializerProvider = polyBase2DefaultSerializerProvider;
        this.polyBase2NamedSerializers = polyBase2NamedSerializers;
        this.polyBase2DefaultDeserializerProvider = polyBase2DefaultDeserializerProvider;
        this.hasInterfaceContextualSerializers = z11;
    }

    @Override // yo0.c
    public void a(f collector) {
        s.k(collector, "collector");
        for (Map.Entry<co0.d<?>, a> entry : this.class2ContextualFactory.entrySet()) {
            co0.d<?> key = entry.getKey();
            a value = entry.getValue();
            if (value instanceof a.C2733a) {
                s.i(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                ro0.d<?> dVarB = ((a.C2733a) value).b();
                s.i(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.a(key, dVarB);
            } else {
                if (!(value instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                collector.c(key, ((a.b) value).b());
            }
        }
        for (Map.Entry<co0.d<?>, Map<co0.d<?>, ro0.d<?>>> entry2 : this.polyBase2Serializers.entrySet()) {
            co0.d<?> key2 = entry2.getKey();
            for (Map.Entry<co0.d<?>, ro0.d<?>> entry3 : entry2.getValue().entrySet()) {
                co0.d<?> key3 = entry3.getKey();
                ro0.d<?> value2 = entry3.getValue();
                s.i(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                s.i(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                s.i(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.d(key2, key3, value2);
            }
        }
        for (Map.Entry<co0.d<?>, l<?, q<?>>> entry4 : this.polyBase2DefaultSerializerProvider.entrySet()) {
            co0.d<?> key4 = entry4.getKey();
            l<?, q<?>> value3 = entry4.getValue();
            s.i(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            s.i(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.e(key4, (l) u0.g(value3, 1));
        }
        for (Map.Entry<co0.d<?>, l<String, ro0.c<?>>> entry5 : this.polyBase2DefaultDeserializerProvider.entrySet()) {
            co0.d<?> key5 = entry5.getKey();
            l<String, ro0.c<?>> value4 = entry5.getValue();
            s.i(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            s.i(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.b(key5, (l) u0.g(value4, 1));
        }
    }

    @Override // yo0.c
    public <T> ro0.d<T> b(co0.d<T> kClass, List<? extends ro0.d<?>> typeArgumentsSerializers) {
        s.k(kClass, "kClass");
        s.k(typeArgumentsSerializers, "typeArgumentsSerializers");
        a aVar = this.class2ContextualFactory.get(kClass);
        ro0.d<T> dVar = aVar != null ? (ro0.d<T>) aVar.a(typeArgumentsSerializers) : null;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    @Override // yo0.c
    public <T> ro0.c<T> d(co0.d<? super T> baseClass, String serializedClassName) {
        s.k(baseClass, "baseClass");
        Map<String, ro0.d<?>> map = this.polyBase2NamedSerializers.get(baseClass);
        ro0.d<?> dVar = map != null ? map.get(serializedClassName) : null;
        if (dVar == null) {
            dVar = null;
        }
        if (dVar != null) {
            return dVar;
        }
        l<String, ro0.c<?>> lVar = this.polyBase2DefaultDeserializerProvider.get(baseClass);
        l<String, ro0.c<?>> lVar2 = u0.o(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (ro0.c) lVar2.invoke(serializedClassName);
        }
        return null;
    }

    @Override // yo0.c
    public <T> q<T> e(co0.d<? super T> baseClass, T value) {
        s.k(baseClass, "baseClass");
        s.k(value, "value");
        if (!baseClass.j(value)) {
            return null;
        }
        Map<co0.d<?>, ro0.d<?>> map = this.polyBase2Serializers.get(baseClass);
        ro0.d<?> dVar = map != null ? map.get(o0.b(value.getClass())) : null;
        if (dVar == null) {
            dVar = null;
        }
        if (dVar != null) {
            return dVar;
        }
        l<?, q<?>> lVar = this.polyBase2DefaultSerializerProvider.get(baseClass);
        l<?, q<?>> lVar2 = u0.o(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (q) lVar2.invoke(value);
        }
        return null;
    }
}
