package jx;

import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
class p {
    private static void a(XmlPullParser xmlPullParser, o oVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("BalloonStyle")) {
                return;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("text")) {
                oVar.H(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void b(XmlPullParser xmlPullParser, o oVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("IconStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("heading")) {
                    oVar.C(Float.parseFloat(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("Icon")) {
                    h(xmlPullParser, oVar);
                } else if (xmlPullParser.getName().equals("hotSpot")) {
                    g(xmlPullParser, oVar);
                } else if (xmlPullParser.getName().equals("scale")) {
                    oVar.F(Double.parseDouble(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("color")) {
                    oVar.J(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("colorMode")) {
                    oVar.E(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void c(XmlPullParser xmlPullParser, o oVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("LineStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("color")) {
                    oVar.L(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(Snapshot.WIDTH)) {
                    oVar.O(Float.valueOf(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("colorMode")) {
                    oVar.I(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void d(XmlPullParser xmlPullParser, o oVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("PolyStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("color")) {
                    oVar.B(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("outline")) {
                    oVar.K(a.a(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("fill")) {
                    oVar.A(a.a(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("colorMode")) {
                    oVar.M(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    static o e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        o oVar = new o();
        i(xmlPullParser.getAttributeValue(null, "id"), oVar);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Style")) {
                return oVar;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("IconStyle")) {
                    b(xmlPullParser, oVar);
                } else if (xmlPullParser.getName().equals("LineStyle")) {
                    c(xmlPullParser, oVar);
                } else if (xmlPullParser.getName().equals("PolyStyle")) {
                    d(xmlPullParser, oVar);
                } else if (xmlPullParser.getName().equals("BalloonStyle")) {
                    a(xmlPullParser, oVar);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    static HashMap<String, String> f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap<String, String> map = new HashMap<>();
        String str = "#" + xmlPullParser.getAttributeValue(null, "id");
        int eventType = xmlPullParser.getEventType();
        boolean z11 = false;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("StyleMap")) {
                return map;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(Action.KEY_ATTRIBUTE) && xmlPullParser.nextText().equals("normal")) {
                    z11 = true;
                } else if (xmlPullParser.getName().equals("styleUrl") && z11) {
                    map.put(str, xmlPullParser.nextText());
                    z11 = false;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void g(XmlPullParser xmlPullParser, o oVar) {
        try {
            oVar.D(Float.parseFloat(xmlPullParser.getAttributeValue(null, "x")), Float.parseFloat(xmlPullParser.getAttributeValue(null, "y")), xmlPullParser.getAttributeValue(null, "xunits"), xmlPullParser.getAttributeValue(null, "yunits"));
        } catch (NullPointerException unused) {
            Log.w("KmlStyleParser", "Missing 'x' or 'y' attributes in hotSpot for style with id: " + oVar.s());
        } catch (NumberFormatException unused2) {
            Log.w("KmlStyleParser", "Invalid number in 'x' or 'y' attributes in hotSpot for style with id: " + oVar.s());
        }
    }

    private static void h(XmlPullParser xmlPullParser, o oVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Icon")) {
                return;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("href")) {
                oVar.G(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void i(String str, o oVar) {
        if (str != null) {
            oVar.N("#" + str);
        }
    }
}
