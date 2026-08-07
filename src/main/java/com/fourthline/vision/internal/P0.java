package com.fourthline.vision.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.util.Size;
import android.view.Display;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class P0 extends C4312x {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final a f37871m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f37872n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Size f37873o = new Size(1, 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Size f37874l;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return mn0.a.d(Integer.valueOf(((Size) obj2).getWidth()), Integer.valueOf(((Size) obj).getWidth()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(CameraManager delegate, C4312x.c cameraDirection, Display display) {
        super(delegate, cameraDirection, display);
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        p013kotlin.jvm.internal.s.k(cameraDirection, "cameraDirection");
        p013kotlin.jvm.internal.s.k(display, "display");
        this.f37874l = getSize(ImageReader.class, true);
    }

    private final List<Size> filterSizes(Size[] sizeArr, Size size) {
        Float fValueOf = size != null ? Float.valueOf(size.getWidth() / size.getHeight()) : null;
        ArrayList arrayList = new ArrayList();
        for (Size size2 : sizeArr) {
            if (fValueOf == null ? true : p013kotlin.jvm.internal.s.a(size2.getWidth() / size2.getHeight(), fValueOf)) {
                arrayList.add(size2);
            }
        }
        return p013kotlin.collections.v.a1(arrayList, new b());
    }

    private final Size getImprovedSize(Class<?> cls) throws AbstractC4277s.c {
        StreamConfigurationMap streamConfigurationMap;
        Object next;
        Object next2 = null;
        if (!StreamConfigurationMap.isOutputSupportedFor(cls) || getCameraId() == null || (streamConfigurationMap = (StreamConfigurationMap) getDelegate().getCameraCharacteristics(getCameraId()).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) == null) {
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(cls);
        p013kotlin.jvm.internal.s.j(outputSizes, "getOutputSizes(...)");
        List<Size> listFilterSizes = filterSizes(outputSizes, getSize(cls));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFilterSizes) {
            if (((Size) obj).getHeight() >= 1080) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int height = ((Size) next).getHeight();
                do {
                    Object next3 = it.next();
                    int height2 = ((Size) next3).getHeight();
                    if (height > height2) {
                        next = next3;
                        height = height2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Size size = (Size) next;
        if (size == null) {
            Iterator<T> it2 = listFilterSizes.iterator();
            if (it2.hasNext()) {
                next2 = it2.next();
                if (it2.hasNext()) {
                    int height3 = ((Size) next2).getHeight();
                    do {
                        Object next4 = it2.next();
                        int height4 = ((Size) next4).getHeight();
                        if (height3 < height4) {
                            next2 = next4;
                            height3 = height4;
                        }
                    } while (it2.hasNext());
                }
            }
            size = (Size) next2;
            if (size == null) {
                throw AbstractC4277s.c.f38821a;
            }
        }
        return improveSizeSelection(listFilterSizes, size);
    }

    private final Size getSize(Class<?> cls, boolean z11) throws AbstractC4277s.c {
        if (!z11) {
            return super.getSize(cls);
        }
        Size improvedSize = getImprovedSize(cls);
        return improvedSize == null ? f37873o : improvedSize;
    }

    private final Size improveSizeSelection(List<Size> list, Size size) {
        if (1920.0f / size.getWidth() < 0.7f) {
            return size;
        }
        ListIterator<Size> listIterator = list.listIterator();
        while (listIterator.hasNext() && !p013kotlin.jvm.internal.s.f(listIterator.next(), size)) {
        }
        while (listIterator.hasPrevious()) {
            Size sizePrevious = listIterator.previous();
            if (1920.0f / sizePrevious.getWidth() > 0.7f) {
                size = sizePrevious;
            }
        }
        return size;
    }

    @Override // com.fourthline.vision.internal.C4312x
    public Size getImageReaderSize() {
        return this.f37874l;
    }
}
