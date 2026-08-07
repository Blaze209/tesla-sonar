package wf;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f extends g<Integer> {
    public f(List<ig.a<Integer>> list) {
        super(list);
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
    int r(ig.a<Integer> aVar, float f11) {
        float f12;
        if (aVar.f77657b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iH = aVar.f77658c == null ? aVar.h() : aVar.e();
        ig.c<A> cVar = this.f121721e;
        if (cVar != 0) {
            f12 = f11;
            Integer num = (Integer) cVar.b(aVar.f77662g, aVar.f77663h.floatValue(), aVar.f77657b, Integer.valueOf(iH), f12, e(), f());
            if (num != null) {
                return num.intValue();
            }
        } else {
            f12 = f11;
        }
        return hg.j.j(aVar.h(), iH, f12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // wf.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(ig.a<Integer> aVar, float f11) {
        return Integer.valueOf(r(aVar, f11));
    }
}
