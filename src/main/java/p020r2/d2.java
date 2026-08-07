package p020r2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lr2/d2;", "", "", "", "list", "<init>", "(Ljava/util/List;)V", "value", "Ljn0/h0;", "a", "(I)V", "", "b", "()Z", "c", "()I", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> list;

    public d2(List<Integer> list) {
        this.list = list;
    }

    public final void a(int value) {
        if (!this.list.isEmpty()) {
            if (this.list.get(0).intValue() == value) {
                return;
            }
            List<Integer> list = this.list;
            if (list.get(list.size() - 1).intValue() == value) {
                return;
            }
        }
        int size = this.list.size();
        this.list.add(Integer.valueOf(value));
        while (size > 0) {
            int i11 = ((size + 1) >>> 1) - 1;
            int iIntValue = this.list.get(i11).intValue();
            if (value <= iIntValue) {
                break;
            }
            this.list.set(size, Integer.valueOf(iIntValue));
            size = i11;
        }
        this.list.set(size, Integer.valueOf(value));
    }

    public final boolean b() {
        return !this.list.isEmpty();
    }

    public final int c() {
        return ((Number) v.o0(this.list)).intValue();
    }

    public final int d() {
        int iIntValue;
        if (!(this.list.size() > 0)) {
            o.s("Set is empty");
        }
        int iIntValue2 = this.list.get(0).intValue();
        while (!this.list.isEmpty() && this.list.get(0).intValue() == iIntValue2) {
            List<Integer> list = this.list;
            list.set(0, (Integer) v.A0(list));
            List<Integer> list2 = this.list;
            list2.remove(list2.size() - 1);
            int size = this.list.size();
            int size2 = this.list.size() >>> 1;
            int i11 = 0;
            while (i11 < size2) {
                int iIntValue3 = this.list.get(i11).intValue();
                int i12 = (i11 + 1) * 2;
                int i13 = i12 - 1;
                int iIntValue4 = this.list.get(i13).intValue();
                if (i12 < size && (iIntValue = this.list.get(i12).intValue()) > iIntValue4) {
                    if (iIntValue <= iIntValue3) {
                        break;
                    }
                    this.list.set(i11, Integer.valueOf(iIntValue));
                    this.list.set(i12, Integer.valueOf(iIntValue3));
                    i11 = i12;
                } else {
                    if (iIntValue4 <= iIntValue3) {
                        break;
                    }
                    this.list.set(i11, Integer.valueOf(iIntValue4));
                    this.list.set(i13, Integer.valueOf(iIntValue3));
                    i11 = i13;
                }
            }
        }
        return iIntValue2;
    }

    public /* synthetic */ d2(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ArrayList() : list);
    }
}
