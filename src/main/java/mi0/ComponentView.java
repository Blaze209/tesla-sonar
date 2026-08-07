package mi0;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import oi0.n5;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: mi0.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lmi0/a;", "", "Loi0/n5;", "component", "Landroid/view/View;", "view", "<init>", "(Loi0/n5;Landroid/view/View;)V", "a", "()Loi0/n5;", "b", "()Landroid/view/View;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loi0/n5;", "c", "Landroid/view/View;", DateTokenConverter.CONVERTER_KEY, "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ComponentView {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final n5 component;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final View view;

    public ComponentView(n5 component, View view) {
        s.k(component, "component");
        s.k(view, "view");
        this.component = component;
        this.view = view;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final n5 getComponent() {
        return this.component;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final n5 c() {
        return this.component;
    }

    public final View d() {
        return this.view;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComponentView)) {
            return false;
        }
        ComponentView componentView = (ComponentView) other;
        return s.f(this.component, componentView.component) && s.f(this.view, componentView.view);
    }

    public int hashCode() {
        return (this.component.hashCode() * 31) + this.view.hashCode();
    }

    public String toString() {
        return "ComponentView(component=" + this.component + ", view=" + this.view + ")";
    }
}
