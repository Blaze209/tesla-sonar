package w1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.List;
import java.util.Map;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import z3.c1;
import z3.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u009f\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010:R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b?\u00102\u001a\u0004\b@\u00104R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001d\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bM\u0010OR\u001a\u0010\u0016\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010,\u001a\u0004\b7\u0010.R\u001a\u0010\u0017\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010,\u001a\u0004\b=\u0010.R\u001a\u0010\u0018\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\bE\u0010.R\u001a\u0010\u0019\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u00102\u001a\u0004\bQ\u00104R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010R\u001a\u0004\b1\u0010SR\u001a\u0010\u001c\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010,\u001a\u0004\b+\u0010.R\u001a\u0010\u001d\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010,\u001a\u0004\bI\u0010.R \u0010X\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\u00050U8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010WR\u0014\u0010Z\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bY\u0010.R\"\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020 \u0018\u00010[8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010]R\u0014\u0010`\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b_\u0010.R\u0011\u0010a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bP\u00104R\u001a\u0010c\u001a\u00020b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b'\u0010LR\u0014\u0010d\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006e"}, d2 = {"Lw1/r;", "Lw1/p;", "Lz3/j0;", "Lw1/s;", "firstVisibleItem", "", "firstVisibleItemScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lw4/d;", "density", "Lw4/b;", "childConstraints", "", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Ls1/p;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Lw1/s;IZFLz3/j0;FZLkotlinx/coroutines/CoroutineScope;Lw4/d;JLjava/util/List;IIIZLs1/p;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljn0/h0;", "k", "()V", "delta", "updateAnimations", "v", "(IZ)Z", "a", "Lw1/s;", "s", "()Lw1/s;", "b", "I", "t", "()I", "setFirstVisibleItemScrollOffset", "(I)V", "c", "Z", "m", "()Z", "setCanScrollForward", "(Z)V", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "o", "()F", "setConsumedScroll", "(F)V", "e", "u", "f", "getRemeasureNeeded", "g", "Lkotlinx/coroutines/CoroutineScope;", "p", "()Lkotlinx/coroutines/CoroutineScope;", "h", "Lw4/d;", "r", "()Lw4/d;", IntegerTokenConverter.CONVERTER_KEY, "J", "n", "()J", "j", "Ljava/util/List;", "()Ljava/util/List;", "l", "getReverseLayout", "Ls1/p;", "()Ls1/p;", "q", "", "Lz3/a;", "()Ljava/util/Map;", "alignmentLines", "getHeight", Snapshot.HEIGHT, "Lkotlin/Function1;", "Lz3/c1;", "()Lwn0/l;", "rulers", "getWidth", Snapshot.WIDTH, "canScrollBackward", "Lw4/r;", "viewportSize", "beforeContentPadding", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r implements p, j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s firstVisibleItem;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int firstVisibleItemScrollOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean canScrollForward;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float consumedScroll;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float scrollBackAmount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean remeasureNeeded;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final w4.d density;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long childConstraints;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<s> visibleItemsInfo;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int viewportStartOffset;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int viewportEndOffset;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int totalItemsCount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final p021s1.p orientation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisItemSpacing;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ j0 f120434r;

    public /* synthetic */ r(s sVar, int i11, boolean z11, float f11, j0 j0Var, float f12, boolean z12, CoroutineScope coroutineScope, w4.d dVar, long j11, List list, int i12, int i13, int i14, boolean z13, p021s1.p pVar, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(sVar, i11, z11, f11, j0Var, f12, z12, coroutineScope, dVar, j11, list, i12, i13, i14, z13, pVar, i15, i16);
    }

    @Override // w1.p
    public long a() {
        return w4.s.a(getWidth(), getHeight());
    }

    @Override // w1.p
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // w1.p
    /* JADX INFO: renamed from: c, reason: from getter */
    public p021s1.p getOrientation() {
        return this.orientation;
    }

    @Override // w1.p
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // w1.p
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // w1.p
    public int f() {
        return -getViewportStartOffset();
    }

    @Override // z3.j0
    public wn0.l<c1, h0> g() {
        return this.f120434r.g();
    }

    @Override // z3.j0
    public int getHeight() {
        return this.f120434r.getHeight();
    }

    @Override // z3.j0
    public int getWidth() {
        return this.f120434r.getWidth();
    }

    @Override // w1.p
    /* JADX INFO: renamed from: h, reason: from getter */
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // w1.p
    /* JADX INFO: renamed from: i, reason: from getter */
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // w1.p
    public List<s> j() {
        return this.visibleItemsInfo;
    }

    @Override // z3.j0
    public void k() {
        this.f120434r.k();
    }

    public final boolean l() {
        s sVar = this.firstVisibleItem;
        return ((sVar != null ? sVar.getIndex() : 0) == 0 && this.firstVisibleItemScrollOffset == 0) ? false : true;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // z3.j0
    public Map<z3.a, Integer> q() {
        return this.f120434r.q();
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final w4.d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final s getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    public final boolean v(int delta, boolean updateAnimations) {
        s sVar;
        if (!this.remeasureNeeded && !j().isEmpty() && (sVar = this.firstVisibleItem) != null) {
            int mainAxisSizeWithSpacings = sVar.getMainAxisSizeWithSpacings();
            int i11 = this.firstVisibleItemScrollOffset - delta;
            if (i11 >= 0 && i11 < mainAxisSizeWithSpacings) {
                s sVar2 = (s) p013kotlin.collections.v.o0(j());
                s sVar3 = (s) p013kotlin.collections.v.A0(j());
                if (!sVar2.getNonScrollableItem() && !sVar3.getNonScrollableItem() && (delta >= 0 ? Math.min(getViewportStartOffset() - sVar2.getOffset(), getViewportEndOffset() - sVar3.getOffset()) > delta : Math.min((sVar2.getOffset() + sVar2.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (sVar3.getOffset() + sVar3.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-delta))) {
                    this.firstVisibleItemScrollOffset -= delta;
                    List<s> listJ = j();
                    int size = listJ.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        listJ.get(i12).k(delta, updateAnimations);
                    }
                    this.consumedScroll = delta;
                    if (!this.canScrollForward && delta > 0) {
                        this.canScrollForward = true;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private r(s sVar, int i11, boolean z11, float f11, j0 j0Var, float f12, boolean z12, CoroutineScope coroutineScope, w4.d dVar, long j11, List<s> list, int i12, int i13, int i14, boolean z13, p021s1.p pVar, int i15, int i16) {
        this.firstVisibleItem = sVar;
        this.firstVisibleItemScrollOffset = i11;
        this.canScrollForward = z11;
        this.consumedScroll = f11;
        this.scrollBackAmount = f12;
        this.remeasureNeeded = z12;
        this.coroutineScope = coroutineScope;
        this.density = dVar;
        this.childConstraints = j11;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i12;
        this.viewportEndOffset = i13;
        this.totalItemsCount = i14;
        this.reverseLayout = z13;
        this.orientation = pVar;
        this.afterContentPadding = i15;
        this.mainAxisItemSpacing = i16;
        this.f120434r = j0Var;
    }
}
