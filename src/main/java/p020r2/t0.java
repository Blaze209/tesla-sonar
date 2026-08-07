package p020r2;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Kind;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u001d\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR6\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001ej\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010+\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lr2/t0;", "", "f", "()Lr2/t0;", Kind.GROUP, "Ljn0/h0;", "a", "(Ljava/lang/Object;)V", "Lr2/d;", "anchor", "", "e", "(Lr2/d;)Z", "Lr2/d3;", "writer", "", IntegerTokenConverter.CONVERTER_KEY, "(Lr2/d3;I)V", "Lr2/a3;", "table", "h", "(Lr2/a3;I)V", "predecessor", "b", "(Lr2/d3;II)V", "g", "I", DateTokenConverter.CONVERTER_KEY, "()I", Action.KEY_ATTRIBUTE, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "c", "()Ljava/util/ArrayList;", "setGroups", "(Ljava/util/ArrayList;)V", "groups", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ArrayList<Object> groups;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    private final void a(Object group) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.groups = arrayList;
        arrayList.add(group);
    }

    private final boolean e(d anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = arrayList.get(i11);
                if (s.f(obj, anchor)) {
                    return true;
                }
                if ((obj instanceof t0) && ((t0) obj).e(anchor)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final t0 f() {
        Object obj;
        t0 t0VarF;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            obj = null;
            break;
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                obj = null;
                break;
            }
            obj = arrayList.get(size);
            if ((obj instanceof t0) && !((t0) obj).closed) {
                break;
            }
            size--;
        }
        t0 t0Var = obj instanceof t0 ? (t0) obj : null;
        return (t0Var == null || (t0VarF = t0Var.f()) == null) ? this : t0VarF;
    }

    public final void b(SlotWriter writer, int predecessor, int group) {
        d dVarO1;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.groups = arrayList;
        }
        int i11 = 0;
        if (predecessor >= 0 && (dVarO1 = writer.o1(predecessor)) != null) {
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                if (!s.f(obj, dVarO1) && (!(obj instanceof t0) || !((t0) obj).e(dVarO1))) {
                    i11++;
                }
            }
            i11 = -1;
        }
        arrayList.add(i11, writer.E(group));
    }

    public final ArrayList<Object> c() {
        return this.groups;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getKey() {
        return this.key;
    }

    public final boolean g(d anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof d) {
                    if (s.f(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof t0) && !((t0) obj).g(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.groups = null;
                return false;
            }
        }
        return true;
    }

    public final void h(a3 table, int group) {
        f().a(table.b(group));
    }

    public final void i(SlotWriter writer, int group) {
        f().a(writer.E(group));
    }
}
