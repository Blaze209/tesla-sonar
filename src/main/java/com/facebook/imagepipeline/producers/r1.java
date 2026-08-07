package com.facebook.imagepipeline.producers;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/imagepipeline/producers/r1;", "", "<init>", "()V", "", Snapshot.WIDTH, Snapshot.HEIGHT, "Lom/f;", "resizeOptions", "", "b", "(IILom/f;)Z", "Lum/k;", "encodedImage", "c", "(Lum/k;Lom/f;)Z", "size", "a", "(I)I", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1 f21973a = new r1();

    private r1() {
    }

    public static final int a(int size) {
        return (int) (size * 1.3333334f);
    }

    public static final boolean b(int width, int height, om.f resizeOptions) {
        if (resizeOptions == null) {
            return ((float) a(width)) >= 2048.0f && a(height) >= 2048;
        }
        return a(width) >= resizeOptions.com.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String && a(height) >= resizeOptions.com.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String;
    }

    public static final boolean c(um.k encodedImage, om.f resizeOptions) {
        if (encodedImage == null) {
            return false;
        }
        int iU2 = encodedImage.U2();
        return (iU2 == 90 || iU2 == 270) ? b(encodedImage.getHeight(), encodedImage.getWidth(), resizeOptions) : b(encodedImage.getWidth(), encodedImage.getHeight(), resizeOptions);
    }
}
