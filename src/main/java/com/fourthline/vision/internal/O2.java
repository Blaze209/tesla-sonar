package com.fourthline.vision.internal;

import android.media.Image;
import android.util.Size;
import com.fourthline.vision.document.DocumentScannerStepWarning;
import java.nio.ByteBuffer;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class O2 implements InterfaceC4265q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f37860c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f37861d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Size f37862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4234l4 f37863b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public O2(Size imageSize, InterfaceC4234l4 detectionAreaProvider) {
        p013kotlin.jvm.internal.s.k(imageSize, "imageSize");
        p013kotlin.jvm.internal.s.k(detectionAreaProvider, "detectionAreaProvider");
        this.f37862a = imageSize;
        this.f37863b = detectionAreaProvider;
    }

    private final boolean isPixelWithinDetectionArea(int i11, Size size, C4165c4 c4165c4) {
        int height = i11 / size.getHeight();
        int height2 = i11 % size.getHeight();
        return height < c4165c4.getBottom() && height > c4165c4.getTop() && height2 > c4165c4.getLeft() && height2 < c4165c4.getRight();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4265q0
    public /* bridge */ /* synthetic */ Object consume(Object obj, Continuation continuation) {
        return consume((Image) obj, (Continuation<? super jn0.h0>) continuation);
    }

    public Object consume(Image image, Continuation<? super jn0.h0> continuation) {
        Image.Plane[] planes = image.getPlanes();
        p013kotlin.jvm.internal.s.j(planes, "getPlanes(...)");
        if (planes.length == 0) {
            return jn0.h0.f84049a;
        }
        C4165c4 c4165c4ContentDetectionArea = this.f37863b.contentDetectionArea();
        int i11 = 0;
        ByteBuffer buffer = image.getPlanes()[0].getBuffer();
        int iPosition = buffer.position();
        int iB = 127;
        while (true) {
            i11 += 1000;
            try {
                if (buffer.limit() <= i11) {
                    break;
                }
                if (isPixelWithinDetectionArea(i11, this.f37862a, c4165c4ContentDetectionArea)) {
                    iB = (iB + (jn0.y.b(buffer.get(i11)) & 255)) / 2;
                }
            } catch (Throwable th2) {
                buffer.position(iPosition);
                throw th2;
            }
        }
        if (iB < 63) {
            throw new AbstractC4255o4.g(p013kotlin.collections.v.e(DocumentScannerStepWarning.DOCUMENT_TOO_DARK), null, 2, null);
        }
        buffer.position(iPosition);
        return jn0.h0.f84049a;
    }
}
