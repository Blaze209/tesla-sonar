package qk0;

import bl0.c;
import bl0.k;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cl0.b;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.ktor.utils.io.d;
import io.ktor.utils.io.g;
import io.ktor.utils.io.j;
import io.ktor.utils.io.u;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.GlobalScope;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BD\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012(\u0010\u000b\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R9\u0010\u000b\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u0012\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001eR\u0014\u0010\"\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lqk0/a;", "Lcl0/b$c;", "Lcl0/b;", "delegate", "Lkotlin/coroutines/CoroutineContext;", "callContext", "Lkotlin/Function3;", "", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcl0/b;Lkotlin/coroutines/CoroutineContext;Lwn0/q;)V", "Lio/ktor/utils/io/g;", DateTokenConverter.CONVERTER_KEY, "()Lio/ktor/utils/io/g;", "a", "Lcl0/b;", "b", "Lkotlin/coroutines/CoroutineContext;", "c", "Lwn0/q;", "Lio/ktor/utils/io/g;", "getContent$annotations", "()V", "content", "Lbl0/c;", "()Lbl0/c;", CMSAttributeTableGenerator.CONTENT_TYPE, "()Ljava/lang/Long;", "contentLength", "Lbl0/k;", "()Lbl0/k;", "headers", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext callContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q<Long, Long, Continuation<? super h0>, Object> listener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g content;

    /* JADX INFO: renamed from: qk0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/u;", "Ljn0/h0;", "<anonymous>", "(Lio/ktor/utils/io/u;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.content.ObservableContent$content$1", f = "ObservableContent.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    static final class C2241a extends SuspendLambda implements p<u, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f105622n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f105623o;

        C2241a(Continuation<? super C2241a> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u uVar, Continuation<? super h0> continuation) {
            return ((C2241a) create(uVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C2241a c2241a = a.this.new C2241a(continuation);
            c2241a.f105623o = obj;
            return c2241a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f105622n;
            if (i11 == 0) {
                t.b(obj);
                u uVar = (u) this.f105623o;
                b.d dVar = (b.d) a.this.delegate;
                j channel = uVar.getChannel();
                this.f105622n = 1;
                if (dVar.d(channel, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public a(b delegate, CoroutineContext callContext, q<? super Long, ? super Long, ? super Continuation<? super h0>, ? extends Object> listener) {
        g channel;
        s.k(delegate, "delegate");
        s.k(callContext, "callContext");
        s.k(listener, "listener");
        this.delegate = delegate;
        this.callContext = callContext;
        this.listener = listener;
        if (delegate instanceof b.a) {
            channel = d.a(((b.a) delegate).getBytes());
        } else if (delegate instanceof b.AbstractC0400b) {
            channel = g.INSTANCE.a();
        } else if (delegate instanceof b.c) {
            channel = ((b.c) delegate).d();
        } else {
            if (!(delegate instanceof b.d)) {
                throw new NoWhenBranchMatchedException();
            }
            channel = io.ktor.utils.io.p.b(GlobalScope.INSTANCE, callContext, true, new C2241a(null)).getChannel();
        }
        this.content = channel;
    }

    @Override // cl0.b
    /* JADX INFO: renamed from: a */
    public Long getContentLength() {
        return this.delegate.getContentLength();
    }

    @Override // cl0.b
    /* JADX INFO: renamed from: b */
    public c getContentType() {
        return this.delegate.getContentType();
    }

    @Override // cl0.b
    public k c() {
        return this.delegate.c();
    }

    @Override // cl0.b.c
    public g d() {
        return p028zk0.a.a(this.content, this.callContext, getContentLength(), this.listener);
    }
}
