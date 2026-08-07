package p007h2;

import androidx.compose.ui.platform.e3;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import v3.PointerInputChange;
import v3.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lh2/d;", "", "Landroidx/compose/ui/platform/e3;", "viewConfiguration", "<init>", "(Landroidx/compose/ui/platform/e3;)V", "Lv3/m;", "event", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lv3/m;)V", "Lv3/x;", "prevClick", "newClick", "", "c", "(Lv3/x;Lv3/x;)Z", "b", "a", "Landroidx/compose/ui/platform/e3;", "", "I", "()I", "setClicks", "(I)V", "clicks", "Lv3/x;", "getPrevClick", "()Lv3/x;", "setPrevClick", "(Lv3/x;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e3 viewConfiguration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int clicks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private PointerInputChange prevClick;

    public d(e3 e3Var) {
        this.viewConfiguration = e3Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getClicks() {
        return this.clicks;
    }

    public final boolean b(PointerInputChange prevClick, PointerInputChange newClick) {
        return u.f(this.viewConfiguration, prevClick, newClick);
    }

    public final boolean c(PointerInputChange prevClick, PointerInputChange newClick) {
        return newClick.getUptimeMillis() - prevClick.getUptimeMillis() < this.viewConfiguration.e();
    }

    public final void d(m event) {
        PointerInputChange pointerInputChange = this.prevClick;
        PointerInputChange pointerInputChange2 = event.c().get(0);
        if (pointerInputChange != null && c(pointerInputChange, pointerInputChange2) && b(pointerInputChange, pointerInputChange2)) {
            this.clicks++;
        } else {
            this.clicks = 1;
        }
        this.prevClick = pointerInputChange2;
    }
}
