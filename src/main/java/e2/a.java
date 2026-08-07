package e2;

import androidx.compose.ui.platform.e2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import i4.TextLayoutResult;
import java.util.List;
import java.util.concurrent.CancellationException;
import k3.n3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o4.ImeOptions;
import o4.TextFieldValue;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJM\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J!\u0010\u0019\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJK\u0010(\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\u0003R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010.R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00101R\u001c\u00105\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Le2/a;", "Le2/q0;", "<init>", "()V", "Lkotlin/Function1;", "Le2/s0;", "Ljn0/h0;", "initializeRequest", "q", "(Lwn0/l;)V", "Lo4/o0;", "value", "Lo4/s;", "imeOptions", "", "Lo4/i;", "onEditCommand", "Lo4/r;", "onImeActionPerformed", "e", "(Lo4/o0;Lo4/s;Lwn0/l;Lwn0/l;)V", DateTokenConverter.CONVERTER_KEY, "a", "oldValue", "newValue", "g", "(Lo4/o0;Lo4/o0;)V", "Lj3/i;", "rect", "b", "(Lj3/i;)V", "textFieldValue", "Lo4/f0;", "offsetMapping", "Li4/m0;", "textLayoutResult", "Lk3/n3;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "c", "(Lo4/o0;Lo4/f0;Li4/m0;Lwn0/l;Lj3/i;Lj3/i;)V", "k", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "job", "Le2/s0;", "currentRequest", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "backingStylusHandwritingTrigger", "p", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "stylusHandwritingTrigger", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Job job;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private s0 currentRequest;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private MutableSharedFlow<jn0.h0> backingStylusHandwritingTrigger;

    /* JADX INFO: renamed from: e2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le2/s0;", "it", "Ljn0/h0;", "a", "(Le2/s0;)V"}, k = 3, mv = {1, 8, 0})
    static final class C1254a extends p013kotlin.jvm.internal.u implements wn0.l<s0, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f61455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f61456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ImeOptions f61457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<List<? extends o4.i>, jn0.h0> f61458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.l<o4.r, jn0.h0> f61459g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1254a(TextFieldValue textFieldValue, a aVar, ImeOptions imeOptions, wn0.l<? super List<? extends o4.i>, jn0.h0> lVar, wn0.l<? super o4.r, jn0.h0> lVar2) {
            super(1);
            this.f61455c = textFieldValue;
            this.f61456d = aVar;
            this.f61457e = imeOptions;
            this.f61458f = lVar;
            this.f61459g = lVar2;
        }

        public final void a(s0 s0Var) {
            s0Var.l(this.f61455c, this.f61456d.getTextInputModifierNode(), this.f61457e, this.f61458f, this.f61459g);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(s0 s0Var) {
            a(s0Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/e2;", "", "<anonymous>", "(Landroidx/compose/ui/platform/e2;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<e2, Continuation<?>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f61460n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f61461o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wn0.l<s0, jn0.h0> f61462p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ a f61463q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ q0.a f61464r;

        /* JADX INFO: renamed from: e2.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
        static final class C1255a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<?>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f61465n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f61466o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ e2 f61467p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ wn0.l<s0, jn0.h0> f61468q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ a f61469r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ q0.a f61470s;

            /* JADX INFO: renamed from: e2.a$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {137, 138}, m = "invokeSuspend", n = {}, s = {})
            static final class C1256a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f61471n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ a f61472o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ l0 f61473p;

                /* JADX INFO: renamed from: e2.a$b$a$a$b, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljn0/h0;", "it", "a", "(Ljn0/h0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
                static final class C1258b<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ l0 f61475a;

                    C1258b(l0 l0Var) {
                        this.f61475a = l0Var;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object emit(jn0.h0 h0Var, Continuation<? super jn0.h0> continuation) {
                        this.f61475a.e();
                        return jn0.h0.f84049a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1256a(a aVar, l0 l0Var, Continuation<? super C1256a> continuation) {
                    super(2, continuation);
                    this.f61472o = aVar;
                    this.f61473p = l0Var;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                    return new C1256a(this.f61472o, this.f61473p, continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
                
                    if (r5.collect(r1, r4) == r0) goto L17;
                 */
                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r4.f61471n
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1e
                        if (r1 == r3) goto L1a
                        if (r1 == r2) goto L16
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L16:
                        jn0.t.b(r5)
                        goto L44
                    L1a:
                        jn0.t.b(r5)
                        goto L2c
                    L1e:
                        jn0.t.b(r5)
                        e2.a$b$a$a$a r5 = e2.a.b.C1255a.C1256a.C1257a.f61474c
                        r4.f61471n = r3
                        java.lang.Object r5 = p020r2.h1.b(r5, r4)
                        if (r5 != r0) goto L2c
                        goto L43
                    L2c:
                        e2.a r5 = r4.f61472o
                        kotlinx.coroutines.flow.MutableSharedFlow r5 = e2.a.m(r5)
                        if (r5 == 0) goto L4a
                        e2.a$b$a$a$b r1 = new e2.a$b$a$a$b
                        e2.l0 r3 = r4.f61473p
                        r1.<init>(r3)
                        r4.f61471n = r2
                        java.lang.Object r5 = r5.collect(r1, r4)
                        if (r5 != r0) goto L44
                    L43:
                        return r0
                    L44:
                        kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
                        r5.<init>()
                        throw r5
                    L4a:
                        jn0.h0 r5 = jn0.h0.f84049a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e2.a.b.C1255a.C1256a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                    return ((C1256a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
                }

                /* JADX INFO: renamed from: e2.a$b$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
                static final class C1257a extends p013kotlin.jvm.internal.u implements wn0.l<Long, jn0.h0> {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public static final C1257a f61474c = new C1257a();

                    C1257a() {
                        super(1);
                    }

                    @Override // wn0.l
                    public /* bridge */ /* synthetic */ jn0.h0 invoke(Long l11) {
                        a(l11.longValue());
                        return jn0.h0.f84049a;
                    }

                    public final void a(long j11) {
                    }
                }
            }

            /* JADX INFO: renamed from: e2.a$b$a$b, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* synthetic */ class C1259b extends p013kotlin.jvm.internal.p implements wn0.l<n3, jn0.h0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ q0.a f61476a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1259b(q0.a aVar) {
                    super(1, kotlin.jvm.internal.s.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                    this.f61476a = aVar;
                }

                public final void a(float[] fArr) {
                    a.r(this.f61476a, fArr);
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(n3 n3Var) {
                    a(n3Var.getValues());
                    return jn0.h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1255a(e2 e2Var, wn0.l<? super s0, jn0.h0> lVar, a aVar, q0.a aVar2, Continuation<? super C1255a> continuation) {
                super(2, continuation);
                this.f61467p = e2Var;
                this.f61468q = lVar;
                this.f61469r = aVar;
                this.f61470s = aVar2;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                C1255a c1255a = new C1255a(this.f61467p, this.f61468q, this.f61469r, this.f61470s, continuation);
                c1255a.f61466o = obj;
                return c1255a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f61465n;
                try {
                    if (i11 == 0) {
                        jn0.t.b(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.f61466o;
                        l0 l0VarInvoke = r0.c().invoke(this.f61467p.getView());
                        s0 s0Var = new s0(this.f61467p.getView(), new C1259b(this.f61470s), l0VarInvoke);
                        if (c2.c.a()) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C1256a(this.f61469r, l0VarInvoke, null), 3, null);
                        }
                        wn0.l<s0, jn0.h0> lVar = this.f61468q;
                        if (lVar != null) {
                            lVar.invoke(s0Var);
                        }
                        this.f61469r.currentRequest = s0Var;
                        e2 e2Var = this.f61467p;
                        this.f61465n = 1;
                        if (e2Var.a(s0Var, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jn0.t.b(obj);
                    }
                    throw new KotlinNothingValueException();
                } catch (Throwable th2) {
                    this.f61469r.currentRequest = null;
                    throw th2;
                }
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
                return ((C1255a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(wn0.l<? super s0, jn0.h0> lVar, a aVar, q0.a aVar2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f61462p = lVar;
            this.f61463q = aVar;
            this.f61464r = aVar2;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e2 e2Var, Continuation<?> continuation) {
            return ((b) create(e2Var, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f61462p, this.f61463q, this.f61464r, continuation);
            bVar.f61461o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f61460n;
            if (i11 == 0) {
                jn0.t.b(obj);
                C1255a c1255a = new C1255a((e2) this.f61461o, this.f61462p, this.f61463q, this.f61464r, null);
                this.f61460n = 1;
                if (CoroutineScopeKt.coroutineScope(c1255a, this) == coroutine_suspended) {
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
    public final MutableSharedFlow<jn0.h0> p() {
        MutableSharedFlow<jn0.h0> mutableSharedFlow = this.backingStylusHandwritingTrigger;
        if (mutableSharedFlow != null) {
            return mutableSharedFlow;
        }
        if (!c2.c.a()) {
            return null;
        }
        MutableSharedFlow<jn0.h0> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_LATEST, 2, null);
        this.backingStylusHandwritingTrigger = mutableSharedFlowMutableSharedFlow$default;
        return mutableSharedFlowMutableSharedFlow$default;
    }

    private final void q(wn0.l<? super s0, jn0.h0> initializeRequest) {
        q0.a textInputModifierNode = getTextInputModifierNode();
        if (textInputModifierNode == null) {
            return;
        }
        this.job = textInputModifierNode.f0(new b(initializeRequest, this, textInputModifierNode, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(q0.a aVar, float[] fArr) {
        z3.v vVarI0 = aVar.i0();
        if (vVarI0 != null) {
            if (!vVarI0.b0()) {
                vVarI0 = null;
            }
            if (vVarI0 == null) {
                return;
            }
            vVarI0.q0(fArr);
        }
    }

    @Override // o4.j0
    public void a() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
        MutableSharedFlow<jn0.h0> mutableSharedFlowP = p();
        if (mutableSharedFlowP != null) {
            mutableSharedFlowP.resetReplayCache();
        }
    }

    @Override // o4.j0
    public void b(j3.i rect) {
        s0 s0Var = this.currentRequest;
        if (s0Var != null) {
            s0Var.j(rect);
        }
    }

    @Override // o4.j0
    public void c(TextFieldValue textFieldValue, o4.f0 offsetMapping, TextLayoutResult textLayoutResult, wn0.l<? super n3, jn0.h0> textFieldToRootTransform, j3.i innerTextFieldBounds, j3.i decorationBoxBounds) {
        s0 s0Var = this.currentRequest;
        if (s0Var != null) {
            s0Var.n(textFieldValue, offsetMapping, textLayoutResult, innerTextFieldBounds, decorationBoxBounds);
        }
    }

    @Override // o4.j0
    public void d() {
        q(null);
    }

    @Override // o4.j0
    public void e(TextFieldValue value, ImeOptions imeOptions, wn0.l<? super List<? extends o4.i>, jn0.h0> onEditCommand, wn0.l<? super o4.r, jn0.h0> onImeActionPerformed) {
        q(new C1254a(value, this, imeOptions, onEditCommand, onImeActionPerformed));
    }

    @Override // o4.j0
    public void g(TextFieldValue oldValue, TextFieldValue newValue) {
        s0 s0Var = this.currentRequest;
        if (s0Var != null) {
            s0Var.m(oldValue, newValue);
        }
    }

    @Override // e2.q0
    public void k() {
        MutableSharedFlow<jn0.h0> mutableSharedFlowP = p();
        if (mutableSharedFlowP != null) {
            mutableSharedFlowP.tryEmit(jn0.h0.f84049a);
        }
    }
}
