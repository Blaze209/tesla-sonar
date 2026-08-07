package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.uimanager.m;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import com.facebook.yoga.r;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.HashSet;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R.\u0010 \u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/facebook/react/views/progressbar/b;", "Lcom/facebook/react/uimanager/m;", "Lcom/facebook/yoga/o;", "<init>", "()V", "Lcom/facebook/yoga/r;", "node", "", Snapshot.WIDTH, "Lcom/facebook/yoga/p;", "widthMode", Snapshot.HEIGHT, "heightMode", "", "a", "(Lcom/facebook/yoga/r;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)J", "Landroid/util/SparseIntArray;", "Landroid/util/SparseIntArray;", "b", "", "", "c", "Ljava/util/Set;", "measured", "", "value", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getStyle", "()Ljava/lang/String;", "setStyle", "(Ljava/lang/String;)V", "style", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SparseIntArray height = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SparseIntArray width = new SparseIntArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<Integer> measured = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String style;

    public b() {
        setMeasureFunction(this);
        this.style = ReactProgressBarViewManager.DEFAULT_STYLE;
    }

    @Override // com.facebook.yoga.o
    public long a(r node, float width, p widthMode, float height, p heightMode) {
        s.k(node, "node");
        s.k(widthMode, "widthMode");
        s.k(heightMode, "heightMode");
        ReactProgressBarViewManager.Companion aVar = ReactProgressBarViewManager.INSTANCE;
        int iB = aVar.b(this.style);
        if (!this.measured.contains(Integer.valueOf(iB))) {
            ProgressBar progressBarA = aVar.a(getThemedContext(), iB);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            progressBarA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.height.put(iB, progressBarA.getMeasuredHeight());
            this.width.put(iB, progressBarA.getMeasuredWidth());
            this.measured.add(Integer.valueOf(iB));
        }
        return q.b(this.width.get(iB), this.height.get(iB));
    }

    @no.a(name = ReactProgressBarViewManager.PROP_STYLE)
    public final void setStyle(String str) {
        if (str == null) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        this.style = str;
    }
}
