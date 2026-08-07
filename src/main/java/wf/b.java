package wf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b extends g<Integer> {
    public b(List<ig.a<Integer>> list) {
        super(list);
    }

    public int r() {
        return s(b(), d());
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
    public int s(ig.a<Integer> aVar, float f11) {
        float f12;
        Float f13;
        if (aVar.f77657b == null || aVar.f77658c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ig.c<A> cVar = this.f121721e;
        if (cVar == 0 || (f13 = aVar.f77663h) == null) {
            f12 = f11;
        } else {
            f12 = f11;
            Integer num = (Integer) cVar.b(aVar.f77662g, f13.floatValue(), aVar.f77657b, aVar.f77658c, f12, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        return hg.c.c(hg.j.b(f12, BitmapDescriptorFactory.HUE_RED, 1.0f), aVar.f77657b.intValue(), aVar.f77658c.intValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // wf.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer i(ig.a<Integer> aVar, float f11) {
        return Integer.valueOf(s(aVar, f11));
    }
}
