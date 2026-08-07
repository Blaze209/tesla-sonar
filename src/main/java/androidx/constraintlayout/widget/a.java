package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f6944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EnumC0147a f6945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f6947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f6948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f6949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6950h;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    public enum EnumC0147a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String str, EnumC0147a enumC0147a, Object obj, boolean z11) {
        this.f6944b = str;
        this.f6945c = enumC0147a;
        this.f6943a = z11;
        k(obj);
    }

    public static HashMap<String, a> b(HashMap<String, a> map, View view) {
        HashMap<String, a> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e11) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e11);
            } catch (NoSuchMethodException e12) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e12);
            } catch (InvocationTargetException e13) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e13);
            }
        }
        return map2;
    }

    public static void i(Context context, XmlPullParser xmlPullParser, HashMap<String, a> map) {
        EnumC0147a enumC0147a;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.H4);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        EnumC0147a enumC0147a2 = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == i.I4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == i.S4) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z11 = true;
            } else if (index == i.J4) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0147a2 = EnumC0147a.BOOLEAN_TYPE;
            } else {
                if (index == i.L4) {
                    enumC0147a = EnumC0147a.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == i.K4) {
                    enumC0147a = EnumC0147a.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == i.P4) {
                    enumC0147a = EnumC0147a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED), context.getResources().getDisplayMetrics()));
                } else if (index == i.M4) {
                    enumC0147a = EnumC0147a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == i.N4) {
                    enumC0147a = EnumC0147a.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == i.O4) {
                    enumC0147a = EnumC0147a.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == i.R4) {
                    enumC0147a = EnumC0147a.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == i.Q4) {
                    enumC0147a = EnumC0147a.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                enumC0147a2 = enumC0147a;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new a(string, enumC0147a2, objValueOf2, z11));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void j(View view, HashMap<String, a> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            String str2 = aVar.f6943a ? str : "set" + str;
            try {
                int iOrdinal = aVar.f6945c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(aVar.f6946d));
                        break;
                    case 1:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(aVar.f6947e));
                        break;
                    case 2:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(aVar.f6950h));
                        break;
                    case 3:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f6950h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f6948f);
                        break;
                    case 5:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f6949g));
                        break;
                    case 6:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(aVar.f6947e));
                        break;
                    case 7:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(aVar.f6946d));
                        break;
                }
            } catch (IllegalAccessException e11) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e11);
            } catch (NoSuchMethodException e12) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e12);
            } catch (InvocationTargetException e13) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e13);
            }
        }
    }

    public void a(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f6944b;
        if (this.f6943a) {
            str = str2;
        } else {
            str = "set" + str2;
        }
        try {
            int iOrdinal = this.f6945c.ordinal();
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            switch (iOrdinal) {
                case 0:
                case 7:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf(this.f6946d));
                    break;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(this.f6947e));
                    break;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf(this.f6950h));
                    break;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f6950h);
                    method.invoke(view, colorDrawable);
                    break;
                case 4:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.f6948f);
                    break;
                case 5:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f6949g));
                    break;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(this.f6947e));
                    break;
            }
        } catch (IllegalAccessException e11) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e11);
        } catch (NoSuchMethodException e12) {
            Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e12);
        } catch (InvocationTargetException e13) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e13);
        }
    }

    public String c() {
        return this.f6944b;
    }

    public EnumC0147a d() {
        return this.f6945c;
    }

    public float e() {
        switch (this.f6945c) {
            case INT_TYPE:
                return this.f6946d;
            case FLOAT_TYPE:
            case DIMENSION_TYPE:
                return this.f6947e;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case BOOLEAN_TYPE:
                if (this.f6949g) {
                    return 1.0f;
                }
                return BitmapDescriptorFactory.HUE_RED;
            default:
                return Float.NaN;
        }
    }

    public void f(float[] fArr) {
        switch (this.f6945c) {
            case INT_TYPE:
                fArr[0] = this.f6946d;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.f6947e;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i11 = this.f6950h;
                int i12 = (i11 >> 24) & 255;
                float fPow = (float) Math.pow(((i11 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i11 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i11 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i12 / 255.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                fArr[0] = this.f6949g ? 1.0f : BitmapDescriptorFactory.HUE_RED;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.f6947e;
                return;
            default:
                return;
        }
    }

    public boolean g() {
        int iOrdinal = this.f6945c.ordinal();
        return (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7) ? false : true;
    }

    public int h() {
        int iOrdinal = this.f6945c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public void k(Object obj) {
        switch (this.f6945c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f6946d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f6947e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f6950h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f6948f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f6949g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f6947e = ((Float) obj).floatValue();
                break;
        }
    }

    public a(a aVar, Object obj) {
        this.f6943a = false;
        this.f6944b = aVar.f6944b;
        this.f6945c = aVar.f6945c;
        k(obj);
    }
}
