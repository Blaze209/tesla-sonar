package com.facebook.react.views.debuggingoverlay;

import android.graphics.RectF;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/views/debuggingoverlay/c;", "", "", "id", "Landroid/graphics/RectF;", "rectangle", "color", "<init>", "(ILandroid/graphics/RectF;I)V", "a", "I", "b", "()I", "Landroid/graphics/RectF;", "c", "()Landroid/graphics/RectF;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final RectF rectangle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int color;

    public c(int i11, RectF rectangle, int i12) {
        s.k(rectangle, "rectangle");
        this.id = i11;
        this.rectangle = rectangle;
        this.color = i12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final RectF getRectangle() {
        return this.rectangle;
    }
}
