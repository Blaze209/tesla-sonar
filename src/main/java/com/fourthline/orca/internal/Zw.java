package com.fourthline.orca.internal;

import android.graphics.Matrix;
import android.util.Xml;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import kotlinx.coroutines.DebugKt;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
class Zw implements Yw {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final boolean f30137k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f30138l = Pattern.compile("/\\*.*?\\*/");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30143e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Vw f30139a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Vw.J f30140b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30141c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30142d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f30144f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f30145g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private StringBuilder f30146h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f30147i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private StringBuilder f30148j = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f30150b;

        static {
            int[] iArr = new int[g.values().length];
            f30150b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30150b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30150b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30150b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30150b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30150b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30150b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30150b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30150b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f30150b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f30150b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f30150b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f30150b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f30150b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f30150b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f30150b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f30150b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f30150b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f30150b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f30150b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f30150b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f30150b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f30150b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f30150b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f30150b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f30150b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f30150b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f30150b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f30150b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f30150b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f30150b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f30150b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f30150b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f30150b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f30150b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f30150b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f30150b[g.fr.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f30150b[g.offset.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f30150b[g.clipPathUnits.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f30150b[g.startOffset.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f30150b[g.patternUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f30150b[g.patternContentUnits.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f30150b[g.patternTransform.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f30150b[g.maskUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f30150b[g.maskContentUnits.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f30150b[g.style.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f30150b[g.CLASS.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f30150b[g.viewBox.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f30150b[g.type.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f30150b[g.media.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            int[] iArr2 = new int[h.values().length];
            f30149a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f30149a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f30149a[h.defs.ordinal()] = 3;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f30149a[h.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f30149a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f30149a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f30149a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f30149a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f30149a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f30149a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f30149a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f30149a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f30149a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f30149a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f30149a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f30149a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f30149a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f30149a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f30149a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f30149a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f30149a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f30149a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f30149a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f30149a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f30149a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f30149a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f30149a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f30149a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f30149a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f30149a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f30149a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused81) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f30151a;

        static {
            HashMap map = new HashMap(47);
            f30151a = map;
            map.put("aliceblue", -984833);
            map.put("antiquewhite", -332841);
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            map.put("azure", -983041);
            map.put("beige", -657956);
            map.put("bisque", -6972);
            map.put("black", -16777216);
            map.put("blanchedalmond", -5171);
            map.put("blue", -16776961);
            map.put("blueviolet", -7722014);
            map.put("brown", -5952982);
            map.put("burlywood", -2180985);
            map.put("cadetblue", -10510688);
            map.put("chartreuse", -8388864);
            map.put("chocolate", -2987746);
            map.put("coral", -32944);
            map.put("cornflowerblue", -10185235);
            map.put("cornsilk", -1828);
            map.put("crimson", -2354116);
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            map.put("darkcyan", -16741493);
            map.put("darkgoldenrod", -4684277);
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            map.put("darkmagenta", -7667573);
            map.put("darkolivegreen", -11179217);
            map.put("darkorange", -29696);
            map.put("darkorchid", -6737204);
            map.put("darkred", -7667712);
            map.put("darksalmon", -1468806);
            map.put("darkseagreen", -7357297);
            map.put("darkslateblue", -12042869);
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            map.put("deeppink", -60269);
            map.put("deepskyblue", -16728065);
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            map.put("floralwhite", -1296);
            map.put("forestgreen", -14513374);
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            map.put("ghostwhite", -460545);
            map.put("gold", -10496);
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            map.put("green", -16744448);
            map.put("greenyellow", -5374161);
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            map.put("hotpink", -38476);
            map.put("indianred", -3318692);
            map.put("indigo", -11861886);
            map.put("ivory", -16);
            map.put("khaki", -989556);
            map.put("lavender", -1644806);
            map.put("lavenderblush", -3851);
            map.put("lawngreen", -8586240);
            map.put("lemonchiffon", -1331);
            map.put("lightblue", -5383962);
            map.put("lightcoral", -1015680);
            map.put("lightcyan", -2031617);
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            map.put("lightpink", -18751);
            map.put("lightsalmon", -24454);
            map.put("lightseagreen", -14634326);
            map.put("lightskyblue", -7876870);
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            map.put("lime", -16711936);
            map.put("limegreen", -13447886);
            map.put("linen", -331546);
            map.put("magenta", -65281);
            map.put("maroon", -8388608);
            map.put("mediumaquamarine", -10039894);
            map.put("mediumblue", -16777011);
            map.put("mediumorchid", -4565549);
            map.put("mediumpurple", -7114533);
            map.put("mediumseagreen", -12799119);
            map.put("mediumslateblue", -8689426);
            map.put("mediumspringgreen", -16713062);
            map.put("mediumturquoise", -12004916);
            map.put("mediumvioletred", -3730043);
            map.put("midnightblue", -15132304);
            map.put("mintcream", -655366);
            map.put("mistyrose", -6943);
            map.put("moccasin", -6987);
            map.put("navajowhite", -8531);
            map.put("navy", -16777088);
            map.put("oldlace", -133658);
            map.put("olive", -8355840);
            map.put("olivedrab", -9728477);
            map.put("orange", -23296);
            map.put("orangered", -47872);
            map.put("orchid", -2461482);
            map.put("palegoldenrod", -1120086);
            map.put("palegreen", -6751336);
            map.put("paleturquoise", -5247250);
            map.put("palevioletred", -2396013);
            map.put("papayawhip", -4139);
            map.put("peachpuff", -9543);
            map.put("peru", -3308225);
            map.put("pink", -16181);
            map.put("plum", -2252579);
            map.put("powderblue", -5185306);
            map.put("purple", -8388480);
            map.put("rebeccapurple", -10079335);
            map.put("red", -65536);
            map.put("rosybrown", -4419697);
            map.put("royalblue", -12490271);
            map.put("saddlebrown", -7650029);
            map.put("salmon", -360334);
            map.put("sandybrown", -744352);
            map.put("seagreen", -13726889);
            map.put("seashell", -2578);
            map.put("sienna", -6270419);
            map.put("silver", -4144960);
            map.put("skyblue", -7876885);
            map.put("slateblue", -9807155);
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            map.put("steelblue", -12156236);
            map.put("tan", -2968436);
            map.put("teal", -16744320);
            map.put("thistle", -2572328);
            map.put("tomato", -40121);
            map.put("turquoise", -12525360);
            map.put("violet", -1146130);
            map.put("wheat", -663885);
            map.put("white", -1);
            map.put("whitesmoke", -657931);
            map.put("yellow", -256);
            map.put("yellowgreen", -6632142);
            map.put("transparent", 0);
        }

        static Integer a(String str) {
            return (Integer) f30151a.get(str);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f30152a;

        static {
            HashMap map = new HashMap(9);
            f30152a = map;
            Vw.d0 d0Var = Vw.d0.pt;
            map.put("xx-small", new Vw.C2994q(0.694f, d0Var));
            map.put("x-small", new Vw.C2994q(0.833f, d0Var));
            map.put("small", new Vw.C2994q(10.0f, d0Var));
            map.put("medium", new Vw.C2994q(12.0f, d0Var));
            map.put("large", new Vw.C2994q(14.4f, d0Var));
            map.put("x-large", new Vw.C2994q(17.3f, d0Var));
            map.put("xx-large", new Vw.C2994q(20.7f, d0Var));
            Vw.d0 d0Var2 = Vw.d0.percent;
            map.put("smaller", new Vw.C2994q(83.33f, d0Var2));
            map.put("larger", new Vw.C2994q(120.0f, d0Var2));
        }

        static Vw.C2994q a(String str) {
            return (Vw.C2994q) f30152a.get(str);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f30153a;

        static {
            HashMap map = new HashMap(9);
            f30153a = map;
            map.put("ultra-condensed", Float.valueOf(50.0f));
            map.put("extra-condensed", Float.valueOf(62.5f));
            map.put("condensed", Float.valueOf(75.0f));
            map.put("semi-condensed", Float.valueOf(87.5f));
            map.put("normal", Float.valueOf(100.0f));
            map.put("semi-expanded", Float.valueOf(112.5f));
            map.put("expanded", Float.valueOf(125.0f));
            map.put("extra-expanded", Float.valueOf(150.0f));
            map.put("ultra-expanded", Float.valueOf(200.0f));
        }

        static boolean a(String str) {
            return f30153a.containsKey(str);
        }

        static Float b(String str) {
            return (Float) f30153a.get(str);
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f30154a;

        static {
            HashMap map = new HashMap(4);
            f30154a = map;
            map.put("normal", Float.valueOf(400.0f));
            map.put("bold", Float.valueOf(700.0f));
            map.put("bolder", Float.valueOf(Float.MAX_VALUE));
            map.put("lighter", Float.valueOf(Float.MIN_VALUE));
        }

        static boolean a(String str) {
            return f30154a.containsKey(str);
        }

        static Float b(String str) {
            return (Float) f30154a.get(str);
        }
    }

    private class f extends DefaultHandler2 {
        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i11, int i12) {
            Zw.this.J(new String(cArr, i11, i12));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            Zw.this.a();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws Xw {
            Zw.this.a(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            Zw.this.a(str, Zw.this.b(new SA(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            Zw.this.b();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws Xw {
            Zw.this.a(str, str2, str3, attributes);
        }

        private f() {
        }
    }

    enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        fr,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_feature_settings,
        font_size,
        font_stretch,
        font_style,
        font_weight,
        font_kerning,
        font_variant,
        font_variant_ligatures,
        font_variant_position,
        font_variant_caps,
        font_variant_numeric,
        font_variant_east_asian,
        font_variation_settings,
        glyph_orientation_vertical,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        isolation,
        letter_spacing,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        mix_blend_mode,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        text_orientation,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        word_spacing,
        writing_mode,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;


        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        private static final Map f30176g1 = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    f30176g1.put(Action.CLASS_ATTRIBUTE, gVar);
                } else if (gVar != UNSUPPORTED) {
                    f30176g1.put(gVar.name().replace('_', CoreConstants.DASH_CHAR), gVar);
                }
            }
        }

        public static g a(String str) {
            g gVar = (g) f30176g1.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    private enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        private static final Map G = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    G.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    G.put(hVar.name(), hVar);
                }
            }
        }

        public static h a(String str) {
            h hVar = (h) G.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    private static class i implements Attributes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final XmlPullParser f30242a;

        public i(XmlPullParser xmlPullParser) {
            this.f30242a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f30242a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i11) {
            return this.f30242a.getAttributeName(i11);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i11) {
            String attributeName = this.f30242a.getAttributeName(i11);
            if (this.f30242a.getAttributePrefix(i11) == null) {
                return attributeName;
            }
            return this.f30242a.getAttributePrefix(i11) + CoreConstants.COLON_CHAR + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i11) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i11) {
            return this.f30242a.getAttributeNamespace(i11);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i11) {
            return this.f30242a.getAttributeValue(i11);
        }
    }

    Zw() {
    }

    private void A(Attributes attributes) throws Xw {
        a("<use>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.e0 e0Var = new Vw.e0();
        e0Var.f29261a = this.f30139a;
        e0Var.f29262b = this.f30140b;
        a((Vw.L) e0Var, attributes);
        b(e0Var, attributes);
        a((Vw.InterfaceC2992o) e0Var, attributes);
        a((Vw.G) e0Var, attributes);
        a(e0Var, attributes);
        this.f30140b.a(e0Var);
        this.f30140b = e0Var;
    }

    private void B(Attributes attributes) throws Xw {
        a("<view>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.R f0Var = new Vw.f0();
        f0Var.f29261a = this.f30139a;
        f0Var.f29262b = this.f30140b;
        a((Vw.L) f0Var, attributes);
        a((Vw.G) f0Var, attributes);
        a(f0Var, attributes);
        this.f30140b.a(f0Var);
        this.f30140b = f0Var;
    }

    private void C(Attributes attributes) throws Xw {
        a("<switch>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.S s11 = new Vw.S();
        s11.f29261a = this.f30139a;
        s11.f29262b = this.f30140b;
        a((Vw.L) s11, attributes);
        b(s11, attributes);
        a((Vw.InterfaceC2992o) s11, attributes);
        a((Vw.G) s11, attributes);
        this.f30140b.a(s11);
        this.f30140b = s11;
    }

    static DA.k D(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return DA.k.Middle;
            case "end":
                return DA.k.End;
            case "start":
                return DA.k.Start;
            default:
                return null;
        }
    }

    static DA.l E(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return DA.l.LineThrough;
            case "underline":
                return DA.l.Underline;
            case "none":
                return DA.l.None;
            case "blink":
                return DA.l.Blink;
            case "overline":
                return DA.l.Overline;
            default:
                return null;
        }
    }

    static DA.m F(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return DA.m.LTR;
        }
        if (str.equals("rtl")) {
            return DA.m.RTL;
        }
        return null;
    }

    private Matrix G(String str) throws Xw {
        Matrix matrix = new Matrix();
        SA sa2 = new SA(str);
        sa2.q();
        while (!sa2.c()) {
            String strH = sa2.h();
            if (strH == null) {
                throw new Xw("Bad transform function encountered in transform list: " + str);
            }
            switch (strH) {
                case "matrix":
                    sa2.q();
                    float fG = sa2.g();
                    sa2.p();
                    float fG2 = sa2.g();
                    sa2.p();
                    float fG3 = sa2.g();
                    sa2.p();
                    float fG4 = sa2.g();
                    sa2.p();
                    float fG5 = sa2.g();
                    sa2.p();
                    float fG6 = sa2.g();
                    sa2.q();
                    if (Float.isNaN(fG6) || !sa2.a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new Xw("Invalid transform list: " + str);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fG, fG3, fG5, fG2, fG4, fG6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    sa2.q();
                    float fG7 = sa2.g();
                    float fN = sa2.n();
                    float fN2 = sa2.n();
                    sa2.q();
                    if (Float.isNaN(fG7) || !sa2.a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new Xw("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fN)) {
                        matrix.preRotate(fG7);
                    } else {
                        if (Float.isNaN(fN2)) {
                            throw new Xw("Invalid transform list: " + str);
                        }
                        matrix.preRotate(fG7, fN, fN2);
                    }
                    break;
                    break;
                case "scale":
                    sa2.q();
                    float fG8 = sa2.g();
                    float fN3 = sa2.n();
                    sa2.q();
                    if (Float.isNaN(fG8) || !sa2.a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new Xw("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fN3)) {
                        matrix.preScale(fG8, fN3);
                    } else {
                        matrix.preScale(fG8, fG8);
                    }
                    break;
                    break;
                case "skewX":
                    sa2.q();
                    float fG9 = sa2.g();
                    sa2.q();
                    if (Float.isNaN(fG9) || !sa2.a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new Xw("Invalid transform list: " + str);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fG9)), BitmapDescriptorFactory.HUE_RED);
                    break;
                    break;
                case "skewY":
                    sa2.q();
                    float fG10 = sa2.g();
                    sa2.q();
                    if (Float.isNaN(fG10) || !sa2.a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new Xw("Invalid transform list: " + str);
                    }
                    matrix.preSkew(BitmapDescriptorFactory.HUE_RED, (float) Math.tan(Math.toRadians(fG10)));
                    break;
                    break;
                case "translate":
                    sa2.q();
                    float fG11 = sa2.g();
                    float fN4 = sa2.n();
                    sa2.q();
                    if (Float.isNaN(fG11) || !sa2.a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new Xw("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fN4)) {
                        matrix.preTranslate(fG11, fN4);
                    } else {
                        matrix.preTranslate(fG11, BitmapDescriptorFactory.HUE_RED);
                    }
                    break;
                    break;
                default:
                    throw new Xw("Invalid transform list fn: " + strH + ")");
            }
            if (sa2.c()) {
                return matrix;
            }
            sa2.p();
        }
        return matrix;
    }

    static DA.o H(String str) {
        str.getClass();
        if (str.equals("none")) {
            return DA.o.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return DA.o.NonScalingStroke;
        }
        return null;
    }

    private static Vw.C2980c I(String str) throws Xw {
        SA sa2 = new SA(str);
        sa2.q();
        float fG = sa2.g();
        sa2.p();
        float fG2 = sa2.g();
        sa2.p();
        float fG3 = sa2.g();
        sa2.p();
        float fG4 = sa2.g();
        if (Float.isNaN(fG) || Float.isNaN(fG2) || Float.isNaN(fG3) || Float.isNaN(fG4)) {
            throw new Xw("Invalid viewBox definition - should have four numbers");
        }
        if (fG3 < BitmapDescriptorFactory.HUE_RED) {
            throw new Xw("Invalid viewBox. width cannot be negative");
        }
        if (fG4 >= BitmapDescriptorFactory.HUE_RED) {
            return new Vw.C2980c(fG, fG2, fG3, fG4);
        }
        throw new Xw("Invalid viewBox. height cannot be negative");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(String str) {
        if (this.f30142d) {
            return;
        }
        if (this.f30144f) {
            if (this.f30146h == null) {
                this.f30146h = new StringBuilder(str.length());
            }
            this.f30146h.append(str);
        } else if (this.f30147i) {
            if (this.f30148j == null) {
                this.f30148j = new StringBuilder(str.length());
            }
            this.f30148j.append(str);
        } else if (this.f30140b instanceof Vw.Y) {
            a(str);
        }
    }

    private void h(Attributes attributes) throws Xw {
        a("<line>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.C2995r c2995r = new Vw.C2995r();
        c2995r.f29261a = this.f30139a;
        c2995r.f29262b = this.f30140b;
        a((Vw.L) c2995r, attributes);
        b(c2995r, attributes);
        a((Vw.InterfaceC2992o) c2995r, attributes);
        a((Vw.G) c2995r, attributes);
        a(c2995r, attributes);
        this.f30140b.a(c2995r);
    }

    private void i(Attributes attributes) throws Xw {
        a("<linearGradient>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.M m11 = new Vw.M();
        m11.f29261a = this.f30139a;
        m11.f29262b = this.f30140b;
        a((Vw.L) m11, attributes);
        b(m11, attributes);
        a((Vw.AbstractC2988k) m11, attributes);
        a(m11, attributes);
        this.f30140b.a(m11);
        this.f30140b = m11;
    }

    private void j(Attributes attributes) throws Xw {
        a("<marker>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.C2996s c2996s = new Vw.C2996s();
        c2996s.f29261a = this.f30139a;
        c2996s.f29262b = this.f30140b;
        a((Vw.L) c2996s, attributes);
        b(c2996s, attributes);
        a((Vw.G) c2996s, attributes);
        a((Vw.R) c2996s, attributes);
        a(c2996s, attributes);
        this.f30140b.a(c2996s);
        this.f30140b = c2996s;
    }

    private void k(Attributes attributes) throws Xw {
        a("<mask>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.C2997t c2997t = new Vw.C2997t();
        c2997t.f29261a = this.f30139a;
        c2997t.f29262b = this.f30140b;
        a((Vw.L) c2997t, attributes);
        b(c2997t, attributes);
        a((Vw.G) c2997t, attributes);
        a(c2997t, attributes);
        this.f30140b.a(c2997t);
        this.f30140b = c2997t;
    }

    private void l(Attributes attributes) throws Xw {
        a("<path>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.C3000w c3000w = new Vw.C3000w();
        c3000w.f29261a = this.f30139a;
        c3000w.f29262b = this.f30140b;
        a((Vw.L) c3000w, attributes);
        b(c3000w, attributes);
        a((Vw.InterfaceC2992o) c3000w, attributes);
        a((Vw.G) c3000w, attributes);
        a(c3000w, attributes);
        this.f30140b.a(c3000w);
    }

    private void m(Attributes attributes) throws Xw {
        a("<pattern>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.C3003z c3003z = new Vw.C3003z();
        c3003z.f29261a = this.f30139a;
        c3003z.f29262b = this.f30140b;
        a((Vw.L) c3003z, attributes);
        b(c3003z, attributes);
        a((Vw.G) c3003z, attributes);
        a((Vw.R) c3003z, attributes);
        a(c3003z, attributes);
        this.f30140b.a(c3003z);
        this.f30140b = c3003z;
    }

    private void n(Attributes attributes) throws Xw {
        a("<polygon>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.A b11 = new Vw.B();
        b11.f29261a = this.f30139a;
        b11.f29262b = this.f30140b;
        a((Vw.L) b11, attributes);
        b(b11, attributes);
        a((Vw.InterfaceC2992o) b11, attributes);
        a((Vw.G) b11, attributes);
        a(b11, attributes, "polygon");
        this.f30140b.a(b11);
    }

    private void o(Attributes attributes) throws Xw {
        a("<polyline>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.A a11 = new Vw.A();
        a11.f29261a = this.f30139a;
        a11.f29262b = this.f30140b;
        a((Vw.L) a11, attributes);
        b(a11, attributes);
        a((Vw.InterfaceC2992o) a11, attributes);
        a((Vw.G) a11, attributes);
        a(a11, attributes, "polyline");
        this.f30140b.a(a11);
    }

    private void p(Attributes attributes) throws Xw {
        a("<radialGradient>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.Q q11 = new Vw.Q();
        q11.f29261a = this.f30139a;
        q11.f29262b = this.f30140b;
        a((Vw.L) q11, attributes);
        b(q11, attributes);
        a((Vw.AbstractC2988k) q11, attributes);
        a(q11, attributes);
        this.f30140b.a(q11);
        this.f30140b = q11;
    }

    private void q(Attributes attributes) throws Xw {
        a("<rect>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.C c11 = new Vw.C();
        c11.f29261a = this.f30139a;
        c11.f29262b = this.f30140b;
        a((Vw.L) c11, attributes);
        b(c11, attributes);
        a((Vw.InterfaceC2992o) c11, attributes);
        a((Vw.G) c11, attributes);
        a(c11, attributes);
        this.f30140b.a(c11);
    }

    private void r(Attributes attributes) throws Xw {
        a("<solidColor>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.D d11 = new Vw.D();
        d11.f29261a = this.f30139a;
        d11.f29262b = this.f30140b;
        a(d11, attributes);
        b(d11, attributes);
        this.f30140b.a(d11);
        this.f30140b = d11;
    }

    private void s(Attributes attributes) throws Xw {
        a("<stop>", new Object[0]);
        Vw.J j11 = this.f30140b;
        if (j11 == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        if (!(j11 instanceof Vw.AbstractC2988k)) {
            throw new Xw("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        Vw.E e11 = new Vw.E();
        e11.f29261a = this.f30139a;
        e11.f29262b = this.f30140b;
        a((Vw.L) e11, attributes);
        b(e11, attributes);
        a(e11, attributes);
        this.f30140b.a(e11);
        this.f30140b = e11;
    }

    static Boolean t(String str) {
        str.getClass();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    private void u(Attributes attributes) throws Xw {
        a("<svg>", new Object[0]);
        Vw.F f11 = new Vw.F();
        f11.f29261a = this.f30139a;
        f11.f29262b = this.f30140b;
        a((Vw.L) f11, attributes);
        b(f11, attributes);
        a((Vw.G) f11, attributes);
        a((Vw.R) f11, attributes);
        a(f11, attributes);
        Vw.J j11 = this.f30140b;
        if (j11 == null) {
            this.f30139a.a(f11);
        } else {
            j11.a(f11);
        }
        this.f30140b = f11;
    }

    private void v(Attributes attributes) throws Xw {
        a("<symbol>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.R t11 = new Vw.T();
        t11.f29261a = this.f30139a;
        t11.f29262b = this.f30140b;
        a((Vw.L) t11, attributes);
        b(t11, attributes);
        a((Vw.G) t11, attributes);
        a(t11, attributes);
        this.f30140b.a(t11);
        this.f30140b = t11;
    }

    private void w(Attributes attributes) throws Xw {
        a("<text>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.W w11 = new Vw.W();
        w11.f29261a = this.f30139a;
        w11.f29262b = this.f30140b;
        a((Vw.L) w11, attributes);
        b(w11, attributes);
        a((Vw.InterfaceC2992o) w11, attributes);
        a((Vw.G) w11, attributes);
        a((Vw.a0) w11, attributes);
        this.f30140b.a(w11);
        this.f30140b = w11;
    }

    private void x(Attributes attributes) throws Xw {
        a("<textPath>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.Z z11 = new Vw.Z();
        z11.f29261a = this.f30139a;
        z11.f29262b = this.f30140b;
        a((Vw.L) z11, attributes);
        b(z11, attributes);
        a((Vw.G) z11, attributes);
        a(z11, attributes);
        this.f30140b.a(z11);
        this.f30140b = z11;
        Vw.J j11 = z11.f29262b;
        if (j11 instanceof Vw.b0) {
            z11.a((Vw.b0) j11);
        } else {
            z11.a(((Vw.X) j11).d());
        }
    }

    private void y(Attributes attributes) throws Xw {
        a("<tref>", new Object[0]);
        Vw.J j11 = this.f30140b;
        if (j11 == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        if (!(j11 instanceof Vw.Y)) {
            throw new Xw("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        Vw.U u11 = new Vw.U();
        u11.f29261a = this.f30139a;
        u11.f29262b = this.f30140b;
        a((Vw.L) u11, attributes);
        b(u11, attributes);
        a((Vw.G) u11, attributes);
        a(u11, attributes);
        this.f30140b.a(u11);
        Vw.J j12 = u11.f29262b;
        if (j12 instanceof Vw.b0) {
            u11.a((Vw.b0) j12);
        } else {
            u11.a(((Vw.X) j12).d());
        }
    }

    private void z(Attributes attributes) throws Xw {
        a("<tspan>", new Object[0]);
        Vw.J j11 = this.f30140b;
        if (j11 == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        if (!(j11 instanceof Vw.Y)) {
            throw new Xw("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        Vw.V v11 = new Vw.V();
        v11.f29261a = this.f30139a;
        v11.f29262b = this.f30140b;
        a((Vw.L) v11, attributes);
        b(v11, attributes);
        a((Vw.G) v11, attributes);
        a((Vw.a0) v11, attributes);
        this.f30140b.a(v11);
        this.f30140b = v11;
        Vw.J j12 = v11.f29262b;
        if (j12 instanceof Vw.b0) {
            v11.a((Vw.b0) j12);
        } else {
            v11.a(((Vw.X) j12).d());
        }
    }

    private static float b(float f11, float f12, float f13) {
        float f14;
        if (f13 < BitmapDescriptorFactory.HUE_RED) {
            f13 += 6.0f;
        }
        if (f13 >= 6.0f) {
            f13 -= 6.0f;
        }
        if (f13 < 1.0f) {
            f14 = (f12 - f11) * f13;
        } else {
            if (f13 < 3.0f) {
                return f12;
            }
            if (f13 >= 4.0f) {
                return f11;
            }
            f14 = (f12 - f11) * (4.0f - f13);
        }
        return f14 + f11;
    }

    private void c(InputStream inputStream) throws Xw {
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            i iVar = new i(xmlPullParserNewPullParser);
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            xmlPullParserNewPullParser.setInput(inputStream, null);
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                if (eventType == 0) {
                    b();
                } else if (eventType == 8) {
                    SA sa2 = new SA(xmlPullParserNewPullParser.getText());
                    a(sa2.k(), b(sa2));
                } else if (eventType == 2) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (xmlPullParserNewPullParser.getPrefix() != null) {
                        name = xmlPullParserNewPullParser.getPrefix() + CoreConstants.COLON_CHAR + name;
                    }
                    a(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, iVar);
                } else if (eventType == 3) {
                    String name2 = xmlPullParserNewPullParser.getName();
                    if (xmlPullParserNewPullParser.getPrefix() != null) {
                        name2 = xmlPullParserNewPullParser.getPrefix() + CoreConstants.COLON_CHAR + name2;
                    }
                    a(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                } else if (eventType == 4) {
                    int[] iArr = new int[2];
                    a(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                } else if (eventType == 5) {
                    J(xmlPullParserNewPullParser.getText());
                } else if (eventType == 6) {
                    J(xmlPullParserNewPullParser.getText());
                }
            }
            a();
        } catch (IOException e11) {
            throw new Xw("Stream error", e11);
        } catch (XmlPullParserException e12) {
            throw new Xw("XML parser problem", e12);
        }
    }

    private void d(Attributes attributes) throws Xw {
        a("<defs>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.C2986i c2986i = new Vw.C2986i();
        c2986i.f29261a = this.f30139a;
        c2986i.f29262b = this.f30140b;
        a((Vw.L) c2986i, attributes);
        b(c2986i, attributes);
        a((Vw.InterfaceC2992o) c2986i, attributes);
        this.f30140b.a(c2986i);
        this.f30140b = c2986i;
    }

    private void e(Attributes attributes) throws Xw {
        a("<ellipse>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.C2987j c2987j = new Vw.C2987j();
        c2987j.f29261a = this.f30139a;
        c2987j.f29262b = this.f30140b;
        a((Vw.L) c2987j, attributes);
        b(c2987j, attributes);
        a((Vw.InterfaceC2992o) c2987j, attributes);
        a((Vw.G) c2987j, attributes);
        a(c2987j, attributes);
        this.f30140b.a(c2987j);
    }

    private void f(Attributes attributes) throws Xw {
        a("<g>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.C2991n c2991n = new Vw.C2991n();
        c2991n.f29261a = this.f30139a;
        c2991n.f29262b = this.f30140b;
        a((Vw.L) c2991n, attributes);
        b(c2991n, attributes);
        a((Vw.InterfaceC2992o) c2991n, attributes);
        a((Vw.G) c2991n, attributes);
        this.f30140b.a(c2991n);
        this.f30140b = c2991n;
    }

    private void g(Attributes attributes) throws Xw {
        a("<image>", new Object[0]);
        if (this.f30140b == null) {
            throw new Xw("Invalid document. Root element must be <svg>");
        }
        Vw.C2993p c2993p = new Vw.C2993p();
        c2993p.f29261a = this.f30139a;
        c2993p.f29262b = this.f30140b;
        a((Vw.L) c2993p, attributes);
        b(c2993p, attributes);
        a((Vw.InterfaceC2992o) c2993p, attributes);
        a((Vw.G) c2993p, attributes);
        a(c2993p, attributes);
        this.f30140b.a(c2993p);
        this.f30140b = c2993p;
    }

    @Override // com.fourthline.orca.internal.Yw
    public Yw a(Ww ww2) {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
    }

    private void b(InputStream inputStream) throws Xw {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            if (!f30137k) {
                sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
                sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            }
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            f fVar = new f();
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e11) {
            throw new Xw("Stream error", e11);
        } catch (ParserConfigurationException e12) {
            throw new Xw("XML parser problem", e12);
        } catch (SAXException e13) {
            throw new Xw("SVG parse error", e13);
        }
    }

    private void a(String str, Object... objArr) {
    }

    private void t(Attributes attributes) throws Xw {
        a("<style>", new Object[0]);
        if (this.f30140b != null) {
            String str = "all";
            boolean zEquals = true;
            for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                String strTrim = attributes.getValue(i11).trim();
                int i12 = a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()];
                if (i12 == 49) {
                    zEquals = strTrim.equals("text/css");
                } else if (i12 == 50) {
                    str = strTrim;
                }
            }
            if (zEquals && I3.a(str, I3.e.screen)) {
                this.f30147i = true;
                return;
            } else {
                this.f30142d = true;
                this.f30143e = 1;
                return;
            }
        }
        throw new Xw("Invalid document. Root element must be <svg>");
    }

    @Override // com.fourthline.orca.internal.Yw
    public Vw a(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i11 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i11 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            if (f30137k) {
                a("Forcing SAX parser for this version of Android", new Object[0]);
                b(inputStream);
                return this.f30139a;
            }
            if (this.f30141c) {
                inputStream.mark(4096);
                byte[] bArr = new byte[4096];
                String str = new String(bArr, 0, inputStream.read(bArr));
                inputStream.reset();
                if (str.contains("<!ENTITY ")) {
                    a("Switching to SAX parser to process entities", new Object[0]);
                    b(inputStream);
                    return this.f30139a;
                }
            }
            c(inputStream);
            return this.f30139a;
        } catch (IOException unused2) {
            c(inputStream);
            return this.f30139a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused3) {
            }
        }
    }

    static Vw.C2994q r(String str) {
        if ("normal".equals(str)) {
            return Vw.C2994q.f29338c;
        }
        try {
            Vw.C2994q c2994qP = p(str);
            if (c2994qP.f29341b == Vw.d0.percent) {
                return null;
            }
            return c2994qP;
        } catch (Xw unused) {
            return null;
        }
    }

    static DA.i B(String str) {
        if ("miter".equals(str)) {
            return DA.i.Miter;
        }
        if ("round".equals(str)) {
            return DA.i.Round;
        }
        if ("bevel".equals(str)) {
            return DA.i.Bevel;
        }
        return null;
    }

    private static Set C(String str) {
        SA sa2 = new SA(str);
        HashSet hashSet = new HashSet();
        while (!sa2.c()) {
            String strK = sa2.k();
            int iIndexOf = strK.indexOf(45);
            if (iIndexOf != -1) {
                strK = strK.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strK, "", "").getLanguage());
            sa2.q();
        }
        return hashSet;
    }

    static Vw.C2984g d(String str) {
        if (str.charAt(0) == '#') {
            Yh yhA = Yh.a(str, 1, str.length());
            if (yhA == null) {
                return Vw.C2984g.f29313b;
            }
            int iA = yhA.a();
            if (iA == 4) {
                int iB = yhA.b();
                int i11 = iB & 3840;
                int i12 = iB & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                int i13 = iB & 15;
                return new Vw.C2984g(i13 | (i11 << 8) | (-16777216) | (i11 << 12) | (i12 << 8) | (i12 << 4) | (i13 << 4));
            }
            if (iA != 5) {
                if (iA == 7) {
                    return new Vw.C2984g(yhA.b() | (-16777216));
                }
                if (iA != 9) {
                    return Vw.C2984g.f29313b;
                }
                return new Vw.C2984g((yhA.b() >>> 8) | (yhA.b() << 24));
            }
            int iB2 = yhA.b();
            int i14 = 61440 & iB2;
            int i15 = iB2 & 3840;
            int i16 = iB2 & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
            int i17 = iB2 & 15;
            return new Vw.C2984g((i17 << 24) | (i17 << 28) | (i14 << 8) | (i14 << 4) | (i15 << 4) | i15 | i16 | (i16 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        float fG = Float.NaN;
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (zStartsWith2 || lowerCase.startsWith("hsl(")) {
                SA sa2 = new SA(str.substring(zStartsWith2 ? 5 : 4));
                sa2.q();
                float fG2 = sa2.g();
                if (!Float.isNaN(fG2)) {
                    sa2.a("deg");
                    boolean zP = sa2.p();
                    float fG3 = sa2.g();
                    if (!Float.isNaN(fG3)) {
                        if (!sa2.a(CoreConstants.PERCENT_CHAR)) {
                            return Vw.C2984g.f29313b;
                        }
                        if (zP) {
                            if (!sa2.p()) {
                                return Vw.C2984g.f29313b;
                            }
                        } else {
                            sa2.q();
                        }
                        float fG4 = sa2.g();
                        if (!Float.isNaN(fG4)) {
                            if (!sa2.a(CoreConstants.PERCENT_CHAR)) {
                                return Vw.C2984g.f29313b;
                            }
                            if (zP) {
                                if (sa2.p()) {
                                    fG = sa2.g();
                                }
                            } else {
                                sa2.q();
                                if (sa2.a('/')) {
                                    sa2.q();
                                    fG = sa2.g();
                                }
                            }
                            sa2.q();
                            if (!sa2.a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                                return Vw.C2984g.f29313b;
                            }
                            if (Float.isNaN(fG)) {
                                return new Vw.C2984g(a(fG2, fG3, fG4) | (-16777216));
                            }
                            return new Vw.C2984g(a(fG2, fG3, fG4) | (a(fG * 256.0f) << 24));
                        }
                    }
                }
            }
        } else {
            SA sa3 = new SA(str.substring(zStartsWith ? 5 : 4));
            sa3.q();
            float fG5 = sa3.g();
            if (!Float.isNaN(fG5)) {
                if (sa3.a(CoreConstants.PERCENT_CHAR)) {
                    fG5 = (fG5 * 256.0f) / 100.0f;
                }
                boolean zP2 = sa3.p();
                float fG6 = sa3.g();
                if (!Float.isNaN(fG6)) {
                    if (sa3.a(CoreConstants.PERCENT_CHAR)) {
                        fG6 = (fG6 * 256.0f) / 100.0f;
                    }
                    if (zP2) {
                        if (!sa3.p()) {
                            return Vw.C2984g.f29313b;
                        }
                    } else {
                        sa3.q();
                    }
                    float fG7 = sa3.g();
                    if (!Float.isNaN(fG7)) {
                        if (sa3.a(CoreConstants.PERCENT_CHAR)) {
                            fG7 = (fG7 * 256.0f) / 100.0f;
                        }
                        if (zP2) {
                            if (sa3.p()) {
                                fG = sa3.g();
                            }
                        } else {
                            sa3.q();
                            if (sa3.a('/')) {
                                sa3.q();
                                fG = sa3.g();
                            }
                        }
                        sa3.q();
                        if (!sa3.a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                            return Vw.C2984g.f29313b;
                        }
                        if (Float.isNaN(fG)) {
                            return new Vw.C2984g((a(fG5) << 16) | (-16777216) | (a(fG6) << 8) | a(fG7));
                        }
                        return new Vw.C2984g((a(fG5) << 16) | (a(fG * 256.0f) << 24) | (a(fG6) << 8) | a(fG7));
                    }
                }
            }
        }
        return e(lowerCase);
    }

    static float h(String str) throws Xw {
        int length = str.length();
        if (length != 0) {
            return a(str, 0, length);
        }
        throw new Xw("Invalid float value (empty string)");
    }

    static List i(String str) {
        SA sa2 = new SA(str);
        ArrayList arrayList = null;
        do {
            String strJ = sa2.j();
            if (strJ == null) {
                strJ = sa2.c(CoreConstants.COMMA_CHAR);
            }
            if (strJ == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strJ);
            sa2.p();
        } while (!sa2.c());
        return arrayList;
    }

    static Float k(String str) {
        Float fB = d.b(str);
        if (fB != null) {
            return fB;
        }
        SA sa2 = new SA(str);
        float fG = sa2.g();
        Float fValueOf = Float.valueOf(fG);
        if (!sa2.a(CoreConstants.PERCENT_CHAR)) {
            return null;
        }
        sa2.q();
        if (sa2.c() && fG >= BitmapDescriptorFactory.HUE_RED) {
            return fValueOf;
        }
        return null;
    }

    static DA.e l(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return DA.e.oblique;
            case "italic":
                return DA.e.italic;
            case "normal":
                return DA.e.normal;
            default:
                return null;
        }
    }

    private Float n(String str) throws Xw {
        if (str.length() != 0) {
            int length = str.length();
            boolean z11 = true;
            if (str.charAt(str.length() - 1) == '%') {
                length--;
            } else {
                z11 = false;
            }
            try {
                float fA = a(str, 0, length);
                float f11 = 100.0f;
                if (z11) {
                    fA /= 100.0f;
                }
                if (fA < BitmapDescriptorFactory.HUE_RED) {
                    f11 = 0.0f;
                } else if (fA <= 100.0f) {
                    f11 = fA;
                }
                return Float.valueOf(f11);
            } catch (NumberFormatException e11) {
                throw new Xw("Invalid offset value in <stop>: " + str, e11);
            }
        }
        throw new Xw("Invalid offset value in <stop> (empty string)");
    }

    static DA.g o(String str) {
        str.getClass();
        if (str.equals(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            return DA.g.auto;
        }
        if (str.equals("isolate")) {
            return DA.g.isolate;
        }
        return null;
    }

    static Vw.C2994q p(String str) throws Xw {
        if (str.length() != 0) {
            int length = str.length();
            Vw.d0 d0VarValueOf = Vw.d0.px;
            char cCharAt = str.charAt(length - 1);
            if (cCharAt == '%') {
                length--;
                d0VarValueOf = Vw.d0.percent;
            } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
                length -= 2;
                try {
                    d0VarValueOf = Vw.d0.valueOf(str.substring(length).toLowerCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    throw new Xw("Invalid length unit specifier: " + str);
                }
            }
            try {
                return new Vw.C2994q(a(str, 0, length), d0VarValueOf);
            } catch (NumberFormatException e11) {
                throw new Xw("Invalid length value: " + str, e11);
            }
        }
        throw new Xw("Invalid length value (empty string)");
    }

    private static List q(String str) throws Xw {
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            SA sa2 = new SA(str);
            sa2.q();
            while (!sa2.c()) {
                float fG = sa2.g();
                if (!Float.isNaN(fG)) {
                    Vw.d0 d0VarL = sa2.l();
                    if (d0VarL == null) {
                        d0VarL = Vw.d0.px;
                    }
                    arrayList.add(new Vw.C2994q(fG, d0VarL));
                    sa2.p();
                } else {
                    throw new Xw("Invalid length list value: " + sa2.b());
                }
            }
            return arrayList;
        }
        throw new Xw("Invalid length list (empty string)");
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c3  */
    protected static Vw.C3001x v(String str) {
        float f11;
        float f12;
        SA sa2 = new SA(str);
        Vw.C3001x c3001x = new Vw.C3001x();
        if (!sa2.c()) {
            int iIntValue = sa2.e().intValue();
            int i11 = 109;
            if (iIntValue == 77 || iIntValue == 109) {
                int iIntValue2 = iIntValue;
                float f13 = 0.0f;
                float f14 = 0.0f;
                float fG = 0.0f;
                float fA = 0.0f;
                float f15 = 0.0f;
                float f16 = 0.0f;
                while (true) {
                    sa2.q();
                    switch (iIntValue2) {
                        case 65:
                        case 97:
                            float f17 = f13;
                            float fG2 = sa2.g();
                            float f18 = f14;
                            float fA2 = sa2.a(fG2);
                            float fA3 = sa2.a(fA2);
                            Boolean boolA = sa2.a(Float.valueOf(fA3));
                            Boolean boolA2 = sa2.a((Object) boolA);
                            float fA4 = sa2.a(boolA2);
                            float fA5 = sa2.a(fA4);
                            if (!Float.isNaN(fA5) && fG2 >= BitmapDescriptorFactory.HUE_RED && fA2 >= BitmapDescriptorFactory.HUE_RED) {
                                if (iIntValue2 == 97) {
                                    fA4 += f18;
                                    fA5 += f17;
                                }
                                boolean zBooleanValue = boolA.booleanValue();
                                boolean zBooleanValue2 = boolA2.booleanValue();
                                float f19 = fA4;
                                float f21 = fA5;
                                c3001x.a(fG2, fA2, fA3, zBooleanValue, zBooleanValue2, f19, f21);
                                f14 = f19;
                                fG = f14;
                                f13 = f21;
                                fA = f13;
                                sa2.p();
                                if (sa2.c()) {
                                    if (sa2.d()) {
                                        iIntValue2 = sa2.e().intValue();
                                    }
                                    i11 = 109;
                                }
                            }
                            break;
                        case 67:
                        case 99:
                            float fG3 = sa2.g();
                            float fA6 = sa2.a(fG3);
                            float fA7 = sa2.a(fA6);
                            float fA8 = sa2.a(fA7);
                            float fA9 = sa2.a(fA8);
                            float fA10 = sa2.a(fA9);
                            if (!Float.isNaN(fA10)) {
                                if (iIntValue2 == 99) {
                                    fA9 += f14;
                                    fA10 += f13;
                                    fG3 += f14;
                                    fA6 += f13;
                                    fA7 += f14;
                                    fA8 += f13;
                                }
                                float f22 = fG3;
                                float f23 = fA6;
                                fG = fA7;
                                fA = fA8;
                                f11 = fA9;
                                f12 = fA10;
                                c3001x.cubicTo(f22, f23, fG, fA, f11, f12);
                                f14 = f11;
                                f13 = f12;
                                sa2.p();
                                if (sa2.c()) {
                                    if (sa2.d()) {
                                        iIntValue2 = sa2.e().intValue();
                                    }
                                    i11 = 109;
                                }
                            }
                            break;
                        case 72:
                        case 104:
                            float fG4 = sa2.g();
                            if (!Float.isNaN(fG4)) {
                                if (iIntValue2 == 104) {
                                    fG4 += f14;
                                }
                                f14 = fG4;
                                c3001x.lineTo(f14, f13);
                                fA = f13;
                                fG = f14;
                                sa2.p();
                                if (sa2.c()) {
                                    if (sa2.d()) {
                                        iIntValue2 = sa2.e().intValue();
                                    }
                                    i11 = 109;
                                }
                            }
                            break;
                        case 76:
                        case 108:
                            float fG5 = sa2.g();
                            float fA11 = sa2.a(fG5);
                            if (!Float.isNaN(fA11)) {
                                if (iIntValue2 == 108) {
                                    fG5 += f14;
                                    fA11 += f13;
                                }
                                f14 = fG5;
                                f13 = fA11;
                                c3001x.lineTo(f14, f13);
                                fA = f13;
                                fG = f14;
                                sa2.p();
                                if (sa2.c()) {
                                    if (sa2.d()) {
                                        iIntValue2 = sa2.e().intValue();
                                    }
                                    i11 = 109;
                                }
                            }
                            break;
                        case 77:
                        case 109:
                            float fG6 = sa2.g();
                            float fA12 = sa2.a(fG6);
                            if (!Float.isNaN(fA12)) {
                                if (iIntValue2 == i11 && !c3001x.a()) {
                                    fG6 += f14;
                                    fA12 += f13;
                                }
                                f14 = fG6;
                                f13 = fA12;
                                c3001x.moveTo(f14, f13);
                                fA = f13;
                                f16 = fA;
                                fG = f14;
                                f15 = fG;
                                iIntValue2 = iIntValue2 != i11 ? 76 : 108;
                                sa2.p();
                                if (sa2.c()) {
                                    if (sa2.d()) {
                                        iIntValue2 = sa2.e().intValue();
                                    }
                                    i11 = 109;
                                }
                            }
                            break;
                        case 81:
                        case 113:
                            float fG7 = sa2.g();
                            float fA13 = sa2.a(fG7);
                            float fA14 = sa2.a(fA13);
                            float fA15 = sa2.a(fA14);
                            if (!Float.isNaN(fA15)) {
                                if (iIntValue2 == 113) {
                                    fA14 += f14;
                                    fA15 += f13;
                                    fG7 += f14;
                                    fA13 += f13;
                                }
                                float f24 = fG7;
                                float f25 = fA13;
                                c3001x.a(f24, f25, fA14, fA15);
                                fA = f25;
                                fG = f24;
                                f14 = fA14;
                                f13 = fA15;
                                sa2.p();
                                if (sa2.c()) {
                                    if (sa2.d()) {
                                        iIntValue2 = sa2.e().intValue();
                                    }
                                    i11 = 109;
                                }
                            }
                            break;
                        case 83:
                        case 115:
                            float f26 = (f14 * 2.0f) - fG;
                            float f27 = (2.0f * f13) - fA;
                            fG = sa2.g();
                            fA = sa2.a(fG);
                            float fA16 = sa2.a(fA);
                            float fA17 = sa2.a(fA16);
                            if (!Float.isNaN(fA17)) {
                                if (iIntValue2 == 115) {
                                    fA16 += f14;
                                    fA17 += f13;
                                    fG += f14;
                                    fA += f13;
                                }
                                f11 = fA16;
                                f12 = fA17;
                                c3001x.cubicTo(f26, f27, fG, fA, f11, f12);
                                f14 = f11;
                                f13 = f12;
                                sa2.p();
                                if (sa2.c()) {
                                    if (sa2.d()) {
                                        iIntValue2 = sa2.e().intValue();
                                    }
                                    i11 = 109;
                                }
                            }
                            break;
                        case 84:
                        case 116:
                            float f28 = (f14 * 2.0f) - fG;
                            float f29 = (2.0f * f13) - fA;
                            float fG8 = sa2.g();
                            float fA18 = sa2.a(fG8);
                            if (!Float.isNaN(fA18)) {
                                if (iIntValue2 == 116) {
                                    fG8 += f14;
                                    fA18 += f13;
                                }
                                f14 = fG8;
                                f13 = fA18;
                                c3001x.a(f28, f29, f14, f13);
                                fG = f28;
                                fA = f29;
                                sa2.p();
                                if (sa2.c()) {
                                    if (sa2.d()) {
                                        iIntValue2 = sa2.e().intValue();
                                    }
                                    i11 = 109;
                                }
                            }
                            break;
                        case 86:
                        case 118:
                            float fG9 = sa2.g();
                            if (!Float.isNaN(fG9)) {
                                if (iIntValue2 == 118) {
                                    fG9 += f13;
                                }
                                f13 = fG9;
                                c3001x.lineTo(f14, f13);
                                fA = f13;
                                fG = f14;
                                sa2.p();
                                if (sa2.c()) {
                                    if (sa2.d()) {
                                        iIntValue2 = sa2.e().intValue();
                                    }
                                    i11 = 109;
                                }
                            }
                            break;
                        case 90:
                        case 122:
                            c3001x.close();
                            f14 = f15;
                            fG = f14;
                            f13 = f16;
                            fA = f13;
                            sa2.p();
                            if (sa2.c()) {
                                if (sa2.d()) {
                                    iIntValue2 = sa2.e().intValue();
                                }
                                i11 = 109;
                            }
                            break;
                        default:
                            break;
                    }
                    return c3001x;
                }
            }
        }
        return c3001x;
    }

    static DA.h A(String str) {
        if ("butt".equals(str)) {
            return DA.h.Butt;
        }
        if ("round".equals(str)) {
            return DA.h.Round;
        }
        if ("square".equals(str)) {
            return DA.h.Square;
        }
        return null;
    }

    private static Vw.C2984g e(String str) {
        Integer numA = b.a(str);
        return numA == null ? Vw.C2984g.f29313b : new Vw.C2984g(numA.intValue());
    }

    private static Vw.O f(String str) {
        str.getClass();
        if (str.equals("none")) {
            return Vw.C2984g.f29314c;
        }
        if (!str.equals("currentColor")) {
            return d(str);
        }
        return Vw.C2985h.a();
    }

    static Vw.C2994q j(String str) {
        try {
            Vw.C2994q c2994qA = c.a(str);
            return c2994qA == null ? p(str) : c2994qA;
        } catch (Xw unused) {
            return null;
        }
    }

    static Float m(String str) {
        Float fB = e.b(str);
        if (fB != null) {
            return fB;
        }
        SA sa2 = new SA(str);
        float fG = sa2.g();
        Float fValueOf = Float.valueOf(fG);
        sa2.q();
        if (sa2.c() && fG >= 1.0f && fG <= 1000.0f) {
            return fValueOf;
        }
        return null;
    }

    static Float s(String str) {
        try {
            float fH = h(str);
            float fMin = BitmapDescriptorFactory.HUE_RED;
            if (fH >= BitmapDescriptorFactory.HUE_RED) {
                fMin = Math.min(fH, 1.0f);
            }
            return Float.valueOf(fMin);
        } catch (Xw unused) {
            return null;
        }
    }

    static Vw.O u(String str) {
        if (str.startsWith("url(")) {
            int iIndexOf = str.indexOf(")");
            if (iIndexOf != -1) {
                String strTrim = str.substring(4, iIndexOf).trim();
                String strTrim2 = str.substring(iIndexOf + 1).trim();
                return new Vw.C2999v(strTrim, strTrim2.length() > 0 ? f(strTrim2) : null);
            }
            return new Vw.C2999v(str.substring(4).trim(), null);
        }
        return f(str);
    }

    static DA.j w(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return DA.j.optimizeQuality;
            case "auto":
                return DA.j.auto;
            case "optimizeSpeed":
                return DA.j.optimizeSpeed;
            default:
                return null;
        }
    }

    static DA.c g(String str) {
        if ("nonzero".equals(str)) {
            return DA.c.NonZero;
        }
        if ("evenodd".equals(str)) {
            return DA.c.EvenOdd;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f30139a = new Vw(this.f30141c, null);
    }

    private static Set x(String str) {
        SA sa2 = new SA(str);
        HashSet hashSet = new HashSet();
        while (!sa2.c()) {
            String strK = sa2.k();
            if (strK.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strK.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            sa2.q();
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map b(SA sa2) {
        HashMap map = new HashMap();
        sa2.q();
        String strB = sa2.b('=');
        while (strB != null) {
            sa2.a('=');
            map.put(strB, sa2.j());
            sa2.q();
            strB = sa2.b('=');
        }
        return map;
    }

    private static Set y(String str) {
        SA sa2 = new SA(str);
        HashSet hashSet = new HashSet();
        while (!sa2.c()) {
            hashSet.add(sa2.k());
            sa2.q();
        }
        return hashSet;
    }

    static Vw.C2994q[] z(String str) {
        Vw.C2994q c2994qI;
        SA sa2 = new SA(str);
        sa2.q();
        if (sa2.c() || (c2994qI = sa2.i()) == null || c2994qI.b()) {
            return null;
        }
        float fA = c2994qI.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c2994qI);
        while (!sa2.c()) {
            sa2.p();
            Vw.C2994q c2994qI2 = sa2.i();
            if (c2994qI2 == null || c2994qI2.b()) {
                return null;
            }
            arrayList.add(c2994qI2);
            fA += c2994qI2.a();
        }
        if (fA == BitmapDescriptorFactory.HUE_RED) {
            return null;
        }
        return (Vw.C2994q[]) arrayList.toArray(new Vw.C2994q[0]);
    }

    private void b(Attributes attributes) throws Xw {
        a("<circle>", new Object[0]);
        if (this.f30140b != null) {
            Vw.C2982e c2982e = new Vw.C2982e();
            c2982e.f29261a = this.f30139a;
            c2982e.f29262b = this.f30140b;
            a((Vw.L) c2982e, attributes);
            b(c2982e, attributes);
            a((Vw.InterfaceC2992o) c2982e, attributes);
            a((Vw.G) c2982e, attributes);
            a(c2982e, attributes);
            this.f30140b.a(c2982e);
            return;
        }
        throw new Xw("Invalid document. Root element must be <svg>");
    }

    private void c(Attributes attributes) throws Xw {
        a("<clipPath>", new Object[0]);
        if (this.f30140b != null) {
            Vw.C2983f c2983f = new Vw.C2983f();
            c2983f.f29261a = this.f30139a;
            c2983f.f29262b = this.f30140b;
            a((Vw.L) c2983f, attributes);
            b(c2983f, attributes);
            a((Vw.InterfaceC2992o) c2983f, attributes);
            a((Vw.G) c2983f, attributes);
            a(c2983f, attributes);
            this.f30140b.a(c2983f);
            this.f30140b = c2983f;
            return;
        }
        throw new Xw("Invalid document. Root element must be <svg>");
    }

    public Yw a(boolean z11) {
        this.f30141c = z11;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, Attributes attributes) throws Xw {
        if (this.f30142d) {
            this.f30143e++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h hVarA = h.a(str2);
            switch (a.f30149a[hVarA.ordinal()]) {
                case 1:
                    u(attributes);
                    break;
                case 2:
                    f(attributes);
                    break;
                case 3:
                    d(attributes);
                    break;
                case 4:
                    a(attributes);
                    break;
                case 5:
                    A(attributes);
                    break;
                case 6:
                    l(attributes);
                    break;
                case 7:
                    q(attributes);
                    break;
                case 8:
                    b(attributes);
                    break;
                case 9:
                    e(attributes);
                    break;
                case 10:
                    h(attributes);
                    break;
                case 11:
                    o(attributes);
                    break;
                case 12:
                    n(attributes);
                    break;
                case 13:
                    w(attributes);
                    break;
                case 14:
                    z(attributes);
                    break;
                case 15:
                    y(attributes);
                    break;
                case 16:
                    C(attributes);
                    break;
                case 17:
                    v(attributes);
                    break;
                case 18:
                    j(attributes);
                    break;
                case 19:
                    i(attributes);
                    break;
                case 20:
                    p(attributes);
                    break;
                case 21:
                    s(attributes);
                    break;
                case 22:
                case 23:
                    this.f30144f = true;
                    this.f30145g = hVarA;
                    break;
                case 24:
                    c(attributes);
                    break;
                case 25:
                    x(attributes);
                    break;
                case 26:
                    m(attributes);
                    break;
                case 27:
                    g(attributes);
                    break;
                case 28:
                    B(attributes);
                    break;
                case 29:
                    k(attributes);
                    break;
                case 30:
                    t(attributes);
                    break;
                case 31:
                    r(attributes);
                    break;
                default:
                    this.f30142d = true;
                    this.f30143e = 1;
                    break;
            }
        }
    }

    private void b(Vw.L l11, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            if (strTrim.length() != 0) {
                int i12 = a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()];
                if (i12 == 46) {
                    a(l11, strTrim);
                } else if (i12 != 47) {
                    if (l11.f29254e == null) {
                        l11.f29254e = new DA();
                    }
                    DA.a(l11.f29254e, attributes.getLocalName(i11), attributes.getValue(i11).trim(), true);
                } else {
                    l11.f29256g = I3.b(strTrim);
                }
            }
        }
    }

    static Vw.C2981d c(String str) {
        if (DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        SA sa2 = new SA(str.substring(5));
        sa2.q();
        Vw.C2994q c2994qA = a(sa2);
        sa2.p();
        Vw.C2994q c2994qA2 = a(sa2);
        sa2.p();
        Vw.C2994q c2994qA3 = a(sa2);
        sa2.p();
        Vw.C2994q c2994qA4 = a(sa2);
        sa2.q();
        if (sa2.a(CoreConstants.RIGHT_PARENTHESIS_CHAR) || sa2.c()) {
            return new Vw.C2981d(c2994qA, c2994qA2, c2994qA3, c2994qA4);
        }
        return null;
    }

    private void b(String str) {
        this.f30139a.a(new I3(I3.e.screen, I3.t.Document, null).a(str));
    }

    private void a(char[] cArr, int i11, int i12) {
        if (this.f30142d) {
            return;
        }
        if (this.f30144f) {
            if (this.f30146h == null) {
                this.f30146h = new StringBuilder(i12);
            }
            this.f30146h.append(cArr, i11, i12);
        } else if (this.f30147i) {
            if (this.f30148j == null) {
                this.f30148j = new StringBuilder(i12);
            }
            this.f30148j.append(cArr, i11, i12);
        } else if (this.f30140b instanceof Vw.Y) {
            a(new String(cArr, i11, i12));
        }
    }

    private void a(String str) {
        Vw.H h11 = (Vw.H) this.f30140b;
        int size = h11.getChildren().size();
        Vw.N n11 = size == 0 ? null : (Vw.N) h11.getChildren().get(size - 1);
        if (n11 instanceof Vw.c0) {
            StringBuilder sb2 = new StringBuilder();
            Vw.c0 c0Var = (Vw.c0) n11;
            sb2.append(c0Var.f29288c);
            sb2.append(str);
            c0Var.f29288c = sb2.toString();
            return;
        }
        this.f30140b.a(new Vw.c0(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3) throws Xw {
        if (this.f30142d) {
            int i11 = this.f30143e - 1;
            this.f30143e = i11;
            if (i11 == 0) {
                this.f30142d = false;
                return;
            }
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i12 = a.f30149a[h.a(str2).ordinal()];
            if (i12 != 13 && i12 != 14 && i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4 && i12 != 5) {
                switch (i12) {
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 31:
                        break;
                    case 22:
                    case 23:
                        this.f30144f = false;
                        StringBuilder sb2 = this.f30146h;
                        if (sb2 != null) {
                            h hVar = this.f30145g;
                            if (hVar == h.title) {
                                this.f30139a.e(sb2.toString());
                            } else if (hVar == h.desc) {
                                this.f30139a.d(sb2.toString());
                            }
                            this.f30146h.setLength(0);
                            return;
                        }
                        return;
                    case 30:
                        StringBuilder sb3 = this.f30148j;
                        if (sb3 != null) {
                            this.f30147i = false;
                            b(sb3.toString());
                            this.f30148j.setLength(0);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
            Object obj = this.f30140b;
            if (obj != null) {
                this.f30140b = ((Vw.N) obj).f29262b;
                return;
            }
            throw new Xw(String.format("Unbalanced end element </%s> found", str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Map map) {
        str.equals("xml-stylesheet");
    }

    private void a(Vw.F f11, Attributes attributes) throws Xw {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 1) {
                f11.f29235q = p(strTrim);
            } else if (i12 == 2) {
                f11.f29236r = p(strTrim);
            } else if (i12 == 3) {
                Vw.C2994q c2994qP = p(strTrim);
                f11.f29237s = c2994qP;
                if (c2994qP.b()) {
                    throw new Xw("Invalid <svg> element. width cannot be negative");
                }
            } else if (i12 == 4) {
                Vw.C2994q c2994qP2 = p(strTrim);
                f11.f29238t = c2994qP2;
                if (c2994qP2.b()) {
                    throw new Xw("Invalid <svg> element. height cannot be negative");
                }
            } else if (i12 == 5) {
                f11.f29239u = strTrim;
            }
        }
    }

    private void a(Attributes attributes) throws Xw {
        a("<a>", new Object[0]);
        if (this.f30140b != null) {
            Vw.C2979b c2979b = new Vw.C2979b();
            c2979b.f29261a = this.f30139a;
            c2979b.f29262b = this.f30140b;
            a((Vw.L) c2979b, attributes);
            b(c2979b, attributes);
            a((Vw.InterfaceC2992o) c2979b, attributes);
            a((Vw.G) c2979b, attributes);
            a(c2979b, attributes);
            this.f30140b.a(c2979b);
            this.f30140b = c2979b;
            return;
        }
        throw new Xw("Invalid document. Root element must be <svg>");
    }

    private void a(Vw.C2979b c2979b, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            if (a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()] == 6 && ("".equals(attributes.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11)))) {
                c2979b.f29283p = strTrim;
            }
        }
    }

    private void a(Vw.e0 e0Var, Attributes attributes) throws Xw {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 1) {
                e0Var.f29308q = p(strTrim);
            } else if (i12 == 2) {
                e0Var.f29309r = p(strTrim);
            } else if (i12 == 3) {
                Vw.C2994q c2994qP = p(strTrim);
                e0Var.f29310s = c2994qP;
                if (c2994qP.b()) {
                    throw new Xw("Invalid <use> element. width cannot be negative");
                }
            } else if (i12 != 4) {
                if (i12 == 6 && ("".equals(attributes.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11)))) {
                    e0Var.f29307p = strTrim;
                }
            } else {
                Vw.C2994q c2994qP2 = p(strTrim);
                e0Var.f29311t = c2994qP2;
                if (c2994qP2.b()) {
                    throw new Xw("Invalid <use> element. height cannot be negative");
                }
            }
        }
    }

    private void a(Vw.C2993p c2993p, Attributes attributes) throws Xw {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 1) {
                c2993p.f29333q = p(strTrim);
            } else if (i12 == 2) {
                c2993p.f29334r = p(strTrim);
            } else if (i12 == 3) {
                Vw.C2994q c2994qP = p(strTrim);
                c2993p.f29335s = c2994qP;
                if (c2994qP.b()) {
                    throw new Xw("Invalid <use> element. width cannot be negative");
                }
            } else if (i12 == 4) {
                Vw.C2994q c2994qP2 = p(strTrim);
                c2993p.f29336t = c2994qP2;
                if (c2994qP2.b()) {
                    throw new Xw("Invalid <use> element. height cannot be negative");
                }
            } else if (i12 != 6) {
                if (i12 == 7) {
                    a((Vw.P) c2993p, strTrim);
                }
            } else if ("".equals(attributes.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11))) {
                c2993p.f29332p = strTrim;
            }
        }
    }

    private void a(Vw.C3000w c3000w, Attributes attributes) throws Xw {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 8) {
                c3000w.f29360o = v(strTrim);
            } else if (i12 != 9) {
                continue;
            } else {
                float fH = h(strTrim);
                c3000w.f29361p = Float.valueOf(fH);
                if (fH < BitmapDescriptorFactory.HUE_RED) {
                    throw new Xw("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void a(Vw.C c11, Attributes attributes) throws Xw {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 10) {
                Vw.C2994q c2994qP = p(strTrim);
                c11.f29232s = c2994qP;
                if (c2994qP.b()) {
                    throw new Xw("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i12 == 11) {
                Vw.C2994q c2994qP2 = p(strTrim);
                c11.f29233t = c2994qP2;
                if (c2994qP2.b()) {
                    throw new Xw("Invalid <rect> element. ry cannot be negative");
                }
            } else if (i12 == 1) {
                c11.f29228o = p(strTrim);
            } else if (i12 == 2) {
                c11.f29229p = p(strTrim);
            } else if (i12 == 3) {
                Vw.C2994q c2994qP3 = p(strTrim);
                c11.f29230q = c2994qP3;
                if (c2994qP3.b()) {
                    throw new Xw("Invalid <rect> element. width cannot be negative");
                }
            } else if (i12 != 4) {
                continue;
            } else {
                Vw.C2994q c2994qP4 = p(strTrim);
                c11.f29231r = c2994qP4;
                if (c2994qP4.b()) {
                    throw new Xw("Invalid <rect> element. height cannot be negative");
                }
            }
        }
    }

    private void a(Vw.C2982e c2982e, Attributes attributes) throws Xw {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            switch (a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()]) {
                case 12:
                    c2982e.f29304o = p(strTrim);
                    break;
                case 13:
                    c2982e.f29305p = p(strTrim);
                    break;
                case 14:
                    Vw.C2994q c2994qP = p(strTrim);
                    c2982e.f29306q = c2994qP;
                    if (c2994qP.b()) {
                        throw new Xw("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    private void a(Vw.C2987j c2987j, Attributes attributes) throws Xw {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            switch (a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()]) {
                case 10:
                    Vw.C2994q c2994qP = p(strTrim);
                    c2987j.f29319q = c2994qP;
                    if (c2994qP.b()) {
                        throw new Xw("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    Vw.C2994q c2994qP2 = p(strTrim);
                    c2987j.f29320r = c2994qP2;
                    if (c2994qP2.b()) {
                        throw new Xw("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case 12:
                    c2987j.f29317o = p(strTrim);
                    break;
                case 13:
                    c2987j.f29318p = p(strTrim);
                    break;
            }
        }
    }

    private void a(Vw.C2995r c2995r, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            switch (a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()]) {
                case 15:
                    c2995r.f29342o = p(strTrim);
                    break;
                case 16:
                    c2995r.f29343p = p(strTrim);
                    break;
                case 17:
                    c2995r.f29344q = p(strTrim);
                    break;
                case 18:
                    c2995r.f29345r = p(strTrim);
                    break;
            }
        }
    }

    private void a(Vw.A a11, Attributes attributes, String str) throws Xw {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            if (g.a(attributes.getLocalName(i11)) == g.points) {
                SA sa2 = new SA(attributes.getValue(i11));
                ArrayList arrayList = new ArrayList();
                sa2.q();
                while (!sa2.c()) {
                    float fG = sa2.g();
                    if (!Float.isNaN(fG)) {
                        sa2.p();
                        float fG2 = sa2.g();
                        if (!Float.isNaN(fG2)) {
                            sa2.p();
                            arrayList.add(Float.valueOf(fG));
                            arrayList.add(Float.valueOf(fG2));
                        } else {
                            throw new Xw("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                        }
                    } else {
                        throw new Xw("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                }
                a11.f29227o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    a11.f29227o[i12] = ((Float) it.next()).floatValue();
                    i12++;
                }
            }
        }
    }

    private void a(Vw.a0 a0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 1) {
                a0Var.f29279o = q(strTrim);
            } else if (i12 == 2) {
                a0Var.f29280p = q(strTrim);
            } else if (i12 == 19) {
                a0Var.f29281q = q(strTrim);
            } else if (i12 == 20) {
                a0Var.f29282r = q(strTrim);
            }
        }
    }

    private void a(Vw.U u11, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            if (a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()] == 6 && ("".equals(attributes.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11)))) {
                u11.f29271o = strTrim;
            }
        }
    }

    private void a(Vw.G g11, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            switch (a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()]) {
                case 21:
                    g11.d(x(strTrim));
                    break;
                case 22:
                    g11.a(strTrim);
                    break;
                case 23:
                    g11.c(C(strTrim));
                    break;
                case 24:
                    g11.a(y(strTrim));
                    break;
                case 25:
                    List listI = i(strTrim);
                    g11.b(listI != null ? new HashSet(listI) : new HashSet(0));
                    break;
            }
        }
    }

    private void a(Vw.C2996s c2996s, Attributes attributes) throws Xw {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            switch (a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()]) {
                case 26:
                    c2996s.f29347r = p(strTrim);
                    break;
                case 27:
                    c2996s.f29348s = p(strTrim);
                    break;
                case 28:
                    Vw.C2994q c2994qP = p(strTrim);
                    c2996s.f29349t = c2994qP;
                    if (c2994qP.b()) {
                        throw new Xw("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case 29:
                    Vw.C2994q c2994qP2 = p(strTrim);
                    c2996s.f29350u = c2994qP2;
                    if (c2994qP2.b()) {
                        throw new Xw("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case 30:
                    if ("strokeWidth".equals(strTrim)) {
                        c2996s.f29346q = false;
                    } else if ("userSpaceOnUse".equals(strTrim)) {
                        c2996s.f29346q = true;
                    } else {
                        throw new Xw("Invalid value for attribute markerUnits");
                    }
                    break;
                case 31:
                    if (DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(strTrim)) {
                        c2996s.f29351v = Float.valueOf(Float.NaN);
                    } else {
                        c2996s.f29351v = Float.valueOf(h(strTrim));
                    }
                    break;
            }
        }
    }

    private void a(Vw.AbstractC2988k abstractC2988k, Attributes attributes) throws Xw {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 6) {
                switch (i12) {
                    case 32:
                        if ("objectBoundingBox".equals(strTrim)) {
                            abstractC2988k.f29322i = Boolean.FALSE;
                        } else if ("userSpaceOnUse".equals(strTrim)) {
                            abstractC2988k.f29322i = Boolean.TRUE;
                        } else {
                            throw new Xw("Invalid value for attribute gradientUnits");
                        }
                        break;
                    case 33:
                        abstractC2988k.f29323j = G(strTrim);
                        break;
                    case 34:
                        try {
                            abstractC2988k.f29324k = Vw.EnumC2989l.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new Xw("Invalid spreadMethod attribute. \"" + strTrim + "\" is not a valid value.");
                        }
                        break;
                }
            } else if ("".equals(attributes.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11))) {
                abstractC2988k.f29325l = strTrim;
            }
        }
    }

    private void a(Vw.M m11, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            switch (a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()]) {
                case 15:
                    m11.f29257m = p(strTrim);
                    break;
                case 16:
                    m11.f29258n = p(strTrim);
                    break;
                case 17:
                    m11.f29259o = p(strTrim);
                    break;
                case 18:
                    m11.f29260p = p(strTrim);
                    break;
            }
        }
    }

    private void a(Vw.Q q11, Attributes attributes) throws Xw {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()];
            switch (i12) {
                case 12:
                    q11.f29264m = p(strTrim);
                    break;
                case 13:
                    q11.f29265n = p(strTrim);
                    break;
                case 14:
                    Vw.C2994q c2994qP = p(strTrim);
                    q11.f29266o = c2994qP;
                    if (c2994qP.b()) {
                        throw new Xw("Invalid <radialGradient> element. r cannot be negative");
                    }
                    break;
                    break;
                default:
                    switch (i12) {
                        case 35:
                            q11.f29267p = p(strTrim);
                            break;
                        case 36:
                            q11.f29268q = p(strTrim);
                            break;
                        case 37:
                            Vw.C2994q c2994qP2 = p(strTrim);
                            q11.f29269r = c2994qP2;
                            if (c2994qP2.b()) {
                                throw new Xw("Invalid <radialGradient> element. fr cannot be negative");
                            }
                            break;
                            break;
                    }
                    break;
            }
        }
    }

    private void a(Vw.E e11, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            if (a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()] == 38) {
                e11.f29234h = n(strTrim);
            }
        }
    }

    private void a(Vw.C2983f c2983f, Attributes attributes) throws Xw {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            if (a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()] == 39) {
                if ("objectBoundingBox".equals(strTrim)) {
                    c2983f.f29312p = Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(strTrim)) {
                    c2983f.f29312p = Boolean.TRUE;
                } else {
                    throw new Xw("Invalid value for attribute clipPathUnits");
                }
            }
        }
    }

    private void a(Vw.Z z11, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 6) {
                if (i12 == 40) {
                    z11.f29276p = p(strTrim);
                }
            } else if ("".equals(attributes.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11))) {
                z11.f29275o = strTrim;
            }
        }
    }

    private void a(Vw.C3003z c3003z, Attributes attributes) throws Xw {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 6) {
                if (i12 == 1) {
                    c3003z.f29369t = p(strTrim);
                } else if (i12 == 2) {
                    c3003z.f29370u = p(strTrim);
                } else if (i12 == 3) {
                    Vw.C2994q c2994qP = p(strTrim);
                    c3003z.f29371v = c2994qP;
                    if (c2994qP.b()) {
                        throw new Xw("Invalid <pattern> element. width cannot be negative");
                    }
                } else if (i12 != 4) {
                    switch (i12) {
                        case 41:
                            if ("objectBoundingBox".equals(strTrim)) {
                                c3003z.f29366q = Boolean.FALSE;
                            } else if ("userSpaceOnUse".equals(strTrim)) {
                                c3003z.f29366q = Boolean.TRUE;
                            } else {
                                throw new Xw("Invalid value for attribute patternUnits");
                            }
                            break;
                        case 42:
                            if ("objectBoundingBox".equals(strTrim)) {
                                c3003z.f29367r = Boolean.FALSE;
                            } else if ("userSpaceOnUse".equals(strTrim)) {
                                c3003z.f29367r = Boolean.TRUE;
                            } else {
                                throw new Xw("Invalid value for attribute patternContentUnits");
                            }
                            break;
                        case 43:
                            c3003z.f29368s = G(strTrim);
                            break;
                    }
                } else {
                    Vw.C2994q c2994qP2 = p(strTrim);
                    c3003z.f29372w = c2994qP2;
                    if (c2994qP2.b()) {
                        throw new Xw("Invalid <pattern> element. height cannot be negative");
                    }
                }
            } else if ("".equals(attributes.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11))) {
                c3003z.f29373x = strTrim;
            }
        }
    }

    private void a(Vw.C2997t c2997t, Attributes attributes) throws Xw {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 44) {
                if (i12 != 45) {
                    if (i12 == 1) {
                        c2997t.f29354q = p(strTrim);
                    } else if (i12 == 2) {
                        c2997t.f29355r = p(strTrim);
                    } else if (i12 == 3) {
                        Vw.C2994q c2994qP = p(strTrim);
                        c2997t.f29356s = c2994qP;
                        if (c2994qP.b()) {
                            throw new Xw("Invalid <mask> element. width cannot be negative");
                        }
                    } else if (i12 != 4) {
                        continue;
                    } else {
                        Vw.C2994q c2994qP2 = p(strTrim);
                        c2997t.f29357t = c2994qP2;
                        if (c2994qP2.b()) {
                            throw new Xw("Invalid <mask> element. height cannot be negative");
                        }
                    }
                } else if ("objectBoundingBox".equals(strTrim)) {
                    c2997t.f29353p = Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(strTrim)) {
                    c2997t.f29353p = Boolean.TRUE;
                } else {
                    throw new Xw("Invalid value for attribute maskContentUnits");
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                c2997t.f29352o = Boolean.FALSE;
            } else if ("userSpaceOnUse".equals(strTrim)) {
                c2997t.f29352o = Boolean.TRUE;
            } else {
                throw new Xw("Invalid value for attribute maskUnits");
            }
        }
    }

    private void a(Vw.L l11, Attributes attributes) throws Xw {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String qName = attributes.getQName(i11);
            if (!qName.equals("id") && !qName.equals("xml:id")) {
                if (qName.equals("xml:space")) {
                    String strTrim = attributes.getValue(i11).trim();
                    if ("default".equals(strTrim)) {
                        l11.f29253d = Boolean.FALSE;
                        return;
                    } else {
                        if ("preserve".equals(strTrim)) {
                            l11.f29253d = Boolean.TRUE;
                            return;
                        }
                        throw new Xw("Invalid value for \"xml:space\" attribute: " + strTrim);
                    }
                }
            } else {
                l11.f29252c = attributes.getValue(i11).trim();
                return;
            }
        }
    }

    private static void a(Vw.L l11, String str) {
        J3 j11 = new J3(f30138l.matcher(str).replaceAll(""));
        while (!j11.c()) {
            j11.q();
            String strV = j11.v();
            j11.q();
            if (!j11.a(';')) {
                if (!j11.a(CoreConstants.COLON_CHAR)) {
                    return;
                }
                j11.q();
                String strX = j11.x();
                if (strX != null) {
                    j11.q();
                    if (j11.c() || j11.a(';')) {
                        if (l11.f29255f == null) {
                            l11.f29255f = new DA();
                        }
                        DA.a(l11.f29255f, strV, strX, false);
                        j11.q();
                    }
                }
            }
        }
    }

    private void a(Vw.R r11, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f30150b[g.a(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 7) {
                a((Vw.P) r11, strTrim);
            } else if (i12 == 48) {
                r11.f29270p = I(strTrim);
            }
        }
    }

    private void a(Vw.InterfaceC2992o interfaceC2992o, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            if (g.a(attributes.getLocalName(i11)) == g.transform) {
                interfaceC2992o.a(G(attributes.getValue(i11)));
            }
        }
    }

    private static float a(String str, int i11, int i12) throws Xw {
        float fA = new Xn().a(str, i11, i12);
        if (!Float.isNaN(fA)) {
            return fA;
        }
        throw new Xw("Invalid float value: " + str);
    }

    private static void a(Vw.P p11, String str) {
        p11.f29263o = Ks.a(str);
    }

    private static int a(float f11) {
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        if (f11 > 255.0f) {
            return 255;
        }
        return Math.round(f11);
    }

    private static int a(float f11, float f12, float f13) {
        float fMin = BitmapDescriptorFactory.HUE_RED;
        float f14 = f11 % 360.0f;
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            f14 += 360.0f;
        }
        float f15 = f14 / 60.0f;
        float f16 = f12 / 100.0f;
        float f17 = f13 / 100.0f;
        float fMin2 = f16 < BitmapDescriptorFactory.HUE_RED ? 0.0f : Math.min(f16, 1.0f);
        if (f17 >= BitmapDescriptorFactory.HUE_RED) {
            fMin = Math.min(f17, 1.0f);
        }
        float f18 = fMin <= 0.5f ? (fMin2 + 1.0f) * fMin : (fMin + fMin2) - (fMin2 * fMin);
        float f19 = (fMin * 2.0f) - f18;
        float fB = b(f19, f18, f15 + 2.0f);
        float fB2 = b(f19, f18, f15);
        return a(b(f19, f18, f15 - 2.0f) * 256.0f) | (a(fB * 256.0f) << 16) | (a(fB2 * 256.0f) << 8);
    }

    static void a(DA da2, String str) {
        String strB;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            return;
        }
        SA sa2 = new SA(str);
        Float fB = null;
        DA.e eVarL = null;
        Boolean bool = null;
        Float fB2 = null;
        while (true) {
            strB = sa2.b('/');
            sa2.q();
            if (strB != null) {
                if (fB != null && eVarL != null) {
                    break;
                }
                if (!strB.equals("normal")) {
                    if (fB == null && e.a(strB)) {
                        fB = e.b(strB);
                    } else if (eVarL != null || (eVarL = l(strB)) == null) {
                        if (bool == null && strB.equals("small-caps")) {
                            bool = Boolean.TRUE;
                        } else if (fB2 != null || !d.a(strB)) {
                            break;
                        } else {
                            fB2 = d.b(strB);
                        }
                    }
                }
            } else {
                return;
            }
        }
        Vw.C2994q c2994qJ = j(strB);
        if (sa2.a('/')) {
            sa2.q();
            String strK = sa2.k();
            if (strK != null) {
                try {
                    p(strK);
                } catch (Xw unused) {
                    return;
                }
            }
            sa2.q();
        }
        da2.f25339o = i(sa2.o());
        da2.f25340p = c2994qJ;
        da2.f25341q = Float.valueOf(fB == null ? 400.0f : fB.floatValue());
        if (eVarL == null) {
            eVarL = DA.e.normal;
        }
        da2.f25342r = eVarL;
        da2.f25343s = Float.valueOf(fB2 == null ? 100.0f : fB2.floatValue());
        da2.Q = DA.d.auto;
        da2.R = F3.f25721d;
        da2.S = F3.f25723f;
        da2.T = F3.f25724g;
        if (bool == Boolean.TRUE) {
            da2.T = F3.c();
        }
        da2.U = F3.f25726i;
        da2.V = F3.f25727j;
        da2.W = F3.f25719b;
        da2.X = null;
        da2.f25322a |= 4009918906621952L;
    }

    private static Vw.C2994q a(SA sa2) {
        if (sa2.a(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            return Vw.C2994q.f29338c;
        }
        return sa2.i();
    }

    static String a(String str, String str2) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }
}
