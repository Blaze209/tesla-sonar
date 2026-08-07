package ap;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0015\u0010\u0019R\"\u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u0010\u0010\u0006¨\u0006\u001d"}, d2 = {"Lap/f;", "Landroid/text/style/ClickableSpan;", "Lap/i;", "", "reactTag", "<init>", "(I)V", "Landroid/view/View;", "view", "Ljn0/h0;", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "I", "getReactTag", "()I", "", "b", "Z", "isKeyboardFocused", "()Z", "(Z)V", "c", "getFocusBgColor", "focusBgColor", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends ClickableSpan implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int reactTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isKeyboardFocused;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int focusBgColor;

    public f(int i11) {
        this.reactTag = i11;
    }

    public final void a(int i11) {
        this.focusBgColor = i11;
    }

    public final void b(boolean z11) {
        this.isKeyboardFocused = z11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        s.k(view, "view");
        Context context = view.getContext();
        s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcherC = b1.c(reactContext, this.reactTag);
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new com.facebook.react.views.view.h(b1.e(reactContext), this.reactTag));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds2) {
        s.k(ds2, "ds");
        if (this.isKeyboardFocused) {
            ds2.bgColor = this.focusBgColor;
        }
    }
}
