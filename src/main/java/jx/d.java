package jx;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
class d {

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LatLng f84374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f84375b;

        a(LatLng latLng, Double d11) {
            this.f84374a = latLng;
            this.f84375b = d11;
        }
    }

    private static a a(String str) {
        return b(str, ",");
    }

    private static a b(String str, String str2) {
        String[] strArrSplit = str.split(str2);
        if (strArrSplit.length < 2) {
            throw new IllegalArgumentException("Wrong coordinate, latitude and longitude must be set");
        }
        return new a(new LatLng(Double.parseDouble(strArrSplit[1]), Double.parseDouble(strArrSplit[0])), strArrSplit.length > 2 ? Double.valueOf(Double.parseDouble(strArrSplit[2])) : null);
    }

    private static ArrayList<a> c(String str) {
        ArrayList<a> arrayList = new ArrayList<>();
        for (String str2 : str.trim().split("(\\s+)")) {
            arrayList.add(a(str2));
        }
        return arrayList;
    }

    private static ArrayList<LatLng> d(String str) {
        ArrayList<a> arrayListC = c(str);
        ArrayList<LatLng> arrayList = new ArrayList<>();
        Iterator<a> it = arrayListC.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f84374a);
        }
        return arrayList;
    }

    private static hx.c e(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(str)) {
                return null;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Point")) {
                    return l(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("LineString")) {
                    return h(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("Track")) {
                    return n(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("Polygon")) {
                    return m(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("MultiGeometry")) {
                    return i(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("MultiTrack")) {
                    return j(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    static e f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int eventType = xmlPullParser.getEventType();
        float fP = 0.0f;
        String strO = null;
        int i11 = 1;
        float f11 = 0.0f;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("GroundOverlay")) {
                return new e(strO, g((Double) map2.get("north"), (Double) map2.get("south"), (Double) map2.get("east"), (Double) map2.get("west")), f11, i11, map, fP);
            }
            int i12 = i11;
            String str = strO;
            if (eventType != 2) {
                i11 = i12;
                strO = str;
            } else if (xmlPullParser.getName().equals("Icon")) {
                i11 = i12;
                strO = o(xmlPullParser);
            } else if (xmlPullParser.getName().equals("drawOrder")) {
                i11 = i12;
                strO = str;
                f11 = Float.parseFloat(xmlPullParser.nextText());
            } else if (xmlPullParser.getName().equals("visibility")) {
                strO = str;
                i11 = Integer.parseInt(xmlPullParser.nextText());
            } else {
                if (xmlPullParser.getName().equals("ExtendedData")) {
                    map.putAll(q(xmlPullParser));
                } else if (xmlPullParser.getName().equals("rotation")) {
                    i11 = i12;
                    strO = str;
                    fP = p(xmlPullParser);
                } else if (xmlPullParser.getName().matches("name|description|drawOrder|visibility|open|address|phoneNumber") || xmlPullParser.getName().equals("color")) {
                    map.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().matches("north|south|east|west")) {
                    map2.put(xmlPullParser.getName(), Double.valueOf(Double.parseDouble(xmlPullParser.nextText())));
                }
                i11 = i12;
                strO = str;
            }
            eventType = xmlPullParser.next();
        }
    }

    private static LatLngBounds g(Double d11, Double d12, Double d13, Double d14) {
        return new LatLngBounds(new LatLng(d12.doubleValue(), d14.doubleValue()), new LatLng(d11.doubleValue(), d13.doubleValue()));
    }

    private static g h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("LineString")) {
                return new g(arrayList, arrayList2);
            }
            if (eventType == 2 && xmlPullParser.getName().equals("coordinates")) {
                for (a aVar : c(xmlPullParser.nextText())) {
                    arrayList.add(aVar.f84374a);
                    Double d11 = aVar.f84375b;
                    if (d11 != null) {
                        arrayList2.add(d11);
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static h i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int next = xmlPullParser.next();
        while (true) {
            if (next == 3 && xmlPullParser.getName().equals("MultiGeometry")) {
                return new h(arrayList);
            }
            if (next == 2 && xmlPullParser.getName().matches("Point|LineString|Polygon|MultiGeometry|Track|MultiTrack")) {
                arrayList.add(e(xmlPullParser, xmlPullParser.getName()));
            }
            next = xmlPullParser.next();
        }
    }

    private static i j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int next = xmlPullParser.next();
        while (true) {
            if (next == 3 && xmlPullParser.getName().equals("MultiTrack")) {
                return new i(arrayList);
            }
            if (next == 2 && xmlPullParser.getName().matches("Track")) {
                arrayList.add(n(xmlPullParser));
            }
            next = xmlPullParser.next();
        }
    }

    static k k(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap map = new HashMap();
        int eventType = xmlPullParser.getEventType();
        hx.c cVarE = null;
        String strNextText = null;
        o oVarE = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Placemark")) {
                return new k(cVarE, strNextText, oVarE, map);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("styleUrl")) {
                    strNextText = xmlPullParser.nextText();
                } else if (xmlPullParser.getName().matches("Point|LineString|Polygon|MultiGeometry|Track|MultiTrack")) {
                    cVarE = e(xmlPullParser, xmlPullParser.getName());
                } else if (xmlPullParser.getName().matches("name|description|drawOrder|visibility|open|address|phoneNumber")) {
                    map.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("ExtendedData")) {
                    map.putAll(q(xmlPullParser));
                } else if (xmlPullParser.getName().equals("Style")) {
                    oVarE = p.e(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static l l(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        a aVarA = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Point")) {
                return new l(aVarA.f84374a, aVarA.f84375b);
            }
            if (eventType == 2 && xmlPullParser.getName().equals("coordinates")) {
                aVarA = a(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static m m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList<LatLng> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        boolean zEquals = false;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Polygon")) {
                return new m(arrayList, arrayList2);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().matches("outerBoundaryIs|innerBoundaryIs")) {
                    zEquals = xmlPullParser.getName().equals("outerBoundaryIs");
                } else if (xmlPullParser.getName().equals("coordinates")) {
                    if (zEquals) {
                        arrayList = d(xmlPullParser.nextText());
                    } else {
                        arrayList2.add(d(xmlPullParser.nextText()));
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static q n(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap map = new HashMap();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Track")) {
                return new q(arrayList, arrayList2, arrayList3, map);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("coord")) {
                    a aVarB = b(xmlPullParser.nextText(), " ");
                    arrayList.add(aVarB.f84374a);
                    Double d11 = aVarB.f84375b;
                    if (d11 != null) {
                        arrayList2.add(d11);
                    }
                } else if (xmlPullParser.getName().equals("when")) {
                    try {
                        arrayList3.add(Long.valueOf(simpleDateFormat.parse(xmlPullParser.nextText()).getTime()));
                    } catch (ParseException e11) {
                        throw new XmlPullParserException("Invalid date", xmlPullParser, e11);
                    }
                } else if (xmlPullParser.getName().equals("ExtendedData")) {
                    map.putAll(q(xmlPullParser));
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static String o(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Icon")) {
                return null;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("href")) {
                return xmlPullParser.nextText();
            }
            eventType = xmlPullParser.next();
        }
    }

    private static float p(XmlPullParser xmlPullParser) {
        return -Float.parseFloat(xmlPullParser.nextText());
    }

    private static HashMap<String, String> q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap<String, String> map = new HashMap<>();
        int eventType = xmlPullParser.getEventType();
        String attributeValue = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("ExtendedData")) {
                return map;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Data")) {
                    attributeValue = xmlPullParser.getAttributeValue(null, "name");
                } else if (xmlPullParser.getName().equals("value") && attributeValue != null) {
                    map.put(attributeValue, xmlPullParser.nextText());
                    attributeValue = null;
                }
            }
            eventType = xmlPullParser.next();
        }
    }
}
