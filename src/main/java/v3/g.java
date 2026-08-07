package v3;

import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lv3/g;", "", "Landroidx/collection/v;", "Lv3/x;", "changes", "Lv3/z;", "pointerInputEvent", "<init>", "(Landroidx/collection/v;Lv3/z;)V", "Lv3/w;", "pointerId", "", "a", "(J)Z", "Landroidx/collection/v;", "b", "()Landroidx/collection/v;", "Lv3/z;", "getPointerInputEvent", "()Lv3/z;", "c", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "e", "(Z)V", "suppressMovementConsumption", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.collection.v<PointerInputChange> changes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z pointerInputEvent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean suppressMovementConsumption;

    public g(androidx.collection.v<PointerInputChange> vVar, z zVar) {
        this.changes = vVar;
        this.pointerInputEvent = zVar;
    }

    public final boolean a(long pointerId) {
        PointerInputEventData pointerInputEventData;
        List<PointerInputEventData> listB = this.pointerInputEvent.b();
        int size = listB.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                pointerInputEventData = null;
                break;
            }
            pointerInputEventData = listB.get(i11);
            if (w.d(pointerInputEventData.getId(), pointerId)) {
                break;
            }
            i11++;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            return pointerInputEventData2.getActiveHover();
        }
        return false;
    }

    public final androidx.collection.v<PointerInputChange> b() {
        return this.changes;
    }

    public final MotionEvent c() {
        return this.pointerInputEvent.getMotionEvent();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    public final void e(boolean z11) {
        this.suppressMovementConsumption = z11;
    }
}
