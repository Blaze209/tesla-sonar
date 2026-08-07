package q3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import j5.k;
import java.io.IOException;
import java.util.List;
import k3.SolidColor;
import k3.b1;
import k3.h1;
import k3.i1;
import k3.i4;
import k3.j4;
import k3.p1;
import k3.r1;
import k3.v3;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p3.d;
import p3.j;
import p3.o;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\u0016\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\b*\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a1\u0010\u001a\u001a\u00020\u0013*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a9\u0010\u001d\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#\u001a9\u0010$\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b$\u0010\u001e\u001a9\u0010%\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b%\u0010\u001e\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"", "id", "Lk3/i4;", "defValue", "b", "(II)I", "Lk3/j4;", "c", "Lorg/xmlpull/v1/XmlPullParser;", "", DateTokenConverter.CONVERTER_KEY, "(Lorg/xmlpull/v1/XmlPullParser;)Z", "Lq3/a;", "Landroid/content/res/Resources;", "res", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "Lp3/d$a;", "builder", "nestedGroups", "g", "(Lq3/a;Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lp3/d$a;I)I", "j", "(Lorg/xmlpull/v1/XmlPullParser;)Lorg/xmlpull/v1/XmlPullParser;", "a", "(Lq3/a;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Lp3/d$a;", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lq3/a;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Lp3/d$a;)V", "Lj5/d;", "complexColor", "Lk3/h1;", "e", "(Lj5/d;)Lk3/h1;", "f", "h", "I", "FILL_TYPE_WINDING", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f104730a = 0;

    public static final d.a a(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) throws XmlPullParserException {
        long j11;
        int iZ;
        ColorStateList colorStateListE;
        b bVar = b.f104704a;
        TypedArray typedArrayK = androidVectorParser.k(resources, theme, attributeSet, bVar.F());
        boolean zD = androidVectorParser.d(typedArrayK, "autoMirrored", bVar.a(), false);
        float fG = androidVectorParser.g(typedArrayK, "viewportWidth", bVar.H(), BitmapDescriptorFactory.HUE_RED);
        float fG2 = androidVectorParser.g(typedArrayK, "viewportHeight", bVar.G(), BitmapDescriptorFactory.HUE_RED);
        if (fG <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException(typedArrayK.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (fG2 <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException(typedArrayK.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float fA = androidVectorParser.a(typedArrayK, bVar.I(), BitmapDescriptorFactory.HUE_RED);
        float fA2 = androidVectorParser.a(typedArrayK, bVar.n(), BitmapDescriptorFactory.HUE_RED);
        if (typedArrayK.hasValue(bVar.D())) {
            TypedValue typedValue = new TypedValue();
            typedArrayK.getValue(bVar.D(), typedValue);
            j11 = (typedValue.type == 2 || (colorStateListE = androidVectorParser.e(typedArrayK, theme, "tint", bVar.D())) == null) ? p1.INSTANCE.j() : r1.b(colorStateListE.getDefaultColor());
        } else {
            j11 = p1.INSTANCE.j();
        }
        long j12 = j11;
        int iC = androidVectorParser.c(typedArrayK, bVar.E(), -1);
        if (iC == -1) {
            iZ = b1.INSTANCE.z();
        } else if (iC == 3) {
            iZ = b1.INSTANCE.B();
        } else if (iC == 5) {
            iZ = b1.INSTANCE.z();
        } else if (iC != 9) {
            switch (iC) {
                case 14:
                    iZ = b1.INSTANCE.q();
                    break;
                case 15:
                    iZ = b1.INSTANCE.v();
                    break;
                case 16:
                    iZ = b1.INSTANCE.t();
                    break;
                default:
                    iZ = b1.INSTANCE.z();
                    break;
            }
        } else {
            iZ = b1.INSTANCE.y();
        }
        int i11 = iZ;
        float fG3 = h.g(fA / resources.getDisplayMetrics().density);
        float fG4 = h.g(fA2 / resources.getDisplayMetrics().density);
        typedArrayK.recycle();
        return new d.a(null, fG3, fG4, fG, fG2, j12, i11, zD, 1, null);
    }

    private static final int b(int i11, int i12) {
        if (i11 == 0) {
            return i4.INSTANCE.a();
        }
        if (i11 != 1) {
            return i11 != 2 ? i12 : i4.INSTANCE.c();
        }
        return i4.INSTANCE.b();
    }

    private static final int c(int i11, int i12) {
        if (i11 == 0) {
            return j4.INSTANCE.b();
        }
        if (i11 != 1) {
            return i11 != 2 ? i12 : j4.INSTANCE.a();
        }
        return j4.INSTANCE.c();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3);
    }

    private static final h1 e(j5.d dVar) {
        if (!dVar.l()) {
            return null;
        }
        Shader shaderF = dVar.f();
        return shaderF != null ? i1.a(shaderF) : new SolidColor(r1.b(dVar.e()), null);
    }

    public static final void f(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, d.a aVar) {
        b bVar = b.f104704a;
        TypedArray typedArrayK = androidVectorParser.k(resources, theme, attributeSet, bVar.b());
        String strI = androidVectorParser.i(typedArrayK, bVar.c());
        if (strI == null) {
            strI = "";
        }
        String str = strI;
        String strI2 = androidVectorParser.i(typedArrayK, bVar.d());
        List listD = strI2 == null ? o.d() : j.b(androidVectorParser.pathParser, strI2, null, 2, null);
        typedArrayK.recycle();
        d.a.b(aVar, str, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, listD, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
    }

    public static final int g(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, d.a aVar, int i11) throws XmlPullParserException {
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !s.f(Kind.GROUP, androidVectorParser.getXmlParser().getName())) {
                return i11;
            }
            int i12 = i11 + 1;
            for (int i13 = 0; i13 < i12; i13++) {
                aVar.g();
            }
            return 0;
        }
        String name = androidVectorParser.getXmlParser().getName();
        if (name == null) {
            return i11;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals("clip-path")) {
                return i11;
            }
            f(androidVectorParser, resources, theme, attributeSet, aVar);
            return i11 + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals("path")) {
                return i11;
            }
            i(androidVectorParser, resources, theme, attributeSet, aVar);
            return i11;
        }
        if (iHashCode != 98629247 || !name.equals(Kind.GROUP)) {
            return i11;
        }
        h(androidVectorParser, resources, theme, attributeSet, aVar);
        return i11;
    }

    public static final void h(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, d.a aVar) {
        b bVar = b.f104704a;
        TypedArray typedArrayK = androidVectorParser.k(resources, theme, attributeSet, bVar.e());
        float fG = androidVectorParser.g(typedArrayK, "rotation", bVar.i(), BitmapDescriptorFactory.HUE_RED);
        float fB = androidVectorParser.b(typedArrayK, bVar.g(), BitmapDescriptorFactory.HUE_RED);
        float fB2 = androidVectorParser.b(typedArrayK, bVar.h(), BitmapDescriptorFactory.HUE_RED);
        float fG2 = androidVectorParser.g(typedArrayK, "scaleX", bVar.j(), 1.0f);
        float fG3 = androidVectorParser.g(typedArrayK, "scaleY", bVar.k(), 1.0f);
        float fG4 = androidVectorParser.g(typedArrayK, "translateX", bVar.l(), BitmapDescriptorFactory.HUE_RED);
        float fG5 = androidVectorParser.g(typedArrayK, "translateY", bVar.m(), BitmapDescriptorFactory.HUE_RED);
        String strI = androidVectorParser.i(typedArrayK, bVar.f());
        if (strI == null) {
            strI = "";
        }
        typedArrayK.recycle();
        aVar.a(strI, fG, fB, fB2, fG2, fG3, fG4, fG5, o.d());
    }

    public static final void i(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, d.a aVar) {
        b bVar = b.f104704a;
        TypedArray typedArrayK = androidVectorParser.k(resources, theme, attributeSet, bVar.o());
        if (!k.r(androidVectorParser.getXmlParser(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String strI = androidVectorParser.i(typedArrayK, bVar.r());
        if (strI == null) {
            strI = "";
        }
        String str = strI;
        String strI2 = androidVectorParser.i(typedArrayK, bVar.s());
        List<? extends p3.h> listD = strI2 == null ? o.d() : j.b(androidVectorParser.pathParser, strI2, null, 2, null);
        j5.d dVarF = androidVectorParser.f(typedArrayK, theme, "fillColor", bVar.q(), 0);
        float fG = androidVectorParser.g(typedArrayK, "fillAlpha", bVar.p(), 1.0f);
        int iB = b(androidVectorParser.h(typedArrayK, "strokeLineCap", bVar.v(), -1), i4.INSTANCE.a());
        int iC = c(androidVectorParser.h(typedArrayK, "strokeLineJoin", bVar.w(), -1), j4.INSTANCE.a());
        float fG2 = androidVectorParser.g(typedArrayK, "strokeMiterLimit", bVar.x(), 1.0f);
        j5.d dVarF2 = androidVectorParser.f(typedArrayK, theme, "strokeColor", bVar.u(), 0);
        float fG3 = androidVectorParser.g(typedArrayK, "strokeAlpha", bVar.t(), 1.0f);
        float fG4 = androidVectorParser.g(typedArrayK, "strokeWidth", bVar.y(), 1.0f);
        float fG5 = androidVectorParser.g(typedArrayK, "trimPathEnd", bVar.z(), 1.0f);
        float fG6 = androidVectorParser.g(typedArrayK, "trimPathOffset", bVar.B(), BitmapDescriptorFactory.HUE_RED);
        float fG7 = androidVectorParser.g(typedArrayK, "trimPathStart", bVar.C(), BitmapDescriptorFactory.HUE_RED);
        int iH = androidVectorParser.h(typedArrayK, "fillType", bVar.A(), f104730a);
        typedArrayK.recycle();
        aVar.c(listD, iH == 0 ? v3.INSTANCE.b() : v3.INSTANCE.a(), str, e(dVarF), fG, e(dVarF2), fG3, fG4, iB, iC, fG2, fG7, fG5, fG6);
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
