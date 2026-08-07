package u6;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.coroutines.CompletableDeferred;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lu6/v;", "T", "", "<init>", "()V", "a", "Lu6/v$a;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class v<T> {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002BQ\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR3\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lu6/v$a;", "T", "Lu6/v;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "transform", "Lkotlinx/coroutines/CompletableDeferred;", "ack", "Lu6/h0;", "lastState", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "<init>", "(Lwn0/p;Lkotlinx/coroutines/CompletableDeferred;Lu6/h0;Lkotlin/coroutines/CoroutineContext;)V", "a", "Lwn0/p;", DateTokenConverter.CONVERTER_KEY, "()Lwn0/p;", "b", "Lkotlinx/coroutines/CompletableDeferred;", "()Lkotlinx/coroutines/CompletableDeferred;", "c", "Lu6/h0;", "()Lu6/h0;", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> extends v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final wn0.p<T, Continuation<? super T>, Object> transform;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final CompletableDeferred<T> ack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final h0<T> lastState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final CoroutineContext callerContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(wn0.p<? super T, ? super Continuation<? super T>, ? extends Object> transform, CompletableDeferred<T> ack, h0<T> h0Var, CoroutineContext callerContext) {
            super(null);
            p013kotlin.jvm.internal.s.k(transform, "transform");
            p013kotlin.jvm.internal.s.k(ack, "ack");
            p013kotlin.jvm.internal.s.k(callerContext, "callerContext");
            this.transform = transform;
            this.ack = ack;
            this.lastState = h0Var;
            this.callerContext = callerContext;
        }

        public final CompletableDeferred<T> a() {
            return this.ack;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CoroutineContext getCallerContext() {
            return this.callerContext;
        }

        public h0<T> c() {
            return this.lastState;
        }

        public final wn0.p<T, Continuation<? super T>, Object> d() {
            return this.transform;
        }
    }

    public /* synthetic */ v(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private v() {
    }
}
