package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.util.FileSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
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
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import kotlinx.coroutines.DebugKt;
import okhttp3.internal.http2.Http2Stream;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21465d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.caverock.androidsvg.g f21462a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.caverock.androidsvg.g.j0 f21463b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21464c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21466e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f21467f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private StringBuilder f21468g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21469h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private StringBuilder f21470i = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f21472b;

        static {
            int[] iArr = new int[g.values().length];
            f21472b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21472b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21472b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21472b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21472b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21472b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21472b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21472b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21472b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21472b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21472b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21472b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21472b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21472b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21472b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21472b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21472b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21472b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f21472b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f21472b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f21472b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f21472b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f21472b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f21472b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f21472b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f21472b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f21472b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f21472b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f21472b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f21472b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f21472b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f21472b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f21472b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f21472b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f21472b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f21472b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f21472b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f21472b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f21472b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f21472b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f21472b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f21472b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f21472b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f21472b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f21472b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f21472b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f21472b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f21472b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f21472b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f21472b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f21472b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f21472b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f21472b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f21472b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f21472b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f21472b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f21472b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f21472b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f21472b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f21472b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f21472b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f21472b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f21472b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f21472b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f21472b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f21472b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f21472b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f21472b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f21472b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f21472b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f21472b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f21472b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f21472b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f21472b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f21472b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f21472b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f21472b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f21472b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f21472b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f21472b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f21472b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f21472b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f21472b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f21472b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f21472b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f21472b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f21472b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f21472b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f21472b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            f21471a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f21471a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f21471a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f21471a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f21471a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f21471a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f21471a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f21471a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f21471a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f21471a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f21471a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f21471a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f21471a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f21471a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f21471a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f21471a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f21471a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f21471a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f21471a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f21471a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f21471a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f21471a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f21471a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f21471a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f21471a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f21471a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f21471a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f21471a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f21471a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f21471a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f21471a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map<String, com.caverock.androidsvg.e.a> f21473a;

        static {
            HashMap map = new HashMap(10);
            f21473a = map;
            map.put("none", com.caverock.androidsvg.e.a.none);
            map.put("xMinYMin", com.caverock.androidsvg.e.a.xMinYMin);
            map.put("xMidYMin", com.caverock.androidsvg.e.a.xMidYMin);
            map.put("xMaxYMin", com.caverock.androidsvg.e.a.xMaxYMin);
            map.put("xMinYMid", com.caverock.androidsvg.e.a.xMinYMid);
            map.put("xMidYMid", com.caverock.androidsvg.e.a.xMidYMid);
            map.put("xMaxYMid", com.caverock.androidsvg.e.a.xMaxYMid);
            map.put("xMinYMax", com.caverock.androidsvg.e.a.xMinYMax);
            map.put("xMidYMax", com.caverock.androidsvg.e.a.xMidYMax);
            map.put("xMaxYMax", com.caverock.androidsvg.e.a.xMaxYMax);
        }

        static com.caverock.androidsvg.e.a a(String str) {
            return f21473a.get(str);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map<String, Integer> f21474a;

        static {
            HashMap map = new HashMap(47);
            f21474a = map;
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
            return f21474a.get(str);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map<String, com.caverock.androidsvg.g.p> f21475a;

        static {
            HashMap map = new HashMap(9);
            f21475a = map;
            com.caverock.androidsvg.g.d1 d1Var = com.caverock.androidsvg.g.d1.pt;
            map.put("xx-small", new com.caverock.androidsvg.g.p(0.694f, d1Var));
            map.put("x-small", new com.caverock.androidsvg.g.p(0.833f, d1Var));
            map.put("small", new com.caverock.androidsvg.g.p(10.0f, d1Var));
            map.put("medium", new com.caverock.androidsvg.g.p(12.0f, d1Var));
            map.put("large", new com.caverock.androidsvg.g.p(14.4f, d1Var));
            map.put("x-large", new com.caverock.androidsvg.g.p(17.3f, d1Var));
            map.put("xx-large", new com.caverock.androidsvg.g.p(20.7f, d1Var));
            com.caverock.androidsvg.g.d1 d1Var2 = com.caverock.androidsvg.g.d1.percent;
            map.put("smaller", new com.caverock.androidsvg.g.p(83.33f, d1Var2));
            map.put("larger", new com.caverock.androidsvg.g.p(120.0f, d1Var2));
        }

        static com.caverock.androidsvg.g.p a(String str) {
            return f21475a.get(str);
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map<String, Integer> f21476a;

        static {
            HashMap map = new HashMap(13);
            f21476a = map;
            map.put("normal", 400);
            map.put("bold", 700);
            map.put("bolder", 1);
            map.put("lighter", -1);
            map.put("100", 100);
            map.put("200", 200);
            map.put("300", 300);
            map.put("400", 400);
            map.put("500", 500);
            map.put("600", 600);
            map.put("700", 700);
            map.put("800", 800);
            map.put("900", 900);
        }

        static Integer a(String str) {
            return f21476a.get(str);
        }
    }

    private class f extends DefaultHandler2 {
        private f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i11, int i12) {
            i.this.c1(new String(cArr, i11, i12));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            i.this.o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            i.this.p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            i.this.r(str, i.this.x0(new C0428i(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            i.this.W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
            i.this.X0(str, str2, str3, attributes);
        }

        /* synthetic */ f(i iVar, a aVar) {
            this();
        }
    }

    private enum g {
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
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
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
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
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

        private static final Map<String, g> cache = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    cache.put(Action.CLASS_ATTRIBUTE, gVar);
                } else if (gVar != UNSUPPORTED) {
                    cache.put(gVar.name().replace('_', CoreConstants.DASH_CHAR), gVar);
                }
            }
        }

        public static g fromString(String str) {
            g gVar = cache.get(str);
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

        private static final Map<String, h> cache = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    cache.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    cache.put(hVar.name(), hVar);
                }
            }
        }

        public static h fromString(String str) {
            h hVar = cache.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    /* JADX INFO: renamed from: com.caverock.androidsvg.i$i, reason: collision with other inner class name */
    static class C0428i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f21496a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21498c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f21497b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.caverock.androidsvg.d f21499d = new com.caverock.androidsvg.d();

        C0428i(String str) {
            this.f21498c = 0;
            String strTrim = str.trim();
            this.f21496a = strTrim;
            this.f21498c = strTrim.length();
        }

        void A() {
            while (true) {
                int i11 = this.f21497b;
                if (i11 >= this.f21498c || !k(this.f21496a.charAt(i11))) {
                    return;
                } else {
                    this.f21497b++;
                }
            }
        }

        int a() {
            int i11 = this.f21497b;
            int i12 = this.f21498c;
            if (i11 == i12) {
                return -1;
            }
            int i13 = i11 + 1;
            this.f21497b = i13;
            if (i13 < i12) {
                return this.f21496a.charAt(i13);
            }
            return -1;
        }

        String b() {
            int i11 = this.f21497b;
            while (!h() && !k(this.f21496a.charAt(this.f21497b))) {
                this.f21497b++;
            }
            String strSubstring = this.f21496a.substring(i11, this.f21497b);
            this.f21497b = i11;
            return strSubstring;
        }

        Boolean c(Object obj) {
            if (obj == null) {
                return null;
            }
            z();
            return m();
        }

        float d(float f11) {
            if (Float.isNaN(f11)) {
                return Float.NaN;
            }
            z();
            return n();
        }

        float e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            z();
            return n();
        }

        boolean f(char c11) {
            int i11 = this.f21497b;
            boolean z11 = i11 < this.f21498c && this.f21496a.charAt(i11) == c11;
            if (z11) {
                this.f21497b++;
            }
            return z11;
        }

        boolean g(String str) {
            int length = str.length();
            int i11 = this.f21497b;
            boolean z11 = i11 <= this.f21498c - length && this.f21496a.substring(i11, i11 + length).equals(str);
            if (z11) {
                this.f21497b += length;
            }
            return z11;
        }

        boolean h() {
            return this.f21497b == this.f21498c;
        }

        boolean i() {
            int i11 = this.f21497b;
            if (i11 == this.f21498c) {
                return false;
            }
            char cCharAt = this.f21496a.charAt(i11);
            if (cCharAt < 'a' || cCharAt > 'z') {
                return cCharAt >= 'A' && cCharAt <= 'Z';
            }
            return true;
        }

        boolean j(int i11) {
            return i11 == 10 || i11 == 13;
        }

        boolean k(int i11) {
            return i11 == 32 || i11 == 10 || i11 == 13 || i11 == 9;
        }

        Integer l() {
            int i11 = this.f21497b;
            if (i11 == this.f21498c) {
                return null;
            }
            String str = this.f21496a;
            this.f21497b = i11 + 1;
            return Integer.valueOf(str.charAt(i11));
        }

        Boolean m() {
            int i11 = this.f21497b;
            if (i11 == this.f21498c) {
                return null;
            }
            char cCharAt = this.f21496a.charAt(i11);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.f21497b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        float n() {
            float fB = this.f21499d.b(this.f21496a, this.f21497b, this.f21498c);
            if (!Float.isNaN(fB)) {
                this.f21497b = this.f21499d.a();
            }
            return fB;
        }

        String o() {
            if (h()) {
                return null;
            }
            int i11 = this.f21497b;
            int iCharAt = this.f21496a.charAt(i11);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = a();
            }
            int i12 = this.f21497b;
            while (k(iCharAt)) {
                iCharAt = a();
            }
            if (iCharAt == 40) {
                this.f21497b++;
                return this.f21496a.substring(i11, i12);
            }
            this.f21497b = i11;
            return null;
        }

        com.caverock.androidsvg.g.p p() {
            float fN = n();
            if (Float.isNaN(fN)) {
                return null;
            }
            com.caverock.androidsvg.g.d1 d1VarV = v();
            return d1VarV == null ? new com.caverock.androidsvg.g.p(fN, com.caverock.androidsvg.g.d1.px) : new com.caverock.androidsvg.g.p(fN, d1VarV);
        }

        String q() {
            if (h()) {
                return null;
            }
            int i11 = this.f21497b;
            char cCharAt = this.f21496a.charAt(i11);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iA = a();
            while (iA != -1 && iA != cCharAt) {
                iA = a();
            }
            if (iA == -1) {
                this.f21497b = i11;
                return null;
            }
            int i12 = this.f21497b;
            this.f21497b = i12 + 1;
            return this.f21496a.substring(i11 + 1, i12);
        }

        String r() {
            return t(' ', false);
        }

        String s(char c11) {
            return t(c11, false);
        }

        String t(char c11, boolean z11) {
            if (h()) {
                return null;
            }
            char cCharAt = this.f21496a.charAt(this.f21497b);
            if ((!z11 && k(cCharAt)) || cCharAt == c11) {
                return null;
            }
            int i11 = this.f21497b;
            int iA = a();
            while (iA != -1 && iA != c11 && (z11 || !k(iA))) {
                iA = a();
            }
            return this.f21496a.substring(i11, this.f21497b);
        }

        String u(char c11) {
            return t(c11, true);
        }

        com.caverock.androidsvg.g.d1 v() {
            if (h()) {
                return null;
            }
            if (this.f21496a.charAt(this.f21497b) == '%') {
                this.f21497b++;
                return com.caverock.androidsvg.g.d1.percent;
            }
            int i11 = this.f21497b;
            if (i11 > this.f21498c - 2) {
                return null;
            }
            try {
                com.caverock.androidsvg.g.d1 d1VarValueOf = com.caverock.androidsvg.g.d1.valueOf(this.f21496a.substring(i11, i11 + 2).toLowerCase(Locale.US));
                this.f21497b += 2;
                return d1VarValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        String w() {
            if (h()) {
                return null;
            }
            int i11 = this.f21497b;
            char cCharAt = this.f21496a.charAt(i11);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.f21497b = i11;
                return null;
            }
            int iA = a();
            while (true) {
                if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                    break;
                }
                iA = a();
            }
            return this.f21496a.substring(i11, this.f21497b);
        }

        float x() {
            z();
            float fB = this.f21499d.b(this.f21496a, this.f21497b, this.f21498c);
            if (!Float.isNaN(fB)) {
                this.f21497b = this.f21499d.a();
            }
            return fB;
        }

        String y() {
            if (h()) {
                return null;
            }
            int i11 = this.f21497b;
            this.f21497b = this.f21498c;
            return this.f21496a.substring(i11);
        }

        boolean z() {
            A();
            int i11 = this.f21497b;
            if (i11 == this.f21498c || this.f21496a.charAt(i11) != ',') {
                return false;
            }
            this.f21497b++;
            A();
            return true;
        }
    }

    private class j implements Attributes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private XmlPullParser f21500a;

        public j(XmlPullParser xmlPullParser) {
            this.f21500a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f21500a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i11) {
            return this.f21500a.getAttributeName(i11);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i11) {
            String attributeName = this.f21500a.getAttributeName(i11);
            if (this.f21500a.getAttributePrefix(i11) == null) {
                return attributeName;
            }
            return this.f21500a.getAttributePrefix(i11) + CoreConstants.COLON_CHAR + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i11) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i11) {
            return this.f21500a.getAttributeNamespace(i11);
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
            return this.f21500a.getAttributeValue(i11);
        }
    }

    i() {
    }

    private void A(com.caverock.androidsvg.g.d dVar, Attributes attributes) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            switch (a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()]) {
                case 12:
                    dVar.f21264o = o0(strTrim);
                    break;
                case 13:
                    dVar.f21265p = o0(strTrim);
                    break;
                case 14:
                    com.caverock.androidsvg.g.p pVarO0 = o0(strTrim);
                    dVar.f21266q = pVarO0;
                    if (pVarO0.g()) {
                        throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    private static Set<String> A0(String str) {
        C0428i c0428i = new C0428i(str);
        HashSet hashSet = new HashSet();
        while (!c0428i.h()) {
            hashSet.add(c0428i.r());
            c0428i.A();
        }
        return hashSet;
    }

    private void B(com.caverock.androidsvg.g.e eVar, Attributes attributes) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            if (a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    eVar.f21276p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute clipPathUnits");
                    }
                    eVar.f21276p = Boolean.TRUE;
                }
            }
        }
    }

    private static com.caverock.androidsvg.g.p[] B0(String str) {
        com.caverock.androidsvg.g.p pVarP;
        C0428i c0428i = new C0428i(str);
        c0428i.A();
        if (c0428i.h() || (pVarP = c0428i.p()) == null || pVarP.g()) {
            return null;
        }
        float fA = pVarP.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(pVarP);
        while (!c0428i.h()) {
            c0428i.z();
            com.caverock.androidsvg.g.p pVarP2 = c0428i.p();
            if (pVarP2 == null || pVarP2.g()) {
                return null;
            }
            arrayList.add(pVarP2);
            fA += pVarP2.a();
        }
        if (fA == BitmapDescriptorFactory.HUE_RED) {
            return null;
        }
        return (com.caverock.androidsvg.g.p[]) arrayList.toArray(new com.caverock.androidsvg.g.p[arrayList.size()]);
    }

    private void C(com.caverock.androidsvg.g.g0 g0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            switch (a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()]) {
                case 21:
                    g0Var.g(z0(strTrim));
                    break;
                case 22:
                    g0Var.j(strTrim);
                    break;
                case 23:
                    g0Var.d(F0(strTrim));
                    break;
                case 24:
                    g0Var.i(A0(strTrim));
                    break;
                case 25:
                    List<String> listI0 = i0(strTrim);
                    g0Var.b(listI0 != null ? new HashSet(listI0) : new HashSet(0));
                    break;
            }
        }
    }

    private static com.caverock.androidsvg.g.e0.c C0(String str) {
        if ("butt".equals(str)) {
            return com.caverock.androidsvg.g.e0.c.Butt;
        }
        if ("round".equals(str)) {
            return com.caverock.androidsvg.g.e0.c.Round;
        }
        if ("square".equals(str)) {
            return com.caverock.androidsvg.g.e0.c.Square;
        }
        return null;
    }

    private void D(com.caverock.androidsvg.g.l0 l0Var, Attributes attributes) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String qName = attributes.getQName(i11);
            if (qName.equals("id") || qName.equals("xml:id")) {
                l0Var.f21339c = attributes.getValue(i11).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i11).trim();
                if ("default".equals(strTrim)) {
                    l0Var.f21340d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        l0Var.f21340d = Boolean.TRUE;
                        return;
                    }
                    throw new SVGParseException("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    private static com.caverock.androidsvg.g.e0.d D0(String str) {
        if ("miter".equals(str)) {
            return com.caverock.androidsvg.g.e0.d.Miter;
        }
        if ("round".equals(str)) {
            return com.caverock.androidsvg.g.e0.d.Round;
        }
        if ("bevel".equals(str)) {
            return com.caverock.androidsvg.g.e0.d.Bevel;
        }
        return null;
    }

    private void E(com.caverock.androidsvg.g.i iVar, Attributes attributes) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            switch (a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()]) {
                case 10:
                    com.caverock.androidsvg.g.p pVarO0 = o0(strTrim);
                    iVar.f21325q = pVarO0;
                    if (pVarO0.g()) {
                        throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    com.caverock.androidsvg.g.p pVarO1 = o0(strTrim);
                    iVar.f21326r = pVarO1;
                    if (pVarO1.g()) {
                        throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case 12:
                    iVar.f21323o = o0(strTrim);
                    break;
                case 13:
                    iVar.f21324p = o0(strTrim);
                    break;
            }
        }
    }

    private static void E0(com.caverock.androidsvg.g.l0 l0Var, String str) {
        C0428i c0428i = new C0428i(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strS = c0428i.s(CoreConstants.COLON_CHAR);
            c0428i.A();
            if (!c0428i.f(CoreConstants.COLON_CHAR)) {
                return;
            }
            c0428i.A();
            String strU = c0428i.u(';');
            if (strU == null) {
                return;
            }
            c0428i.A();
            if (c0428i.h() || c0428i.f(';')) {
                if (l0Var.f21342f == null) {
                    l0Var.f21342f = new com.caverock.androidsvg.g.e0();
                }
                S0(l0Var.f21342f, strS, strU);
                c0428i.A();
            }
        }
    }

    private void F(com.caverock.androidsvg.g.j jVar, Attributes attributes) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 6) {
                switch (i12) {
                    case 32:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new SVGParseException("Invalid value for attribute gradientUnits");
                            }
                            jVar.f21333i = Boolean.TRUE;
                        } else {
                            jVar.f21333i = Boolean.FALSE;
                        }
                        break;
                    case 33:
                        jVar.f21334j = J0(strTrim);
                        break;
                    case 34:
                        try {
                            jVar.f21335k = com.caverock.androidsvg.g.k.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new SVGParseException("Invalid spreadMethod attribute. \"" + strTrim + "\" is not a valid value.");
                        }
                        break;
                }
            } else if ("".equals(attributes.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11))) {
                jVar.f21336l = strTrim;
            }
        }
    }

    private static Set<String> F0(String str) {
        C0428i c0428i = new C0428i(str);
        HashSet hashSet = new HashSet();
        while (!c0428i.h()) {
            String strR = c0428i.r();
            int iIndexOf = strR.indexOf(45);
            if (iIndexOf != -1) {
                strR = strR.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strR, "", "").getLanguage());
            c0428i.A();
        }
        return hashSet;
    }

    private void G(com.caverock.androidsvg.g.o oVar, Attributes attributes) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 1) {
                oVar.f21352q = o0(strTrim);
            } else if (i12 == 2) {
                oVar.f21353r = o0(strTrim);
            } else if (i12 == 3) {
                com.caverock.androidsvg.g.p pVarO0 = o0(strTrim);
                oVar.f21354s = pVarO0;
                if (pVarO0.g()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i12 == 4) {
                com.caverock.androidsvg.g.p pVarO1 = o0(strTrim);
                oVar.f21355t = pVarO1;
                if (pVarO1.g()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i12 != 6) {
                if (i12 == 7) {
                    w0(oVar, strTrim);
                }
            } else if ("".equals(attributes.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11))) {
                oVar.f21351p = strTrim;
            }
        }
    }

    private static com.caverock.androidsvg.g.e0.f G0(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return com.caverock.androidsvg.g.e0.f.Middle;
            case "end":
                return com.caverock.androidsvg.g.e0.f.End;
            case "start":
                return com.caverock.androidsvg.g.e0.f.Start;
            default:
                return null;
        }
    }

    private void H(com.caverock.androidsvg.g.q qVar, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            switch (a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()]) {
                case 15:
                    qVar.f21360o = o0(strTrim);
                    break;
                case 16:
                    qVar.f21361p = o0(strTrim);
                    break;
                case 17:
                    qVar.f21362q = o0(strTrim);
                    break;
                case 18:
                    qVar.f21363r = o0(strTrim);
                    break;
            }
        }
    }

    private static com.caverock.androidsvg.g.e0.EnumC0425g H0(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return com.caverock.androidsvg.g.e0.EnumC0425g.LineThrough;
            case "underline":
                return com.caverock.androidsvg.g.e0.EnumC0425g.Underline;
            case "none":
                return com.caverock.androidsvg.g.e0.EnumC0425g.None;
            case "blink":
                return com.caverock.androidsvg.g.e0.EnumC0425g.Blink;
            case "overline":
                return com.caverock.androidsvg.g.e0.EnumC0425g.Overline;
            default:
                return null;
        }
    }

    private void I(com.caverock.androidsvg.g.m0 m0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            switch (a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()]) {
                case 15:
                    m0Var.f21345m = o0(strTrim);
                    break;
                case 16:
                    m0Var.f21346n = o0(strTrim);
                    break;
                case 17:
                    m0Var.f21347o = o0(strTrim);
                    break;
                case 18:
                    m0Var.f21348p = o0(strTrim);
                    break;
            }
        }
    }

    private static com.caverock.androidsvg.g.e0.h I0(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return com.caverock.androidsvg.g.e0.h.LTR;
        }
        if (str.equals("rtl")) {
            return com.caverock.androidsvg.g.e0.h.RTL;
        }
        return null;
    }

    private void J(com.caverock.androidsvg.g.r rVar, Attributes attributes) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            switch (a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()]) {
                case 26:
                    rVar.f21370r = o0(strTrim);
                    break;
                case 27:
                    rVar.f21371s = o0(strTrim);
                    break;
                case 28:
                    com.caverock.androidsvg.g.p pVarO0 = o0(strTrim);
                    rVar.f21372t = pVarO0;
                    if (pVarO0.g()) {
                        throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case 29:
                    com.caverock.androidsvg.g.p pVarO1 = o0(strTrim);
                    rVar.f21373u = pVarO1;
                    if (pVarO1.g()) {
                        throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case 30:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new SVGParseException("Invalid value for attribute markerUnits");
                        }
                        rVar.f21369q = true;
                    } else {
                        rVar.f21369q = false;
                    }
                    break;
                case 31:
                    if (DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(strTrim)) {
                        rVar.f21374v = Float.valueOf(Float.NaN);
                    } else {
                        rVar.f21374v = Float.valueOf(f0(strTrim));
                    }
                    break;
            }
        }
    }

    private Matrix J0(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        C0428i c0428i = new C0428i(str);
        c0428i.A();
        while (!c0428i.h()) {
            String strO = c0428i.o();
            if (strO == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: " + str);
            }
            switch (strO) {
                case "matrix":
                    c0428i.A();
                    float fN = c0428i.n();
                    c0428i.z();
                    float fN2 = c0428i.n();
                    c0428i.z();
                    float fN3 = c0428i.n();
                    c0428i.z();
                    float fN4 = c0428i.n();
                    c0428i.z();
                    float fN5 = c0428i.n();
                    c0428i.z();
                    float fN6 = c0428i.n();
                    c0428i.A();
                    if (Float.isNaN(fN6) || !c0428i.f(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fN, fN3, fN5, fN2, fN4, fN6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    c0428i.A();
                    float fN7 = c0428i.n();
                    float fX = c0428i.x();
                    float fX2 = c0428i.x();
                    c0428i.A();
                    if (Float.isNaN(fN7) || !c0428i.f(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fX)) {
                        matrix.preRotate(fN7);
                    } else {
                        if (Float.isNaN(fX2)) {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                        matrix.preRotate(fN7, fX, fX2);
                    }
                    break;
                    break;
                case "scale":
                    c0428i.A();
                    float fN8 = c0428i.n();
                    float fX3 = c0428i.x();
                    c0428i.A();
                    if (Float.isNaN(fN8) || !c0428i.f(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX3)) {
                        matrix.preScale(fN8, fX3);
                    } else {
                        matrix.preScale(fN8, fN8);
                    }
                    break;
                    break;
                case "skewX":
                    c0428i.A();
                    float fN9 = c0428i.n();
                    c0428i.A();
                    if (Float.isNaN(fN9) || !c0428i.f(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fN9)), BitmapDescriptorFactory.HUE_RED);
                    break;
                    break;
                case "skewY":
                    c0428i.A();
                    float fN10 = c0428i.n();
                    c0428i.A();
                    if (Float.isNaN(fN10) || !c0428i.f(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    matrix.preSkew(BitmapDescriptorFactory.HUE_RED, (float) Math.tan(Math.toRadians(fN10)));
                    break;
                    break;
                case "translate":
                    c0428i.A();
                    float fN11 = c0428i.n();
                    float fX4 = c0428i.x();
                    c0428i.A();
                    if (Float.isNaN(fN11) || !c0428i.f(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX4)) {
                        matrix.preTranslate(fN11, fX4);
                    } else {
                        matrix.preTranslate(fN11, BitmapDescriptorFactory.HUE_RED);
                    }
                    break;
                    break;
                default:
                    throw new SVGParseException("Invalid transform list fn: " + strO + ")");
            }
            if (c0428i.h()) {
                return matrix;
            }
            c0428i.z();
        }
        return matrix;
    }

    private void K(com.caverock.androidsvg.g.s sVar, Attributes attributes) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 1) {
                sVar.f21378q = o0(strTrim);
            } else if (i12 == 2) {
                sVar.f21379r = o0(strTrim);
            } else if (i12 == 3) {
                com.caverock.androidsvg.g.p pVarO0 = o0(strTrim);
                sVar.f21380s = pVarO0;
                if (pVarO0.g()) {
                    throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                }
            } else if (i12 == 4) {
                com.caverock.androidsvg.g.p pVarO1 = o0(strTrim);
                sVar.f21381t = pVarO1;
                if (pVarO1.g()) {
                    throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                }
            } else if (i12 != 43) {
                if (i12 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    sVar.f21377p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute maskContentUnits");
                    }
                    sVar.f21377p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                sVar.f21376o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new SVGParseException("Invalid value for attribute maskUnits");
                }
                sVar.f21376o = Boolean.TRUE;
            }
        }
    }

    private void K0(InputStream inputStream) throws SVGParseException {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e11) {
            throw new SVGParseException("Stream error", e11);
        } catch (ParserConfigurationException e12) {
            throw new SVGParseException("XML parser problem", e12);
        } catch (SAXException e13) {
            throw new SVGParseException("SVG parse error", e13);
        }
    }

    private void L(com.caverock.androidsvg.g.v vVar, Attributes attributes) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 8) {
                vVar.f21386o = u0(strTrim);
            } else if (i12 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(f0(strTrim));
                vVar.f21387p = fValueOf;
                if (fValueOf.floatValue() < BitmapDescriptorFactory.HUE_RED) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void L0(InputStream inputStream, boolean z11) throws SVGParseException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                j jVar = new j(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        W0();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        C0428i c0428i = new C0428i(xmlPullParserNewPullParser.getText());
                        r(c0428i.r(), x0(c0428i));
                    } else if (eventType == 10) {
                        if (z11 && this.f21462a.m() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                K0(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + CoreConstants.COLON_CHAR + name;
                        }
                        X0(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, jVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + CoreConstants.COLON_CHAR + name2;
                        }
                        p(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        e1(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        c1(xmlPullParserNewPullParser.getText());
                    }
                }
                o();
            } catch (IOException e11) {
                throw new SVGParseException("Stream error", e11);
            }
        } catch (XmlPullParserException e12) {
            throw new SVGParseException("XML parser problem", e12);
        }
    }

    private void M(com.caverock.androidsvg.g.y yVar, Attributes attributes) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 1) {
                yVar.f21397t = o0(strTrim);
            } else if (i12 == 2) {
                yVar.f21398u = o0(strTrim);
            } else if (i12 == 3) {
                com.caverock.androidsvg.g.p pVarO0 = o0(strTrim);
                yVar.f21399v = pVarO0;
                if (pVarO0.g()) {
                    throw new SVGParseException("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i12 == 4) {
                com.caverock.androidsvg.g.p pVarO1 = o0(strTrim);
                yVar.f21400w = pVarO1;
                if (pVarO1.g()) {
                    throw new SVGParseException("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i12 != 6) {
                switch (i12) {
                    case 40:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new SVGParseException("Invalid value for attribute patternUnits");
                            }
                            yVar.f21394q = Boolean.TRUE;
                        } else {
                            yVar.f21394q = Boolean.FALSE;
                        }
                        break;
                    case 41:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new SVGParseException("Invalid value for attribute patternContentUnits");
                            }
                            yVar.f21395r = Boolean.TRUE;
                        } else {
                            yVar.f21395r = Boolean.FALSE;
                        }
                        break;
                    case 42:
                        yVar.f21396s = J0(strTrim);
                        break;
                }
            } else if ("".equals(attributes.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11))) {
                yVar.f21401x = strTrim;
            }
        }
    }

    private static com.caverock.androidsvg.g.e0.i M0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return com.caverock.androidsvg.g.e0.i.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return com.caverock.androidsvg.g.e0.i.NonScalingStroke;
        }
        return null;
    }

    private void N(com.caverock.androidsvg.g.z zVar, Attributes attributes, String str) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            if (g.fromString(attributes.getLocalName(i11)) == g.points) {
                C0428i c0428i = new C0428i(attributes.getValue(i11));
                ArrayList arrayList = new ArrayList();
                c0428i.A();
                while (!c0428i.h()) {
                    float fN = c0428i.n();
                    if (Float.isNaN(fN)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    c0428i.z();
                    float fN2 = c0428i.n();
                    if (Float.isNaN(fN2)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    c0428i.z();
                    arrayList.add(Float.valueOf(fN));
                    arrayList.add(Float.valueOf(fN2));
                }
                zVar.f21402o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    zVar.f21402o[i12] = ((Float) it.next()).floatValue();
                    i12++;
                }
            }
        }
    }

    private static com.caverock.androidsvg.g.b N0(String str) throws SVGParseException {
        C0428i c0428i = new C0428i(str);
        c0428i.A();
        float fN = c0428i.n();
        c0428i.z();
        float fN2 = c0428i.n();
        c0428i.z();
        float fN3 = c0428i.n();
        c0428i.z();
        float fN4 = c0428i.n();
        if (Float.isNaN(fN) || Float.isNaN(fN2) || Float.isNaN(fN3) || Float.isNaN(fN4)) {
            throw new SVGParseException("Invalid viewBox definition - should have four numbers");
        }
        if (fN3 < BitmapDescriptorFactory.HUE_RED) {
            throw new SVGParseException("Invalid viewBox. width cannot be negative");
        }
        if (fN4 >= BitmapDescriptorFactory.HUE_RED) {
            return new com.caverock.androidsvg.g.b(fN, fN2, fN3, fN4);
        }
        throw new SVGParseException("Invalid viewBox. height cannot be negative");
    }

    private void O(com.caverock.androidsvg.g.q0 q0Var, Attributes attributes) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 35) {
                q0Var.f21367p = o0(strTrim);
            } else if (i12 != 36) {
                switch (i12) {
                    case 12:
                        q0Var.f21364m = o0(strTrim);
                        break;
                    case 13:
                        q0Var.f21365n = o0(strTrim);
                        break;
                    case 14:
                        com.caverock.androidsvg.g.p pVarO0 = o0(strTrim);
                        q0Var.f21366o = pVarO0;
                        if (pVarO0.g()) {
                            throw new SVGParseException("Invalid <radialGradient> element. r cannot be negative");
                        }
                        break;
                        break;
                }
            } else {
                q0Var.f21368q = o0(strTrim);
            }
        }
    }

    private void O0(Attributes attributes) throws SVGParseException {
        l("<path>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.v vVar = new com.caverock.androidsvg.g.v();
        vVar.f21349a = this.f21462a;
        vVar.f21350b = this.f21463b;
        D(vVar, attributes);
        S(vVar, attributes);
        W(vVar, attributes);
        C(vVar, attributes);
        L(vVar, attributes);
        this.f21463b.h(vVar);
    }

    private void P(com.caverock.androidsvg.g.b0 b0Var, Attributes attributes) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 1) {
                b0Var.f21252o = o0(strTrim);
            } else if (i12 == 2) {
                b0Var.f21253p = o0(strTrim);
            } else if (i12 == 3) {
                com.caverock.androidsvg.g.p pVarO0 = o0(strTrim);
                b0Var.f21254q = pVarO0;
                if (pVarO0.g()) {
                    throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                }
            } else if (i12 == 4) {
                com.caverock.androidsvg.g.p pVarO1 = o0(strTrim);
                b0Var.f21255r = pVarO1;
                if (pVarO1.g()) {
                    throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                }
            } else if (i12 == 10) {
                com.caverock.androidsvg.g.p pVarO2 = o0(strTrim);
                b0Var.f21256s = pVarO2;
                if (pVarO2.g()) {
                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i12 != 11) {
                continue;
            } else {
                com.caverock.androidsvg.g.p pVarO3 = o0(strTrim);
                b0Var.f21257t = pVarO3;
                if (pVarO3.g()) {
                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    private void P0(Attributes attributes) throws SVGParseException {
        l("<pattern>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.y yVar = new com.caverock.androidsvg.g.y();
        yVar.f21349a = this.f21462a;
        yVar.f21350b = this.f21463b;
        D(yVar, attributes);
        S(yVar, attributes);
        C(yVar, attributes);
        Y(yVar, attributes);
        M(yVar, attributes);
        this.f21463b.h(yVar);
        this.f21463b = yVar;
    }

    private void Q(com.caverock.androidsvg.g.f0 f0Var, Attributes attributes) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 1) {
                f0Var.f21311q = o0(strTrim);
            } else if (i12 == 2) {
                f0Var.f21312r = o0(strTrim);
            } else if (i12 == 3) {
                com.caverock.androidsvg.g.p pVarO0 = o0(strTrim);
                f0Var.f21313s = pVarO0;
                if (pVarO0.g()) {
                    throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                }
            } else if (i12 == 4) {
                com.caverock.androidsvg.g.p pVarO1 = o0(strTrim);
                f0Var.f21314t = pVarO1;
                if (pVarO1.g()) {
                    throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                }
            } else if (i12 == 5) {
                f0Var.f21315u = strTrim;
            }
        }
    }

    private void Q0(Attributes attributes) throws SVGParseException {
        l("<polygon>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.z a0Var = new com.caverock.androidsvg.g.a0();
        a0Var.f21349a = this.f21462a;
        a0Var.f21350b = this.f21463b;
        D(a0Var, attributes);
        S(a0Var, attributes);
        W(a0Var, attributes);
        C(a0Var, attributes);
        N(a0Var, attributes, "polygon");
        this.f21463b.h(a0Var);
    }

    private void R(com.caverock.androidsvg.g.d0 d0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            if (a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()] == 37) {
                d0Var.f21267h = n0(strTrim);
            }
        }
    }

    private void R0(Attributes attributes) throws SVGParseException {
        l("<polyline>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.z zVar = new com.caverock.androidsvg.g.z();
        zVar.f21349a = this.f21462a;
        zVar.f21350b = this.f21463b;
        D(zVar, attributes);
        S(zVar, attributes);
        W(zVar, attributes);
        C(zVar, attributes);
        N(zVar, attributes, "polyline");
        this.f21463b.h(zVar);
    }

    private void S(com.caverock.androidsvg.g.l0 l0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            if (strTrim.length() != 0) {
                int i12 = a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()];
                if (i12 == 45) {
                    E0(l0Var, strTrim);
                } else if (i12 != 46) {
                    if (l0Var.f21341e == null) {
                        l0Var.f21341e = new com.caverock.androidsvg.g.e0();
                    }
                    S0(l0Var.f21341e, attributes.getLocalName(i11), attributes.getValue(i11).trim());
                } else {
                    l0Var.f21343g = com.caverock.androidsvg.b.f(strTrim);
                }
            }
        }
    }

    static void S0(com.caverock.androidsvg.g.e0 e0Var, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.f21472b[g.fromString(str).ordinal()]) {
                case 47:
                    com.caverock.androidsvg.g.o0 o0VarT0 = t0(str2);
                    e0Var.f21278b = o0VarT0;
                    if (o0VarT0 != null) {
                        e0Var.f21277a |= 1;
                    }
                    break;
                case 48:
                    com.caverock.androidsvg.g.e0.a aVarE0 = e0(str2);
                    e0Var.f21279c = aVarE0;
                    if (aVarE0 != null) {
                        e0Var.f21277a |= 2;
                    }
                    break;
                case 49:
                    Float fR0 = r0(str2);
                    e0Var.f21280d = fR0;
                    if (fR0 != null) {
                        e0Var.f21277a |= 4;
                    }
                    break;
                case 50:
                    com.caverock.androidsvg.g.o0 o0VarT1 = t0(str2);
                    e0Var.f21281e = o0VarT1;
                    if (o0VarT1 != null) {
                        e0Var.f21277a |= 8;
                    }
                    break;
                case 51:
                    Float fR1 = r0(str2);
                    e0Var.f21282f = fR1;
                    if (fR1 != null) {
                        e0Var.f21277a |= 16;
                    }
                    break;
                case 52:
                    e0Var.f21283g = o0(str2);
                    e0Var.f21277a |= 32;
                    break;
                case 53:
                    com.caverock.androidsvg.g.e0.c cVarC0 = C0(str2);
                    e0Var.f21284h = cVarC0;
                    if (cVarC0 != null) {
                        e0Var.f21277a |= 64;
                    }
                    break;
                case 54:
                    com.caverock.androidsvg.g.e0.d dVarD0 = D0(str2);
                    e0Var.f21285i = dVarD0;
                    if (dVarD0 != null) {
                        e0Var.f21277a |= 128;
                    }
                    break;
                case 55:
                    e0Var.f21286j = Float.valueOf(f0(str2));
                    e0Var.f21277a |= 256;
                    break;
                case 56:
                    if (!"none".equals(str2)) {
                        com.caverock.androidsvg.g.p[] pVarArrB0 = B0(str2);
                        e0Var.f21287k = pVarArrB0;
                        if (pVarArrB0 != null) {
                            e0Var.f21277a |= 512;
                        }
                    } else {
                        e0Var.f21287k = null;
                        e0Var.f21277a |= 512;
                    }
                    break;
                case 57:
                    e0Var.f21288l = o0(str2);
                    e0Var.f21277a |= 1024;
                    break;
                case 58:
                    e0Var.f21289m = r0(str2);
                    e0Var.f21277a |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                    break;
                case 59:
                    e0Var.f21290n = b0(str2);
                    e0Var.f21277a |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                    break;
                case 60:
                    h0(e0Var, str2);
                    break;
                case 61:
                    List<String> listI0 = i0(str2);
                    e0Var.f21291o = listI0;
                    if (listI0 != null) {
                        e0Var.f21277a |= FileAppender.DEFAULT_BUFFER_SIZE;
                    }
                    break;
                case 62:
                    com.caverock.androidsvg.g.p pVarJ0 = j0(str2);
                    e0Var.f21292p = pVarJ0;
                    if (pVarJ0 != null) {
                        e0Var.f21277a |= Http2Stream.EMIT_BUFFER_SIZE;
                    }
                    break;
                case 63:
                    Integer numL0 = l0(str2);
                    e0Var.f21293q = numL0;
                    if (numL0 != null) {
                        e0Var.f21277a |= 32768;
                    }
                    break;
                case 64:
                    com.caverock.androidsvg.g.e0.b bVarK0 = k0(str2);
                    e0Var.f21294r = bVarK0;
                    if (bVarK0 != null) {
                        e0Var.f21277a |= 65536;
                    }
                    break;
                case 65:
                    com.caverock.androidsvg.g.e0.EnumC0425g enumC0425gH0 = H0(str2);
                    e0Var.f21295s = enumC0425gH0;
                    if (enumC0425gH0 != null) {
                        e0Var.f21277a |= 131072;
                    }
                    break;
                case 66:
                    com.caverock.androidsvg.g.e0.h hVarI0 = I0(str2);
                    e0Var.f21296t = hVarI0;
                    if (hVarI0 != null) {
                        e0Var.f21277a |= 68719476736L;
                    }
                    break;
                case 67:
                    com.caverock.androidsvg.g.e0.f fVarG0 = G0(str2);
                    e0Var.f21297u = fVarG0;
                    if (fVarG0 != null) {
                        e0Var.f21277a |= 262144;
                    }
                    break;
                case 68:
                    Boolean boolS0 = s0(str2);
                    e0Var.f21298v = boolS0;
                    if (boolS0 != null) {
                        e0Var.f21277a |= 524288;
                    }
                    break;
                case 69:
                    String strM0 = m0(str2, str);
                    e0Var.f21300x = strM0;
                    e0Var.f21301y = strM0;
                    e0Var.f21302z = strM0;
                    e0Var.f21277a |= 14680064;
                    break;
                case 70:
                    e0Var.f21300x = m0(str2, str);
                    e0Var.f21277a |= 2097152;
                    break;
                case 71:
                    e0Var.f21301y = m0(str2, str);
                    e0Var.f21277a |= 4194304;
                    break;
                case 72:
                    e0Var.f21302z = m0(str2, str);
                    e0Var.f21277a |= 8388608;
                    break;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            e0Var.A = Boolean.valueOf(!str2.equals("none"));
                            e0Var.f21277a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            e0Var.B = Boolean.valueOf(str2.equals("visible"));
                            e0Var.f21277a |= 33554432;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals("currentColor")) {
                        e0Var.C = com.caverock.androidsvg.g.C0426g.a();
                    } else {
                        try {
                            e0Var.C = b0(str2);
                        } catch (SVGParseException e11) {
                            Log.w("SVGParser", e11.getMessage());
                            return;
                        }
                    }
                    e0Var.f21277a |= 67108864;
                    break;
                case 76:
                    e0Var.D = r0(str2);
                    e0Var.f21277a |= 134217728;
                    break;
                case 77:
                    com.caverock.androidsvg.g.c cVarA0 = a0(str2);
                    e0Var.f21299w = cVarA0;
                    if (cVarA0 != null) {
                        e0Var.f21277a |= 1048576;
                    }
                    break;
                case 78:
                    e0Var.E = m0(str2, str);
                    e0Var.f21277a |= 268435456;
                    break;
                case 79:
                    e0Var.F = e0(str2);
                    e0Var.f21277a |= 536870912;
                    break;
                case 80:
                    e0Var.G = m0(str2, str);
                    e0Var.f21277a |= FileSize.GB_COEFFICIENT;
                    break;
                case 81:
                    if (str2.equals("currentColor")) {
                        e0Var.H = com.caverock.androidsvg.g.C0426g.a();
                    } else {
                        try {
                            e0Var.H = b0(str2);
                        } catch (SVGParseException e12) {
                            Log.w("SVGParser", e12.getMessage());
                            return;
                        }
                    }
                    e0Var.f21277a |= 2147483648L;
                    break;
                case 82:
                    e0Var.I = r0(str2);
                    e0Var.f21277a |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals("currentColor")) {
                        e0Var.J = com.caverock.androidsvg.g.C0426g.a();
                    } else {
                        try {
                            e0Var.J = b0(str2);
                        } catch (SVGParseException e13) {
                            Log.w("SVGParser", e13.getMessage());
                            return;
                        }
                    }
                    e0Var.f21277a |= 8589934592L;
                    break;
                case 84:
                    e0Var.K = r0(str2);
                    e0Var.f21277a |= 17179869184L;
                    break;
                case 85:
                    com.caverock.androidsvg.g.e0.i iVarM0 = M0(str2);
                    e0Var.L = iVarM0;
                    if (iVarM0 != null) {
                        e0Var.f21277a |= 34359738368L;
                    }
                    break;
                case 86:
                    com.caverock.androidsvg.g.e0.e eVarY0 = y0(str2);
                    e0Var.M = eVarY0;
                    if (eVarY0 != null) {
                        e0Var.f21277a |= 137438953472L;
                    }
                    break;
            }
        } catch (SVGParseException unused) {
        }
    }

    private void T(com.caverock.androidsvg.g.u0 u0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            if (a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()] == 6 && ("".equals(attributes.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11)))) {
                u0Var.f21384o = strTrim;
            }
        }
    }

    private void T0(Attributes attributes) throws SVGParseException {
        l("<radialGradient>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.q0 q0Var = new com.caverock.androidsvg.g.q0();
        q0Var.f21349a = this.f21462a;
        q0Var.f21350b = this.f21463b;
        D(q0Var, attributes);
        S(q0Var, attributes);
        F(q0Var, attributes);
        O(q0Var, attributes);
        this.f21463b.h(q0Var);
        this.f21463b = q0Var;
    }

    private void U(com.caverock.androidsvg.g.z0 z0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 6) {
                if (i12 == 39) {
                    z0Var.f21404p = o0(strTrim);
                }
            } else if ("".equals(attributes.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11))) {
                z0Var.f21403o = strTrim;
            }
        }
    }

    private void U0(Attributes attributes) throws SVGParseException {
        l("<rect>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.b0 b0Var = new com.caverock.androidsvg.g.b0();
        b0Var.f21349a = this.f21462a;
        b0Var.f21350b = this.f21463b;
        D(b0Var, attributes);
        S(b0Var, attributes);
        W(b0Var, attributes);
        C(b0Var, attributes);
        P(b0Var, attributes);
        this.f21463b.h(b0Var);
    }

    private void V(com.caverock.androidsvg.g.a1 a1Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 1) {
                a1Var.f21244o = p0(strTrim);
            } else if (i12 == 2) {
                a1Var.f21245p = p0(strTrim);
            } else if (i12 == 19) {
                a1Var.f21246q = p0(strTrim);
            } else if (i12 == 20) {
                a1Var.f21247r = p0(strTrim);
            }
        }
    }

    private void V0(Attributes attributes) throws SVGParseException {
        l("<solidColor>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.c0 c0Var = new com.caverock.androidsvg.g.c0();
        c0Var.f21349a = this.f21462a;
        c0Var.f21350b = this.f21463b;
        D(c0Var, attributes);
        S(c0Var, attributes);
        this.f21463b.h(c0Var);
        this.f21463b = c0Var;
    }

    private void W(com.caverock.androidsvg.g.n nVar, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            if (g.fromString(attributes.getLocalName(i11)) == g.transform) {
                nVar.k(J0(attributes.getValue(i11)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        this.f21462a = new com.caverock.androidsvg.g();
    }

    private void X(com.caverock.androidsvg.g.e1 e1Var, Attributes attributes) throws SVGParseException {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 1) {
                e1Var.f21304q = o0(strTrim);
            } else if (i12 == 2) {
                e1Var.f21305r = o0(strTrim);
            } else if (i12 == 3) {
                com.caverock.androidsvg.g.p pVarO0 = o0(strTrim);
                e1Var.f21306s = pVarO0;
                if (pVarO0.g()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i12 == 4) {
                com.caverock.androidsvg.g.p pVarO1 = o0(strTrim);
                e1Var.f21307t = pVarO1;
                if (pVarO1.g()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i12 == 6 && ("".equals(attributes.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11)))) {
                e1Var.f21303p = strTrim;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        if (this.f21464c) {
            this.f21465d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h hVarFromString = h.fromString(str2);
            switch (a.f21471a[hVarFromString.ordinal()]) {
                case 1:
                    a1(attributes);
                    break;
                case 2:
                case 3:
                    q(attributes);
                    break;
                case 4:
                    m(attributes);
                    break;
                case 5:
                    i1(attributes);
                    break;
                case 6:
                    O0(attributes);
                    break;
                case 7:
                    U0(attributes);
                    break;
                case 8:
                    i(attributes);
                    break;
                case 9:
                    n(attributes);
                    break;
                case 10:
                    v(attributes);
                    break;
                case 11:
                    R0(attributes);
                    break;
                case 12:
                    Q0(attributes);
                    break;
                case 13:
                    d1(attributes);
                    break;
                case 14:
                    h1(attributes);
                    break;
                case 15:
                    g1(attributes);
                    break;
                case 16:
                    k1(attributes);
                    break;
                case 17:
                    b1(attributes);
                    break;
                case 18:
                    x(attributes);
                    break;
                case 19:
                    w(attributes);
                    break;
                case 20:
                    T0(attributes);
                    break;
                case 21:
                    Y0(attributes);
                    break;
                case 22:
                case 23:
                    this.f21466e = true;
                    this.f21467f = hVarFromString;
                    break;
                case 24:
                    k(attributes);
                    break;
                case 25:
                    f1(attributes);
                    break;
                case 26:
                    P0(attributes);
                    break;
                case 27:
                    u(attributes);
                    break;
                case 28:
                    j1(attributes);
                    break;
                case 29:
                    y(attributes);
                    break;
                case 30:
                    Z0(attributes);
                    break;
                case 31:
                    V0(attributes);
                    break;
                default:
                    this.f21464c = true;
                    this.f21465d = 1;
                    break;
            }
        }
    }

    private void Y(com.caverock.androidsvg.g.r0 r0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 7) {
                w0(r0Var, strTrim);
            } else if (i12 == 87) {
                r0Var.f21375p = N0(strTrim);
            }
        }
    }

    private void Y0(Attributes attributes) throws SVGParseException {
        l("<stop>", new Object[0]);
        com.caverock.androidsvg.g.j0 j0Var = this.f21463b;
        if (j0Var == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof com.caverock.androidsvg.g.j)) {
            throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        com.caverock.androidsvg.g.d0 d0Var = new com.caverock.androidsvg.g.d0();
        d0Var.f21349a = this.f21462a;
        d0Var.f21350b = this.f21463b;
        D(d0Var, attributes);
        S(d0Var, attributes);
        R(d0Var, attributes);
        this.f21463b.h(d0Var);
        this.f21463b = d0Var;
    }

    private void Z(String str) {
        this.f21462a.a(new com.caverock.androidsvg.b(com.caverock.androidsvg.b.f.screen, com.caverock.androidsvg.b.u.Document).d(str));
    }

    private void Z0(Attributes attributes) throws SVGParseException {
        l("<style>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String strTrim = attributes.getValue(i11).trim();
            int i12 = a.f21472b[g.fromString(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 88) {
                zEquals = strTrim.equals("text/css");
            } else if (i12 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && com.caverock.androidsvg.b.b(str, com.caverock.androidsvg.b.f.screen)) {
            this.f21469h = true;
        } else {
            this.f21464c = true;
            this.f21465d = 1;
        }
    }

    private static com.caverock.androidsvg.g.c a0(String str) {
        if (DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        C0428i c0428i = new C0428i(str.substring(5));
        c0428i.A();
        com.caverock.androidsvg.g.p pVarQ0 = q0(c0428i);
        c0428i.z();
        com.caverock.androidsvg.g.p pVarQ1 = q0(c0428i);
        c0428i.z();
        com.caverock.androidsvg.g.p pVarQ2 = q0(c0428i);
        c0428i.z();
        com.caverock.androidsvg.g.p pVarQ3 = q0(c0428i);
        c0428i.A();
        if (c0428i.f(CoreConstants.RIGHT_PARENTHESIS_CHAR) || c0428i.h()) {
            return new com.caverock.androidsvg.g.c(pVarQ0, pVarQ1, pVarQ2, pVarQ3);
        }
        return null;
    }

    private void a1(Attributes attributes) throws SVGParseException {
        l("<svg>", new Object[0]);
        com.caverock.androidsvg.g.f0 f0Var = new com.caverock.androidsvg.g.f0();
        f0Var.f21349a = this.f21462a;
        f0Var.f21350b = this.f21463b;
        D(f0Var, attributes);
        S(f0Var, attributes);
        C(f0Var, attributes);
        Y(f0Var, attributes);
        Q(f0Var, attributes);
        com.caverock.androidsvg.g.j0 j0Var = this.f21463b;
        if (j0Var == null) {
            this.f21462a.u(f0Var);
        } else {
            j0Var.h(f0Var);
        }
        this.f21463b = f0Var;
    }

    private static com.caverock.androidsvg.g.f b0(String str) throws SVGParseException {
        if (str.charAt(0) == '#') {
            com.caverock.androidsvg.c cVarB = com.caverock.androidsvg.c.b(str, 1, str.length());
            if (cVarB == null) {
                throw new SVGParseException("Bad hex colour value: " + str);
            }
            int iA = cVarB.a();
            if (iA == 4) {
                int iD = cVarB.d();
                int i11 = iD & 3840;
                int i12 = iD & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                int i13 = iD & 15;
                return new com.caverock.androidsvg.g.f(i13 | (i11 << 8) | (-16777216) | (i11 << 12) | (i12 << 8) | (i12 << 4) | (i13 << 4));
            }
            if (iA == 5) {
                int iD2 = cVarB.d();
                int i14 = 61440 & iD2;
                int i15 = iD2 & 3840;
                int i16 = iD2 & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                int i17 = iD2 & 15;
                return new com.caverock.androidsvg.g.f((i17 << 24) | (i17 << 28) | (i14 << 8) | (i14 << 4) | (i15 << 4) | i15 | i16 | (i16 >> 4));
            }
            if (iA == 7) {
                return new com.caverock.androidsvg.g.f(cVarB.d() | (-16777216));
            }
            if (iA == 9) {
                return new com.caverock.androidsvg.g.f((cVarB.d() >>> 8) | (cVarB.d() << 24));
            }
            throw new SVGParseException("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
                return c0(lowerCase);
            }
            C0428i c0428i = new C0428i(str.substring(zStartsWith2 ? 5 : 4));
            c0428i.A();
            float fN = c0428i.n();
            float fD = c0428i.d(fN);
            if (!Float.isNaN(fD)) {
                c0428i.f(CoreConstants.PERCENT_CHAR);
            }
            float fD2 = c0428i.d(fD);
            if (!Float.isNaN(fD2)) {
                c0428i.f(CoreConstants.PERCENT_CHAR);
            }
            if (!zStartsWith2) {
                c0428i.A();
                if (!Float.isNaN(fD2) && c0428i.f(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                    return new com.caverock.androidsvg.g.f(s(fN, fD, fD2) | (-16777216));
                }
                throw new SVGParseException("Bad hsl() colour value: " + str);
            }
            float fD3 = c0428i.d(fD2);
            c0428i.A();
            if (!Float.isNaN(fD3) && c0428i.f(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                return new com.caverock.androidsvg.g.f((j(fD3 * 256.0f) << 24) | s(fN, fD, fD2));
            }
            throw new SVGParseException("Bad hsla() colour value: " + str);
        }
        C0428i c0428i2 = new C0428i(str.substring(zStartsWith ? 5 : 4));
        c0428i2.A();
        float fN2 = c0428i2.n();
        if (!Float.isNaN(fN2) && c0428i2.f(CoreConstants.PERCENT_CHAR)) {
            fN2 = (fN2 * 256.0f) / 100.0f;
        }
        float fD4 = c0428i2.d(fN2);
        if (!Float.isNaN(fD4) && c0428i2.f(CoreConstants.PERCENT_CHAR)) {
            fD4 = (fD4 * 256.0f) / 100.0f;
        }
        float fD5 = c0428i2.d(fD4);
        if (!Float.isNaN(fD5) && c0428i2.f(CoreConstants.PERCENT_CHAR)) {
            fD5 = (fD5 * 256.0f) / 100.0f;
        }
        if (!zStartsWith) {
            c0428i2.A();
            if (!Float.isNaN(fD5) && c0428i2.f(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                return new com.caverock.androidsvg.g.f((j(fN2) << 16) | (-16777216) | (j(fD4) << 8) | j(fD5));
            }
            throw new SVGParseException("Bad rgb() colour value: " + str);
        }
        float fD6 = c0428i2.d(fD5);
        c0428i2.A();
        if (!Float.isNaN(fD6) && c0428i2.f(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
            return new com.caverock.androidsvg.g.f((j(fD6 * 256.0f) << 24) | (j(fN2) << 16) | (j(fD4) << 8) | j(fD5));
        }
        throw new SVGParseException("Bad rgba() colour value: " + str);
    }

    private void b1(Attributes attributes) throws SVGParseException {
        l("<symbol>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.r0 t0Var = new com.caverock.androidsvg.g.t0();
        t0Var.f21349a = this.f21462a;
        t0Var.f21350b = this.f21463b;
        D(t0Var, attributes);
        S(t0Var, attributes);
        C(t0Var, attributes);
        Y(t0Var, attributes);
        this.f21463b.h(t0Var);
        this.f21463b = t0Var;
    }

    private static com.caverock.androidsvg.g.f c0(String str) throws SVGParseException {
        Integer numA = c.a(str);
        if (numA != null) {
            return new com.caverock.androidsvg.g.f(numA.intValue());
        }
        throw new SVGParseException("Invalid colour keyword: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(String str) {
        if (this.f21464c) {
            return;
        }
        if (this.f21466e) {
            if (this.f21468g == null) {
                this.f21468g = new StringBuilder(str.length());
            }
            this.f21468g.append(str);
        } else if (this.f21469h) {
            if (this.f21470i == null) {
                this.f21470i = new StringBuilder(str.length());
            }
            this.f21470i.append(str);
        } else if (this.f21463b instanceof com.caverock.androidsvg.g.y0) {
            h(str);
        }
    }

    private static com.caverock.androidsvg.g.o0 d0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return com.caverock.androidsvg.g.f.f21309c;
        }
        if (str.equals("currentColor")) {
            return com.caverock.androidsvg.g.C0426g.a();
        }
        try {
            return b0(str);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    private void d1(Attributes attributes) throws SVGParseException {
        l("<text>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.w0 w0Var = new com.caverock.androidsvg.g.w0();
        w0Var.f21349a = this.f21462a;
        w0Var.f21350b = this.f21463b;
        D(w0Var, attributes);
        S(w0Var, attributes);
        W(w0Var, attributes);
        C(w0Var, attributes);
        V(w0Var, attributes);
        this.f21463b.h(w0Var);
        this.f21463b = w0Var;
    }

    private static com.caverock.androidsvg.g.e0.a e0(String str) {
        if ("nonzero".equals(str)) {
            return com.caverock.androidsvg.g.e0.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return com.caverock.androidsvg.g.e0.a.EvenOdd;
        }
        return null;
    }

    private void e1(char[] cArr, int i11, int i12) {
        if (this.f21464c) {
            return;
        }
        if (this.f21466e) {
            if (this.f21468g == null) {
                this.f21468g = new StringBuilder(i12);
            }
            this.f21468g.append(cArr, i11, i12);
        } else if (this.f21469h) {
            if (this.f21470i == null) {
                this.f21470i = new StringBuilder(i12);
            }
            this.f21470i.append(cArr, i11, i12);
        } else if (this.f21463b instanceof com.caverock.androidsvg.g.y0) {
            h(new String(cArr, i11, i12));
        }
    }

    private static float f0(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return g0(str, 0, length);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    private void f1(Attributes attributes) throws SVGParseException {
        l("<textPath>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.z0 z0Var = new com.caverock.androidsvg.g.z0();
        z0Var.f21349a = this.f21462a;
        z0Var.f21350b = this.f21463b;
        D(z0Var, attributes);
        S(z0Var, attributes);
        C(z0Var, attributes);
        U(z0Var, attributes);
        this.f21463b.h(z0Var);
        this.f21463b = z0Var;
        com.caverock.androidsvg.g.j0 j0Var = z0Var.f21350b;
        if (j0Var instanceof com.caverock.androidsvg.g.b1) {
            z0Var.n((com.caverock.androidsvg.g.b1) j0Var);
        } else {
            z0Var.n(((com.caverock.androidsvg.g.x0) j0Var).c());
        }
    }

    private static float g0(String str, int i11, int i12) throws SVGParseException {
        float fB = new com.caverock.androidsvg.d().b(str, i11, i12);
        if (!Float.isNaN(fB)) {
            return fB;
        }
        throw new SVGParseException("Invalid float value: " + str);
    }

    private void g1(Attributes attributes) throws SVGParseException {
        l("<tref>", new Object[0]);
        com.caverock.androidsvg.g.j0 j0Var = this.f21463b;
        if (j0Var == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof com.caverock.androidsvg.g.y0)) {
            throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        com.caverock.androidsvg.g.u0 u0Var = new com.caverock.androidsvg.g.u0();
        u0Var.f21349a = this.f21462a;
        u0Var.f21350b = this.f21463b;
        D(u0Var, attributes);
        S(u0Var, attributes);
        C(u0Var, attributes);
        T(u0Var, attributes);
        this.f21463b.h(u0Var);
        com.caverock.androidsvg.g.j0 j0Var2 = u0Var.f21350b;
        if (j0Var2 instanceof com.caverock.androidsvg.g.b1) {
            u0Var.n((com.caverock.androidsvg.g.b1) j0Var2);
        } else {
            u0Var.n(((com.caverock.androidsvg.g.x0) j0Var2).c());
        }
    }

    private void h(String str) {
        com.caverock.androidsvg.g.h0 h0Var = (com.caverock.androidsvg.g.h0) this.f21463b;
        int size = h0Var.f21317i.size();
        com.caverock.androidsvg.g.n0 n0Var = size == 0 ? null : h0Var.f21317i.get(size - 1);
        if (!(n0Var instanceof com.caverock.androidsvg.g.c1)) {
            this.f21463b.h(new com.caverock.androidsvg.g.c1(str));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        com.caverock.androidsvg.g.c1 c1Var = (com.caverock.androidsvg.g.c1) n0Var;
        sb2.append(c1Var.f21262c);
        sb2.append(str);
        c1Var.f21262c = sb2.toString();
    }

    private static void h0(com.caverock.androidsvg.g.e0 e0Var, String str) {
        String strS;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            C0428i c0428i = new C0428i(str);
            Integer numA = null;
            com.caverock.androidsvg.g.e0.b bVarK0 = null;
            String str2 = null;
            while (true) {
                strS = c0428i.s('/');
                c0428i.A();
                if (strS != null) {
                    if (numA != null && bVarK0 != null) {
                        break;
                    }
                    if (!strS.equals("normal") && (numA != null || (numA = e.a(strS)) == null)) {
                        if (bVarK0 != null || (bVarK0 = k0(strS)) == null) {
                            if (str2 != null || !strS.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strS;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            com.caverock.androidsvg.g.p pVarJ0 = j0(strS);
            if (c0428i.f('/')) {
                c0428i.A();
                String strR = c0428i.r();
                if (strR != null) {
                    try {
                        o0(strR);
                    } catch (SVGParseException unused) {
                        return;
                    }
                }
                c0428i.A();
            }
            e0Var.f21291o = i0(c0428i.y());
            e0Var.f21292p = pVarJ0;
            e0Var.f21293q = Integer.valueOf(numA == null ? 400 : numA.intValue());
            if (bVarK0 == null) {
                bVarK0 = com.caverock.androidsvg.g.e0.b.Normal;
            }
            e0Var.f21294r = bVarK0;
            e0Var.f21277a |= 122880;
        }
    }

    private void h1(Attributes attributes) throws SVGParseException {
        l("<tspan>", new Object[0]);
        com.caverock.androidsvg.g.j0 j0Var = this.f21463b;
        if (j0Var == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(j0Var instanceof com.caverock.androidsvg.g.y0)) {
            throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        com.caverock.androidsvg.g.v0 v0Var = new com.caverock.androidsvg.g.v0();
        v0Var.f21349a = this.f21462a;
        v0Var.f21350b = this.f21463b;
        D(v0Var, attributes);
        S(v0Var, attributes);
        C(v0Var, attributes);
        V(v0Var, attributes);
        this.f21463b.h(v0Var);
        this.f21463b = v0Var;
        com.caverock.androidsvg.g.j0 j0Var2 = v0Var.f21350b;
        if (j0Var2 instanceof com.caverock.androidsvg.g.b1) {
            v0Var.n((com.caverock.androidsvg.g.b1) j0Var2);
        } else {
            v0Var.n(((com.caverock.androidsvg.g.x0) j0Var2).c());
        }
    }

    private void i(Attributes attributes) throws SVGParseException {
        l("<circle>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.d dVar = new com.caverock.androidsvg.g.d();
        dVar.f21349a = this.f21462a;
        dVar.f21350b = this.f21463b;
        D(dVar, attributes);
        S(dVar, attributes);
        W(dVar, attributes);
        C(dVar, attributes);
        A(dVar, attributes);
        this.f21463b.h(dVar);
    }

    private static List<String> i0(String str) {
        C0428i c0428i = new C0428i(str);
        ArrayList arrayList = null;
        do {
            String strQ = c0428i.q();
            if (strQ == null) {
                strQ = c0428i.u(CoreConstants.COMMA_CHAR);
            }
            if (strQ == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strQ);
            c0428i.z();
        } while (!c0428i.h());
        return arrayList;
    }

    private void i1(Attributes attributes) throws SVGParseException {
        l("<use>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.e1 e1Var = new com.caverock.androidsvg.g.e1();
        e1Var.f21349a = this.f21462a;
        e1Var.f21350b = this.f21463b;
        D(e1Var, attributes);
        S(e1Var, attributes);
        W(e1Var, attributes);
        C(e1Var, attributes);
        X(e1Var, attributes);
        this.f21463b.h(e1Var);
        this.f21463b = e1Var;
    }

    private static int j(float f11) {
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        if (f11 > 255.0f) {
            return 255;
        }
        return Math.round(f11);
    }

    private static com.caverock.androidsvg.g.p j0(String str) {
        try {
            com.caverock.androidsvg.g.p pVarA = d.a(str);
            return pVarA == null ? o0(str) : pVarA;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    private void j1(Attributes attributes) throws SVGParseException {
        l("<view>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.r0 f1Var = new com.caverock.androidsvg.g.f1();
        f1Var.f21349a = this.f21462a;
        f1Var.f21350b = this.f21463b;
        D(f1Var, attributes);
        C(f1Var, attributes);
        Y(f1Var, attributes);
        this.f21463b.h(f1Var);
        this.f21463b = f1Var;
    }

    private void k(Attributes attributes) throws SVGParseException {
        l("<clipPath>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.e eVar = new com.caverock.androidsvg.g.e();
        eVar.f21349a = this.f21462a;
        eVar.f21350b = this.f21463b;
        D(eVar, attributes);
        S(eVar, attributes);
        W(eVar, attributes);
        C(eVar, attributes);
        B(eVar, attributes);
        this.f21463b.h(eVar);
        this.f21463b = eVar;
    }

    private static com.caverock.androidsvg.g.e0.b k0(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return com.caverock.androidsvg.g.e0.b.Oblique;
            case "italic":
                return com.caverock.androidsvg.g.e0.b.Italic;
            case "normal":
                return com.caverock.androidsvg.g.e0.b.Normal;
            default:
                return null;
        }
    }

    private void k1(Attributes attributes) throws SVGParseException {
        l("<switch>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.s0 s0Var = new com.caverock.androidsvg.g.s0();
        s0Var.f21349a = this.f21462a;
        s0Var.f21350b = this.f21463b;
        D(s0Var, attributes);
        S(s0Var, attributes);
        W(s0Var, attributes);
        C(s0Var, attributes);
        this.f21463b.h(s0Var);
        this.f21463b = s0Var;
    }

    private void l(String str, Object... objArr) {
    }

    private static Integer l0(String str) {
        return e.a(str);
    }

    private void m(Attributes attributes) throws SVGParseException {
        l("<defs>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.h hVar = new com.caverock.androidsvg.g.h();
        hVar.f21349a = this.f21462a;
        hVar.f21350b = this.f21463b;
        D(hVar, attributes);
        S(hVar, attributes);
        W(hVar, attributes);
        this.f21463b.h(hVar);
        this.f21463b = hVar;
    }

    private static String m0(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    private void n(Attributes attributes) throws SVGParseException {
        l("<ellipse>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.i iVar = new com.caverock.androidsvg.g.i();
        iVar.f21349a = this.f21462a;
        iVar.f21350b = this.f21463b;
        D(iVar, attributes);
        S(iVar, attributes);
        W(iVar, attributes);
        C(iVar, attributes);
        E(iVar, attributes);
        this.f21463b.h(iVar);
    }

    private Float n0(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z11 = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z11 = false;
        }
        try {
            float fG0 = g0(str, 0, length);
            float f11 = 100.0f;
            if (z11) {
                fG0 /= 100.0f;
            }
            if (fG0 < BitmapDescriptorFactory.HUE_RED) {
                f11 = 0.0f;
            } else if (fG0 <= 100.0f) {
                f11 = fG0;
            }
            return Float.valueOf(f11);
        } catch (NumberFormatException e11) {
            throw new SVGParseException("Invalid offset value in <stop>: " + str, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
    }

    static com.caverock.androidsvg.g.p o0(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length value (empty string)");
        }
        int length = str.length();
        com.caverock.androidsvg.g.d1 d1VarValueOf = com.caverock.androidsvg.g.d1.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            d1VarValueOf = com.caverock.androidsvg.g.d1.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d1VarValueOf = com.caverock.androidsvg.g.d1.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new com.caverock.androidsvg.g.p(g0(str, 0, length), d1VarValueOf);
        } catch (NumberFormatException e11) {
            throw new SVGParseException("Invalid length value: " + str, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str, String str2, String str3) {
        if (this.f21464c) {
            int i11 = this.f21465d - 1;
            this.f21465d = i11;
            if (i11 == 0) {
                this.f21464c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i12 = a.f21471a[h.fromString(str2).ordinal()];
            if (i12 != 1 && i12 != 2 && i12 != 4 && i12 != 5 && i12 != 13 && i12 != 14) {
                switch (i12) {
                    case 22:
                    case 23:
                        this.f21466e = false;
                        StringBuilder sb2 = this.f21468g;
                        if (sb2 != null) {
                            h hVar = this.f21467f;
                            if (hVar == h.title) {
                                this.f21462a.v(sb2.toString());
                            } else if (hVar == h.desc) {
                                this.f21462a.q(sb2.toString());
                            }
                            this.f21468g.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb3 = this.f21470i;
                        if (sb3 != null) {
                            this.f21469h = false;
                            Z(sb3.toString());
                            this.f21470i.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.f21463b = ((com.caverock.androidsvg.g.n0) this.f21463b).f21350b;
        }
    }

    private static List<com.caverock.androidsvg.g.p> p0(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        C0428i c0428i = new C0428i(str);
        c0428i.A();
        while (!c0428i.h()) {
            float fN = c0428i.n();
            if (Float.isNaN(fN)) {
                throw new SVGParseException("Invalid length list value: " + c0428i.b());
            }
            com.caverock.androidsvg.g.d1 d1VarV = c0428i.v();
            if (d1VarV == null) {
                d1VarV = com.caverock.androidsvg.g.d1.px;
            }
            arrayList.add(new com.caverock.androidsvg.g.p(fN, d1VarV));
            c0428i.z();
        }
        return arrayList;
    }

    private void q(Attributes attributes) throws SVGParseException {
        l("<g>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.m mVar = new com.caverock.androidsvg.g.m();
        mVar.f21349a = this.f21462a;
        mVar.f21350b = this.f21463b;
        D(mVar, attributes);
        S(mVar, attributes);
        W(mVar, attributes);
        C(mVar, attributes);
        this.f21463b.h(mVar);
        this.f21463b = mVar;
    }

    private static com.caverock.androidsvg.g.p q0(C0428i c0428i) {
        return c0428i.g(DebugKt.DEBUG_PROPERTY_VALUE_AUTO) ? new com.caverock.androidsvg.g.p(BitmapDescriptorFactory.HUE_RED) : c0428i.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str, Map<String, String> map) {
        if (str.equals("xml-stylesheet")) {
            com.caverock.androidsvg.g.k();
        }
    }

    private static Float r0(String str) {
        try {
            float fF0 = f0(str);
            float f11 = BitmapDescriptorFactory.HUE_RED;
            if (fF0 < BitmapDescriptorFactory.HUE_RED) {
                fF0 = f11;
            } else {
                f11 = 1.0f;
                if (fF0 > 1.0f) {
                    fF0 = f11;
                }
            }
            return Float.valueOf(fF0);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    private static int s(float f11, float f12, float f13) {
        float f14 = BitmapDescriptorFactory.HUE_RED;
        float f15 = f11 % 360.0f;
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            f15 += 360.0f;
        }
        float f16 = f15 / 60.0f;
        float f17 = f12 / 100.0f;
        float f18 = f13 / 100.0f;
        if (f17 < BitmapDescriptorFactory.HUE_RED) {
            f17 = 0.0f;
        } else if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (f18 >= BitmapDescriptorFactory.HUE_RED) {
            f14 = f18 > 1.0f ? 1.0f : f18;
        }
        float f19 = f14 <= 0.5f ? (f17 + 1.0f) * f14 : (f14 + f17) - (f17 * f14);
        float f21 = (f14 * 2.0f) - f19;
        return j(t(f21, f19, f16 - 2.0f) * 256.0f) | (j(t(f21, f19, f16 + 2.0f) * 256.0f) << 16) | (j(t(f21, f19, f16) * 256.0f) << 8);
    }

    private static Boolean s0(String str) {
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

    private static float t(float f11, float f12, float f13) {
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

    private static com.caverock.androidsvg.g.o0 t0(String str) {
        if (!str.startsWith("url(")) {
            return d0(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new com.caverock.androidsvg.g.u(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new com.caverock.androidsvg.g.u(strTrim, strTrim2.length() > 0 ? d0(strTrim2) : null);
    }

    private void u(Attributes attributes) throws SVGParseException {
        l("<image>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.o oVar = new com.caverock.androidsvg.g.o();
        oVar.f21349a = this.f21462a;
        oVar.f21350b = this.f21463b;
        D(oVar, attributes);
        S(oVar, attributes);
        W(oVar, attributes);
        C(oVar, attributes);
        G(oVar, attributes);
        this.f21463b.h(oVar);
        this.f21463b = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0281  */
    /* JADX WARN: Code duplicated, block: B:102:0x0287  */
    /* JADX WARN: Code duplicated, block: B:118:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x028f A[SYNTHETIC] */
    private static com.caverock.androidsvg.g.w u0(String str) {
        float f11;
        float f12;
        float f13;
        C0428i c0428i = new C0428i(str);
        com.caverock.androidsvg.g.w wVar = new com.caverock.androidsvg.g.w();
        if (!c0428i.h()) {
            int iIntValue = c0428i.l().intValue();
            int i11 = 109;
            if (iIntValue == 77 || iIntValue == 109) {
                int iIntValue2 = iIntValue;
                float f14 = BitmapDescriptorFactory.HUE_RED;
                float fN = BitmapDescriptorFactory.HUE_RED;
                float f15 = BitmapDescriptorFactory.HUE_RED;
                float fD = BitmapDescriptorFactory.HUE_RED;
                float f16 = BitmapDescriptorFactory.HUE_RED;
                float f17 = BitmapDescriptorFactory.HUE_RED;
                while (true) {
                    c0428i.A();
                    switch (iIntValue2) {
                        case 65:
                        case 97:
                            float f18 = f14;
                            float fN2 = c0428i.n();
                            float fD2 = c0428i.d(fN2);
                            float f19 = f15;
                            float fD3 = c0428i.d(fD2);
                            Boolean boolC = c0428i.c(Float.valueOf(fD3));
                            Boolean boolC2 = c0428i.c(boolC);
                            float fE = c0428i.e(boolC2);
                            float fD4 = c0428i.d(fE);
                            if (!Float.isNaN(fD4) && fN2 >= BitmapDescriptorFactory.HUE_RED && fD2 >= BitmapDescriptorFactory.HUE_RED) {
                                if (iIntValue2 == 97) {
                                    fE += f18;
                                    fD4 += f19;
                                }
                                float f21 = fD4;
                                boolean zBooleanValue = boolC.booleanValue();
                                boolean zBooleanValue2 = boolC2.booleanValue();
                                float f22 = fE;
                                wVar.b(fN2, fD2, fD3, zBooleanValue, zBooleanValue2, f22, f21);
                                f14 = f22;
                                fN = f14;
                                f15 = f21;
                                fD = f15;
                                c0428i.z();
                                if (c0428i.h()) {
                                    if (c0428i.i()) {
                                        iIntValue2 = c0428i.l().intValue();
                                    }
                                    i11 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 67:
                        case 99:
                            float fN3 = c0428i.n();
                            float fD5 = c0428i.d(fN3);
                            float fD6 = c0428i.d(fD5);
                            float fD7 = c0428i.d(fD6);
                            float fD8 = c0428i.d(fD7);
                            float fD9 = c0428i.d(fD8);
                            if (!Float.isNaN(fD9)) {
                                if (iIntValue2 == 99) {
                                    fD8 += f14;
                                    fD9 += f15;
                                    fN3 += f14;
                                    fD5 += f15;
                                    fD6 += f14;
                                    fD7 += f15;
                                }
                                float f23 = fN3;
                                float f24 = fD5;
                                f11 = fD6;
                                fD = fD7;
                                f12 = fD8;
                                f13 = fD9;
                                wVar.cubicTo(f23, f24, f11, fD, f12, f13);
                                fN = f11;
                                f14 = f12;
                                f15 = f13;
                                c0428i.z();
                                if (c0428i.h()) {
                                    if (c0428i.i()) {
                                        iIntValue2 = c0428i.l().intValue();
                                    }
                                    i11 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 72:
                        case 104:
                            float fN4 = c0428i.n();
                            if (!Float.isNaN(fN4)) {
                                if (iIntValue2 == 104) {
                                    fN4 += f14;
                                }
                                f14 = fN4;
                                wVar.lineTo(f14, f15);
                                fN = f14;
                                c0428i.z();
                                if (c0428i.h()) {
                                    if (c0428i.i()) {
                                        iIntValue2 = c0428i.l().intValue();
                                    }
                                    i11 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 76:
                        case 108:
                            float fN5 = c0428i.n();
                            float fD10 = c0428i.d(fN5);
                            if (!Float.isNaN(fD10)) {
                                if (iIntValue2 == 108) {
                                    fN5 += f14;
                                    fD10 += f15;
                                }
                                f14 = fN5;
                                f15 = fD10;
                                wVar.lineTo(f14, f15);
                                fN = f14;
                                fD = f15;
                                c0428i.z();
                                if (c0428i.h()) {
                                    if (c0428i.i()) {
                                        iIntValue2 = c0428i.l().intValue();
                                    }
                                    i11 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 77:
                        case 109:
                            float fN6 = c0428i.n();
                            float fD11 = c0428i.d(fN6);
                            if (!Float.isNaN(fD11)) {
                                if (iIntValue2 == i11 && !wVar.f()) {
                                    fN6 += f14;
                                    fD11 += f15;
                                }
                                f14 = fN6;
                                f15 = fD11;
                                wVar.moveTo(f14, f15);
                                fN = f14;
                                f16 = fN;
                                fD = f15;
                                f17 = fD;
                                iIntValue2 = iIntValue2 != i11 ? 76 : 108;
                                c0428i.z();
                                if (c0428i.h()) {
                                    if (c0428i.i()) {
                                        iIntValue2 = c0428i.l().intValue();
                                    }
                                    i11 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 81:
                        case 113:
                            fN = c0428i.n();
                            fD = c0428i.d(fN);
                            float fD12 = c0428i.d(fD);
                            float fD13 = c0428i.d(fD12);
                            if (!Float.isNaN(fD13)) {
                                if (iIntValue2 == 113) {
                                    fD12 += f14;
                                    fD13 += f15;
                                    fN += f14;
                                    fD += f15;
                                }
                                f14 = fD12;
                                f15 = fD13;
                                wVar.a(fN, fD, f14, f15);
                                c0428i.z();
                                if (c0428i.h()) {
                                    if (c0428i.i()) {
                                        iIntValue2 = c0428i.l().intValue();
                                    }
                                    i11 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 83:
                        case 115:
                            float f25 = (f14 * 2.0f) - fN;
                            float f26 = (2.0f * f15) - fD;
                            float fN7 = c0428i.n();
                            float fD14 = c0428i.d(fN7);
                            float fD15 = c0428i.d(fD14);
                            float fD16 = c0428i.d(fD15);
                            if (!Float.isNaN(fD16)) {
                                if (iIntValue2 == 115) {
                                    fD15 += f14;
                                    fD16 += f15;
                                    fN7 += f14;
                                    fD14 += f15;
                                }
                                f11 = fN7;
                                fD = fD14;
                                f12 = fD15;
                                f13 = fD16;
                                wVar.cubicTo(f25, f26, f11, fD, f12, f13);
                                fN = f11;
                                f14 = f12;
                                f15 = f13;
                                c0428i.z();
                                if (c0428i.h()) {
                                    if (c0428i.i()) {
                                        iIntValue2 = c0428i.l().intValue();
                                    }
                                    i11 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 84:
                        case 116:
                            fN = (f14 * 2.0f) - fN;
                            fD = (2.0f * f15) - fD;
                            float fN8 = c0428i.n();
                            float fD17 = c0428i.d(fN8);
                            if (!Float.isNaN(fD17)) {
                                if (iIntValue2 == 116) {
                                    fN8 += f14;
                                    fD17 += f15;
                                }
                                f14 = fN8;
                                f15 = fD17;
                                wVar.a(fN, fD, f14, f15);
                                c0428i.z();
                                if (c0428i.h()) {
                                    if (c0428i.i()) {
                                        iIntValue2 = c0428i.l().intValue();
                                    }
                                    i11 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 86:
                        case 118:
                            float fN9 = c0428i.n();
                            if (!Float.isNaN(fN9)) {
                                if (iIntValue2 == 118) {
                                    fN9 += f15;
                                }
                                f15 = fN9;
                                wVar.lineTo(f14, f15);
                                fD = f15;
                                c0428i.z();
                                if (c0428i.h()) {
                                    if (c0428i.i()) {
                                        iIntValue2 = c0428i.l().intValue();
                                    }
                                    i11 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 90:
                        case 122:
                            wVar.close();
                            f14 = f16;
                            fN = f14;
                            f15 = f17;
                            fD = f15;
                            c0428i.z();
                            if (c0428i.h()) {
                                if (c0428i.i()) {
                                    iIntValue2 = c0428i.l().intValue();
                                }
                                i11 = 109;
                            }
                            break;
                        default:
                            break;
                    }
                    return wVar;
                }
            }
        }
        return wVar;
    }

    private void v(Attributes attributes) throws SVGParseException {
        l("<line>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.q qVar = new com.caverock.androidsvg.g.q();
        qVar.f21349a = this.f21462a;
        qVar.f21350b = this.f21463b;
        D(qVar, attributes);
        S(qVar, attributes);
        W(qVar, attributes);
        C(qVar, attributes);
        H(qVar, attributes);
        this.f21463b.h(qVar);
    }

    static com.caverock.androidsvg.e v0(String str) throws SVGParseException {
        com.caverock.androidsvg.e.b bVar;
        C0428i c0428i = new C0428i(str);
        c0428i.A();
        String strR = c0428i.r();
        if ("defer".equals(strR)) {
            c0428i.A();
            strR = c0428i.r();
        }
        com.caverock.androidsvg.e.a aVarA = b.a(strR);
        c0428i.A();
        if (c0428i.h()) {
            bVar = null;
        } else {
            String strR2 = c0428i.r();
            strR2.getClass();
            if (strR2.equals("meet")) {
                bVar = com.caverock.androidsvg.e.b.meet;
            } else {
                if (!strR2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: " + str);
                }
                bVar = com.caverock.androidsvg.e.b.slice;
            }
        }
        return new com.caverock.androidsvg.e(aVarA, bVar);
    }

    private void w(Attributes attributes) throws SVGParseException {
        l("<linearGradient>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.m0 m0Var = new com.caverock.androidsvg.g.m0();
        m0Var.f21349a = this.f21462a;
        m0Var.f21350b = this.f21463b;
        D(m0Var, attributes);
        S(m0Var, attributes);
        F(m0Var, attributes);
        I(m0Var, attributes);
        this.f21463b.h(m0Var);
        this.f21463b = m0Var;
    }

    private static void w0(com.caverock.androidsvg.g.p0 p0Var, String str) {
        p0Var.f21359o = v0(str);
    }

    private void x(Attributes attributes) throws SVGParseException {
        l("<marker>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.r rVar = new com.caverock.androidsvg.g.r();
        rVar.f21349a = this.f21462a;
        rVar.f21350b = this.f21463b;
        D(rVar, attributes);
        S(rVar, attributes);
        C(rVar, attributes);
        Y(rVar, attributes);
        J(rVar, attributes);
        this.f21463b.h(rVar);
        this.f21463b = rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> x0(C0428i c0428i) {
        HashMap map = new HashMap();
        c0428i.A();
        String strS = c0428i.s('=');
        while (strS != null) {
            c0428i.f('=');
            map.put(strS, c0428i.q());
            c0428i.A();
            strS = c0428i.s('=');
        }
        return map;
    }

    private void y(Attributes attributes) throws SVGParseException {
        l("<mask>", new Object[0]);
        if (this.f21463b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.g.s sVar = new com.caverock.androidsvg.g.s();
        sVar.f21349a = this.f21462a;
        sVar.f21350b = this.f21463b;
        D(sVar, attributes);
        S(sVar, attributes);
        C(sVar, attributes);
        K(sVar, attributes);
        this.f21463b.h(sVar);
        this.f21463b = sVar;
    }

    private static com.caverock.androidsvg.g.e0.e y0(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return com.caverock.androidsvg.g.e0.e.optimizeQuality;
            case "auto":
                return com.caverock.androidsvg.g.e0.e.auto;
            case "optimizeSpeed":
                return com.caverock.androidsvg.g.e0.e.optimizeSpeed;
            default:
                return null;
        }
    }

    private static Set<String> z0(String str) {
        C0428i c0428i = new C0428i(str);
        HashSet hashSet = new HashSet();
        while (!c0428i.h()) {
            String strR = c0428i.r();
            if (strR.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strR.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            c0428i.A();
        }
        return hashSet;
    }

    com.caverock.androidsvg.g z(InputStream inputStream, boolean z11) {
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
            inputStream.mark(4096);
            L0(inputStream, z11);
            return this.f21462a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}
