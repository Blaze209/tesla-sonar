package x60;

import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lx60/f;", "Lu30/a;", "Lcom/stripe/android/model/j;", "Lh30/a;", "bin", "<init>", "(Lh30/a;)V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/j;", "Lh30/a;", "Lx60/a;", "c", "Lx60/a;", "accountRangeJsonParser", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f implements u30.a<CardMetadata> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h30.a bin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a accountRangeJsonParser;

    public f(h30.a bin) {
        p013kotlin.jvm.internal.s.k(bin, "bin");
        this.bin = bin;
        this.accountRangeJsonParser = new a();
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CardMetadata a(JSONObject json) throws JSONException {
        p013kotlin.jvm.internal.s.k(json, "json");
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("data");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        bo0.j jVarW = bo0.n.w(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = jVarW.iterator();
        while (it.hasNext()) {
            int iNextInt = ((s0) it).nextInt();
            a aVar = this.accountRangeJsonParser;
            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(iNextInt);
            p013kotlin.jvm.internal.s.j(jSONObject, "getJSONObject(...)");
            AccountRange accountRangeA = aVar.a(jSONObject);
            if (accountRangeA != null) {
                arrayList.add(accountRangeA);
            }
        }
        return new CardMetadata(this.bin, arrayList);
    }
}
