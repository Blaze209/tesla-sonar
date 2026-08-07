package z20;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u0004\u0018\u00010\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lz20/g;", "Lz20/e$a;", "", Action.KEY_ATTRIBUTE, "Lkotlinx/coroutines/Job;", "job", "<init>", "(Ljava/lang/String;Lkotlinx/coroutines/Job;)V", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "Lkotlinx/coroutines/Job;", "c", "()Lkotlinx/coroutines/Job;", "Lz20/g;", "e", "()Lz20/g;", "f", "(Lz20/g;)V", "nextListNode", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class g implements e.a<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Job job;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private g nextListNode;

    public g(String key, Job job) {
        s.k(key, "key");
        s.k(job, "job");
        this.key = key;
        this.job = job;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Job getJob() {
        return this.job;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Override // z20.e.a
    /* JADX INFO: renamed from: e, reason: from getter and merged with bridge method [inline-methods] */
    public g b() {
        return this.nextListNode;
    }

    @Override // z20.e.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void a(g gVar) {
        this.nextListNode = gVar;
    }
}
