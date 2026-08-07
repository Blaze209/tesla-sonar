package hr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f73395c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f73396a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f73397b = -1;

    private boolean b(String str) {
        Matcher matcher = f73395c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i11 = Integer.parseInt((String) p0.j(matcher.group(1)), 16);
            int i12 = Integer.parseInt((String) p0.j(matcher.group(2)), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.f73396a = i11;
            this.f73397b = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f73396a == -1 || this.f73397b == -1) ? false : true;
    }

    public boolean c(ur.a aVar) {
        for (int i11 = 0; i11 < aVar.e(); i11++) {
            ur.a.b bVarD = aVar.d(i11);
            if (bVarD instanceof zr.e) {
                zr.e eVar = (zr.e) bVarD;
                if ("iTunSMPB".equals(eVar.f128516c) && b(eVar.f128517d)) {
                    return true;
                }
            } else if (bVarD instanceof zr.j) {
                zr.j jVar = (zr.j) bVarD;
                if ("com.apple.iTunes".equals(jVar.f128528b) && "iTunSMPB".equals(jVar.f128529c) && b(jVar.f128530d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i11) {
        int i12 = i11 >> 12;
        int i13 = i11 & 4095;
        if (i12 <= 0 && i13 <= 0) {
            return false;
        }
        this.f73396a = i12;
        this.f73397b = i13;
        return true;
    }
}
