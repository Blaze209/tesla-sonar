package j5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class k {
    public static int a(Context context, int i11, int i12) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.resourceId != 0 ? i11 : i12;
    }

    public static boolean b(TypedArray typedArray, int i11, int i12, boolean z11) {
        return typedArray.getBoolean(i11, typedArray.getBoolean(i12, z11));
    }

    public static Drawable c(TypedArray typedArray, int i11, int i12) {
        Drawable drawable = typedArray.getDrawable(i11);
        return drawable == null ? typedArray.getDrawable(i12) : drawable;
    }

    public static int d(TypedArray typedArray, int i11, int i12, int i13) {
        return typedArray.getInt(i11, typedArray.getInt(i12, i13));
    }

    public static boolean e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i11, boolean z11) {
        return !r(xmlPullParser, str) ? z11 : typedArray.getBoolean(i11, z11);
    }

    public static int f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i11, int i12) {
        return !r(xmlPullParser, str) ? i12 : typedArray.getColor(i11, i12);
    }

    public static ColorStateList g(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i11) {
        if (!r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i11, typedValue);
        int i12 = typedValue.type;
        if (i12 != 2) {
            return (i12 < 28 || i12 > 31) ? c.d(typedArray.getResources(), typedArray.getResourceId(i11, 0), theme) : h(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i11 + ": " + typedValue);
    }

    private static ColorStateList h(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static d i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i11, int i12) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i11, typedValue);
            int i13 = typedValue.type;
            if (i13 >= 28 && i13 <= 31) {
                return d.b(typedValue.data);
            }
            d dVarG = d.g(typedArray.getResources(), typedArray.getResourceId(i11, 0), theme);
            if (dVarG != null) {
                return dVarG;
            }
        }
        return d.b(i12);
    }

    public static float j(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i11, float f11) {
        return !r(xmlPullParser, str) ? f11 : typedArray.getFloat(i11, f11);
    }

    public static int k(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i11, int i12) {
        return !r(xmlPullParser, str) ? i12 : typedArray.getInt(i11, i12);
    }

    public static int l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i11, int i12) {
        return !r(xmlPullParser, str) ? i12 : typedArray.getResourceId(i11, i12);
    }

    public static String m(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i11) {
        if (r(xmlPullParser, str)) {
            return typedArray.getString(i11);
        }
        return null;
    }

    public static int n(TypedArray typedArray, int i11, int i12, int i13) {
        return typedArray.getResourceId(i11, typedArray.getResourceId(i12, i13));
    }

    public static String o(TypedArray typedArray, int i11, int i12) {
        String string = typedArray.getString(i11);
        return string == null ? typedArray.getString(i12) : string;
    }

    public static CharSequence p(TypedArray typedArray, int i11, int i12) {
        CharSequence text = typedArray.getText(i11);
        return text == null ? typedArray.getText(i12) : text;
    }

    public static CharSequence[] q(TypedArray typedArray, int i11, int i12) {
        CharSequence[] textArray = typedArray.getTextArray(i11);
        return textArray == null ? typedArray.getTextArray(i12) : textArray;
    }

    public static boolean r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray s(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
