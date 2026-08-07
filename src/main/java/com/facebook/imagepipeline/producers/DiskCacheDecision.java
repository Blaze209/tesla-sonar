package com.facebook.imagepipeline.producers;

import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/facebook/imagepipeline/producers/DiskCacheDecision;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/request/a;", "imageRequest", "Lnm/j;", "smallDiskCache", "defaultDiskCache", "", "", "dynamicDiskCaches", "a", "(Lcom/facebook/imagepipeline/request/a;Lnm/j;Lnm/j;Ljava/util/Map;)Lnm/j;", "DiskCacheDecisionNoDiskCacheChosenException", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DiskCacheDecision {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DiskCacheDecision f21733a = new DiskCacheDecision();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/imagepipeline/producers/DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DiskCacheDecisionNoDiskCacheChosenException extends Exception {
        public DiskCacheDecisionNoDiskCacheChosenException(String str) {
            super(str);
        }
    }

    private DiskCacheDecision() {
    }

    public static final nm.j a(com.facebook.imagepipeline.request.a imageRequest, nm.j smallDiskCache, nm.j defaultDiskCache, Map<String, nm.j> dynamicDiskCaches) {
        String strF;
        p013kotlin.jvm.internal.s.k(imageRequest, "imageRequest");
        if (imageRequest.c() == com.facebook.imagepipeline.request.a.b.SMALL) {
            return smallDiskCache;
        }
        if (imageRequest.c() == com.facebook.imagepipeline.request.a.b.DEFAULT) {
            return defaultDiskCache;
        }
        if (imageRequest.c() != com.facebook.imagepipeline.request.a.b.DYNAMIC || dynamicDiskCaches == null || (strF = imageRequest.f()) == null) {
            return null;
        }
        return dynamicDiskCaches.get(strF);
    }
}
