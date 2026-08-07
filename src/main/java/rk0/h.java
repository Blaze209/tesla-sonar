package rk0;

import bl0.o;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.ktor.http.UnsafeHeaderException;
import java.util.ArrayList;
import java.util.Set;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import wk0.HttpRequestData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"$\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lrk0/a;", "Lkotlinx/coroutines/Job;", "parentJob", "Lkotlin/coroutines/CoroutineContext;", "b", "(Lrk0/a;Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwk0/d;", "request", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lwk0/d;)V", "Lkotlinx/coroutines/CoroutineName;", "a", "Lkotlinx/coroutines/CoroutineName;", "getCALL_COROUTINE", "()Lkotlinx/coroutines/CoroutineName;", "CALL_COROUTINE", "Ldl0/a;", "Lok0/b;", "Ldl0/a;", "c", "()Ldl0/a;", "CLIENT_CONFIG", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CoroutineName f108534a = new CoroutineName("call-context");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl0.a<ok0.b<?>> f108535b = new dl0.a<>("client-config");

    public static final Object b(a aVar, Job job, Continuation<? super CoroutineContext> continuation) {
        CompletableJob completableJobJob = JobKt.Job(job);
        CoroutineContext coroutineContextPlus = aVar.getCoroutineContext().plus(completableJobJob).plus(f108534a);
        Job job2 = (Job) continuation.getContext().get(Job.INSTANCE);
        if (job2 == null) {
            return coroutineContextPlus;
        }
        completableJobJob.invokeOnCompletion(new j(Job.DefaultImpls.invokeOnCompletion$default(job2, true, false, new k(completableJobJob), 2, null)));
        return coroutineContextPlus;
    }

    public static final dl0.a<ok0.b<?>> c() {
        return f108535b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(HttpRequestData dVar) {
        Set<String> setNames = dVar.getHeaders().names();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setNames) {
            if (o.f17654a.r().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new UnsafeHeaderException(arrayList.toString());
        }
    }
}
