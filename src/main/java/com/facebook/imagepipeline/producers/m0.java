package com.facebook.imagepipeline.producers;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.FileInputStream;
import java.util.concurrent.Executor;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/facebook/imagepipeline/producers/m0;", "Lcom/facebook/imagepipeline/producers/l0;", "Ljava/util/concurrent/Executor;", "executor", "Lsk/h;", "pooledByteBufferFactory", "<init>", "(Ljava/util/concurrent/Executor;Lsk/h;)V", "Lcom/facebook/imagepipeline/request/a;", "imageRequest", "Lum/k;", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/imagepipeline/request/a;)Lum/k;", "", "f", "()Ljava/lang/String;", "c", "a", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m0 extends l0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Executor executor, sk.h pooledByteBufferFactory) {
        super(executor, pooledByteBufferFactory);
        p013kotlin.jvm.internal.s.k(executor, "executor");
        p013kotlin.jvm.internal.s.k(pooledByteBufferFactory, "pooledByteBufferFactory");
    }

    @Override // com.facebook.imagepipeline.producers.l0
    protected um.k d(com.facebook.imagepipeline.request.a imageRequest) {
        p013kotlin.jvm.internal.s.k(imageRequest, "imageRequest");
        return e(new FileInputStream(imageRequest.u().toString()), (int) imageRequest.u().length());
    }

    @Override // com.facebook.imagepipeline.producers.l0
    protected String f() {
        return "LocalFileFetchProducer";
    }
}
