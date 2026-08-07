package tk0;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a@\u0010\u0007\u001a\u00020\u0000*\u00020\u00002(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"?\u0010\f\u001a*\u0012&\u0012$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00010\t8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"?\u0010\u000e\u001a*\u0012&\u0012$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00010\t8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lyk0/c;", "Lkotlin/Function3;", "", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "c", "(Lyk0/c;Lwn0/q;)Lyk0/c;", "Ldl0/a;", "a", "Ldl0/a;", "UploadProgressListenerAttributeKey", "b", "DownloadProgressListenerAttributeKey", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final dl0.a<wn0.q<Long, Long, Continuation<? super h0>, Object>> f114662a = new dl0.a<>("UploadProgressListenerAttributeKey");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl0.a<wn0.q<Long, Long, Continuation<? super h0>, Object>> f114663b = new dl0.a<>("DownloadProgressListenerAttributeKey");

    public static final yk0.c c(yk0.c cVar, wn0.q<? super Long, ? super Long, ? super Continuation<? super h0>, ? extends Object> listener) {
        p013kotlin.jvm.internal.s.k(cVar, "<this>");
        p013kotlin.jvm.internal.s.k(listener, "listener");
        return uk0.b.a(cVar.getCall(), p028zk0.a.a(cVar.getContent(), cVar.getCoroutineContext(), bl0.s.b(cVar), listener)).e();
    }
}
