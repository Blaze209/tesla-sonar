package com.facebook.imagepipeline.producers;

import ch.qos.logback.core.CoreConstants;
import com.facebook.common.memory.PooledByteBuffer;
import expo.modules.interfaces.permissions.PermissionsResponse;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\rB\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/facebook/imagepipeline/producers/f1;", "Lcom/facebook/imagepipeline/producers/z0;", "Ltk/a;", "Lcom/facebook/common/memory/PooledByteBuffer;", "Lum/k;", "inputProducer", "<init>", "(Lcom/facebook/imagepipeline/producers/z0;)V", "Lcom/facebook/imagepipeline/producers/n;", "consumer", "Lcom/facebook/imagepipeline/producers/a1;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "a", "(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/a1;)V", "Lcom/facebook/imagepipeline/producers/z0;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f1 implements z0<tk.a<PooledByteBuffer>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z0<um.k> inputProducer;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/imagepipeline/producers/f1$a;", "Lcom/facebook/imagepipeline/producers/u;", "Lum/k;", "Ltk/a;", "Lcom/facebook/common/memory/PooledByteBuffer;", "Lcom/facebook/imagepipeline/producers/n;", "consumer", "<init>", "(Lcom/facebook/imagepipeline/producers/f1;Lcom/facebook/imagepipeline/producers/n;)V", "newResult", "", PermissionsResponse.STATUS_KEY, "Ljn0/h0;", "p", "(Lum/k;I)V", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class a extends u<um.k, tk.a<PooledByteBuffer>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f1 f21796c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f1 f1Var, n<tk.a<PooledByteBuffer>> consumer) {
            super(consumer);
            p013kotlin.jvm.internal.s.k(consumer, "consumer");
            this.f21796c = f1Var;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(um.k newResult, int status) {
            tk.a<PooledByteBuffer> aVarT = null;
            try {
                if (um.k.u0(newResult) && newResult != null) {
                    aVarT = newResult.t();
                }
                o().b(aVarT, status);
            } finally {
                tk.a.C(aVarT);
            }
        }
    }

    public f1(z0<um.k> inputProducer) {
        p013kotlin.jvm.internal.s.k(inputProducer, "inputProducer");
        this.inputProducer = inputProducer;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<tk.a<PooledByteBuffer>> consumer, a1 context) {
        p013kotlin.jvm.internal.s.k(consumer, "consumer");
        p013kotlin.jvm.internal.s.k(context, "context");
        this.inputProducer.a(new a(this, consumer), context);
    }
}
