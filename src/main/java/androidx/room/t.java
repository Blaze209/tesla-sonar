package androidx.room;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/room/t;", "", "Landroidx/room/p$b;", "observer", "", "tableIds", "", "", "tableNames", "<init>", "(Landroidx/room/p$b;[I[Ljava/lang/String;)V", "", "", "invalidatedTablesIds", "Ljn0/h0;", "c", "(Ljava/util/Set;)V", "invalidatedTablesNames", DateTokenConverter.CONVERTER_KEY, "a", "Landroidx/room/p$b;", "()Landroidx/room/p$b;", "b", "[I", "()[I", "[Ljava/lang/String;", "Ljava/util/Set;", "singleTableSet", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p.b observer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int[] tableIds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String[] tableNames;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Set<String> singleTableSet;

    public t(p.b observer, int[] tableIds, String[] tableNames) {
        p013kotlin.jvm.internal.s.k(observer, "observer");
        p013kotlin.jvm.internal.s.k(tableIds, "tableIds");
        p013kotlin.jvm.internal.s.k(tableNames, "tableNames");
        this.observer = observer;
        this.tableIds = tableIds;
        this.tableNames = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.singleTableSet = !(tableNames.length == 0) ? d1.c(tableNames[0]) : d1.d();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p.b getObserver() {
        return this.observer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int[] getTableIds() {
        return this.tableIds;
    }

    public final void c(Set<Integer> invalidatedTablesIds) {
        Set<String> setD;
        p013kotlin.jvm.internal.s.k(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.tableIds;
        int length = iArr.length;
        if (length != 0) {
            int i11 = 0;
            if (length != 1) {
                Set setB = d1.b();
                int[] iArr2 = this.tableIds;
                int length2 = iArr2.length;
                int i12 = 0;
                while (i11 < length2) {
                    int i13 = i12 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i11]))) {
                        setB.add(this.tableNames[i12]);
                    }
                    i11++;
                    i12 = i13;
                }
                setD = d1.a(setB);
            } else {
                setD = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : d1.d();
            }
        } else {
            setD = d1.d();
        }
        if (setD.isEmpty()) {
            return;
        }
        this.observer.c(setD);
    }

    public final void d(Set<String> invalidatedTablesNames) {
        Set<String> setD;
        p013kotlin.jvm.internal.s.k(invalidatedTablesNames, "invalidatedTablesNames");
        int length = this.tableNames.length;
        if (length == 0) {
            setD = d1.d();
        } else if (length == 1) {
            Set<String> set = invalidatedTablesNames;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (p013kotlin.text.t.M((String) it.next(), this.tableNames[0], true)) {
                            setD = this.singleTableSet;
                            break;
                        }
                    } else {
                        setD = d1.d();
                        break;
                    }
                }
            } else {
                setD = d1.d();
                break;
            }
        } else {
            Set setB = d1.b();
            for (String str : invalidatedTablesNames) {
                for (String str2 : this.tableNames) {
                    if (p013kotlin.text.t.M(str2, str, true)) {
                        setB.add(str2);
                        break;
                    }
                }
            }
            setD = d1.a(setB);
        }
        if (setD.isEmpty()) {
            return;
        }
        this.observer.c(setD);
    }
}
