package z3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u0011\u0010\n\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u0011\u0010\u000b\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lz3/v;", "Lj3/g;", "f", "(Lz3/v;)J", "g", "Lj3/i;", "b", "(Lz3/v;)Lj3/i;", "c", "e", "a", DateTokenConverter.CONVERTER_KEY, "(Lz3/v;)Lz3/v;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w {
    public static final j3.i a(v vVar) {
        j3.i iVarA0;
        v vVarM = vVar.M();
        return (vVarM == null || (iVarA0 = v.A0(vVarM, vVar, false, 2, null)) == null) ? new j3.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.r.g(vVar.e()), w4.r.f(vVar.e())) : iVarA0;
    }

    public static final j3.i b(v vVar) {
        return v.A0(d(vVar), vVar, false, 2, null);
    }

    public static final j3.i c(v vVar) {
        v vVarD = d(vVar);
        float fG = w4.r.g(vVarD.e());
        float f11 = w4.r.f(vVarD.e());
        j3.i iVarB = b(vVar);
        float left = iVarB.getLeft();
        float f12 = BitmapDescriptorFactory.HUE_RED;
        if (left < BitmapDescriptorFactory.HUE_RED) {
            left = 0.0f;
        }
        if (left > fG) {
            left = fG;
        }
        float top = iVarB.getTop();
        if (top < BitmapDescriptorFactory.HUE_RED) {
            top = 0.0f;
        }
        if (top > f11) {
            top = f11;
        }
        float right = iVarB.getRight();
        if (right < BitmapDescriptorFactory.HUE_RED) {
            right = 0.0f;
        }
        if (right <= fG) {
            fG = right;
        }
        float bottom = iVarB.getBottom();
        if (bottom >= BitmapDescriptorFactory.HUE_RED) {
            f12 = bottom;
        }
        if (f12 <= f11) {
            f11 = f12;
        }
        if (left == fG || top == f11) {
            return j3.i.INSTANCE.a();
        }
        long jK = vVarD.K(j3.h.a(left, top));
        long jK2 = vVarD.K(j3.h.a(fG, top));
        long jK3 = vVarD.K(j3.h.a(fG, f11));
        long jK4 = vVarD.K(j3.h.a(left, f11));
        float fM = j3.g.m(jK);
        float fM2 = j3.g.m(jK2);
        float fM3 = j3.g.m(jK4);
        float fM4 = j3.g.m(jK3);
        float fMin = Math.min(fM, Math.min(fM2, Math.min(fM3, fM4)));
        float fMax = Math.max(fM, Math.max(fM2, Math.max(fM3, fM4)));
        float fN = j3.g.n(jK);
        float fN2 = j3.g.n(jK2);
        float fN3 = j3.g.n(jK4);
        float fN4 = j3.g.n(jK3);
        return new j3.i(fMin, Math.min(fN, Math.min(fN2, Math.min(fN3, fN4))), fMax, Math.max(fN, Math.max(fN2, Math.max(fN3, fN4))));
    }

    public static final v d(v vVar) {
        v vVar2;
        v vVarM = vVar.M();
        while (true) {
            v vVar3 = vVarM;
            vVar2 = vVar;
            vVar = vVar3;
            if (vVar == null) {
                break;
            }
            vVarM = vVar.M();
        }
        b4.z0 z0Var = vVar2 instanceof b4.z0 ? (b4.z0) vVar2 : null;
        if (z0Var == null) {
            return vVar2;
        }
        b4.z0 wrappedBy = z0Var.getWrappedBy();
        while (true) {
            b4.z0 z0Var2 = wrappedBy;
            b4.z0 z0Var3 = z0Var;
            z0Var = z0Var2;
            if (z0Var == null) {
                return z0Var3;
            }
            wrappedBy = z0Var.getWrappedBy();
        }
    }

    public static final long e(v vVar) {
        v vVarM = vVar.M();
        return vVarM != null ? vVarM.D(vVar, j3.g.INSTANCE.c()) : j3.g.INSTANCE.c();
    }

    public static final long f(v vVar) {
        return vVar.P(j3.g.INSTANCE.c());
    }

    public static final long g(v vVar) {
        return vVar.K(j3.g.INSTANCE.c());
    }
}
