package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/facebook/imagepipeline/producers/e1;", "Lcom/facebook/imagepipeline/producers/l0;", "Ljava/util/concurrent/Executor;", "executor", "Lsk/h;", "pooledByteBufferFactory", "Landroid/content/ContentResolver;", "contentResolver", "<init>", "(Ljava/util/concurrent/Executor;Lsk/h;Landroid/content/ContentResolver;)V", "Lcom/facebook/imagepipeline/request/a;", "imageRequest", "Lum/k;", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/imagepipeline/request/a;)Lum/k;", "", "f", "()Ljava/lang/String;", "c", "Landroid/content/ContentResolver;", "a", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e1 extends l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ContentResolver contentResolver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(Executor executor, sk.h pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        p013kotlin.jvm.internal.s.k(executor, "executor");
        p013kotlin.jvm.internal.s.k(pooledByteBufferFactory, "pooledByteBufferFactory");
        p013kotlin.jvm.internal.s.k(contentResolver, "contentResolver");
        this.contentResolver = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    protected um.k d(com.facebook.imagepipeline.request.a imageRequest) throws FileNotFoundException {
        p013kotlin.jvm.internal.s.k(imageRequest, "imageRequest");
        InputStream inputStreamOpenInputStream = this.contentResolver.openInputStream(imageRequest.v());
        if (inputStreamOpenInputStream == null) {
            throw new IllegalStateException("ContentResolver returned null InputStream");
        }
        um.k kVarE = e(inputStreamOpenInputStream, -1);
        p013kotlin.jvm.internal.s.j(kVarE, "getEncodedImage(...)");
        return kVarE;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    protected String f() {
        return "QualifiedResourceFetchProducer";
    }
}
