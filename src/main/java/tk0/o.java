package tk0;

import jn0.h0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.slf4j.Logger;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", "requestJob", "Lkotlinx/coroutines/Job;", "clientEngineJob", "Ljn0/h0;", "c", "(Lkotlinx/coroutines/CompletableJob;Lkotlinx/coroutines/Job;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "a", "Lorg/slf4j/Logger;", "LOGGER", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f114729a = gl0.a.a("io.ktor.client.plugins.HttpRequestLifecycle");

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DisposableHandle f114730c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(DisposableHandle disposableHandle) {
            super(1);
            this.f114730c = disposableHandle;
        }

        public final void a(Throwable th2) {
            this.f114730c.dispose();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CompletableJob f114731c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CompletableJob completableJob) {
            super(1);
            this.f114731c = completableJob;
        }

        public final void a(Throwable th2) {
            if (th2 == null) {
                o.f114729a.trace("Cancelling request because engine Job completed");
                this.f114731c.complete();
                return;
            }
            o.f114729a.trace("Cancelling request because engine Job failed with error: " + th2);
            JobKt.cancel(this.f114731c, "Engine failed", th2);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(CompletableJob completableJob, Job job) {
        completableJob.invokeOnCompletion(new a(job.invokeOnCompletion(new b(completableJob))));
    }
}
