package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* JADX INFO: loaded from: classes6.dex */
@xn.a(name = "RNSVGSvgViewModule")
class SvgViewModule extends NativeSvgViewModuleSpec {
    public static final String NAME = "RNSVGSvgViewModule";

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f45291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableMap f45292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callback f45293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f45294d;

        /* JADX INFO: renamed from: com.horcrux.svg.SvgViewModule$a$a, reason: collision with other inner class name */
        class RunnableC0709a implements Runnable {

            /* JADX INFO: renamed from: com.horcrux.svg.SvgViewModule$a$a$a, reason: collision with other inner class name */
            class RunnableC0710a implements Runnable {
                RunnableC0710a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    SvgViewModule.toDataURL(aVar.f45291a, aVar.f45292b, aVar.f45293c, aVar.f45294d + 1);
                }
            }

            RunnableC0709a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(a.this.f45291a);
                if (svgViewByTag == null) {
                    return;
                }
                svgViewByTag.setToDataUrlTask(new RunnableC0710a());
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                SvgViewModule.toDataURL(aVar.f45291a, aVar.f45292b, aVar.f45293c, aVar.f45294d + 1);
            }
        }

        a(int i11, ReadableMap readableMap, Callback callback, int i12) {
            this.f45291a = i11;
            this.f45292b = readableMap;
            this.f45293c = callback;
            this.f45294d = i12;
        }

        @Override // java.lang.Runnable
        public void run() {
            SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(this.f45291a);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(this.f45291a, new RunnableC0709a());
                return;
            }
            if (svgViewByTag.notRendered()) {
                svgViewByTag.setToDataUrlTask(new b());
                return;
            }
            ReadableMap readableMap = this.f45292b;
            if (readableMap != null) {
                this.f45293c.invoke(svgViewByTag.toDataURL(readableMap.getInt(Snapshot.WIDTH), this.f45292b.getInt(Snapshot.HEIGHT)));
            } else {
                this.f45293c.invoke(svgViewByTag.toDataURL());
            }
        }
    }

    SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toDataURL(int i11, ReadableMap readableMap, Callback callback, int i12) {
        UiThreadUtil.runOnUiThread(new a(i11, readableMap, callback, i12));
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGSvgViewModule";
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec
    @ReactMethod
    public void toDataURL(Double d11, ReadableMap readableMap, Callback callback) {
        toDataURL(d11.intValue(), readableMap, callback, 0);
    }
}
