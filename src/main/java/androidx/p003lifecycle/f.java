package androidx.p003lifecycle;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.EnumC4419g;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BE\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012(\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\u0012R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/f;", "T", "Landroidx/lifecycle/g0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/e0;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "<init>", "(Lkotlin/coroutines/CoroutineContext;JLwn0/p;)V", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onActive", "()V", "onInactive", "Landroidx/lifecycle/c;", "c", "Landroidx/lifecycle/c;", "blockRunner", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f<T> extends g0<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private c<T> blockRunner;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f<T> f8791c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<T> fVar) {
            super(0);
            this.f8791c = fVar;
        }

        public final void b() {
            ((f) this.f8791c).blockRunner = null;
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE}, m = "clearSource$lifecycle_livedata_release", n = {"this"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f8792n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f8793o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ f<T> f8794p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f8795q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f<T> fVar, Continuation<? super b> continuation) {
            super(continuation);
            this.f8794p = fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8793o = obj;
            this.f8795q |= Integer.MIN_VALUE;
            return this.f8794p.e(this);
        }
    }

    public f(CoroutineContext context, long j11, p<? super e0<T>, ? super Continuation<? super h0>, ? extends Object> block) {
        s.k(context, "context");
        s.k(block, "block");
        this.blockRunner = new c<>(this, block, j11, CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate().plus(context).plus(SupervisorKt.SupervisorJob((Job) context.get(Job.INSTANCE)))), new a(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Continuation<? super h0> continuation) {
        b bVar;
        f<T> fVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f8795q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f8795q = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, continuation);
            }
        } else {
            bVar = new b(this, continuation);
        }
        Object obj = bVar.f8793o;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f8795q;
        if (i12 == 0) {
            t.b(obj);
            fVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (f) bVar.f8792n;
            t.b(obj);
        }
        fVar.getClass();
        return h0.f84049a;
    }

    @Override // androidx.p003lifecycle.g0, androidx.p003lifecycle.d0
    protected void onActive() {
        super.onActive();
        c<T> cVar = this.blockRunner;
        if (cVar != null) {
            cVar.h();
        }
    }

    @Override // androidx.p003lifecycle.g0, androidx.p003lifecycle.d0
    protected void onInactive() {
        super.onInactive();
        c<T> cVar = this.blockRunner;
        if (cVar != null) {
            cVar.g();
        }
    }
}
