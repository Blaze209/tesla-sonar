package androidx.compose.ui.platform;

import android.view.View;
import com.plaid.internal.EnumC4419g;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001J<\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR+\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/w0;", "", "Lb4/j1;", "owner", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/f2;", "Lkotlin/coroutines/Continuation;", "", "session", "c", "(Lb4/j1;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroidx/compose/ui/platform/w0;", "parent", "Landroidx/compose/ui/platform/a2;", "<set-?>", "b", "Lr2/p1;", "()Landroidx/compose/ui/platform/a2;", "setInterceptor", "(Landroidx/compose/ui/platform/a2;)V", "interceptor", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w0 parent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p020r2.p1 interceptor;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE}, m = "textInputSession", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f6041n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f6043p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6041n = obj;
            this.f6043p |= Integer.MIN_VALUE;
            return w0.this.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/f2;", "", "<anonymous>", "(Landroidx/compose/ui/platform/f2;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<f2, Continuation<?>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6044n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f6045o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wn0.p<f2, Continuation<?>, Object> f6046p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ w0 f6047q;

        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/compose/ui/platform/w0$b$a", "Landroidx/compose/ui/platform/f2;", "Landroidx/compose/ui/platform/b2;", "request", "", "a", "(Landroidx/compose/ui/platform/b2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements f2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ f2 f6048a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f2 f6049b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AtomicReference f6050c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ w0 f6051d;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.w0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE}, m = "startInputMethod", n = {}, s = {})
            static final class C0129a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f6052n;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                int f6054p;

                C0129a(Continuation<? super C0129a> continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f6052n = obj;
                    this.f6054p |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.w0$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "it", "Ljn0/h0;", "a", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            static final class C0130b extends p013kotlin.jvm.internal.u implements wn0.l<CoroutineScope, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final C0130b f6055c = new C0130b();

                C0130b() {
                    super(1);
                }

                public final void a(CoroutineScope coroutineScope) {
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(CoroutineScope coroutineScope) {
                    a(coroutineScope);
                    return jn0.h0.f84049a;
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljn0/h0;", "it", "", "<anonymous>", "(V)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m = "invokeSuspend", n = {}, s = {})
            static final class c extends SuspendLambda implements wn0.p<jn0.h0, Continuation<?>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f6056n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ w0 f6057o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ b2 f6058p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ f2 f6059q;

                /* JADX INFO: renamed from: androidx.compose.ui.platform.w0$b$a$c$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/a2;", "b", "()Landroidx/compose/ui/platform/a2;"}, k = 3, mv = {1, 8, 0})
                static final class C0131a extends p013kotlin.jvm.internal.u implements wn0.a<a2> {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ w0 f6060c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0131a(w0 w0Var) {
                        super(0);
                        this.f6060c = w0Var;
                    }

                    @Override // wn0.a
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final a2 invoke() {
                        return this.f6060c.b();
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.ui.platform.w0$b$a$c$b, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "interceptor", "Ljn0/h0;", "<anonymous>", "(Landroidx/compose/ui/platform/a2;)V"}, k = 3, mv = {1, 8, 0})
                @DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, m = "invokeSuspend", n = {}, s = {})
                static final class C0132b extends SuspendLambda implements wn0.p<a2, Continuation<? super jn0.h0>, Object> {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f6061n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    /* synthetic */ Object f6062o;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    final /* synthetic */ b2 f6063p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ f2 f6064q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0132b(b2 b2Var, f2 f2Var, Continuation<? super C0132b> continuation) {
                        super(2, continuation);
                        this.f6063p = b2Var;
                        this.f6064q = f2Var;
                    }

                    @Override // wn0.p
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(a2 a2Var, Continuation<? super jn0.h0> continuation) {
                        return ((C0132b) create(a2Var, continuation)).invokeSuspend(jn0.h0.f84049a);
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                        C0132b c0132b = new C0132b(this.f6063p, this.f6064q, continuation);
                        c0132b.f6062o = obj;
                        return c0132b;
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i11 = this.f6061n;
                        if (i11 == 0) {
                            jn0.t.b(obj);
                            a2 a2Var = (a2) this.f6062o;
                            b2 b2Var = this.f6063p;
                            f2 f2Var = this.f6064q;
                            this.f6061n = 1;
                            if (a2Var.a(b2Var, f2Var, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            jn0.t.b(obj);
                        }
                        throw new KotlinNothingValueException();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(w0 w0Var, b2 b2Var, f2 f2Var, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f6057o = w0Var;
                    this.f6058p = b2Var;
                    this.f6059q = f2Var;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f6057o, this.f6058p, this.f6059q, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f6056n;
                    if (i11 == 0) {
                        jn0.t.b(obj);
                        Flow flowP = p020r2.n3.p(new C0131a(this.f6057o));
                        C0132b c0132b = new C0132b(this.f6058p, this.f6059q, null);
                        this.f6056n = 1;
                        if (FlowKt.collectLatest(flowP, c0132b, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jn0.t.b(obj);
                    }
                    throw new IllegalStateException("Interceptors flow should never terminate.");
                }

                @Override // wn0.p
                public final Object invoke(jn0.h0 h0Var, Continuation<?> continuation) {
                    return ((c) create(h0Var, continuation)).invokeSuspend(jn0.h0.f84049a);
                }
            }

            a(f2 f2Var, AtomicReference atomicReference, w0 w0Var) {
                this.f6049b = f2Var;
                this.f6050c = atomicReference;
                this.f6051d = w0Var;
                this.f6048a = f2Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // androidx.compose.ui.platform.e2
            public Object a(b2 b2Var, Continuation<?> continuation) {
                C0129a c0129a;
                if (continuation instanceof C0129a) {
                    c0129a = (C0129a) continuation;
                    int i11 = c0129a.f6054p;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0129a.f6054p = i11 - Integer.MIN_VALUE;
                    } else {
                        c0129a = new C0129a(continuation);
                    }
                } else {
                    c0129a = new C0129a(continuation);
                }
                Object obj = c0129a.f6052n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c0129a.f6054p;
                if (i12 == 0) {
                    jn0.t.b(obj);
                    AtomicReference atomicReference = this.f6050c;
                    C0130b c0130b = C0130b.f6055c;
                    c cVar = new c(this.f6051d, b2Var, this.f6049b, null);
                    c0129a.f6054p = 1;
                    if (d3.k.d(atomicReference, c0130b, cVar, c0129a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlinx.coroutines.CoroutineScope
            public CoroutineContext getCoroutineContext() {
                return this.f6048a.getCoroutineContext();
            }

            @Override // androidx.compose.ui.platform.e2
            public View getView() {
                return this.f6048a.getView();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(wn0.p<? super f2, ? super Continuation<?>, ? extends Object> pVar, w0 w0Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f6046p = pVar;
            this.f6047q = w0Var;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f2 f2Var, Continuation<?> continuation) {
            return ((b) create(f2Var, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f6046p, this.f6047q, continuation);
            bVar.f6045o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f6044n;
            if (i11 == 0) {
                jn0.t.b(obj);
                a aVar = new a((f2) this.f6045o, d3.k.a(), this.f6047q);
                wn0.p<f2, Continuation<?>, Object> pVar = this.f6046p;
                this.f6044n = 1;
                if (pVar.invoke(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a2 b() {
        return (a2) this.interceptor.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(b4.j1 j1Var, wn0.p<? super f2, ? super Continuation<?>, ? extends Object> pVar, Continuation<?> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f6043p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f6043p = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f6041n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f6043p;
        if (i12 == 0) {
            jn0.t.b(obj);
            w0 w0Var = this.parent;
            b bVar = new b(pVar, this, null);
            aVar.f6043p = 1;
            if (d2.c(j1Var, w0Var, bVar, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
