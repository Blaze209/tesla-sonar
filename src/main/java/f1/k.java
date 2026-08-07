package f1;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.h3;
import androidx.camera.core.impl.j1;
import c0.b0;
import c0.y0;
import g1.m1;
import g1.n1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import z0.e2;
import z0.s;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Map<Integer, n1>> f63778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h3 f63779b;

    static {
        HashMap map = new HashMap();
        f63778a = map;
        f63779b = h3.UPTIME;
        HashMap map2 = new HashMap();
        n1 n1Var = n1.f66976a;
        map2.put(1, n1Var);
        n1 n1Var2 = n1.f66978c;
        map2.put(2, n1Var2);
        n1 n1Var3 = n1.f66979d;
        map2.put(4096, n1Var3);
        Integer numValueOf = Integer.valueOf(PKIFailureInfo.certRevoked);
        map2.put(numValueOf, n1Var3);
        HashMap map3 = new HashMap();
        map3.put(1, n1Var);
        map3.put(2, n1Var2);
        map3.put(4096, n1Var3);
        map3.put(numValueOf, n1Var3);
        HashMap map4 = new HashMap();
        map4.put(1, n1Var);
        map4.put(4, n1Var2);
        map4.put(4096, n1Var3);
        map4.put(16384, n1Var3);
        map4.put(2, n1Var);
        map4.put(8, n1Var2);
        map4.put(numValueOf, n1Var3);
        map4.put(32768, n1Var3);
        HashMap map5 = new HashMap();
        map5.put(256, n1Var2);
        map5.put(512, n1.f66977b);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    @NonNull
    private static String a(@NonNull b0 b0Var) {
        int iB = b0Var.b();
        if (iB == 1) {
            return "video/avc";
        }
        if (iB == 3 || iB == 4 || iB == 5) {
            return "video/hevc";
        }
        if (iB == 6) {
            return "video/dolby-vision";
        }
        throw new UnsupportedOperationException("Unsupported dynamic range: " + b0Var + "\nNo supported default mime type available.");
    }

    @NonNull
    public static n1 b(@NonNull String str, int i11) {
        n1 n1Var;
        Map<Integer, n1> map = f63778a.get(str);
        if (map != null && (n1Var = map.get(Integer.valueOf(i11))) != null) {
            return n1Var;
        }
        y0.l("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i11)));
        return n1.f66976a;
    }

    @NonNull
    public static m1 c(@NonNull n nVar, @NonNull h3 h3Var, @NonNull e2 e2Var, @NonNull Size size, @NonNull b0 b0Var, @NonNull Range<Integer> range) {
        j1.c cVarD = nVar.d();
        return (m1) (cVarD != null ? new m(nVar.a(), h3Var, e2Var, size, cVarD, b0Var, range) : new l(nVar.a(), h3Var, e2Var, size, b0Var, range)).get();
    }

    @NonNull
    public static n d(@NonNull s sVar, @NonNull b0 b0Var, b1.i iVar) {
        j1.c next;
        u5.h.j(b0Var.e(), "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + b0Var + "]");
        String strH = s.h(sVar.c());
        if (iVar != null) {
            Set<Integer> setC = h1.b.c(b0Var);
            Set<Integer> setB = h1.b.b(b0Var);
            Iterator<j1.c> it = iVar.e().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (setC.contains(Integer.valueOf(next.g())) && setB.contains(Integer.valueOf(next.b()))) {
                        String strI = next.i();
                        if (Objects.equals(strH, strI)) {
                            y0.a("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + strH + "]");
                        } else if (sVar.c() == -1) {
                            y0.a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + strH + ", dynamic range: " + b0Var + "]");
                        }
                        strH = strI;
                    }
                } else {
                    next = null;
                }
            }
        } else {
            next = null;
        }
        if (next == null) {
            if (sVar.c() == -1) {
                strH = a(b0Var);
            }
            if (iVar == null) {
                y0.a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + strH + ", dynamic range: " + b0Var + "]");
            } else {
                y0.a("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + strH + ", dynamic range: " + b0Var + "]");
            }
        }
        n.a aVarC = n.c(strH);
        if (next != null) {
            aVarC.c(next);
        }
        return aVarC.b();
    }

    public static int e(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, @NonNull Range<Integer> range) {
        int iDoubleValue = (int) (((double) i11) * new Rational(i12, i13).doubleValue() * new Rational(i14, i15).doubleValue() * new Rational(i16, i17).doubleValue() * new Rational(i18, i19).doubleValue());
        String str = y0.f("VideoConfigUtil") ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18), Integer.valueOf(i19), Integer.valueOf(iDoubleValue)) : "";
        if (!e2.f126118b.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            int iIntValue = num.intValue();
            if (y0.f("VideoConfigUtil")) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, num);
            }
            iDoubleValue = iIntValue;
        }
        y0.a("VideoConfigUtil", str);
        return iDoubleValue;
    }

    @NonNull
    public static m1 f(@NonNull j1.c cVar) {
        return m1.c().h(cVar.i()).i(cVar.j()).j(new Size(cVar.k(), cVar.h())).e(cVar.f()).b(cVar.c()).g(f63779b).a();
    }
}
