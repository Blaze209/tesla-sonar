package f1;

import android.util.Range;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.h3;
import androidx.camera.core.impl.j1;
import c0.y0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import z0.s;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static /* synthetic */ int a(int i11, Integer num, Integer num2) {
        int iAbs = Math.abs(num.intValue() - i11) - Math.abs(num2.intValue() - i11);
        return (int) (iAbs == 0 ? Math.signum(num.intValue() - num2.intValue()) : Math.signum(iAbs));
    }

    @NonNull
    public static g1.a b(@NonNull e eVar, @NonNull h3 h3Var, @NonNull c1.a aVar, @NonNull z0.a aVar2) {
        j1.a aVarD = eVar.d();
        return (g1.a) (aVarD != null ? new c(eVar.a(), eVar.b(), h3Var, aVar2, aVar, aVarD) : new d(eVar.a(), eVar.b(), h3Var, aVar2, aVar)).get();
    }

    @NonNull
    public static e c(@NonNull s sVar, b1.i iVar) {
        j1.a aVarJ;
        String strE = s.e(sVar.c());
        int iF = s.f(sVar.c());
        if (iVar == null || iVar.j() == null) {
            aVarJ = null;
        } else {
            aVarJ = iVar.j();
            String strE2 = aVarJ.e();
            int iF2 = aVarJ.f();
            if (Objects.equals(strE2, "audio/none")) {
                y0.a("AudioConfigUtil", "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + strE + "(profile: " + iF + ")]");
            } else if (sVar.c() == -1) {
                y0.a("AudioConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: " + strE2 + "(profile: " + iF2 + ")]");
                strE = strE2;
                iF = iF2;
            } else if (Objects.equals(strE, strE2) && iF == iF2) {
                y0.a("AudioConfigUtil", "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: " + strE2 + "(profile: " + iF + ")]");
                strE = strE2;
            } else {
                y0.a("AudioConfigUtil", "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: " + strE2 + "(profile: " + iF2 + "), chosen mime type: " + strE + "(profile: " + iF + ")]");
            }
            aVarJ = null;
        }
        e.a aVarA = e.c(strE).a(iF);
        if (aVarJ != null) {
            aVarA.c(aVarJ);
        }
        return aVarA.b();
    }

    @NonNull
    public static c1.a d(@NonNull e eVar, @NonNull z0.a aVar) {
        j1.a aVarD = eVar.d();
        return (c1.a) (aVarD != null ? new f(aVar, aVarD) : new g(aVar)).get();
    }

    static int e(@NonNull z0.a aVar) {
        int iE = aVar.e();
        if (iE == -1) {
            y0.a("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        y0.a("AudioConfigUtil", "Using provided AUDIO source: " + iE);
        return iE;
    }

    static int f(@NonNull z0.a aVar) {
        int iF = aVar.f();
        if (iF == -1) {
            y0.a("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        y0.a("AudioConfigUtil", "Using provided AUDIO source format: " + iF);
        return iF;
    }

    static int g(int i11, int i12, int i13, int i14, int i15, Range<Integer> range) {
        int iDoubleValue = (int) (((double) i11) * new Rational(i12, i13).doubleValue() * new Rational(i14, i15).doubleValue());
        String str = y0.f("AudioConfigUtil") ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(iDoubleValue)) : "";
        if (!z0.a.f126064a.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            iDoubleValue = num.intValue();
            if (y0.f("AudioConfigUtil")) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, num);
            }
        }
        y0.a("AudioConfigUtil", str);
        return iDoubleValue;
    }

    static int h(@NonNull Range<Integer> range, int i11, int i12, final int i13) {
        ArrayList arrayList = null;
        int i14 = 0;
        int iIntValue = i13;
        while (true) {
            if (!range.contains(Integer.valueOf(iIntValue))) {
                y0.a("AudioConfigUtil", "Sample rate " + iIntValue + "Hz is not in target range " + range);
            } else {
                if (androidx.camera.video.internal.audio.b.o(iIntValue, i11, i12)) {
                    return iIntValue;
                }
                y0.a("AudioConfigUtil", "Sample rate " + iIntValue + "Hz is not supported by audio source with channel count " + i11 + " and source format " + i12);
            }
            if (arrayList == null) {
                y0.a("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i13 + "Hz");
                arrayList = new ArrayList(c1.a.f18516a);
                Collections.sort(arrayList, new Comparator() { // from class: f1.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return b.a(i13, (Integer) obj, (Integer) obj2);
                    }
                });
            }
            if (i14 >= arrayList.size()) {
                y0.a("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            iIntValue = ((Integer) arrayList.get(i14)).intValue();
            i14++;
        }
    }
}
