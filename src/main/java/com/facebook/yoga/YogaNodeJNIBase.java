package com.facebook.yoga;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@fp.a
public abstract class YogaNodeJNIBase extends r implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private YogaNodeJNIBase f23982a;

    @fp.a
    private float[] arr;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f23983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<YogaNodeJNIBase> f23984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f23985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f23986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected long f23987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f23988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23989h;

    @fp.a
    private int mLayoutDirection;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23990a;

        static {
            int[] iArr = new int[j.values().length];
            f23990a = iArr;
            try {
                iArr[j.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23990a[j.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23990a[j.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23990a[j.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23990a[j.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23990a[j.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private YogaNodeJNIBase(long j11) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f23989h = true;
        if (j11 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f23987f = j11;
    }

    private void m0(r rVar) {
        Object objN0 = n0();
        if (objN0 instanceof r.a) {
            ((r.a) objN0).a(this, rVar);
        }
    }

    private static YogaValue p0(long j11) {
        return new YogaValue(Float.intBitsToFloat((int) j11), (int) (j11 >> 32));
    }

    @fp.a
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i11) {
        List<YogaNodeJNIBase> list = this.f23984c;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i11);
        this.f23984c.add(i11, yogaNodeJNIBase);
        yogaNodeJNIBase.f23982a = this;
        return yogaNodeJNIBase.f23987f;
    }

    @Override // com.facebook.yoga.r
    public void A(h hVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f23987f, hVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public void B(i iVar) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f23987f, iVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public void C(float f11) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public void D(float f11) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public void E() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f23987f);
    }

    @Override // com.facebook.yoga.r
    public void F(float f11) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public void G(l lVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f23987f, lVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public void H(float f11) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public void I(float f11) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public void J(m mVar, float f11) {
        YogaNative.jni_YGNodeStyleSetGapJNI(this.f23987f, mVar.intValue(), f11);
    }

    @Override // com.facebook.yoga.r
    public void K(m mVar, float f11) {
        YogaNative.jni_YGNodeStyleSetGapPercentJNI(this.f23987f, mVar.intValue(), f11);
    }

    @Override // com.facebook.yoga.r
    public void L(float f11) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public void M() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f23987f);
    }

    @Override // com.facebook.yoga.r
    public void N(float f11) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public void O(n nVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f23987f, nVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public void P(j jVar, float f11) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f23987f, jVar.intValue(), f11);
    }

    @Override // com.facebook.yoga.r
    public void Q(j jVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f23987f, jVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public void R(j jVar, float f11) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f23987f, jVar.intValue(), f11);
    }

    @Override // com.facebook.yoga.r
    public void S(float f11) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public void U(float f11) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public void V(float f11) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public void W(float f11) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public void X(o oVar) {
        this.f23985d = oVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f23987f, oVar != null);
    }

    @Override // com.facebook.yoga.r
    public void Y(float f11) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public void Z(float f11) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public void a(r rVar, int i11) {
        if (rVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) rVar;
            if (yogaNodeJNIBase.f23982a != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.f23984c == null) {
                this.f23984c = new ArrayList(4);
            }
            this.f23984c.add(i11, yogaNodeJNIBase);
            yogaNodeJNIBase.f23982a = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.f23987f, yogaNodeJNIBase.f23987f, i11);
        }
    }

    @Override // com.facebook.yoga.r
    public void a0(float f11) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public void b(float f11, float f12) {
        m0(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i11);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f23984c;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.m0(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i12 = 0; i12 < yogaNodeJNIBaseArr.length; i12++) {
            jArr[i12] = yogaNodeJNIBaseArr[i12].f23987f;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f23987f, f11, f12, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.r
    public void b0(float f11) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f23987f, f11);
    }

    @fp.a
    public final float baseline(float f11, float f12) {
        return this.f23986e.a(this, f11, f12);
    }

    @Override // com.facebook.yoga.r
    public void c() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f23987f);
    }

    @Override // com.facebook.yoga.r
    public void c0(u uVar) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f23987f, uVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public float d() {
        return YogaNative.jni_YGNodeStyleGetFlexJNI(this.f23987f);
    }

    @Override // com.facebook.yoga.r
    public void d0(j jVar, float f11) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f23987f, jVar.intValue(), f11);
    }

    @Override // com.facebook.yoga.r
    public YogaValue e() {
        return p0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f23987f));
    }

    @Override // com.facebook.yoga.r
    public void e0(j jVar, float f11) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f23987f, jVar.intValue(), f11);
    }

    @Override // com.facebook.yoga.r
    public h f() {
        float[] fArr = this.arr;
        return h.fromInt(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.r
    public void f0(j jVar, float f11) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f23987f, jVar.intValue(), f11);
    }

    @Override // com.facebook.yoga.r
    public float g() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[2] : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.facebook.yoga.r
    public void g0(j jVar, float f11) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f23987f, jVar.intValue(), f11);
    }

    @Override // com.facebook.yoga.r
    public float h(j jVar) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f11 = fArr[0];
        if ((((int) f11) & 2) != 2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i11 = (((int) f11) & 1) != 1 ? 4 : 0;
        int i12 = 10 - i11;
        switch (a.f23990a[jVar.ordinal()]) {
            case 1:
                return this.arr[i12];
            case 2:
                return this.arr[11 - i11];
            case 3:
                return this.arr[12 - i11];
            case 4:
                return this.arr[13 - i11];
            case 5:
                return f() == h.RTL ? this.arr[12 - i11] : this.arr[i12];
            case 6:
                return f() == h.RTL ? this.arr[i12] : this.arr[12 - i11];
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.r
    public void h0(v vVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f23987f, vVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public float i() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[1] : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.facebook.yoga.r
    public void i0(float f11) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public float j() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[3] : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.facebook.yoga.r
    public void j0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f23987f);
    }

    @Override // com.facebook.yoga.r
    public float k() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[4] : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.facebook.yoga.r
    public void k0(float f11) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public YogaValue l(j jVar) {
        return p0(YogaNative.jni_YGNodeStyleGetPaddingJNI(this.f23987f, jVar.intValue()));
    }

    @Override // com.facebook.yoga.r
    public void l0(x xVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f23987f, xVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public YogaValue m() {
        return p0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f23987f));
    }

    @fp.a
    public final long measure(float f11, int i11, float f12, int i12) {
        if (p()) {
            return this.f23985d.a(this, f11, p.fromInt(i11), f12, p.fromInt(i12));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.r
    public boolean n() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return (((int) fArr[0]) & 16) == 16;
        }
        return this.f23989h;
    }

    public Object n0() {
        return this.f23988g;
    }

    @Override // com.facebook.yoga.r
    public boolean o() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f23987f);
    }

    @Override // com.facebook.yoga.r
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase r(int i11) {
        List<YogaNodeJNIBase> list = this.f23984c;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i11);
        yogaNodeJNIBaseRemove.f23982a = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.f23987f, yogaNodeJNIBaseRemove.f23987f);
        return yogaNodeJNIBaseRemove;
    }

    @Override // com.facebook.yoga.r
    public boolean p() {
        return this.f23985d != null;
    }

    @Override // com.facebook.yoga.r
    public void q() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f23989h = false;
    }

    @Override // com.facebook.yoga.r
    public void s() {
        this.f23985d = null;
        this.f23986e = null;
        this.f23988g = null;
        this.arr = null;
        this.f23989h = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f23987f);
    }

    @Override // com.facebook.yoga.r
    public void t(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f23987f, aVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public void u(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f23987f, aVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public void v(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f23987f, aVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public void w(float f11) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f23987f, f11);
    }

    @Override // com.facebook.yoga.r
    public void x(b bVar) {
        this.f23986e = bVar;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.f23987f, bVar != null);
    }

    @Override // com.facebook.yoga.r
    public void y(j jVar, float f11) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f23987f, jVar.intValue(), f11);
    }

    @Override // com.facebook.yoga.r
    public void z(Object obj) {
        this.f23988g = obj;
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    YogaNodeJNIBase(c cVar) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((e) cVar).f23997a));
        this.f23983b = cVar;
    }
}
