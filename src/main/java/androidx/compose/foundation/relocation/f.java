package androidx.compose.foundation.relocation;

import b4.a0;
import b4.k;
import b4.x1;
import com.plaid.internal.EnumC4419g;
import j3.i;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.p;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001&B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\bR\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Landroidx/compose/foundation/relocation/f;", "Landroidx/compose/ui/d$c;", "Lz1/a;", "Lb4/a0;", "Lb4/x1;", "Lz1/c;", "responder", "<init>", "(Lz1/c;)V", "Lz3/v;", "coordinates", "Ljn0/h0;", "K", "(Lz3/v;)V", "childCoordinates", "Lkotlin/Function0;", "Lj3/i;", "boundsProvider", "x1", "(Lz3/v;Lwn0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "Lz1/c;", "z2", "()Lz1/c;", "setResponder", "", "o", "Z", "c2", "()Z", "shouldAutoInvalidate", "p", "hasBeenPlaced", "", "P0", "()Ljava/lang/Object;", "traverseKey", "q", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f extends androidx.compose.ui.d.c implements z1.a, a0, x1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f4869r = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private z1.c responder;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean hasBeenPlaced;

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/relocation/f$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2", f = "BringIntoViewResponder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super Job>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4873n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f4874o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ v f4876q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ wn0.a<i> f4877r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ wn0.a<i> f4878s;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1", f = "BringIntoViewResponder.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f4879n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ f f4880o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ v f4881p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ wn0.a<i> f4882q;

            /* JADX INFO: renamed from: androidx.compose.foundation.relocation.f$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* synthetic */ class C0103a extends p013kotlin.jvm.internal.p implements wn0.a<i> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ f f4883a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ v f4884b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ wn0.a<i> f4885c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0103a(f fVar, v vVar, wn0.a<i> aVar) {
                    super(0, s.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.f4883a = fVar;
                    this.f4884b = vVar;
                    this.f4885c = aVar;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
                public final i invoke() {
                    return f.y2(this.f4883a, this.f4884b, this.f4885c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, v vVar, wn0.a<i> aVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f4880o = fVar;
                this.f4881p = vVar;
                this.f4882q = aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f4880o, this.f4881p, this.f4882q, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f4879n;
                if (i11 == 0) {
                    t.b(obj);
                    z1.c responder = this.f4880o.getResponder();
                    C0103a c0103a = new C0103a(this.f4880o, this.f4881p, this.f4882q);
                    this.f4879n = 1;
                    if (responder.N0(c0103a, this) == coroutine_suspended) {
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
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.relocation.f$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2", f = "BringIntoViewResponder.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_COMMENT_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class C0104b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f4886n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ f f4887o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ wn0.a<i> f4888p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0104b(f fVar, wn0.a<i> aVar, Continuation<? super C0104b> continuation) {
                super(2, continuation);
                this.f4887o = fVar;
                this.f4888p = aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C0104b(this.f4887o, this.f4888p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                z1.a aVarC;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f4886n;
                if (i11 == 0) {
                    t.b(obj);
                    if (this.f4887o.getIsAttached() && (aVarC = androidx.compose.foundation.relocation.b.c(this.f4887o)) != null) {
                        v vVarK = k.k(this.f4887o);
                        wn0.a<i> aVar = this.f4888p;
                        this.f4886n = 1;
                        if (aVarC.x1(vVarK, aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C0104b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v vVar, wn0.a<i> aVar, wn0.a<i> aVar2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f4876q = vVar;
            this.f4877r = aVar;
            this.f4878s = aVar2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = f.this.new b(this.f4876q, this.f4877r, this.f4878s, continuation);
            bVar.f4874o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f4873n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f4874o;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(f.this, this.f4876q, this.f4877r, null), 3, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0104b(f.this, this.f4878s, null), 3, null);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj3/i;", "b", "()Lj3/i;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.a<i> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v f4890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<i> f4891e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(v vVar, wn0.a<i> aVar) {
            super(0);
            this.f4890d = vVar;
            this.f4891e = aVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            i iVarY2 = f.y2(f.this, this.f4890d, this.f4891e);
            if (iVarY2 != null) {
                return f.this.getResponder().R0(iVarY2);
            }
            return null;
        }
    }

    public f(z1.c cVar) {
        this.responder = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i y2(f fVar, v vVar, wn0.a<i> aVar) {
        i iVarInvoke;
        if (!fVar.getIsAttached() || !fVar.hasBeenPlaced) {
            return null;
        }
        v vVarK = k.k(fVar);
        if (!vVar.b0()) {
            vVar = null;
        }
        if (vVar == null || (iVarInvoke = aVar.invoke()) == null) {
            return null;
        }
        return d.c(vVarK, vVar, iVarInvoke);
    }

    @Override // b4.a0
    public void K(v coordinates) {
        this.hasBeenPlaced = true;
    }

    @Override // b4.x1
    /* JADX INFO: renamed from: P0 */
    public Object getTraverseKey() {
        return INSTANCE;
    }

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // z1.a
    public Object x1(v vVar, wn0.a<i> aVar, Continuation<? super h0> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new b(vVar, aVar, new c(vVar, aVar), null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : h0.f84049a;
    }

    /* JADX INFO: renamed from: z2, reason: from getter */
    public final z1.c getResponder() {
        return this.responder;
    }
}
