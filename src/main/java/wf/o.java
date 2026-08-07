package wf;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o extends g<ag.b> {

    class a extends ig.c<ag.b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ig.b f121765d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ig.c f121766e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ag.b f121767f;

        a(ig.b bVar, ig.c cVar, ag.b bVar2) {
            this.f121765d = bVar;
            this.f121766e = cVar;
            this.f121767f = bVar2;
        }

        @Override // ig.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ag.b a(ig.b<ag.b> bVar) {
            this.f121765d.h(bVar.f(), bVar.a(), bVar.g().f1000a, bVar.b().f1000a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f121766e.a(this.f121765d);
            ag.b bVarB = bVar.c() == 1.0f ? bVar.b() : bVar.g();
            this.f121767f.a(str, bVarB.f1001b, bVarB.f1002c, bVarB.f1003d, bVarB.f1004e, bVarB.f1005f, bVarB.f1006g, bVarB.f1007h, bVarB.f1008i, bVarB.f1009j, bVarB.f1010k, bVarB.f1011l, bVarB.f1012m);
            return this.f121767f;
        }
    }

    public o(List<ig.a<ag.b>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
    public ag.b i(ig.a<ag.b> aVar, float f11) {
        ag.b bVar;
        ig.c<A> cVar = this.f121721e;
        if (cVar == 0) {
            return (f11 != 1.0f || (bVar = aVar.f77658c) == null) ? aVar.f77657b : bVar;
        }
        float f12 = aVar.f77662g;
        Float f13 = aVar.f77663h;
        float fFloatValue = f13 == null ? Float.MAX_VALUE : f13.floatValue();
        ag.b bVar2 = aVar.f77657b;
        ag.b bVar3 = bVar2;
        ag.b bVar4 = aVar.f77658c;
        return (ag.b) cVar.b(f12, fFloatValue, bVar3, bVar4 == null ? bVar2 : bVar4, f11, d(), f());
    }

    public void s(ig.c<String> cVar) {
        super.o(new a(new ig.b(), cVar, new ag.b()));
    }
}
