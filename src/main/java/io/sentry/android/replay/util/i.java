package io.sentry.android.replay.util;

import android.graphics.Rect;
import b4.g0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.util.List;
import k3.p1;
import k3.s1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import w4.r;
import z3.ModifierInfo;
import z3.v;
import z3.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\r\u001a\u00020\f*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb4/g0;", "Landroidx/compose/ui/graphics/painter/b;", "b", "(Lb4/g0;)Landroidx/compose/ui/graphics/painter/b;", "", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/graphics/painter/b;)Z", "Lio/sentry/android/replay/util/o;", "c", "(Lb4/g0;)Lio/sentry/android/replay/util/o;", "Lz3/v;", "rootCoordinates", "Landroid/graphics/Rect;", "a", "(Lz3/v;Lz3/v;)Landroid/graphics/Rect;", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class i {
    public static final Rect a(v vVar, v vVar2) {
        s.k(vVar, "<this>");
        if (vVar2 == null) {
            vVar2 = w.d(vVar);
        }
        float fG = r.g(vVar2.e());
        float f11 = r.f(vVar2.e());
        j3.i iVarA0 = v.A0(vVar2, vVar, false, 2, null);
        float left = iVarA0.getLeft();
        float f12 = BitmapDescriptorFactory.HUE_RED;
        if (left < BitmapDescriptorFactory.HUE_RED) {
            left = 0.0f;
        }
        if (left > fG) {
            left = fG;
        }
        float top = iVarA0.getTop();
        if (top < BitmapDescriptorFactory.HUE_RED) {
            top = 0.0f;
        }
        if (top > f11) {
            top = f11;
        }
        float right = iVarA0.getRight();
        if (right < BitmapDescriptorFactory.HUE_RED) {
            right = 0.0f;
        }
        if (right <= fG) {
            fG = right;
        }
        float bottom = iVarA0.getBottom();
        if (bottom >= BitmapDescriptorFactory.HUE_RED) {
            f12 = bottom;
        }
        if (f12 <= f11) {
            f11 = f12;
        }
        if (left == fG || top == f11) {
            return new Rect();
        }
        long jK = vVar2.K(j3.h.a(left, top));
        long jK2 = vVar2.K(j3.h.a(fG, top));
        long jK3 = vVar2.K(j3.h.a(fG, f11));
        long jK4 = vVar2.K(j3.h.a(left, f11));
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
        return new Rect((int) fMin, (int) Math.min(fN, Math.min(fN2, Math.min(fN3, fN4))), (int) fMax, (int) Math.max(fN, Math.max(fN2, Math.max(fN3, fN4))));
    }

    public static final androidx.compose.ui.graphics.painter.b b(g0 g0Var) {
        s.k(g0Var, "<this>");
        List<ModifierInfo> listH0 = g0Var.h0();
        int size = listH0.size();
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.d modifier = listH0.get(i11).getModifier();
            String name = modifier.getClass().getName();
            s.j(name, "getName(...)");
            if (t.h0(name, "Painter", false, 2, null)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField(PlaceTypes.PAINTER);
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    if (obj instanceof androidx.compose.ui.graphics.painter.b) {
                        return (androidx.compose.ui.graphics.painter.b) obj;
                    }
                } catch (Throwable unused) {
                }
                return null;
            }
        }
        return null;
    }

    public static final TextAttributes c(g0 g0Var) {
        s.k(g0Var, "<this>");
        List<ModifierInfo> listH0 = g0Var.h0();
        int size = listH0.size();
        p1 p1VarL = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.d modifier = listH0.get(i11).getModifier();
            String name = modifier.getClass().getName();
            s.h(name);
            if (t.h0(name, "Text", false, 2, null)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("color");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    s1 s1Var = obj instanceof s1 ? (s1) obj : null;
                    p1VarL = s1Var != null ? p1.l(s1Var.a()) : null;
                } catch (Throwable unused) {
                }
            } else if (t.h0(name, "Fill", false, 2, null)) {
                z11 = true;
            }
        }
        return new TextAttributes(p1VarL, z11, null);
    }

    public static final boolean d(androidx.compose.ui.graphics.painter.b bVar) {
        s.k(bVar, "<this>");
        String name = bVar.getClass().getName();
        s.h(name);
        return (t.h0(name, "Vector", false, 2, null) || t.h0(name, "Color", false, 2, null) || t.h0(name, "Brush", false, 2, null)) ? false : true;
    }
}
