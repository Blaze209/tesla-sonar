package v;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j2 implements androidx.camera.core.impl.i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f117055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f117056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f117057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<Integer, androidx.camera.core.impl.j1> f117058f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.camera.core.impl.r2 f117059g;

    static class a {
        static EncoderProfiles a(String str, int i11) {
            return CamcorderProfile.getAll(str, i11);
        }
    }

    public j2(@NonNull String str, @NonNull androidx.camera.core.impl.r2 r2Var) {
        boolean z11;
        int i11;
        this.f117056d = str;
        try {
            i11 = Integer.parseInt(str);
            z11 = true;
        } catch (NumberFormatException unused) {
            c0.y0.l("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z11 = false;
            i11 = -1;
        }
        this.f117055c = z11;
        this.f117057e = i11;
        this.f117059g = r2Var;
    }

    private androidx.camera.core.impl.j1 c(int i11) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.f117057e, i11);
        } catch (RuntimeException e11) {
            c0.y0.m("Camera2EncoderProfilesProvider", "Unable to get CamcorderProfile by quality: " + i11, e11);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return g0.a.a(camcorderProfile);
        }
        return null;
    }

    private androidx.camera.core.impl.j1 d() {
        Iterator<Integer> it = androidx.camera.core.impl.i1.f3193b.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.j1 j1VarA = a(it.next().intValue());
            if (j1VarA != null) {
                return j1VarA;
            }
        }
        return null;
    }

    private androidx.camera.core.impl.j1 e() {
        for (int size = androidx.camera.core.impl.i1.f3193b.size() - 1; size >= 0; size--) {
            androidx.camera.core.impl.j1 j1VarA = a(size);
            if (j1VarA != null) {
                return j1VarA;
            }
        }
        return null;
    }

    private androidx.camera.core.impl.j1 f(int i11) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles encoderProfilesA = a.a(this.f117056d, i11);
            if (encoderProfilesA == null) {
                return null;
            }
            if (androidx.camera.camera2.internal.compat.quirk.b.b(InvalidVideoProfilesQuirk.class) != null) {
                c0.y0.a("Camera2EncoderProfilesProvider", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return g0.a.b(encoderProfilesA);
                } catch (NullPointerException e11) {
                    c0.y0.m("Camera2EncoderProfilesProvider", "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e11);
                }
            }
        }
        return c(i11);
    }

    private boolean g(@NonNull androidx.camera.core.impl.j1 j1Var) {
        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.f117059g.b(CamcorderProfileResolutionQuirk.class);
        if (camcorderProfileResolutionQuirk == null) {
            return true;
        }
        List<androidx.camera.core.impl.j1.c> listE = j1Var.e();
        if (listE.isEmpty()) {
            return true;
        }
        androidx.camera.core.impl.j1.c cVar = listE.get(0);
        return camcorderProfileResolutionQuirk.g().contains(new Size(cVar.k(), cVar.h()));
    }

    @Override // androidx.camera.core.impl.i1
    public androidx.camera.core.impl.j1 a(int i11) {
        androidx.camera.core.impl.j1 j1VarE = null;
        if (!this.f117055c || !CamcorderProfile.hasProfile(this.f117057e, i11)) {
            return null;
        }
        if (this.f117058f.containsKey(Integer.valueOf(i11))) {
            return this.f117058f.get(Integer.valueOf(i11));
        }
        androidx.camera.core.impl.j1 j1VarF = f(i11);
        if (j1VarF == null || g(j1VarF)) {
            j1VarE = j1VarF;
        } else if (i11 == 1) {
            j1VarE = d();
        } else if (i11 == 0) {
            j1VarE = e();
        }
        this.f117058f.put(Integer.valueOf(i11), j1VarE);
        return j1VarE;
    }

    @Override // androidx.camera.core.impl.i1
    public boolean b(int i11) {
        return this.f117055c && a(i11) != null;
    }
}
