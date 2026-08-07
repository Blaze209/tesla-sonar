package com.swmansion.reanimated;

import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ReanimatedUIManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.p0;
import com.facebook.react.uimanager.p1;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ReanimatedUIManagerFactory {
    static UIManagerModule create(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i11) {
        p1 p1Var = new p1(list);
        ReanimatedUIManager reanimatedUIManager = new ReanimatedUIManager(reactApplicationContext, list, i11);
        p0 p0Var = new p0(reactApplicationContext, p1Var, reanimatedUIManager.getEventDispatcher(), i11);
        Class superclass = ReanimatedUIManager.class.getSuperclass();
        if (superclass == null) {
            Log.e("reanimated", "unable to resolve super class of ReanimatedUIManager");
            return reanimatedUIManager;
        }
        try {
            Field declaredField = superclass.getDeclaredField("mUIImplementation");
            declaredField.setAccessible(true);
            try {
                Field declaredField2 = Field.class.getDeclaredField("accessFlags");
                declaredField2.setAccessible(true);
                declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            } catch (IllegalAccessException | NoSuchFieldException e11) {
                e11.printStackTrace();
            }
            declaredField.set(reanimatedUIManager, p0Var);
        } catch (IllegalAccessException | NoSuchFieldException e12) {
            e12.printStackTrace();
        }
        return reanimatedUIManager;
    }
}
