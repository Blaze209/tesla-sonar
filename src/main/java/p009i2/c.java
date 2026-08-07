package p009i2;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import jn0.h0;
import jn0.t;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.b2;
import p020r2.l1;
import p020r2.n3;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;
import wn0.a;
import wn0.l;
import wn0.p;
import wn0.q;
import wn0.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\b\u0001\u0018\u0000 <*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00012BU\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001f\u001a\u00020\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\b\b\u0002\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b!\u0010\"JJ\u0010)\u001a\u00020\u001e2\b\b\u0002\u0010$\u001a\u00020#2.\u0010(\u001a*\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020%H\u0086@¢\u0006\u0004\b)\u0010*JX\u0010,\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00028\u00002\b\b\u0002\u0010$\u001a\u00020#24\u0010(\u001a0\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020+H\u0086@¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0000¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005¢\u0006\u0004\b1\u00100R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u00103\u001a\u0004\b?\u00105R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010I\u001a\u00020D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR+\u0010\u0010\u001a\u00028\u00002\u0006\u0010J\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001b\u0010\u0016\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010NR\u001b\u0010U\u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b,\u0010R\u001a\u0004\bT\u0010NR+\u0010\u000f\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010V\u001a\u0004\bW\u0010\u001a\"\u0004\bX\u0010YR\u001b\u0010\\\u001a\u00020\u00058GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010R\u001a\u0004\b[\u0010\u001aR+\u0010_\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010V\u001a\u0004\b]\u0010\u001a\"\u0004\b^\u0010YR/\u0010b\u001a\u0004\u0018\u00018\u00002\b\u0010J\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010L\u001a\u0004\b`\u0010N\"\u0004\ba\u0010PR7\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010L\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0014\u0010i\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010hR\u0011\u0010l\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006m"}, d2 = {"Li2/c;", "T", "", "initialValue", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Lp1/i;", "animationSpec", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;Lwn0/l;Lwn0/a;Lp1/i;Lwn0/l;)V", "offset", "currentValue", "velocity", "l", "(FLjava/lang/Object;F)Ljava/lang/Object;", "m", "(FLjava/lang/Object;)Ljava/lang/Object;", "targetValue", "H", "(Ljava/lang/Object;)Z", "A", "()F", "Li2/j0;", "newAnchors", "newTarget", "Ljn0/h0;", "I", "(Li2/j0;Ljava/lang/Object;)V", "G", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lq1/h0;", "dragPriority", "Lkotlin/Function3;", "Li2/b;", "Lkotlin/coroutines/Continuation;", "block", "j", "(Lq1/h0;Lwn0/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function4;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Lq1/h0;Lwn0/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "z", "(F)F", "n", "a", "Lwn0/l;", "getPositionalThreshold$material_release", "()Lwn0/l;", "b", "Lwn0/a;", "getVelocityThreshold$material_release", "()Lwn0/a;", "c", "Lp1/i;", "p", "()Lp1/i;", DateTokenConverter.CONVERTER_KEY, "r", "Li2/h1;", "e", "Li2/h1;", "dragMutex", "Ls1/l;", "f", "Ls1/l;", "u", "()Ls1/l;", "draggableState", "<set-?>", "g", "Lr2/p1;", "s", "()Ljava/lang/Object;", "C", "(Ljava/lang/Object;)V", "h", "Lr2/y3;", "x", "q", "closestValue", "Lr2/l1;", "w", Gender.FEMALE, "(F)V", "k", "getProgress", ReactProgressBarViewManager.PROP_PROGRESS, "v", "E", "lastVelocity", "t", "D", "dragTarget", "o", "()Li2/j0;", "B", "(Li2/j0;)V", "anchors", "Li2/b;", "anchoredDragScope", "y", "()Z", "isAnimationRunning", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<Float, Float> positionalThreshold;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a<Float> velocityThreshold;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p019p1.i<Float> animationSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l<T, Boolean> confirmValueChange;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p1 currentValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h1 dragMutex = new h1();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p021s1.l draggableState = new h(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final y3 targetValue = n3.e(new j(this));

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final y3 closestValue = n3.e(new g(this));

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l1 offset = b2.a(Float.NaN);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final y3 progress = n3.d(n3.q(), new i(this));

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final l1 lastVelocity = b2.a(BitmapDescriptorFactory.HUE_RED);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p1 dragTarget = s3.d(null, null, 2, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p1 anchors = s3.d(androidx.compose.material.a.i(), null, 2, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final p009i2.b anchoredDragScope = new f(this);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {539}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74166n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f74167o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ c<T> f74168p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f74169q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c<T> cVar, Continuation<? super b> continuation) {
            super(continuation);
            this.f74168p = cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74167o = obj;
            this.f74169q |= Integer.MIN_VALUE;
            return this.f74168p.j(null, null, this);
        }
    }

    /* JADX INFO: renamed from: i2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {540}, m = "invokeSuspend", n = {}, s = {})
    static final class C1551c extends SuspendLambda implements l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74170n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ c<T> f74171o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ q<p009i2.b, j0<T>, Continuation<? super h0>, Object> f74172p;

        /* JADX INFO: renamed from: i2.c$c$a */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Li2/j0;", "b", "()Li2/j0;"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.a<j0<T>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c<T> f74173c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c<T> cVar) {
                super(0);
                this.f74173c = cVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final j0<T> invoke() {
                return this.f74173c.o();
            }
        }

        /* JADX INFO: renamed from: i2.c$c$b */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Li2/j0;", "latestAnchors", "Ljn0/h0;", "<anonymous>", "(Li2/j0;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", i = {}, l = {541}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements p<j0<T>, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f74174n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f74175o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ q<p009i2.b, j0<T>, Continuation<? super h0>, Object> f74176p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ c<T> f74177q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(q<? super p009i2.b, ? super j0<T>, ? super Continuation<? super h0>, ? extends Object> qVar, c<T> cVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f74176p = qVar;
                this.f74177q = cVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j0<T> j0Var, Continuation<? super h0> continuation) {
                return ((b) create(j0Var, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f74176p, this.f74177q, continuation);
                bVar.f74175o = obj;
                return bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f74174n;
                if (i11 == 0) {
                    t.b(obj);
                    j0<T> j0Var = (j0) this.f74175o;
                    q<p009i2.b, j0<T>, Continuation<? super h0>, Object> qVar = this.f74176p;
                    p009i2.b bVar = ((c) this.f74177q).anchoredDragScope;
                    this.f74174n = 1;
                    if (qVar.invoke(bVar, j0Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1551c(c<T> cVar, q<? super p009i2.b, ? super j0<T>, ? super Continuation<? super h0>, ? extends Object> qVar, Continuation<? super C1551c> continuation) {
            super(1, continuation);
            this.f74171o = cVar;
            this.f74172p = qVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return new C1551c(this.f74171o, this.f74172p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f74170n;
            if (i11 == 0) {
                t.b(obj);
                a aVar = new a(this.f74171o);
                b bVar = new b(this.f74172p, this.f74171o, null);
                this.f74170n = 1;
                if (androidx.compose.material.a.j(aVar, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((C1551c) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {585}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74178n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f74179o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ c<T> f74180p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f74181q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c<T> cVar, Continuation<? super d> continuation) {
            super(continuation);
            this.f74180p = cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74179o = obj;
            this.f74181q |= Integer.MIN_VALUE;
            return this.f74180p.i(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", i = {}, l = {587}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements l<Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74182n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ c<T> f74183o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ T f74184p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ r<p009i2.b, j0<T>, T, Continuation<? super h0>, Object> f74185q;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlin/Pair;", "Li2/j0;", "b", "()Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.a<Pair<? extends j0<T>, ? extends T>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c<T> f74186c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c<T> cVar) {
                super(0);
                this.f74186c = cVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Pair<j0<T>, T> invoke() {
                return x.a(this.f74186c.o(), this.f74186c.x());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlin/Pair;", "Li2/j0;", "<name for destructuring parameter 0>", "Ljn0/h0;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", i = {}, l = {590}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements p<Pair<? extends j0<T>, ? extends T>, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f74187n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f74188o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ r<p009i2.b, j0<T>, T, Continuation<? super h0>, Object> f74189p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ c<T> f74190q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(r<? super p009i2.b, ? super j0<T>, ? super T, ? super Continuation<? super h0>, ? extends Object> rVar, c<T> cVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f74189p = rVar;
                this.f74190q = cVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Pair<? extends j0<T>, ? extends T> pair, Continuation<? super h0> continuation) {
                return ((b) create(pair, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f74189p, this.f74190q, continuation);
                bVar.f74188o = obj;
                return bVar;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to i2.c$e$b for r5v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r5.f74187n
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    jn0.t.b(r6)
                    goto L39
                Lf:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L17:
                    jn0.t.b(r6)
                    java.lang.Object r6 = r5.f74188o
                    kotlin.Pair r6 = (p013kotlin.Pair) r6
                    java.lang.Object r1 = r6.a()
                    i2.j0 r1 = (p009i2.j0) r1
                    java.lang.Object r6 = r6.b()
                    wn0.r<i2.b, i2.j0<T>, T, kotlin.coroutines.Continuation<? super jn0.h0>, java.lang.Object> r3 = r5.f74189p
                    i2.c<T> r4 = r5.f74190q
                    i2.b r4 = p009i2.c.c(r4)
                    r5.f74187n = r2
                    java.lang.Object r6 = r3.invoke(r4, r1, r6, r5)
                    if (r6 != r0) goto L39
                    return r0
                L39:
                    jn0.h0 r6 = jn0.h0.f84049a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: i2.c.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(c<T> cVar, T t11, r<? super p009i2.b, ? super j0<T>, ? super T, ? super Continuation<? super h0>, ? extends Object> rVar, Continuation<? super e> continuation) {
            super(1, continuation);
            this.f74183o = cVar;
            this.f74184p = t11;
            this.f74185q = rVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return new e(this.f74183o, this.f74184p, this.f74185q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f74182n;
            if (i11 == 0) {
                t.b(obj);
                this.f74183o.D(this.f74184p);
                a aVar = new a(this.f74183o);
                b bVar = new b(this.f74185q, this.f74183o, null);
                this.f74182n = 1;
                if (androidx.compose.material.a.j(aVar, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super h0> continuation) {
            return ((e) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"i2/c$f", "Li2/b;", "", "newOffset", "lastKnownVelocity", "Ljn0/h0;", "b", "(FF)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f implements p009i2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c<T> f74191a;

        f(c<T> cVar) {
            this.f74191a = cVar;
        }

        @Override // p009i2.b
        public void b(float newOffset, float lastKnownVelocity) {
            this.f74191a.F(newOffset);
            this.f74191a.E(lastKnownVelocity);
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends u implements a<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c<T> f74192c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(c<T> cVar) {
            super(0);
            this.f74192c = cVar;
        }

        @Override // wn0.a
        public final T invoke() {
            T t11 = (T) this.f74192c.t();
            if (t11 != null) {
                return t11;
            }
            c<T> cVar = this.f74192c;
            float fW = cVar.w();
            return !Float.isNaN(fW) ? (T) cVar.m(fW, cVar.s()) : cVar.s();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0004*\u0002\u0000\f\b\n\u0018\u00002\u00020\u0001J<\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"i2/c$h", "Ls1/l;", "Lq1/h0;", "dragPriority", "Lkotlin/Function2;", "Ls1/j;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "a", "(Lq1/h0;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "i2/c$h$b", "Li2/c$h$b;", "dragScope", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h implements p021s1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b dragScope;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c<T> f74194b;

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Li2/b;", "Li2/j0;", "it", "Ljn0/h0;", "<anonymous>", "(Li2/b;Li2/j0;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements q<p009i2.b, j0<T>, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f74195n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ p<p021s1.j, Continuation<? super h0>, Object> f74197p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, Continuation continuation) {
                super(3, continuation);
                this.f74197p = pVar;
            }

            @Override // wn0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p009i2.b bVar, j0<T> j0Var, Continuation<? super h0> continuation) {
                return h.this.new a(this.f74197p, continuation).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f74195n;
                if (i11 == 0) {
                    t.b(obj);
                    b bVar = h.this.dragScope;
                    p<p021s1.j, Continuation<? super h0>, Object> pVar = this.f74197p;
                    this.f74195n = 1;
                    if (pVar.invoke(bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"i2/c$h$b", "Ls1/j;", "", "pixels", "Ljn0/h0;", "a", "(F)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b implements p021s1.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c<T> f74198a;

            b(c<T> cVar) {
                this.f74198a = cVar;
            }

            @Override // p021s1.j
            public void a(float pixels) {
                p009i2.b.a(((c) this.f74198a).anchoredDragScope, this.f74198a.z(pixels), BitmapDescriptorFactory.HUE_RED, 2, null);
            }
        }

        h(c<T> cVar) {
            this.f74194b = cVar;
            this.dragScope = new b(cVar);
        }

        @Override // p021s1.l
        public Object a(q1.h0 h0Var, p<? super p021s1.j, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) throws Throwable {
            Object objJ = this.f74194b.j(h0Var, new a(pVar, null), continuation);
            return objJ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ : h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class i extends u implements a<Float> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c<T> f74199c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(c<T> cVar) {
            super(0);
            this.f74199c = cVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float fE = this.f74199c.o().e(this.f74199c.s());
            float fE2 = this.f74199c.o().e(this.f74199c.q()) - fE;
            float fAbs = Math.abs(fE2);
            float f11 = 1.0f;
            if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                float fA = (this.f74199c.A() - fE) / fE2;
                if (fA < 1.0E-6f) {
                    f11 = BitmapDescriptorFactory.HUE_RED;
                } else if (fA <= 0.999999f) {
                    f11 = fA;
                }
            }
            return Float.valueOf(f11);
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends u implements a<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c<T> f74200c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(c<T> cVar) {
            super(0);
            this.f74200c = cVar;
        }

        @Override // wn0.a
        public final T invoke() {
            T t11 = (T) this.f74200c.t();
            if (t11 != null) {
                return t11;
            }
            c<T> cVar = this.f74200c;
            float fW = cVar.w();
            return !Float.isNaN(fW) ? (T) cVar.l(fW, cVar.s(), BitmapDescriptorFactory.HUE_RED) : cVar.s();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class k extends u implements a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c<T> f74201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f74202d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(c<T> cVar, T t11) {
            super(0);
            this.f74201c = cVar;
            this.f74202d = t11;
        }

        public final void b() {
            p009i2.b bVar = ((c) this.f74201c).anchoredDragScope;
            c<T> cVar = this.f74201c;
            T t11 = this.f74202d;
            float fE = cVar.o().e(t11);
            if (!Float.isNaN(fE)) {
                p009i2.b.a(bVar, fE, BitmapDescriptorFactory.HUE_RED, 2, null);
                cVar.D(null);
            }
            cVar.C(t11);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(T t11, l<? super Float, Float> lVar, a<Float> aVar, p019p1.i<Float> iVar, l<? super T, Boolean> lVar2) {
        this.positionalThreshold = lVar;
        this.velocityThreshold = aVar;
        this.animationSpec = iVar;
        this.confirmValueChange = lVar2;
        this.currentValue = s3.d(t11, null, 2, null);
    }

    private final void B(j0<T> j0Var) {
        this.anchors.setValue(j0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(T t11) {
        this.currentValue.setValue(t11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(T t11) {
        this.dragTarget.setValue(t11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(float f11) {
        this.lastVelocity.r(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(float f11) {
        this.offset.r(f11);
    }

    private final boolean H(T targetValue) {
        return this.dragMutex.e(new k(this, targetValue));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void J(c cVar, j0 j0Var, Object obj, int i11, Object obj2) {
        if ((i11 & 2) != 0 && (Float.isNaN(cVar.w()) || (obj = j0Var.b(cVar.w())) == null)) {
            obj = cVar.x();
        }
        cVar.I(j0Var, obj);
    }

    public static /* synthetic */ Object k(c cVar, Object obj, q1.h0 h0Var, r rVar, Continuation continuation, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            h0Var = q1.h0.Default;
        }
        return cVar.i(obj, h0Var, rVar, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T l(float offset, T currentValue, float velocity) {
        j0<T> j0VarO = o();
        float fE = j0VarO.e(currentValue);
        float fFloatValue = this.velocityThreshold.invoke().floatValue();
        if (fE != offset && !Float.isNaN(fE)) {
            if (fE < offset) {
                if (velocity >= fFloatValue) {
                    T tA = j0VarO.a(offset, true);
                    s.h(tA);
                    return tA;
                }
                T tA2 = j0VarO.a(offset, true);
                s.h(tA2);
                if (offset >= Math.abs(fE + Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(j0VarO.e(tA2) - fE))).floatValue()))) {
                    return tA2;
                }
            } else {
                if (velocity <= (-fFloatValue)) {
                    T tA3 = j0VarO.a(offset, false);
                    s.h(tA3);
                    return tA3;
                }
                T tA4 = j0VarO.a(offset, false);
                s.h(tA4);
                float fAbs = Math.abs(fE - Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(fE - j0VarO.e(tA4)))).floatValue()));
                if (offset >= BitmapDescriptorFactory.HUE_RED ? offset <= fAbs : Math.abs(offset) >= fAbs) {
                    return tA4;
                }
            }
        }
        return currentValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T m(float offset, T currentValue) {
        j0<T> j0VarO = o();
        float fE = j0VarO.e(currentValue);
        if (fE != offset && !Float.isNaN(fE)) {
            if (fE < offset) {
                T tA = j0VarO.a(offset, true);
                if (tA != null) {
                    return tA;
                }
            } else {
                T tA2 = j0VarO.a(offset, false);
                if (tA2 != null) {
                    return tA2;
                }
            }
        }
        return currentValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T t() {
        return this.dragTarget.getValue();
    }

    public final float A() {
        if (Float.isNaN(w())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return w();
    }

    public final Object G(float f11, Continuation<? super h0> continuation) {
        T tS = s();
        T tL = l(A(), tS, f11);
        if (this.confirmValueChange.invoke(tL).booleanValue()) {
            Object objF = androidx.compose.material.a.f(this, tL, f11, continuation);
            return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : h0.f84049a;
        }
        Object objF2 = androidx.compose.material.a.f(this, tS, f11, continuation);
        return objF2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF2 : h0.f84049a;
    }

    public final void I(j0<T> newAnchors, T newTarget) {
        if (s.f(o(), newAnchors)) {
            return;
        }
        B(newAnchors);
        if (H(newTarget)) {
            return;
        }
        D(newTarget);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(T t11, q1.h0 h0Var, r<? super p009i2.b, ? super j0<T>, ? super T, ? super Continuation<? super h0>, ? extends Object> rVar, Continuation<? super h0> continuation) throws Throwable {
        d dVar;
        c<T> cVar;
        T tB;
        T tB2;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f74181q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f74181q = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, continuation);
            }
        } else {
            dVar = new d(this, continuation);
        }
        Object obj = dVar.f74179o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f74181q;
        if (i12 == 0) {
            t.b(obj);
            if (o().c(t11)) {
                try {
                    h1 h1Var = this.dragMutex;
                    e eVar = new e(this, t11, rVar, null);
                    dVar.f74178n = this;
                    dVar.f74181q = 1;
                    if (h1Var.d(h0Var, eVar, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cVar = this;
                    cVar.D(null);
                    tB2 = cVar.o().b(cVar.w());
                    if (tB2 != null) {
                        cVar.C(tB2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cVar = this;
                    cVar.D(null);
                    tB = cVar.o().b(cVar.w());
                    if (tB != null) {
                        cVar.C(tB);
                    }
                    throw th;
                }
            } else {
                C(t11);
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (c) dVar.f74178n;
            try {
                t.b(obj);
                cVar.D(null);
                tB2 = cVar.o().b(cVar.w());
                if (tB2 != null && Math.abs(cVar.w() - cVar.o().e(tB2)) <= 0.5f && cVar.confirmValueChange.invoke(tB2).booleanValue()) {
                    cVar.C(tB2);
                }
            } catch (Throwable th3) {
                th = th3;
                cVar.D(null);
                tB = cVar.o().b(cVar.w());
                if (tB != null && Math.abs(cVar.w() - cVar.o().e(tB)) <= 0.5f && cVar.confirmValueChange.invoke(tB).booleanValue()) {
                    cVar.C(tB);
                }
                throw th;
            }
        }
        return h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(q1.h0 h0Var, q<? super p009i2.b, ? super j0<T>, ? super Continuation<? super h0>, ? extends Object> qVar, Continuation<? super h0> continuation) throws Throwable {
        b bVar;
        c<T> cVar;
        T tB;
        T tB2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f74169q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f74169q = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, continuation);
            }
        } else {
            bVar = new b(this, continuation);
        }
        Object obj = bVar.f74167o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f74169q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (c) bVar.f74166n;
            try {
                t.b(obj);
                tB2 = cVar.o().b(cVar.w());
                if (tB2 != null && Math.abs(cVar.w() - cVar.o().e(tB2)) <= 0.5f && cVar.confirmValueChange.invoke(tB2).booleanValue()) {
                    cVar.C(tB2);
                }
                return h0.f84049a;
            } catch (Throwable th2) {
                th = th2;
                tB = cVar.o().b(cVar.w());
                if (tB != null) {
                    cVar.C(tB);
                }
                throw th;
            }
        }
        t.b(obj);
        try {
            h1 h1Var = this.dragMutex;
            C1551c c1551c = new C1551c(this, qVar, null);
            bVar.f74166n = this;
            bVar.f74169q = 1;
            if (h1Var.d(h0Var, c1551c, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            cVar = this;
            tB2 = cVar.o().b(cVar.w());
            if (tB2 != null) {
                cVar.C(tB2);
            }
            return h0.f84049a;
        } catch (Throwable th3) {
            th = th3;
            cVar = this;
            tB = cVar.o().b(cVar.w());
            if (tB != null && Math.abs(cVar.w() - cVar.o().e(tB)) <= 0.5f && cVar.confirmValueChange.invoke(tB).booleanValue()) {
                cVar.C(tB);
            }
            throw th;
        }
    }

    public final float n(float delta) {
        float fZ = z(delta);
        float fW = Float.isNaN(w()) ? BitmapDescriptorFactory.HUE_RED : w();
        F(fZ);
        return fZ - fW;
    }

    public final j0<T> o() {
        return (j0) this.anchors.getValue();
    }

    public final p019p1.i<Float> p() {
        return this.animationSpec;
    }

    public final T q() {
        return (T) this.closestValue.getValue();
    }

    public final l<T, Boolean> r() {
        return this.confirmValueChange;
    }

    public final T s() {
        return this.currentValue.getValue();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final p021s1.l getDraggableState() {
        return this.draggableState;
    }

    public final float v() {
        return this.lastVelocity.d();
    }

    public final float w() {
        return this.offset.d();
    }

    public final T x() {
        return (T) this.targetValue.getValue();
    }

    public final boolean y() {
        return t() != null;
    }

    public final float z(float delta) {
        return n.m((Float.isNaN(w()) ? BitmapDescriptorFactory.HUE_RED : w()) + delta, o().d(), o().f());
    }
}
