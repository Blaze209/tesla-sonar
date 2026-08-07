package wf;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d extends g<Float> {
    public d(List<ig.a<Float>> list) {
        super(list);
    }

    public float r() {
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
    float s(ig.a<Float> aVar, float f11) {
        float f12;
        if (aVar.f77657b == null || aVar.f77658c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ig.c<A> cVar = this.f121721e;
        if (cVar != 0) {
            f12 = f11;
            Float f13 = (Float) cVar.b(aVar.f77662g, aVar.f77663h.floatValue(), aVar.f77657b, aVar.f77658c, f12, e(), f());
            if (f13 != null) {
                return f13.floatValue();
            }
        } else {
            f12 = f11;
        }
        return hg.j.i(aVar.g(), aVar.d(), f12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // wf.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Float i(ig.a<Float> aVar, float f11) {
        return Float.valueOf(s(aVar, f11));
    }
}
