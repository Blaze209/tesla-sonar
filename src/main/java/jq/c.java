package jq;

import bo0.n;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p019p1.z;
import p020r2.o;
import p021s1.m;
import wn0.l;
import wn0.q;

/* JADX INFO: loaded from: classes4.dex */
@jn0.e
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jd\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R,\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0017\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019R8\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Ljq/c;", "", "<init>", "()V", "Ljq/g;", "state", "Lp1/z;", "", "decayAnimationSpec", "Lp1/i;", "snapAnimationSpec", "Lw4/h;", "endContentPadding", "Lkotlin/Function3;", "Lrj0/h;", "", "snapIndex", "Ls1/m;", "b", "(Ljq/g;Lp1/z;Lp1/i;FLwn0/q;Lr2/l;II)Ls1/m;", "a", "(Ljq/g;Lp1/z;Lp1/i;FLr2/l;II)Ls1/m;", "Lkotlin/Function1;", "Lwn0/l;", "getSinglePageFlingDistance", "()Lwn0/l;", "getSinglePageFlingDistance$annotations", "singlePageFlingDistance", "c", "Lwn0/q;", "getSinglePageSnapIndex", "()Lwn0/q;", "getSinglePageSnapIndex$annotations", "singlePageSnapIndex", "pager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f84186a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final l<rj0.h, Float> singlePageFlingDistance = a.f84189c;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final q<rj0.h, Integer, Integer, Integer> singlePageSnapIndex = b.f84190c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrj0/h;", "layoutInfo", "", "a", "(Lrj0/h;)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<rj0.h, Float> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f84189c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(rj0.h layoutInfo) {
            s.k(layoutInfo, "layoutInfo");
            return Float.valueOf(layoutInfo.f() - layoutInfo.getStartScrollOffset());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrj0/h;", "layoutInfo", "", "startIndex", "targetIndex", "a", "(Lrj0/h;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements q<rj0.h, Integer, Integer, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f84190c = new b();

        b() {
            super(3);
        }

        public final Integer a(rj0.h layoutInfo, int i11, int i12) {
            s.k(layoutInfo, "layoutInfo");
            return Integer.valueOf(n.n(n.n(i12, i11 - 1, i11 + 1), 0, layoutInfo.h() - 1));
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Integer invoke(rj0.h hVar, Integer num, Integer num2) {
            return a(hVar, num.intValue(), num2.intValue());
        }
    }

    private c() {
    }

    @jn0.e
    public final m a(PagerState state, z<Float> zVar, p019p1.i<Float> iVar, float f11, p020r2.l lVar, int i11, int i12) {
        s.k(state, "state");
        lVar.H(132228799);
        z<Float> zVarB = (i12 & 2) != 0 ? p015o1.z.b(lVar, 0) : zVar;
        p019p1.i<Float> iVarB = (i12 & 4) != 0 ? rj0.f.f108498a.b() : iVar;
        float fG = (i12 & 8) != 0 ? w4.h.g(0) : f11;
        if (o.J()) {
            o.S(132228799, i11, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:220)");
        }
        m mVarB = b(state, zVarB, iVarB, fG, singlePageSnapIndex, lVar, (i11 & 14) | 576 | (i11 & 7168) | ((i11 << 3) & 458752), 0);
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return mVarB;
    }

    @jn0.e
    public final m b(PagerState state, z<Float> zVar, p019p1.i<Float> iVar, float f11, q<? super rj0.h, ? super Integer, ? super Integer, Integer> snapIndex, p020r2.l lVar, int i11, int i12) {
        s.k(state, "state");
        s.k(snapIndex, "snapIndex");
        lVar.H(-776119664);
        if ((i12 & 2) != 0) {
            zVar = p015o1.z.b(lVar, 0);
        }
        if ((i12 & 4) != 0) {
            iVar = rj0.f.f108498a.b();
        }
        p019p1.i<Float> iVar2 = iVar;
        if ((i12 & 8) != 0) {
            f11 = w4.h.g(0);
        }
        float f12 = f11;
        if (o.J()) {
            o.S(-776119664, i11, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:181)");
        }
        rj0.e eVarB = rj0.a.b(state.getLazyListState(), rj0.d.f108457a.b(), f12, zVar, iVar2, snapIndex, lVar, ((i11 >> 3) & 896) | 36864 | (458752 & (i11 << 3)), 0);
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return eVarB;
    }
}
