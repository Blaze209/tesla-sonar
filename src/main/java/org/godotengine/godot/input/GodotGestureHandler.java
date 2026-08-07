package org.godotengine.godot.input;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.godotengine.godot.GodotLib;
import org.godotengine.godot.GodotView;

/* JADX INFO: loaded from: classes10.dex */
public class GodotGestureHandler extends GestureDetector.SimpleOnGestureListener {
    private final GodotView godotView;

    public GodotGestureHandler(GodotView godotView) {
        this.godotView = godotView;
    }

    private void queueEvent(Runnable runnable) {
        this.godotView.queueEvent(runnable);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        final int iRound = Math.round(motionEvent.getX());
        final int iRound2 = Math.round(motionEvent.getY());
        queueEvent(new Runnable() { // from class: org.godotengine.godot.input.GodotGestureHandler.1
            @Override // java.lang.Runnable
            public void run() {
                GodotLib.doubletap(iRound, iRound2);
            }
        });
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        super.onDown(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        final int iRound = Math.round(f11);
        final int iRound2 = Math.round(f12);
        queueEvent(new Runnable() { // from class: org.godotengine.godot.input.GodotGestureHandler.2
            @Override // java.lang.Runnable
            public void run() {
                GodotLib.scroll(iRound, iRound2);
            }
        });
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        super.onSingleTapConfirmed(motionEvent);
        return true;
    }
}
