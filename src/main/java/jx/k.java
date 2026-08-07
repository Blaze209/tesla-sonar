package jx;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class k extends hx.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f84387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o f84388e;

    public k(hx.c cVar, String str, o oVar, Map<String, String> map) {
        super(cVar, str, map);
        this.f84387d = str;
        this.f84388e = oVar;
    }

    public o g() {
        return this.f84388e;
    }

    public MarkerOptions h() {
        o oVar = this.f84388e;
        if (oVar == null) {
            return null;
        }
        return oVar.p();
    }

    public PolygonOptions i() {
        o oVar = this.f84388e;
        if (oVar == null) {
            return null;
        }
        return oVar.q();
    }

    public PolylineOptions j() {
        o oVar = this.f84388e;
        if (oVar == null) {
            return null;
        }
        return oVar.r();
    }

    public String k() {
        return super.b();
    }

    @NonNull
    public String toString() {
        return "Placemark{\n style id=" + this.f84387d + ",\n inline style=" + this.f84388e + "\n}\n";
    }
}
