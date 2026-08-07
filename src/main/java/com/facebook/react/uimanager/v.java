package com.facebook.react.uimanager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* JADX INFO: loaded from: classes4.dex */
public class v extends com.facebook.react.uimanager.events.d<v> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final u5.g<v> f23405e = new u5.g<>(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23409d;

    private v() {
    }

    public static v b(int i11, int i12, int i13, int i14, int i15, int i16) {
        v vVarB = f23405e.b();
        if (vVarB == null) {
            vVarB = new v();
        }
        v vVar = vVarB;
        vVar.a(i11, i12, i13, i14, i15, i16);
        return vVar;
    }

    protected void a(int i11, int i12, int i13, int i14, int i15, int i16) {
        super.init(i11, i12);
        this.f23406a = i13;
        this.f23407b = i14;
        this.f23408c = i15;
        this.f23409d = i16;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", w.f(this.f23406a));
        writableMapCreateMap.putDouble("y", w.f(this.f23407b));
        writableMapCreateMap.putDouble(Snapshot.WIDTH, w.f(this.f23408c));
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, w.f(this.f23409d));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("layout", writableMapCreateMap);
        writableMapCreateMap2.putInt("target", getViewTag());
        return writableMapCreateMap2;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topLayout";
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        f23405e.a(this);
    }
}
