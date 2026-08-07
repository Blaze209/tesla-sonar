package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f7619k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f7621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f7622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f7623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f7626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f7627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f7628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f7629j;

    static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            } catch (InvocationTargetException e13) {
                Log.e("IconCompat", "Unable to get icon resource", e13);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            } catch (InvocationTargetException e13) {
                Log.e("IconCompat", "Unable to get icon package", e13);
                return null;
            }
        }

        static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            } catch (InvocationTargetException e13) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e13);
                return -1;
            }
        }

        static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            } catch (InvocationTargetException e13) {
                Log.e("IconCompat", "Unable to get icon uri", e13);
                return null;
            }
        }

        static Icon e(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f7620a) {
                case -1:
                    return (Icon) iconCompat.f7621b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f7621b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.g(), iconCompat.f7624e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f7621b, iconCompat.f7624e, iconCompat.f7625f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f7621b);
                    break;
                case 5:
                    iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f7621b, false)) : b.a((Bitmap) iconCompat.f7621b);
                    break;
                case 6:
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.i());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.i());
                        }
                        InputStream inputStreamJ = iconCompat.j(context);
                        if (inputStreamJ == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.i());
                        }
                        if (i11 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(inputStreamJ), false));
                        } else {
                            iconCreateWithBitmap = b.a(BitmapFactory.decodeStream(inputStreamJ));
                        }
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f7626g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f7627h;
            if (mode != IconCompat.f7619k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    static class b {
        static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f7620a = -1;
        this.f7622c = null;
        this.f7623d = null;
        this.f7624e = 0;
        this.f7625f = 0;
        this.f7626g = null;
        this.f7627h = f7619k;
        this.f7628i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z11) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f11 = iMin;
        float f12 = 0.5f * f11;
        float f13 = 0.9166667f * f12;
        if (z11) {
            float f14 = 0.010416667f * f11;
            paint.setColor(0);
            paint.setShadowLayer(f14, BitmapDescriptorFactory.HUE_RED, f11 * 0.020833334f, 1023410176);
            canvas.drawCircle(f12, f12, f13, paint);
            paint.setShadowLayer(f14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 503316480);
            canvas.drawCircle(f12, f12, f13, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f12, f12, f13, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        u5.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f7621b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Context context, int i11) {
        u5.c.c(context);
        return d(context.getResources(), context.getPackageName(), i11);
    }

    public static IconCompat d(Resources resources, String str, int i11) {
        u5.c.c(str);
        if (i11 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f7624e = i11;
        if (resources != null) {
            try {
                iconCompat.f7621b = resources.getResourceName(i11);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f7621b = str;
        }
        iconCompat.f7629j = str;
        return iconCompat;
    }

    private static String p(int i11) {
        switch (i11) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap e() {
        int i11 = this.f7620a;
        if (i11 == -1) {
            Object obj = this.f7621b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i11 == 1) {
            return (Bitmap) this.f7621b;
        }
        if (i11 == 5) {
            return a((Bitmap) this.f7621b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int f() {
        int i11 = this.f7620a;
        if (i11 == -1) {
            return a.a(this.f7621b);
        }
        if (i11 == 2) {
            return this.f7624e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String g() {
        int i11 = this.f7620a;
        if (i11 == -1) {
            return a.b(this.f7621b);
        }
        if (i11 == 2) {
            String str = this.f7629j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f7621b).split(":", -1)[0] : this.f7629j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int h() {
        int i11 = this.f7620a;
        return i11 == -1 ? a.c(this.f7621b) : i11;
    }

    public Uri i() {
        int i11 = this.f7620a;
        if (i11 == -1) {
            return a.d(this.f7621b);
        }
        if (i11 == 4 || i11 == 6) {
            return Uri.parse((String) this.f7621b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream j(Context context) {
        Uri uriI = i();
        String scheme = uriI.getScheme();
        if ("content".equals(scheme) || Action.FILE_ATTRIBUTE.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriI);
            } catch (Exception e11) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriI, e11);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f7621b));
        } catch (FileNotFoundException e12) {
            Log.w("IconCompat", "Unable to load image from path: " + uriI, e12);
            return null;
        }
    }

    public void k() {
        this.f7627h = PorterDuff.Mode.valueOf(this.f7628i);
        switch (this.f7620a) {
            case -1:
                Parcelable parcelable = this.f7623d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f7621b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f7623d;
                if (parcelable2 != null) {
                    this.f7621b = parcelable2;
                    return;
                }
                byte[] bArr = this.f7622c;
                this.f7621b = bArr;
                this.f7620a = 3;
                this.f7624e = 0;
                this.f7625f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f7622c, Charset.forName("UTF-16"));
                this.f7621b = str;
                if (this.f7620a == 2 && this.f7629j == null) {
                    this.f7629j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f7621b = this.f7622c;
                return;
        }
    }

    public void l(boolean z11) {
        this.f7628i = this.f7627h.name();
        switch (this.f7620a) {
            case -1:
                if (z11) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f7623d = (Parcelable) this.f7621b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z11) {
                    this.f7623d = (Parcelable) this.f7621b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f7621b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f7622c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f7622c = ((String) this.f7621b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f7622c = (byte[]) this.f7621b;
                return;
            case 4:
            case 6:
                this.f7622c = this.f7621b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Bundle m() {
        Bundle bundle = new Bundle();
        switch (this.f7620a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f7621b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f7621b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f7621b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f7621b);
                break;
        }
        bundle.putInt("type", this.f7620a);
        bundle.putInt("int1", this.f7624e);
        bundle.putInt("int2", this.f7625f);
        bundle.putString("string1", this.f7629j);
        ColorStateList colorStateList = this.f7626g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f7627h;
        if (mode != f7619k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon n() {
        return o(null);
    }

    public Icon o(Context context) {
        return a.e(this, context);
    }

    public String toString() {
        if (this.f7620a == -1) {
            return String.valueOf(this.f7621b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(p(this.f7620a));
        switch (this.f7620a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f7621b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f7621b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f7629j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(f())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f7624e);
                if (this.f7625f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f7625f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f7621b);
                break;
        }
        if (this.f7626g != null) {
            sb2.append(" tint=");
            sb2.append(this.f7626g);
        }
        if (this.f7627h != f7619k) {
            sb2.append(" mode=");
            sb2.append(this.f7627h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    IconCompat(int i11) {
        this.f7622c = null;
        this.f7623d = null;
        this.f7624e = 0;
        this.f7625f = 0;
        this.f7626g = null;
        this.f7627h = f7619k;
        this.f7628i = null;
        this.f7620a = i11;
    }
}
