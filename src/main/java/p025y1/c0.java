package p025y1;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import ezvcard.property.Gender;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p019p1.i;
import p020r2.e3;
import p020r2.m1;
import p020r2.n3;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;
import p021s1.C4788y;
import p021s1.x;
import p024x1.e0;
import p024x1.j;
import p024x1.m0;
import p024x1.q0;
import u1.k;
import u1.l;
import wn0.p;
import z3.y0;
import z3.z0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B)\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\"\u0010%\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00022\b\b\u0003\u0010$\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\u00020\u000e*\u00020'2\u0006\u0010(\u001a\u00020\u0002H\u0007¢\u0006\u0004\b)\u0010*J'\u0010-\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0018H\u0000¢\u0006\u0004\b-\u0010.J2\u00101\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00022\b\b\u0003\u0010$\u001a\u00020\u00042\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040/H\u0086@¢\u0006\u0004\b1\u00102J<\u00109\u001a\u00020\u000e2\u0006\u00104\u001a\u0002032\"\u00108\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e06\u0012\u0006\u0012\u0004\u0018\u00010705H\u0096@¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010\rJ!\u0010=\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010<\u001a\u00020\u0018H\u0000¢\u0006\u0004\b=\u0010>J!\u0010A\u001a\u00020\u00022\u0006\u0010@\u001a\u00020?2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\bA\u0010BR1\u0010K\u001a\u00020C2\u0006\u0010D\u001a\u00020C8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010V\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b;\u0010S\u001a\u0004\bT\u0010UR$\u0010Y\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bX\u0010UR\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010_\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\\R\u0016\u0010b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010aR\u0014\u0010g\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR$\u0010j\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bh\u0010S\u001a\u0004\bi\u0010UR\u0016\u0010l\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010SR\"\u0010p\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010%\u001a\u0004\bm\u0010\u001c\"\u0004\bn\u0010oR\u0016\u0010r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010SR\u0018\u0010u\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010tR\u0016\u0010w\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010%R\u001c\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00110x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010FR#\u0010\u0080\u0001\u001a\u00020z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u001f\u0010\u0085\u0001\u001a\u00030\u0081\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0015\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R1\u0010\u008b\u0001\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010U\"\u0006\b\u0089\u0001\u0010\u008a\u0001R1\u0010\u008f\u0001\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u008c\u0001\u0010\u0087\u0001\u001a\u0005\b\u008d\u0001\u0010U\"\u0006\b\u008e\u0001\u0010\u008a\u0001R\u001f\u0010\u0093\u0001\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0005\b\u0092\u0001\u0010UR\u001e\u0010(\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u0094\u0001\u0010\u0091\u0001\u001a\u0005\b\u0095\u0001\u0010UR\u001f\u0010\u009a\u0001\u001a\u00030\u0096\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b|\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001f\u0010\u009e\u0001\u001a\u00030\u009b\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bT\u0010\u009c\u0001\u001a\u0006\b\u008c\u0001\u0010\u009d\u0001R\u001f\u0010¢\u0001\u001a\u00030\u009f\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bX\u0010 \u0001\u001a\u0006\b\u0086\u0001\u0010¡\u0001R7\u0010¨\u0001\u001a\u0005\u0018\u00010£\u00012\t\u0010D\u001a\u0005\u0018\u00010£\u00018@@BX\u0080\u008e\u0002¢\u0006\u0017\n\u0005\b\u0083\u0001\u0010F\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R \u0010®\u0001\u001a\u00030©\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R-\u0010³\u0001\u001a\u00030¯\u00018\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0005\b°\u0001\u0010\\\u001a\u0005\b±\u0001\u0010H\"\u0005\b²\u0001\u0010JR\u001f\u0010¸\u0001\u001a\u00030´\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0005\b\\\u0010·\u0001R%\u0010½\u0001\u001a\u00030¹\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\bº\u0001\u0010F\u001a\u0006\b»\u0001\u0010¼\u0001R$\u0010¾\u0001\u001a\u00030¹\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0004\ba\u0010F\u001a\u0006\bµ\u0001\u0010¼\u0001R.\u0010Á\u0001\u001a\u00020\u00182\u0006\u0010D\u001a\u00020\u00188F@BX\u0086\u008e\u0002¢\u0006\u0014\n\u0005\b¿\u0001\u0010F\u001a\u0004\bP\u0010\u001c\"\u0005\bÀ\u0001\u0010oR.\u0010Ä\u0001\u001a\u00020\u00182\u0006\u0010D\u001a\u00020\u00188F@BX\u0086\u008e\u0002¢\u0006\u0014\n\u0005\bÂ\u0001\u0010F\u001a\u0004\bW\u0010\u001c\"\u0005\bÃ\u0001\u0010oR\u001b\u0010Å\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010FR\u001b\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010FR\u0015\u0010Ç\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010UR\u0014\u0010É\u0001\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\b°\u0001\u0010È\u0001R\u0015\u0010Ê\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010UR\u0016\u0010Ë\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010UR\u0016\u0010Ì\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010UR\u0017\u0010Ï\u0001\u001a\u00020\u00048@X\u0080\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010UR\u0013\u0010\u0005\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010Î\u0001R!\u0010Ô\u0001\u001a\u00030Ð\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\bº\u0001\u0010Ñ\u0001*\u0006\bÒ\u0001\u0010Ó\u0001R\u0015\u0010Õ\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u001cR\u0016\u0010Ö\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006×\u0001"}, d2 = {"Ly1/c0;", "Ls1/x;", "", "currentPage", "", "currentPageOffsetFraction", "Lx1/q0;", "prefetchScheduler", "<init>", "(IFLx1/q0;)V", "(IF)V", "delta", "X", "(F)F", "Ljn0/h0;", "q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ly1/u;", "result", "k0", "(Ly1/u;)V", "s", "(I)I", "scrollDelta", "", "T", "(F)Z", Gender.UNKNOWN, "()Z", "Ly1/n;", "info", "W", "(FLy1/n;)V", "r", "(Ly1/n;)V", "page", "pageOffsetFraction", "Z", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ls1/u;", "targetPage", "l0", "(Ls1/u;I)V", "offsetFraction", "forceRemeasure", "j0", "(IFZ)V", "Lp1/i;", "animationSpec", "m", "(IFLp1/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lq1/h0;", "scrollPriority", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "b", "(Lq1/h0;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "visibleItemsStayedTheSame", "o", "(Ly1/u;Z)V", "Ly1/r;", "itemProvider", "V", "(Ly1/r;I)I", "Lj3/g;", "<set-?>", "a", "Lr2/p1;", "S", "()J", "i0", "(J)V", "upDownDifference", "Lx1/h;", "Lx1/h;", "animatedScrollScope", "Ly1/x;", "c", "Ly1/x;", "scrollPosition", "I", "y", "()I", "firstVisiblePage", "e", "z", "firstVisiblePageOffset", "", "f", "J", "maxScrollOffset", "g", "minScrollOffset", "h", Gender.FEMALE, "accumulator", IntegerTokenConverter.CONVERTER_KEY, "previousPassDelta", "j", "Ls1/x;", "scrollableState", "k", "getLayoutWithMeasurement$foundation_release", "layoutWithMeasurement", "l", "layoutWithoutMeasurement", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "n", "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/d$b;", "Landroidx/compose/foundation/lazy/layout/d$b;", "currentPrefetchHandle", "p", "wasPrefetchingForward", "Lr2/p1;", "pagerLayoutInfoState", "Lw4/d;", "Lw4/d;", "x", "()Lw4/d;", "d0", "(Lw4/d;)V", "density", "Lu1/l;", "Lu1/l;", "A", "()Lu1/l;", "internalInteractionSource", "t", "Lr2/m1;", Gender.NONE, "f0", "(I)V", "programmaticScrollTargetPage", "u", "R", "h0", "settledPageState", "v", "Lr2/y3;", "Q", "settledPage", "w", "getTargetPage", "Landroidx/compose/foundation/lazy/layout/d;", "Landroidx/compose/foundation/lazy/layout/d;", Gender.MALE, "()Landroidx/compose/foundation/lazy/layout/d;", "prefetchState", "Lx1/j;", "Lx1/j;", "()Lx1/j;", "beyondBoundsInfo", "Lx1/b;", "Lx1/b;", "()Lx1/b;", "awaitLayoutModifier", "Lz3/y0;", Gender.OTHER, "()Lz3/y0;", "g0", "(Lz3/y0;)V", "remeasurement", "Lz3/z0;", "B", "Lz3/z0;", "P", "()Lz3/z0;", "remeasurementModifier", "Lw4/b;", "C", "getPremeasureConstraints-msEJaDk$foundation_release", "e0", "premeasureConstraints", "Lx1/e0;", "D", "Lx1/e0;", "()Lx1/e0;", "pinnedPages", "Lx1/m0;", "E", "K", "()Lr2/p1;", "placementScopeInvalidator", "measurementScopeInvalidator", "G", "c0", "canScrollForward", "H", "b0", "canScrollBackward", "isLastScrollForwardState", "isLastScrollBackwardState", "pageCount", "()Ly1/n;", "layoutInfo", "pageSpacing", "pageSize", "pageSizeWithSpacing", "L", "()F", "positionThresholdFraction", "Lbo0/j;", "()Lbo0/j;", "getNearestRange$foundation_release$delegate", "(Ly1/c0;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "lastScrolledForward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class c0 implements x {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final p1 remeasurement;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final z0 remeasurementModifier;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private long premeasureConstraints;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final e0 pinnedPages;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final p1<h0> placementScopeInvalidator;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final p1<h0> measurementScopeInvalidator;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final p1 canScrollForward;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final p1 canScrollBackward;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final p1<Boolean> isLastScrollForwardState;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final p1<Boolean> isLastScrollBackwardState;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p1 upDownDifference;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p024x1.h animatedScrollScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x scrollPosition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int firstVisiblePage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int firstVisiblePageOffset;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long maxScrollOffset;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long minScrollOffset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float accumulator;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float previousPassDelta;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final x scrollableState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int layoutWithMeasurement;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int layoutWithoutMeasurement;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int indexToPrefetch;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.foundation.lazy.layout.d.b currentPrefetchHandle;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean wasPrefetchingForward;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private p1<u> pagerLayoutInfoState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private w4.d density;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final l internalInteractionSource;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final m1 programmaticScrollTargetPage;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final m1 settledPageState;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final y3 settledPage;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final y3 targetPage;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.d prefetchState;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final j beyondBoundsInfo;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final p024x1.b awaitLayoutModifier;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 0}, l = {605, 613}, m = "animateScrollToPage", n = {"this", "animationSpec", "page", "pageOffsetFraction"}, s = {"L$0", "L$1", "I$0", "F$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f124463n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f124464o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f124465p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f124466q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f124467r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f124469t;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f124467r = obj;
            this.f124469t |= Integer.MIN_VALUE;
            return c0.this.m(0, BitmapDescriptorFactory.HUE_RED, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls1/u;", "", "it", "Ljn0/h0;", "a", "(Ls1/u;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements p<p021s1.u, Integer, h0> {
        b() {
            super(2);
        }

        public final void a(p021s1.u uVar, int i11) {
            c0.this.l0(uVar, i11);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p021s1.u uVar, Integer num) {
            a(uVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"y1/c0$c", "Lz3/z0;", "Lz3/y0;", "remeasurement", "Ljn0/h0;", "e", "(Lz3/y0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements z0 {
        c() {
        }

        @Override // z3.z0
        public void e(y0 remeasurement) {
            c0.this.g0(remeasurement);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 1}, l = {629, 634}, m = "scroll$suspendImpl", n = {"$this", "scrollPriority", "block", "$this"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f124472n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f124473o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f124474p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f124475q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f124477s;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f124475q = obj;
            this.f124477s |= Integer.MIN_VALUE;
            return c0.Y(c0.this, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls1/u;", "Ljn0/h0;", "<anonymous>", "(Ls1/u;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", i = {}, l = {DownloaderService.STATUS_INSUFFICIENT_SPACE_ERROR}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<p021s1.u, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f124478n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ float f124480p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f124481q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(float f11, int i11, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f124480p = f11;
            this.f124481q = i11;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p021s1.u uVar, Continuation<? super h0> continuation) {
            return ((e) create(uVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c0.this.new e(this.f124480p, this.f124481q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f124478n;
            if (i11 == 0) {
                t.b(obj);
                c0 c0Var = c0.this;
                this.f124478n = 1;
                if (c0Var.q(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            float f11 = this.f124480p;
            double d11 = f11;
            boolean z11 = false;
            if (-0.5d <= d11 && d11 <= 0.5d) {
                z11 = true;
            }
            if (z11) {
                c0.this.j0(c0.this.s(this.f124481q), this.f124480p, true);
                return h0.f84049a;
            }
            throw new IllegalArgumentException(("pageOffsetFraction " + f11 + " is not within the range -0.5 to 0.5").toString());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.l<Float, Float> {
        f() {
            super(1);
        }

        public final Float a(float f11) {
            return Float.valueOf(c0.this.X(f11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Float invoke(Float f11) {
            return a(f11.floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class g extends u implements wn0.a<Integer> {
        g() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(c0.this.a() ? c0.this.R() : c0.this.v());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class h extends u implements wn0.a<Integer> {
        h() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            int iV;
            if (!c0.this.a()) {
                iV = c0.this.v();
            } else if (c0.this.N() != -1) {
                iV = c0.this.N();
            } else if (Math.abs(c0.this.w()) >= Math.abs(c0.this.L())) {
                iV = c0.this.B() ? c0.this.getFirstVisiblePage() + 1 : c0.this.getFirstVisiblePage();
            } else {
                iV = c0.this.v();
            }
            return Integer.valueOf(c0.this.s(iV));
        }
    }

    public c0() {
        this(0, BitmapDescriptorFactory.HUE_RED, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int N() {
        return this.programmaticScrollTargetPage.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R() {
        return this.settledPageState.b();
    }

    private final boolean T(float scrollDelta) {
        if (C().getOrientation() == p021s1.p.Vertical) {
            if (Math.signum(scrollDelta) == Math.signum(-j3.g.n(S()))) {
                return true;
            }
        } else if (Math.signum(scrollDelta) == Math.signum(-j3.g.m(S()))) {
            return true;
        }
        return U();
    }

    private final boolean U() {
        return ((int) j3.g.m(S())) == 0 && ((int) j3.g.n(S())) == 0;
    }

    private final void W(float delta, n info) {
        androidx.compose.foundation.lazy.layout.d.b bVar;
        androidx.compose.foundation.lazy.layout.d.b bVar2;
        androidx.compose.foundation.lazy.layout.d.b bVar3;
        if (this.prefetchingEnabled && !info.l().isEmpty()) {
            boolean z11 = delta > BitmapDescriptorFactory.HUE_RED;
            int index = z11 ? ((p025y1.f) v.A0(info.l())).getIndex() + info.getBeyondViewportPageCount() + 1 : (((p025y1.f) v.o0(info.l())).getIndex() - info.getBeyondViewportPageCount()) - 1;
            if (index < 0 || index >= F()) {
                return;
            }
            if (index != this.indexToPrefetch) {
                if (this.wasPrefetchingForward != z11 && (bVar3 = this.currentPrefetchHandle) != null) {
                    bVar3.cancel();
                }
                this.wasPrefetchingForward = z11;
                this.indexToPrefetch = index;
                this.currentPrefetchHandle = this.prefetchState.e(index, this.premeasureConstraints);
            }
            if (z11) {
                if ((((p025y1.f) v.A0(info.l())).getOffset() + (info.getPageSize() + info.getPageSpacing())) - info.getViewportEndOffset() >= delta || (bVar2 = this.currentPrefetchHandle) == null) {
                    return;
                }
                bVar2.b();
                return;
            }
            if (info.getViewportStartOffset() - ((p025y1.f) v.o0(info.l())).getOffset() >= (-delta) || (bVar = this.currentPrefetchHandle) == null) {
                return;
            }
            bVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float X(float delta) {
        long jA = y.a(this);
        float f11 = this.accumulator + delta;
        long jF = yn0.a.f(f11);
        this.accumulator = f11 - jF;
        if (Math.abs(delta) < 1.0E-4f) {
            return delta;
        }
        long j11 = jA + jF;
        long jP = n.p(j11, this.minScrollOffset, this.maxScrollOffset);
        boolean z11 = j11 != jP;
        long j12 = jP - jA;
        float f12 = j12;
        this.previousPassDelta = f12;
        if (Math.abs(j12) != 0) {
            this.isLastScrollForwardState.setValue(Boolean.valueOf(f12 > BitmapDescriptorFactory.HUE_RED));
            this.isLastScrollBackwardState.setValue(Boolean.valueOf(f12 < BitmapDescriptorFactory.HUE_RED));
        }
        u value = this.pagerLayoutInfoState.getValue();
        int i11 = (int) j12;
        if (value.v(-i11)) {
            o(value, true);
            m0.d(this.placementScopeInvalidator);
            this.layoutWithoutMeasurement++;
        } else {
            this.scrollPosition.a(i11);
            y0 y0VarO = O();
            if (y0VarO != null) {
                y0VarO.f();
            }
            this.layoutWithMeasurement++;
        }
        return (z11 ? Long.valueOf(j12) : Float.valueOf(delta)).floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r8.b(r6, r7, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object Y(p025y1.c0 r5, q1.h0 r6, wn0.p<? super p021s1.u, ? super p013kotlin.coroutines.Continuation<? super jn0.h0>, ? extends java.lang.Object> r7, p013kotlin.coroutines.Continuation<? super jn0.h0> r8) {
        /*
            boolean r0 = r8 instanceof y1.c0.d
            if (r0 == 0) goto L13
            r0 = r8
            y1.c0$d r0 = (y1.c0.d) r0
            int r1 = r0.f124477s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f124477s = r1
            goto L18
        L13:
            y1.c0$d r0 = new y1.c0$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f124475q
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f124477s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.f124472n
            y1.c0 r5 = (p025y1.c0) r5
            jn0.t.b(r8)
            goto L7b
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.f124474p
            r7 = r5
            wn0.p r7 = (wn0.p) r7
            java.lang.Object r5 = r0.f124473o
            r6 = r5
            q1.h0 r6 = (q1.h0) r6
            java.lang.Object r5 = r0.f124472n
            y1.c0 r5 = (p025y1.c0) r5
            jn0.t.b(r8)
            goto L5c
        L4a:
            jn0.t.b(r8)
            r0.f124472n = r5
            r0.f124473o = r6
            r0.f124474p = r7
            r0.f124477s = r4
            java.lang.Object r8 = r5.q(r0)
            if (r8 != r1) goto L5c
            goto L7a
        L5c:
            boolean r8 = r5.a()
            if (r8 != 0) goto L69
            int r8 = r5.v()
            r5.h0(r8)
        L69:
            s1.x r8 = r5.scrollableState
            r0.f124472n = r5
            r2 = 0
            r0.f124473o = r2
            r0.f124474p = r2
            r0.f124477s = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L7b
        L7a:
            return r1
        L7b:
            r6 = -1
            r5.f0(r6)
            jn0.h0 r5 = jn0.h0.f84049a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p025y1.c0.Y(y1.c0, q1.h0, wn0.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object a0(c0 c0Var, int i11, float f11, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i12 & 2) != 0) {
            f11 = BitmapDescriptorFactory.HUE_RED;
        }
        return c0Var.Z(i11, f11, continuation);
    }

    private final void b0(boolean z11) {
        this.canScrollBackward.setValue(Boolean.valueOf(z11));
    }

    private final void c0(boolean z11) {
        this.canScrollForward.setValue(Boolean.valueOf(z11));
    }

    private final void f0(int i11) {
        this.programmaticScrollTargetPage.a(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(y0 y0Var) {
        this.remeasurement.setValue(y0Var);
    }

    private final void h0(int i11) {
        this.settledPageState.a(i11);
    }

    private final void k0(u result) {
        androidx.compose.runtime.snapshots.g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
        androidx.compose.runtime.snapshots.g gVarD = companion.d();
        wn0.l<Object, h0> lVarH = gVarD != null ? gVarD.h() : null;
        androidx.compose.runtime.snapshots.g gVarF = companion.f(gVarD);
        try {
            if (Math.abs(this.previousPassDelta) > 0.5f && this.prefetchingEnabled && T(this.previousPassDelta)) {
                W(this.previousPassDelta, result);
            }
            h0 h0Var = h0.f84049a;
        } finally {
            companion.m(gVarD, gVarF, lVarH);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object n(c0 c0Var, int i11, float f11, i iVar, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i12 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i12 & 4) != 0) {
            iVar = p019p1.j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
        }
        return c0Var.m(i11, f11, iVar, continuation);
    }

    public static /* synthetic */ void p(c0 c0Var, u uVar, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        c0Var.o(uVar, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(Continuation<? super h0> continuation) {
        Object objI = this.awaitLayoutModifier.i(continuation);
        return objI == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objI : h0.f84049a;
    }

    private final void r(n info) {
        if (this.indexToPrefetch == -1 || info.l().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != (this.wasPrefetchingForward ? ((p025y1.f) v.A0(info.l())).getIndex() + info.getBeyondViewportPageCount() + 1 : (((p025y1.f) v.o0(info.l())).getIndex() - info.getBeyondViewportPageCount()) - 1)) {
            this.indexToPrefetch = -1;
            androidx.compose.foundation.lazy.layout.d.b bVar = this.currentPrefetchHandle;
            if (bVar != null) {
                bVar.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int s(int i11) {
        if (F() > 0) {
            return n.n(i11, 0, F() - 1);
        }
        return 0;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final l getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public boolean B() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    public final n C() {
        return this.pagerLayoutInfoState.getValue();
    }

    public final p1<h0> D() {
        return this.measurementScopeInvalidator;
    }

    public final bo0.j E() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public abstract int F();

    public final int G() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    public final int H() {
        return G() + I();
    }

    public final int I() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final e0 getPinnedPages() {
        return this.pinnedPages;
    }

    public final p1<h0> K() {
        return this.placementScopeInvalidator;
    }

    public final float L() {
        return Math.min(this.density.O1(d0.i()), G() / 2.0f) / G();
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.d getPrefetchState() {
        return this.prefetchState;
    }

    public final y0 O() {
        return (y0) this.remeasurement.getValue();
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final z0 getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    public final int Q() {
        return ((Number) this.settledPage.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long S() {
        return ((j3.g) this.upDownDifference.getValue()).getPackedValue();
    }

    public final int V(r itemProvider, int currentPage) {
        return this.scrollPosition.e(itemProvider, currentPage);
    }

    public final Object Z(int i11, float f11, Continuation<? super h0> continuation) {
        Object objF = x.f(this, null, new e(f11, i11, null), continuation, 1, null);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : h0.f84049a;
    }

    @Override // p021s1.x
    public boolean a() {
        return this.scrollableState.a();
    }

    @Override // p021s1.x
    public Object b(q1.h0 h0Var, p<? super p021s1.u, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) {
        return Y(this, h0Var, pVar, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p021s1.x
    public final boolean c() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // p021s1.x
    public float d(float delta) {
        return this.scrollableState.d(delta);
    }

    public final void d0(w4.d dVar) {
        this.density = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p021s1.x
    public final boolean e() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    public final void e0(long j11) {
        this.premeasureConstraints = j11;
    }

    public final void i0(long j11) {
        this.upDownDifference.setValue(j3.g.d(j11));
    }

    public final void j0(int page, float offsetFraction, boolean forceRemeasure) {
        this.scrollPosition.f(page, offsetFraction);
        if (!forceRemeasure) {
            m0.d(this.measurementScopeInvalidator);
            return;
        }
        y0 y0VarO = O();
        if (y0VarO != null) {
            y0VarO.f();
        }
    }

    public final void l0(p021s1.u uVar, int i11) {
        f0(s(i11));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        if (p025y1.d0.d(r1, r10, r3, r4, r5, r6) == r0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(int r10, float r11, p019p1.i<java.lang.Float> r12, p013kotlin.coroutines.Continuation<? super jn0.h0> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof y1.c0.a
            if (r0 == 0) goto L14
            r0 = r13
            y1.c0$a r0 = (y1.c0.a) r0
            int r1 = r0.f124469t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f124469t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            y1.c0$a r0 = new y1.c0$a
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.f124467r
            java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f124469t
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L48
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            jn0.t.b(r13)
            goto La5
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            float r11 = r6.f124466q
            int r10 = r6.f124465p
            java.lang.Object r12 = r6.f124464o
            p1.i r12 = (p019p1.i) r12
            java.lang.Object r1 = r6.f124463n
            y1.c0 r1 = (p025y1.c0) r1
            jn0.t.b(r13)
        L46:
            r4 = r12
            goto L76
        L48:
            jn0.t.b(r13)
            int r13 = r9.v()
            if (r10 != r13) goto L5a
            float r13 = r9.w()
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 != 0) goto L5a
            goto L60
        L5a:
            int r13 = r9.F()
            if (r13 != 0) goto L63
        L60:
            jn0.h0 r10 = jn0.h0.f84049a
            return r10
        L63:
            r6.f124463n = r9
            r6.f124464o = r12
            r6.f124465p = r10
            r6.f124466q = r11
            r6.f124469t = r3
            java.lang.Object r13 = r9.q(r6)
            if (r13 != r0) goto L74
            goto La4
        L74:
            r1 = r9
            goto L46
        L76:
            double r12 = (double) r11
            r7 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r3 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r3 > 0) goto La8
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 > 0) goto La8
            int r10 = r1.s(r10)
            int r12 = r1.H()
            float r12 = (float) r12
            float r3 = r11 * r12
            r11 = r1
            x1.h r1 = r11.animatedScrollScope
            y1.c0$b r5 = new y1.c0$b
            r5.<init>()
            r11 = 0
            r6.f124463n = r11
            r6.f124464o = r11
            r6.f124469t = r2
            r2 = r10
            java.lang.Object r10 = p025y1.d0.a(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto La5
        La4:
            return r0
        La5:
            jn0.h0 r10 = jn0.h0.f84049a
            return r10
        La8:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "pageOffsetFraction "
            r10.append(r12)
            r10.append(r11)
            java.lang.String r11 = " is not within the range -0.5 to 0.5"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p025y1.c0.m(int, float, p1.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void o(u result, boolean visibleItemsStayedTheSame) {
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.j(result.getCurrentPageOffsetFraction());
        } else {
            this.scrollPosition.k(result);
            r(result);
        }
        this.pagerLayoutInfoState.setValue(result);
        c0(result.getCanScrollForward());
        b0(result.o());
        p025y1.e eVarT = result.getFirstVisiblePage();
        if (eVarT != null) {
            this.firstVisiblePage = eVarT.getIndex();
        }
        this.firstVisiblePageOffset = result.getFirstVisiblePageScrollOffset();
        k0(result);
        this.maxScrollOffset = d0.g(result, F());
        this.minScrollOffset = d0.h(result, F());
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final p024x1.b getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final j getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    public final int v() {
        return this.scrollPosition.b();
    }

    public final float w() {
        return this.scrollPosition.c();
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final w4.d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final int getFirstVisiblePageOffset() {
        return this.firstVisiblePageOffset;
    }

    public c0(int i11, float f11, q0 q0Var) {
        double d11 = f11;
        if (-0.5d > d11 || d11 > 0.5d) {
            throw new IllegalArgumentException(("currentPageOffsetFraction " + f11 + " is not within the range -0.5 to 0.5").toString());
        }
        this.upDownDifference = s3.d(j3.g.d(j3.g.INSTANCE.c()), null, 2, null);
        this.animatedScrollScope = q.a(this);
        x xVar = new x(i11, f11, this);
        this.scrollPosition = xVar;
        this.firstVisiblePage = i11;
        this.maxScrollOffset = Long.MAX_VALUE;
        this.scrollableState = C4788y.a(new f());
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.pagerLayoutInfoState = n3.h(d0.j(), n3.j());
        this.density = d0.f124489c;
        this.internalInteractionSource = k.a();
        this.programmaticScrollTargetPage = e3.a(-1);
        this.settledPageState = e3.a(i11);
        this.settledPage = n3.d(n3.q(), new g());
        this.targetPage = n3.d(n3.q(), new h());
        this.prefetchState = new androidx.compose.foundation.lazy.layout.d(q0Var, null, 2, null);
        this.beyondBoundsInfo = new j();
        this.awaitLayoutModifier = new p024x1.b();
        this.remeasurement = s3.d(null, null, 2, null);
        this.remeasurementModifier = new c();
        this.premeasureConstraints = w4.c.b(0, 0, 0, 0, 15, null);
        this.pinnedPages = new e0();
        xVar.getNearestRangeState();
        this.placementScopeInvalidator = m0.c(null, 1, null);
        this.measurementScopeInvalidator = m0.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = s3.d(bool, null, 2, null);
        this.canScrollBackward = s3.d(bool, null, 2, null);
        this.isLastScrollForwardState = s3.d(bool, null, 2, null);
        this.isLastScrollBackwardState = s3.d(bool, null, 2, null);
    }

    public /* synthetic */ c0(int i11, float f11, q0 q0Var, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? BitmapDescriptorFactory.HUE_RED : f11, (i12 & 4) != 0 ? null : q0Var);
    }

    public c0(int i11, float f11) {
        this(i11, f11, null);
    }
}
