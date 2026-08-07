package u3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import j3.g;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.u;
import w4.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0016\u0010,\u001a\u0004\u0018\u00010)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lu3/b;", "", "<init>", "()V", "Lj3/g;", "available", "Lu3/e;", "source", DateTokenConverter.CONVERTER_KEY, "(JI)J", "consumed", "b", "(JJI)J", "Lw4/y;", "c", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lu3/c;", "Lu3/c;", "f", "()Lu3/c;", "j", "(Lu3/c;)V", "nestedScrollNode", "Lkotlin/Function0;", "Lkotlinx/coroutines/CoroutineScope;", "Lwn0/a;", "getCalculateNestedScrollScope$ui_release", "()Lwn0/a;", IntegerTokenConverter.CONVERTER_KEY, "(Lwn0/a;)V", "calculateNestedScrollScope", "Lkotlinx/coroutines/CoroutineScope;", "h", "()Lkotlinx/coroutines/CoroutineScope;", "k", "(Lkotlinx/coroutines/CoroutineScope;)V", "scope", "e", "coroutineScope", "Lu3/a;", "g", "()Lu3/a;", "parent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private u3.c nestedScrollNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private wn0.a<? extends CoroutineScope> calculateNestedScrollScope = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private CoroutineScope scope;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "b", "()Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<CoroutineScope> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope invoke() {
            return b.this.getScope();
        }
    }

    /* JADX INFO: renamed from: u3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_QUESTION_VALUE}, m = "dispatchPostFling-RZ2iAVY", n = {}, s = {})
    static final class C2469b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f115330n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f115332p;

        C2469b(Continuation<? super C2469b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115330n = obj;
            this.f115332p |= Integer.MIN_VALUE;
            return b.this.a(0L, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m = "dispatchPreFling-QWom1Mo", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f115333n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f115335p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115333n = obj;
            this.f115335p |= Integer.MIN_VALUE;
            return b.this.c(0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(long j11, long j12, Continuation<? super y> continuation) {
        C2469b c2469b;
        long jA;
        if (continuation instanceof C2469b) {
            c2469b = (C2469b) continuation;
            int i11 = c2469b.f115332p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2469b.f115332p = i11 - Integer.MIN_VALUE;
            } else {
                c2469b = new C2469b(continuation);
            }
        } else {
            c2469b = new C2469b(continuation);
        }
        C2469b c2469b2 = c2469b;
        Object objV = c2469b2.f115330n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c2469b2.f115332p;
        if (i12 == 0) {
            t.b(objV);
            u3.a aVarG = g();
            if (aVarG != null) {
                c2469b2.f115332p = 1;
                objV = aVarG.V(j11, j12, c2469b2);
                if (objV == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                jA = y.INSTANCE.a();
            }
            return y.b(jA);
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(objV);
        jA = ((y) objV).getPackedValue();
        return y.b(jA);
    }

    public final long b(long consumed, long available, int source) {
        u3.a aVarG = g();
        return aVarG != null ? aVarG.n0(consumed, available, source) : g.INSTANCE.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j11, Continuation<? super y> continuation) {
        c cVar;
        long jA;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f115335p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f115335p = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objE0 = cVar.f115333n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f115335p;
        if (i12 == 0) {
            t.b(objE0);
            u3.a aVarG = g();
            if (aVarG != null) {
                cVar.f115335p = 1;
                objE0 = aVarG.E0(j11, cVar);
                if (objE0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                jA = y.INSTANCE.a();
            }
            return y.b(jA);
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(objE0);
        jA = ((y) objE0).getPackedValue();
        return y.b(jA);
    }

    public final long d(long available, int source) {
        u3.a aVarG = g();
        return aVarG != null ? aVarG.L1(available, source) : g.INSTANCE.c();
    }

    public final CoroutineScope e() {
        CoroutineScope coroutineScopeInvoke = this.calculateNestedScrollScope.invoke();
        if (coroutineScopeInvoke != null) {
            return coroutineScopeInvoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final u3.c getNestedScrollNode() {
        return this.nestedScrollNode;
    }

    public final u3.a g() {
        u3.c cVar = this.nestedScrollNode;
        if (cVar != null) {
            return cVar.A2();
        }
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final CoroutineScope getScope() {
        return this.scope;
    }

    public final void i(wn0.a<? extends CoroutineScope> aVar) {
        this.calculateNestedScrollScope = aVar;
    }

    public final void j(u3.c cVar) {
        this.nestedScrollNode = cVar;
    }

    public final void k(CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }
}
