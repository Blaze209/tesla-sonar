package com.fourthline.vision.internal;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.fourthline.vision.internal.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4173d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4165c4 f38240a = new C4165c4(0, 0, 0, 0);

    public static final boolean isValid(C4165c4 c4165c4) {
        p013kotlin.jvm.internal.s.k(c4165c4, "<this>");
        return c4165c4.width() > 0 && c4165c4.height() > 0;
    }

    public static final C4165c4 nullableToRectangle(Rect rect) {
        C4165c4 rectangle;
        return (rect == null || (rectangle = toRectangle(rect)) == null) ? f38240a : rectangle;
    }

    public static final C4165c4 toBox(List<C4165c4> list) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        if (list.isEmpty()) {
            return f38240a;
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int left = ((C4165c4) it.next()).getLeft();
        while (it.hasNext()) {
            int left2 = ((C4165c4) it.next()).getLeft();
            if (left > left2) {
                left = left2;
            }
        }
        Iterator<T> it2 = list.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int top = ((C4165c4) it2.next()).getTop();
        while (it2.hasNext()) {
            int top2 = ((C4165c4) it2.next()).getTop();
            if (top > top2) {
                top = top2;
            }
        }
        Iterator<T> it3 = list.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        int right = ((C4165c4) it3.next()).getRight();
        while (it3.hasNext()) {
            int right2 = ((C4165c4) it3.next()).getRight();
            if (right < right2) {
                right = right2;
            }
        }
        Iterator<T> it4 = list.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        int bottom = ((C4165c4) it4.next()).getBottom();
        while (it4.hasNext()) {
            int bottom2 = ((C4165c4) it4.next()).getBottom();
            if (bottom < bottom2) {
                bottom = bottom2;
            }
        }
        return new C4165c4(left, top, right, bottom);
    }

    public static final j3.i toComposeRect(C4165c4 c4165c4) {
        p013kotlin.jvm.internal.s.k(c4165c4, "<this>");
        return j3.j.b(j3.h.a(c4165c4.getLeft(), c4165c4.getTop()), j3.n.a(c4165c4.width(), c4165c4.height()));
    }

    public static final Rect toIntRect(RectF rectF) {
        p013kotlin.jvm.internal.s.k(rectF, "<this>");
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public static final Rect toRect(C4165c4 c4165c4) {
        p013kotlin.jvm.internal.s.k(c4165c4, "<this>");
        return new Rect(c4165c4.getLeft(), c4165c4.getTop(), c4165c4.getRight(), c4165c4.getBottom());
    }

    public static final RectF toRectF(C4165c4 c4165c4) {
        p013kotlin.jvm.internal.s.k(c4165c4, "<this>");
        return toRectF(toRect(c4165c4));
    }

    public static final C4165c4 toRectangle(Rect rect) {
        p013kotlin.jvm.internal.s.k(rect, "<this>");
        return new C4165c4(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final RectF toRectF(Rect rect) {
        p013kotlin.jvm.internal.s.k(rect, "<this>");
        return new RectF(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final C4165c4 toRectangle(RectF rectF) {
        p013kotlin.jvm.internal.s.k(rectF, "<this>");
        return toRectangle(toIntRect(rectF));
    }
}
