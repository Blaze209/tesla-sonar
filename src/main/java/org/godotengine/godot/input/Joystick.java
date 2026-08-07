package org.godotengine.godot.input;

import android.view.InputDevice;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
class Joystick {
    ArrayList<InputDevice.MotionRange> axes;
    int device_id;
    ArrayList<InputDevice.MotionRange> hats;
    String name;

    Joystick() {
    }
}
