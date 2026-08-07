package w20;

import bo0.n;
import ch.qos.logback.core.CoreConstants;
import co0.d;
import co0.f;
import co0.k;
import co0.l;
import co0.o;
import co0.q;
import co0.r;
import com.squareup.moshi.g;
import com.squareup.moshi.h;
import com.squareup.moshi.u;
import com.squareup.moshi.y;
import com.squareup.moshi.z;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lw20/b;", "Lcom/squareup/moshi/h$e;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/u;", "moshi", "Lcom/squareup/moshi/h;", "create", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lcom/squareup/moshi/u;)Lcom/squareup/moshi/h;", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements h.e {
    /* JADX WARN: Code duplicated, block: B:103:0x0208  */
    @Override // com.squareup.moshi.h.e
    public h<?> create(Type type, Set<? extends Annotation> annotations, u moshi) throws NoSuchMethodException {
        Object next;
        String name;
        Type typeF;
        Object next2;
        s.k(type, "type");
        s.k(annotations, "annotations");
        s.k(moshi, "moshi");
        Object obj = null;
        if (!annotations.isEmpty()) {
            return null;
        }
        Class<?> clsA = z.a(type);
        if (clsA.isInterface() || clsA.isEnum() || !clsA.isAnnotationPresent(c.f120523a) || v20.c.j(clsA)) {
            return null;
        }
        try {
            h<?> hVarD = v20.c.d(moshi, type, clsA);
            if (hVarD != null) {
                return hVarD;
            }
        } catch (RuntimeException e11) {
            if (!(e11.getCause() instanceof ClassNotFoundException)) {
                throw e11;
            }
        }
        if (clsA.isLocalClass()) {
            throw new IllegalArgumentException(("Cannot serialize local class or object expression " + clsA.getName()).toString());
        }
        d dVarE = vn0.a.e(clsA);
        if (dVarE.isAbstract()) {
            throw new IllegalArgumentException(("Cannot serialize abstract class " + clsA.getName()).toString());
        }
        if (dVarE.isInner()) {
            throw new IllegalArgumentException(("Cannot serialize inner class " + clsA.getName()).toString());
        }
        if (dVarE.f() != null) {
            throw new IllegalArgumentException(("Cannot serialize object declaration " + clsA.getName()).toString());
        }
        if (dVarE.isSealed()) {
            throw new IllegalArgumentException(("Cannot reflectively serialize sealed class " + clsA.getName() + ". Please register an adapter.").toString());
        }
        co0.h hVarF = do0.c.f(dVarE);
        if (hVarF == null) {
            return null;
        }
        List<l> parameters = hVarF.getParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(parameters, 10)), 16));
        for (Object obj2 : parameters) {
            linkedHashMap.put(((l) obj2).getName(), obj2);
        }
        boolean z11 = true;
        eo0.a.b(hVarF, true);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (o oVar : do0.c.e(dVarE)) {
            l lVar = (l) linkedHashMap.get(oVar.getName());
            eo0.a.b(oVar, z11);
            Iterator<T> it = oVar.getAnnotations().iterator();
            do {
                if (!it.hasNext()) {
                    next = obj;
                    break;
                }
                next = it.next();
            } while (!(((Annotation) next) instanceof g));
            g gVar = (g) next;
            List listP1 = v.p1(oVar.getAnnotations());
            if (lVar != null) {
                v.E(listP1, lVar.getAnnotations());
                if (gVar == null) {
                    Iterator<T> it2 = lVar.getAnnotations().iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!(((Annotation) next2) instanceof g));
                    gVar = (g) next2;
                }
            }
            Field fieldB = eo0.c.b(oVar);
            if (Modifier.isTransient(fieldB != null ? fieldB.getModifiers() : 0)) {
                if (lVar != null && !lVar.e()) {
                    throw new IllegalArgumentException(("No default value for transient constructor " + lVar).toString());
                }
            } else if (gVar == null || gVar.ignore() != z11) {
                if (lVar != null && !s.f(lVar.getType(), oVar.getReturnType())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(CoreConstants.SINGLE_QUOTE_CHAR);
                    sb2.append(oVar.getName());
                    sb2.append("' has a constructor parameter of type ");
                    s.h(lVar);
                    sb2.append(lVar.getType());
                    sb2.append(" but a property of type ");
                    sb2.append(oVar.getReturnType());
                    sb2.append(CoreConstants.DOT);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                if ((oVar instanceof k) || lVar != null) {
                    if (gVar == null || (name = gVar.name()) == null) {
                        name = oVar.getName();
                    } else {
                        if (s.f(name, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
                            name = null;
                        }
                        if (name == null) {
                            name = oVar.getName();
                        }
                    }
                    String str = name;
                    f classifier = oVar.getReturnType().getClassifier();
                    if (classifier instanceof d) {
                        d dVar = (d) classifier;
                        if (dVar.isValue()) {
                            typeF = vn0.a.b(dVar);
                            if (!oVar.getReturnType().getArguments().isEmpty()) {
                                List<co0.s> arguments = oVar.getReturnType().getArguments();
                                ArrayList arrayList = new ArrayList();
                                Iterator<T> it3 = arguments.iterator();
                                while (it3.hasNext()) {
                                    q qVarC = ((co0.s) it3.next()).c();
                                    Type typeF2 = qVarC != null ? eo0.c.f(qVarC) : null;
                                    if (typeF2 != null) {
                                        arrayList.add(typeF2);
                                    }
                                }
                                Type[] typeArr = (Type[]) arrayList.toArray(new Type[0]);
                                typeF = y.j(typeF, (Type[]) Arrays.copyOf(typeArr, typeArr.length));
                            }
                        } else {
                            typeF = eo0.c.f(oVar.getReturnType());
                        }
                    } else {
                        if (!(classifier instanceof r)) {
                            throw new IllegalStateException("Not possible!");
                        }
                        typeF = eo0.c.f(oVar.getReturnType());
                    }
                    h adapter = moshi.f(v20.c.q(type, clsA, typeF), v20.c.l((Annotation[]) listP1.toArray(new Annotation[0])), oVar.getName());
                    String name2 = oVar.getName();
                    s.j(adapter, "adapter");
                    s.i(oVar, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Any, kotlin.Any?>");
                    linkedHashMap2.put(name2, new KotlinJsonAdapter.Binding(str, adapter, oVar, lVar, lVar != null ? lVar.getIndex() : -1));
                    obj = null;
                    z11 = true;
                }
            } else if (lVar != null && !lVar.e()) {
                throw new IllegalArgumentException(("No default value for ignored constructor " + lVar).toString());
            }
            obj = null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (l lVar2 : hVarF.getParameters()) {
            KotlinJsonAdapter.Binding binding = (KotlinJsonAdapter.Binding) u0.d(linkedHashMap2).remove(lVar2.getName());
            if (binding == null && !lVar2.e()) {
                throw new IllegalArgumentException(("No property for required constructor " + lVar2).toString());
            }
            arrayList2.add(binding);
        }
        int size = arrayList2.size();
        Iterator it4 = linkedHashMap2.entrySet().iterator();
        while (true) {
            int i11 = size;
            if (!it4.hasNext()) {
                break;
            }
            size = i11 + 1;
            arrayList2.add(KotlinJsonAdapter.Binding.b((KotlinJsonAdapter.Binding) ((Map.Entry) it4.next()).getValue(), null, null, null, null, i11, 15, null));
        }
        List listL0 = v.l0(arrayList2);
        List list = listL0;
        ArrayList arrayList3 = new ArrayList(v.y(list, 10));
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            arrayList3.add(((KotlinJsonAdapter.Binding) it5.next()).getJsonName());
        }
        String[] strArr = (String[]) arrayList3.toArray(new String[0]);
        com.squareup.moshi.k.b options = com.squareup.moshi.k.b.a((String[]) Arrays.copyOf(strArr, strArr.length));
        s.j(options, "options");
        return new KotlinJsonAdapter(hVarF, arrayList2, listL0, options).nullSafe();
    }
}
