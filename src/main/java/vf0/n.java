package vf0;

import java.util.Comparator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
final class n implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f119292a;

    n(String str) {
        this.f119292a = str;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        long jOptLong = ((JSONObject) obj).optLong(this.f119292a);
        long jOptLong2 = ((JSONObject) obj2).optLong(this.f119292a);
        if (jOptLong < jOptLong2) {
            return -1;
        }
        return jOptLong > jOptLong2 ? 1 : 0;
    }
}
