package oe;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\tJ!\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Loe/a;", "", "<init>", "()V", "Lorg/json/JSONArray;", "jsonArray", "", "", "b", "(Lorg/json/JSONArray;)Ljava/util/List;", "stringList", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)Lorg/json/JSONArray;", "", "a", "intList", "c", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f97212a = new a();

    private a() {
    }

    public static final List<Integer> a(JSONArray jsonArray) throws JSONException {
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!(jsonArray.opt(i11) instanceof Integer)) {
                throw new JSONException("type is not integer");
            }
            arrayList.add(Integer.valueOf(jsonArray.optInt(i11)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static final List<String> b(JSONArray jsonArray) {
        if (jsonArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            String strOptString = jsonArray.optString(i11, null);
            if (strOptString != null) {
                arrayList.add(strOptString);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static final JSONArray c(List<Integer> intList) {
        if (intList == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = intList.iterator();
        while (it.hasNext()) {
            jSONArray.put(((Number) it.next()).intValue());
        }
        return jSONArray;
    }

    public static final JSONArray d(List<String> stringList) {
        if (stringList == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList();
        for (Object obj : stringList) {
            String str = (String) obj;
            if (!(str == null || str.length() == 0)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }
}
