package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import java.util.concurrent.Executor;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/facebook/imagepipeline/producers/n0;", "Lcom/facebook/imagepipeline/producers/l0;", "Ljava/util/concurrent/Executor;", "executor", "Lsk/h;", "pooledByteBufferFactory", "Landroid/content/res/Resources;", "resources", "<init>", "(Ljava/util/concurrent/Executor;Lsk/h;Landroid/content/res/Resources;)V", "Lcom/facebook/imagepipeline/request/a;", "imageRequest", "", "g", "(Lcom/facebook/imagepipeline/request/a;)I", "Lum/k;", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/imagepipeline/request/a;)Lum/k;", "", "f", "()Ljava/lang/String;", "c", "Landroid/content/res/Resources;", "a", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0 extends l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Resources resources;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.n0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/imagepipeline/producers/n0$a;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/request/a;", "imageRequest", "", "b", "(Lcom/facebook/imagepipeline/request/a;)I", "", "PRODUCER_NAME", "Ljava/lang/String;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(com.facebook.imagepipeline.request.a imageRequest) {
            String path = imageRequest.v().getPath();
            if (path == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String strSubstring = path.substring(1);
            p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
            return Integer.parseInt(strSubstring);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Executor executor, sk.h pooledByteBufferFactory, Resources resources) {
        super(executor, pooledByteBufferFactory);
        p013kotlin.jvm.internal.s.k(executor, "executor");
        p013kotlin.jvm.internal.s.k(pooledByteBufferFactory, "pooledByteBufferFactory");
        p013kotlin.jvm.internal.s.k(resources, "resources");
        this.resources = resources;
    }

    private final int g(com.facebook.imagepipeline.request.a imageRequest) {
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = null;
        try {
            assetFileDescriptorOpenRawResourceFd = this.resources.openRawResourceFd(INSTANCE.b(imageRequest));
            int length = (int) assetFileDescriptorOpenRawResourceFd.getLength();
            try {
                assetFileDescriptorOpenRawResourceFd.close();
                return length;
            } catch (IOException unused) {
                return length;
            }
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th2) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }

    @Override // com.facebook.imagepipeline.producers.l0
    protected um.k d(com.facebook.imagepipeline.request.a imageRequest) {
        p013kotlin.jvm.internal.s.k(imageRequest, "imageRequest");
        return e(this.resources.openRawResource(INSTANCE.b(imageRequest)), g(imageRequest));
    }

    @Override // com.facebook.imagepipeline.producers.l0
    protected String f() {
        return "LocalResourceFetchProducer";
    }
}
