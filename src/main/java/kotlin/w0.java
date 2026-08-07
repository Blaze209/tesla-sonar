package kotlin;

import androidx.compose.ui.c;
import androidx.compose.ui.d;
import j3.g;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k0;
import p020r2.l;
import p020r2.l0;
import p020r2.n3;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;
import p021s1.a0;
import u1.i;
import u1.n;
import v3.f0;
import v3.o0;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/d;", "Lu1/l;", "interactionSource", "", "enabled", "Lkotlin/Function1;", "Lj3/g;", "Ljn0/h0;", "onTap", "a", "(Landroidx/compose/ui/d;Lu1/l;ZLwn0/l;)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w0 {

    @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements q<d, l, Integer, d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<g, h0> f15908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u1.l f15909d;

        /* JADX INFO: renamed from: b2.w0$a$a, reason: collision with other inner class name */
        @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
        static final class C0296a extends u implements wn0.l<l0, k0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p1<n.b> f15910c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ u1.l f15911d;

            /* JADX INFO: renamed from: b2.w0$a$a$a, reason: collision with other inner class name */
            @p013kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"b2/w0$a$a$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class C0297a implements k0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ p1 f15912a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ u1.l f15913b;

                public C0297a(p1 p1Var, u1.l lVar) {
                    this.f15912a = p1Var;
                    this.f15913b = lVar;
                }

                @Override // p020r2.k0
                public void dispose() {
                    n.b bVar = (n.b) this.f15912a.getValue();
                    if (bVar != null) {
                        n.a aVar = new n.a(bVar);
                        u1.l lVar = this.f15913b;
                        if (lVar != null) {
                            lVar.b(aVar);
                        }
                        this.f15912a.setValue(null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0296a(p1<n.b> p1Var, u1.l lVar) {
                super(1);
                this.f15910c = p1Var;
                this.f15911d = lVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k0 invoke(l0 l0Var) {
                return new C0297a(this.f15910c, this.f15911d);
            }
        }

        @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv3/f0;", "Ljn0/h0;", "<anonymous>", "(Lv3/f0;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements p<f0, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f15914n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f15915o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ CoroutineScope f15916p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ p1<n.b> f15917q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ u1.l f15918r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ y3<wn0.l<g, h0>> f15919s;

            /* JADX INFO: renamed from: b2.w0$a$b$a, reason: collision with other inner class name */
            @p013kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls1/q;", "Lj3/g;", "it", "Ljn0/h0;", "<anonymous>", "(Ls1/q;Lj3/g;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
            static final class C0298a extends SuspendLambda implements q<p021s1.q, g, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f15920n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private /* synthetic */ Object f15921o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                /* synthetic */ long f15922p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ CoroutineScope f15923q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p1<n.b> f15924r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ u1.l f15925s;

                /* JADX INFO: renamed from: b2.w0$a$b$a$a, reason: collision with other inner class name */
                @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
                @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", i = {1}, l = {60, 64}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"})
                static final class C0299a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    Object f15926n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    int f15927o;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    final /* synthetic */ p1<n.b> f15928p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ long f15929q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ u1.l f15930r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0299a(p1<n.b> p1Var, long j11, u1.l lVar, Continuation<? super C0299a> continuation) {
                        super(2, continuation);
                        this.f15928p = p1Var;
                        this.f15929q = j11;
                        this.f15930r = lVar;
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                        return new C0299a(this.f15928p, this.f15929q, this.f15930r, continuation);
                    }

                    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
                    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        p1<n.b> p1Var;
                        p1<n.b> p1Var2;
                        n.b bVar;
                        u1.l lVar;
                        n.b bVar2;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i11 = this.f15927o;
                        if (i11 != 0) {
                            if (i11 == 1) {
                                p1Var2 = (p1) this.f15926n;
                                t.b(obj);
                            } else {
                                if (i11 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                bVar2 = (n.b) this.f15926n;
                                t.b(obj);
                            }
                            bVar = bVar2;
                            this.f15928p.setValue(bVar);
                            return h0.f84049a;
                        }
                        t.b(obj);
                        n.b value = this.f15928p.getValue();
                        if (value == null) {
                            bVar = new n.b(this.f15929q, null);
                            lVar = this.f15930r;
                            if (lVar != null) {
                                this.f15926n = bVar;
                                this.f15927o = 2;
                                if (lVar.a(bVar, this) != coroutine_suspended) {
                                    bVar2 = bVar;
                                    bVar = bVar2;
                                }
                            }
                            this.f15928p.setValue(bVar);
                            return h0.f84049a;
                        }
                        u1.l lVar2 = this.f15930r;
                        p1Var = this.f15928p;
                        n.a aVar = new n.a(value);
                        if (lVar2 == null) {
                            p1Var.setValue(null);
                            bVar = new n.b(this.f15929q, null);
                            lVar = this.f15930r;
                            if (lVar != null) {
                                this.f15926n = bVar;
                                this.f15927o = 2;
                                if (lVar.a(bVar, this) != coroutine_suspended) {
                                    bVar2 = bVar;
                                    bVar = bVar2;
                                }
                            }
                            this.f15928p.setValue(bVar);
                            return h0.f84049a;
                        }
                        this.f15926n = p1Var;
                        this.f15927o = 1;
                        if (lVar2.a(aVar, this) != coroutine_suspended) {
                            p1Var2 = p1Var;
                        }
                        return coroutine_suspended;
                        p1Var = p1Var2;
                        p1Var.setValue(null);
                        bVar = new n.b(this.f15929q, null);
                        lVar = this.f15930r;
                        if (lVar != null) {
                            this.f15926n = bVar;
                            this.f15927o = 2;
                            if (lVar.a(bVar, this) != coroutine_suspended) {
                                bVar2 = bVar;
                                bVar = bVar2;
                            }
                            return coroutine_suspended;
                        }
                        this.f15928p.setValue(bVar);
                        return h0.f84049a;
                    }

                    @Override // wn0.p
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                        return ((C0299a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                    }
                }

                /* JADX INFO: renamed from: b2.w0$a$b$a$b, reason: collision with other inner class name */
                @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
                @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
                static final class C0300b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    Object f15931n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    int f15932o;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    final /* synthetic */ p1<n.b> f15933p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ boolean f15934q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ u1.l f15935r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0300b(p1<n.b> p1Var, boolean z11, u1.l lVar, Continuation<? super C0300b> continuation) {
                        super(2, continuation);
                        this.f15933p = p1Var;
                        this.f15934q = z11;
                        this.f15935r = lVar;
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                        return new C0300b(this.f15933p, this.f15934q, this.f15935r, continuation);
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        p1<n.b> p1Var;
                        p1<n.b> p1Var2;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i11 = this.f15932o;
                        if (i11 == 0) {
                            t.b(obj);
                            n.b value = this.f15933p.getValue();
                            if (value != null) {
                                boolean z11 = this.f15934q;
                                u1.l lVar = this.f15935r;
                                p1Var = this.f15933p;
                                i cVar = z11 ? new n.c(value) : new n.a(value);
                                if (lVar != null) {
                                    this.f15931n = p1Var;
                                    this.f15932o = 1;
                                    if (lVar.a(cVar, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    p1Var2 = p1Var;
                                }
                                p1Var.setValue(null);
                            }
                            return h0.f84049a;
                        }
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p1Var2 = (p1) this.f15931n;
                        t.b(obj);
                        p1Var = p1Var2;
                        p1Var.setValue(null);
                        return h0.f84049a;
                    }

                    @Override // wn0.p
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                        return ((C0300b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0298a(CoroutineScope coroutineScope, p1<n.b> p1Var, u1.l lVar, Continuation<? super C0298a> continuation) {
                    super(3, continuation);
                    this.f15923q = coroutineScope;
                    this.f15924r = p1Var;
                    this.f15925s = lVar;
                }

                public final Object a(p021s1.q qVar, long j11, Continuation<? super h0> continuation) {
                    C0298a c0298a = new C0298a(this.f15923q, this.f15924r, this.f15925s, continuation);
                    c0298a.f15921o = qVar;
                    c0298a.f15922p = j11;
                    return c0298a.invokeSuspend(h0.f84049a);
                }

                @Override // wn0.q
                public /* bridge */ /* synthetic */ Object invoke(p021s1.q qVar, g gVar, Continuation<? super h0> continuation) {
                    return a(qVar, gVar.getPackedValue(), continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f15920n;
                    if (i11 == 0) {
                        t.b(obj);
                        p021s1.q qVar = (p021s1.q) this.f15921o;
                        BuildersKt__Builders_commonKt.launch$default(this.f15923q, null, null, new C0299a(this.f15924r, this.f15922p, this.f15925s, null), 3, null);
                        this.f15920n = 1;
                        obj = qVar.l1(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj);
                    }
                    BuildersKt__Builders_commonKt.launch$default(this.f15923q, null, null, new C0300b(this.f15924r, ((Boolean) obj).booleanValue(), this.f15925s, null), 3, null);
                    return h0.f84049a;
                }
            }

            /* JADX INFO: renamed from: b2.w0$a$b$b, reason: collision with other inner class name */
            @p013kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/g;", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
            static final class C0301b extends u implements wn0.l<g, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ y3<wn0.l<g, h0>> f15936c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0301b(y3<? extends wn0.l<? super g, h0>> y3Var) {
                    super(1);
                    this.f15936c = y3Var;
                }

                public final void a(long j11) {
                    this.f15936c.getValue().invoke(g.d(j11));
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ h0 invoke(g gVar) {
                    a(gVar.getPackedValue());
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(CoroutineScope coroutineScope, p1<n.b> p1Var, u1.l lVar, y3<? extends wn0.l<? super g, h0>> y3Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f15916p = coroutineScope;
                this.f15917q = p1Var;
                this.f15918r = lVar;
                this.f15919s = y3Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f15916p, this.f15917q, this.f15918r, this.f15919s, continuation);
                bVar.f15915o = obj;
                return bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f15914n;
                if (i11 == 0) {
                    t.b(obj);
                    f0 f0Var = (f0) this.f15915o;
                    C0298a c0298a = new C0298a(this.f15916p, this.f15917q, this.f15918r, null);
                    C0301b c0301b = new C0301b(this.f15919s);
                    this.f15914n = 1;
                    if (a0.h(f0Var, c0298a, c0301b, this) == coroutine_suspended) {
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
                return ((b) create(f0Var, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.l<? super g, h0> lVar, u1.l lVar2) {
            super(3);
            this.f15908c = lVar;
            this.f15909d = lVar2;
        }

        public final d a(d dVar, l lVar, int i11) {
            lVar.o(-102778667);
            if (o.J()) {
                o.S(-102778667, i11, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
            }
            Object objI = lVar.I();
            l.Companion companion = l.INSTANCE;
            if (objI == companion.a()) {
                Object a0Var = new p020r2.a0(Function0.k(EmptyCoroutineContext.INSTANCE, lVar));
                lVar.B(a0Var);
                objI = a0Var;
            }
            CoroutineScope coroutineScope = ((p020r2.a0) objI).getCoroutineScope();
            Object objI2 = lVar.I();
            if (objI2 == companion.a()) {
                objI2 = s3.d(null, null, 2, null);
                lVar.B(objI2);
            }
            p1 p1Var = (p1) objI2;
            y3 y3VarO = n3.o(this.f15908c, lVar, 0);
            Object obj = this.f15909d;
            boolean zN = lVar.n(obj);
            u1.l lVar2 = this.f15909d;
            Object objI3 = lVar.I();
            if (zN || objI3 == companion.a()) {
                objI3 = new C0296a(p1Var, lVar2);
                lVar.B(objI3);
            }
            Function0.c(obj, (wn0.l) objI3, lVar, 0);
            d.Companion companion2 = d.INSTANCE;
            u1.l lVar3 = this.f15909d;
            boolean zK = lVar.K(coroutineScope) | lVar.n(this.f15909d) | lVar.n(y3VarO);
            u1.l lVar4 = this.f15909d;
            Object objI4 = lVar.I();
            if (zK || objI4 == companion.a()) {
                Object bVar = new b(coroutineScope, p1Var, lVar4, y3VarO, null);
                lVar.B(bVar);
                objI4 = bVar;
            }
            d dVarD = o0.d(companion2, lVar3, (p) objI4);
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return dVarD;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ d invoke(d dVar, l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    public static final d a(d dVar, u1.l lVar, boolean z11, wn0.l<? super g, h0> lVar2) {
        return z11 ? c.c(dVar, null, new a(lVar2, lVar), 1, null) : dVar;
    }
}
