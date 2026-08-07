package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.q0;
import com.facebook.react.uimanager.r0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/facebook/react/uimanager/events/m;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "event", "Ljn0/h0;", "b", "(Landroid/view/View;Landroid/view/MotionEvent;)V", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f23178a = new m();

    private m() {
    }

    public static final void a(View view, MotionEvent event) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(event, "event");
        q0 q0VarA = r0.a(view);
        if (q0VarA != null) {
            q0VarA.d(view, event);
        }
    }

    public static final void b(View view, MotionEvent event) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(event, "event");
        q0 q0VarA = r0.a(view);
        if (q0VarA != null) {
            q0VarA.a(view, event);
        }
    }
}
