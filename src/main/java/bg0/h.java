package bg0;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Size;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import zf0.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/hardware/camera2/CameraCharacteristics;", "", "preferredFps", "Landroid/util/Range;", "c", "(Landroid/hardware/camera2/CameraCharacteristics;I)Landroid/util/Range;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lbg0/i;", "a", "(Landroid/content/Context;)Ljava/util/List;", "Lbg0/k;", "cameraDirection", "Lbg0/j;", "b", "(Landroid/content/Context;Lbg0/k;)Lbg0/j;", "Lzf0/u$b;", DateTokenConverter.CONVERTER_KEY, "(Lbg0/k;)Lzf0/u$b;", "camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17144a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.EXTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17144a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            CameraChoice cameraChoice = (CameraChoice) t12;
            CameraChoice cameraChoice2 = (CameraChoice) t11;
            return mn0.a.d(Integer.valueOf(cameraChoice.getSize().getWidth() * cameraChoice.getSize().getHeight()), Integer.valueOf(cameraChoice2.getSize().getWidth() * cameraChoice2.getSize().getHeight()));
        }
    }

    public static final List<CameraChoice> a(Context context) throws CameraAccessException {
        StreamConfigurationMap streamConfigurationMap;
        Range<Integer> range;
        s.k(context, "context");
        Object systemService = context.getSystemService("camera");
        s.i(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        ArrayList arrayList = new ArrayList();
        String[] cameraIdList = cameraManager.getCameraIdList();
        s.j(cameraIdList, "getCameraIdList(...)");
        int length = cameraIdList.length;
        int i11 = 0;
        int i12 = 0;
        while (i12 < length) {
            String str = cameraIdList[i12];
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            s.j(cameraCharacteristics, "getCameraCharacteristics(...)");
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            int iIntValue = num2 != null ? num2.intValue() : i11;
            u.b bVar = (num != null && num.intValue() == 0) ? u.b.User : (num != null && num.intValue() == 1) ? u.b.Environment : u.b.Unknown;
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && p013kotlin.collections.n.c0(iArr, i11)) {
                Range<Integer> rangeC = c(cameraCharacteristics, 30);
                Class<MediaRecorder> cls = MediaRecorder.class;
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(cls);
                s.j(outputSizes, "getOutputSizes(...)");
                int length2 = outputSizes.length;
                int i13 = i11;
                while (i13 < length2) {
                    Size[] sizeArr = outputSizes;
                    Size size = sizeArr[i13];
                    int i14 = i12;
                    double outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(cls, size) / 1.0E9d;
                    Class<MediaRecorder> cls2 = cls;
                    double d11 = outputMinFrameDuration > 0.0d ? 1.0d / outputMinFrameDuration : 0.0d;
                    s.h(str);
                    s.h(size);
                    CameraManager cameraManager2 = cameraManager;
                    if (rangeC == null) {
                        int i15 = (int) d11;
                        range = new Range<>(Integer.valueOf(i15), Integer.valueOf(i15));
                    } else {
                        range = rangeC;
                    }
                    arrayList.add(new CameraChoice(str, size, d11, range, iIntValue, bVar, new ExtraCameraOptions(0L, false, 3, null)));
                    i13++;
                    outputSizes = sizeArr;
                    length2 = length2;
                    cls = cls2;
                    i12 = i14;
                    cameraManager = cameraManager2;
                    cameraIdList = cameraIdList;
                    length = length;
                }
            }
            i12++;
            cameraManager = cameraManager;
            cameraIdList = cameraIdList;
            length = length;
            i11 = 0;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            CameraChoice cameraChoice = (CameraChoice) obj;
            if (cameraChoice.getSize().getWidth() < 2000 && cameraChoice.getSize().getHeight() < 2000) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final CameraChoices b(Context context, k cameraDirection) {
        s.k(context, "context");
        s.k(cameraDirection, "cameraDirection");
        List<CameraChoice> listA = a(context);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (((CameraChoice) obj).getFacingMode() == d(cameraDirection)) {
                arrayList.add(obj);
            }
        }
        List listA1 = v.a1(arrayList, new b());
        if (listA1.isEmpty()) {
            return null;
        }
        return new CameraChoices((CameraChoice) v.o0(listA1), v.d1(v.i0(listA1, 1), 2));
    }

    private static final Range<Integer> c(CameraCharacteristics cameraCharacteristics, int i11) {
        Range<Integer>[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range<Integer> range = null;
        if (rangeArr == null || rangeArr.length == 0) {
            return null;
        }
        for (Range<Integer> range2 : rangeArr) {
            Object upper = range2.getUpper();
            s.j(upper, "getUpper(...)");
            int iIntValue = ((Number) upper).intValue();
            if (iIntValue >= i11 && (range == null || iIntValue < ((Number) range.getUpper()).intValue())) {
                range = range2;
            }
        }
        if (range != null) {
            return range;
        }
        if (rangeArr.length == 0) {
            throw new NoSuchElementException();
        }
        Range<Integer> range3 = rangeArr[0];
        int iU0 = p013kotlin.collections.n.u0(rangeArr);
        if (iU0 == 0) {
            return range3;
        }
        Integer num = (Integer) range3.getUpper();
        int i12 = 1;
        if (1 <= iU0) {
            while (true) {
                Range<Integer> range4 = rangeArr[i12];
                Integer num2 = (Integer) range4.getUpper();
                if (num.compareTo(num2) < 0) {
                    range3 = range4;
                    num = num2;
                }
                if (i12 == iU0) {
                    break;
                }
                i12++;
            }
        }
        return range3;
    }

    private static final u.b d(k kVar) {
        int i11 = a.f17144a[kVar.ordinal()];
        if (i11 == 1) {
            return u.b.User;
        }
        if (i11 == 2) {
            return u.b.Environment;
        }
        if (i11 == 3) {
            return u.b.Unknown;
        }
        throw new NoWhenBranchMatchedException();
    }
}
