package ro0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.l0;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\b¢\u0006\u0004\b\f\u0010\rBY\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\f\u0010\u0010J)\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b'\u0010(R0\u0010,\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010+R(\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010+¨\u0006."}, d2 = {"Lro0/m;", "", "T", "Lvo0/b;", "", "serialName", "Lco0/d;", "baseClass", "", "subclasses", "Lro0/d;", "subclassSerializers", "<init>", "(Ljava/lang/String;Lco0/d;[Lco0/d;[Lro0/d;)V", "", "classAnnotations", "(Ljava/lang/String;Lco0/d;[Lco0/d;[Lro0/d;[Ljava/lang/annotation/Annotation;)V", "Luo0/c;", "decoder", "klassName", "Lro0/c;", "c", "(Luo0/c;Ljava/lang/String;)Lro0/c;", "Luo0/f;", "encoder", "value", "Lro0/q;", DateTokenConverter.CONVERTER_KEY, "(Luo0/f;Ljava/lang/Object;)Lro0/q;", "a", "Lco0/d;", "e", "()Lco0/d;", "", "b", "Ljava/util/List;", "_annotations", "Lto0/f;", "Lkotlin/Lazy;", "getDescriptor", "()Lto0/f;", "descriptor", "", "Ljava/util/Map;", "class2Serializer", "serialName2Serializer", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m<T> extends vo0.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co0.d<T> baseClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<? extends Annotation> _annotations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy descriptor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<co0.d<? extends T>, d<? extends T>> class2Serializer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<String, d<? extends T>> serialName2Serializer;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"ro0/m$a", "Lkotlin/collections/l0;", "", "b", "()Ljava/util/Iterator;", "element", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements l0<Map.Entry<? extends co0.d<? extends T>, ? extends d<? extends T>>, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f108685a;

        public a(Iterable iterable) {
            this.f108685a = iterable;
        }

        @Override // p013kotlin.collections.l0
        public String a(Map.Entry<? extends co0.d<? extends T>, ? extends d<? extends T>> element) {
            return element.getValue().getDescriptor().getSerialName();
        }

        @Override // p013kotlin.collections.l0
        public Iterator<Map.Entry<? extends co0.d<? extends T>, ? extends d<? extends T>>> b() {
            return this.f108685a.iterator();
        }
    }

    public m(final String serialName, co0.d<T> baseClass, co0.d<? extends T>[] subclasses, d<? extends T>[] subclassSerializers) {
        p013kotlin.jvm.internal.s.k(serialName, "serialName");
        p013kotlin.jvm.internal.s.k(baseClass, "baseClass");
        p013kotlin.jvm.internal.s.k(subclasses, "subclasses");
        p013kotlin.jvm.internal.s.k(subclassSerializers, "subclassSerializers");
        this.baseClass = baseClass;
        this._annotations = v.m();
        this.descriptor = jn0.m.a(jn0.p.PUBLICATION, new wn0.a() { // from class: ro0.j
            @Override // wn0.a
            public final Object invoke() {
                return m.i(serialName, this);
            }
        });
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + e().l() + " should be marked @Serializable");
        }
        Map<co0.d<? extends T>, d<? extends T>> mapY = v0.y(p013kotlin.collections.n.O1(subclasses, subclassSerializers));
        this.class2Serializer = mapY;
        l0 aVar = new a(mapY.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = aVar.b();
        while (itB.hasNext()) {
            T next = itB.next();
            Object objA = aVar.a(next);
            Object obj = linkedHashMap.get(objA);
            if (obj == null) {
                linkedHashMap.containsKey(objA);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str = (String) objA;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + e() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + CoreConstants.SINGLE_QUOTE_CHAR).toString());
            }
            linkedHashMap.put(objA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v0.e(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (d) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.serialName2Serializer = linkedHashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final to0.f i(String str, final m mVar) {
        return to0.m.g(str, to0.d.b.f114874a, new to0.f[0], new wn0.l() { // from class: ro0.k
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return m.j(this.f108678a, (to0.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 j(final m mVar, to0.a buildSerialDescriptor) {
        p013kotlin.jvm.internal.s.k(buildSerialDescriptor, "$this$buildSerialDescriptor");
        to0.a.b(buildSerialDescriptor, "type", so0.a.F(t0.f86535a).getDescriptor(), null, false, 12, null);
        to0.a.b(buildSerialDescriptor, "value", to0.m.g("kotlinx.serialization.Sealed<" + mVar.e().l() + '>', to0.n.a.f114904a, new to0.f[0], new wn0.l() { // from class: ro0.l
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return m.k(this.f108679a, (to0.a) obj);
            }
        }), null, false, 12, null);
        buildSerialDescriptor.h(mVar._annotations);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 k(m mVar, to0.a buildSerialDescriptor) {
        p013kotlin.jvm.internal.s.k(buildSerialDescriptor, "$this$buildSerialDescriptor");
        for (Map.Entry<String, d<? extends T>> entry : mVar.serialName2Serializer.entrySet()) {
            to0.a.b(buildSerialDescriptor, entry.getKey(), entry.getValue().getDescriptor(), null, false, 12, null);
        }
        return h0.f84049a;
    }

    @Override // vo0.b
    public c<T> c(uo0.c decoder, String klassName) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        d<? extends T> dVar = this.serialName2Serializer.get(klassName);
        return dVar != null ? dVar : super.c(decoder, klassName);
    }

    @Override // vo0.b
    public q<T> d(uo0.f encoder, T value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        d<? extends T> dVarD = this.class2Serializer.get(o0.b(value.getClass()));
        if (dVarD == null) {
            dVarD = super.d(encoder, value);
        }
        if (dVarD != null) {
            return dVarD;
        }
        return null;
    }

    @Override // vo0.b
    public co0.d<T> e() {
        return this.baseClass;
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return (to0.f) this.descriptor.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(String serialName, co0.d<T> baseClass, co0.d<? extends T>[] subclasses, d<? extends T>[] subclassSerializers, Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        p013kotlin.jvm.internal.s.k(serialName, "serialName");
        p013kotlin.jvm.internal.s.k(baseClass, "baseClass");
        p013kotlin.jvm.internal.s.k(subclasses, "subclasses");
        p013kotlin.jvm.internal.s.k(subclassSerializers, "subclassSerializers");
        p013kotlin.jvm.internal.s.k(classAnnotations, "classAnnotations");
        this._annotations = p013kotlin.collections.n.h(classAnnotations);
    }
}
