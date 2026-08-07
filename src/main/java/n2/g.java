package n2;

import android.content.Context;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\f\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\f\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\r*\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001b¨\u0006("}, d2 = {"Ln2/g;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "changed", "", "l", "t", "r", "b", "Ljn0/h0;", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestLayout", "()V", "Ln2/h;", "Ln2/k;", "(Ln2/h;)Ln2/k;", "a", "(Ln2/h;)V", "I", "MaxRippleHosts", "", "Ljava/util/List;", "rippleHosts", "c", "unusedRippleHosts", "Ln2/i;", DateTokenConverter.CONVERTER_KEY, "Ln2/i;", "rippleHostMap", "e", "nextHostIndex", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int MaxRippleHosts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<k> rippleHosts;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<k> unusedRippleHosts;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i rippleHostMap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int nextHostIndex;

    public g(Context context) {
        super(context);
        this.MaxRippleHosts = 5;
        ArrayList arrayList = new ArrayList();
        this.rippleHosts = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new i();
        setClipChildren(false);
        k kVar = new k(context);
        addView(kVar);
        arrayList.add(kVar);
        arrayList2.add(kVar);
        this.nextHostIndex = 1;
        setTag(d3.h.J, Boolean.TRUE);
    }

    public final void a(h hVar) {
        hVar.F1();
        k kVarB = this.rippleHostMap.b(hVar);
        if (kVarB != null) {
            kVarB.d();
            this.rippleHostMap.c(hVar);
            this.unusedRippleHosts.add(kVarB);
        }
    }

    public final k b(h hVar) {
        k kVarB = this.rippleHostMap.b(hVar);
        if (kVarB != null) {
            return kVarB;
        }
        k kVar = (k) v.N(this.unusedRippleHosts);
        if (kVar == null) {
            if (this.nextHostIndex > v.o(this.rippleHosts)) {
                kVar = new k(getContext());
                addView(kVar);
                this.rippleHosts.add(kVar);
            } else {
                kVar = this.rippleHosts.get(this.nextHostIndex);
                h hVarA = this.rippleHostMap.a(kVar);
                if (hVarA != null) {
                    hVarA.F1();
                    this.rippleHostMap.c(hVarA);
                    kVar.d();
                }
            }
            int i11 = this.nextHostIndex;
            if (i11 < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i11 + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        this.rippleHostMap.d(hVar, kVar);
        return kVar;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
    }
}
