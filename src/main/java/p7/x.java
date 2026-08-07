package p7;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f101670c = s7.q0.N0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f101671d = s7.q0.N0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101673b;

    public x(String str, String str2) {
        this.f101672a = s7.q0.e1(str);
        this.f101673b = str2;
    }

    public static x a(Bundle bundle) {
        return new x(bundle.getString(f101670c), (String) s7.a.f(bundle.getString(f101671d)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f101672a;
        if (str != null) {
            bundle.putString(f101670c, str);
        }
        bundle.putString(f101671d, this.f101673b);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            x xVar = (x) obj;
            if (Objects.equals(this.f101672a, xVar.f101672a) && Objects.equals(this.f101673b, xVar.f101673b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f101673b.hashCode() * 31;
        String str = this.f101672a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
