package z0;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<x, b1.i> f126195a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeMap<Size, x> f126196b = new TreeMap<>(new h0.e());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b1.i f126197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b1.i f126198d;

    public o(@NonNull androidx.camera.core.impl.i1 i1Var) {
        for (x xVar : x.b()) {
            androidx.camera.core.impl.j1 j1VarD = d(xVar, i1Var);
            if (j1VarD != null) {
                c0.y0.a("CapabilitiesByQuality", "profiles = " + j1VarD);
                b1.i iVarG = g(j1VarD);
                if (iVarG == null) {
                    c0.y0.l("CapabilitiesByQuality", "EncoderProfiles of quality " + xVar + " has no video validated profiles.");
                } else {
                    androidx.camera.core.impl.j1.c cVarK = iVarG.k();
                    this.f126196b.put(new Size(cVarK.k(), cVarK.h()), xVar);
                    this.f126195a.put(xVar, iVarG);
                }
            }
        }
        if (this.f126195a.isEmpty()) {
            c0.y0.c("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.f126198d = null;
            this.f126197c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.f126195a.values());
            this.f126197c = (b1.i) arrayDeque.peekFirst();
            this.f126198d = (b1.i) arrayDeque.peekLast();
        }
    }

    private static void a(@NonNull x xVar) {
        u5.h.b(x.a(xVar), "Unknown quality: " + xVar);
    }

    private androidx.camera.core.impl.j1 d(@NonNull x xVar, @NonNull androidx.camera.core.impl.i1 i1Var) {
        u5.h.j(xVar instanceof x.b, "Currently only support ConstantQuality");
        return i1Var.a(((x.b) xVar).e());
    }

    private b1.i g(@NonNull androidx.camera.core.impl.j1 j1Var) {
        if (j1Var.e().isEmpty()) {
            return null;
        }
        return b1.i.i(j1Var);
    }

    public b1.i b(@NonNull Size size) {
        x xVarC = c(size);
        c0.y0.a("CapabilitiesByQuality", "Using supported quality of " + xVarC + " for size " + size);
        if (xVarC == x.f126363g) {
            return null;
        }
        b1.i iVarE = e(xVarC);
        if (iVarE != null) {
            return iVarE;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    @NonNull
    public x c(@NonNull Size size) {
        x xVar = (x) o0.c.a(size, this.f126196b);
        return xVar != null ? xVar : x.f126363g;
    }

    public b1.i e(@NonNull x xVar) {
        a(xVar);
        if (xVar == x.f126362f) {
            return this.f126197c;
        }
        return xVar == x.f126361e ? this.f126198d : this.f126195a.get(xVar);
    }

    @NonNull
    public List<x> f() {
        return new ArrayList(this.f126195a.keySet());
    }
}
