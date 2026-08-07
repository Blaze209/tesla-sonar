package j5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f82638a = new ThreadLocal<>();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = f82638a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList d(Resources resources, int i11, Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i11), theme);
        } catch (Exception e11) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e11);
            return null;
        }
    }

    private static ColorStateList e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i11 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrA = new int[20];
        int i12 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i11 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayH = h(resources, theme, attributeSet, h5.g.f70818b);
                int resourceId = typedArrayH.getResourceId(h5.g.f70819c, -1);
                if (resourceId == -1 || f(resources, resourceId)) {
                    color = typedArrayH.getColor(h5.g.f70819c, -65281);
                } else {
                    try {
                        color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayH.getColor(h5.g.f70819c, -65281);
                    }
                }
                float f11 = 1.0f;
                if (typedArrayH.hasValue(h5.g.f70820d)) {
                    f11 = typedArrayH.getFloat(h5.g.f70820d, 1.0f);
                } else if (typedArrayH.hasValue(h5.g.f70822f)) {
                    f11 = typedArrayH.getFloat(h5.g.f70822f, 1.0f);
                }
                float f12 = (Build.VERSION.SDK_INT < 31 || !typedArrayH.hasValue(h5.g.f70821e)) ? typedArrayH.getFloat(h5.g.f70823g, -1.0f) : typedArrayH.getFloat(h5.g.f70821e, -1.0f);
                typedArrayH.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i13 = 0;
                for (int i14 = 0; i14 < attributeCount; i14++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i14);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != h5.a.f70774a && attributeNameResource != h5.a.f70775b) {
                        int i15 = i13 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i14, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i13] = attributeNameResource;
                        i13 = i15;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i13);
                iArrA = g.a(iArrA, i12, g(color, f11, f12));
                iArr = (int[][]) g.b(iArr, i12, iArrTrimStateSet);
                i12++;
            }
            i11 = 1;
        }
        int[] iArr3 = new int[i12];
        int[][] iArr4 = new int[i12][];
        System.arraycopy(iArrA, 0, iArr3, 0, i12);
        System.arraycopy(iArr, 0, iArr4, 0, i12);
        return new ColorStateList(iArr4, iArr3);
    }

    private static boolean f(Resources resources, int i11) {
        TypedValue typedValueC = c();
        resources.getValue(i11, typedValueC, true);
        int i12 = typedValueC.type;
        return i12 >= 28 && i12 <= 31;
    }

    private static int g(int i11, float f11, float f12) {
        boolean z11 = f12 >= BitmapDescriptorFactory.HUE_RED && f12 <= 100.0f;
        if (f11 == 1.0f && !z11) {
            return i11;
        }
        int iB = o5.a.b((int) ((Color.alpha(i11) * f11) + 0.5f), 0, 255);
        if (z11) {
            a aVarC = a.c(i11);
            i11 = a.m(aVarC.j(), aVarC.i(), f12);
        }
        return (i11 & 16777215) | (iB << 24);
    }

    private static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
