package wf;

import android.graphics.Path;
import java.util.List;
import vf.s;

/* JADX INFO: loaded from: classes3.dex */
public class m extends a<cg.o, Path> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final cg.o f121754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f121755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Path f121756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Path f121757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<s> f121758m;

    public m(List<ig.a<cg.o>> list) {
        super(list);
        this.f121754i = new cg.o();
        this.f121755j = new Path();
    }

    @Override // wf.a
    protected boolean p() {
        List<s> list = this.f121758m;
        return (list == null || list.isEmpty()) ? false : true;
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
    public Path i(ig.a<cg.o> aVar, float f11) {
        cg.o oVar = aVar.f77657b;
        cg.o oVar2 = aVar.f77658c;
        this.f121754i.c(oVar, oVar2 == null ? oVar : oVar2, f11);
        cg.o oVarA = this.f121754i;
        List<s> list = this.f121758m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVarA = this.f121758m.get(size).a(oVarA);
            }
        }
        hg.j.h(oVarA, this.f121755j);
        if (this.f121721e == null) {
            return this.f121755j;
        }
        if (this.f121756k == null) {
            this.f121756k = new Path();
            this.f121757l = new Path();
        }
        hg.j.h(oVar, this.f121756k);
        if (oVar2 != null) {
            hg.j.h(oVar2, this.f121757l);
        }
        ig.c<A> cVar = this.f121721e;
        float f12 = aVar.f77662g;
        float fFloatValue = aVar.f77663h.floatValue();
        Path path = this.f121756k;
        return (Path) cVar.b(f12, fFloatValue, path, oVar2 == null ? path : this.f121757l, f11, e(), f());
    }

    public void s(List<s> list) {
        this.f121758m = list;
    }
}
