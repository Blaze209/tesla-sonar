package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/views/text/b;", "", "<init>", "()V", "", "text", "Landroid/text/Layout;", "layout", "Landroid/text/TextPaint;", "paint", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/bridge/WritableArray;", "a", "(Ljava/lang/CharSequence;Landroid/text/Layout;Landroid/text/TextPaint;Landroid/content/Context;)Lcom/facebook/react/bridge/WritableArray;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f23657a = new b();

    private b() {
    }

    public static final WritableArray a(CharSequence text, Layout layout, TextPaint paint, Context context) {
        s.k(text, "text");
        s.k(layout, "layout");
        s.k(paint, "paint");
        s.k(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        TextPaint textPaint = new TextPaint(paint);
        textPaint.setTextSize(textPaint.getTextSize() * 100.0f);
        Rect rect = new Rect();
        int i11 = 0;
        int i12 = 1;
        textPaint.getTextBounds("T", 0, 1, rect);
        float fHeight = (rect.height() / 100.0f) / displayMetrics.density;
        Rect rect2 = new Rect();
        textPaint.getTextBounds("x", 0, 1, rect2);
        float fHeight2 = (rect2.height() / 100.0f) / displayMetrics.density;
        int lineCount = layout.getLineCount();
        while (i11 < lineCount) {
            float lineWidth = (text.length() <= 0 || text.charAt(layout.getLineEnd(i11) - i12) != '\n') ? layout.getLineWidth(i11) : layout.getLineMax(i11);
            Rect rect3 = new Rect();
            layout.getLineBounds(i11, rect3);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("x", layout.getLineLeft(i11) / displayMetrics.density);
            writableMapCreateMap.putDouble("y", rect3.top / displayMetrics.density);
            writableMapCreateMap.putDouble(Snapshot.WIDTH, lineWidth / displayMetrics.density);
            writableMapCreateMap.putDouble(Snapshot.HEIGHT, rect3.height() / displayMetrics.density);
            writableMapCreateMap.putDouble("descender", layout.getLineDescent(i11) / displayMetrics.density);
            writableMapCreateMap.putDouble("ascender", (-layout.getLineAscent(i11)) / displayMetrics.density);
            writableMapCreateMap.putDouble("baseline", layout.getLineBaseline(i11) / displayMetrics.density);
            writableMapCreateMap.putDouble("capHeight", fHeight);
            writableMapCreateMap.putDouble("xHeight", fHeight2);
            writableMapCreateMap.putString("text", text.subSequence(layout.getLineStart(i11), layout.getLineEnd(i11)).toString());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
            i11++;
            i12 = 1;
        }
        s.h(writableArrayCreateArray);
        return writableArrayCreateArray;
    }
}
