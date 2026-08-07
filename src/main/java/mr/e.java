package mr;

import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.x;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import ts.r0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f92499a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f92500b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f92501c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static b a(String str) {
        try {
            return b(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            u.i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static b b(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!r0.e(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.a("Couldn't find xmp metadata", null);
        }
        x<b.a> xVarR = x.r();
        long jE = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (r0.e(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!d(xmlPullParserNewPullParser)) {
                    return null;
                }
                jE = e(xmlPullParserNewPullParser);
                xVarR = c(xmlPullParserNewPullParser);
            } else if (r0.e(xmlPullParserNewPullParser, "Container:Directory")) {
                xVarR = f(xmlPullParserNewPullParser, "Container", "Item");
            } else if (r0.e(xmlPullParserNewPullParser, "GContainer:Directory")) {
                xVarR = f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!r0.c(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (xVarR.isEmpty()) {
            return null;
        }
        return new b(jE, xVarR);
    }

    private static x<b.a> c(XmlPullParser xmlPullParser) {
        for (String str : f92501c) {
            String strA = r0.a(xmlPullParser, str);
            if (strA != null) {
                return x.t(new b.a(ClipboardModule.MIMETYPE_JPEG, "Primary", 0L, 0L), new b.a("video/mp4", "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return x.r();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f92499a) {
            String strA = r0.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String str : f92500b) {
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

    private static x<b.a> f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        x.a aVarK = x.k();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (r0.e(xmlPullParser, str3)) {
                String strA = r0.a(xmlPullParser, str2 + ":Mime");
                String strA2 = r0.a(xmlPullParser, str2 + ":Semantic");
                String strA3 = r0.a(xmlPullParser, str2 + ":Length");
                String strA4 = r0.a(xmlPullParser, str2 + ":Padding");
                if (strA == null || strA2 == null) {
                    return x.r();
                }
                aVarK.a(new b.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!r0.c(xmlPullParser, str4));
        return aVarK.k();
    }
}
