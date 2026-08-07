package la;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p011ja.b0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import ro0.d;
import ro0.r;
import wn0.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00050\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001ac\u0010\u0010\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\t2\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00050\u00032&\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "T", PlaceTypes.ROUTE, "", "", "Lja/b0;", "typeMap", "c", "(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;", "Lro0/d;", "", "b", "(Lro0/d;)I", "Lkotlin/Function3;", "Ljn0/h0;", "operation", "a", "(Lro0/d;Ljava/util/Map;Lwn0/q;)V", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "T", "", "index", "", "argName", "Lja/b0;", "navType", "Ljn0/h0;", "a", "(ILjava/lang/String;Lja/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements q<Integer, String, b0<Object>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<String, List<String>> f89738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ la.a<? extends T> f89739d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Map<String, ? extends List<String>> map, la.a<? extends T> aVar) {
            super(3);
            this.f89738c = map;
            this.f89739d = aVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(int i11, String argName, b0<Object> navType) {
            s.k(argName, "argName");
            s.k(navType, "navType");
            List<String> list = this.f89738c.get(argName);
            s.h(list);
            this.f89739d.c(i11, argName, navType, list);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(Integer num, String str, b0<Object> b0Var) {
            a(num.intValue(), str, b0Var);
            return h0.f84049a;
        }
    }

    private static final <T> void a(d<T> dVar, Map<String, ? extends b0<Object>> map, q<? super Integer, ? super String, ? super b0<Object>, h0> qVar) {
        int iE = dVar.getDescriptor().getElementsCount();
        for (int i11 = 0; i11 < iE; i11++) {
            String strF = dVar.getDescriptor().f(i11);
            b0<Object> b0Var = map.get(strF);
            if (b0Var == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + strF + ']').toString());
            }
            qVar.invoke(Integer.valueOf(i11), strF, b0Var);
        }
    }

    public static final <T> int b(d<T> dVar) {
        s.k(dVar, "<this>");
        int iHashCode = dVar.getDescriptor().getSerialName().hashCode();
        int iE = dVar.getDescriptor().getElementsCount();
        for (int i11 = 0; i11 < iE; i11++) {
            iHashCode = (iHashCode * 31) + dVar.getDescriptor().f(i11).hashCode();
        }
        return iHashCode;
    }

    public static final <T> String c(T route, Map<String, ? extends b0<Object>> typeMap) {
        s.k(route, "route");
        s.k(typeMap, "typeMap");
        d dVarA = r.a(o0.b(route.getClass()));
        Map<String, List<String>> mapK = new b(dVarA, typeMap).K(route);
        la.a aVar = new la.a(dVarA);
        a(dVarA, typeMap, new a(mapK, aVar));
        return aVar.d();
    }
}
