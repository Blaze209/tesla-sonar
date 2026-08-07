package androidx.compose.foundation.gestures;

import androidx.compose.ui.platform.e3;
import androidx.compose.ui.platform.z0;
import b4.h;
import b4.m;
import b4.p1;
import j3.g;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p021s1.i;
import p021s1.k;
import p021s1.p;
import v3.PointerInputChange;
import v3.f0;
import v3.o;
import v3.o0;
import v3.q0;
import w4.y;
import w4.z;
import wn0.l;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B7\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010#\u001a\u00020\u000f2.\u0010\"\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001eH¦@¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H&ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)H&ø\u0001\u0000¢\u0006\u0004\b+\u0010(J\u000f\u0010,\u001a\u00020\u0006H&¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010\u0011J*\u00105\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u000fH\u0016¢\u0006\u0004\b7\u0010\u0011J\r\u00108\u001a\u00020\u000f¢\u0006\u0004\b8\u0010\u0011JO\u0010:\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u00109\u001a\u00020\u0006¢\u0006\u0004\b:\u0010;R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R<\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR$\u0010\b\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00068\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010-R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010>\u001a\u0004\u0018\u00010\t8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010@R\u001e\u0010P\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010DR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010X\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, d2 = {"Landroidx/compose/foundation/gestures/b;", "Lb4/m;", "Lb4/p1;", "Lb4/h;", "Lkotlin/Function1;", "Lv3/x;", "", "canDrag", "enabled", "Lu1/l;", "interactionSource", "Ls1/p;", "orientationLock", "<init>", "(Lwn0/l;ZLu1/l;Ls1/p;)V", "Ljn0/h0;", "W2", "()V", "Lv3/q0;", "P2", "()Lv3/q0;", "Landroidx/compose/foundation/gestures/a$c;", "event", "T2", "(Landroidx/compose/foundation/gestures/a$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/a$d;", "U2", "(Landroidx/compose/foundation/gestures/a$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "S2", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/a$b;", "Lkotlin/coroutines/Continuation;", "", "forEachDelta", "M2", "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj3/g;", "startedPosition", "Q2", "(J)V", "Lw4/y;", "velocity", "R2", "V2", "()Z", "i2", "Lv3/m;", "pointerEvent", "Lv3/o;", "pass", "Lw4/r;", "bounds", "q0", "(Lv3/m;Lv3/o;J)V", "y0", "L2", "shouldResetPointerInputHandling", "X2", "(Lwn0/l;ZLu1/l;Ls1/p;Z)V", "p", "Ls1/p;", "<set-?>", "q", "Lwn0/l;", "N2", "()Lwn0/l;", "r", "Z", "O2", "s", "Lu1/l;", "getInteractionSource", "()Lu1/l;", "t", "_canDrag", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/a;", "u", "Lkotlinx/coroutines/channels/Channel;", "channel", "Lu1/b;", "v", "Lu1/b;", "dragInteraction", "w", "isListeningForEvents", "x", "Lv3/q0;", "pointerInputNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class b extends m implements p1, h {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private p orientationLock;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private l<? super PointerInputChange, Boolean> canDrag;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private u1.l interactionSource;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final l<PointerInputChange, Boolean> _canDrag = new a();

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private Channel<androidx.compose.foundation.gestures.a> channel;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private u1.b dragInteraction;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean isListeningForEvents;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private q0 pointerInputNode;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv3/x;", "it", "", "a", "(Lv3/x;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<PointerInputChange, Boolean> {
        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return b.this.N2().invoke(pointerInputChange);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/f0;", "Ljn0/h0;", "<anonymous>", "(Lv3/f0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1", f = "Draggable.kt", i = {}, l = {524}, m = "invokeSuspend", n = {}, s = {})
    static final class C0092b extends SuspendLambda implements wn0.p<f0, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4335n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f4336o;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", i = {0}, l = {526}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f4338n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f4339o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ b f4340p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ f0 f4341q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ q<PointerInputChange, PointerInputChange, g, h0> f4342r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ l<PointerInputChange, h0> f4343s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ wn0.a<h0> f4344t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ wn0.a<Boolean> f4345u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ wn0.p<PointerInputChange, g, h0> f4346v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b bVar, f0 f0Var, q<? super PointerInputChange, ? super PointerInputChange, ? super g, h0> qVar, l<? super PointerInputChange, h0> lVar, wn0.a<h0> aVar, wn0.a<Boolean> aVar2, wn0.p<? super PointerInputChange, ? super g, h0> pVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f4340p = bVar;
                this.f4341q = f0Var;
                this.f4342r = qVar;
                this.f4343s = lVar;
                this.f4344t = aVar;
                this.f4345u = aVar2;
                this.f4346v = pVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f4340p, this.f4341q, this.f4342r, this.f4343s, this.f4344t, this.f4345u, this.f4346v, continuation);
                aVar.f4339o = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x0055  */
            /* JADX WARN: Code duplicated, block: B:29:0x0067  */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineScope coroutineScope;
                a aVar;
                CancellationException cancellationException;
                Channel channel;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f4338n;
                if (i11 == 0) {
                    t.b(obj);
                    coroutineScope = (CoroutineScope) this.f4339o;
                    try {
                        p pVar = this.f4340p.orientationLock;
                        f0 f0Var = this.f4341q;
                        q<PointerInputChange, PointerInputChange, g, h0> qVar = this.f4342r;
                        l<PointerInputChange, h0> lVar = this.f4343s;
                        wn0.a<h0> aVar2 = this.f4344t;
                        wn0.a<Boolean> aVar3 = this.f4345u;
                        wn0.p<PointerInputChange, g, h0> pVar2 = this.f4346v;
                        this.f4339o = coroutineScope;
                        this.f4338n = 1;
                        aVar = this;
                        try {
                            if (i.e(f0Var, qVar, lVar, aVar2, aVar3, pVar, pVar2, aVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (CancellationException e11) {
                            e = e11;
                            cancellationException = e;
                            channel = aVar.f4340p.channel;
                            if (channel != null) {
                                ChannelResult.m530boximpl(channel.mo85trySendJP2dKIU(androidx.compose.foundation.gestures.a.C0091a.f4321a));
                            }
                            if (!CoroutineScopeKt.isActive(coroutineScope)) {
                                throw cancellationException;
                            }
                        }
                    } catch (CancellationException e12) {
                        e = e12;
                        aVar = this;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope = (CoroutineScope) this.f4339o;
                    try {
                        t.b(obj);
                    } catch (CancellationException e13) {
                        cancellationException = e13;
                        aVar = this;
                        channel = aVar.f4340p.channel;
                        if (channel != null) {
                            ChannelResult.m530boximpl(channel.mo85trySendJP2dKIU(androidx.compose.foundation.gestures.a.C0091a.f4321a));
                        }
                        if (!CoroutineScopeKt.isActive(coroutineScope)) {
                            throw cancellationException;
                        }
                    }
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv3/x;", "change", "Lj3/g;", "delta", "Ljn0/h0;", "a", "(Lv3/x;J)V"}, k = 3, mv = {1, 8, 0})
        static final class C0093b extends u implements wn0.p<PointerInputChange, g, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w3.d f4347c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f4348d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0093b(w3.d dVar, b bVar) {
                super(2);
                this.f4347c = dVar;
                this.f4348d = bVar;
            }

            public final void a(PointerInputChange pointerInputChange, long j11) {
                w3.e.c(this.f4347c, pointerInputChange);
                Channel channel = this.f4348d.channel;
                if (channel != null) {
                    ChannelResult.m530boximpl(channel.mo85trySendJP2dKIU(new androidx.compose.foundation.gestures.a.b(j11, null)));
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(PointerInputChange pointerInputChange, g gVar) {
                a(pointerInputChange, gVar.getPackedValue());
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$c */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class c extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f4349c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b bVar) {
                super(0);
                this.f4349c = bVar;
            }

            public final void b() {
                Channel channel = this.f4349c.channel;
                if (channel != null) {
                    ChannelResult.m530boximpl(channel.mo85trySendJP2dKIU(androidx.compose.foundation.gestures.a.C0091a.f4321a));
                }
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$d */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv3/x;", "upEvent", "Ljn0/h0;", "a", "(Lv3/x;)V"}, k = 3, mv = {1, 8, 0})
        static final class d extends u implements l<PointerInputChange, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w3.d f4350c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f4351d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(w3.d dVar, b bVar) {
                super(1);
                this.f4350c = dVar;
                this.f4351d = bVar;
            }

            public final void a(PointerInputChange pointerInputChange) {
                w3.e.c(this.f4350c, pointerInputChange);
                float fH = ((e3) b4.i.a(this.f4351d, z0.u())).h();
                long jB = this.f4350c.b(z.a(fH, fH));
                this.f4350c.e();
                Channel channel = this.f4351d.channel;
                if (channel != null) {
                    ChannelResult.m530boximpl(channel.mo85trySendJP2dKIU(new androidx.compose.foundation.gestures.a.d(k.j(jB), null)));
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(PointerInputChange pointerInputChange) {
                a(pointerInputChange);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$e */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lv3/x;", "down", "slopTriggerChange", "Lj3/g;", "postSlopOffset", "Ljn0/h0;", "a", "(Lv3/x;Lv3/x;J)V"}, k = 3, mv = {1, 8, 0})
        static final class e extends u implements q<PointerInputChange, PointerInputChange, g, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f4352c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ w3.d f4353d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(b bVar, w3.d dVar) {
                super(3);
                this.f4352c = bVar;
                this.f4353d = dVar;
            }

            public final void a(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j11) {
                if (this.f4352c.N2().invoke(pointerInputChange).booleanValue()) {
                    if (!this.f4352c.isListeningForEvents) {
                        if (this.f4352c.channel == null) {
                            this.f4352c.channel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                        }
                        this.f4352c.W2();
                    }
                    w3.e.c(this.f4353d, pointerInputChange);
                    long jQ = g.q(pointerInputChange2.getPosition(), j11);
                    Channel channel = this.f4352c.channel;
                    if (channel != null) {
                        ChannelResult.m530boximpl(channel.mo85trySendJP2dKIU(new androidx.compose.foundation.gestures.a.c(jQ, null)));
                    }
                }
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, g gVar) {
                a(pointerInputChange, pointerInputChange2, gVar.getPackedValue());
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b$f */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class f extends u implements wn0.a<Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f4354c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(b bVar) {
                super(0);
                this.f4354c = bVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(!this.f4354c.getStartDragImmediately());
            }
        }

        C0092b(Continuation<? super C0092b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C0092b c0092b = b.this.new C0092b(continuation);
            c0092b.f4336o = obj;
            return c0092b;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4335n;
            if (i11 == 0) {
                t.b(obj);
                f0 f0Var = (f0) this.f4336o;
                w3.d dVar = new w3.d();
                a aVar = new a(b.this, f0Var, new e(b.this, dVar), new d(dVar, b.this), new c(b.this), new f(b.this), new C0093b(dVar, b.this), null);
                this.f4335n = 1;
                if (CoroutineScopeKt.coroutineScope(aVar, this) == coroutine_suspended) {
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

        @Override // wn0.p
        public final Object invoke(f0 f0Var, Continuation<? super h0> continuation) {
            return ((C0092b) create(f0Var, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0}, l = {566}, m = "processDragCancel", n = {"this"}, s = {"L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4355n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f4356o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4358q;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4356o = obj;
            this.f4358q |= Integer.MIN_VALUE;
            return b.this.S2(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0, 0, 1, 1, 1}, l = {548, 551}, m = "processDragStart", n = {"this", "event", "this", "event", "interaction"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4359n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f4360o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f4361p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f4362q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f4364s;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4362q = obj;
            this.f4364s |= Integer.MIN_VALUE;
            return b.this.T2(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0, 0}, l = {558}, m = "processDragStop", n = {"this", "event"}, s = {"L$0", "L$1"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4365n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f4366o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f4367p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4369r;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4367p = obj;
            this.f4369r |= Integer.MIN_VALUE;
            return b.this.U2(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {431, 433, 435, 442, 444, 447}, m = "invokeSuspend", n = {"$this$launch", "event", "$this$launch", "event", "$this$launch", "event", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4370n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f4371o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f4372p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private /* synthetic */ Object f4373q;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/a$b;", "Ljn0/h0;", "processDelta", "<anonymous>", "(Lwn0/l;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", i = {0}, l = {438}, m = "invokeSuspend", n = {"processDelta"}, s = {"L$0"})
        static final class a extends SuspendLambda implements wn0.p<l<? super androidx.compose.foundation.gestures.a.b, ? extends h0>, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f4375n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int f4376o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f4377p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ n0<androidx.compose.foundation.gestures.a> f4378q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f4379r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n0<androidx.compose.foundation.gestures.a> n0Var, b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f4378q = n0Var;
                this.f4379r = bVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(l<? super androidx.compose.foundation.gestures.a.b, h0> lVar, Continuation<? super h0> continuation) {
                return ((a) create(lVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f4378q, this.f4379r, continuation);
                aVar.f4377p = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002f  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0049 -> B:25:0x005b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0055 -> B:24:0x0058). Please report as a decompilation issue!!! */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                l lVar;
                androidx.compose.foundation.gestures.a aVar;
                T t11;
                n0<androidx.compose.foundation.gestures.a> n0Var;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f4376o;
                if (i11 == 0) {
                    t.b(obj);
                    lVar = (l) this.f4377p;
                    aVar = this.f4378q.f86529a;
                    if (!(aVar instanceof androidx.compose.foundation.gestures.a.d) || (aVar instanceof androidx.compose.foundation.gestures.a.C0091a)) {
                        return h0.f84049a;
                    }
                    t11 = 0;
                    androidx.compose.foundation.gestures.a.b bVar = aVar instanceof androidx.compose.foundation.gestures.a.b ? (androidx.compose.foundation.gestures.a.b) aVar : null;
                    if (bVar != null) {
                        lVar.invoke(bVar);
                    }
                    n0Var = this.f4378q;
                    Channel channel = this.f4379r.channel;
                    if (channel != null) {
                        this.f4377p = lVar;
                        this.f4375n = n0Var;
                        this.f4376o = 1;
                        obj = channel.receive(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    n0Var.f86529a = t11;
                    aVar = this.f4378q.f86529a;
                    if (aVar instanceof androidx.compose.foundation.gestures.a.d) {
                    }
                    return h0.f84049a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n0Var = (n0) this.f4375n;
                lVar = (l) this.f4377p;
                t.b(obj);
                t11 = (androidx.compose.foundation.gestures.a) obj;
                n0Var.f86529a = t11;
                aVar = this.f4378q.f86529a;
                if (aVar instanceof androidx.compose.foundation.gestures.a.d) {
                }
                return h0.f84049a;
            }
        }

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = b.this.new f(continuation);
            fVar.f4373q = obj;
            return fVar;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0034 A[PHI: r1 r3
          0x0034: PHI (r1v14 kotlin.jvm.internal.n0) = (r1v6 kotlin.jvm.internal.n0), (r1v19 kotlin.jvm.internal.n0) binds: [B:13:0x0031, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]
          0x0034: PHI (r3v8 kotlinx.coroutines.CoroutineScope) = (r3v5 kotlinx.coroutines.CoroutineScope), (r3v11 kotlinx.coroutines.CoroutineScope) binds: [B:13:0x0031, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:19:0x005e A[PHI: r4
          0x005e: PHI (r4v7 kotlinx.coroutines.CoroutineScope) = 
          (r4v0 kotlinx.coroutines.CoroutineScope)
          (r4v3 kotlinx.coroutines.CoroutineScope)
          (r4v3 kotlinx.coroutines.CoroutineScope)
          (r4v3 kotlinx.coroutines.CoroutineScope)
          (r4v5 kotlinx.coroutines.CoroutineScope)
          (r4v8 kotlinx.coroutines.CoroutineScope)
         binds: [B:18:0x0056, B:45:0x00dc, B:47:0x00eb, B:41:0x00d5, B:30:0x008e, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:21:0x0064  */
        /* JADX WARN: Code duplicated, block: B:23:0x0071  */
        /* JADX WARN: Code duplicated, block: B:26:0x0082  */
        /* JADX WARN: Code duplicated, block: B:31:0x0090  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:44:0x00da A[Catch: CancellationException -> 0x00d8, TryCatch #2 {CancellationException -> 0x00d8, blocks: (B:38:0x00bb, B:40:0x00c1, B:44:0x00da, B:46:0x00de), top: B:59:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00de A[Catch: CancellationException -> 0x00d8, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00d8, blocks: (B:38:0x00bb, B:40:0x00c1, B:44:0x00da, B:46:0x00de), top: B:59:0x00bb }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008e -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d5 -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00dc -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00eb -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00fb -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public b(l<? super PointerInputChange, Boolean> lVar, boolean z11, u1.l lVar2, p pVar) {
        this.orientationLock = pVar;
        this.canDrag = lVar;
        this.enabled = z11;
        this.interactionSource = lVar2;
    }

    private final q0 P2() {
        return o0.a(new C0092b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S2(Continuation<? super h0> continuation) {
        c cVar;
        b bVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f4358q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f4358q = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f4356o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f4358q;
        if (i12 == 0) {
            t.b(obj);
            u1.b bVar2 = this.dragInteraction;
            if (bVar2 != null) {
                u1.l lVar = this.interactionSource;
                if (lVar != null) {
                    u1.a aVar = new u1.a(bVar2);
                    cVar.f4355n = this;
                    cVar.f4358q = 1;
                    if (lVar.a(aVar, cVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                bVar = this;
            } else {
                bVar = this;
            }
            bVar.R2(y.INSTANCE.a());
            return h0.f84049a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bVar = (b) cVar.f4355n;
        t.b(obj);
        bVar.dragInteraction = null;
        bVar.R2(y.INSTANCE.a());
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r2.a(r5, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T2(androidx.compose.foundation.gestures.a.c r7, p013kotlin.coroutines.Continuation<? super jn0.h0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.b.d
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.b$d r0 = (androidx.compose.foundation.gestures.b.d) r0
            int r1 = r0.f4364s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4364s = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b$d r0 = new androidx.compose.foundation.gestures.b$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f4362q
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f4364s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f4361p
            u1.b r7 = (u1.b) r7
            java.lang.Object r1 = r0.f4360o
            androidx.compose.foundation.gestures.a$c r1 = (androidx.compose.foundation.gestures.a.c) r1
            java.lang.Object r0 = r0.f4359n
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            jn0.t.b(r8)
            goto L85
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f4360o
            androidx.compose.foundation.gestures.a$c r7 = (androidx.compose.foundation.gestures.a.c) r7
            java.lang.Object r2 = r0.f4359n
            androidx.compose.foundation.gestures.b r2 = (androidx.compose.foundation.gestures.b) r2
            jn0.t.b(r8)
            goto L6a
        L4c:
            jn0.t.b(r8)
            u1.b r8 = r6.dragInteraction
            if (r8 == 0) goto L69
            u1.l r2 = r6.interactionSource
            if (r2 == 0) goto L69
            u1.a r5 = new u1.a
            r5.<init>(r8)
            r0.f4359n = r6
            r0.f4360o = r7
            r0.f4364s = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 != r1) goto L69
            goto L81
        L69:
            r2 = r6
        L6a:
            u1.b r8 = new u1.b
            r8.<init>()
            u1.l r4 = r2.interactionSource
            if (r4 == 0) goto L88
            r0.f4359n = r2
            r0.f4360o = r7
            r0.f4361p = r8
            r0.f4364s = r3
            java.lang.Object r0 = r4.a(r8, r0)
            if (r0 != r1) goto L82
        L81:
            return r1
        L82:
            r1 = r7
            r7 = r8
            r0 = r2
        L85:
            r8 = r7
            r2 = r0
            r7 = r1
        L88:
            r2.dragInteraction = r8
            long r7 = r7.getStartPoint()
            r2.Q2(r7)
            jn0.h0 r7 = jn0.h0.f84049a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.T2(androidx.compose.foundation.gestures.a$c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U2(androidx.compose.foundation.gestures.a.d dVar, Continuation<? super h0> continuation) {
        e eVar;
        b bVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f4369r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f4369r = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f4367p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f4369r;
        if (i12 == 0) {
            t.b(obj);
            u1.b bVar2 = this.dragInteraction;
            if (bVar2 != null) {
                u1.l lVar = this.interactionSource;
                if (lVar != null) {
                    u1.c cVar = new u1.c(bVar2);
                    eVar.f4365n = this;
                    eVar.f4366o = dVar;
                    eVar.f4369r = 1;
                    if (lVar.a(cVar, eVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                bVar = this;
            } else {
                bVar = this;
            }
            bVar.R2(dVar.getVelocity());
            return h0.f84049a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar = (androidx.compose.foundation.gestures.a.d) eVar.f4366o;
        bVar = (b) eVar.f4365n;
        t.b(obj);
        bVar.dragInteraction = null;
        bVar.R2(dVar.getVelocity());
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W2() {
        this.isListeningForEvents = true;
        BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new f(null), 3, null);
    }

    public final void L2() {
        u1.b bVar = this.dragInteraction;
        if (bVar != null) {
            u1.l lVar = this.interactionSource;
            if (lVar != null) {
                lVar.b(new u1.a(bVar));
            }
            this.dragInteraction = null;
        }
    }

    public abstract Object M2(wn0.p<? super l<? super androidx.compose.foundation.gestures.a.b, h0>, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation);

    protected final l<PointerInputChange, Boolean> N2() {
        return this.canDrag;
    }

    /* JADX INFO: renamed from: O2, reason: from getter */
    protected final boolean getEnabled() {
        return this.enabled;
    }

    public abstract void Q2(long startedPosition);

    public abstract void R2(long velocity);

    /* JADX INFO: renamed from: V2 */
    public abstract boolean getStartDragImmediately();

    public final void X2(l<? super PointerInputChange, Boolean> canDrag, boolean enabled, u1.l interactionSource, p orientationLock, boolean shouldResetPointerInputHandling) {
        q0 q0Var;
        this.canDrag = canDrag;
        boolean z11 = true;
        if (this.enabled != enabled) {
            this.enabled = enabled;
            if (!enabled) {
                L2();
                q0 q0Var2 = this.pointerInputNode;
                if (q0Var2 != null) {
                    A2(q0Var2);
                }
                this.pointerInputNode = null;
            }
            shouldResetPointerInputHandling = true;
        }
        if (!s.f(this.interactionSource, interactionSource)) {
            L2();
            this.interactionSource = interactionSource;
        }
        if (this.orientationLock != orientationLock) {
            this.orientationLock = orientationLock;
        } else {
            z11 = shouldResetPointerInputHandling;
        }
        if (!z11 || (q0Var = this.pointerInputNode) == null) {
            return;
        }
        q0Var.o1();
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        this.isListeningForEvents = false;
        L2();
    }

    @Override // b4.p1
    public void q0(v3.m pointerEvent, o pass, long bounds) {
        if (this.enabled && this.pointerInputNode == null) {
            this.pointerInputNode = (q0) x2(P2());
        }
        q0 q0Var = this.pointerInputNode;
        if (q0Var != null) {
            q0Var.q0(pointerEvent, pass, bounds);
        }
    }

    @Override // b4.p1
    public void y0() {
        q0 q0Var = this.pointerInputNode;
        if (q0Var != null) {
            q0Var.y0();
        }
    }
}
