package b5;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    HashMap<Object, HashMap<String, float[]>> f16451a = new HashMap<>();

    public float a(Object obj, String str, int i11) {
        HashMap<String, float[]> map;
        float[] fArr;
        if (this.f16451a.containsKey(obj) && (map = this.f16451a.get(obj)) != null && map.containsKey(str) && (fArr = map.get(str)) != null && fArr.length > i11) {
            return fArr[i11];
        }
        return Float.NaN;
    }

    public void b(Object obj, String str, int i11, float f11) {
        if (!this.f16451a.containsKey(obj)) {
            HashMap<String, float[]> map = new HashMap<>();
            float[] fArr = new float[i11 + 1];
            fArr[i11] = f11;
            map.put(str, fArr);
            this.f16451a.put(obj, map);
            return;
        }
        HashMap<String, float[]> map2 = this.f16451a.get(obj);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        if (!map2.containsKey(str)) {
            float[] fArr2 = new float[i11 + 1];
            fArr2[i11] = f11;
            map2.put(str, fArr2);
            this.f16451a.put(obj, map2);
            return;
        }
        float[] fArrCopyOf = map2.get(str);
        if (fArrCopyOf == null) {
            fArrCopyOf = new float[0];
        }
        if (fArrCopyOf.length <= i11) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i11 + 1);
        }
        fArrCopyOf[i11] = f11;
        map2.put(str, fArrCopyOf);
    }
}
