package jc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ec.j;
import java.util.List;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import rc.ImageRequest;
import rc.l;
import sc.Size;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b%\u0010,R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b'\u0010/¨\u00060"}, d2 = {"Ljc/e;", "Ljc/d$a;", "Lrc/g;", "initialRequest", "", "Ljc/d;", "interceptors", "", "index", "request", "Lsc/g;", "size", "Lec/j;", "eventListener", "", "isPlaceholderCached", "<init>", "(Lrc/g;Ljava/util/List;ILrc/g;Lsc/g;Lec/j;Z)V", "interceptor", "Ljn0/h0;", "a", "(Lrc/g;Ljc/d;)V", "b", "(ILrc/g;Lsc/g;)Ljc/e;", "Lrc/j;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrc/g;", "getInitialRequest", "()Lrc/g;", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "c", "I", "getIndex", "()I", DateTokenConverter.CONVERTER_KEY, "getRequest", "e", "Lsc/g;", "getSize", "()Lsc/g;", "Lec/j;", "()Lec/j;", "g", "Z", "()Z", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ImageRequest initialRequest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<d> interceptors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ImageRequest request;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Size size;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final j eventListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isPlaceholderCached;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", i = {0}, l = {31}, m = "proceed", n = {"interceptor"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f83584n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f83585o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f83587q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f83585o = obj;
            this.f83587q |= Integer.MIN_VALUE;
            return e.this.f(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(ImageRequest imageRequest, List<? extends d> list, int i11, ImageRequest imageRequest2, Size size, j jVar, boolean z11) {
        this.initialRequest = imageRequest;
        this.interceptors = list;
        this.index = i11;
        this.request = imageRequest2;
        this.size = size;
        this.eventListener = jVar;
        this.isPlaceholderCached = z11;
    }

    private final void a(ImageRequest request, d interceptor) {
        if (request.getContext() != this.initialRequest.getContext()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's context.").toString());
        }
        if (request.getData() == l.f107608a) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot set the request's data to null.").toString());
        }
        if (request.getTarget() != this.initialRequest.getTarget()) {
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's target.").toString());
        }
        if (request.getSizeResolver() == this.initialRequest.getSizeResolver()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    private final e b(int index, ImageRequest request, Size size) {
        return new e(this.initialRequest, this.interceptors, index, request, size, this.eventListener, this.isPlaceholderCached);
    }

    static /* synthetic */ e c(e eVar, int i11, ImageRequest imageRequest, Size size, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = eVar.index;
        }
        if ((i12 & 2) != 0) {
            imageRequest = eVar.getRequest();
        }
        if ((i12 & 4) != 0) {
            size = eVar.getSize();
        }
        return eVar.b(i11, imageRequest, size);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j getEventListener() {
        return this.eventListener;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(Continuation<? super rc.j> continuation) {
        a aVar;
        d dVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f83587q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f83587q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f83585o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f83587q;
        if (i12 == 0) {
            t.b(obj);
            d dVar2 = this.interceptors.get(this.index);
            d.a aVarC = c(this, this.index + 1, null, null, 6, null);
            aVar.f83584n = dVar2;
            aVar.f83587q = 1;
            Object objA = dVar2.a(aVarC, aVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            dVar = dVar2;
            obj = objA;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (d) aVar.f83584n;
            t.b(obj);
        }
        rc.j jVar = (rc.j) obj;
        a(jVar.getRequest(), dVar);
        return jVar;
    }

    @Override // jc.d.a
    public ImageRequest getRequest() {
        return this.request;
    }

    @Override // jc.d.a
    public Size getSize() {
        return this.size;
    }
}
