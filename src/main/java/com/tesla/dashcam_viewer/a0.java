package com.tesla.dashcam_viewer;

import java.lang.annotation.Annotation;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/tesla/dashcam_viewer/a0;", "", "", "getId", "()Ljava/lang/String;", "Id", "Companion", "a", "Lcom/tesla/dashcam_viewer/y;", "Lcom/tesla/dashcam_viewer/z;", "Lcom/tesla/dashcam_viewer/b0;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public interface a0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f55770a;

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.a0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/dashcam_viewer/a0$a;", "", "<init>", "()V", "Lro0/d;", "Lcom/tesla/dashcam_viewer/a0;", "serializer", "()Lro0/d;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f55770a = new Companion();

        private Companion() {
        }

        public final ro0.d<a0> serializer() {
            return new ro0.m("com.tesla.dashcam_viewer.PhotoBoothResponse", p013kotlin.jvm.internal.o0.b(a0.class), new co0.d[]{p013kotlin.jvm.internal.o0.b(PhotoBoothImageResponse.class), p013kotlin.jvm.internal.o0.b(PhotoBoothListResponse.class), p013kotlin.jvm.internal.o0.b(PhotoBoothThumbnailResponse.class)}, new ro0.d[]{PhotoBoothImageResponse.a.f56147a, PhotoBoothListResponse.a.f56167a, PhotoBoothThumbnailResponse.a.f55775a}, new Annotation[0]);
        }
    }

    String getId();
}
