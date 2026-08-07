package j5;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
final class f {
    private static a a(a aVar, int i11, int i12, boolean z11, int i13) {
        if (aVar != null) {
            return aVar;
        }
        return z11 ? new a(i11, i13, i12) : new a(i11, i12);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayS = k.s(resources, theme, attributeSet, h5.g.B);
        float fJ = k.j(typedArrayS, xmlPullParser, "startX", h5.g.K, BitmapDescriptorFactory.HUE_RED);
        float fJ2 = k.j(typedArrayS, xmlPullParser, "startY", h5.g.L, BitmapDescriptorFactory.HUE_RED);
        float fJ3 = k.j(typedArrayS, xmlPullParser, "endX", h5.g.M, BitmapDescriptorFactory.HUE_RED);
        float fJ4 = k.j(typedArrayS, xmlPullParser, "endY", h5.g.N, BitmapDescriptorFactory.HUE_RED);
        float fJ5 = k.j(typedArrayS, xmlPullParser, "centerX", h5.g.F, BitmapDescriptorFactory.HUE_RED);
        float fJ6 = k.j(typedArrayS, xmlPullParser, "centerY", h5.g.G, BitmapDescriptorFactory.HUE_RED);
        int iK = k.k(typedArrayS, xmlPullParser, "type", h5.g.E, 0);
        int iF = k.f(typedArrayS, xmlPullParser, "startColor", h5.g.C, 0);
        boolean zR = k.r(xmlPullParser, "centerColor");
        int iF2 = k.f(typedArrayS, xmlPullParser, "centerColor", h5.g.J, 0);
        int iF3 = k.f(typedArrayS, xmlPullParser, "endColor", h5.g.D, 0);
        int iK2 = k.k(typedArrayS, xmlPullParser, "tileMode", h5.g.I, 0);
        float fJ7 = k.j(typedArrayS, xmlPullParser, "gradientRadius", h5.g.H, BitmapDescriptorFactory.HUE_RED);
        typedArrayS.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iF, iF3, zR, iF2);
        if (iK != 1) {
            return iK != 2 ? new LinearGradient(fJ, fJ2, fJ3, fJ4, aVarA.f82654a, aVarA.f82655b, d(iK2)) : new SweepGradient(fJ5, fJ6, aVarA.f82654a, aVarA.f82655b);
        }
        if (fJ7 > BitmapDescriptorFactory.HUE_RED) {
            return new RadialGradient(fJ5, fJ6, fJ7, aVarA.f82654a, aVarA.f82655b, d(iK2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    private static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayS = k.s(resources, theme, attributeSet, h5.g.O);
                boolean zHasValue = typedArrayS.hasValue(h5.g.P);
                boolean zHasValue2 = typedArrayS.hasValue(h5.g.Q);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayS.getColor(h5.g.P, 0);
                float f11 = typedArrayS.getFloat(h5.g.Q, BitmapDescriptorFactory.HUE_RED);
                typedArrayS.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f11));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode d(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f82654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f82655b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f82654a = new int[size];
            this.f82655b = new float[size];
            for (int i11 = 0; i11 < size; i11++) {
                this.f82654a[i11] = list.get(i11).intValue();
                this.f82655b[i11] = list2.get(i11).floatValue();
            }
        }

        a(int i11, int i12) {
            this.f82654a = new int[]{i11, i12};
            this.f82655b = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f};
        }

        a(int i11, int i12, int i13) {
            this.f82654a = new int[]{i11, i12, i13};
            this.f82655b = new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
        }
    }
}
