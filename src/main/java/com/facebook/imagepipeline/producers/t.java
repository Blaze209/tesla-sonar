package com.facebook.imagepipeline.producers;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B%\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/imagepipeline/producers/t;", "Lcom/facebook/imagepipeline/producers/z0;", "Ltk/a;", "Lum/e;", "inputProducer", "Ljava/util/concurrent/ScheduledExecutorService;", "backgroundTasksExecutor", "<init>", "(Lcom/facebook/imagepipeline/producers/z0;Ljava/util/concurrent/ScheduledExecutorService;)V", "Lcom/facebook/imagepipeline/producers/n;", "consumer", "Lcom/facebook/imagepipeline/producers/a1;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "a", "(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/a1;)V", "Lcom/facebook/imagepipeline/producers/z0;", "b", "Ljava/util/concurrent/ScheduledExecutorService;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t implements z0<tk.a<um.e>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z0<tk.a<um.e>> inputProducer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ScheduledExecutorService backgroundTasksExecutor;

    public t(z0<tk.a<um.e>> inputProducer, ScheduledExecutorService scheduledExecutorService) {
        p013kotlin.jvm.internal.s.k(inputProducer, "inputProducer");
        this.inputProducer = inputProducer;
        this.backgroundTasksExecutor = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(t this$0, n consumer, a1 context) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.k(consumer, "$consumer");
        p013kotlin.jvm.internal.s.k(context, "$context");
        this$0.inputProducer.a(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(final n<tk.a<um.e>> consumer, final a1 context) {
        p013kotlin.jvm.internal.s.k(consumer, "consumer");
        p013kotlin.jvm.internal.s.k(context, "context");
        com.facebook.imagepipeline.request.a aVarB = context.B();
        ScheduledExecutorService scheduledExecutorService = this.backgroundTasksExecutor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new Runnable() { // from class: com.facebook.imagepipeline.producers.s
                @Override // java.lang.Runnable
                public final void run() {
                    t.d(this.f21974a, consumer, context);
                }
            }, aVarB.e(), TimeUnit.MILLISECONDS);
        } else {
            this.inputProducer.a(consumer, context);
        }
    }
}
