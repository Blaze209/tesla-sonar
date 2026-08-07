package p80;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\nB\u0019\b\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lp80/d;", "Lp80/m;", "", "Lp80/l;", "securityChecks", "<init>", "(Ljava/util/List;)V", "Lp80/n;", "getWarnings", "()Ljava/util/List;", "a", "Ljava/util/List;", "b", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f101948b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<l> f101949c = v.p(new l.c(), new l.d(), new l.b(), new l.a(false, 1, null), new l.e());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<l> securityChecks;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp80/d$a;", "", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends l> securityChecks) {
        s.k(securityChecks, "securityChecks");
        this.securityChecks = securityChecks;
    }

    @Override // p80.m
    public List<Warning> getWarnings() {
        List<l> list = this.securityChecks;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((l) obj).getIsDebuggerConnected()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((l) it.next()).getWarning());
        }
        return arrayList2;
    }

    public /* synthetic */ d(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? f101949c : list);
    }
}
