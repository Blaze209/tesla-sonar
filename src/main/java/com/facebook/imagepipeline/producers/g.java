package com.facebook.imagepipeline.producers;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B7\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\b¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/facebook/imagepipeline/producers/g;", "Lcom/facebook/imagepipeline/producers/i;", "Lnm/x;", "Ljk/d;", "Lum/e;", "memoryCache", "Lnm/k;", "cacheKeyFactory", "Lcom/facebook/imagepipeline/producers/z0;", "Ltk/a;", "inputProducer", "<init>", "(Lnm/x;Lnm/k;Lcom/facebook/imagepipeline/producers/z0;)V", "Lcom/facebook/imagepipeline/producers/n;", "consumer", "cacheKey", "", "isMemoryCacheEnabled", "g", "(Lcom/facebook/imagepipeline/producers/n;Ljk/d;Z)Lcom/facebook/imagepipeline/producers/n;", "", "e", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "a", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(nm.x<jk.d, um.e> memoryCache, nm.k cacheKeyFactory, z0<tk.a<um.e>> inputProducer) {
        super(memoryCache, cacheKeyFactory, inputProducer);
        p013kotlin.jvm.internal.s.k(memoryCache, "memoryCache");
        p013kotlin.jvm.internal.s.k(cacheKeyFactory, "cacheKeyFactory");
        p013kotlin.jvm.internal.s.k(inputProducer, "inputProducer");
    }

    @Override // com.facebook.imagepipeline.producers.i
    protected String d() {
        return "pipe_ui";
    }

    @Override // com.facebook.imagepipeline.producers.i
    protected String e() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override // com.facebook.imagepipeline.producers.i
    protected n<tk.a<um.e>> g(n<tk.a<um.e>> consumer, jk.d cacheKey, boolean isMemoryCacheEnabled) {
        p013kotlin.jvm.internal.s.k(consumer, "consumer");
        p013kotlin.jvm.internal.s.k(cacheKey, "cacheKey");
        return consumer;
    }
}
