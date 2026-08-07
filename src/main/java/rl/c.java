package rl;

import android.graphics.Bitmap;
import android.graphics.Rect;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Lrl/c;", "", "", "frameNumber", "Landroid/graphics/Bitmap;", "targetBitmap", "", "a", "(ILandroid/graphics/Bitmap;)Z", "Landroid/graphics/Rect;", "bounds", "Ljn0/h0;", "e", "(Landroid/graphics/Rect;)V", "c", "()I", "intrinsicWidth", DateTokenConverter.CONVERTER_KEY, "intrinsicHeight", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface c {
    boolean a(int frameNumber, Bitmap targetBitmap);

    int c();

    int d();

    void e(Rect bounds);
}
