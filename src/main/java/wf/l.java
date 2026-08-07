package wf;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class l extends g<ig.d> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ig.d f121753i;

    public l(List<ig.a<ig.d>> list) {
        super(list);
        this.f121753i = new ig.d();
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
    @Override // wf.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public ig.d i(ig.a<ig.d> aVar, float f11) {
        ig.d dVar;
        float f12;
        ig.d dVar2 = aVar.f77657b;
        if (dVar2 == null || (dVar = aVar.f77658c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ig.d dVar3 = dVar2;
        ig.d dVar4 = dVar;
        ig.c<A> cVar = this.f121721e;
        if (cVar != 0) {
            f12 = f11;
            ig.d dVar5 = (ig.d) cVar.b(aVar.f77662g, aVar.f77663h.floatValue(), dVar3, dVar4, f12, e(), f());
            if (dVar5 != null) {
                return dVar5;
            }
        } else {
            f12 = f11;
        }
        this.f121753i.d(hg.j.i(dVar3.b(), dVar4.b(), f12), hg.j.i(dVar3.c(), dVar4.c(), f12));
        return this.f121753i;
    }
}
