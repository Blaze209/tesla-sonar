package z5;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f126981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AccessibilityNodeInfoCompat f126982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f126983c;

    public a(int i11, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i12) {
        this.f126981a = i11;
        this.f126982b = accessibilityNodeInfoCompat;
        this.f126983c = i12;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f126981a);
        this.f126982b.i0(this.f126983c, bundle);
    }
}
