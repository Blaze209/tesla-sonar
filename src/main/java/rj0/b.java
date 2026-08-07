package rj0;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p019p1.b0;
import p019p1.z;
import p020r2.n3;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;
import w1.a0;
import w1.k;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J-\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u001a\u0010!\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b \u0010\fR+\u0010\b\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010&R\u001d\u0010*\u001a\u0004\u0018\u00010\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0014\u0010,\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\fR\u0014\u0010.\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\fR\u0014\u00100\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\fR\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0005018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lrj0/b;", "Lrj0/h;", "Lw1/a0;", "lazyListState", "Lkotlin/Function2;", "Lrj0/i;", "", "snapOffsetForItem", "endContentPadding", "<init>", "(Lw1/a0;Lwn0/p;I)V", "j", "()I", "", "k", "()F", "index", DateTokenConverter.CONVERTER_KEY, "(I)I", "", "b", "()Z", "a", "velocity", "Lp1/z;", "decayAnimationSpec", "maximumFlingDistance", "c", "(FLp1/z;F)I", "Lw1/a0;", "Lwn0/p;", "I", "g", "startScrollOffset", "<set-?>", "Lr2/p1;", "l", "o", "(I)V", "e", "Lr2/y3;", "()Lrj0/i;", "currentItem", "m", "itemCount", "f", "endScrollOffset", "h", "totalItemsCount", "Lho0/i;", "n", "()Lho0/i;", "visibleItems", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a0 lazyListState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<h, SnapperLayoutItemInfo, Integer> snapOffsetForItem;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int startScrollOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p1 endContentPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y3 currentItem;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lrj0/i;", "b", "()Lrj0/i;"}, k = 3, mv = {1, 6, 0})
    static final class a extends u implements wn0.a<SnapperLayoutItemInfo> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SnapperLayoutItemInfo invoke() {
            ho0.i<SnapperLayoutItemInfo> iVarN = b.this.n();
            b bVar = b.this;
            SnapperLayoutItemInfo snapperLayoutItemInfo = null;
            for (SnapperLayoutItemInfo snapperLayoutItemInfo2 : iVarN) {
                SnapperLayoutItemInfo snapperLayoutItemInfo3 = snapperLayoutItemInfo2;
                if (snapperLayoutItemInfo3.b() <= ((Number) bVar.snapOffsetForItem.invoke(bVar, snapperLayoutItemInfo3)).intValue()) {
                    snapperLayoutItemInfo = snapperLayoutItemInfo2;
                }
            }
            return snapperLayoutItemInfo;
        }
    }

    /* JADX INFO: renamed from: rj0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* synthetic */ class C2305b extends p013kotlin.jvm.internal.p implements l<k, c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2305b f108455a = new C2305b();

        C2305b() {
            super(1, c.class, "<init>", "<init>(Landroidx/compose/foundation/lazy/LazyListItemInfo;)V", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(k p11) {
            s.k(p11, "p0");
            return new c(p11);
        }
    }

    public /* synthetic */ b(a0 a0Var, p pVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(a0Var, pVar, (i12 & 4) != 0 ? 0 : i11);
    }

    private final int j() {
        w1.p pVarX = this.lazyListState.x();
        if (pVarX.j().size() < 2) {
            return 0;
        }
        k kVar = pVarX.j().get(0);
        return pVarX.j().get(1).getOffset() - (kVar.getSize() + kVar.getOffset());
    }

    private final float k() {
        Object next;
        w1.p pVarX = this.lazyListState.x();
        if (pVarX.j().isEmpty()) {
            return -1.0f;
        }
        Iterator<T> it = pVarX.j().iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int offset = ((k) next).getOffset();
                do {
                    Object next3 = it.next();
                    int offset2 = ((k) next3).getOffset();
                    if (offset > offset2) {
                        next = next3;
                        offset = offset2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        k kVar = (k) next;
        if (kVar == null) {
            return -1.0f;
        }
        Iterator<T> it2 = pVarX.j().iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                k kVar2 = (k) next2;
                int offset3 = kVar2.getOffset() + kVar2.getSize();
                do {
                    Object next4 = it2.next();
                    k kVar3 = (k) next4;
                    int offset4 = kVar3.getOffset() + kVar3.getSize();
                    if (offset3 < offset4) {
                        next2 = next4;
                        offset3 = offset4;
                    }
                } while (it2.hasNext());
            }
        }
        k kVar4 = (k) next2;
        if (kVar4 == null) {
            return -1.0f;
        }
        int iMax = Math.max(kVar.getOffset() + kVar.getSize(), kVar4.getOffset() + kVar4.getSize()) - Math.min(kVar.getOffset(), kVar4.getOffset());
        if (iMax == 0) {
            return -1.0f;
        }
        return (iMax + j()) / pVarX.j().size();
    }

    private final int m() {
        return this.lazyListState.x().getTotalItemsCount();
    }

    @Override // rj0.h
    public boolean a() {
        k kVar = (k) v.C0(this.lazyListState.x().j());
        if (kVar == null) {
            return false;
        }
        return kVar.getIndex() < m() - 1 || kVar.getOffset() + kVar.getSize() > f();
    }

    @Override // rj0.h
    public boolean b() {
        k kVar = (k) v.q0(this.lazyListState.x().j());
        if (kVar == null) {
            return false;
        }
        return kVar.getIndex() > 0 || kVar.getOffset() < getStartScrollOffset();
    }

    @Override // rj0.h
    public int c(float velocity, z<Float> decayAnimationSpec, float maximumFlingDistance) {
        s.k(decayAnimationSpec, "decayAnimationSpec");
        SnapperLayoutItemInfo snapperLayoutItemInfoE = e();
        if (snapperLayoutItemInfoE == null) {
            return -1;
        }
        float fK = k();
        if (fK <= BitmapDescriptorFactory.HUE_RED) {
            return snapperLayoutItemInfoE.a();
        }
        int iD = d(snapperLayoutItemInfoE.a());
        int iD2 = d(snapperLayoutItemInfoE.a() + 1);
        if (Math.abs(velocity) < 0.5f) {
            return n.n(Math.abs(iD) < Math.abs(iD2) ? snapperLayoutItemInfoE.a() : snapperLayoutItemInfoE.a() + 1, 0, m() - 1);
        }
        float fM = n.m(b0.a(decayAnimationSpec, BitmapDescriptorFactory.HUE_RED, velocity), -maximumFlingDistance, maximumFlingDistance);
        double d11 = fK;
        int iN = n.n(snapperLayoutItemInfoE.a() + yn0.a.c((((double) (velocity < BitmapDescriptorFactory.HUE_RED ? n.i(fM + iD2, BitmapDescriptorFactory.HUE_RED) : n.e(fM + iD, BitmapDescriptorFactory.HUE_RED))) / d11) - (((double) iD) / d11)), 0, m() - 1);
        j jVar = j.f108505a;
        return iN;
    }

    @Override // rj0.h
    public int d(int index) {
        SnapperLayoutItemInfo next;
        int iD;
        int iIntValue;
        Iterator<SnapperLayoutItemInfo> it = n().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.a() != index);
        SnapperLayoutItemInfo snapperLayoutItemInfo = next;
        if (snapperLayoutItemInfo != null) {
            iD = snapperLayoutItemInfo.b();
            iIntValue = this.snapOffsetForItem.invoke(this, snapperLayoutItemInfo).intValue();
        } else {
            SnapperLayoutItemInfo snapperLayoutItemInfoE = e();
            if (snapperLayoutItemInfoE == null) {
                return 0;
            }
            iD = yn0.a.d((index - snapperLayoutItemInfoE.a()) * k()) + snapperLayoutItemInfoE.b();
            iIntValue = this.snapOffsetForItem.invoke(this, snapperLayoutItemInfoE).intValue();
        }
        return iD - iIntValue;
    }

    @Override // rj0.h
    public SnapperLayoutItemInfo e() {
        return (SnapperLayoutItemInfo) this.currentItem.getValue();
    }

    @Override // rj0.h
    public int f() {
        return this.lazyListState.x().getViewportEndOffset() - l();
    }

    @Override // rj0.h
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getStartScrollOffset() {
        return this.startScrollOffset;
    }

    @Override // rj0.h
    public int h() {
        return this.lazyListState.x().getTotalItemsCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int l() {
        return ((Number) this.endContentPadding.getValue()).intValue();
    }

    public ho0.i<SnapperLayoutItemInfo> n() {
        return ho0.l.U(v.e0(this.lazyListState.x().j()), C2305b.f108455a);
    }

    public final void o(int i11) {
        this.endContentPadding.setValue(Integer.valueOf(i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(a0 lazyListState, p<? super h, ? super SnapperLayoutItemInfo, Integer> snapOffsetForItem, int i11) {
        s.k(lazyListState, "lazyListState");
        s.k(snapOffsetForItem, "snapOffsetForItem");
        this.lazyListState = lazyListState;
        this.snapOffsetForItem = snapOffsetForItem;
        this.endContentPadding = s3.d(Integer.valueOf(i11), null, 2, null);
        this.currentItem = n3.e(new a());
    }
}
