package jt;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Dialog f84334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f84335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f84336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f84337d;

    public a(@NonNull Dialog dialog, @NonNull Rect rect) {
        this.f84334a = dialog;
        this.f84335b = rect.left;
        this.f84336c = rect.top;
        this.f84337d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f84335b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.f84336c + viewFindViewById.getTop();
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i11 = this.f84337d;
            motionEventObtain.setLocation((-i11) - 1, (-i11) - 1);
        }
        view.performClick();
        return this.f84334a.onTouchEvent(motionEventObtain);
    }
}
