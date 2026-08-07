package com.facebook.react;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, String> f23873c = jn.c.a().b(23, "select").b(66, "select").b(62, "select").b(85, "playPause").b(89, "rewind").b(90, "fastForward").b(86, "stop").b(87, "next").b(88, "previous").b(19, "up").b(22, "right").b(20, "down").b(21, "left").b(165, "info").b(82, "menu").a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23874a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x0 f23875b;

    w(x0 x0Var) {
        this.f23875b = x0Var;
    }

    private void b(String str, int i11) {
        c(str, i11, -1);
    }

    private void c(String str, int i11, int i12) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        writableNativeMap.putInt("eventKeyAction", i12);
        if (i11 != -1) {
            writableNativeMap.putInt("tag", i11);
        }
        this.f23875b.r("onHWKeyEvent", writableNativeMap);
    }

    public void a() {
        int i11 = this.f23874a;
        if (i11 != -1) {
            b("blur", i11);
        }
        this.f23874a = -1;
    }

    public void d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if (action == 1 || action == 0) {
            Map<Integer, String> map = f23873c;
            if (map.containsKey(Integer.valueOf(keyCode))) {
                c(map.get(Integer.valueOf(keyCode)), this.f23874a, action);
            }
        }
    }

    public void e(View view) {
        if (this.f23874a == view.getId()) {
            return;
        }
        int i11 = this.f23874a;
        if (i11 != -1) {
            b("blur", i11);
        }
        this.f23874a = view.getId();
        b("focus", view.getId());
    }
}
