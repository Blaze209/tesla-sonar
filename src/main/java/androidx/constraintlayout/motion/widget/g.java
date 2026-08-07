package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static HashMap<String, Constructor<? extends d>> f6522b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<Integer, ArrayList<d>> f6523a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends d>> map = new HashMap<>();
        f6522b = map;
        try {
            map.put("KeyAttribute", e.class.getConstructor(null));
            f6522b.put("KeyPosition", h.class.getConstructor(null));
            f6522b.put("KeyCycle", f.class.getConstructor(null));
            f6522b.put("KeyTimeCycle", j.class.getConstructor(null));
            f6522b.put("KeyTrigger", k.class.getConstructor(null));
        } catch (NoSuchMethodException e11) {
            Log.e("KeyFrames", "unable to load", e11);
        }
    }

    public g() {
    }

    public void a(m mVar) {
        ArrayList<d> arrayList = this.f6523a.get(-1);
        if (arrayList != null) {
            mVar.b(arrayList);
        }
    }

    public void b(m mVar) {
        ArrayList<d> arrayList = this.f6523a.get(Integer.valueOf(mVar.f6606c));
        if (arrayList != null) {
            mVar.b(arrayList);
        }
        ArrayList<d> arrayList2 = this.f6523a.get(-1);
        if (arrayList2 != null) {
            for (d dVar : arrayList2) {
                if (dVar.f(((ConstraintLayout.b) mVar.f6605b.getLayoutParams()).f6889c0)) {
                    mVar.a(dVar);
                }
            }
        }
    }

    public void c(d dVar) {
        if (!this.f6523a.containsKey(Integer.valueOf(dVar.f6479b))) {
            this.f6523a.put(Integer.valueOf(dVar.f6479b), new ArrayList<>());
        }
        ArrayList<d> arrayList = this.f6523a.get(Integer.valueOf(dVar.f6479b));
        if (arrayList != null) {
            arrayList.add(dVar);
        }
    }

    public ArrayList<d> d(int i11) {
        return this.f6523a.get(Integer.valueOf(i11));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public g(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, androidx.constraintlayout.widget.a> map;
        HashMap<String, androidx.constraintlayout.widget.a> map2;
        d jVar;
        try {
            int eventType = xmlPullParser.getEventType();
            d dVar = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (f6522b.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (name.equals("KeyTimeCycle")) {
                                    jVar = new j();
                                    jVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(jVar);
                                    dVar = jVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case -298435811:
                                if (name.equals("KeyAttribute")) {
                                    jVar = new e();
                                    jVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(jVar);
                                    dVar = jVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case 540053991:
                                if (name.equals("KeyCycle")) {
                                    jVar = new f();
                                    jVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(jVar);
                                    dVar = jVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case 1153397896:
                                if (name.equals("KeyPosition")) {
                                    jVar = new h();
                                    jVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(jVar);
                                    dVar = jVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case 1308496505:
                                if (name.equals("KeyTrigger")) {
                                    jVar = new k();
                                    jVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(jVar);
                                    dVar = jVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            default:
                                throw new NullPointerException("Key " + name + " not found");
                        }
                    }
                    if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (dVar != null && (map2 = dVar.f6482e) != null) {
                            androidx.constraintlayout.widget.a.i(context, xmlPullParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && dVar != null && (map = dVar.f6482e) != null) {
                        androidx.constraintlayout.widget.a.i(context, xmlPullParser, map);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e11) {
            Log.e("KeyFrames", "Error parsing XML resource", e11);
        } catch (XmlPullParserException e12) {
            Log.e("KeyFrames", "Error parsing XML resource", e12);
        }
    }
}
