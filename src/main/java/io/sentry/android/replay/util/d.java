package io.sentry.android.replay.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0014\u0010&\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lio/sentry/android/replay/util/d;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", "bottomRightLabel", "", "x", "y", "Ljn0/h0;", "a", "(Landroid/graphics/Canvas;Ljava/lang/String;FF)V", "draw", "(Landroid/graphics/Canvas;)V", "", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "", "Landroid/graphics/Rect;", "masks", "b", "(Ljava/util/List;)V", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", Gender.FEMALE, "padding", "c", "Landroid/graphics/Rect;", "tmpRect", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "e", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends Drawable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f80168f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f80169g = Color.argb(32, 255, 20, 20);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f80170h = Color.argb(128, 255, 20, 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Paint paint = new Paint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float padding = 6.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Rect tmpRect = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private List<Rect> masks = v.m();

    private final void a(Canvas canvas, String bottomRightLabel, float x11, float y11) {
        this.paint.setColor(-1);
        this.paint.setStyle(Paint.Style.STROKE);
        canvas.drawText(bottomRightLabel, x11, y11, this.paint);
        this.paint.setColor(-16777216);
        this.paint.setStyle(Paint.Style.FILL);
        canvas.drawText(bottomRightLabel, x11, y11, this.paint);
    }

    public final void b(List<Rect> masks) {
        s.k(masks, "masks");
        this.masks = masks;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        s.k(canvas, "canvas");
        this.paint.setTextSize(32.0f);
        this.paint.setColor(-16777216);
        this.paint.setStrokeWidth(6.0f);
        for (Rect rect : this.masks) {
            this.paint.setColor(f80169g);
            this.paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(rect, this.paint);
            this.paint.setColor(f80170h);
            this.paint.setStyle(Paint.Style.STROKE);
            canvas.drawRect(rect, this.paint);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(rect.left);
            sb2.append('/');
            sb2.append(rect.top);
            String string = sb2.toString();
            this.paint.getTextBounds(string, 0, string.length(), this.tmpRect);
            a(canvas, string, rect.left, rect.top);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(rect.right);
            sb3.append('/');
            sb3.append(rect.bottom);
            String string2 = sb3.toString();
            this.paint.getTextBounds(string2, 0, string2.length(), this.tmpRect);
            a(canvas, string2, rect.right - this.tmpRect.width(), rect.bottom + this.tmpRect.height());
        }
    }

    @Override // android.graphics.drawable.Drawable
    @jn0.e
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
