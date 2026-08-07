package w1;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p019p1.AnimationState;
import p019p1.e1;
import p019p1.j1;
import p019p1.r1;
import p020r2.n3;
import p020r2.p1;
import p020r2.s3;
import p021s1.C4788y;
import p024x1.e0;
import p024x1.l0;
import p024x1.m0;
import z3.y0;
import z3.z0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u0092\u00012\u00020\u0001:\u0001?B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0019\u001a\u00020\u000e2\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ<\u0010&\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0#\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0096@¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\nH\u0000¢\u0006\u0004\b+\u0010)J$\u0010,\u001a\u00020\u000e2\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b,\u0010\u001aJ)\u00101\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u001b2\b\b\u0002\u00100\u001a\u00020\u001bH\u0000¢\u0006\u0004\b1\u00102J\u001f\u00106\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0002H\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R$\u0010>\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u001b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b&\u0010;\u001a\u0004\b<\u0010=R(\u0010C\u001a\u0004\u0018\u00010-2\b\u0010:\u001a\u0004\u0018\u00010-8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020-0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010T\u001a\u00020O8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR$\u0010Y\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R$\u0010`\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b]\u0010\u000f\u001a\u0004\b^\u0010_R\"\u0010e\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010;\u001a\u0004\bb\u0010=\"\u0004\bc\u0010dR(\u0010j\u001a\u0004\u0018\u00010f2\b\u0010:\u001a\u0004\u0018\u00010f8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b,\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010o\u001a\u00020k8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bV\u0010nR\u001a\u0010t\u001a\u00020p8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010q\u001a\u0004\br\u0010sR \u0010{\u001a\b\u0012\u0004\u0012\u00020v0u8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u001b\u0010\u0080\u0001\u001a\u00020|8\u0000X\u0080\u0004¢\u0006\f\n\u0004\br\u0010}\u001a\u0004\b~\u0010\u007fR\u001f\u0010\u0085\u0001\u001a\u00030\u0081\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b~\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u008f\u0001\u001a\u00030\u008a\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R%\u0010\u0094\u0001\u001a\u00030\u0090\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b\u0091\u0001\u0010M\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R-\u0010\u0096\u0001\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u001b8V@RX\u0096\u008e\u0002¢\u0006\u0013\n\u0004\b<\u0010M\u001a\u0004\b?\u0010=\"\u0005\b\u0095\u0001\u0010dR-\u0010\u0098\u0001\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u001b8V@RX\u0096\u008e\u0002¢\u0006\u0013\n\u0004\bR\u0010M\u001a\u0004\bH\u0010=\"\u0005\b\u0097\u0001\u0010dR$\u0010\u009a\u0001\u001a\u00030\u0090\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0004\by\u0010M\u001a\u0006\b\u0099\u0001\u0010\u0093\u0001R'\u0010\u009f\u0001\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0005\u0012\u00030\u009c\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010_R\u0012\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010_R\u0013\u0010\r\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010 \u0001R\u0016\u0010\u0012\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010¡\u0001R!\u0010§\u0001\u001a\u00030¢\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b£\u0001\u0010¤\u0001*\u0006\b¥\u0001\u0010¦\u0001R\u0015\u0010¨\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010=R\u0016\u0010ª\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010X\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006«\u0001"}, d2 = {"Lw1/a0;", "Ls1/x;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "Lw1/v;", "prefetchStrategy", "<init>", "(IILw1/v;)V", "(II)V", "", "delta", "Lw1/p;", "layoutInfo", "Ljn0/h0;", "I", "(FLw1/p;)V", "Lw4/d;", "density", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "P", "(FLw4/d;Lkotlinx/coroutines/CoroutineScope;)V", "index", "scrollOffset", "K", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "forceRemeasure", Gender.OTHER, "(IIZ)V", "Lq1/h0;", "scrollPriority", "Lkotlin/Function2;", "Ls1/u;", "Lkotlin/coroutines/Continuation;", "", "block", "b", "(Lq1/h0;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(F)F", "distance", "J", "l", "Lw1/r;", "result", "isLookingAhead", "visibleItemsStayedTheSame", "n", "(Lw1/r;ZZ)V", "Lw1/l;", "itemProvider", "firstItemIndex", "Q", "(Lw1/l;I)I", "a", "Lw1/v;", "<set-?>", "Z", "u", "()Z", "hasLookaheadPassOccurred", "c", "Lw1/r;", "C", "()Lw1/r;", "postLookaheadLayoutInfo", "Lw1/y;", "Lw1/y;", "scrollPosition", "Lw1/e;", "e", "Lw1/e;", "animateScrollScope", "Lr2/p1;", "f", "Lr2/p1;", "layoutInfoState", "Lu1/l;", "g", "Lu1/l;", "v", "()Lu1/l;", "internalInteractionSource", "h", Gender.FEMALE, "H", "()F", "scrollToBeConsumed", IntegerTokenConverter.CONVERTER_KEY, "Ls1/x;", "scrollableState", "j", "getNumMeasurePasses$foundation_release", "()I", "numMeasurePasses", "k", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "Lz3/y0;", "Lz3/y0;", "E", "()Lz3/y0;", "remeasurement", "Lz3/z0;", "m", "Lz3/z0;", "()Lz3/z0;", "remeasurementModifier", "Lx1/b;", "Lx1/b;", "p", "()Lx1/b;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Lw1/s;", "o", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "w", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "itemAnimator", "Lx1/j;", "Lx1/j;", "q", "()Lx1/j;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/d;", "Landroidx/compose/foundation/lazy/layout/d;", "D", "()Landroidx/compose/foundation/lazy/layout/d;", "prefetchState", "Lw1/u;", "r", "Lw1/u;", "prefetchScope", "Lx1/e0;", "s", "Lx1/e0;", "A", "()Lx1/e0;", "pinnedItems", "Lx1/m0;", "t", "y", "()Lr2/p1;", "measurementScopeInvalidator", Gender.NONE, "canScrollForward", Gender.MALE, "canScrollBackward", "B", "placementScopeInvalidator", "Lp1/k;", "Lp1/m;", "x", "Lp1/k;", "_scrollDeltaBetweenPasses", "()Lw1/p;", "()Lw4/d;", "Lbo0/j;", "z", "()Lbo0/j;", "getNearestRange$foundation_release$delegate", "(Lw1/a0;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "G", "scrollDeltaBetweenPasses", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a0 implements p021s1.x {

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final a3.j<a0, ?> f120266z = a3.a.a(a.f120291c, b.f120292c);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v prefetchStrategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean hasLookaheadPassOccurred;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private r postLookaheadLayoutInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y scrollPosition;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final w1.e animateScrollScope;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p1<r> layoutInfoState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final u1.l internalInteractionSource;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float scrollToBeConsumed;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p021s1.x scrollableState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int numMeasurePasses;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private y0 remeasurement;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final z0 remeasurementModifier;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p024x1.b awaitLayoutModifier;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final LazyLayoutItemAnimator<s> itemAnimator;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p024x1.j beyondBoundsInfo;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.d prefetchState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final u prefetchScope;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final e0 pinnedItems;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p1<h0> measurementScopeInvalidator;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final p1 canScrollForward;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final p1 canScrollBackward;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final p1<h0> placementScopeInvalidator;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private AnimationState<Float, p019p1.m> _scrollDeltaBetweenPasses;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La3/l;", "Lw1/a0;", "it", "", "", "a", "(La3/l;Lw1/a0;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<a3.l, a0, List<? extends Integer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f120291c = new a();

        a() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Integer> invoke(a3.l lVar, a0 a0Var) {
            return p013kotlin.collections.v.p(Integer.valueOf(a0Var.s()), Integer.valueOf(a0Var.t()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lw1/a0;", "a", "(Ljava/util/List;)Lw1/a0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<List<? extends Integer>, a0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f120292c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a0 invoke(List<Integer> list) {
            return new a0(list.get(0).intValue(), list.get(1).intValue());
        }
    }

    /* JADX INFO: renamed from: w1.a0$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lw1/a0$c;", "", "<init>", "()V", "La3/j;", "Lw1/a0;", "Saver", "La3/j;", "a", "()La3/j;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a3.j<a0, ?> a() {
            return a0.f120266z;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"w1/a0$d", "Lw1/u;", "", "index", "Landroidx/compose/foundation/lazy/layout/d$b;", "a", "(I)Landroidx/compose/foundation/lazy/layout/d$b;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements u {
        d() {
        }

        @Override // w1.u
        public androidx.compose.foundation.lazy.layout.d.b a(int index) {
            androidx.compose.runtime.snapshots.g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            a0 a0Var = a0.this;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            wn0.l<Object, h0> lVarH = gVarD != null ? gVarD.h() : null;
            androidx.compose.runtime.snapshots.g gVarF = companion.f(gVarD);
            try {
                return a0.this.getPrefetchState().e(index, ((r) a0Var.layoutInfoState.getValue()).getChildConstraints());
            } finally {
                companion.m(gVarD, gVarF, lVarH);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx1/l0;", "Ljn0/h0;", "a", "(Lx1/l0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<l0, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f120295d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11) {
            super(1);
            this.f120295d = i11;
        }

        public final void a(l0 l0Var) {
            v vVar = a0.this.prefetchStrategy;
            int i11 = this.f120295d;
            androidx.compose.runtime.snapshots.g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            companion.m(gVarD, companion.f(gVarD), gVarD != null ? gVarD.h() : null);
            vVar.b(l0Var, i11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(l0 l0Var) {
            a(l0Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"w1/a0$f", "Lz3/z0;", "Lz3/y0;", "remeasurement", "Ljn0/h0;", "e", "(Lz3/y0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f implements z0 {
        f() {
        }

        @Override // z3.z0
        public void e(y0 remeasurement) {
            a0.this.remeasurement = remeasurement;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", i = {0, 0, 0}, l = {388, 389}, m = "scroll", n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f120297n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f120298o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f120299p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f120300q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f120302s;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f120300q = obj;
            this.f120302s |= Integer.MIN_VALUE;
            return a0.this.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls1/u;", "Ljn0/h0;", "<anonymous>", "(Ls1/u;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.p<p021s1.u, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120303n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f120305p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f120306q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i11, int i12, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f120305p = i11;
            this.f120306q = i12;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p021s1.u uVar, Continuation<? super h0> continuation) {
            return ((h) create(uVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a0.this.new h(this.f120305p, this.f120306q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f120303n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            a0.this.O(this.f120305p, this.f120306q, true);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.l<Float, Float> {
        i() {
            super(1);
        }

        public final Float a(float f11) {
            return Float.valueOf(-a0.this.J(-f11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Float invoke(Float f11) {
            return a(f11.floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState$updateScrollDeltaForPostLookahead$2$1", f = "LazyListState.kt", i = {}, l = {578}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120308n;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a0.this.new j(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f120308n;
            if (i11 == 0) {
                jn0.t.b(obj);
                AnimationState animationState = a0.this._scrollDeltaBetweenPasses;
                Float fBoxFloat = Boxing.boxFloat(BitmapDescriptorFactory.HUE_RED);
                e1 e1VarJ = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, Boxing.boxFloat(0.5f), 1, null);
                this.f120308n = 1;
                if (j1.j(animationState, fBoxFloat, e1VarJ, true, null, this, 8, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState$updateScrollDeltaForPostLookahead$2$2", f = "LazyListState.kt", i = {}, l = {587}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f120310n;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a0.this.new k(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f120310n;
            if (i11 == 0) {
                jn0.t.b(obj);
                AnimationState animationState = a0.this._scrollDeltaBetweenPasses;
                Float fBoxFloat = Boxing.boxFloat(BitmapDescriptorFactory.HUE_RED);
                e1 e1VarJ = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, 400.0f, Boxing.boxFloat(0.5f), 1, null);
                this.f120310n = 1;
                if (j1.j(animationState, fBoxFloat, e1VarJ, true, null, this, 8, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a0() {
        this(0, 0, null, 7, null);
    }

    private final void I(float delta, p layoutInfo) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.d(this.prefetchScope, delta, layoutInfo);
        }
    }

    public static /* synthetic */ Object L(a0 a0Var, int i11, int i12, Continuation continuation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return a0Var.K(i11, i12, continuation);
    }

    private void M(boolean z11) {
        this.canScrollBackward.setValue(Boolean.valueOf(z11));
    }

    private void N(boolean z11) {
        this.canScrollForward.setValue(Boolean.valueOf(z11));
    }

    private final void P(float delta, w4.d density, CoroutineScope coroutineScope) {
        if (delta <= density.O1(b0.f120334a)) {
            return;
        }
        androidx.compose.runtime.snapshots.g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
        androidx.compose.runtime.snapshots.g gVarD = companion.d();
        wn0.l<Object, h0> lVarH = gVarD != null ? gVarD.h() : null;
        androidx.compose.runtime.snapshots.g gVarF = companion.f(gVarD);
        try {
            float fFloatValue = this._scrollDeltaBetweenPasses.getValue().floatValue();
            if (this._scrollDeltaBetweenPasses.getIsRunning()) {
                this._scrollDeltaBetweenPasses = p019p1.l.g(this._scrollDeltaBetweenPasses, fFloatValue - delta, BitmapDescriptorFactory.HUE_RED, 0L, 0L, false, 30, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new j(null), 3, null);
            } else {
                this._scrollDeltaBetweenPasses = new AnimationState<>(r1.e(p013kotlin.jvm.internal.l.f86526a), Float.valueOf(-delta), null, 0L, 0L, false, 60, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new k(null), 3, null);
            }
        } finally {
            companion.m(gVarD, gVarF, lVarH);
        }
    }

    public static /* synthetic */ Object m(a0 a0Var, int i11, int i12, Continuation continuation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return a0Var.l(i11, i12, continuation);
    }

    public static /* synthetic */ void o(a0 a0Var, r rVar, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        a0Var.n(rVar, z11, z12);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final e0 getPinnedItems() {
        return this.pinnedItems;
    }

    public final p1<h0> B() {
        return this.placementScopeInvalidator;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final r getPostLookaheadLayoutInfo() {
        return this.postLookaheadLayoutInfo;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.d getPrefetchState() {
        return this.prefetchState;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final y0 getRemeasurement() {
        return this.remeasurement;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final z0 getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    public final float G() {
        return this._scrollDeltaBetweenPasses.getValue().floatValue();
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    public final float J(float distance) {
        if ((distance < BitmapDescriptorFactory.HUE_RED && !c()) || (distance > BitmapDescriptorFactory.HUE_RED && !e())) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (Math.abs(this.scrollToBeConsumed) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
        }
        float f11 = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f11;
        if (Math.abs(f11) > 0.5f) {
            r value = this.layoutInfoState.getValue();
            float f12 = this.scrollToBeConsumed;
            int iRound = Math.round(f12);
            r rVar = this.postLookaheadLayoutInfo;
            boolean zV = value.v(iRound, !this.hasLookaheadPassOccurred);
            if (zV && rVar != null) {
                zV = rVar.v(iRound, true);
            }
            if (zV) {
                n(value, this.hasLookaheadPassOccurred, true);
                m0.d(this.placementScopeInvalidator);
                I(f12 - this.scrollToBeConsumed, value);
            } else {
                y0 y0Var = this.remeasurement;
                if (y0Var != null) {
                    y0Var.f();
                }
                I(f12 - this.scrollToBeConsumed, x());
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f13 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = BitmapDescriptorFactory.HUE_RED;
        return f13;
    }

    public final Object K(int i11, int i12, Continuation<? super h0> continuation) {
        Object objF = p021s1.x.f(this, null, new h(i11, i12, null), continuation, 1, null);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : h0.f84049a;
    }

    public final void O(int index, int scrollOffset, boolean forceRemeasure) {
        if (this.scrollPosition.a() != index || this.scrollPosition.c() != scrollOffset) {
            this.itemAnimator.o();
        }
        this.scrollPosition.d(index, scrollOffset);
        if (!forceRemeasure) {
            m0.d(this.measurementScopeInvalidator);
            return;
        }
        y0 y0Var = this.remeasurement;
        if (y0Var != null) {
            y0Var.f();
        }
    }

    public final int Q(l itemProvider, int firstItemIndex) {
        return this.scrollPosition.j(itemProvider, firstItemIndex);
    }

    @Override // p021s1.x
    public boolean a() {
        return this.scrollableState.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r8.b(r6, r7, r0) == r1) goto L22;
     */
    @Override // p021s1.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(q1.h0 r6, wn0.p<? super p021s1.u, ? super p013kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object> r7, p013kotlin.coroutines.Continuation<? super jn0.h0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof w1.a0.g
            if (r0 == 0) goto L13
            r0 = r8
            w1.a0$g r0 = (w1.a0.g) r0
            int r1 = r0.f120302s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120302s = r1
            goto L18
        L13:
            w1.a0$g r0 = new w1.a0$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f120300q
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f120302s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f120299p
            r7 = r6
            wn0.p r7 = (wn0.p) r7
            java.lang.Object r6 = r0.f120298o
            q1.h0 r6 = (q1.h0) r6
            java.lang.Object r2 = r0.f120297n
            w1.a0 r2 = (w1.a0) r2
            jn0.t.b(r8)
            goto L5a
        L45:
            jn0.t.b(r8)
            x1.b r8 = r5.awaitLayoutModifier
            r0.f120297n = r5
            r0.f120298o = r6
            r0.f120299p = r7
            r0.f120302s = r4
            java.lang.Object r8 = r8.i(r0)
            if (r8 != r1) goto L59
            goto L6b
        L59:
            r2 = r5
        L5a:
            s1.x r8 = r2.scrollableState
            r2 = 0
            r0.f120297n = r2
            r0.f120298o = r2
            r0.f120299p = r2
            r0.f120302s = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.a0.b(q1.h0, wn0.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p021s1.x
    public boolean c() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // p021s1.x
    public float d(float delta) {
        return this.scrollableState.d(delta);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p021s1.x
    public boolean e() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    public final Object l(int i11, int i12, Continuation<? super h0> continuation) {
        Object objD = p024x1.g.d(this.animateScrollScope, i11, i12, 100, r(), continuation);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : h0.f84049a;
    }

    public final void n(r result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        if (!isLookingAhead && this.hasLookaheadPassOccurred) {
            this.postLookaheadLayoutInfo = result;
            return;
        }
        if (isLookingAhead) {
            this.hasLookaheadPassOccurred = true;
        }
        M(result.l());
        N(result.getCanScrollForward());
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.i(result.getFirstVisibleItemScrollOffset());
        } else {
            this.scrollPosition.h(result);
            if (this.prefetchingEnabled) {
                this.prefetchStrategy.a(this.prefetchScope, result);
            }
        }
        if (isLookingAhead) {
            P(result.getScrollBackAmount(), result.getDensity(), result.getCoroutineScope());
        }
        this.numMeasurePasses++;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final p024x1.b getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final p024x1.j getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    public final w4.d r() {
        return this.layoutInfoState.getValue().getDensity();
    }

    public final int s() {
        return this.scrollPosition.a();
    }

    public final int t() {
        return this.scrollPosition.c();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getHasLookaheadPassOccurred() {
        return this.hasLookaheadPassOccurred;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final u1.l getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final LazyLayoutItemAnimator<s> w() {
        return this.itemAnimator;
    }

    public final p x() {
        return this.layoutInfoState.getValue();
    }

    public final p1<h0> y() {
        return this.measurementScopeInvalidator;
    }

    public final bo0.j z() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public a0(int i11, int i12, v vVar) {
        this.prefetchStrategy = vVar;
        y yVar = new y(i11, i12);
        this.scrollPosition = yVar;
        this.animateScrollScope = new w1.e(this);
        this.layoutInfoState = n3.h(b0.f120335b, n3.j());
        this.internalInteractionSource = u1.k.a();
        this.scrollableState = C4788y.a(new i());
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new f();
        this.awaitLayoutModifier = new p024x1.b();
        this.itemAnimator = new LazyLayoutItemAnimator<>();
        this.beyondBoundsInfo = new p024x1.j();
        this.prefetchState = new androidx.compose.foundation.lazy.layout.d(vVar.c(), new e(i11));
        this.prefetchScope = new d();
        this.pinnedItems = new e0();
        yVar.getNearestRangeState();
        this.measurementScopeInvalidator = m0.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = s3.d(bool, null, 2, null);
        this.canScrollBackward = s3.d(bool, null, 2, null);
        this.placementScopeInvalidator = m0.c(null, 1, null);
        p019p1.p1<Float, p019p1.m> p1VarE = r1.e(p013kotlin.jvm.internal.l.f86526a);
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        this._scrollDeltaBetweenPasses = p019p1.l.d(p1VarE, fValueOf, fValueOf, 0L, 0L, false, 56, null);
    }

    public /* synthetic */ a0(int i11, int i12, v vVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? w.b(0, 1, null) : vVar);
    }

    public /* synthetic */ a0(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
    }

    public a0(int i11, int i12) {
        this(i11, i12, w.b(0, 1, null));
    }
}
