package com.ijzerenhein.sharedelement;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.t;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, f> f45585a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t f45586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f45587c;

    g(Context context) {
        this.f45587c = context;
    }

    f a(int i11, View view, boolean z11, View view2, ReadableMap readableMap) {
        synchronized (this.f45585a) {
            try {
                f fVar = this.f45585a.get(Integer.valueOf(i11));
                if (fVar != null) {
                    fVar.h();
                    return fVar;
                }
                f fVar2 = new f(this.f45587c, i11, view, z11, view2, readableMap);
                this.f45585a.put(Integer.valueOf(i11), fVar2);
                return fVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    t b() {
        return this.f45586b;
    }

    int c(f fVar) {
        int iO;
        synchronized (this.f45585a) {
            try {
                iO = fVar.o();
                if (iO == 0) {
                    this.f45585a.remove(Integer.valueOf(fVar.l()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iO;
    }

    void d(t tVar) {
        this.f45586b = tVar;
    }
}
