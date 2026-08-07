package oo;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Loo/a;", "", "<init>", "()V", "", "viewTag", "a", "(I)I", "Landroid/view/View;", "view", "c", "(Landroid/view/View;)I", "surfaceId", "b", "(II)I", "", DateTokenConverter.CONVERTER_KEY, "(I)Z", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f98184a = new a();

    private a() {
    }

    public static final int a(int viewTag) {
        return viewTag % 2 == 0 ? 2 : 1;
    }

    public static final int b(int viewTag, int surfaceId) {
        int i11 = surfaceId == -1 ? 1 : 2;
        if (i11 == 1 && !d(viewTag) && viewTag % 2 == 0) {
            return 2;
        }
        return i11;
    }

    public static final int c(View view) {
        s.k(view, "view");
        return a(view.getId());
    }

    @e
    public static final boolean d(int viewTag) {
        return viewTag % 10 == 1;
    }
}
