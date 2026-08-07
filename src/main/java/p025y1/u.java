package p025y1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.List;
import java.util.Map;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p021s1.p;
import t1.j;
import w4.s;
import wn0.l;
import z3.a;
import z3.c1;
import z3.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BÁ\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b+\u0010.R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b/\u00104R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b1\u0010.R\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b2\u0010.R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0010\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b;\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010<\u001a\u0004\b?\u0010>R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\bE\u0010.\"\u0004\bF\u0010GR\"\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00108\u001a\u0004\bH\u0010:\"\u0004\bI\u0010JR\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b7\u0010MR\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bH\u00108\u001a\u0004\bN\u0010:R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\bO\u0010(\u001a\u0004\bP\u0010*R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b?\u0010(\u001a\u0004\bQ\u0010*R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bA\u0010R\u001a\u0004\bS\u0010TR \u0010X\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\u00060U8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010WR\u0014\u0010Z\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bY\u0010.R\"\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020!\u0018\u00010[8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u0010]R\u0014\u0010`\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b_\u0010.R\u001a\u0010c\u001a\u00020a8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b'\u0010bR\u0014\u0010d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010.R\u0011\u0010e\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bK\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, d2 = {"Ly1/u;", "Ly1/n;", "Lz3/j0;", "", "Ly1/e;", "visiblePagesInfo", "", "pageSize", "pageSpacing", "afterContentPadding", "Ls1/p;", "orientation", "viewportStartOffset", "viewportEndOffset", "", "reverseLayout", "beyondViewportPageCount", "firstVisiblePage", "currentPage", "", "currentPageOffsetFraction", "firstVisiblePageScrollOffset", "canScrollForward", "Lt1/j;", "snapPosition", "measureResult", "remeasureNeeded", "extraPagesBefore", "extraPagesAfter", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Ljava/util/List;IIILs1/p;IIZILy1/e;Ly1/e;FIZLt1/j;Lz3/j0;ZLjava/util/List;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;)V", "Ljn0/h0;", "k", "()V", "delta", "v", "(I)Z", "a", "Ljava/util/List;", "l", "()Ljava/util/List;", "b", "I", "j", "()I", "c", "m", DateTokenConverter.CONVERTER_KEY, "e", "Ls1/p;", "()Ls1/p;", "f", "g", "h", "Z", IntegerTokenConverter.CONVERTER_KEY, "()Z", "n", "Ly1/e;", "t", "()Ly1/e;", "r", Gender.FEMALE, "s", "()F", "setCurrentPageOffsetFraction", "(F)V", "u", "setFirstVisiblePageScrollOffset", "(I)V", "p", "setCanScrollForward", "(Z)V", "o", "Lt1/j;", "()Lt1/j;", "getRemeasureNeeded", "q", "getExtraPagesBefore", "getExtraPagesAfter", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "", "Lz3/a;", "()Ljava/util/Map;", "alignmentLines", "getHeight", Snapshot.HEIGHT, "Lkotlin/Function1;", "Lz3/c1;", "()Lwn0/l;", "rulers", "getWidth", Snapshot.WIDTH, "Lw4/r;", "()J", "viewportSize", "beforeContentPadding", "canScrollBackward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u implements n, j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<e> visiblePagesInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int pageSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int pageSpacing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p orientation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int viewportStartOffset;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int viewportEndOffset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int beyondViewportPageCount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final e firstVisiblePage;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final e currentPage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float currentPageOffsetFraction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int firstVisiblePageScrollOffset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean canScrollForward;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final j snapPosition;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean remeasureNeeded;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final List<e> extraPagesBefore;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final List<e> extraPagesAfter;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ j0 f124644t;

    public u(List<e> list, int i11, int i12, int i13, p pVar, int i14, int i15, boolean z11, int i16, e eVar, e eVar2, float f11, int i17, boolean z12, j jVar, j0 j0Var, boolean z13, List<e> list2, List<e> list3, CoroutineScope coroutineScope) {
        this.visiblePagesInfo = list;
        this.pageSize = i11;
        this.pageSpacing = i12;
        this.afterContentPadding = i13;
        this.orientation = pVar;
        this.viewportStartOffset = i14;
        this.viewportEndOffset = i15;
        this.reverseLayout = z11;
        this.beyondViewportPageCount = i16;
        this.firstVisiblePage = eVar;
        this.currentPage = eVar2;
        this.currentPageOffsetFraction = f11;
        this.firstVisiblePageScrollOffset = i17;
        this.canScrollForward = z12;
        this.snapPosition = jVar;
        this.remeasureNeeded = z13;
        this.extraPagesBefore = list2;
        this.extraPagesAfter = list3;
        this.coroutineScope = coroutineScope;
        this.f124644t = j0Var;
    }

    @Override // p025y1.n
    public long a() {
        return s.a(getWidth(), getHeight());
    }

    @Override // p025y1.n
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // p025y1.n
    /* JADX INFO: renamed from: c, reason: from getter */
    public p getOrientation() {
        return this.orientation;
    }

    @Override // p025y1.n
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // p025y1.n
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // p025y1.n
    public int f() {
        return -getViewportStartOffset();
    }

    @Override // z3.j0
    public l<c1, h0> g() {
        return this.f124644t.g();
    }

    @Override // z3.j0
    public int getHeight() {
        return this.f124644t.getHeight();
    }

    @Override // z3.j0
    public int getWidth() {
        return this.f124644t.getWidth();
    }

    @Override // p025y1.n
    /* JADX INFO: renamed from: h, reason: from getter */
    public j getSnapPosition() {
        return this.snapPosition;
    }

    @Override // p025y1.n
    /* JADX INFO: renamed from: i, reason: from getter */
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // p025y1.n
    /* JADX INFO: renamed from: j, reason: from getter */
    public int getPageSize() {
        return this.pageSize;
    }

    @Override // z3.j0
    public void k() {
        this.f124644t.k();
    }

    @Override // p025y1.n
    public List<e> l() {
        return this.visiblePagesInfo;
    }

    @Override // p025y1.n
    /* JADX INFO: renamed from: m, reason: from getter */
    public int getPageSpacing() {
        return this.pageSpacing;
    }

    @Override // p025y1.n
    /* JADX INFO: renamed from: n, reason: from getter */
    public int getBeyondViewportPageCount() {
        return this.beyondViewportPageCount;
    }

    public final boolean o() {
        e eVar = this.firstVisiblePage;
        return ((eVar != null ? eVar.getIndex() : 0) == 0 && this.firstVisiblePageScrollOffset == 0) ? false : true;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    @Override // z3.j0
    public Map<a, Integer> q() {
        return this.f124644t.q();
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final e getCurrentPage() {
        return this.currentPage;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final e getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getFirstVisiblePageScrollOffset() {
        return this.firstVisiblePageScrollOffset;
    }

    public final boolean v(int delta) {
        int i11;
        int pageSize = getPageSize() + getPageSpacing();
        if (!this.remeasureNeeded && !l().isEmpty() && this.firstVisiblePage != null && (i11 = this.firstVisiblePageScrollOffset - delta) >= 0 && i11 < pageSize) {
            float f11 = pageSize != 0 ? delta / pageSize : BitmapDescriptorFactory.HUE_RED;
            float f12 = this.currentPageOffsetFraction - f11;
            if (this.currentPage != null && f12 < 0.5f && f12 > -0.5f) {
                e eVar = (e) v.o0(l());
                e eVar2 = (e) v.A0(l());
                if (delta >= 0 ? Math.min(getViewportStartOffset() - eVar.getOffset(), getViewportEndOffset() - eVar2.getOffset()) > delta : Math.min((eVar.getOffset() + pageSize) - getViewportStartOffset(), (eVar2.getOffset() + pageSize) - getViewportEndOffset()) > (-delta)) {
                    this.currentPageOffsetFraction -= f11;
                    this.firstVisiblePageScrollOffset -= delta;
                    List<e> listL = l();
                    int size = listL.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        listL.get(i12).a(delta);
                    }
                    List<e> list = this.extraPagesBefore;
                    int size2 = list.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        list.get(i13).a(delta);
                    }
                    List<e> list2 = this.extraPagesAfter;
                    int size3 = list2.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        list2.get(i14).a(delta);
                    }
                    if (!this.canScrollForward && delta > 0) {
                        this.canScrollForward = true;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public /* synthetic */ u(List list, int i11, int i12, int i13, p pVar, int i14, int i15, boolean z11, int i16, e eVar, e eVar2, float f11, int i17, boolean z12, j jVar, j0 j0Var, boolean z13, List list2, List list3, CoroutineScope coroutineScope, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i11, i12, i13, pVar, i14, i15, z11, i16, eVar, eVar2, f11, i17, z12, jVar, j0Var, z13, (i18 & 131072) != 0 ? v.m() : list2, (i18 & 262144) != 0 ? v.m() : list3, coroutineScope);
    }
}
