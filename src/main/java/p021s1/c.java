package p021s1;

import bo0.j;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import j3.i;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.s;
import kotlinx.coroutines.CancellableContinuation;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import t2.b;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ls1/c;", "", "<init>", "()V", "Ls1/f$a;", "request", "", "c", "(Ls1/f$a;)Z", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "", "cause", "b", "(Ljava/lang/Throwable;)V", "Lt2/b;", "a", "Lt2/b;", "requests", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f109448b = b.f112081d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b<f.a> requests = new b<>(new f.a[16], 0);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<Throwable, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f.a f109451d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f.a aVar) {
            super(1);
            this.f109451d = aVar;
        }

        public final void a(Throwable th2) {
            c.this.requests.t(this.f109451d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    public final void b(Throwable cause) {
        b<f.a> bVar = this.requests;
        int size = bVar.getSize();
        CancellableContinuation[] cancellableContinuationArr = new CancellableContinuation[size];
        for (int i11 = 0; i11 < size; i11++) {
            cancellableContinuationArr[i11] = bVar.m()[i11].a();
        }
        for (int i12 = 0; i12 < size; i12++) {
            cancellableContinuationArr[i12].cancel(cause);
        }
        if (!this.requests.p()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public final boolean c(f.a request) {
        i iVarInvoke = request.b().invoke();
        if (iVarInvoke == null) {
            CancellableContinuation<h0> cancellableContinuationA = request.a();
            s.Companion companion = s.INSTANCE;
            cancellableContinuationA.resumeWith(s.b(h0.f84049a));
            return false;
        }
        request.a().invokeOnCancellation(new a(request));
        j jVar = new j(0, this.requests.getSize() - 1);
        int first = jVar.getFirst();
        int last = jVar.getLast();
        if (first <= last) {
            while (true) {
                i iVarInvoke2 = this.requests.m()[last].b().invoke();
                if (iVarInvoke2 != null) {
                    i iVarQ = iVarInvoke.q(iVarInvoke2);
                    if (!p013kotlin.jvm.internal.s.f(iVarQ, iVarInvoke)) {
                        if (!p013kotlin.jvm.internal.s.f(iVarQ, iVarInvoke2)) {
                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                            int size = this.requests.getSize() - 1;
                            if (size <= last) {
                                while (true) {
                                    this.requests.m()[last].a().cancel(cancellationException);
                                    if (size == last) {
                                        break;
                                    }
                                    size++;
                                }
                            }
                        }
                    } else {
                        this.requests.a(last + 1, request);
                        return true;
                    }
                }
                if (last != first) {
                    last--;
                }
            }
        }
        this.requests.a(0, request);
        return true;
    }

    public final void d() {
        j jVar = new j(0, this.requests.getSize() - 1);
        int first = jVar.getFirst();
        int last = jVar.getLast();
        if (first <= last) {
            while (true) {
                this.requests.m()[first].a().resumeWith(s.b(h0.f84049a));
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        this.requests.h();
    }
}
