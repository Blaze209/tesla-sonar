package do0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import co0.f;
import co0.g;
import co0.h;
import co0.l;
import co0.n;
import co0.o;
import co0.q;
import fo0.a0;
import fo0.h1;
import fo0.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.e0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\u001a#\u0010\u0003\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0004\u001a#\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\"6\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\",\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014\">\u0010\u001a\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00170\u0011\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0018\u0010\u0014\">\u0010\u001d\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00170\u0011\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001b\u0010\u0014\"\u001c\u0010!\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u001c\u0010#\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 \",\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000$*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010\u000f\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lco0/d;", "base", "", "k", "(Lco0/d;Lco0/d;)Z", "derived", "n", "", "T", "c", "(Lco0/d;)Ljava/lang/Object;", "Lco0/h;", "f", "(Lco0/d;)Lco0/h;", "getPrimaryConstructor$annotations", "(Lco0/d;)V", "primaryConstructor", "", "Lco0/n;", "g", "(Lco0/d;)Ljava/util/Collection;", "getStaticProperties$annotations", "staticProperties", "Lco0/o;", "e", "getMemberProperties$annotations", "memberProperties", DateTokenConverter.CONVERTER_KEY, "getDeclaredMemberProperties$annotations", "declaredMemberProperties", "Lfo0/a0;", IntegerTokenConverter.CONVERTER_KEY, "(Lfo0/a0;)Z", "isExtension", "j", "isNotExtension", "", "h", "(Lco0/d;)Ljava/util/List;", "getSuperclasses$annotations", "superclasses", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final <T> T c(co0.d<T> dVar) {
        s.k(dVar, "<this>");
        Iterator<T> it = dVar.getConstructors().iterator();
        T t11 = null;
        boolean z11 = false;
        T t12 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z11) {
                    break;
                }
                t11 = t12;
                break;
            }
            T next = it.next();
            List<l> parameters = ((h) next).getParameters();
            if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                Iterator<T> it2 = parameters.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((l) it2.next()).e()) {
                        }
                    }
                }
            }
            if (z11) {
                break;
            }
            z11 = true;
            t12 = next;
        }
        h hVar = (h) t11;
        if (hVar != null) {
            return (T) hVar.callBy(v0.i());
        }
        throw new IllegalArgumentException("Class should have a single no-arg constructor: " + dVar);
    }

    public static final <T> Collection<o<T, ?>> d(co0.d<T> dVar) {
        s.k(dVar, "<this>");
        Collection<a0<?>> collectionL = ((w0) dVar).R().getValue().L();
        ArrayList arrayList = new ArrayList();
        for (T t11 : collectionL) {
            a0 a0Var = (a0) t11;
            if (j(a0Var) && (a0Var instanceof o)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static final <T> Collection<o<T, ?>> e(co0.d<T> dVar) {
        s.k(dVar, "<this>");
        Collection<a0<?>> collectionH = ((w0) dVar).R().getValue().H();
        ArrayList arrayList = new ArrayList();
        for (T t11 : collectionH) {
            a0 a0Var = (a0) t11;
            if (j(a0Var) && (a0Var instanceof o)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static final <T> h<T> f(co0.d<T> dVar) {
        T next;
        s.k(dVar, "<this>");
        Iterator<T> it = ((w0) dVar).getConstructors().iterator();
        while (it.hasNext()) {
            next = it.next();
            h hVar = (h) next;
            s.i(hVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            FunctionDescriptor functionDescriptorF0 = ((h1) hVar).U();
            s.i(functionDescriptorF0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
            if (((ConstructorDescriptor) functionDescriptorF0).isPrimary()) {
                return (h) next;
            }
        }
        next = null;
        return (h) next;
    }

    public static final Collection<n<?>> g(co0.d<?> dVar) {
        s.k(dVar, "<this>");
        Collection<a0<?>> collectionI = ((w0.a) ((w0) dVar).R().getValue()).I();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionI) {
            a0 a0Var = (a0) obj;
            if (j(a0Var) && (a0Var instanceof n)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List<co0.d<?>> h(co0.d<?> dVar) {
        s.k(dVar, "<this>");
        List<q> supertypes = dVar.getSupertypes();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            f classifier = ((q) it.next()).getClassifier();
            co0.d dVar2 = classifier instanceof co0.d ? (co0.d) classifier : null;
            if (dVar2 != null) {
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }

    private static final boolean i(a0<?> a0Var) {
        return a0Var.U().getExtensionReceiverParameter() != null;
    }

    private static final boolean j(a0<?> a0Var) {
        return !i(a0Var);
    }

    public static final boolean k(co0.d<?> dVar, co0.d<?> base) {
        s.k(dVar, "<this>");
        s.k(base, "base");
        return s.f(dVar, base) || DFS.ifAny(v.e(dVar), new do0.a(new e0() { // from class: do0.c.a
            @Override // co0.o
            public Object get(Object obj) {
                return c.h((co0.d) obj);
            }

            @Override // p013kotlin.jvm.internal.f, co0.c
            public String getName() {
                return "superclasses";
            }

            @Override // p013kotlin.jvm.internal.f
            public g getOwner() {
                return o0.d(c.class, "kotlin-reflection");
            }

            @Override // p013kotlin.jvm.internal.f
            public String getSignature() {
                return "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;";
            }
        }), new b(base)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable l(o oVar, co0.d dVar) {
        return (Iterable) oVar.invoke(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean m(co0.d dVar, co0.d dVar2) {
        return Boolean.valueOf(s.f(dVar2, dVar));
    }

    public static final boolean n(co0.d<?> dVar, co0.d<?> derived) {
        s.k(dVar, "<this>");
        s.k(derived, "derived");
        return k(derived, dVar);
    }
}
