package u30;

import bo0.j;
import bo0.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import t30.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u0006*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003:\u0001\u0006J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu30/a;", "Lt30/f;", "ModelType", "", "Lorg/json/JSONObject;", "json", "a", "(Lorg/json/JSONObject;)Lt30/f;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a<ModelType extends f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f115359a;

    /* JADX INFO: renamed from: u30.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu30/a$a;", "", "<init>", "()V", "Lorg/json/JSONArray;", "jsonArray", "", "", "a", "(Lorg/json/JSONArray;)Ljava/util/List;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f115359a = new Companion();

        private Companion() {
        }

        public final List<String> a(JSONArray jsonArray) {
            if (jsonArray == null) {
                return v.m();
            }
            j jVarW = n.w(0, jsonArray.length());
            ArrayList arrayList = new ArrayList(v.y(jVarW, 10));
            Iterator<Integer> it = jVarW.iterator();
            while (it.hasNext()) {
                arrayList.add(jsonArray.getString(((s0) it).nextInt()));
            }
            return arrayList;
        }
    }

    ModelType a(JSONObject json);
}
