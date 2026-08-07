package com.tesla.godot;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.u;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.l1;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.v0;
import com.facebook.yoga.p;
import com.tesla.logging.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class TMGodotViewManager extends ViewGroupManager<FrameLayout> implements AndroidGodotInterface.AndroidGodotInterfaceListener {
    public static final String REACT_CLASS = "TMGodotView";
    private static final String TAG = "TMGodotViewManager";
    ReactApplicationContext mCallerContext;
    FrameLayout mGodotFrameLayout;
    private final g logger = g.h(TAG);
    private boolean godotViewAttached = false;
    List<String> queuedMessages = new ArrayList();

    public TMGodotViewManager(ReactApplicationContext reactApplicationContext) {
        this.mCallerContext = reactApplicationContext;
    }

    private void processQueuedMessages() {
        Iterator<String> it = this.queuedMessages.iterator();
        while (it.hasNext()) {
            sendMessageToJS(it.next());
        }
        this.queuedMessages.clear();
    }

    private void sendMessageToJS(String str) {
        try {
            com.tesla.logging.a.b(com.tesla.logging.a.EnumC1131a.GODOT_MESSAGE, GodotUtils.convertJsonToMap(new JSONObject(str)));
        } catch (Exception unused) {
            this.logger.j("sendMessageToJS failed to convert json to map");
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void addViews(ViewGroup viewGroup, List list) {
        addViews((FrameLayout) viewGroup, (List<View>) list);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected l1<FrameLayout> getDelegate() {
        this.logger.j("getDelegate");
        return super.getDelegate();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends m> getShadowNodeClass() {
        this.logger.j("getShadowNodeCLass");
        return super.getShadowNodeClass();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.logger.j("initialize");
        super.initialize();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.logger.j("invalidate");
        super.invalidate();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f11, p pVar, float f12, p pVar2, float[] fArr) {
        this.logger.j("measure");
        return super.measure(context, readableMap, readableMap2, readableMap3, f11, pVar, f12, pVar2, fArr);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.i
    public boolean needsCustomLayoutForChildren() {
        this.logger.j("needsCustomLayoutForChildren");
        return super.needsCustomLayoutForChildren();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.logger.j("onCatalystInstanceDestroy");
        super.onCatalystInstanceDestroy();
    }

    @Override // com.tesla.godot.AndroidGodotInterface.AndroidGodotInterfaceListener
    public void onGodotMessage(String str) {
        if (!TMGodot.godotReady() && str.contains("GODOT_READY")) {
            TMGodot.setGodotReady(true);
        }
        try {
            if (new JSONObject(str).getString("type").equals("LOG")) {
                this.logger.j("skipping logged message: " + str);
                return;
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
            this.logger.f("Error constructing JSON of message", e11);
        }
        if (this.godotViewAttached) {
            this.logger.j("sending message to JS: " + str);
            sendMessageToJS(str);
            return;
        }
        this.logger.j("godot not attached, queueing message for JS: " + str);
        this.queuedMessages.add(str);
    }

    public void addViews(FrameLayout frameLayout, List<View> list) {
        this.logger.j("addViews");
        super.addViews(frameLayout, list);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public m createShadowNodeInstance() {
        this.logger.j("createShadowNodeInstance");
        return super.createShadowNodeInstance();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public FrameLayout createView(int i11, @NonNull v0 v0Var, k0 k0Var, u0 u0Var, mo.a aVar) {
        this.logger.j("createView");
        return (FrameLayout) super.createView(i11, v0Var, k0Var, u0Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public FrameLayout createViewInstance(@NonNull v0 v0Var) {
        this.logger.j("createViewInstance");
        TMGodot tMGodot = TMGodot.getInstance(this.mCallerContext);
        if (this.mGodotFrameLayout != null) {
            this.logger.j("returning existing frame layout");
            return this.mGodotFrameLayout;
        }
        Activity currentActivity = v0Var.getCurrentActivity();
        if (currentActivity == null) {
            this.logger.d("returning blank frame layout for null activity", new Throwable("returning blank frame layout for null activity"));
            return new FrameLayout(v0Var);
        }
        FragmentManager supportFragmentManager = ((u) currentActivity).getSupportFragmentManager();
        supportFragmentManager.l1(new FragmentManager.k() { // from class: com.tesla.godot.TMGodotViewManager.1
            @Override // androidx.fragment.app.FragmentManager.k
            public void onFragmentAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
                TMGodotViewManager.this.logger.j("onFragmentAttached");
                fragment.getActivity().getWindow().getDecorView().requestLayout();
                super.onFragmentAttached(fragmentManager, fragment, context);
            }

            @Override // androidx.fragment.app.FragmentManager.k
            public void onFragmentDetached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
                TMGodotViewManager.this.logger.j("onFragmentDetached");
                super.onFragmentDetached(fragmentManager, fragment);
            }

            @Override // androidx.fragment.app.FragmentManager.k
            public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, Bundle bundle) {
                super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
                String tag = fragment.getTag();
                if (tag == null || !tag.equals("godot_fragment")) {
                    return;
                }
                TMGodotViewManager.this.godotViewAttached = true;
            }

            @Override // androidx.fragment.app.FragmentManager.k
            public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                TMGodotViewManager.this.logger.j("onFragmentViewDestroyed");
                super.onFragmentViewDestroyed(fragmentManager, fragment);
            }
        }, false);
        supportFragmentManager.r().e(tMGodot, "godot_fragment").j();
        TMGodot.godotInterface().listener = this;
        processQueuedMessages();
        d.f(v0Var);
        FrameLayout frameLayout = (FrameLayout) tMGodot.getView();
        this.mGodotFrameLayout = frameLayout;
        return frameLayout;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull FrameLayout frameLayout) {
        this.logger.j("onDropViewInstance");
        super.onDropViewInstance(frameLayout);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull FrameLayout frameLayout, String str, ReadableArray readableArray) {
        this.logger.j("receiveCommand");
        super.receiveCommand(frameLayout, str, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public void removeAllViews(FrameLayout frameLayout) {
        this.logger.j("removeAllViews");
        super.removeAllViews((View) frameLayout);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(FrameLayout frameLayout, View view) {
        this.logger.j("removeView");
        super.removeView(frameLayout, view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(FrameLayout frameLayout, View view, int i11) {
        this.logger.j("addView");
        super.addView(frameLayout, view, i11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(FrameLayout frameLayout, int i11) {
        this.logger.j("getChildAt");
        return super.getChildAt(frameLayout, i11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(FrameLayout frameLayout) {
        this.logger.j("getChildCount");
        return super.getChildCount(frameLayout);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(FrameLayout frameLayout, int i11) {
        this.logger.j("removeViewAt");
        super.removeViewAt(frameLayout, i11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(FrameLayout frameLayout, Object obj) {
        this.logger.j("updateExtraData");
        super.updateExtraData(frameLayout, obj);
    }
}
