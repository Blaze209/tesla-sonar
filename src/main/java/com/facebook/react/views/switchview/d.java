package com.facebook.react.views.switchview;

import android.view.View;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.v0;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import com.facebook.yoga.r;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/views/switchview/d;", "Lcom/facebook/react/uimanager/m;", "Lcom/facebook/yoga/o;", "<init>", "()V", "Ljn0/h0;", "b", "Lcom/facebook/yoga/r;", "node", "", Snapshot.WIDTH, "Lcom/facebook/yoga/p;", "widthMode", Snapshot.HEIGHT, "heightMode", "", "a", "(Lcom/facebook/yoga/r;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)J", "", "I", "", "c", "Z", "measured", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean measured;

    public d() {
        b();
    }

    private final void b() {
        setMeasureFunction(this);
    }

    @Override // com.facebook.yoga.o
    public long a(r node, float width, p widthMode, float height, p heightMode) {
        s.k(node, "node");
        s.k(widthMode, "widthMode");
        s.k(heightMode, "heightMode");
        if (!this.measured) {
            v0 themedContext = getThemedContext();
            s.j(themedContext, "getThemedContext(...)");
            a aVar = new a(themedContext);
            aVar.setShowText(false);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            aVar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.width = aVar.getMeasuredWidth();
            this.height = aVar.getMeasuredHeight();
            this.measured = true;
        }
        return q.b(this.width, this.height);
    }
}
