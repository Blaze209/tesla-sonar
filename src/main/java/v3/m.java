package v3;

import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\u00020\u00148\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0010\u0010\fR\u001d\u0010\u0019\u001a\u00020\u00178\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0018\u0010\fR0\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8\u0006@@X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010!\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Lv3/m;", "", "", "Lv3/x;", "changes", "Lv3/g;", "internalPointerEvent", "<init>", "(Ljava/util/List;Lv3/g;)V", "(Ljava/util/List;)V", "Lv3/p;", "a", "()I", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lv3/g;", DateTokenConverter.CONVERTER_KEY, "()Lv3/g;", "Lv3/l;", "I", "buttons", "Lv3/j0;", "getKeyboardModifiers-k7X9c1A", "keyboardModifiers", "<set-?>", "e", "f", "g", "(I)V", "type", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<PointerInputChange> changes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g internalPointerEvent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int buttons;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int keyboardModifiers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int type;

    public m(List<PointerInputChange> list, g gVar) {
        this.changes = list;
        this.internalPointerEvent = gVar;
        MotionEvent motionEventE = e();
        this.buttons = l.a(motionEventE != null ? motionEventE.getButtonState() : 0);
        MotionEvent motionEventE2 = e();
        this.keyboardModifiers = j0.b(motionEventE2 != null ? motionEventE2.getMetaState() : 0);
        this.type = a();
    }

    private final int a() {
        MotionEvent motionEventE = e();
        if (motionEventE == null) {
            List<PointerInputChange> list = this.changes;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                PointerInputChange xVar = list.get(i11);
                if (n.d(xVar)) {
                    return p.INSTANCE.e();
                }
                if (n.b(xVar)) {
                    return p.INSTANCE.d();
                }
            }
            return p.INSTANCE.c();
        }
        int actionMasked = motionEventE.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return p.INSTANCE.f();
                        case 9:
                            return p.INSTANCE.a();
                        case 10:
                            return p.INSTANCE.b();
                        default:
                            return p.INSTANCE.g();
                    }
                }
                return p.INSTANCE.c();
            }
            return p.INSTANCE.e();
        }
        return p.INSTANCE.d();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getButtons() {
        return this.buttons;
    }

    public final List<PointerInputChange> c() {
        return this.changes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getInternalPointerEvent() {
        return this.internalPointerEvent;
    }

    public final MotionEvent e() {
        g gVar = this.internalPointerEvent;
        if (gVar != null) {
            return gVar.c();
        }
        return null;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final void g(int i11) {
        this.type = i11;
    }

    public m(List<PointerInputChange> list) {
        this(list, null);
    }
}
