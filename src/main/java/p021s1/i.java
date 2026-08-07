package p021s1;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.platform.e3;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import java.util.List;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p013kotlin.jvm.internal.m0;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.u;
import v3.PointerInputChange;
import v3.f0;
import v3.k0;
import v3.m;
import v3.w;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001ad\u0010\u0013\u001a\u00020\u0005*\u00020\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0088\u0001\u0010\u0019\u001a\u00020\u0005*\u00020\f2\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00152\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0012H\u0080@¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001b\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000b\u001a\u001e\u0010\u001d\u001a\u00020\u0007*\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001e\u0010#\u001a\u00020\"*\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010$\"\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"\u0014\u0010)\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'\"\u0014\u0010*\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Lv3/c;", "Lv3/w;", "pointerId", "Lkotlin/Function1;", "Lv3/x;", "Ljn0/h0;", "onDrag", "", "f", "(Lv3/c;JLwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(Lv3/c;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lv3/f0;", "Lj3/g;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "Lkotlin/Function2;", DateTokenConverter.CONVERTER_KEY, "(Lv3/f0;Lwn0/l;Lwn0/a;Lwn0/a;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "shouldAwaitTouchSlop", "Ls1/p;", "orientationLock", "e", "(Lv3/f0;Lwn0/q;Lwn0/l;Lwn0/a;Lwn0/a;Ls1/p;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "Lv3/m;", "g", "(Lv3/m;J)Z", "Landroidx/compose/ui/platform/e3;", "Lv3/k0;", "pointerType", "", "h", "(Landroidx/compose/ui/platform/e3;I)F", "Lw4/h;", "a", Gender.FEMALE, "mouseSlop", "defaultTouchSlop", "mouseToTouchSlopRatio", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f109546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f109547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f109548c;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {967}, m = "awaitDragOrCancellation-rnUCldI", n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109549n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f109550o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f109551p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f109552q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109551p = obj;
            this.f109552q |= Integer.MIN_VALUE;
            return i.b(null, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {898}, m = "awaitLongPressOrCancellation-rnUCldI", n = {"initialDown", "longPress"}, s = {"L$0", "L$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109553n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f109554o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f109555p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f109556q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109555p = obj;
            this.f109556q |= Integer.MIN_VALUE;
            return i.c(null, 0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/c;", "Ljn0/h0;", "<anonymous>", "(Lv3/c;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {901, 918}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", "event", "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
    static final class c extends RestrictedSuspendLambda implements p<v3.c, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109557n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f109558o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f109559p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private /* synthetic */ Object f109560q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ n0<PointerInputChange> f109561r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ n0<PointerInputChange> f109562s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n0<PointerInputChange> n0Var, n0<PointerInputChange> n0Var2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f109561r = n0Var;
            this.f109562s = n0Var2;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v3.c cVar, Continuation<? super h0> continuation) {
            return ((c) create(cVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f109561r, this.f109562s, continuation);
            cVar.f109560q = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x005f  */
        /* JADX WARN: Code duplicated, block: B:20:0x006c A[LOOP:2: B:16:0x005d->B:20:0x006c, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:69:0x006f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:70:0x0070 A[EDGE_INSN: B:70:0x0070->B:22:0x0070 BREAK  A[LOOP:2: B:16:0x005d->B:20:0x006c], SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v7, types: [T, v3.x] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ac -> B:35:0x00af). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 328
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: s1.i.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lv3/x;", "<anonymous parameter 0>", "slopTriggerChange", "Lj3/g;", "<anonymous parameter 2>", "Ljn0/h0;", "a", "(Lv3/x;Lv3/x;J)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements q<PointerInputChange, PointerInputChange, j3.g, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<j3.g, h0> f109563c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(l<? super j3.g, h0> lVar) {
            super(3);
            this.f109563c = lVar;
        }

        public final void a(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j11) {
            this.f109563c.invoke(j3.g.d(pointerInputChange2.getPosition()));
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, j3.g gVar) {
            a(pointerInputChange, pointerInputChange2, gVar.getPackedValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv3/x;", "it", "Ljn0/h0;", "a", "(Lv3/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements l<PointerInputChange, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f109564c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(wn0.a<h0> aVar) {
            super(1);
            this.f109564c = aVar;
        }

        public final void a(PointerInputChange pointerInputChange) {
            this.f109564c.invoke();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(PointerInputChange pointerInputChange) {
            a(pointerInputChange);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f109565c = new f();

        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/c;", "Ljn0/h0;", "<anonymous>", "(Lv3/c;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 972, 1014, 1025}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "initialDown", "awaitTouchSlop", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$2", "L$3", "L$4"})
    static final class g extends RestrictedSuspendLambda implements p<v3.c, Continuation<? super h0>, Object> {
        final /* synthetic */ q<PointerInputChange, PointerInputChange, j3.g, h0> A;
        final /* synthetic */ p<PointerInputChange, j3.g, h0> B;
        final /* synthetic */ wn0.a<h0> C;
        final /* synthetic */ l<PointerInputChange, h0> D;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109566n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f109567o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f109568p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f109569q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f109570r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f109571s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f109572t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        float f109573u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f109574v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private /* synthetic */ Object f109575w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ wn0.a<Boolean> f109576x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ m0 f109577y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ p f109578z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(wn0.a<Boolean> aVar, m0 m0Var, p pVar, q<? super PointerInputChange, ? super PointerInputChange, ? super j3.g, h0> qVar, p<? super PointerInputChange, ? super j3.g, h0> pVar2, wn0.a<h0> aVar2, l<? super PointerInputChange, h0> lVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f109576x = aVar;
            this.f109577y = m0Var;
            this.f109578z = pVar;
            this.A = qVar;
            this.B = pVar2;
            this.C = aVar2;
            this.D = lVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v3.c cVar, Continuation<? super h0> continuation) {
            return ((g) create(cVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.f109576x, this.f109577y, this.f109578z, this.A, this.B, this.C, this.D, continuation);
            gVar.f109575w = obj;
            return gVar;
        }

        /* JADX WARN: Code duplicated, block: B:145:0x0175 A[EDGE_INSN: B:145:0x0175->B:42:0x0175 BREAK  A[LOOP:2: B:36:0x0150->B:40:0x0169], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:37:0x0152  */
        /* JADX WARN: Code duplicated, block: B:40:0x0169 A[LOOP:2: B:36:0x0150->B:40:0x0169, LOOP_END] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0111 -> B:76:0x0207). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x017b -> B:45:0x017d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01cb -> B:76:0x0207). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01f7 -> B:73:0x01fd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0275 -> B:90:0x0278). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 826
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: s1.i.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {108}, m = "drag-jO51t88", n = {"$this$drag_u2djO51t88", "onDrag"}, s = {"L$0", "L$1"})
    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f109579n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f109580o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f109581p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f109582q;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109581p = obj;
            this.f109582q |= Integer.MIN_VALUE;
            return i.f(null, 0L, null, this);
        }
    }

    static {
        float fG = w4.h.g((float) 0.125d);
        f109546a = fG;
        float fG2 = w4.h.g(18);
        f109547b = fG2;
        f109548c = fG / fG2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e A[LOOP:0: B:23:0x0078->B:27:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0092 A[EDGE_INSN: B:54:0x0092->B:29:0x0092 BREAK  A[LOOP:0: B:23:0x0078->B:27:0x008e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(v3.c r17, long r18, p013kotlin.coroutines.Continuation<? super v3.PointerInputChange> r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p021s1.i.b(v3.c, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Object, v3.x] */
    /* JADX WARN: Type inference failed for: r10v7, types: [v3.x] */
    public static final Object c(v3.c cVar, long j11, Continuation<? super PointerInputChange> continuation) {
        b bVar;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        n0 n0Var;
        PointerInputChange pointerInputChange3;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f109556q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f109556q = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f109555p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f109556q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var = (n0) bVar.f109554o;
            pointerInputChange2 = (PointerInputChange) bVar.f109553n;
            try {
                t.b(obj);
                return null;
            } catch (PointerEventTimeoutCancellationException unused) {
                pointerInputChange3 = (PointerInputChange) n0Var.f86529a;
                if (pointerInputChange3 == null) {
                    return pointerInputChange2;
                }
                return pointerInputChange3;
            }
        }
        t.b(obj);
        if (g(cVar.s1(), j11)) {
            return null;
        }
        List<PointerInputChange> listC = cVar.s1().c();
        int size = listC.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = listC.get(i13);
            if (w.d(pointerInputChange.getId(), j11)) {
                break;
            }
            i13++;
        }
        pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 == 0) {
            return null;
        }
        n0 n0Var2 = new n0();
        n0 n0Var3 = new n0();
        n0Var3.f86529a = pointerInputChange2;
        long jF = cVar.getViewConfiguration().f();
        try {
            c cVar2 = new c(n0Var3, n0Var2, null);
            bVar.f109553n = pointerInputChange2;
            bVar.f109554o = n0Var2;
            bVar.f109556q = 1;
            if (cVar.o0(jF, cVar2, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return null;
        } catch (PointerEventTimeoutCancellationException unused2) {
            n0Var = n0Var2;
            pointerInputChange3 = (PointerInputChange) n0Var.f86529a;
            if (pointerInputChange3 == null) {
                return pointerInputChange2;
            }
            return pointerInputChange3;
        }
    }

    public static final Object d(f0 f0Var, l<? super j3.g, h0> lVar, wn0.a<h0> aVar, wn0.a<h0> aVar2, p<? super PointerInputChange, ? super j3.g, h0> pVar, Continuation<? super h0> continuation) {
        Object objE = e(f0Var, new d(lVar), new e(aVar), aVar2, f.f109565c, null, pVar, continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : h0.f84049a;
    }

    public static final Object e(f0 f0Var, q<? super PointerInputChange, ? super PointerInputChange, ? super j3.g, h0> qVar, l<? super PointerInputChange, h0> lVar, wn0.a<h0> aVar, wn0.a<Boolean> aVar2, p pVar, p<? super PointerInputChange, ? super j3.g, h0> pVar2, Continuation<? super h0> continuation) {
        Object objD = n.d(f0Var, new g(aVar2, new m0(), pVar, qVar, pVar2, aVar, lVar, null), continuation);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object f(v3.c r4, long r5, wn0.l<? super v3.PointerInputChange, jn0.h0> r7, p013kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof s1.i.h
            if (r0 == 0) goto L13
            r0 = r8
            s1.i$h r0 = (s1.i.h) r0
            int r1 = r0.f109582q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109582q = r1
            goto L18
        L13:
            s1.i$h r0 = new s1.i$h
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f109581p
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f109582q
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f109580o
            wn0.l r4 = (wn0.l) r4
            java.lang.Object r5 = r0.f109579n
            v3.c r5 = (v3.c) r5
            jn0.t.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            jn0.t.b(r8)
        L3e:
            r0.f109579n = r4
            r0.f109580o = r7
            r0.f109582q = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            v3.x r8 = (v3.PointerInputChange) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r4
        L55:
            boolean r5 = v3.n.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.getId()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: p021s1.i.f(v3.c, long, wn0.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(m mVar, long j11) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> listC = mVar.c();
        int size = listC.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = listC.get(i11);
            if (w.d(pointerInputChange.getId(), j11)) {
                break;
            }
            i11++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z11 = true;
        }
        return true ^ z11;
    }

    public static final float h(e3 e3Var, int i11) {
        return k0.g(i11, k0.INSTANCE.b()) ? e3Var.c() * f109548c : e3Var.c();
    }
}
