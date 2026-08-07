package org.godotengine.godot.input;

import android.content.Context;
import android.os.Handler;
import android.view.InputDevice;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes10.dex */
public interface InputManagerCompat {

    public static class Factory {
        public static InputManagerCompat getInputManager(Context context) {
            return new InputManagerV16(context);
        }
    }

    public interface InputDeviceListener {
        void onInputDeviceAdded(int i11);

        void onInputDeviceChanged(int i11);

        void onInputDeviceRemoved(int i11);
    }

    InputDevice getInputDevice(int i11);

    int[] getInputDeviceIds();

    void onGenericMotionEvent(MotionEvent motionEvent);

    void onPause();

    void onResume();

    void registerInputDeviceListener(InputDeviceListener inputDeviceListener, Handler handler);

    void unregisterInputDeviceListener(InputDeviceListener inputDeviceListener);
}
