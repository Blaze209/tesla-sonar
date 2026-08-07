package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.w;
import com.facebook.react.uimanager.w0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class n extends d<n> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f23179g = "n";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final u5.g<n> f23180h = new u5.g<>(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MotionEvent f23181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f23182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f23183c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<WritableMap> f23184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f23185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d.b f23186f;

    class a implements d.b {
        a() {
        }

        @Override // com.facebook.react.uimanager.events.d.b
        public boolean a(int i11, String str) {
            if (!str.equals(n.this.f23182b)) {
                return false;
            }
            if (!o.f(str)) {
                return n.this.getViewTag() == i11;
            }
            Iterator<w0.b> it = n.this.f23185e.e().iterator();
            while (it.hasNext()) {
                if (it.next().b() == i11) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23191d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<Integer, float[]> f23192e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map<Integer, List<w0.b>> f23193f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map<Integer, float[]> f23194g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map<Integer, float[]> f23195h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Set<Integer> f23196i;

        public b(int i11, int i12, int i13, int i14, Map<Integer, float[]> map, Map<Integer, List<w0.b>> map2, Map<Integer, float[]> map3, Map<Integer, float[]> map4, Set<Integer> set) {
            this.f23188a = i11;
            this.f23189b = i12;
            this.f23190c = i13;
            this.f23191d = i14;
            this.f23192e = map;
            this.f23193f = map2;
            this.f23194g = map3;
            this.f23195h = map4;
            this.f23196i = new HashSet(set);
        }

        public int b() {
            return this.f23189b;
        }

        public final Map<Integer, float[]> c() {
            return this.f23194g;
        }

        public final Map<Integer, List<w0.b>> d() {
            return this.f23193f;
        }

        public final List<w0.b> e() {
            return this.f23193f.get(Integer.valueOf(this.f23189b));
        }

        public Set<Integer> f() {
            return this.f23196i;
        }

        public int g() {
            return this.f23190c;
        }

        public final Map<Integer, float[]> h() {
            return this.f23192e;
        }

        public int i() {
            return this.f23188a;
        }

        public final Map<Integer, float[]> j() {
            return this.f23195h;
        }

        public int k() {
            return this.f23191d;
        }

        public boolean l(int i11) {
            return this.f23196i.contains(Integer.valueOf(i11));
        }
    }

    private n() {
    }

    private void c(WritableMap writableMap, int i11) {
        writableMap.putBoolean("ctrlKey", (i11 & 4096) != 0);
        writableMap.putBoolean("shiftKey", (i11 & 1) != 0);
        writableMap.putBoolean("altKey", (i11 & 2) != 0);
        writableMap.putBoolean("metaKey", (i11 & 65536) != 0);
    }

    private List<WritableMap> d() {
        int actionIndex = this.f23181a.getActionIndex();
        String str = this.f23182b;
        str.getClass();
        switch (str) {
            case "topPointerEnter":
            case "topPointerLeave":
            case "topPointerDown":
            case "topPointerOver":
            case "topPointerUp":
            case "topClick":
            case "topPointerOut":
                return Arrays.asList(e(actionIndex));
            case "topPointerMove":
            case "topPointerCancel":
                return f();
            default:
                return null;
        }
    }

    private WritableMap e(int i11) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        int pointerId = this.f23181a.getPointerId(i11);
        writableMapCreateMap.putDouble("pointerId", pointerId);
        String strE = o.e(this.f23181a.getToolType(i11));
        writableMapCreateMap.putString("pointerType", strE);
        writableMapCreateMap.putBoolean("isPrimary", !h() && (this.f23185e.l(pointerId) || pointerId == this.f23185e.f23188a));
        float[] fArr = this.f23185e.c().get(Integer.valueOf(pointerId));
        double dF = w.f(fArr[0]);
        double dF2 = w.f(fArr[1]);
        writableMapCreateMap.putDouble("clientX", dF);
        writableMapCreateMap.putDouble("clientY", dF2);
        float[] fArr2 = this.f23185e.j().get(Integer.valueOf(pointerId));
        double dF3 = w.f(fArr2[0]);
        double dF4 = w.f(fArr2[1]);
        writableMapCreateMap.putDouble("screenX", dF3);
        writableMapCreateMap.putDouble("screenY", dF4);
        writableMapCreateMap.putDouble("x", dF);
        writableMapCreateMap.putDouble("y", dF2);
        writableMapCreateMap.putDouble("pageX", dF);
        writableMapCreateMap.putDouble("pageY", dF2);
        float[] fArr3 = this.f23185e.h().get(Integer.valueOf(pointerId));
        writableMapCreateMap.putDouble("offsetX", w.f(fArr3[0]));
        writableMapCreateMap.putDouble("offsetY", w.f(fArr3[1]));
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putDouble("timestamp", getTimestampMs());
        writableMapCreateMap.putInt("detail", 0);
        writableMapCreateMap.putDouble("tiltX", 0.0d);
        writableMapCreateMap.putDouble("tiltY", 0.0d);
        writableMapCreateMap.putInt("twist", 0);
        if (strE.equals("mouse") || h()) {
            writableMapCreateMap.putDouble(Snapshot.WIDTH, 1.0d);
            writableMapCreateMap.putDouble(Snapshot.HEIGHT, 1.0d);
        } else {
            double dF5 = w.f(this.f23181a.getTouchMajor(i11));
            writableMapCreateMap.putDouble(Snapshot.WIDTH, dF5);
            writableMapCreateMap.putDouble(Snapshot.HEIGHT, dF5);
        }
        int buttonState = this.f23181a.getButtonState();
        writableMapCreateMap.putInt("button", o.a(strE, this.f23185e.g(), buttonState));
        writableMapCreateMap.putInt("buttons", o.b(this.f23182b, strE, buttonState));
        writableMapCreateMap.putDouble("pressure", h() ? 0.0d : o.d(writableMapCreateMap.getInt("buttons"), this.f23182b));
        writableMapCreateMap.putDouble("tangentialPressure", 0.0d);
        c(writableMapCreateMap, this.f23181a.getMetaState());
        return writableMapCreateMap;
    }

    private List<WritableMap> f() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.f23181a.getPointerCount(); i11++) {
            arrayList.add(e(i11));
        }
        return arrayList;
    }

    private void g(String str, int i11, b bVar, MotionEvent motionEvent, short s11) {
        super.init(bVar.k(), i11, motionEvent.getEventTime());
        this.f23182b = str;
        this.f23181a = MotionEvent.obtain(motionEvent);
        this.f23183c = s11;
        this.f23185e = bVar;
    }

    private boolean h() {
        return this.f23182b.equals("topClick");
    }

    public static n i(String str, int i11, b bVar, MotionEvent motionEvent) {
        n nVarB = f23180h.b();
        if (nVarB == null) {
            nVarB = new n();
        }
        n nVar = nVarB;
        nVar.g(str, i11, bVar, (MotionEvent) gn.a.c(motionEvent), (short) 0);
        return nVar;
    }

    public static n j(String str, int i11, b bVar, MotionEvent motionEvent, short s11) {
        n nVarB = f23180h.b();
        if (nVarB == null) {
            nVarB = new n();
        }
        n nVar = nVarB;
        nVar.g(str, i11, bVar, (MotionEvent) gn.a.c(motionEvent), s11);
        return nVar;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        if (this.f23181a == null) {
            ReactSoftExceptionLogger.logSoftException(f23179g, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"));
            return;
        }
        if (this.f23184d == null) {
            this.f23184d = d();
        }
        List<WritableMap> list = this.f23184d;
        if (list == null) {
            return;
        }
        boolean z11 = list.size() > 1;
        for (WritableMap writableMapCopy : this.f23184d) {
            if (z11) {
                writableMapCopy = writableMapCopy.copy();
            }
            rCTEventEmitter.receiveEvent(getViewTag(), this.f23182b, writableMapCopy);
        }
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        if (this.f23181a == null) {
            ReactSoftExceptionLogger.logSoftException(f23179g, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"));
            return;
        }
        if (this.f23184d == null) {
            this.f23184d = d();
        }
        List<WritableMap> list = this.f23184d;
        if (list == null) {
            return;
        }
        boolean z11 = list.size() > 1;
        for (WritableMap writableMapCopy : this.f23184d) {
            if (z11) {
                writableMapCopy = writableMapCopy.copy();
            }
            WritableMap writableMap = writableMapCopy;
            int surfaceId = getSurfaceId();
            int viewTag = getViewTag();
            String str = this.f23182b;
            short s11 = this.f23183c;
            rCTModernEventEmitter.receiveEvent(surfaceId, viewTag, str, s11 != -1, s11, writableMap, o.c(str));
        }
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.f23183c;
    }

    @Override // com.facebook.react.uimanager.events.d
    public d.b getEventAnimationDriverMatchSpec() {
        if (this.f23186f == null) {
            this.f23186f = new a();
        }
        return this.f23186f;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return this.f23182b;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        this.f23184d = null;
        MotionEvent motionEvent = this.f23181a;
        this.f23181a = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            f23180h.a(this);
        } catch (IllegalStateException e11) {
            ReactSoftExceptionLogger.logSoftException(f23179g, e11);
        }
    }
}
