package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/ui/platform/j0;", "Landroidx/compose/ui/platform/f2;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/view/View;", "view", "Lo4/q0;", "textInputService", "coroutineScope", "<init>", "(Landroid/view/View;Lo4/q0;Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/ui/platform/b2;", "request", "", "a", "(Landroidx/compose/ui/platform/b2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "b", "Lo4/q0;", "c", "Lkotlinx/coroutines/CoroutineScope;", "Ld3/k;", "Landroidx/compose/ui/platform/m1;", "Ljava/util/concurrent/atomic/AtomicReference;", "methodSessionMutex", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "e", "()Z", "isReadyForConnection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j0 implements f2, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o4.q0 textInputService;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference methodSessionMutex = d3.k.a();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", i = {}, l = {73}, m = "startInputMethod", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f5775n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f5777p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5775n = obj;
            this.f5777p |= Integer.MIN_VALUE;
            return j0.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "it", "Landroidx/compose/ui/platform/m1;", "a", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/compose/ui/platform/m1;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<CoroutineScope, m1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b2 f5778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j0 f5779d;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ j0 f5780c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j0 j0Var) {
                super(0);
                this.f5780c = j0Var;
            }

            public final void b() {
                CoroutineScopeKt.cancel$default(this.f5780c.coroutineScope, null, 1, null);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                b();
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b2 b2Var, j0 j0Var) {
            super(1);
            this.f5778c = b2Var;
            this.f5779d = j0Var;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m1 invoke(CoroutineScope coroutineScope) {
            return new m1(this.f5778c, new a(this.f5779d));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/m1;", "methodSession", "", "<anonymous>", "(Landroidx/compose/ui/platform/m1;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", i = {0}, l = {185}, m = "invokeSuspend", n = {"methodSession"}, s = {"L$0"})
    static final class c extends SuspendLambda implements wn0.p<m1, Continuation<?>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5781n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f5782o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f5783p;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m1 f5785c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ j0 f5786d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m1 m1Var, j0 j0Var) {
                super(1);
                this.f5785c = m1Var;
                this.f5786d = j0Var;
            }

            public final void a(Throwable th2) {
                this.f5785c.d();
                this.f5786d.textInputService.f();
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(Throwable th2) {
                a(th2);
                return jn0.h0.f84049a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m1 m1Var, Continuation<?> continuation) {
            return ((c) create(m1Var, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            c cVar = j0.this.new c(continuation);
            cVar.f5783p = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f5782o;
            if (i11 == 0) {
                jn0.t.b(obj);
                m1 m1Var = (m1) this.f5783p;
                j0 j0Var = j0.this;
                this.f5783p = m1Var;
                this.f5781n = j0Var;
                this.f5782o = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                j0Var.textInputService.e();
                cancellableContinuationImpl.invokeOnCancellation(new a(m1Var, j0Var));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (result == coroutine_suspended) {
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

    public j0(View view, o4.q0 q0Var, CoroutineScope coroutineScope) {
        this.view = view;
        this.textInputService = q0Var;
        this.coroutineScope = coroutineScope;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.e2
    public Object a(b2 b2Var, Continuation<?> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f5777p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f5777p = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f5775n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f5777p;
        if (i12 == 0) {
            jn0.t.b(obj);
            AtomicReference atomicReference = this.methodSessionMutex;
            b bVar = new b(b2Var, this);
            c cVar = new c(null);
            aVar.f5777p = 1;
            if (d3.k.d(atomicReference, bVar, cVar, aVar) == coroutine_suspended) {
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

    public final InputConnection d(EditorInfo outAttrs) {
        m1 m1Var = (m1) d3.k.c(this.methodSessionMutex);
        if (m1Var != null) {
            return m1Var.c(outAttrs);
        }
        return null;
    }

    public final boolean e() {
        m1 m1Var = (m1) d3.k.c(this.methodSessionMutex);
        return m1Var != null && m1Var.e();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    @Override // androidx.compose.ui.platform.e2
    public View getView() {
        return this.view;
    }
}
