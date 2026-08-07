package jx;

import com.google.android.gms.maps.model.GroundOverlay;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParser f84381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<k, Object> f84382b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<b> f84383c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<String, o> f84384d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f84385e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<e, GroundOverlay> f84386f = new HashMap<>();

    j(XmlPullParser xmlPullParser) {
        this.f84381a = xmlPullParser;
    }

    static void g(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i11 = 1;
        while (i11 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i11++;
            } else if (next == 3) {
                i11--;
            }
        }
    }

    ArrayList<b> a() {
        return this.f84383c;
    }

    HashMap<e, GroundOverlay> b() {
        return this.f84386f;
    }

    HashMap<k, Object> c() {
        return this.f84382b;
    }

    HashMap<String, String> d() {
        return this.f84385e;
    }

    HashMap<String, o> e() {
        return this.f84384d;
    }

    void f() throws XmlPullParserException, IOException {
        int eventType = this.f84381a.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                if (this.f84381a.getName().matches("altitude|altitudeModeGroup|altitudeMode|begin|bottomFov|cookie|displayName|displayMode|end|expires|extrude|flyToView|gridOrigin|httpQuery|leftFov|linkDescription|linkName|linkSnippet|listItemType|maxSnippetLines|maxSessionLength|message|minAltitude|minFadeExtent|minLodPixels|minRefreshPeriod|maxAltitude|maxFadeExtent|maxLodPixels|maxHeight|maxWidth|near|NetworkLink|NetworkLinkControl|overlayXY|range|refreshMode|refreshInterval|refreshVisibility|rightFov|roll|rotationXY|screenXY|shape|sourceHref|state|targetHref|tessellate|tileSize|topFov|viewBoundScale|viewFormat|viewRefreshMode|viewRefreshTime|when")) {
                    g(this.f84381a);
                }
                if (this.f84381a.getName().matches("Folder|Document")) {
                    this.f84383c.add(c.b(this.f84381a));
                }
                if (this.f84381a.getName().equals("Style")) {
                    o oVarE = p.e(this.f84381a);
                    this.f84384d.put(oVarE.s(), oVarE);
                }
                if (this.f84381a.getName().equals("StyleMap")) {
                    this.f84385e.putAll(p.f(this.f84381a));
                }
                if (this.f84381a.getName().equals("Placemark")) {
                    this.f84382b.put(d.k(this.f84381a), null);
                }
                if (this.f84381a.getName().equals("GroundOverlay")) {
                    this.f84386f.put(d.f(this.f84381a), null);
                }
            }
            eventType = this.f84381a.next();
        }
        this.f84384d.put(null, new o());
    }
}
