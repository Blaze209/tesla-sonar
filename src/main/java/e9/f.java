package e9;

import androidx.media3.common.ParserException;
import com.google.common.collect.x;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import s7.r0;
import s7.t;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f62282a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f62283b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f62284c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c a(String str) {
        try {
            return b(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            t.i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static c b(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!r0.f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.a("Couldn't find xmp metadata", null);
        }
        x<c.a> xVarR = x.r();
        long jE = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (r0.f(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!d(xmlPullParserNewPullParser)) {
                    return null;
                }
                jE = e(xmlPullParserNewPullParser);
                xVarR = c(xmlPullParserNewPullParser);
            } else if (r0.f(xmlPullParserNewPullParser, "Container:Directory")) {
                xVarR = f(xmlPullParserNewPullParser, "Container", "Item");
            } else if (r0.f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                xVarR = f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!r0.d(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (xVarR.isEmpty()) {
            return null;
        }
        return new c(jE, xVarR);
    }

    private static x<c.a> c(XmlPullParser xmlPullParser) {
        for (String str : f62284c) {
            String strA = r0.a(xmlPullParser, str);
            if (strA != null) {
                return x.t(new c.a(ClipboardModule.MIMETYPE_JPEG, "Primary", 0L, 0L), new c.a("video/mp4", "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return x.r();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f62282a) {
            String strA = r0.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String str : f62283b) {
            String strA = r0.a(xmlPullParser, str);
            if (strA != null) {
                long j11 = Long.parseLong(strA);
                if (j11 == -1) {
                    return -9223372036854775807L;
                }
                return j11;
            }
        }
        return -9223372036854775807L;
    }

    private static x<c.a> f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        x.a aVarK = x.k();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (r0.f(xmlPullParser, str3)) {
                String strA = r0.a(xmlPullParser, str2 + ":Mime");
                String strA2 = r0.a(xmlPullParser, str2 + ":Semantic");
                String strA3 = r0.a(xmlPullParser, str2 + ":Length");
                String strA4 = r0.a(xmlPullParser, str2 + ":Padding");
                if (strA == null || strA2 == null) {
                    return x.r();
                }
                aVarK.a(new c.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!r0.d(xmlPullParser, str4));
        return aVarK.k();
    }
}
