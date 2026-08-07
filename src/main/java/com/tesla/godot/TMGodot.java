package com.tesla.godot;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.tesla.logging.g;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kd0.e;
import nc0.l;
import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPluginRegistry;

/* JADX INFO: loaded from: classes8.dex */
public class TMGodot extends Godot {
    private static WeakReference<Listener> _listener;

    @SuppressLint({"StaticFieldLeak"})
    private static TMGodot instance;
    private ReactApplicationContext react;
    private static final String TAG = "TMGodot";
    private static final g logger = g.h(TAG);
    private static final Collection<String> _queuedMessages = new ConcurrentLinkedQueue();
    private static boolean _godotReady = false;

    public interface Listener {
        void onGodotReady();
    }

    public static void clearQueuedMessages() {
        _queuedMessages.clear();
    }

    public static TMGodot getInstance(ReactApplicationContext reactApplicationContext) {
        if (instance == null) {
            e.f().l(l.GODOT_INITIALIZATION, Collections.EMPTY_LIST);
            g gVar = logger;
            gVar.j("initializing Godot " + Thread.currentThread());
            if (!UiThreadUtil.isOnUiThread()) {
                gVar.c("Godot initialized on non UI thread");
            }
            instance = new TMGodot();
        }
        TMGodot tMGodot = instance;
        tMGodot.react = reactApplicationContext;
        return tMGodot;
    }

    public static Collection<String> getQueuedMessages() {
        return _queuedMessages;
    }

    public static AndroidGodotInterface godotInterface() {
        return (AndroidGodotInterface) GodotPluginRegistry.getPluginRegistry().getPlugin("AndroidGodotInterface");
    }

    public static boolean godotReady() {
        return _godotReady;
    }

    public static void queueMessage(String str) {
        _queuedMessages.add(str);
    }

    public static void sendMessageToGodot(final String str) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.tesla.godot.a
            @Override // java.lang.Runnable
            public final void run() {
                TMGodot.godotInterface().addMessage(str);
            }
        });
    }

    public static void setGodotReady(boolean z11) {
        e eVarF = e.f();
        l lVar = l.GODOT_INITIALIZATION;
        List<kd0.a> list = Collections.EMPTY_LIST;
        eVarF.k(lVar, list, list);
        _godotReady = z11;
        WeakReference<Listener> weakReference = _listener;
        if (weakReference != null) {
            weakReference.get().onGodotReady();
        }
    }

    public static void setListener(Listener listener) {
        _listener = new WeakReference<>(listener);
    }

    @Override // org.godotengine.godot.Godot
    protected String[] getCommandLine() {
        String[] commandLine = super.getCommandLine();
        String[] strArr = new String[commandLine.length + 2];
        System.arraycopy(commandLine, 0, strArr, 0, commandLine.length);
        strArr[commandLine.length] = "--audio-driver";
        strArr[commandLine.length + 1] = "Dummy";
        return strArr;
    }

    @Override // androidx.fragment.app.Fragment
    public View getView() {
        logger.a("getView");
        return super.getView();
    }

    @Override // org.godotengine.godot.Godot
    public boolean gotTouchEvent(MotionEvent motionEvent) {
        logger.a("gotTouchEvent");
        return super.gotTouchEvent(motionEvent);
    }

    @Override // org.godotengine.godot.Godot, androidx.fragment.app.Fragment
    public void onActivityResult(int i11, int i12, Intent intent) {
        logger.a("onActivityResult");
        super.onActivityResult(i11, i12, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        logger.a("onAttach");
        super.onAttach(context);
    }

    @Override // org.godotengine.godot.Godot
    public void onBackPressed() {
        this.react.getCurrentActivity().onBackPressed();
        logger.a("onBackPressed");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        logger.a("onConfigurationChanged");
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        logger.a("onCreate");
        super.onCreate(bundle);
    }

    @Override // org.godotengine.godot.Godot, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        logger.a("onCreateView");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // org.godotengine.godot.Godot, androidx.fragment.app.Fragment
    public void onDestroy() {
        logger.a("onDestroy");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        logger.a("onDestroyView");
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        logger.a("onDetach");
        super.onDetach();
    }

    @Override // org.godotengine.godot.Godot
    protected void onGodotMainLoopStarted() {
        logger.a("onGodotMainLoopStarted");
        super.onGodotMainLoopStarted();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z11) {
        logger.a("onHiddenChanged");
        super.onHiddenChanged(z11);
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, Bundle bundle) {
        logger.a("onInflate");
        super.onInflate(context, attributeSet, bundle);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        logger.a("onLowMemory");
        super.onLowMemory();
    }

    @Override // org.godotengine.godot.Godot
    public void onNewIntent(Intent intent) {
        logger.a("onNewIntent");
        super.onNewIntent(intent);
    }

    @Override // org.godotengine.godot.Godot, androidx.fragment.app.Fragment
    public void onPause() {
        logger.a("onPause");
        super.onPause();
    }

    @Override // org.godotengine.godot.Godot, androidx.fragment.app.Fragment
    public void onResume() {
        logger.a("onResume");
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        logger.a("onSaveInstanceState");
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        logger.a("onStart");
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        logger.a("onStop");
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, Bundle bundle) {
        logger.a("onViewCreated");
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        logger.a("onViewStateRestored");
        super.onViewStateRestored(bundle);
    }

    @Override // org.godotengine.godot.Godot
    public void restart() {
        logger.a("restart");
        super.restart();
    }

    @Override // org.godotengine.godot.Godot
    public void setKeepScreenOn(boolean z11) {
        logger.a("setKeepScreenOn");
        super.setKeepScreenOn(z11);
    }

    @Override // androidx.fragment.app.Fragment
    public void startActivity(Intent intent) {
        logger.a("startActivity");
        super.startActivity(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void startActivity(Intent intent, Bundle bundle) {
        logger.a("startActivity 2");
        super.startActivity(intent, bundle);
    }
}
