package org.godotengine.godot.input;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.input.InputManager;
import android.os.Handler;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@TargetApi(16)
public class InputManagerV16 implements InputManagerCompat {
    private final InputManager mInputManager;
    private final Map<InputManagerCompat.InputDeviceListener, V16InputDeviceListener> mListeners = new HashMap();

    static class V16InputDeviceListener implements InputManager.InputDeviceListener {
        final InputManagerCompat.InputDeviceListener mIDL;

        public V16InputDeviceListener(InputManagerCompat.InputDeviceListener inputDeviceListener) {
            this.mIDL = inputDeviceListener;
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceAdded(int i11) {
            this.mIDL.onInputDeviceAdded(i11);
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceChanged(int i11) {
            this.mIDL.onInputDeviceChanged(i11);
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceRemoved(int i11) {
            this.mIDL.onInputDeviceRemoved(i11);
        }
    }

    public InputManagerV16(Context context) {
        this.mInputManager = (InputManager) context.getSystemService("input");
    }

    @Override // org.godotengine.godot.input.InputManagerCompat
    public InputDevice getInputDevice(int i11) {
        return this.mInputManager.getInputDevice(i11);
    }

    @Override // org.godotengine.godot.input.InputManagerCompat
    public int[] getInputDeviceIds() {
        return this.mInputManager.getInputDeviceIds();
    }

    @Override // org.godotengine.godot.input.InputManagerCompat
    public void onGenericMotionEvent(MotionEvent motionEvent) {
    }

    @Override // org.godotengine.godot.input.InputManagerCompat
    public void onPause() {
    }

    @Override // org.godotengine.godot.input.InputManagerCompat
    public void onResume() {
    }

    @Override // org.godotengine.godot.input.InputManagerCompat
    public void registerInputDeviceListener(InputManagerCompat.InputDeviceListener inputDeviceListener, Handler handler) {
        V16InputDeviceListener v16InputDeviceListener = new V16InputDeviceListener(inputDeviceListener);
        this.mInputManager.registerInputDeviceListener(v16InputDeviceListener, handler);
        this.mListeners.put(inputDeviceListener, v16InputDeviceListener);
    }

    @Override // org.godotengine.godot.input.InputManagerCompat
    public void unregisterInputDeviceListener(InputManagerCompat.InputDeviceListener inputDeviceListener) {
        V16InputDeviceListener v16InputDeviceListenerRemove = this.mListeners.remove(inputDeviceListener);
        if (v16InputDeviceListenerRemove != null) {
            this.mInputManager.unregisterInputDeviceListener(v16InputDeviceListenerRemove);
        }
    }
}
