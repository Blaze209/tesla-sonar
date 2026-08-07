package wf;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class j extends g<PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PointF f121747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float[] f121748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float[] f121749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PathMeasure f121750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private i f121751m;

    public j(List<? extends ig.a<PointF>> list) {
        super(list);
        this.f121747i = new PointF();
        this.f121748j = new float[2];
        this.f121749k = new float[2];
        this.f121750l = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public PointF i(ig.a<PointF> aVar, float f11) {
        float f12;
        i iVar = (i) aVar;
        Path pathK = iVar.k();
        ig.c<A> cVar = this.f121721e;
        if (cVar == 0 || aVar.f77663h == null) {
            f12 = f11;
        } else {
            f12 = f11;
            PointF pointF = (PointF) cVar.b(iVar.f77662g, iVar.f77663h.floatValue(), (PointF) iVar.f77657b, (PointF) iVar.f77658c, e(), f12, f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (pathK == null) {
            return aVar.f77657b;
        }
        if (this.f121751m != iVar) {
            this.f121750l.setPath(pathK, false);
            this.f121751m = iVar;
        }
        float length = this.f121750l.getLength();
        float f13 = f12 * length;
        this.f121750l.getPosTan(f13, this.f121748j, this.f121749k);
        PointF pointF2 = this.f121747i;
        float[] fArr = this.f121748j;
        pointF2.set(fArr[0], fArr[1]);
        if (f13 < BitmapDescriptorFactory.HUE_RED) {
            PointF pointF3 = this.f121747i;
            float[] fArr2 = this.f121749k;
            pointF3.offset(fArr2[0] * f13, fArr2[1] * f13);
        } else if (f13 > length) {
            PointF pointF4 = this.f121747i;
            float[] fArr3 = this.f121749k;
            float f14 = f13 - length;
            pointF4.offset(fArr3[0] * f14, fArr3[1] * f14);
        }
        return this.f121747i;
    }
}
