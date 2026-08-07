package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.g;
import j3.i;
import j3.m;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.r;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.n3;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;
import w4.h;
import w4.n;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aR\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aR\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0001\u001a\u00020\u00102\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u007f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0013\"\b\b\u0001\u0010\u0015*\u00020\u00142\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c\"\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001c\"\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c\"\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001c\"\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001c\"\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001c\"\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/²\u0006*\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0013\"\b\b\u0001\u0010\u0015*\u00020\u00148\nX\u008a\u0084\u0002²\u0006\"\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0013\"\b\b\u0001\u0010\u0015*\u00020\u00148\nX\u008a\u0084\u0002"}, d2 = {"", "targetValue", "Lp1/i;", "animationSpec", "visibilityThreshold", "", AnnotatedPrivateKey.LABEL, "Lkotlin/Function1;", "Ljn0/h0;", "finishedListener", "Lr2/y3;", DateTokenConverter.CONVERTER_KEY, "(FLp1/i;FLjava/lang/String;Lwn0/l;Lr2/l;II)Lr2/y3;", "Lw4/h;", "c", "(FLp1/i;Ljava/lang/String;Lwn0/l;Lr2/l;II)Lr2/y3;", "Lw4/n;", "e", "(JLp1/i;Ljava/lang/String;Lwn0/l;Lr2/l;II)Lr2/y3;", "T", "Lp1/q;", "V", "Lp1/p1;", "typeConverter", "f", "(Ljava/lang/Object;Lp1/p1;Lp1/i;Ljava/lang/Object;Ljava/lang/String;Lwn0/l;Lr2/l;II)Lr2/y3;", "Lp1/e1;", "a", "Lp1/e1;", "defaultAnimation", "b", "dpDefaultSpring", "Lj3/m;", "sizeDefaultSpring", "Lj3/g;", "offsetDefaultSpring", "Lj3/i;", "rectDefaultSpring", "", "intDefaultSpring", "g", "intOffsetDefaultSpring", "Lw4/r;", "h", "intSizeDefaultSpring", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "animSpec", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e1<Float> f100322a = j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e1<h> f100323b = j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, h.d(f2.a(h.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e1<m> f100324c = j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, m.c(f2.d(m.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e1<g> f100325d = j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, g.d(f2.c(g.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e1<i> f100326e = j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2.g(i.INSTANCE), 3, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e1<Integer> f100327f = j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Integer.valueOf(f2.b(r.f86532a)), 3, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final e1<n> f100328g = j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, n.b(f2.e(n.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final e1<w4.r> f100329h = j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.r.b(f2.f(w4.r.INSTANCE)), 3, null);

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lp1/q;", "V", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Channel<T> f100330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f100331d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Channel<T> channel, T t11) {
            super(0);
            this.f100330c = channel;
            this.f100331d = t11;
        }

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
        public final void b() {
            this.f100330c.mo85trySendJP2dKIU(this.f100331d);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lp1/q;", "V", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", i = {0}, l = {419}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f100332n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f100333o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f100334p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Channel<T> f100335q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p019p1.a<T, V> f100336r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ y3<i<T>> f100337s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ y3<l<T, h0>> f100338t;

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lp1/q;", "V", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", i = {}, l = {428}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f100339n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ T f100340o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ p019p1.a<T, V> f100341p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ y3<i<T>> f100342q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ y3<l<T, h0>> f100343r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(T t11, p019p1.a<T, V> aVar, y3<? extends i<T>> y3Var, y3<? extends l<? super T, h0>> y3Var2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f100340o = t11;
                this.f100341p = aVar;
                this.f100342q = y3Var;
                this.f100343r = y3Var2;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f100340o, this.f100341p, this.f100342q, this.f100343r, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                a aVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f100339n;
                if (i11 == 0) {
                    t.b(obj);
                    if (!s.f(this.f100340o, this.f100341p.k())) {
                        p019p1.a<T, V> aVar2 = this.f100341p;
                        T t11 = this.f100340o;
                        i iVarH = c.h(this.f100342q);
                        this.f100339n = 1;
                        aVar = this;
                        if (p019p1.a.f(aVar2, t11, iVarH, null, null, aVar, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return h0.f84049a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                aVar = this;
                l lVarG = c.g(aVar.f100343r);
                if (lVarG != null) {
                    lVarG.invoke(aVar.f100341p.m());
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Channel<T> channel, p019p1.a<T, V> aVar, y3<? extends i<T>> y3Var, y3<? extends l<? super T, h0>> y3Var2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f100335q = channel;
            this.f100336r = aVar;
            this.f100337s = y3Var;
            this.f100338t = y3Var2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f100335q, this.f100336r, this.f100337s, this.f100338t, continuation);
            bVar.f100334p = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0039 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0042  */
        /* JADX WARN: Code duplicated, block: B:16:0x0052  */
        /* JADX WARN: Code duplicated, block: B:17:0x0054  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0037 -> B:12:0x003a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0039
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f100333o
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r11.f100332n
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r3 = r11.f100334p
                kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
                jn0.t.b(r12)
                goto L3a
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                jn0.t.b(r12)
                java.lang.Object r12 = r11.f100334p
                kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
                kotlinx.coroutines.channels.Channel<T> r1 = r11.f100335q
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
                r3 = r12
            L2d:
                r11.f100334p = r3
                r11.f100332n = r1
                r11.f100333o = r2
                java.lang.Object r12 = r1.hasNext(r11)
                if (r12 != r0) goto L3a
                return r0
            L3a:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L6a
                java.lang.Object r12 = r1.next()
                kotlinx.coroutines.channels.Channel<T> r4 = r11.f100335q
                java.lang.Object r4 = r4.mo523tryReceivePtdJZtk()
                java.lang.Object r4 = kotlinx.coroutines.channels.ChannelResult.m535getOrNullimpl(r4)
                if (r4 != 0) goto L54
                r6 = r12
                goto L55
            L54:
                r6 = r4
            L55:
                p1.c$b$a r5 = new p1.c$b$a
                p1.a<T, V> r7 = r11.f100336r
                r2.y3<p1.i<T>> r8 = r11.f100337s
                r2.y3<wn0.l<T, jn0.h0>> r9 = r11.f100338t
                r10 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r7 = 3
                r8 = 0
                r4 = 0
                r6 = r5
                r5 = 0
                kotlinx.coroutines.BuildersKt.launch$default(r3, r4, r5, r6, r7, r8)
                goto L2d
            L6a:
                jn0.h0 r12 = jn0.h0.f84049a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final y3<h> c(float f11, i<h> iVar, String str, l<? super h, h0> lVar, p020r2.l lVar2, int i11, int i12) {
        if ((i12 & 2) != 0) {
            iVar = f100323b;
        }
        i<h> iVar2 = iVar;
        if ((i12 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        l<? super h, h0> lVar3 = lVar;
        if (o.J()) {
            o.S(-1407150062, i11, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        int i13 = i11 << 6;
        y3<h> y3VarF = f(h.d(f11), r1.g(h.INSTANCE), iVar2, null, str2, lVar3, lVar2, (i11 & 14) | ((i11 << 3) & 896) | (57344 & i13) | (i13 & 458752), 8);
        if (o.J()) {
            o.R();
        }
        return y3VarF;
    }

    public static final y3<Float> d(float f11, i<Float> iVar, float f12, String str, l<? super Float, h0> lVar, p020r2.l lVar2, int i11, int i12) {
        if ((i12 & 2) != 0) {
            iVar = f100322a;
        }
        if ((i12 & 4) != 0) {
            f12 = 0.01f;
        }
        if ((i12 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        l<? super Float, h0> lVar3 = (i12 & 16) != 0 ? null : lVar;
        if (o.J()) {
            o.S(668842840, i11, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        if (iVar == f100322a) {
            lVar2.o(1125598679);
            boolean z11 = (((i11 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && lVar2.q(f12)) || (i11 & KyberEngine.KyberPolyBytes) == 256;
            Object objI = lVar2.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Float.valueOf(f12), 3, null);
                lVar2.B(objI);
            }
            iVar = (e1) objI;
            lVar2.l();
        } else {
            lVar2.o(1125708605);
            lVar2.l();
        }
        i<Float> iVar2 = iVar;
        Float fValueOf = Float.valueOf(f11);
        p1<Float, m> p1VarE = r1.e(p013kotlin.jvm.internal.l.f86526a);
        Float fValueOf2 = Float.valueOf(f12);
        int i13 = i11 << 3;
        y3<Float> y3VarF = f(fValueOf, p1VarE, iVar2, fValueOf2, str2, lVar3, lVar2, (i11 & 14) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
        if (o.J()) {
            o.R();
        }
        return y3VarF;
    }

    public static final y3<n> e(long j11, i<n> iVar, String str, l<? super n, h0> lVar, p020r2.l lVar2, int i11, int i12) {
        if ((i12 & 2) != 0) {
            iVar = f100328g;
        }
        i<n> iVar2 = iVar;
        if ((i12 & 4) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        l<? super n, h0> lVar3 = lVar;
        if (o.J()) {
            o.S(-696782904, i11, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:313)");
        }
        int i13 = i11 << 6;
        y3<n> y3VarF = f(n.b(j11), r1.i(n.INSTANCE), iVar2, null, str2, lVar3, lVar2, (i11 & 14) | ((i11 << 3) & 896) | (57344 & i13) | (i13 & 458752), 8);
        if (o.J()) {
            o.R();
        }
        return y3VarF;
    }

    public static final <T, V extends q> y3<T> f(T t11, p1<T, V> p1Var, i<T> iVar, T t12, String str, l<? super T, h0> lVar, p020r2.l lVar2, int i11, int i12) {
        i<T> iVarI;
        Channel channel;
        if ((i12 & 4) != 0) {
            Object objI = lVar2.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
                lVar2.B(objI);
            }
            iVarI = (e1) objI;
        } else {
            iVarI = iVar;
        }
        T t13 = (i12 & 8) != 0 ? null : t12;
        String str2 = (i12 & 16) != 0 ? "ValueAnimation" : str;
        l<? super T, h0> lVar3 = (i12 & 32) != 0 ? null : lVar;
        if (o.J()) {
            o.S(-1994373980, i11, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        Object objI2 = lVar2.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI2 == companion.a()) {
            objI2 = s3.d(null, null, 2, null);
            lVar2.B(objI2);
        }
        p1 p1Var2 = (p1) objI2;
        Object objI3 = lVar2.I();
        if (objI3 == companion.a()) {
            objI3 = new p019p1.a(t11, p1Var, t13, str2);
            lVar2.B(objI3);
        }
        p019p1.a aVar = (p019p1.a) objI3;
        y3 y3VarO = n3.o(lVar3, lVar2, (i11 >> 15) & 14);
        if (t13 != null && (iVarI instanceof e1)) {
            e1 e1Var = (e1) iVarI;
            if (!s.f(e1Var.h(), t13)) {
                iVarI = j.i(e1Var.getDampingRatio(), e1Var.getStiffness(), t13);
            }
        }
        y3 y3VarO2 = n3.o(iVarI, lVar2, 0);
        Object objI4 = lVar2.I();
        if (objI4 == companion.a()) {
            objI4 = ChannelKt.Channel$default(-1, null, null, 6, null);
            lVar2.B(objI4);
        }
        Channel channel2 = (Channel) objI4;
        boolean zK = ((((i11 & 14) ^ 6) > 4 && lVar2.K(t11)) || (i11 & 6) == 4) | lVar2.K(channel2);
        Object objI5 = lVar2.I();
        if (zK || objI5 == companion.a()) {
            objI5 = new a(channel2, t11);
            lVar2.B(objI5);
        }
        Function0.i((wn0.a) objI5, lVar2, 0);
        boolean zK2 = lVar2.K(channel2) | lVar2.K(aVar) | lVar2.n(y3VarO2) | lVar2.n(y3VarO);
        Object objI6 = lVar2.I();
        if (zK2 || objI6 == companion.a()) {
            channel = channel2;
            Object bVar = new b(channel, aVar, y3VarO2, y3VarO, null);
            lVar2.B(bVar);
            objI6 = bVar;
        } else {
            channel = channel2;
        }
        Function0.g(channel, (p) objI6, lVar2, 0);
        y3<T> y3VarG = (y3) p1Var2.getValue();
        if (y3VarG == null) {
            y3VarG = aVar.g();
        }
        if (o.J()) {
            o.R();
        }
        return y3VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> l<T, h0> g(y3<? extends l<? super T, h0>> y3Var) {
        return y3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> i<T> h(y3<? extends i<T>> y3Var) {
        return y3Var.getValue();
    }
}
