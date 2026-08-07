package jq;

import a3.j;
import a3.l;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.n3;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;
import p021s1.x;
import q1.h0;
import w1.a0;
import w1.k;
import wn0.p;

/* JADX INFO: renamed from: jq.g, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@jn0.e
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001&B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\bJ<\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR+\u0010%\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u0005R+\u0010)\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010\u0005R!\u0010-\u001a\u00020\u00028GX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010*\u0012\u0004\b,\u0010\b\u001a\u0004\b+\u0010#R\u001b\u00101\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u00100R/\u00107\u001a\u0004\u0018\u00010\u00022\b\u0010 \u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010!\u001a\u0004\b3\u00104\"\u0004\b5\u00106R?\u0010>\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u0001082\u0010\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u0001088@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010!\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010B\u001a\u0004\u0018\u00010?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0016\u0010D\u001a\u0004\u0018\u00010?8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010AR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u00028G@@X\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010#\"\u0004\bG\u0010\u0005R\u0014\u0010J\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010I¨\u0006L"}, d2 = {"Ljq/g;", "Ls1/x;", "", "currentPage", "<init>", "(I)V", "Ljn0/h0;", "w", "()V", "q", "Lq1/h0;", "scrollPriority", "Lkotlin/Function2;", "Ls1/u;", "Lkotlin/coroutines/Continuation;", "", "block", "b", "(Lq1/h0;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", DateTokenConverter.CONVERTER_KEY, "(F)F", "", "toString", "()Ljava/lang/String;", "Lw1/a0;", "a", "Lw1/a0;", "m", "()Lw1/a0;", "lazyListState", "<set-?>", "Lr2/p1;", "p", "()I", "v", "_currentPage", "c", "l", "u", "itemSpacing", "Lr2/y3;", "o", "getPageCount$annotations", "pageCount", "e", "k", "()F", "currentPageOffset", "f", "getAnimationTargetPage", "()Ljava/lang/Integer;", "r", "(Ljava/lang/Integer;)V", "animationTargetPage", "Lkotlin/Function0;", "g", "getFlingAnimationTarget$pager_release", "()Lwn0/a;", "t", "(Lwn0/a;)V", "flingAnimationTarget", "Lw1/k;", "j", "()Lw1/k;", "currentPageLayoutInfo", "n", "mostVisiblePageLayoutInfo", "value", IntegerTokenConverter.CONVERTER_KEY, "s", "", "()Z", "isScrollInProgress", "h", "pager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PagerState implements x {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final j<PagerState, ?> f84225i = a3.a.a(a.f84233c, b.f84234c);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a0 lazyListState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p1 _currentPage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p1 itemSpacing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y3 pageCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y3 currentPageOffset;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p1 animationTargetPage;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p1 flingAnimationTarget;

    /* JADX INFO: renamed from: jq.g$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La3/l;", "Ljq/g;", "it", "", "", "a", "(La3/l;Ljq/g;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<l, PagerState, List<? extends Object>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f84233c = new a();

        a() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(l listSaver, PagerState it) {
            s.k(listSaver, "$this$listSaver");
            s.k(it, "it");
            return v.e(Integer.valueOf(it.i()));
        }
    }

    /* JADX INFO: renamed from: jq.g$b */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Ljq/g;", "a", "(Ljava/util/List;)Ljq/g;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.l<List<? extends Object>, PagerState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f84234c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PagerState invoke(List<? extends Object> it) {
            s.k(it, "it");
            Object obj = it.get(0);
            s.i(obj, "null cannot be cast to non-null type kotlin.Int");
            return new PagerState(((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: jq.g$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljq/g$c;", "", "<init>", "()V", "La3/j;", "Ljq/g;", "Saver", "La3/j;", "a", "()La3/j;", "pager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j<PagerState, ?> a() {
            return PagerState.f84225i;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: jq.g$d */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.a<Float> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float fM;
            k kVarJ = PagerState.this.j();
            if (kVarJ != null) {
                fM = n.m((-kVarJ.getOffset()) / (kVarJ.getSize() + PagerState.this.l()), -0.5f, 0.5f);
            } else {
                fM = BitmapDescriptorFactory.HUE_RED;
            }
            return Float.valueOf(fM);
        }
    }

    /* JADX INFO: renamed from: jq.g$e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.a<Integer> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(PagerState.this.getLazyListState().x().h());
        }
    }

    public PagerState() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k j() {
        k kVarPrevious;
        List<k> listJ = this.lazyListState.x().j();
        ListIterator<k> listIterator = listJ.listIterator(listJ.size());
        while (listIterator.hasPrevious()) {
            kVarPrevious = listIterator.previous();
            if (kVarPrevious.getIndex() == i()) {
                return kVarPrevious;
            }
        }
        kVarPrevious = null;
        return kVarPrevious;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int p() {
        return ((Number) this._currentPage.getValue()).intValue();
    }

    private final void r(Integer num) {
        this.animationTargetPage.setValue(num);
    }

    private final void v(int i11) {
        this._currentPage.setValue(Integer.valueOf(i11));
    }

    @Override // p021s1.x
    public boolean a() {
        return this.lazyListState.a();
    }

    @Override // p021s1.x
    public Object b(h0 h0Var, p<? super p021s1.u, ? super Continuation<? super jn0.h0>, ? extends Object> pVar, Continuation<? super jn0.h0> continuation) {
        Object objB = this.lazyListState.b(h0Var, pVar, continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : jn0.h0.f84049a;
    }

    @Override // p021s1.x
    public float d(float delta) {
        return this.lazyListState.d(delta);
    }

    public final int i() {
        return p();
    }

    public final float k() {
        return ((Number) this.currentPageOffset.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int l() {
        return ((Number) this.itemSpacing.getValue()).intValue();
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final a0 getLazyListState() {
        return this.lazyListState;
    }

    public final k n() {
        Object obj;
        w1.p pVarX = this.lazyListState.x();
        Iterator<T> it = pVarX.j().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                k kVar = (k) next;
                int iMin = Math.min(kVar.getOffset() + kVar.getSize(), pVarX.e() - pVarX.b()) - Math.max(kVar.getOffset(), 0);
                do {
                    Object next2 = it.next();
                    k kVar2 = (k) next2;
                    int iMin2 = Math.min(kVar2.getOffset() + kVar2.getSize(), pVarX.e() - pVarX.b()) - Math.max(kVar2.getOffset(), 0);
                    if (iMin < iMin2) {
                        next = next2;
                        iMin = iMin2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (k) obj;
    }

    public final int o() {
        return ((Number) this.pageCount.getValue()).intValue();
    }

    public final void q() {
        r(null);
    }

    public final void s(int i11) {
        if (i11 != p()) {
            v(i11);
        }
    }

    public final void t(wn0.a<Integer> aVar) {
        this.flingAnimationTarget.setValue(aVar);
    }

    public String toString() {
        return "PagerState(pageCount=" + o() + ", currentPage=" + i() + ", currentPageOffset=" + k() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final void u(int i11) {
        this.itemSpacing.setValue(Integer.valueOf(i11));
    }

    public final void w() {
        k kVarN = n();
        if (kVarN != null) {
            s(kVarN.getIndex());
        }
    }

    public PagerState(int i11) {
        this.lazyListState = new a0(i11, 0, 2, null);
        this._currentPage = s3.d(Integer.valueOf(i11), null, 2, null);
        this.itemSpacing = s3.d(0, null, 2, null);
        this.pageCount = n3.e(new e());
        this.currentPageOffset = n3.e(new d());
        this.animationTargetPage = s3.d(null, null, 2, null);
        this.flingAnimationTarget = s3.d(null, null, 2, null);
    }

    public /* synthetic */ PagerState(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}
